package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class o5 extends ReplacementSpan {
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

    public o5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static /* synthetic */ void a(o5 o5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o5Var.extraScale = floatValue;
        o5Var.scale = org.telegram.messenger.i0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(o5 o5Var) {
        return (o5Var.moveAnimator == null && o5Var.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            o5[] o5VarArr = (o5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), o5.class);
            if (o5VarArr != null) {
                for (o5 o5Var : o5VarArr) {
                    o5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static /* synthetic */ void b(o5 o5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o5Var.extraScale = floatValue;
        o5Var.scale = org.telegram.messenger.i0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            zz0[] zz0VarArr = (zz0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), zz0.class);
            for (int i12 = 0; zz0VarArr != null && i12 < zz0VarArr.length; i12++) {
                zz0 zz0Var = zz0VarArr[i12];
                if (zz0Var != null && zz0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static o5 cloneSpan(o5 o5Var, Paint.FontMetricsInt fontMetricsInt) {
        o5 o5Var2;
        TLRPC.Document document = o5Var.document;
        if (document != null) {
            o5Var2 = new o5(document, o5Var.scale, fontMetricsInt != null ? fontMetricsInt : o5Var.fontMetrics);
        } else {
            o5Var2 = new o5(o5Var.documentId, o5Var.scale, fontMetricsInt != null ? fontMetricsInt : o5Var.fontMetrics);
        }
        if (fontMetricsInt != null) {
            o5Var2.size = o5Var.size;
        }
        o5Var2.fromEmojiKeyboard = o5Var.fromEmojiKeyboard;
        o5Var2.isAdded = o5Var.isAdded;
        o5Var2.isRemoved = o5Var.isRemoved;
        return o5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, k5 k5Var, float f7, List<nh.i> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, k5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof o5) && !(characterStyle instanceof org.telegram.messenger.h6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<f5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            f5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static k5 update(int i10, View view, k5 k5Var, ArrayList<org.telegram.messenger.gj> arrayList) {
        return update(i10, view, k5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r11 != 0.0f) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        if (!this.recordPositions) {
            return;
        }
        this.spanDrawn = true;
        float f10 = (this.measuredSize / 2.0f) + f7;
        float f11 = ((i14 - i12) / 2.0f) + i12;
        float f12 = this.lastDrawnCy;
        if (f11 == f12 || f12 == 0.0f) {
            float f13 = this.lastDrawnCx;
            if (f10 != f13) {
            }
            if (lockPositionChanging) {
                if (f10 == this.lastDrawnCx && f11 == f12) {
                    return;
                }
                this.lastDrawnCx = f10;
                this.lastDrawnCy = f11;
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
            float f14 = this.lastDrawnCx;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.moveAnimator = ofFloat;
            ofFloat.addUpdateListener(new h5(this, f12, f11, f14, f10, 0));
            this.moveAnimator.addListener(new i5(this, 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(gr.f);
            this.moveAnimator.start();
            return;
        }
        if (lockPositionChanging) {
        }
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        return document != null ? document.id : this.documentId;
    }

    public float getExtraScale() {
        final int i10 = 1;
        final int i11 = 0;
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.g5
                public final /* synthetic */ o5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i11) {
                        case 0:
                            o5.b(this.b, valueAnimator2);
                            break;
                        default:
                            o5.a(this.b, valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new i5(this, i11));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(gr.f);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.g5
                public final /* synthetic */ o5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            o5.b(this.b, valueAnimator22);
                            break;
                        default:
                            o5.a(this.b, valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new i5(this, i10));
            this.scaleAnimator.setInterpolator(gr.f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z10 = this.preserveFontMetrics && fontMetricsInt2 != null;
        int i12 = z10 ? fontMetricsInt2.top : 0;
        int i13 = z10 ? fontMetricsInt2.ascent : 0;
        int i14 = z10 ? fontMetricsInt2.descent : 0;
        int i15 = z10 ? fontMetricsInt2.bottom : 0;
        int i16 = z10 ? fontMetricsInt2.leading : 0;
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        int i17 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.ascent;
        int i18 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.descent;
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        if (fontMetricsInt3 == null) {
            int i19 = (int) this.size;
            int L = org.telegram.messenger.i0.L(8.0f);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            if (fontMetricsInt2 != null) {
                float f7 = (-L2) - L;
                float f10 = this.scale;
                fontMetricsInt2.top = (int) (f7 * f10);
                float f11 = L2 - L;
                fontMetricsInt2.bottom = (int) (f11 * f10);
                fontMetricsInt2.ascent = (int) (f7 * f10);
                fontMetricsInt2.descent = (int) (f11 * f10);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i19 * this.scale);
        } else {
            this.measuredSize = (int) (this.size * this.scale);
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
            int i20 = fontMetricsInt2.ascent;
            int i21 = fontMetricsInt2.descent;
            int i22 = ((i18 - i21) + (i17 - i20)) / 2;
            fontMetricsInt2.ascent = i20 + i22;
            fontMetricsInt2.descent = i21 - i22;
        }
        if (z10) {
            fontMetricsInt2.top = i12;
            fontMetricsInt2.ascent = i13;
            fontMetricsInt2.descent = i14;
            fontMetricsInt2.bottom = i15;
            fontMetricsInt2.leading = i16;
            int i23 = this.minimumLineHeight;
            int i24 = i14 - i13;
            if (i23 > i24) {
                int i25 = i23 - i24;
                int i26 = (i25 + 1) / 2;
                int i27 = i13 - i26;
                fontMetricsInt2.ascent = i27;
                fontMetricsInt2.descent = i14 + (i25 - i26);
                fontMetricsInt2.top = Math.min(i12, i27);
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt2.descent);
            }
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = org.telegram.messenger.i0.L(20.0f);
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

    public o5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public o5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public o5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, k5 k5Var, float f7, List<nh.i> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || k5Var == null) {
            return;
        }
        ArrayList arrayList = k5Var.c;
        int i10 = 0;
        if (org.telegram.messenger.k6.m == 0.0f && f7 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, org.telegram.messenger.k6.m + org.telegram.messenger.i0.L(20.0f * f7));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            m5 m5Var = (m5) arrayList.get(i11);
            if (m5Var.a == layout) {
                ArrayList arrayList2 = m5Var.b;
                int i12 = i10;
                while (i12 < arrayList2.size()) {
                    j5 j5Var = (j5) arrayList2.get(i12);
                    if (j5Var != null) {
                        f5 f5Var = j5Var.f;
                        if (f5Var != null) {
                            f5Var.setColorFilter(colorFilter);
                        }
                        o5 o5Var = j5Var.d;
                        if (o5Var.spanDrawn) {
                            float f14 = o5Var.measuredSize / 2.0f;
                            float f15 = o5Var.lastDrawnCx;
                            float f16 = o5Var.lastDrawnCy;
                            j5Var.e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !j5Var.w) ? 1.0f : Math.max(0.0f, list.get(i10).n);
                            j5Var.r = f12;
                            j5Var.s = max;
                            j5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = j5Var.e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    j5Var.n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            j5Var.n = false;
                            f5 f5Var2 = j5Var.f;
                            if (f5Var2 == null) {
                                if (j5Var.h != null) {
                                    float extraScale = j5Var.d.getExtraScale();
                                    j5Var.h.setAlpha((int) (j5Var.s * 255.0f * f13));
                                    j5Var.h.setBounds(j5Var.e);
                                    if (extraScale != 1.0f || j5Var.d.invert) {
                                        canvas.save();
                                        canvas.scale((j5Var.d.invert ? -1 : 1) * extraScale, extraScale, j5Var.e.centerX(), j5Var.e.centerY());
                                        j5Var.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        j5Var.h.draw(canvas);
                                    }
                                }
                            } else if (f5Var2.k != null) {
                                f5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.t6.v3 : colorFilter);
                                j5Var.f.p(currentTimeMillis);
                                float extraScale2 = j5Var.d.getExtraScale();
                                if (extraScale2 != 1.0f || j5Var.d.invert) {
                                    canvas.save();
                                    canvas.scale((j5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, j5Var.e.centerX(), j5Var.e.centerY());
                                    f5 f5Var3 = j5Var.f;
                                    Rect rect2 = j5Var.e;
                                    float f17 = j5Var.s * f13;
                                    ag.c2 c2Var = f5Var3.k;
                                    if (c2Var != null) {
                                        c2Var.z0(rect2);
                                        f5Var3.k.setAlpha(f17);
                                        f5Var3.k.h(canvas, null);
                                    }
                                    canvas.restore();
                                } else {
                                    f5 f5Var4 = j5Var.f;
                                    Rect rect3 = j5Var.e;
                                    float f18 = j5Var.s * f13;
                                    ag.c2 c2Var2 = f5Var4.k;
                                    if (c2Var2 != null) {
                                        c2Var2.z0(rect3);
                                        f5Var4.k.setAlpha(f18);
                                        f5Var4.k.h(canvas, null);
                                    }
                                }
                                if (access$400(j5Var.d)) {
                                    j5Var.invalidate();
                                }
                            }
                            i12++;
                            i10 = 0;
                        }
                    }
                    i12++;
                    i10 = 0;
                }
            } else {
                i11++;
                i10 = 0;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public static k5 update(int i10, View view, k5 k5Var, ArrayList<org.telegram.messenger.gj> arrayList, boolean z10) {
        return update(i10, view, false, k5Var, arrayList, z10);
    }

    public o5(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static k5 update(int i10, View view, boolean z10, k5 k5Var, ArrayList<org.telegram.messenger.gj> arrayList) {
        return update(i10, view, z10, k5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        o5[] o5VarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((o5VarArr = (o5[]) spanned.getSpans(0, spanned.length(), o5.class)) == null || o5VarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                CharacterStyle characterStyle = characterStyleArr[i11];
                if (characterStyle != null && (characterStyle instanceof o5)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                    o5 o5Var = (o5) characterStyleArr[i11];
                    charSequence.removeSpan(o5Var);
                    o5 cloneSpan = cloneSpan(o5Var, fontMetricsInt);
                    if (i10 != -1) {
                        cloneSpan.cacheType = i10;
                    }
                    cloneSpan.scale = o5Var.scale * f7;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static k5 update(int i10, View view, boolean z10, k5 k5Var, ArrayList<org.telegram.messenger.gj> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).e;
            }
        }
        return update(i10, view, z10, k5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public o5(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, k5 k5Var) {
        if (k5Var == null) {
            return;
        }
        while (k5Var.a.size() > 0) {
            k5Var.b(0);
        }
    }

    public o5(long j10, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = org.telegram.messenger.i0.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
        this.scale = f7;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = org.telegram.messenger.i0.L(20.0f);
            }
        }
    }

    public static k5 update(int i10, View view, k5 k5Var, Layout... layoutArr) {
        return update(i10, view, false, k5Var, layoutArr);
    }

    public static k5 update(int i10, View view, boolean z10, k5 k5Var, Layout... layoutArr) {
        return update(i10, view, z10, k5Var, false, layoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k5 update(int i10, View view, boolean z10, k5 k5Var, boolean z11, Layout... layoutArr) {
        int i11;
        o5[] o5VarArr;
        j5 j5Var;
        int i12;
        int i13;
        k5 k5Var2 = k5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (k5Var2 == null) {
                return null;
            }
            ArrayList arrayList = k5Var2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                k5Var2.b(0);
            }
            return null;
        }
        int i15 = 0;
        while (i15 < layoutArr.length) {
            Layout layout = layoutArr[i15];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i11 = i15;
                o5VarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                o5VarArr = (o5[]) spanned.getSpans(i14, spanned.length(), o5.class);
                int i16 = i14;
                while (o5VarArr != null && i16 < o5VarArr.length) {
                    o5 o5Var = o5VarArr[i16];
                    if (o5Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(o5Var);
                            int spanEnd = spanned.getSpanEnd(o5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(o5Var);
                            o5Var = cloneSpan(o5Var, fontMetricsInt);
                            o5VarArr[i16] = o5Var;
                            spannable.setSpan(o5Var, spanStart, spanEnd, 33);
                        }
                        if (k5Var2 == null) {
                            k5Var2 = new k5();
                            k5Var2.a = new ArrayList();
                            k5Var2.b = new HashMap();
                            k5Var2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = k5Var2.a;
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                j5Var = fontMetricsInt;
                                break;
                            }
                            if (((j5) arrayList2.get(i17)).d == o5Var && ((j5) arrayList2.get(i17)).c == layout) {
                                j5Var = (j5) arrayList2.get(i17);
                                break;
                            }
                            i17++;
                        }
                        if (j5Var == 0) {
                            j5 j5Var2 = new j5(view, z10);
                            j5Var2.c = layout;
                            if (o5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = o5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (o5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                j5Var2.f = f5.m(org.telegram.messenger.d20.s0, o5Var.getDocumentId(), o5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = o5Var.document;
                                if (document != null) {
                                    j5Var2.f = f5.l(org.telegram.messenger.d20.s0, i13, document);
                                } else {
                                    long j10 = o5Var.documentId;
                                    if (j10 != 0) {
                                        j5Var2.f = f5.m(org.telegram.messenger.d20.s0, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = o5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(o5Var.emoji)) {
                                f5 f5Var = j5Var2.f;
                                if (f5Var != null) {
                                    f5Var.q(o5Var.emoji);
                                } else {
                                    j5Var2.h = org.telegram.messenger.k6.g(o5Var.emoji);
                                }
                            }
                            j5Var2.w = c(layout, spanned.getSpanStart(o5Var), spanned.getSpanEnd(o5Var));
                            j5Var2.e = new Rect();
                            j5Var2.d = o5Var;
                            arrayList2.add(j5Var2);
                            HashMap hashMap = k5Var2.b;
                            m5 m5Var = (m5) hashMap.get(layout);
                            if (m5Var == null) {
                                m5Var = new m5(j5Var2.a, layout);
                                hashMap.put(layout, m5Var);
                                k5Var2.c.add(m5Var);
                            }
                            m5Var.b.add(j5Var2);
                            m5Var.a();
                            f5 f5Var2 = j5Var2.f;
                            if (f5Var2 != null) {
                                f5Var2.b(j5Var2);
                            }
                        } else {
                            i12 = i15;
                            j5Var.w = c(layout, spanned.getSpanStart(o5Var), spanned.getSpanEnd(o5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    i14 = 0;
                }
                i11 = i15;
            }
            if (k5Var2 != null) {
                ArrayList arrayList3 = k5Var2.a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((j5) arrayList3.get(i19)).c == layout) {
                        o5 o5Var2 = ((j5) arrayList3.get(i19)).d;
                        for (int i20 = 0; o5VarArr != null && i20 < o5VarArr.length; i20++) {
                            if (o5VarArr[i20] == o5Var2) {
                                break;
                            }
                        }
                        k5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (k5Var2 != null) {
            ArrayList arrayList4 = k5Var2.a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((j5) arrayList4.get(i21)).c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        k5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return k5Var2;
    }

    public static LongSparseArray<f5> update(View view, o5[] o5VarArr, LongSparseArray<f5> longSparseArray) {
        return update(0, view, o5VarArr, longSparseArray);
    }

    public static LongSparseArray<f5> update(int i10, View view, o5[] o5VarArr, LongSparseArray<f5> longSparseArray) {
        int i11;
        f5 m10;
        int i12;
        if (o5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            f5 f5Var = longSparseArray.get(keyAt);
            if (f5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (o5 o5Var : o5VarArr) {
                    i12 = (o5Var == null || o5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                f5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (o5 o5Var2 : o5VarArr) {
            if (o5Var2 != null && longSparseArray.get(o5Var2.getDocumentId()) == null) {
                if (o5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = o5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = o5Var2.document;
                if (document != null) {
                    m10 = f5.l(org.telegram.messenger.d20.s0, i11, document);
                } else {
                    m10 = f5.m(org.telegram.messenger.d20.s0, o5Var2.documentId, null, i11);
                }
                m10.a(view);
                longSparseArray.put(o5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<f5> update(View view, ArrayList<o5> arrayList, LongSparseArray<f5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<f5> update(int i10, View view, ArrayList<o5> arrayList, LongSparseArray<f5> longSparseArray) {
        int i11;
        int i12;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            f5 f5Var = longSparseArray.get(keyAt);
            if (f5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (0; i12 < arrayList.size(); i12 + 1) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                f5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            o5 o5Var = arrayList.get(i14);
            if (o5Var != null && longSparseArray.get(o5Var.getDocumentId()) == null) {
                if (o5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = o5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                f5 m10 = f5.m(org.telegram.messenger.d20.s0, o5Var.documentId, null, i11);
                m10.a(view);
                longSparseArray.put(o5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}
