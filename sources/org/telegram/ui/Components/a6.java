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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class a6 extends ReplacementSpan {
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

    public a6(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static /* synthetic */ void a(a6 a6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a6Var.extraScale = floatValue;
        a6Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(a6 a6Var) {
        return (a6Var.moveAnimator == null && a6Var.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            a6[] a6VarArr = (a6[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), a6.class);
            if (a6VarArr != null) {
                for (a6 a6Var : a6VarArr) {
                    a6Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static /* synthetic */ void b(a6 a6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a6Var.extraScale = floatValue;
        a6Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            n11[] n11VarArr = (n11[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), n11.class);
            for (int i12 = 0; n11VarArr != null && i12 < n11VarArr.length; i12++) {
                n11 n11Var = n11VarArr[i12];
                if (n11Var != null && n11Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static a6 cloneSpan(a6 a6Var, Paint.FontMetricsInt fontMetricsInt) {
        a6 a6Var2;
        TLRPC.Document document = a6Var.document;
        if (document != null) {
            a6Var2 = new a6(document, a6Var.scale, fontMetricsInt != null ? fontMetricsInt : a6Var.fontMetrics);
        } else {
            a6Var2 = new a6(a6Var.documentId, a6Var.scale, fontMetricsInt != null ? fontMetricsInt : a6Var.fontMetrics);
        }
        if (fontMetricsInt != null) {
            a6Var2.size = a6Var.size;
        }
        a6Var2.fromEmojiKeyboard = a6Var.fromEmojiKeyboard;
        a6Var2.isAdded = a6Var.isAdded;
        a6Var2.isRemoved = a6Var.isRemoved;
        return a6Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, w5 w5Var, float f7, List<wh.g> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, w5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof a6) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<r5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            r5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static w5 update(int i10, View view, w5 w5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, w5Var, arrayList, false);
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
            ofFloat.addUpdateListener(new t5(this, f12, f11, f14, f10, 0));
            this.moveAnimator.addListener(new u5(this, 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(bs.f);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.s5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i11) {
                        case 0:
                            a6.b(this.b, valueAnimator2);
                            break;
                        default:
                            a6.a(this.b, valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new u5(this, i11));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(bs.f);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.s5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            a6.b(this.b, valueAnimator22);
                            break;
                        default:
                            a6.a(this.b, valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new u5(this, i10));
            this.scaleAnimator.setInterpolator(bs.f);
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
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt2 != null) {
                float f7 = (-dp2) - dp;
                float f10 = this.scale;
                fontMetricsInt2.top = (int) (f7 * f10);
                float f11 = dp2 - dp;
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
                this.size = AndroidUtilities.dp(20.0f);
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

    public a6 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public a6 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public a6 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, w5 w5Var, float f7, List<wh.g> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || w5Var == null) {
            return;
        }
        ArrayList arrayList = w5Var.c;
        int i10 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f7 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f7));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            y5 y5Var = (y5) arrayList.get(i11);
            if (y5Var.a == layout) {
                ArrayList arrayList2 = y5Var.b;
                int i12 = i10;
                while (i12 < arrayList2.size()) {
                    v5 v5Var = (v5) arrayList2.get(i12);
                    if (v5Var != null) {
                        r5 r5Var = v5Var.f;
                        if (r5Var != null) {
                            r5Var.setColorFilter(colorFilter);
                        }
                        a6 a6Var = v5Var.d;
                        if (a6Var.spanDrawn) {
                            float f14 = a6Var.measuredSize / 2.0f;
                            float f15 = a6Var.lastDrawnCx;
                            float f16 = a6Var.lastDrawnCy;
                            v5Var.e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !v5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).n);
                            v5Var.r = f12;
                            v5Var.s = max;
                            v5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = v5Var.e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    v5Var.n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            v5Var.n = false;
                            r5 r5Var2 = v5Var.f;
                            if (r5Var2 == null) {
                                if (v5Var.h != null) {
                                    float extraScale = v5Var.d.getExtraScale();
                                    v5Var.h.setAlpha((int) (v5Var.s * 255.0f * f13));
                                    v5Var.h.setBounds(v5Var.e);
                                    if (extraScale != 1.0f || v5Var.d.invert) {
                                        canvas.save();
                                        canvas.scale((v5Var.d.invert ? -1 : 1) * extraScale, extraScale, v5Var.e.centerX(), v5Var.e.centerY());
                                        v5Var.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        v5Var.h.draw(canvas);
                                    }
                                }
                            } else if (r5Var2.k != null) {
                                r5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.h6.v3 : colorFilter);
                                v5Var.f.q(currentTimeMillis);
                                float extraScale2 = v5Var.d.getExtraScale();
                                if (extraScale2 != 1.0f || v5Var.d.invert) {
                                    canvas.save();
                                    canvas.scale((v5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, v5Var.e.centerX(), v5Var.e.centerY());
                                    r5 r5Var3 = v5Var.f;
                                    Rect rect2 = v5Var.e;
                                    float f17 = v5Var.s * f13;
                                    ci.g3 g3Var = r5Var3.k;
                                    if (g3Var != null) {
                                        g3Var.setImageCoords(rect2);
                                        r5Var3.k.setAlpha(f17);
                                        r5Var3.k.draw(canvas);
                                    }
                                    canvas.restore();
                                } else {
                                    r5 r5Var4 = v5Var.f;
                                    Rect rect3 = v5Var.e;
                                    float f18 = v5Var.s * f13;
                                    ci.g3 g3Var2 = r5Var4.k;
                                    if (g3Var2 != null) {
                                        g3Var2.setImageCoords(rect3);
                                        r5Var4.k.setAlpha(f18);
                                        r5Var4.k.draw(canvas);
                                    }
                                }
                                if (access$400(v5Var.d)) {
                                    v5Var.invalidate();
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

    public static w5 update(int i10, View view, w5 w5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, w5Var, arrayList, z10);
    }

    public a6(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static w5 update(int i10, View view, boolean z10, w5 w5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, w5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        a6[] a6VarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((a6VarArr = (a6[]) spanned.getSpans(0, spanned.length(), a6.class)) == null || a6VarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                CharacterStyle characterStyle = characterStyleArr[i11];
                if (characterStyle != null && (characterStyle instanceof a6)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                    a6 a6Var = (a6) characterStyleArr[i11];
                    charSequence.removeSpan(a6Var);
                    a6 cloneSpan = cloneSpan(a6Var, fontMetricsInt);
                    if (i10 != -1) {
                        cloneSpan.cacheType = i10;
                    }
                    cloneSpan.scale = a6Var.scale * f7;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static w5 update(int i10, View view, boolean z10, w5 w5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, w5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public a6(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, w5 w5Var) {
        if (w5Var == null) {
            return;
        }
        while (w5Var.a.size() > 0) {
            w5Var.b(0);
        }
    }

    public a6(long j10, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
        this.scale = f7;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static w5 update(int i10, View view, w5 w5Var, Layout... layoutArr) {
        return update(i10, view, false, w5Var, layoutArr);
    }

    public static w5 update(int i10, View view, boolean z10, w5 w5Var, Layout... layoutArr) {
        return update(i10, view, z10, w5Var, false, layoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w5 update(int i10, View view, boolean z10, w5 w5Var, boolean z11, Layout... layoutArr) {
        int i11;
        a6[] a6VarArr;
        v5 v5Var;
        int i12;
        int i13;
        w5 w5Var2 = w5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (w5Var2 == null) {
                return null;
            }
            ArrayList arrayList = w5Var2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                w5Var2.b(0);
            }
            return null;
        }
        int i15 = 0;
        while (i15 < layoutArr.length) {
            Layout layout = layoutArr[i15];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i11 = i15;
                a6VarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                a6VarArr = (a6[]) spanned.getSpans(i14, spanned.length(), a6.class);
                int i16 = i14;
                while (a6VarArr != null && i16 < a6VarArr.length) {
                    a6 a6Var = a6VarArr[i16];
                    if (a6Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(a6Var);
                            int spanEnd = spanned.getSpanEnd(a6Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(a6Var);
                            a6Var = cloneSpan(a6Var, fontMetricsInt);
                            a6VarArr[i16] = a6Var;
                            spannable.setSpan(a6Var, spanStart, spanEnd, 33);
                        }
                        if (w5Var2 == null) {
                            w5Var2 = new w5();
                            w5Var2.a = new ArrayList();
                            w5Var2.b = new HashMap();
                            w5Var2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = w5Var2.a;
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                v5Var = fontMetricsInt;
                                break;
                            }
                            if (((v5) arrayList2.get(i17)).d == a6Var && ((v5) arrayList2.get(i17)).c == layout) {
                                v5Var = (v5) arrayList2.get(i17);
                                break;
                            }
                            i17++;
                        }
                        if (v5Var == 0) {
                            v5 v5Var2 = new v5(view, z10);
                            v5Var2.c = layout;
                            if (a6Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = a6Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (a6Var.documentAbsolutePath != null) {
                                i12 = i15;
                                v5Var2.f = r5.n(UserConfig.selectedAccount, a6Var.getDocumentId(), a6Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = a6Var.document;
                                if (document != null) {
                                    v5Var2.f = r5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j10 = a6Var.documentId;
                                    if (j10 != 0) {
                                        v5Var2.f = r5.n(UserConfig.selectedAccount, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = a6Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(a6Var.emoji)) {
                                r5 r5Var = v5Var2.f;
                                if (r5Var != null) {
                                    r5Var.r(a6Var.emoji);
                                } else {
                                    v5Var2.h = Emoji.getEmojiDrawable(a6Var.emoji);
                                }
                            }
                            v5Var2.v = c(layout, spanned.getSpanStart(a6Var), spanned.getSpanEnd(a6Var));
                            v5Var2.e = new Rect();
                            v5Var2.d = a6Var;
                            arrayList2.add(v5Var2);
                            HashMap hashMap = w5Var2.b;
                            y5 y5Var = (y5) hashMap.get(layout);
                            if (y5Var == null) {
                                y5Var = new y5(v5Var2.a, layout);
                                hashMap.put(layout, y5Var);
                                w5Var2.c.add(y5Var);
                            }
                            y5Var.b.add(v5Var2);
                            y5Var.a();
                            r5 r5Var2 = v5Var2.f;
                            if (r5Var2 != null) {
                                r5Var2.b(v5Var2);
                            }
                        } else {
                            i12 = i15;
                            v5Var.v = c(layout, spanned.getSpanStart(a6Var), spanned.getSpanEnd(a6Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    i14 = 0;
                }
                i11 = i15;
            }
            if (w5Var2 != null) {
                ArrayList arrayList3 = w5Var2.a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((v5) arrayList3.get(i19)).c == layout) {
                        a6 a6Var2 = ((v5) arrayList3.get(i19)).d;
                        for (int i20 = 0; a6VarArr != null && i20 < a6VarArr.length; i20++) {
                            if (a6VarArr[i20] == a6Var2) {
                                break;
                            }
                        }
                        w5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (w5Var2 != null) {
            ArrayList arrayList4 = w5Var2.a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((v5) arrayList4.get(i21)).c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        w5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return w5Var2;
    }

    public static LongSparseArray<r5> update(View view, a6[] a6VarArr, LongSparseArray<r5> longSparseArray) {
        return update(0, view, a6VarArr, longSparseArray);
    }

    public static LongSparseArray<r5> update(int i10, View view, a6[] a6VarArr, LongSparseArray<r5> longSparseArray) {
        int i11;
        r5 n10;
        int i12;
        if (a6VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            r5 r5Var = longSparseArray.get(keyAt);
            if (r5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (a6 a6Var : a6VarArr) {
                    i12 = (a6Var == null || a6Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                r5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (a6 a6Var2 : a6VarArr) {
            if (a6Var2 != null && longSparseArray.get(a6Var2.getDocumentId()) == null) {
                if (a6Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = a6Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = a6Var2.document;
                if (document != null) {
                    n10 = r5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = r5.n(UserConfig.selectedAccount, a6Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(a6Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<r5> update(View view, ArrayList<a6> arrayList, LongSparseArray<r5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<r5> update(int i10, View view, ArrayList<a6> arrayList, LongSparseArray<r5> longSparseArray) {
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
            r5 r5Var = longSparseArray.get(keyAt);
            if (r5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (0; i12 < arrayList.size(); i12 + 1) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                r5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            a6 a6Var = arrayList.get(i14);
            if (a6Var != null && longSparseArray.get(a6Var.getDocumentId()) == null) {
                if (a6Var.standard) {
                    i11 = 8;
                } else {
                    i11 = a6Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                r5 n10 = r5.n(UserConfig.selectedAccount, a6Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(a6Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}
