package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sg0 extends Path {
    public final org.telegram.ui.Cells.q1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final bq j;
    public final u5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public rg0 q;
    public final int r;
    public final org.telegram.ui.Cells.s9 s;
    public final int t;
    public final ArrayList u;

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new bq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i11 = 0;
        this.k = new u5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.qg0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
                        if (q1Var2 != null) {
                            q1Var2.invalidate();
                        }
                        if (q1Var2.getParent() instanceof View) {
                            ((View) q1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.q1 q1Var3 = q1Var;
                        if (q1Var3 != null) {
                            q1Var3.invalidate();
                        }
                        if (q1Var3.getParent() instanceof View) {
                            ((View) q1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, xq.h);
        this.b = i3;
        int i12 = -i10;
        this.c = i12;
        this.d = i12;
        this.e = true;
        this.f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(bq bqVar, rg0 rg0Var, float f10, float f11, Rect rect, float f12) {
        float x10 = rg0Var.j != null ? r0.getX() - rg0Var.k : 0.0f;
        float y9 = rg0Var.j != null ? r2.getY() - rg0Var.l : 0.0f;
        bqVar.addRect(org.telegram.messenger.g0.T1(rect.left - f10, rg0Var.a + x10, f12), org.telegram.messenger.g0.T1(rg0Var.e ? rect.top - f11 : rg0Var.g + y9, rg0Var.c + y9, f12), org.telegram.messenger.g0.T1(rect.right - f10, rg0Var.b + x10, f12), org.telegram.messenger.g0.T1(rg0Var.f ? rect.bottom - f11 : rg0Var.h + y9, rg0Var.d + y9, f12), Path.Direction.CW);
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
        rg0 rg0Var = new rg0();
        rg0Var.a = f16 - org.telegram.messenger.g0.L(3.0f);
        rg0Var.b = f19 + org.telegram.messenger.g0.L(3.0f);
        rg0Var.c = f18;
        rg0Var.d = f13 + f17;
        rg0Var.i = this.r;
        org.telegram.ui.Cells.s9 s9Var = this.s;
        rg0Var.j = s9Var;
        if (s9Var != null) {
            rg0Var.k = s9Var.getX();
            rg0Var.l = s9Var.getY();
        }
        rg0 rg0Var2 = this.q;
        if (rg0Var2 != null) {
            float f20 = rg0Var2.d;
            rg0Var2.h = (f20 + f18) / 2.0f;
            rg0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(rg0Var);
        this.q = rg0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i3 = 0;
        float e10 = this.k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f;
        bq bqVar = this.j;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        Paint paint = this.i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            bqVar.rewind();
            int V1 = q1Var.V1(this.g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(V1), q1Var.getBackgroundDrawableRight(), q1Var.T1(V1));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            bqVar.addRect(rectF, Path.Direction.CW);
            bqVar.a();
        } else if (this.e) {
            int W12 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            bqVar.rewind();
            int b22 = q1Var.b2(-this.c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(b22), q1Var.getBackgroundDrawableRight(), q1Var.T1(b22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            bqVar.addRect(rectF2, Path.Direction.CW);
            bqVar.a();
        } else {
            int i10 = this.t;
            ArrayList arrayList2 = this.l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                bq bqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i12 >= size) {
                        break;
                    }
                    rg0 rg0Var = (rg0) arrayList2.get(i12);
                    if (bqVar2 == null || rg0Var.e) {
                        if (bqVar2 != null) {
                            bqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new bq());
                        }
                        bqVar2 = (bq) arrayList.get(i11);
                        bqVar2.rewind();
                    }
                    bq bqVar3 = bqVar2;
                    b(bqVar3, rg0Var, f10, f11, rect2, e10);
                    bqVar2 = bqVar3;
                    i12++;
                }
                if (bqVar2 != null) {
                    bqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f10, rect2.top - f11, rect2.right - f10, rect2.bottom - f11, (int) (alpha * f12), 31);
                paint.setAlpha(org.telegram.messenger.hs.e4);
                while (i3 <= i11) {
                    canvas.drawPath((Path) arrayList.get(i3), paint);
                    i3++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f10, f11);
            bqVar.rewind();
            while (i3 < arrayList2.size()) {
                b(bqVar, (rg0) arrayList2.get(i3), f10, f11, rect2, e10);
                i3++;
                rect2 = rect;
            }
            bqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(bqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return;
            }
            rg0 rg0Var = (rg0) arrayList.get(i3);
            if (i3 == 0 || ((rg0) arrayList.get(i3 - 1)).i != rg0Var.i) {
                rg0Var.e = true;
                rg0Var.c -= org.telegram.messenger.g0.L(0.66f);
            }
            if (i3 == arrayList.size() - 1 || ((rg0) arrayList.get(i3 + 1)).i != rg0Var.i) {
                rg0Var.f = true;
                rg0Var.d += org.telegram.messenger.g0.L(0.66f);
            }
            i3++;
        }
    }

    public final void e(Layout layout, int i3, int i10) {
        if (i3 == i10) {
            return;
        }
        if (i10 < i3) {
            i10 = i3;
            i3 = i10;
        }
        int lineForOffset = layout.getLineForOffset(i3);
        int lineForOffset2 = layout.getLineForOffset(i10);
        int i11 = lineForOffset;
        while (i11 <= lineForOffset2) {
            int lineStart = layout.getLineStart(i11);
            int lineEnd = layout.getLineEnd(i11);
            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                float lineLeft = (i11 != lineForOffset || i3 <= lineStart) ? layout.getLineLeft(i11) : layout.getPrimaryHorizontal(i3);
                float lineRight = (i11 != lineForOffset2 || i10 >= lineEnd) ? layout.getLineRight(i11) : layout.getPrimaryHorizontal(i10);
                a(Math.min(lineLeft, lineRight), layout.getLineTop(i11), Math.max(lineLeft, lineRight), layout.getLineBottom(i11));
            }
            i11++;
        }
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i3, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new bq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i10 = 1;
        this.k = new u5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.qg0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
                        if (q1Var2 != null) {
                            q1Var2.invalidate();
                        }
                        if (q1Var2.getParent() instanceof View) {
                            ((View) q1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.q1 q1Var3 = q1Var;
                        if (q1Var3 != null) {
                            q1Var3.invalidate();
                        }
                        if (q1Var3.getParent() instanceof View) {
                            ((View) q1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, xq.h);
        this.b = i3;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i3, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new bq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 0;
        this.k = new u5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.pg0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        q1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        q1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, xq.h);
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i14);
            if (wiVar != null && i10 <= wiVar.r && i11 >= (i12 = wiVar.n)) {
                int max = Math.max(0, i10 - i12);
                int i15 = wiVar.n;
                int min = Math.min(i11 - i15, wiVar.r - i15);
                float f11 = -f10;
                this.n = f11;
                if (wiVar.I && !wiVar.J) {
                    this.n = f11 + (wiVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.o = wiVar.o(arrayList) + wiVar.f;
                this.p = wiVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(wiVar.e.getText());
                if (z10) {
                    wiVar.e.getSelectionPath(max, min, this);
                } else {
                    e(wiVar.e, max, min);
                }
                if (wiVar.K && wiVar.f()) {
                    this.m.add(Integer.valueOf(wiVar.c));
                }
            }
        }
        d();
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i3, org.telegram.messenger.cv cvVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new bq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i12 = 1;
        this.k = new u5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.pg0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        q1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        q1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, xq.h);
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = false;
        this.f = false;
        if (cvVar == null) {
            return;
        }
        ArrayList arrayList = cvVar.n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i13);
            Layout a10 = s9Var == null ? null : s9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) cvVar.o.get(i13)).intValue();
                int length = a10.getText().length();
                int j10 = Utilities.j(i10 - intValue, length, 0);
                int j11 = Utilities.j(i11 - intValue, length, 0);
                if (j10 < j11) {
                    this.n = s9Var.getX();
                    this.o = s9Var.getY();
                    this.s = s9Var;
                    this.q = null;
                    int size = this.l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j10, j11, this);
                    } else {
                        e(a10, j10, j11);
                    }
                    if (this.l.size() > size) {
                        this.r++;
                    }
                }
            }
        }
        this.t = Math.max(1, this.r);
        d();
    }
}
