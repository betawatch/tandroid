package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ci0 extends Path {
    public final org.telegram.ui.Cells.s1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final iq j;
    public final y5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public bi0 q;

    public ci0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new iq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = s1Var;
        final int i12 = 0;
        this.k = new y5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ai0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, er.h);
        this.b = i10;
        int i13 = -i11;
        this.c = i13;
        this.d = i13;
        this.e = true;
        this.f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.n;
        float f16 = max + f15;
        float f17 = this.o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        bi0 bi0Var = new bi0();
        bi0Var.a = f16 - AndroidUtilities.dp(3.0f);
        bi0Var.b = f19 + AndroidUtilities.dp(3.0f);
        bi0Var.c = f18;
        bi0Var.d = f13 + f17;
        bi0 bi0Var2 = this.q;
        if (bi0Var2 != null) {
            float f20 = bi0Var2.d;
            bi0Var2.h = (f20 + f18) / 2.0f;
            bi0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(bi0Var);
        this.q = bi0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        int i10 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f;
        Paint paint = this.i;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        iq iqVar = this.j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            iqVar.rewind();
            int H2 = s1Var.H2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.G2(H2), s1Var.getBackgroundDrawableRight(), s1Var.F2(H2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            iqVar.addRect(rectF, Path.Direction.CW);
            iqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            iqVar.rewind();
            int N2 = s1Var.N2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.G2(N2), s1Var.getBackgroundDrawableRight(), s1Var.F2(N2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            iqVar.addRect(rectF2, Path.Direction.CW);
            iqVar.a();
        } else {
            canvas.translate(f10, f11);
            iqVar.rewind();
            while (true) {
                ArrayList arrayList = this.l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                bi0 bi0Var = (bi0) arrayList.get(i10);
                iqVar.addRect(AndroidUtilities.lerp(rect.left - f10, bi0Var.a, d), AndroidUtilities.lerp(bi0Var.e ? rect.top - f11 : bi0Var.g, bi0Var.c, d), AndroidUtilities.lerp(rect.right - f10, bi0Var.b, d), AndroidUtilities.lerp(bi0Var.f ? rect.bottom - f11 : bi0Var.h, bi0Var.d, d), Path.Direction.CW);
                i10++;
            }
            iqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(iqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ci0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new iq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = s1Var;
        final int i11 = 1;
        this.k = new y5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ai0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, er.h);
        this.b = i10;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ci0(org.telegram.ui.Cells.s1 s1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new iq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = null;
        this.k = new y5(0.0f, new lg0(3, s1Var, viewParent), 350L, 420L, er.h);
        this.b = i10;
        this.c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i16 = 0;
        boolean z10 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f11 = -f10;
                this.n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    if (max != min) {
                        if (min < max) {
                            min = max;
                            max = min;
                        }
                        int lineForOffset = staticLayout.getLineForOffset(max);
                        int lineForOffset2 = staticLayout.getLineForOffset(min);
                        for (int i18 = lineForOffset; i18 <= lineForOffset2; i18++) {
                            int lineStart = staticLayout.getLineStart(i18);
                            int lineEnd = staticLayout.getLineEnd(i18);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i18 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i18);
                                }
                                if (i18 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i18);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i18), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i18));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.l.size() > 0) {
            bi0 bi0Var = (bi0) this.l.get(0);
            bi0 bi0Var2 = (bi0) i0.a.i(1, this.l);
            bi0Var.e = true;
            bi0Var.c -= AndroidUtilities.dp(0.66f);
            bi0Var2.f = true;
            bi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
