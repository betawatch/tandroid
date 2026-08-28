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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ai0 extends Path {
    public final org.telegram.ui.Cells.t1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final kq j;
    public final y5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public zh0 q;

    public ai0(final org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new kq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i11 = 0;
        this.k = new y5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.yh0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, gr.h);
        this.b = i9;
        int i12 = -i10;
        this.c = i12;
        this.d = i12;
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
        zh0 zh0Var = new zh0();
        zh0Var.a = f16 - AndroidUtilities.dp(3.0f);
        zh0Var.b = f19 + AndroidUtilities.dp(3.0f);
        zh0Var.c = f18;
        zh0Var.d = f13 + f17;
        zh0 zh0Var2 = this.q;
        if (zh0Var2 != null) {
            float f20 = zh0Var2.d;
            zh0Var2.h = (f20 + f18) / 2.0f;
            zh0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(zh0Var);
        this.q = zh0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        int i9 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f;
        Paint paint = this.i;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        kq kqVar = this.j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            kqVar.rewind();
            int I2 = t1Var.I2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            kqVar.addRect(rectF, Path.Direction.CW);
            kqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            kqVar.rewind();
            int O2 = t1Var.O2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            kqVar.addRect(rectF2, Path.Direction.CW);
            kqVar.a();
        } else {
            canvas.translate(f10, f11);
            kqVar.rewind();
            while (true) {
                ArrayList arrayList = this.l;
                if (i9 >= arrayList.size()) {
                    break;
                }
                zh0 zh0Var = (zh0) arrayList.get(i9);
                kqVar.addRect(AndroidUtilities.lerp(rect.left - f10, zh0Var.a, d), AndroidUtilities.lerp(zh0Var.e ? rect.top - f11 : zh0Var.g, zh0Var.c, d), AndroidUtilities.lerp(rect.right - f10, zh0Var.b, d), AndroidUtilities.lerp(zh0Var.f ? rect.bottom - f11 : zh0Var.h, zh0Var.d, d), Path.Direction.CW);
                i9++;
            }
            kqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(kqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ai0(final org.telegram.ui.Cells.t1 t1Var, int i9, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new kq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i10 = 1;
        this.k = new y5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.yh0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, gr.h);
        this.b = i9;
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
    public ai0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i9, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i13 = i10;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new kq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = null;
        this.k = new y5(0.0f, new jg0(3, t1Var, viewParent), 350L, 420L, gr.h);
        this.b = i9;
        this.c = i13;
        this.d = i11;
        int i14 = 0;
        this.e = false;
        this.f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i15 = 0;
        boolean z10 = false;
        while (i15 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i15);
            if (textLayoutBlock != 0 && i13 <= textLayoutBlock.charactersEnd && i11 >= (i12 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i14, i13 - i12);
                int i16 = textLayoutBlock.charactersOffset;
                int min = Math.min(i11 - i16, textLayoutBlock.charactersEnd - i16);
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
                        for (int i17 = lineForOffset; i17 <= lineForOffset2; i17++) {
                            int lineStart = staticLayout.getLineStart(i17);
                            int lineEnd = staticLayout.getLineEnd(i17);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i17 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i17);
                                }
                                if (i17 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i17);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i17), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i17));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i15++;
            arrayList2 = arrayList;
            i13 = i10;
            i14 = 0;
        }
        if (this.l.size() > 0) {
            zh0 zh0Var = (zh0) this.l.get(0);
            zh0 zh0Var2 = (zh0) j3.r0.j(1, this.l);
            zh0Var.e = true;
            zh0Var.c -= AndroidUtilities.dp(0.66f);
            zh0Var2.f = true;
            zh0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
