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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class t5 extends ReplacementSpan {
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

    public t5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static /* synthetic */ void a(t5 t5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t5Var.extraScale = floatValue;
        t5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(t5 t5Var) {
        return (t5Var.moveAnimator == null && t5Var.scaleAnimator == null) ? false : true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            t5[] t5VarArr = (t5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), t5.class);
            if (t5VarArr != null) {
                for (t5 t5Var : t5VarArr) {
                    t5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static /* synthetic */ void b(t5 t5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t5Var.extraScale = floatValue;
        t5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            yz0[] yz0VarArr = (yz0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), yz0.class);
            for (int i12 = 0; yz0VarArr != null && i12 < yz0VarArr.length; i12++) {
                yz0 yz0Var = yz0VarArr[i12];
                if (yz0Var != null && yz0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static t5 cloneSpan(t5 t5Var, Paint.FontMetricsInt fontMetricsInt) {
        t5 t5Var2;
        TLRPC.Document document = t5Var.document;
        if (document != null) {
            t5Var2 = new t5(document, t5Var.scale, fontMetricsInt != null ? fontMetricsInt : t5Var.fontMetrics);
        } else {
            t5Var2 = new t5(t5Var.documentId, t5Var.scale, fontMetricsInt != null ? fontMetricsInt : t5Var.fontMetrics);
        }
        if (fontMetricsInt != null) {
            t5Var2.size = t5Var.size;
        }
        t5Var2.fromEmojiKeyboard = t5Var.fromEmojiKeyboard;
        t5Var2.isAdded = t5Var.isAdded;
        t5Var2.isRemoved = t5Var.isRemoved;
        return t5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, p5 p5Var, float f10, List<eh.k> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, p5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof t5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<k5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            k5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static p5 update(int i10, View view, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, p5Var, arrayList, false);
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
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (!this.recordPositions) {
            return;
        }
        this.spanDrawn = true;
        float f11 = (this.measuredSize / 2.0f) + f10;
        float f12 = ((i14 - i12) / 2.0f) + i12;
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
            ofFloat.addUpdateListener(new m5(this, f13, f12, f15, f11, 0));
            this.moveAnimator.addListener(new n5(this, 2));
            this.moveAnimator.setDuration(140L);
            this.moveAnimator.setInterpolator(er.f);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.l5
                public final /* synthetic */ t5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i11) {
                        case 0:
                            t5.b(this.b, valueAnimator2);
                            break;
                        default:
                            t5.a(this.b, valueAnimator2);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new n5(this, i11));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(er.f);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.l5
                public final /* synthetic */ t5 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            t5.b(this.b, valueAnimator22);
                            break;
                        default:
                            t5.a(this.b, valueAnimator22);
                            break;
                    }
                }
            });
            this.scaleAnimator.addListener(new n5(this, i10));
            this.scaleAnimator.setInterpolator(er.f);
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
                float f10 = (-dp2) - dp;
                float f11 = this.scale;
                fontMetricsInt2.top = (int) (f10 * f11);
                float f12 = dp2 - dp;
                fontMetricsInt2.bottom = (int) (f12 * f11);
                fontMetricsInt2.ascent = (int) (f10 * f11);
                fontMetricsInt2.descent = (int) (f12 * f11);
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

    public t5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public t5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public t5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, p5 p5Var, float f10, List<eh.k> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || p5Var == null) {
            return;
        }
        ArrayList arrayList = p5Var.c;
        int i10 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f10 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f10));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            r5 r5Var = (r5) arrayList.get(i11);
            if (r5Var.a == layout) {
                ArrayList arrayList2 = r5Var.b;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    o5 o5Var = (o5) arrayList2.get(i12);
                    if (o5Var != null) {
                        k5 k5Var = o5Var.f;
                        if (k5Var != null) {
                            k5Var.setColorFilter(colorFilter);
                        }
                        t5 t5Var = o5Var.d;
                        if (t5Var.spanDrawn) {
                            float f15 = t5Var.measuredSize / 2.0f;
                            float f16 = t5Var.lastDrawnCx;
                            float f17 = t5Var.lastDrawnCy;
                            o5Var.e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !o5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).n);
                            o5Var.r = f13;
                            o5Var.s = max;
                            o5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = o5Var.e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    o5Var.n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            o5Var.n = false;
                            k5 k5Var2 = o5Var.f;
                            if (k5Var2 == null) {
                                if (o5Var.h != null) {
                                    float extraScale = o5Var.d.getExtraScale();
                                    o5Var.h.setAlpha((int) (o5Var.s * 255.0f * f14));
                                    o5Var.h.setBounds(o5Var.e);
                                    if (extraScale != 1.0f || o5Var.d.invert) {
                                        canvas.save();
                                        canvas.scale((o5Var.d.invert ? -1 : 1) * extraScale, extraScale, o5Var.e.centerX(), o5Var.e.centerY());
                                        o5Var.h.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        o5Var.h.draw(canvas);
                                    }
                                }
                            } else if (k5Var2.k != null) {
                                k5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.g6.v3 : colorFilter);
                                o5Var.f.q(currentTimeMillis);
                                float extraScale2 = o5Var.d.getExtraScale();
                                if (extraScale2 != 1.0f || o5Var.d.invert) {
                                    canvas.save();
                                    canvas.scale((o5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, o5Var.e.centerX(), o5Var.e.centerY());
                                    k5 k5Var3 = o5Var.f;
                                    Rect rect2 = o5Var.e;
                                    float f18 = o5Var.s * f14;
                                    jh.y2 y2Var = k5Var3.k;
                                    if (y2Var != null) {
                                        y2Var.setImageCoords(rect2);
                                        k5Var3.k.setAlpha(f18);
                                        k5Var3.k.draw(canvas);
                                    }
                                    canvas.restore();
                                } else {
                                    k5 k5Var4 = o5Var.f;
                                    Rect rect3 = o5Var.e;
                                    float f19 = o5Var.s * f14;
                                    jh.y2 y2Var2 = k5Var4.k;
                                    if (y2Var2 != null) {
                                        y2Var2.setImageCoords(rect3);
                                        k5Var4.k.setAlpha(f19);
                                        k5Var4.k.draw(canvas);
                                    }
                                }
                                if (access$400(o5Var.d)) {
                                    o5Var.invalidate();
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

    public static p5 update(int i10, View view, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, p5Var, arrayList, z10);
    }

    public t5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static p5 update(int i10, View view, boolean z10, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, p5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.text.SpannableString] */
    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f10) {
        t5[] t5VarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((t5VarArr = (t5[]) spanned.getSpans(0, spanned.length(), t5.class)) == null || t5VarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                CharacterStyle characterStyle = characterStyleArr[i11];
                if (characterStyle != null && (characterStyle instanceof t5)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                    t5 t5Var = (t5) characterStyleArr[i11];
                    charSequence.removeSpan(t5Var);
                    t5 cloneSpan = cloneSpan(t5Var, fontMetricsInt);
                    if (i10 != -1) {
                        cloneSpan.cacheType = i10;
                    }
                    cloneSpan.scale = t5Var.scale * f10;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static p5 update(int i10, View view, boolean z10, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, p5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public t5(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, p5 p5Var) {
        if (p5Var == null) {
            return;
        }
        while (p5Var.a.size() > 0) {
            p5Var.b(0);
        }
    }

    public t5(long j10, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
        this.scale = f10;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static p5 update(int i10, View view, p5 p5Var, Layout... layoutArr) {
        return update(i10, view, false, p5Var, layoutArr);
    }

    public static p5 update(int i10, View view, boolean z10, p5 p5Var, Layout... layoutArr) {
        return update(i10, view, z10, p5Var, false, layoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p5 update(int i10, View view, boolean z10, p5 p5Var, boolean z11, Layout... layoutArr) {
        int i11;
        t5[] t5VarArr;
        o5 o5Var;
        int i12;
        int i13;
        p5 p5Var2 = p5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (p5Var2 == null) {
                return null;
            }
            ArrayList arrayList = p5Var2.a;
            arrayList.clear();
            while (arrayList.size() > 0) {
                p5Var2.b(0);
            }
            return null;
        }
        int i15 = 0;
        while (i15 < layoutArr.length) {
            Layout layout = layoutArr[i15];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i11 = i15;
                t5VarArr = null;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                t5VarArr = (t5[]) spanned.getSpans(i14, spanned.length(), t5.class);
                int i16 = 0;
                while (t5VarArr != null && i16 < t5VarArr.length) {
                    t5 t5Var = t5VarArr[i16];
                    if (t5Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(t5Var);
                            int spanEnd = spanned.getSpanEnd(t5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(t5Var);
                            t5Var = cloneSpan(t5Var, fontMetricsInt);
                            t5VarArr[i16] = t5Var;
                            spannable.setSpan(t5Var, spanStart, spanEnd, 33);
                        }
                        if (p5Var2 == null) {
                            p5Var2 = new p5();
                            p5Var2.a = new ArrayList();
                            p5Var2.b = new HashMap();
                            p5Var2.c = new ArrayList();
                        }
                        ArrayList arrayList2 = p5Var2.a;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                o5Var = fontMetricsInt;
                                break;
                            }
                            if (((o5) arrayList2.get(i17)).d == t5Var && ((o5) arrayList2.get(i17)).c == layout) {
                                o5Var = (o5) arrayList2.get(i17);
                                break;
                            }
                            i17++;
                        }
                        if (o5Var == 0) {
                            o5 o5Var2 = new o5(view, z10);
                            o5Var2.c = layout;
                            if (t5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = t5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (t5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                o5Var2.f = k5.n(UserConfig.selectedAccount, t5Var.getDocumentId(), t5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = t5Var.document;
                                if (document != null) {
                                    o5Var2.f = k5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j10 = t5Var.documentId;
                                    if (j10 != 0) {
                                        o5Var2.f = k5.n(UserConfig.selectedAccount, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = t5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(t5Var.emoji)) {
                                k5 k5Var = o5Var2.f;
                                if (k5Var != null) {
                                    k5Var.r(t5Var.emoji);
                                } else {
                                    o5Var2.h = Emoji.getEmojiDrawable(t5Var.emoji);
                                }
                            }
                            o5Var2.v = c(layout, spanned.getSpanStart(t5Var), spanned.getSpanEnd(t5Var));
                            o5Var2.e = new Rect();
                            o5Var2.d = t5Var;
                            arrayList2.add(o5Var2);
                            HashMap hashMap = p5Var2.b;
                            r5 r5Var = (r5) hashMap.get(layout);
                            if (r5Var == null) {
                                r5Var = new r5(view, layout);
                                hashMap.put(layout, r5Var);
                                p5Var2.c.add(r5Var);
                            }
                            r5Var.b.add(o5Var2);
                            r5Var.a();
                            k5 k5Var2 = o5Var2.f;
                            if (k5Var2 != null) {
                                k5Var2.b(o5Var2);
                            }
                        } else {
                            i12 = i15;
                            o5Var.v = c(layout, spanned.getSpanStart(t5Var), spanned.getSpanEnd(t5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                }
                i11 = i15;
            }
            if (p5Var2 != null) {
                ArrayList arrayList3 = p5Var2.a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((o5) arrayList3.get(i19)).c == layout) {
                        t5 t5Var2 = ((o5) arrayList3.get(i19)).d;
                        for (int i20 = 0; t5VarArr != null && i20 < t5VarArr.length; i20++) {
                            if (t5VarArr[i20] == t5Var2) {
                                break;
                            }
                        }
                        p5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (p5Var2 != null) {
            ArrayList arrayList4 = p5Var2.a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((o5) arrayList4.get(i21)).c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        p5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return p5Var2;
    }

    public static LongSparseArray<k5> update(View view, t5[] t5VarArr, LongSparseArray<k5> longSparseArray) {
        return update(0, view, t5VarArr, longSparseArray);
    }

    public static LongSparseArray<k5> update(int i10, View view, t5[] t5VarArr, LongSparseArray<k5> longSparseArray) {
        int i11;
        k5 n10;
        int i12;
        if (t5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            k5 k5Var = longSparseArray.get(keyAt);
            if (k5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < t5VarArr.length) {
                    t5 t5Var = t5VarArr[i12];
                    i12 = (t5Var == null || t5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                k5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (t5 t5Var2 : t5VarArr) {
            if (t5Var2 != null && longSparseArray.get(t5Var2.getDocumentId()) == null) {
                if (t5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = t5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = t5Var2.document;
                if (document != null) {
                    n10 = k5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = k5.n(UserConfig.selectedAccount, t5Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(t5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<k5> update(View view, ArrayList<t5> arrayList, LongSparseArray<k5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<k5> update(int i10, View view, ArrayList<t5> arrayList, LongSparseArray<k5> longSparseArray) {
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
            k5 k5Var = longSparseArray.get(keyAt);
            if (k5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < arrayList.size()) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                k5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            t5 t5Var = arrayList.get(i14);
            if (t5Var != null && longSparseArray.get(t5Var.getDocumentId()) == null) {
                if (t5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = t5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                k5 n10 = k5.n(UserConfig.selectedAccount, t5Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(t5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}
