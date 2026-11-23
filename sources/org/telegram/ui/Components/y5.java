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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class y5 extends ReplacementSpan {
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

    public y5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static /* synthetic */ void a(y5 y5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y5Var.extraScale = floatValue;
        y5Var.scale = org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(y5 y5Var) {
        return (y5Var.moveAnimator == null && y5Var.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            y5[] y5VarArr = (y5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), y5.class);
            if (y5VarArr != null) {
                for (y5 y5Var : y5VarArr) {
                    y5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static /* synthetic */ void b(y5 y5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y5Var.extraScale = floatValue;
        y5Var.scale = org.telegram.messenger.g0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i7, int i10) {
        if (layout.getText() instanceof Spanned) {
            gz0[] gz0VarArr = (gz0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i7), Math.min(layout.getText().length() - 1, i10), gz0.class);
            for (int i11 = 0; gz0VarArr != null && i11 < gz0VarArr.length; i11++) {
                gz0 gz0Var = gz0VarArr[i11];
                if (gz0Var != null && gz0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static y5 cloneSpan(y5 y5Var, Paint.FontMetricsInt fontMetricsInt) {
        y5 y5Var2;
        TLRPC.Document document = y5Var.document;
        if (document != null) {
            y5Var2 = new y5(document, y5Var.scale, fontMetricsInt != null ? fontMetricsInt : y5Var.fontMetrics);
        } else {
            y5Var2 = new y5(y5Var.documentId, y5Var.scale, fontMetricsInt != null ? fontMetricsInt : y5Var.fontMetrics);
        }
        if (fontMetricsInt != null) {
            y5Var2.size = y5Var.size;
        }
        y5Var2.fromEmojiKeyboard = y5Var.fromEmojiKeyboard;
        y5Var2.isAdded = y5Var.isAdded;
        y5Var2.isRemoved = y5Var.isRemoved;
        return y5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, u5 u5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, u5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof y5) && !(characterStyle instanceof org.telegram.messenger.g6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<p5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            p5 valueAt = longSparseArray.valueAt(i7);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static u5 update(int i7, View view, u5 u5Var, ArrayList<org.telegram.messenger.dj> arrayList) {
        return update(i7, view, u5Var, arrayList, false);
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
            ofFloat.addUpdateListener(new r5(this, f13, f12, f15, f11, 0));
            this.moveAnimator.addListener(new s5(this, 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(nr.f);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.q5
                public final /* synthetic */ y5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            y5.b(this.b, valueAnimator2);
                            break;
                        default:
                            y5.a(this.b, valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new s5(this, i10));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(nr.f);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.q5
                public final /* synthetic */ y5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i7) {
                        case 0:
                            y5.b(this.b, valueAnimator22);
                            break;
                        default:
                            y5.a(this.b, valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new s5(this, i7));
            this.scaleAnimator.setInterpolator(nr.f);
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

    public y5 setMinimumLineHeight(int i7) {
        this.minimumLineHeight = i7;
        return this;
    }

    public y5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public y5 setSize(int i7) {
        this.size = i7;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7) {
        return cloneSpans(charSequence, i7, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, u5 u5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || u5Var == null) {
            return;
        }
        ArrayList arrayList = u5Var.c;
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
            w5 w5Var = (w5) arrayList.get(i10);
            if (w5Var.a == layout) {
                ArrayList arrayList2 = w5Var.b;
                int i11 = i7;
                while (i11 < arrayList2.size()) {
                    t5 t5Var = (t5) arrayList2.get(i11);
                    if (t5Var != null) {
                        p5 p5Var = t5Var.f;
                        if (p5Var != null) {
                            p5Var.setColorFilter(colorFilter);
                        }
                        y5 y5Var = t5Var.d;
                        if (y5Var.spanDrawn) {
                            float f15 = y5Var.measuredSize / 2.0f;
                            float f16 = y5Var.lastDrawnCx;
                            float f17 = y5Var.lastDrawnCy;
                            t5Var.e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !t5Var.w) ? 1.0f : Math.max(0.0f, list.get(i7).n);
                            t5Var.r = f13;
                            t5Var.s = max;
                            t5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = t5Var.e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    t5Var.n = true;
                                    i11++;
                                    i7 = 0;
                                }
                            }
                            t5Var.n = false;
                            p5 p5Var2 = t5Var.f;
                            if (p5Var2 == null) {
                                if (t5Var.h != null) {
                                    float extraScale = t5Var.d.getExtraScale();
                                    t5Var.h.setAlpha((int) (t5Var.s * 255.0f * f14));
                                    t5Var.h.setBounds(t5Var.e);
                                    if (extraScale != 1.0f || t5Var.d.invert) {
                                        canvas.save();
                                        canvas.scale((t5Var.d.invert ? -1 : 1) * extraScale, extraScale, t5Var.e.centerX(), t5Var.e.centerY());
                                        t5Var.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        t5Var.h.draw(canvas);
                                    }
                                }
                            } else if (p5Var2.k != null) {
                                p5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.m6.v3 : colorFilter);
                                t5Var.f.p(currentTimeMillis);
                                float extraScale2 = t5Var.d.getExtraScale();
                                if (extraScale2 != 1.0f || t5Var.d.invert) {
                                    canvas.save();
                                    canvas.scale((t5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, t5Var.e.centerX(), t5Var.e.centerY());
                                    p5 p5Var3 = t5Var.f;
                                    Rect rect2 = t5Var.e;
                                    float f18 = t5Var.s * f14;
                                    fi.s2 s2Var = p5Var3.k;
                                    if (s2Var != null) {
                                        s2Var.z0(rect2);
                                        p5Var3.k.setAlpha(f18);
                                        p5Var3.k.h(canvas, null);
                                    }
                                    canvas.restore();
                                } else {
                                    p5 p5Var4 = t5Var.f;
                                    Rect rect3 = t5Var.e;
                                    float f19 = t5Var.s * f14;
                                    fi.s2 s2Var2 = p5Var4.k;
                                    if (s2Var2 != null) {
                                        s2Var2.z0(rect3);
                                        p5Var4.k.setAlpha(f19);
                                        p5Var4.k.h(canvas, null);
                                    }
                                }
                                if (access$400(t5Var.d)) {
                                    t5Var.invalidate();
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

    public static u5 update(int i7, View view, u5 u5Var, ArrayList<org.telegram.messenger.dj> arrayList, boolean z10) {
        return update(i7, view, false, u5Var, arrayList, z10);
    }

    public y5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i7, fontMetricsInt, 1.0f);
    }

    public static u5 update(int i7, View view, boolean z10, u5 u5Var, ArrayList<org.telegram.messenger.dj> arrayList) {
        return update(i7, view, z10, u5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt, float f10) {
        y5[] y5VarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((y5VarArr = (y5[]) spanned.getSpans(0, spanned.length(), y5.class)) == null || y5VarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                CharacterStyle characterStyle = characterStyleArr[i10];
                if (characterStyle != null && (characterStyle instanceof y5)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                    y5 y5Var = (y5) characterStyleArr[i10];
                    charSequence.removeSpan(y5Var);
                    y5 cloneSpan = cloneSpan(y5Var, fontMetricsInt);
                    if (i7 != -1) {
                        cloneSpan.cacheType = i7;
                    }
                    cloneSpan.scale = y5Var.scale * f10;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static u5 update(int i7, View view, boolean z10, u5 u5Var, ArrayList<org.telegram.messenger.dj> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).e;
            }
        }
        return update(i7, view, z10, u5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i7;
        this.cacheType = i10;
    }

    public y5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, u5 u5Var) {
        if (u5Var == null) {
            return;
        }
        while (u5Var.a.size() > 0) {
            u5Var.b(0);
        }
    }

    public y5(long j3, float f10, Paint.FontMetricsInt fontMetricsInt) {
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

    public static u5 update(int i7, View view, u5 u5Var, Layout... layoutArr) {
        return update(i7, view, false, u5Var, layoutArr);
    }

    public static u5 update(int i7, View view, boolean z10, u5 u5Var, Layout... layoutArr) {
        return update(i7, view, z10, u5Var, false, layoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u5 update(int i7, View view, boolean z10, u5 u5Var, boolean z11, Layout... layoutArr) {
        int i10;
        y5[] y5VarArr;
        t5 t5Var;
        int i11;
        int i12;
        u5 u5Var2 = u5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (u5Var2 == null) {
                return null;
            }
            ArrayList arrayList = u5Var2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                u5Var2.b(0);
            }
            return null;
        }
        int i14 = 0;
        while (i14 < layoutArr.length) {
            Layout layout = layoutArr[i14];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i10 = i14;
                y5VarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                y5VarArr = (y5[]) spanned.getSpans(i13, spanned.length(), y5.class);
                int i15 = i13;
                while (y5VarArr != null && i15 < y5VarArr.length) {
                    y5 y5Var = y5VarArr[i15];
                    if (y5Var == null) {
                        i11 = i14;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(y5Var);
                            int spanEnd = spanned.getSpanEnd(y5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(y5Var);
                            y5Var = cloneSpan(y5Var, fontMetricsInt);
                            y5VarArr[i15] = y5Var;
                            spannable.setSpan(y5Var, spanStart, spanEnd, 33);
                        }
                        if (u5Var2 == null) {
                            u5Var2 = new u5();
                            u5Var2.a = new ArrayList();
                            u5Var2.b = new HashMap();
                            u5Var2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = u5Var2.a;
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                t5Var = fontMetricsInt;
                                break;
                            }
                            if (((t5) arrayList2.get(i16)).d == y5Var && ((t5) arrayList2.get(i16)).c == layout) {
                                t5Var = (t5) arrayList2.get(i16);
                                break;
                            }
                            i16++;
                        }
                        if (t5Var == 0) {
                            t5 t5Var2 = new t5(view, z10);
                            t5Var2.c = layout;
                            if (y5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = y5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i7;
                                }
                            }
                            if (y5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                t5Var2.f = p5.m(org.telegram.messenger.k10.t0, y5Var.getDocumentId(), y5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = y5Var.document;
                                if (document != null) {
                                    t5Var2.f = p5.l(org.telegram.messenger.k10.t0, i12, document);
                                } else {
                                    long j3 = y5Var.documentId;
                                    if (j3 != 0) {
                                        t5Var2.f = p5.m(org.telegram.messenger.k10.t0, j3, null, i12);
                                    }
                                }
                            }
                            int i17 = y5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(y5Var.emoji)) {
                                p5 p5Var = t5Var2.f;
                                if (p5Var != null) {
                                    p5Var.q(y5Var.emoji);
                                } else {
                                    t5Var2.h = org.telegram.messenger.j6.g(y5Var.emoji);
                                }
                            }
                            t5Var2.w = c(layout, spanned.getSpanStart(y5Var), spanned.getSpanEnd(y5Var));
                            t5Var2.e = new Rect();
                            t5Var2.d = y5Var;
                            arrayList2.add(t5Var2);
                            HashMap hashMap = u5Var2.b;
                            w5 w5Var = (w5) hashMap.get(layout);
                            if (w5Var == null) {
                                w5Var = new w5(t5Var2.a, layout);
                                hashMap.put(layout, w5Var);
                                u5Var2.c.add(w5Var);
                            }
                            w5Var.b.add(t5Var2);
                            w5Var.a();
                            p5 p5Var2 = t5Var2.f;
                            if (p5Var2 != null) {
                                p5Var2.b(t5Var2);
                            }
                        } else {
                            i11 = i14;
                            t5Var.w = c(layout, spanned.getSpanStart(y5Var), spanned.getSpanEnd(y5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    i13 = 0;
                }
                i10 = i14;
            }
            if (u5Var2 != null) {
                ArrayList arrayList3 = u5Var2.a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((t5) arrayList3.get(i18)).c == layout) {
                        y5 y5Var2 = ((t5) arrayList3.get(i18)).d;
                        for (int i19 = 0; y5VarArr != null && i19 < y5VarArr.length; i19++) {
                            if (y5VarArr[i19] == y5Var2) {
                                break;
                            }
                        }
                        u5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (u5Var2 != null) {
            ArrayList arrayList4 = u5Var2.a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((t5) arrayList4.get(i20)).c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        u5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return u5Var2;
    }

    public static LongSparseArray<p5> update(View view, y5[] y5VarArr, LongSparseArray<p5> longSparseArray) {
        return update(0, view, y5VarArr, longSparseArray);
    }

    public static LongSparseArray<p5> update(int i7, View view, y5[] y5VarArr, LongSparseArray<p5> longSparseArray) {
        int i10;
        p5 m10;
        int i11;
        if (y5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            p5 p5Var = longSparseArray.get(keyAt);
            if (p5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (y5 y5Var : y5VarArr) {
                    i11 = (y5Var == null || y5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                p5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (y5 y5Var2 : y5VarArr) {
            if (y5Var2 != null && longSparseArray.get(y5Var2.getDocumentId()) == null) {
                if (y5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = y5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                TLRPC.Document document = y5Var2.document;
                if (document != null) {
                    m10 = p5.l(org.telegram.messenger.k10.t0, i10, document);
                } else {
                    m10 = p5.m(org.telegram.messenger.k10.t0, y5Var2.documentId, null, i10);
                }
                m10.a(view);
                longSparseArray.put(y5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<p5> update(View view, ArrayList<y5> arrayList, LongSparseArray<p5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<p5> update(int i7, View view, ArrayList<y5> arrayList, LongSparseArray<p5> longSparseArray) {
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
            p5 p5Var = longSparseArray.get(keyAt);
            if (p5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (0; i11 < arrayList.size(); i11 + 1) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                p5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            y5 y5Var = arrayList.get(i13);
            if (y5Var != null && longSparseArray.get(y5Var.getDocumentId()) == null) {
                if (y5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = y5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                p5 m10 = p5.m(org.telegram.messenger.k10.t0, y5Var.documentId, null, i10);
                m10.a(view);
                longSparseArray.put(y5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}
