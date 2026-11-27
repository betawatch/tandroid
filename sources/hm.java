// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class hm extends ReplacementSpan {
    private static boolean lockPositionChanging;
    private boolean animateChanges;
    public int cacheType;
    public TLRPC.Document document;
    public String documentAbsolutePath;
    public long documentId;
    public String emoji;
    public float extraScale;
    private Paint.FontMetricsInt fontMetrics;
    public boolean fromEmojiKeyboard;
    public boolean full;
    public boolean invert;
    private boolean isAdded;
    private boolean isRemoved;
    float lastDrawnCx;
    float lastDrawnCy;
    protected int measuredSize;
    private int minimumLineHeight;
    private ValueAnimator moveAnimator;
    boolean positionChanged;
    private boolean preserveFontMetrics;
    private boolean recordPositions;
    private Runnable removedAction;
    private float scale;
    private ValueAnimator scaleAnimator;
    public float size;
    boolean spanDrawn;
    public boolean standard;
    public boolean top;

    public hm(long j, float f, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = hl.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j;
        this.scale = f;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = hl.L(20.0f);
            }
        }
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            hm[] hmVarArr = (hm[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), hm.class);
            if (hmVarArr != null) {
                for (hm hmVar : hmVarArr) {
                    hmVar.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static hm cloneSpan(hm hmVar, Paint.FontMetricsInt fontMetricsInt) {
        hm hmVar2;
        TLRPC.Document document = hmVar.document;
        if (document != null) {
            hmVar2 = new hm(document, hmVar.scale, fontMetricsInt != null ? fontMetricsInt : hmVar.fontMetrics);
        } else {
            hmVar2 = new hm(hmVar.documentId, hmVar.scale, fontMetricsInt != null ? fontMetricsInt : hmVar.fontMetrics);
        }
        if (fontMetricsInt != null) {
            hmVar2.size = hmVar.size;
        }
        hmVar2.fromEmojiKeyboard = hmVar.fromEmojiKeyboard;
        hmVar2.isAdded = hmVar.isAdded;
        hmVar2.isRemoved = hmVar.isRemoved;
        return hmVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt, float f) {
        hm[] hmVarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((hmVarArr = (hm[]) spanned.getSpans(0, spanned.length(), hm.class)) == null || hmVarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                CharacterStyle characterStyle = characterStyleArr[i2];
                if (characterStyle != null && (characterStyle instanceof hm)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i2]);
                    hm hmVar = (hm) characterStyleArr[i2];
                    charSequence.removeSpan(hmVar);
                    hm cloneSpan = cloneSpan(hmVar, fontMetricsInt);
                    if (i != -1) {
                        cloneSpan.cacheType = i;
                    }
                    cloneSpan.scale = hmVar.scale * f;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, dm dmVar, float f, List<npa> list, float f2, float f3, float f4, float f5, ColorFilter colorFilter) {
        boolean z;
        float f6;
        float f7;
        if (canvas == null || layout == null || dmVar == null) {
            return;
        }
        ArrayList arrayList = dmVar.c;
        boolean z2 = false;
        if (pv3.m == 0.0f && f == 0.0f) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, pv3.m + hl.L(20.0f * f));
            z = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            fm fmVar = (fm) arrayList.get(i);
            if (fmVar.a == layout) {
                ArrayList arrayList2 = fmVar.b;
                int i2 = z2 ? 1 : 0;
                ?? r8 = z2;
                while (i2 < arrayList2.size()) {
                    cm cmVar = (cm) arrayList2.get(i2);
                    if (cmVar != null) {
                        wl wlVar = cmVar.f;
                        if (wlVar != null) {
                            wlVar.setColorFilter(colorFilter);
                        }
                        hm hmVar = cmVar.d;
                        if (hmVar.spanDrawn) {
                            float f8 = hmVar.measuredSize / 2.0f;
                            float f9 = hmVar.lastDrawnCx;
                            float f10 = hmVar.lastDrawnCy;
                            cmVar.e.set((int) (f9 - f8), (int) (f10 - f8), (int) (f9 + f8), (int) (f10 + f8));
                            if (list == null || list.isEmpty() || !cmVar.w) {
                                f6 = 0.0f;
                                f7 = 1.0f;
                            } else {
                                f6 = 0.0f;
                                f7 = Math.max(0.0f, list.get(r8).n);
                            }
                            cmVar.r = f4;
                            cmVar.s = f7;
                            if (f2 != f6 || f3 != f6) {
                                Rect rect = cmVar.e;
                                if (rect.bottom < f2 || rect.top > f3) {
                                    cmVar.n = true;
                                }
                            }
                            cmVar.n = r8;
                            wl wlVar2 = cmVar.f;
                            if (wlVar2 == null) {
                                if (cmVar.h != null) {
                                    float extraScale = cmVar.d.getExtraScale();
                                    cmVar.h.setAlpha((int) (cmVar.s * 255.0f * f5));
                                    cmVar.h.setBounds(cmVar.e);
                                    if (extraScale != 1.0f || cmVar.d.invert) {
                                        canvas.save();
                                        canvas.scale((cmVar.d.invert ? -1 : 1) * extraScale, extraScale, cmVar.e.centerX(), cmVar.e.centerY());
                                        cmVar.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        cmVar.h.draw(canvas);
                                    }
                                }
                            } else if (wlVar2.k != null) {
                                wlVar2.setColorFilter(colorFilter == null ? aob.v3 : colorFilter);
                                cmVar.f.p(currentTimeMillis);
                                float extraScale2 = cmVar.d.getExtraScale();
                                if (extraScale2 != 1.0f || cmVar.d.invert) {
                                    canvas.save();
                                    canvas.scale((cmVar.d.invert ? -1 : 1) * extraScale2, extraScale2, cmVar.e.centerX(), cmVar.e.centerY());
                                    wl wlVar3 = cmVar.f;
                                    Rect rect2 = cmVar.e;
                                    float f11 = cmVar.s * f5;
                                    nl nlVar = wlVar3.k;
                                    if (nlVar != null) {
                                        nlVar.j0(rect2);
                                        wlVar3.k.setAlpha(f11);
                                        wlVar3.k.h(canvas, null);
                                    }
                                    canvas.restore();
                                } else {
                                    wl wlVar4 = cmVar.f;
                                    Rect rect3 = cmVar.e;
                                    float f12 = cmVar.s * f5;
                                    nl nlVar2 = wlVar4.k;
                                    if (nlVar2 != null) {
                                        nlVar2.j0(rect3);
                                        wlVar4.k.setAlpha(f12);
                                        wlVar4.k.h(canvas, null);
                                    }
                                }
                                if (cmVar.d.g()) {
                                    cmVar.invalidate();
                                }
                            }
                        }
                    }
                    i2++;
                    r8 = 0;
                }
            } else {
                i++;
                z2 = false;
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public static boolean h(Layout layout, int i, int i2) {
        if (layout.getText() instanceof Spanned) {
            smb[] smbVarArr = (smb[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), smb.class);
            for (int i3 = 0; smbVarArr != null && i3 < smbVarArr.length; i3++) {
                smb smbVar = smbVarArr[i3];
                if (smbVar != null && smbVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof hm) && !(characterStyle instanceof mv3)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<wl> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            wl valueAt = longSparseArray.valueAt(i);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dm update(int i, View view, boolean z, dm dmVar, boolean z2, Layout... layoutArr) {
        int i2;
        int i3;
        hm[] hmVarArr;
        int i4;
        cm cmVar;
        int i5;
        int i6;
        dm dmVar2 = dmVar;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i7 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (dmVar2 == null) {
                return null;
            }
            ArrayList arrayList = dmVar2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                dmVar2.b(0);
            }
            return null;
        }
        int i8 = 0;
        while (i8 < layoutArr.length) {
            Layout layout = layoutArr[i8];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i3 = i8;
                hmVarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                hmVarArr = (hm[]) spanned.getSpans(i7, spanned.length(), hm.class);
                int i9 = i7;
                while (hmVarArr != null && i9 < hmVarArr.length) {
                    hm hmVar = hmVarArr[i9];
                    if (hmVar == null) {
                        i5 = i8;
                    } else {
                        if (z2 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(hmVar);
                            int spanEnd = spanned.getSpanEnd(hmVar);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(hmVar);
                            hmVar = cloneSpan(hmVar, fontMetricsInt);
                            hmVarArr[i9] = hmVar;
                            spannable.setSpan(hmVar, spanStart, spanEnd, 33);
                        }
                        if (dmVar2 == null) {
                            dmVar2 = new dm();
                            dmVar2.a = new ArrayList();
                            dmVar2.b = new HashMap();
                            dmVar2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = dmVar2.a;
                        int i10 = i7;
                        while (true) {
                            if (i10 >= arrayList2.size()) {
                                cmVar = fontMetricsInt;
                                break;
                            }
                            if (((cm) arrayList2.get(i10)).d == hmVar && ((cm) arrayList2.get(i10)).c == layout) {
                                cmVar = (cm) arrayList2.get(i10);
                                break;
                            }
                            i10++;
                        }
                        if (cmVar == 0) {
                            cm cmVar2 = new cm(view, z);
                            cmVar2.c = layout;
                            if (hmVar.standard) {
                                i6 = 8;
                            } else {
                                i6 = hmVar.cacheType;
                                if (i6 < 0) {
                                    i6 = i;
                                }
                            }
                            if (hmVar.documentAbsolutePath != null) {
                                i5 = i8;
                                cmVar2.f = wl.m(yac.t0, hmVar.getDocumentId(), hmVar.documentAbsolutePath, i6);
                            } else {
                                i5 = i8;
                                TLRPC.Document document = hmVar.document;
                                if (document != null) {
                                    cmVar2.f = wl.l(yac.t0, i6, document);
                                } else {
                                    long j = hmVar.documentId;
                                    if (j != 0) {
                                        cmVar2.f = wl.m(yac.t0, j, null, i6);
                                    }
                                }
                            }
                            int i11 = hmVar.cacheType;
                            if ((i11 == 20 || i11 == 21) && !TextUtils.isEmpty(hmVar.emoji)) {
                                wl wlVar = cmVar2.f;
                                String str = hmVar.emoji;
                                if (wlVar != null) {
                                    wlVar.q(str);
                                } else {
                                    cmVar2.h = pv3.g(str);
                                }
                            }
                            cmVar2.w = h(layout, spanned.getSpanStart(hmVar), spanned.getSpanEnd(hmVar));
                            cmVar2.e = new Rect();
                            cmVar2.d = hmVar;
                            arrayList2.add(cmVar2);
                            HashMap hashMap = dmVar2.b;
                            fm fmVar = (fm) hashMap.get(layout);
                            if (fmVar == null) {
                                fmVar = new fm(cmVar2.a, layout);
                                hashMap.put(layout, fmVar);
                                dmVar2.c.add(fmVar);
                            }
                            fmVar.b.add(cmVar2);
                            fmVar.a();
                            wl wlVar2 = cmVar2.f;
                            if (wlVar2 != null) {
                                wlVar2.a(cmVar2);
                            }
                        } else {
                            i5 = i8;
                            cmVar.w = h(layout, spanned.getSpanStart(hmVar), spanned.getSpanEnd(hmVar));
                        }
                    }
                    i9++;
                    i8 = i5;
                    fontMetricsInt = null;
                    i7 = 0;
                }
                i3 = i8;
            }
            if (dmVar2 != null) {
                ArrayList arrayList3 = dmVar2.a;
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    if (((cm) arrayList3.get(i12)).c == layout) {
                        hm hmVar2 = ((cm) arrayList3.get(i12)).d;
                        while (hmVarArr != null && i4 < hmVarArr.length) {
                            i4 = hmVarArr[i4] != hmVar2 ? i4 + 1 : 0;
                        }
                        dmVar2.b(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            i8 = i3 + 1;
            fontMetricsInt = null;
            i7 = 0;
        }
        if (dmVar2 != null) {
            ArrayList arrayList4 = dmVar2.a;
            int i13 = 0;
            while (i13 < arrayList4.size()) {
                Layout layout2 = ((cm) arrayList4.get(i13)).c;
                while (true) {
                    if (i2 >= layoutArr.length) {
                        dmVar2.b(i13);
                        i13--;
                        break;
                    }
                    i2 = layoutArr[i2] != layout2 ? i2 + 1 : 0;
                }
                i13++;
            }
        }
        return dmVar2;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r11 != 0.0f) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (!this.recordPositions) {
            return;
        }
        this.spanDrawn = true;
        float f2 = (this.measuredSize / 2.0f) + f;
        float f3 = ((i5 - i3) / 2.0f) + i3;
        float f4 = this.lastDrawnCy;
        if (f3 == f4 || f4 == 0.0f) {
            float f5 = this.lastDrawnCx;
            if (f2 != f5) {
            }
            if (lockPositionChanging) {
                if (f2 == this.lastDrawnCx && f3 == f4) {
                    return;
                }
                this.lastDrawnCx = f2;
                this.lastDrawnCy = f3;
                this.positionChanged = true;
                return;
            }
            return;
        }
        if (this.moveAnimator != null) {
            return;
        }
        if (this.animateChanges) {
            this.animateChanges = false;
            float f6 = this.lastDrawnCx;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.moveAnimator = ofFloat;
            ofFloat.addUpdateListener(new am(this, f4, f3, f6, f2, (byte) 0));
            this.moveAnimator.addListener(new bm(this, (byte) 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(k43.f);
            this.moveAnimator.start();
            return;
        }
        if (lockPositionChanging) {
        }
    }

    public final boolean g() {
        return (this.moveAnimator == null && this.scaleAnimator == null) ? false : true;
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        return document != null ? document.id : this.documentId;
    }

    public float getExtraScale() {
        final byte b = 1;
        final byte b2 = 0;
        if (this.isAdded) {
            lockPositionChanging = true;
            this.isAdded = false;
            this.extraScale = 0.0f;
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.extraScale, 1.0f);
            this.scaleAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zl
                public final /* synthetic */ hm b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b3 = b2;
                    hm hmVar = this.b;
                    switch (b3) {
                        case 0:
                            hmVar.i(valueAnimator2);
                            break;
                        default:
                            hmVar.j(valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new bm(this, b2));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(k43.f);
            this.scaleAnimator.start();
        } else if (this.isRemoved) {
            this.isRemoved = false;
            this.extraScale = 1.0f;
            ValueAnimator valueAnimator2 = this.scaleAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.extraScale, 0.0f);
            this.scaleAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zl
                public final /* synthetic */ hm b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b3 = b;
                    hm hmVar = this.b;
                    switch (b3) {
                        case 0:
                            hmVar.i(valueAnimator22);
                            break;
                        default:
                            hmVar.j(valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new bm(this, b));
            this.scaleAnimator.setInterpolator(k43.f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z = this.preserveFontMetrics && fontMetricsInt2 != null;
        if (z) {
            i3 = fontMetricsInt2.top;
            i4 = fontMetricsInt2.ascent;
            i5 = fontMetricsInt2.descent;
            i6 = fontMetricsInt2.bottom;
            i7 = fontMetricsInt2.leading;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        if (fontMetricsInt2 == null) {
            i8 = 0;
            i9 = 0;
        } else {
            i8 = fontMetricsInt2.ascent;
            i9 = fontMetricsInt2.descent;
        }
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        float f = this.size;
        if (fontMetricsInt3 == null) {
            int i10 = (int) f;
            int L = hl.L(8.0f);
            int L2 = hl.L(10.0f);
            if (fontMetricsInt2 != null) {
                float f2 = (-L2) - L;
                float f3 = this.scale;
                fontMetricsInt2.top = (int) (f2 * f3);
                float f4 = L2 - L;
                fontMetricsInt2.bottom = (int) (f4 * f3);
                fontMetricsInt2.ascent = (int) (f2 * f3);
                fontMetricsInt2.descent = (int) (f4 * f3);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i10 * this.scale);
        } else {
            this.measuredSize = (int) (f * this.scale);
            if (fontMetricsInt2 != null) {
                if (this.full) {
                    float abs = Math.abs(this.fontMetrics.top) + Math.abs(fontMetricsInt3.bottom);
                    fontMetricsInt2.ascent = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.descent = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                    fontMetricsInt2.top = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.bottom = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                } else {
                    fontMetricsInt2.ascent = fontMetricsInt3.ascent;
                    fontMetricsInt2.descent = fontMetricsInt3.descent;
                    fontMetricsInt2.top = fontMetricsInt3.top;
                    fontMetricsInt2.bottom = fontMetricsInt3.bottom;
                }
            }
        }
        if (fontMetricsInt2 != null && this.top) {
            int i11 = fontMetricsInt2.ascent;
            int i12 = fontMetricsInt2.descent;
            int i13 = ((i9 - i12) + (i8 - i11)) / 2;
            fontMetricsInt2.ascent = i11 + i13;
            fontMetricsInt2.descent = i12 - i13;
        }
        if (z) {
            fontMetricsInt2.top = i3;
            fontMetricsInt2.ascent = i4;
            fontMetricsInt2.descent = i5;
            fontMetricsInt2.bottom = i6;
            fontMetricsInt2.leading = i7;
            int i14 = this.minimumLineHeight;
            int i15 = i5 - i4;
            if (i14 > i15) {
                int i16 = i14 - i15;
                int i17 = (i16 + 1) / 2;
                int i18 = i4 - i17;
                fontMetricsInt2.ascent = i18;
                fontMetricsInt2.descent = i5 + (i16 - i17);
                fontMetricsInt2.top = Math.min(i3, i18);
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt2.descent);
            }
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public final /* synthetic */ void i(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = hl.R1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public final /* synthetic */ void j(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = hl.R1(0.0f, 1.0f, floatValue);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = hl.L(20.0f);
            }
        }
    }

    public void setAdded() {
        this.isAdded = true;
        this.extraScale = 0.0f;
    }

    public void setAnimateChanges() {
        this.animateChanges = true;
    }

    public hm setMinimumLineHeight(int i) {
        this.minimumLineHeight = i;
        return this;
    }

    public hm setPreserveFontMetrics(boolean z) {
        this.preserveFontMetrics = z;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public hm setSize(int i) {
        this.size = i;
        return this;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static void release(View view, dm dmVar) {
        if (dmVar != null) {
            while (dmVar.a.size() > 0) {
                dmVar.b(0);
            }
        }
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        this.fontMetrics = fontMetricsInt;
        this.size = i;
        this.cacheType = i2;
    }

    public hm(TLRPC.Document document, float f, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f, fontMetricsInt);
        this.document = document;
    }

    public hm(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
    }

    public hm(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i) {
        return cloneSpans(charSequence, i, null);
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i, fontMetricsInt, 1.0f);
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, dm dmVar, float f, List<npa> list, float f2, float f3, float f4, float f5) {
        drawAnimatedEmojis(canvas, layout, dmVar, f, list, f2, f3, f4, f5, null);
    }

    public static dm update(int i, View view, dm dmVar, ArrayList<o47> arrayList, boolean z) {
        return update(i, view, false, dmVar, arrayList, z);
    }

    public static dm update(int i, View view, boolean z, dm dmVar, ArrayList<o47> arrayList) {
        return update(i, view, z, dmVar, arrayList, false);
    }

    public static dm update(int i, View view, boolean z, dm dmVar, ArrayList<o47> arrayList, boolean z2) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                layoutArr[i2] = arrayList.get(i2).e;
            }
        }
        return update(i, view, z, dmVar, z2, layoutArr);
    }

    public static dm update(int i, View view, dm dmVar, Layout... layoutArr) {
        return update(i, view, false, dmVar, layoutArr);
    }

    public static dm update(int i, View view, boolean z, dm dmVar, Layout... layoutArr) {
        return update(i, view, z, dmVar, false, layoutArr);
    }

    public static dm update(int i, View view, dm dmVar, ArrayList<o47> arrayList) {
        return update(i, view, dmVar, arrayList, false);
    }

    public static LongSparseArray<wl> update(View view, hm[] hmVarArr, LongSparseArray<wl> longSparseArray) {
        return update(0, view, hmVarArr, longSparseArray);
    }

    public static LongSparseArray<wl> update(int i, View view, hm[] hmVarArr, LongSparseArray<wl> longSparseArray) {
        int i2;
        wl m;
        int i3;
        if (hmVarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            wl wlVar = longSparseArray.get(keyAt);
            if (wlVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (hm hmVar : hmVarArr) {
                    i3 = (hmVar == null || hmVar.getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                wlVar.o(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (hm hmVar2 : hmVarArr) {
            if (hmVar2 != null && longSparseArray.get(hmVar2.getDocumentId()) == null) {
                if (hmVar2.standard) {
                    i2 = 8;
                } else {
                    i2 = hmVar2.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                TLRPC.Document document = hmVar2.document;
                int i5 = yac.t0;
                if (document != null) {
                    m = wl.l(i5, i2, document);
                } else {
                    m = wl.m(i5, hmVar2.documentId, null, i2);
                }
                m.b(view);
                longSparseArray.put(hmVar2.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<wl> update(View view, ArrayList<hm> arrayList, LongSparseArray<wl> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<wl> update(int i, View view, ArrayList<hm> arrayList, LongSparseArray<wl> longSparseArray) {
        int i2;
        int i3;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            wl wlVar = longSparseArray.get(keyAt);
            if (wlVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (0; i3 < arrayList.size(); i3 + 1) {
                    i3 = (arrayList.get(i3) == null || arrayList.get(i3).getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                wlVar.b(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            hm hmVar = arrayList.get(i5);
            if (hmVar != null && longSparseArray.get(hmVar.getDocumentId()) == null) {
                if (hmVar.standard) {
                    i2 = 8;
                } else {
                    i2 = hmVar.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                wl m = wl.m(yac.t0, hmVar.documentId, null, i2);
                m.b(view);
                longSparseArray.put(hmVar.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }
}
