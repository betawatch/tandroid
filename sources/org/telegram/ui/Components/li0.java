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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class li0 extends Path {
    public final org.telegram.ui.Cells.s1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final oq j;
    public final d6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public ki0 q;

    public li0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new oq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = s1Var;
        final int i12 = 0;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ji0
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
        }, 350L, 420L, jr.h);
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

    public final void a(float f9, float f10, float f11, float f12) {
        if (f9 >= f11) {
            return;
        }
        float f13 = this.p;
        float max = Math.max(f13, f9);
        float max2 = Math.max(f13, f11);
        float f14 = this.n;
        float f15 = max + f14;
        float f16 = this.o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ki0 ki0Var = new ki0();
        ki0Var.a = f15 - AndroidUtilities.dp(3.0f);
        ki0Var.b = f18 + AndroidUtilities.dp(3.0f);
        ki0Var.c = f17;
        ki0Var.d = f12 + f16;
        ki0 ki0Var2 = this.q;
        if (ki0Var2 != null) {
            float f19 = ki0Var2.d;
            ki0Var2.h = (f19 + f17) / 2.0f;
            ki0Var.g = (f19 + f17) / 2.0f;
        }
        this.l.add(ki0Var);
        this.q = ki0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        a(f9, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f9, float f10, Rect rect, float f11) {
        int i10 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f;
        Paint paint = this.i;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        oq oqVar = this.j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            oqVar.rewind();
            int I2 = s1Var.I2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(I2), s1Var.getBackgroundDrawableRight(), s1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            oqVar.addRect(rectF, Path.Direction.CW);
            oqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            oqVar.rewind();
            int O2 = s1Var.O2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(O2), s1Var.getBackgroundDrawableRight(), s1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            oqVar.addRect(rectF2, Path.Direction.CW);
            oqVar.a();
        } else {
            canvas.translate(f9, f10);
            oqVar.rewind();
            while (true) {
                ArrayList arrayList = this.l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ki0 ki0Var = (ki0) arrayList.get(i10);
                oqVar.addRect(AndroidUtilities.lerp(rect.left - f9, ki0Var.a, d), AndroidUtilities.lerp(ki0Var.e ? rect.top - f10 : ki0Var.g, ki0Var.c, d), AndroidUtilities.lerp(rect.right - f9, ki0Var.b, d), AndroidUtilities.lerp(ki0Var.f ? rect.bottom - f10 : ki0Var.h, ki0Var.d, d), Path.Direction.CW);
                i10++;
            }
            oqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(oqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public li0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new oq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = s1Var;
        final int i11 = 1;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ji0
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
        }, 350L, 420L, jr.h);
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
    public li0(org.telegram.ui.Cells.s1 s1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f9) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new oq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = null;
        this.k = new d6(0.0f, new ii0(0, s1Var, viewParent), 350L, 420L, jr.h);
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
                float f10 = -f9;
                this.n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.n = f10 + AndroidUtilities.dp(10.0f);
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
            ki0 ki0Var = (ki0) this.l.get(0);
            ki0 ki0Var2 = (ki0) j7.l1.i(1, this.l);
            ki0Var.e = true;
            ki0Var.c -= AndroidUtilities.dp(0.66f);
            ki0Var2.f = true;
            ki0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
