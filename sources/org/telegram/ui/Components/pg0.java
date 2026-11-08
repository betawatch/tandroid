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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pg0 extends Path {
    public final org.telegram.ui.Cells.q1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final aq j;
    public final w5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public og0 q;
    public final int r;
    public final org.telegram.ui.Cells.t9 s;
    public final int t;
    public final ArrayList u;

    public pg0(final org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new aq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i11 = 0;
        this.k = new w5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ng0
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

    public static void b(aq aqVar, og0 og0Var, float f10, float f11, Rect rect, float f12) {
        float x10 = og0Var.j != null ? r0.getX() - og0Var.k : 0.0f;
        float y10 = og0Var.j != null ? r2.getY() - og0Var.l : 0.0f;
        aqVar.addRect(org.telegram.messenger.g0.T1(rect.left - f10, og0Var.a + x10, f12), org.telegram.messenger.g0.T1(og0Var.e ? rect.top - f11 : og0Var.g + y10, og0Var.c + y10, f12), org.telegram.messenger.g0.T1(rect.right - f10, og0Var.b + x10, f12), org.telegram.messenger.g0.T1(og0Var.f ? rect.bottom - f11 : og0Var.h + y10, og0Var.d + y10, f12), Path.Direction.CW);
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
        og0 og0Var = new og0();
        og0Var.a = f16 - org.telegram.messenger.g0.L(3.0f);
        og0Var.b = f19 + org.telegram.messenger.g0.L(3.0f);
        og0Var.c = f18;
        og0Var.d = f13 + f17;
        og0Var.i = this.r;
        org.telegram.ui.Cells.t9 t9Var = this.s;
        og0Var.j = t9Var;
        if (t9Var != null) {
            og0Var.k = t9Var.getX();
            og0Var.l = t9Var.getY();
        }
        og0 og0Var2 = this.q;
        if (og0Var2 != null) {
            float f20 = og0Var2.d;
            og0Var2.h = (f20 + f18) / 2.0f;
            og0Var.g = (f20 + f18) / 2.0f;
        }
        this.l.add(og0Var);
        this.q = og0Var;
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
        boolean z9 = this.f;
        aq aqVar = this.j;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        Paint paint = this.i;
        if (z9) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            aqVar.rewind();
            int V1 = q1Var.V1(this.g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(V1), q1Var.getBackgroundDrawableRight(), q1Var.T1(V1));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            aqVar.addRect(rectF, Path.Direction.CW);
            aqVar.a();
        } else if (this.e) {
            int W12 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            aqVar.rewind();
            int b22 = q1Var.b2(-this.c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(b22), q1Var.getBackgroundDrawableRight(), q1Var.T1(b22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            aqVar.addRect(rectF2, Path.Direction.CW);
            aqVar.a();
        } else {
            int i10 = this.t;
            ArrayList arrayList2 = this.l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                aq aqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i12 >= size) {
                        break;
                    }
                    og0 og0Var = (og0) arrayList2.get(i12);
                    if (aqVar2 == null || og0Var.e) {
                        if (aqVar2 != null) {
                            aqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new aq());
                        }
                        aqVar2 = (aq) arrayList.get(i11);
                        aqVar2.rewind();
                    }
                    aq aqVar3 = aqVar2;
                    b(aqVar3, og0Var, f10, f11, rect2, e10);
                    aqVar2 = aqVar3;
                    i12++;
                }
                if (aqVar2 != null) {
                    aqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f10, rect2.top - f11, rect2.right - f10, rect2.bottom - f11, (int) (alpha * f12), 31);
                paint.setAlpha(org.telegram.messenger.qs.e4);
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
            aqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(aqVar, (og0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            aqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(aqVar, paint);
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
            og0 og0Var = (og0) arrayList.get(i7);
            if (i7 == 0 || ((og0) arrayList.get(i7 - 1)).i != og0Var.i) {
                og0Var.e = true;
                og0Var.c -= org.telegram.messenger.g0.L(0.66f);
            }
            if (i7 == arrayList.size() - 1 || ((og0) arrayList.get(i7 + 1)).i != og0Var.i) {
                og0Var.f = true;
                og0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public pg0(final org.telegram.ui.Cells.q1 q1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new aq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i10 = 1;
        this.k = new w5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ng0
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

    public pg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new aq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 0;
        this.k = new w5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.mg0
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
        boolean z9 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i14);
            if (fjVar != null && i10 <= fjVar.r && i11 >= (i12 = fjVar.n)) {
                int max = Math.max(0, i10 - i12);
                int i15 = fjVar.n;
                int min = Math.min(i11 - i15, fjVar.r - i15);
                float f11 = -f10;
                this.n = f11;
                if (fjVar.H && !fjVar.I) {
                    this.n = f11 + (fjVar.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.o = fjVar.o(arrayList) + fjVar.f;
                this.p = fjVar.I ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z9 = z9 || org.telegram.messenger.g0.L1(fjVar.e.getText());
                if (z9) {
                    fjVar.e.getSelectionPath(max, min, this);
                } else {
                    e(fjVar.e, max, min);
                }
                if (fjVar.J && fjVar.f()) {
                    this.m.add(Integer.valueOf(fjVar.c));
                }
            }
        }
        d();
    }

    public pg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, org.telegram.messenger.kv kvVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new aq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i12 = 1;
        this.k = new w5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.mg0
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
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = false;
        this.f = false;
        if (kvVar == null) {
            return;
        }
        ArrayList arrayList = kvVar.n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i13);
            Layout a10 = t9Var == null ? null : t9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) kvVar.o.get(i13)).intValue();
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
