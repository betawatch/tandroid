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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ui0 extends Path {
    public final org.telegram.ui.Cells.t1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final sq j;
    public final z5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public ti0 q;

    public ui0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new sq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i12 = 0;
        this.k = new z5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.si0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
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
        }, 350L, 420L, nr.h);
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
        ti0 ti0Var = new ti0();
        ti0Var.a = f16 - AndroidUtilities.dp(3.0f);
        ti0Var.b = f19 + AndroidUtilities.dp(3.0f);
        ti0Var.c = f18;
        ti0Var.d = f13 + f17;
        ti0 ti0Var2 = this.q;
        if (ti0Var2 != null) {
            float f20 = ti0Var2.d;
            ti0Var2.h = (f20 + f18) / 2.0f;
            ti0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(ti0Var);
        this.q = ti0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        int i10 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z4 = this.f;
        Paint paint = this.i;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        sq sqVar = this.j;
        if (z4) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            sqVar.rewind();
            int I2 = t1Var.I2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            sqVar.addRect(rectF, Path.Direction.CW);
            sqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            sqVar.rewind();
            int O2 = t1Var.O2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            sqVar.addRect(rectF2, Path.Direction.CW);
            sqVar.a();
        } else {
            canvas.translate(f10, f11);
            sqVar.rewind();
            while (true) {
                ArrayList arrayList = this.l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ti0 ti0Var = (ti0) arrayList.get(i10);
                sqVar.addRect(AndroidUtilities.lerp(rect.left - f10, ti0Var.a, d), AndroidUtilities.lerp(ti0Var.e ? rect.top - f11 : ti0Var.g, ti0Var.c, d), AndroidUtilities.lerp(rect.right - f10, ti0Var.b, d), AndroidUtilities.lerp(ti0Var.f ? rect.bottom - f11 : ti0Var.h, ti0Var.d, d), Path.Direction.CW);
                i10++;
            }
            sqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(sqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ui0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new sq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i11 = 1;
        this.k = new z5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.si0
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
        }, 350L, 420L, nr.h);
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
    public ui0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new sq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = null;
        this.k = new z5(0.0f, new i80(9, t1Var, viewParent), 350L, 420L, nr.h);
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
        boolean z4 = false;
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
                z4 = z4 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z4) {
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
            ti0 ti0Var = (ti0) this.l.get(0);
            ti0 ti0Var2 = (ti0) kh.a2.i(1, this.l);
            ti0Var.e = true;
            ti0Var.c -= AndroidUtilities.dp(0.66f);
            ti0Var2.f = true;
            ti0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
