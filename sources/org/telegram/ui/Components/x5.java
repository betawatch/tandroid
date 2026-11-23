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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class x5 extends ReplacementSpan {
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

    public x5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static /* synthetic */ void a(x5 x5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x5Var.extraScale = floatValue;
        x5Var.scale = org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(x5 x5Var) {
        return (x5Var.moveAnimator == null && x5Var.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            x5[] x5VarArr = (x5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), x5.class);
            if (x5VarArr != null) {
                for (x5 x5Var : x5VarArr) {
                    x5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static /* synthetic */ void b(x5 x5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x5Var.extraScale = floatValue;
        x5Var.scale = org.telegram.messenger.g0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i7, int i10) {
        if (layout.getText() instanceof Spanned) {
            fz0[] fz0VarArr = (fz0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i7), Math.min(layout.getText().length() - 1, i10), fz0.class);
            for (int i11 = 0; fz0VarArr != null && i11 < fz0VarArr.length; i11++) {
                fz0 fz0Var = fz0VarArr[i11];
                if (fz0Var != null && fz0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static x5 cloneSpan(x5 x5Var, Paint.FontMetricsInt fontMetricsInt) {
        x5 x5Var2;
        TLRPC.Document document = x5Var.document;
        if (document != null) {
            x5Var2 = new x5(document, x5Var.scale, fontMetricsInt != null ? fontMetricsInt : x5Var.fontMetrics);
        } else {
            x5Var2 = new x5(x5Var.documentId, x5Var.scale, fontMetricsInt != null ? fontMetricsInt : x5Var.fontMetrics);
        }
        if (fontMetricsInt != null) {
            x5Var2.size = x5Var.size;
        }
        x5Var2.fromEmojiKeyboard = x5Var.fromEmojiKeyboard;
        x5Var2.isAdded = x5Var.isAdded;
        x5Var2.isRemoved = x5Var.isRemoved;
        return x5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, t5 t5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, t5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof x5) && !(characterStyle instanceof org.telegram.messenger.g6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<o5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            o5 valueAt = longSparseArray.valueAt(i7);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static t5 update(int i7, View view, t5 t5Var, ArrayList<org.telegram.messenger.cj> arrayList) {
        return update(i7, view, t5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i7;
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
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        if (!this.recordPositions) {
            return;
        }
        this.spanDrawn = true;
        float f11 = (this.measuredSize / 2.0f) + f10;
        float f12 = ((i13 - i11) / 2.0f) + i11;
        float f13 = this.lastDrawnCy;
        if (f12 == f13 || f13 == 0.0f) {
            float f14 = this.lastDrawnCx;
            if (f11 != f14) {
            }
            if (lockPositionChanging) {
                if (f11 == this.lastDrawnCx && f12 == f13) {
                    return;
                }
                this.lastDrawnCx = f11;
                this.lastDrawnCy = f12;
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
            float f15 = this.lastDrawnCx;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.moveAnimator = ofFloat;
            ofFloat.addUpdateListener(new q5(this, f13, f12, f15, f11, 0));
            this.moveAnimator.addListener(new r5(this, 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(kr.f);
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
        final int i7 = 1;
        final int i10 = 0;
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.p5
                public final /* synthetic */ x5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            x5.b(this.b, valueAnimator2);
                            break;
                        default:
                            x5.a(this.b, valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new r5(this, i10));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(kr.f);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.p5
                public final /* synthetic */ x5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i7) {
                        case 0:
                            x5.b(this.b, valueAnimator22);
                            break;
                        default:
                            x5.a(this.b, valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new r5(this, i7));
            this.scaleAnimator.setInterpolator(kr.f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z10 = this.preserveFontMetrics && fontMetricsInt2 != null;
        int i11 = z10 ? fontMetricsInt2.top : 0;
        int i12 = z10 ? fontMetricsInt2.ascent : 0;
        int i13 = z10 ? fontMetricsInt2.descent : 0;
        int i14 = z10 ? fontMetricsInt2.bottom : 0;
        int i15 = z10 ? fontMetricsInt2.leading : 0;
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        int i16 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.ascent;
        int i17 = fontMetricsInt2 == null ? 0 : fontMetricsInt2.descent;
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        if (fontMetricsInt3 == null) {
            int i18 = (int) this.size;
            int L = org.telegram.messenger.g0.L(8.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            if (fontMetricsInt2 != null) {
                float f10 = (-L2) - L;
                float f11 = this.scale;
                fontMetricsInt2.top = (int) (f10 * f11);
                float f12 = L2 - L;
                fontMetricsInt2.bottom = (int) (f12 * f11);
                fontMetricsInt2.ascent = (int) (f10 * f11);
                fontMetricsInt2.descent = (int) (f12 * f11);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i18 * this.scale);
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
            int i19 = fontMetricsInt2.ascent;
            int i20 = fontMetricsInt2.descent;
            int i21 = ((i17 - i20) + (i16 - i19)) / 2;
            fontMetricsInt2.ascent = i19 + i21;
            fontMetricsInt2.descent = i20 - i21;
        }
        if (z10) {
            fontMetricsInt2.top = i11;
            fontMetricsInt2.ascent = i12;
            fontMetricsInt2.descent = i13;
            fontMetricsInt2.bottom = i14;
            fontMetricsInt2.leading = i15;
            int i22 = this.minimumLineHeight;
            int i23 = i13 - i12;
            if (i22 > i23) {
                int i24 = i22 - i23;
                int i25 = (i24 + 1) / 2;
                int i26 = i12 - i25;
                fontMetricsInt2.ascent = i26;
                fontMetricsInt2.descent = i13 + (i24 - i25);
                fontMetricsInt2.top = Math.min(i11, i26);
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
                this.size = org.telegram.messenger.g0.L(20.0f);
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

    public x5 setMinimumLineHeight(int i7) {
        this.minimumLineHeight = i7;
        return this;
    }

    public x5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public x5 setSize(int i7) {
        this.size = i7;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7) {
        return cloneSpans(charSequence, i7, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, t5 t5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || t5Var == null) {
            return;
        }
        ArrayList arrayList = t5Var.c;
        int i7 = 0;
        if (org.telegram.messenger.j6.m == 0.0f && f10 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, org.telegram.messenger.j6.m + org.telegram.messenger.g0.L(20.0f * f10));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            v5 v5Var = (v5) arrayList.get(i10);
            if (v5Var.a == layout) {
                ArrayList arrayList2 = v5Var.b;
                int i11 = i7;
                while (i11 < arrayList2.size()) {
                    s5 s5Var = (s5) arrayList2.get(i11);
                    if (s5Var != null) {
                        o5 o5Var = s5Var.f;
                        if (o5Var != null) {
                            o5Var.setColorFilter(colorFilter);
                        }
                        x5 x5Var = s5Var.d;
                        if (x5Var.spanDrawn) {
                            float f15 = x5Var.measuredSize / 2.0f;
                            float f16 = x5Var.lastDrawnCx;
                            float f17 = x5Var.lastDrawnCy;
                            s5Var.e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !s5Var.w) ? 1.0f : Math.max(0.0f, list.get(i7).n);
                            s5Var.r = f13;
                            s5Var.s = max;
                            s5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = s5Var.e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    s5Var.n = true;
                                    i11++;
                                    i7 = 0;
                                }
                            }
                            s5Var.n = false;
                            o5 o5Var2 = s5Var.f;
                            if (o5Var2 == null) {
                                if (s5Var.h != null) {
                                    float extraScale = s5Var.d.getExtraScale();
                                    s5Var.h.setAlpha((int) (s5Var.s * 255.0f * f14));
                                    s5Var.h.setBounds(s5Var.e);
                                    if (extraScale != 1.0f || s5Var.d.invert) {
                                        canvas.save();
                                        canvas.scale((s5Var.d.invert ? -1 : 1) * extraScale, extraScale, s5Var.e.centerX(), s5Var.e.centerY());
                                        s5Var.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        s5Var.h.draw(canvas);
                                    }
                                }
                            } else if (o5Var2.k != null) {
                                o5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.n6.v3 : colorFilter);
                                s5Var.f.p(currentTimeMillis);
                                float extraScale2 = s5Var.d.getExtraScale();
                                if (extraScale2 != 1.0f || s5Var.d.invert) {
                                    canvas.save();
                                    canvas.scale((s5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, s5Var.e.centerX(), s5Var.e.centerY());
                                    o5 o5Var3 = s5Var.f;
                                    Rect rect2 = s5Var.e;
                                    float f18 = s5Var.s * f14;
                                    fi.s2 s2Var = o5Var3.k;
                                    if (s2Var != null) {
                                        s2Var.A0(rect2);
                                        o5Var3.k.setAlpha(f18);
                                        o5Var3.k.h(canvas, null);
                                    }
                                    canvas.restore();
                                } else {
                                    o5 o5Var4 = s5Var.f;
                                    Rect rect3 = s5Var.e;
                                    float f19 = s5Var.s * f14;
                                    fi.s2 s2Var2 = o5Var4.k;
                                    if (s2Var2 != null) {
                                        s2Var2.A0(rect3);
                                        o5Var4.k.setAlpha(f19);
                                        o5Var4.k.h(canvas, null);
                                    }
                                }
                                if (access$400(s5Var.d)) {
                                    s5Var.invalidate();
                                }
                            }
                            i11++;
                            i7 = 0;
                        }
                    }
                    i11++;
                    i7 = 0;
                }
            } else {
                i10++;
                i7 = 0;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public static t5 update(int i7, View view, t5 t5Var, ArrayList<org.telegram.messenger.cj> arrayList, boolean z10) {
        return update(i7, view, false, t5Var, arrayList, z10);
    }

    public x5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i7, fontMetricsInt, 1.0f);
    }

    public static t5 update(int i7, View view, boolean z10, t5 t5Var, ArrayList<org.telegram.messenger.cj> arrayList) {
        return update(i7, view, z10, t5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt, float f10) {
        x5[] x5VarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((x5VarArr = (x5[]) spanned.getSpans(0, spanned.length(), x5.class)) == null || x5VarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                CharacterStyle characterStyle = characterStyleArr[i10];
                if (characterStyle != null && (characterStyle instanceof x5)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                    x5 x5Var = (x5) characterStyleArr[i10];
                    charSequence.removeSpan(x5Var);
                    x5 cloneSpan = cloneSpan(x5Var, fontMetricsInt);
                    if (i7 != -1) {
                        cloneSpan.cacheType = i7;
                    }
                    cloneSpan.scale = x5Var.scale * f10;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static t5 update(int i7, View view, boolean z10, t5 t5Var, ArrayList<org.telegram.messenger.cj> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).e;
            }
        }
        return update(i7, view, z10, t5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i7;
        this.cacheType = i10;
    }

    public x5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, t5 t5Var) {
        if (t5Var == null) {
            return;
        }
        while (t5Var.a.size() > 0) {
            t5Var.b(0);
        }
    }

    public x5(long j3, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = org.telegram.messenger.g0.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j3;
        this.scale = f10;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = org.telegram.messenger.g0.L(20.0f);
            }
        }
    }

    public static t5 update(int i7, View view, t5 t5Var, Layout... layoutArr) {
        return update(i7, view, false, t5Var, layoutArr);
    }

    public static t5 update(int i7, View view, boolean z10, t5 t5Var, Layout... layoutArr) {
        return update(i7, view, z10, t5Var, false, layoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t5 update(int i7, View view, boolean z10, t5 t5Var, boolean z11, Layout... layoutArr) {
        int i10;
        x5[] x5VarArr;
        s5 s5Var;
        int i11;
        int i12;
        t5 t5Var2 = t5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (t5Var2 == null) {
                return null;
            }
            ArrayList arrayList = t5Var2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                t5Var2.b(0);
            }
            return null;
        }
        int i14 = 0;
        while (i14 < layoutArr.length) {
            Layout layout = layoutArr[i14];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i10 = i14;
                x5VarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                x5VarArr = (x5[]) spanned.getSpans(i13, spanned.length(), x5.class);
                int i15 = i13;
                while (x5VarArr != null && i15 < x5VarArr.length) {
                    x5 x5Var = x5VarArr[i15];
                    if (x5Var == null) {
                        i11 = i14;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(x5Var);
                            int spanEnd = spanned.getSpanEnd(x5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(x5Var);
                            x5Var = cloneSpan(x5Var, fontMetricsInt);
                            x5VarArr[i15] = x5Var;
                            spannable.setSpan(x5Var, spanStart, spanEnd, 33);
                        }
                        if (t5Var2 == null) {
                            t5Var2 = new t5();
                            t5Var2.a = new ArrayList();
                            t5Var2.b = new HashMap();
                            t5Var2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = t5Var2.a;
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                s5Var = fontMetricsInt;
                                break;
                            }
                            if (((s5) arrayList2.get(i16)).d == x5Var && ((s5) arrayList2.get(i16)).c == layout) {
                                s5Var = (s5) arrayList2.get(i16);
                                break;
                            }
                            i16++;
                        }
                        if (s5Var == 0) {
                            s5 s5Var2 = new s5(view, z10);
                            s5Var2.c = layout;
                            if (x5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = x5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i7;
                                }
                            }
                            if (x5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                s5Var2.f = o5.m(org.telegram.messenger.i10.t0, x5Var.getDocumentId(), x5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = x5Var.document;
                                if (document != null) {
                                    s5Var2.f = o5.l(org.telegram.messenger.i10.t0, i12, document);
                                } else {
                                    long j3 = x5Var.documentId;
                                    if (j3 != 0) {
                                        s5Var2.f = o5.m(org.telegram.messenger.i10.t0, j3, null, i12);
                                    }
                                }
                            }
                            int i17 = x5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(x5Var.emoji)) {
                                o5 o5Var = s5Var2.f;
                                if (o5Var != null) {
                                    o5Var.q(x5Var.emoji);
                                } else {
                                    s5Var2.h = org.telegram.messenger.j6.g(x5Var.emoji);
                                }
                            }
                            s5Var2.w = c(layout, spanned.getSpanStart(x5Var), spanned.getSpanEnd(x5Var));
                            s5Var2.e = new Rect();
                            s5Var2.d = x5Var;
                            arrayList2.add(s5Var2);
                            HashMap hashMap = t5Var2.b;
                            v5 v5Var = (v5) hashMap.get(layout);
                            if (v5Var == null) {
                                v5Var = new v5(s5Var2.a, layout);
                                hashMap.put(layout, v5Var);
                                t5Var2.c.add(v5Var);
                            }
                            v5Var.b.add(s5Var2);
                            v5Var.a();
                            o5 o5Var2 = s5Var2.f;
                            if (o5Var2 != null) {
                                o5Var2.b(s5Var2);
                            }
                        } else {
                            i11 = i14;
                            s5Var.w = c(layout, spanned.getSpanStart(x5Var), spanned.getSpanEnd(x5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    i13 = 0;
                }
                i10 = i14;
            }
            if (t5Var2 != null) {
                ArrayList arrayList3 = t5Var2.a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((s5) arrayList3.get(i18)).c == layout) {
                        x5 x5Var2 = ((s5) arrayList3.get(i18)).d;
                        for (int i19 = 0; x5VarArr != null && i19 < x5VarArr.length; i19++) {
                            if (x5VarArr[i19] == x5Var2) {
                                break;
                            }
                        }
                        t5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (t5Var2 != null) {
            ArrayList arrayList4 = t5Var2.a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((s5) arrayList4.get(i20)).c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        t5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return t5Var2;
    }

    public static LongSparseArray<o5> update(View view, x5[] x5VarArr, LongSparseArray<o5> longSparseArray) {
        return update(0, view, x5VarArr, longSparseArray);
    }

    public static LongSparseArray<o5> update(int i7, View view, x5[] x5VarArr, LongSparseArray<o5> longSparseArray) {
        int i10;
        o5 m10;
        int i11;
        if (x5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            o5 o5Var = longSparseArray.get(keyAt);
            if (o5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (x5 x5Var : x5VarArr) {
                    i11 = (x5Var == null || x5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                o5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (x5 x5Var2 : x5VarArr) {
            if (x5Var2 != null && longSparseArray.get(x5Var2.getDocumentId()) == null) {
                if (x5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = x5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                TLRPC.Document document = x5Var2.document;
                if (document != null) {
                    m10 = o5.l(org.telegram.messenger.i10.t0, i10, document);
                } else {
                    m10 = o5.m(org.telegram.messenger.i10.t0, x5Var2.documentId, null, i10);
                }
                m10.a(view);
                longSparseArray.put(x5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<o5> update(View view, ArrayList<x5> arrayList, LongSparseArray<o5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<o5> update(int i7, View view, ArrayList<x5> arrayList, LongSparseArray<o5> longSparseArray) {
        int i10;
        int i11;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            o5 o5Var = longSparseArray.get(keyAt);
            if (o5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (0; i11 < arrayList.size(); i11 + 1) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                o5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            x5 x5Var = arrayList.get(i13);
            if (x5Var != null && longSparseArray.get(x5Var.getDocumentId()) == null) {
                if (x5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = x5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                o5 m10 = o5.m(org.telegram.messenger.i10.t0, x5Var.documentId, null, i10);
                m10.a(view);
                longSparseArray.put(x5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}
