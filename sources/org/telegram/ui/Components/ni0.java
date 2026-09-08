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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ni0 extends Path {
    public final org.telegram.ui.Cells.t1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final tq j;
    public final e6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public mi0 q;

    public ni0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new tq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i12 = 0;
        this.k = new e6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.li0
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
        }, 350L, 420L, pr.h);
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

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.n;
        float f15 = max + f14;
        float f16 = this.o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        mi0 mi0Var = new mi0();
        mi0Var.a = f15 - AndroidUtilities.dp(3.0f);
        mi0Var.b = f18 + AndroidUtilities.dp(3.0f);
        mi0Var.c = f17;
        mi0Var.d = f12 + f16;
        mi0 mi0Var2 = this.q;
        if (mi0Var2 != null) {
            float f19 = mi0Var2.d;
            mi0Var2.h = (f19 + f17) / 2.0f;
            mi0Var.g = (f19 + f17) / 2.0f;
        }
        this.l.add(mi0Var);
        this.q = mi0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        int i10 = 0;
        float d = this.k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f;
        Paint paint = this.i;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        tq tqVar = this.j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            tqVar.rewind();
            int I2 = t1Var.I2(this.g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            tqVar.addRect(rectF, Path.Direction.CW);
            tqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            tqVar.rewind();
            int O2 = t1Var.O2(-this.c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            tqVar.addRect(rectF2, Path.Direction.CW);
            tqVar.a();
        } else {
            canvas.translate(f7, f10);
            tqVar.rewind();
            while (true) {
                ArrayList arrayList = this.l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                mi0 mi0Var = (mi0) arrayList.get(i10);
                tqVar.addRect(AndroidUtilities.lerp(rect.left - f7, mi0Var.a, d), AndroidUtilities.lerp(mi0Var.e ? rect.top - f10 : mi0Var.g, mi0Var.c, d), AndroidUtilities.lerp(rect.right - f7, mi0Var.b, d), AndroidUtilities.lerp(mi0Var.f ? rect.bottom - f10 : mi0Var.h, mi0Var.d, d), Path.Direction.CW);
                i10++;
            }
            tqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(tqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ni0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new tq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = t1Var;
        final int i11 = 1;
        this.k = new e6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.li0
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
        }, 350L, 420L, pr.h);
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
    public ni0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new tq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = null;
        this.k = new e6(0.0f, new zu(27, t1Var, viewParent), 350L, 420L, pr.h);
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
                float f10 = -f7;
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
            mi0 mi0Var = (mi0) this.l.get(0);
            mi0 mi0Var2 = (mi0) i2.g.h(1, this.l);
            mi0Var.e = true;
            mi0Var.c -= AndroidUtilities.dp(0.66f);
            mi0Var2.f = true;
            mi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
