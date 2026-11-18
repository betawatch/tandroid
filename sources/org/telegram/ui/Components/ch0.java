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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ch0 extends Path {
    public final org.telegram.ui.Cells.q1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final pq j;
    public final c6 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public bh0 q;
    public final int r;
    public final org.telegram.ui.Cells.t9 s;
    public final int t;
    public final ArrayList u;

    public ch0(final org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i11 = 0;
        this.k = new c6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ah0
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
        }, 350L, 420L, lr.h);
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

    public static void b(pq pqVar, bh0 bh0Var, float f10, float f11, Rect rect, float f12) {
        float x10 = bh0Var.j != null ? r0.getX() - bh0Var.k : 0.0f;
        float y10 = bh0Var.j != null ? r2.getY() - bh0Var.l : 0.0f;
        pqVar.addRect(org.telegram.messenger.g0.T1(rect.left - f10, bh0Var.a + x10, f12), org.telegram.messenger.g0.T1(bh0Var.e ? rect.top - f11 : bh0Var.g + y10, bh0Var.c + y10, f12), org.telegram.messenger.g0.T1(rect.right - f10, bh0Var.b + x10, f12), org.telegram.messenger.g0.T1(bh0Var.f ? rect.bottom - f11 : bh0Var.h + y10, bh0Var.d + y10, f12), Path.Direction.CW);
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
        bh0 bh0Var = new bh0();
        bh0Var.a = f16 - org.telegram.messenger.g0.L(3.0f);
        bh0Var.b = f19 + org.telegram.messenger.g0.L(3.0f);
        bh0Var.c = f18;
        bh0Var.d = f13 + f17;
        bh0Var.i = this.r;
        org.telegram.ui.Cells.t9 t9Var = this.s;
        bh0Var.j = t9Var;
        if (t9Var != null) {
            bh0Var.k = t9Var.getX();
            bh0Var.l = t9Var.getY();
        }
        bh0 bh0Var2 = this.q;
        if (bh0Var2 != null) {
            float f20 = bh0Var2.d;
            bh0Var2.h = (f20 + f18) / 2.0f;
            bh0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(bh0Var);
        this.q = bh0Var;
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
        pq pqVar = this.j;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        Paint paint = this.i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            pqVar.rewind();
            int W12 = q1Var.W1(this.g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(W12), q1Var.getBackgroundDrawableRight(), q1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            pqVar.addRect(rectF, Path.Direction.CW);
            pqVar.a();
        } else if (this.e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            pqVar.rewind();
            int c22 = q1Var.c2(-this.c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(c22), q1Var.getBackgroundDrawableRight(), q1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            pqVar.addRect(rectF2, Path.Direction.CW);
            pqVar.a();
        } else {
            int i10 = this.t;
            ArrayList arrayList2 = this.l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                pq pqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i12 >= size) {
                        break;
                    }
                    bh0 bh0Var = (bh0) arrayList2.get(i12);
                    if (pqVar2 == null || bh0Var.e) {
                        if (pqVar2 != null) {
                            pqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new pq());
                        }
                        pqVar2 = (pq) arrayList.get(i11);
                        pqVar2.rewind();
                    }
                    pq pqVar3 = pqVar2;
                    b(pqVar3, bh0Var, f10, f11, rect2, e10);
                    pqVar2 = pqVar3;
                    i12++;
                }
                if (pqVar2 != null) {
                    pqVar2.a();
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
            pqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(pqVar, (bh0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            pqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(pqVar, paint);
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
            bh0 bh0Var = (bh0) arrayList.get(i7);
            if (i7 == 0 || ((bh0) arrayList.get(i7 - 1)).i != bh0Var.i) {
                bh0Var.e = true;
                bh0Var.c -= org.telegram.messenger.g0.L(0.66f);
            }
            if (i7 == arrayList.size() - 1 || ((bh0) arrayList.get(i7 + 1)).i != bh0Var.i) {
                bh0Var.f = true;
                bh0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public ch0(final org.telegram.ui.Cells.q1 q1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i10 = 1;
        this.k = new c6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ah0
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
        }, 350L, 420L, lr.h);
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

    public ch0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 0;
        this.k = new c6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.zg0
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
        }, 350L, 420L, lr.h);
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

    public ch0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, org.telegram.messenger.ev evVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new pq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i12 = 1;
        this.k = new c6(0.0f, new Runnable() { // from class: org.telegram.ui.Components.zg0
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
        }, 350L, 420L, lr.h);
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
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i13);
            Layout a10 = t9Var == null ? null : t9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) evVar.o.get(i13)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.n = t9Var.getX();
                    this.o = t9Var.getY();
                    this.s = t9Var;
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
