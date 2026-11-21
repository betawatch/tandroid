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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class eh0 extends Path {
    public final org.telegram.ui.Cells.r1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final rq j;
    public final d6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public dh0 q;
    public final int r;
    public final org.telegram.ui.Cells.u9 s;
    public final int t;
    public final ArrayList u;

    public eh0(final org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new rq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = r1Var;
        final int i11 = 0;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ch0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
                        if (r1Var2 != null) {
                            r1Var2.invalidate();
                        }
                        if (r1Var2.getParent() instanceof View) {
                            ((View) r1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.r1 r1Var3 = r1Var;
                        if (r1Var3 != null) {
                            r1Var3.invalidate();
                        }
                        if (r1Var3.getParent() instanceof View) {
                            ((View) r1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, nr.h);
        this.b = i7;
        int i12 = -i10;
        this.c = i12;
        this.d = i12;
        this.e = true;
        this.f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(rq rqVar, dh0 dh0Var, float f10, float f11, Rect rect, float f12) {
        float x10 = dh0Var.j != null ? r0.getX() - dh0Var.k : 0.0f;
        float y10 = dh0Var.j != null ? r2.getY() - dh0Var.l : 0.0f;
        rqVar.addRect(org.telegram.messenger.g0.T1(rect.left - f10, dh0Var.a + x10, f12), org.telegram.messenger.g0.T1(dh0Var.e ? rect.top - f11 : dh0Var.g + y10, dh0Var.c + y10, f12), org.telegram.messenger.g0.T1(rect.right - f10, dh0Var.b + x10, f12), org.telegram.messenger.g0.T1(dh0Var.f ? rect.bottom - f11 : dh0Var.h + y10, dh0Var.d + y10, f12), Path.Direction.CW);
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
        dh0 dh0Var = new dh0();
        dh0Var.a = f16 - org.telegram.messenger.g0.L(3.0f);
        dh0Var.b = f19 + org.telegram.messenger.g0.L(3.0f);
        dh0Var.c = f18;
        dh0Var.d = f13 + f17;
        dh0Var.i = this.r;
        org.telegram.ui.Cells.u9 u9Var = this.s;
        dh0Var.j = u9Var;
        if (u9Var != null) {
            dh0Var.k = u9Var.getX();
            dh0Var.l = u9Var.getY();
        }
        dh0 dh0Var2 = this.q;
        if (dh0Var2 != null) {
            float f20 = dh0Var2.d;
            dh0Var2.h = (f20 + f18) / 2.0f;
            dh0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(dh0Var);
        this.q = dh0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f;
        rq rqVar = this.j;
        org.telegram.ui.Cells.r1 r1Var = this.a;
        Paint paint = this.i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            rqVar.rewind();
            int W12 = r1Var.W1(this.g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(W12), r1Var.getBackgroundDrawableRight(), r1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            rqVar.addRect(rectF, Path.Direction.CW);
            rqVar.a();
        } else if (this.e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            rqVar.rewind();
            int c22 = r1Var.c2(-this.c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(c22), r1Var.getBackgroundDrawableRight(), r1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            rqVar.addRect(rectF2, Path.Direction.CW);
            rqVar.a();
        } else {
            int i10 = this.t;
            ArrayList arrayList2 = this.l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                rq rqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i12 >= size) {
                        break;
                    }
                    dh0 dh0Var = (dh0) arrayList2.get(i12);
                    if (rqVar2 == null || dh0Var.e) {
                        if (rqVar2 != null) {
                            rqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new rq());
                        }
                        rqVar2 = (rq) arrayList.get(i11);
                        rqVar2.rewind();
                    }
                    rq rqVar3 = rqVar2;
                    b(rqVar3, dh0Var, f10, f11, rect2, e10);
                    rqVar2 = rqVar3;
                    i12++;
                }
                if (rqVar2 != null) {
                    rqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f10, rect2.top - f11, rect2.right - f10, rect2.bottom - f11, (int) (alpha * f12), 31);
                paint.setAlpha(org.telegram.messenger.ks.e4);
                while (i7 <= i11) {
                    canvas.drawPath((Path) arrayList.get(i7), paint);
                    i7++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f10, f11);
            rqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(rqVar, (dh0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            rqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(rqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i7 >= arrayList.size()) {
                return;
            }
            dh0 dh0Var = (dh0) arrayList.get(i7);
            if (i7 == 0 || ((dh0) arrayList.get(i7 - 1)).i != dh0Var.i) {
                dh0Var.e = true;
                dh0Var.c -= org.telegram.messenger.g0.L(0.66f);
            }
            if (i7 == arrayList.size() - 1 || ((dh0) arrayList.get(i7 + 1)).i != dh0Var.i) {
                dh0Var.f = true;
                dh0Var.d += org.telegram.messenger.g0.L(0.66f);
            }
            i7++;
        }
    }

    public final void e(Layout layout, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        if (i10 < i7) {
            i10 = i7;
            i7 = i10;
        }
        int lineForOffset = layout.getLineForOffset(i7);
        int lineForOffset2 = layout.getLineForOffset(i10);
        int i11 = lineForOffset;
        while (i11 <= lineForOffset2) {
            int lineStart = layout.getLineStart(i11);
            int lineEnd = layout.getLineEnd(i11);
            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                float lineLeft = (i11 != lineForOffset || i7 <= lineStart) ? layout.getLineLeft(i11) : layout.getPrimaryHorizontal(i7);
                float lineRight = (i11 != lineForOffset2 || i10 >= lineEnd) ? layout.getLineRight(i11) : layout.getPrimaryHorizontal(i10);
                a(Math.min(lineLeft, lineRight), layout.getLineTop(i11), Math.max(lineLeft, lineRight), layout.getLineBottom(i11));
            }
            i11++;
        }
    }

    public eh0(final org.telegram.ui.Cells.r1 r1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new rq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = r1Var;
        final int i10 = 1;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ch0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
                        if (r1Var2 != null) {
                            r1Var2.invalidate();
                        }
                        if (r1Var2.getParent() instanceof View) {
                            ((View) r1Var2.getParent()).invalidate();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.r1 r1Var3 = r1Var;
                        if (r1Var3 != null) {
                            r1Var3.invalidate();
                        }
                        if (r1Var3.getParent() instanceof View) {
                            ((View) r1Var3.getParent()).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, nr.h);
        this.b = i7;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public eh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new rq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 0;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.bh0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        r1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        r1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, nr.h);
        this.b = i7;
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
            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i14);
            if (cjVar != null && i10 <= cjVar.r && i11 >= (i12 = cjVar.n)) {
                int max = Math.max(0, i10 - i12);
                int i15 = cjVar.n;
                int min = Math.min(i11 - i15, cjVar.r - i15);
                float f11 = -f10;
                this.n = f11;
                if (cjVar.I && !cjVar.J) {
                    this.n = f11 + (cjVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.o = cjVar.o(arrayList) + cjVar.f;
                this.p = cjVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(cjVar.e.getText());
                if (z10) {
                    cjVar.e.getSelectionPath(max, min, this);
                } else {
                    e(cjVar.e, max, min);
                }
                if (cjVar.K && cjVar.f()) {
                    this.m.add(Integer.valueOf(cjVar.c));
                }
            }
        }
        d();
    }

    public eh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, org.telegram.messenger.ev evVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new rq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i12 = 1;
        this.k = new d6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.bh0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        r1Var.invalidate();
                        Object obj = viewParent;
                        if (obj instanceof View) {
                            ((View) obj).invalidate();
                            break;
                        }
                        break;
                    default:
                        r1Var.invalidate();
                        Object obj2 = viewParent;
                        if (obj2 instanceof View) {
                            ((View) obj2).invalidate();
                            break;
                        }
                        break;
                }
            }
        }, 350L, 420L, nr.h);
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = false;
        this.f = false;
        if (evVar == null) {
            return;
        }
        ArrayList arrayList = evVar.n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i13);
            Layout a10 = u9Var == null ? null : u9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) evVar.o.get(i13)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.n = u9Var.getX();
                    this.o = u9Var.getY();
                    this.s = u9Var;
                    this.q = null;
                    int size = this.l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
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
