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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sh0 extends Path {
    public final org.telegram.ui.Cells.q1 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final jq j;
    public final t5 k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public rh0 q;
    public final int r;
    public final org.telegram.ui.Cells.u9 s;
    public final int t;
    public final ArrayList u;

    public sh0(final org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i12 = 0;
        this.k = new t5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.qh0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
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
        }, 350L, 420L, gr.h);
        this.b = i10;
        int i13 = -i11;
        this.c = i13;
        this.d = i13;
        this.e = true;
        this.f = false;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(jq jqVar, rh0 rh0Var, float f7, float f10, Rect rect, float f11) {
        float x10 = rh0Var.j != null ? r0.getX() - rh0Var.k : 0.0f;
        float y3 = rh0Var.j != null ? r2.getY() - rh0Var.l : 0.0f;
        jqVar.addRect(org.telegram.messenger.i0.T1(rect.left - f7, rh0Var.a + x10, f11), org.telegram.messenger.i0.T1(rh0Var.e ? rect.top - f10 : rh0Var.g + y3, rh0Var.c + y3, f11), org.telegram.messenger.i0.T1(rect.right - f7, rh0Var.b + x10, f11), org.telegram.messenger.i0.T1(rh0Var.f ? rect.bottom - f10 : rh0Var.h + y3, rh0Var.d + y3, f11), Path.Direction.CW);
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
        rh0 rh0Var = new rh0();
        rh0Var.a = f15 - org.telegram.messenger.i0.L(3.0f);
        rh0Var.b = f18 + org.telegram.messenger.i0.L(3.0f);
        rh0Var.c = f17;
        rh0Var.d = f12 + f16;
        rh0Var.i = this.r;
        org.telegram.ui.Cells.u9 u9Var = this.s;
        rh0Var.j = u9Var;
        if (u9Var != null) {
            rh0Var.k = u9Var.getX();
            rh0Var.l = u9Var.getY();
        }
        rh0 rh0Var2 = this.q;
        if (rh0Var2 != null) {
            float f19 = rh0Var2.d;
            rh0Var2.h = (f19 + f17) / 2.0f;
            rh0Var.g = (f19 + f17) / 2.0f;
        }
        this.l.add(rh0Var);
        this.q = rh0Var;
    }

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f;
        jq jqVar = this.j;
        org.telegram.ui.Cells.q1 q1Var = this.a;
        Paint paint = this.i;
        if (z10) {
            int W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            jqVar.rewind();
            int T1 = q1Var.T1(this.g);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.S1(T1), q1Var.getBackgroundDrawableRight(), q1Var.R1(T1));
            org.telegram.messenger.i0.Y1(rect2, rectF, e, rectF);
            jqVar.addRect(rectF, Path.Direction.CW);
            jqVar.a();
        } else if (this.e) {
            int W12 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            jqVar.rewind();
            int Z1 = q1Var.Z1(-this.c);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.S1(Z1), q1Var.getBackgroundDrawableRight(), q1Var.R1(Z1));
            org.telegram.messenger.i0.Y1(rect2, rectF2, e, rectF2);
            jqVar.addRect(rectF2, Path.Direction.CW);
            jqVar.a();
        } else {
            int i11 = this.t;
            ArrayList arrayList2 = this.l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                jq jqVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i13 >= size) {
                        break;
                    }
                    rh0 rh0Var = (rh0) arrayList2.get(i13);
                    if (jqVar2 == null || rh0Var.e) {
                        if (jqVar2 != null) {
                            jqVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new jq());
                        }
                        jqVar2 = (jq) arrayList.get(i12);
                        jqVar2.rewind();
                    }
                    jq jqVar3 = jqVar2;
                    b(jqVar3, rh0Var, f7, f10, rect2, e);
                    jqVar2 = jqVar3;
                    i13++;
                }
                if (jqVar2 != null) {
                    jqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f7, rect2.top - f10, rect2.right - f7, rect2.bottom - f10, (int) (alpha * f11), 31);
                paint.setAlpha(org.telegram.messenger.at.e4);
                while (i10 <= i12) {
                    canvas.drawPath((Path) arrayList.get(i10), paint);
                    i10++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f7, f10);
            jqVar.rewind();
            while (i10 < arrayList2.size()) {
                b(jqVar, (rh0) arrayList2.get(i10), f7, f10, rect2, e);
                i10++;
                rect2 = rect;
            }
            jqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(jqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                return;
            }
            rh0 rh0Var = (rh0) arrayList.get(i10);
            if (i10 == 0 || ((rh0) arrayList.get(i10 - 1)).i != rh0Var.i) {
                rh0Var.e = true;
                rh0Var.c -= org.telegram.messenger.i0.L(0.66f);
            }
            if (i10 == arrayList.size() - 1 || ((rh0) arrayList.get(i10 + 1)).i != rh0Var.i) {
                rh0Var.f = true;
                rh0Var.d += org.telegram.messenger.i0.L(0.66f);
            }
            i10++;
        }
    }

    public final void e(Layout layout, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 < i10) {
            i11 = i10;
            i10 = i11;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineForOffset2 = layout.getLineForOffset(i11);
        int i12 = lineForOffset;
        while (i12 <= lineForOffset2) {
            int lineStart = layout.getLineStart(i12);
            int lineEnd = layout.getLineEnd(i12);
            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                float lineLeft = (i12 != lineForOffset || i10 <= lineStart) ? layout.getLineLeft(i12) : layout.getPrimaryHorizontal(i10);
                float lineRight = (i12 != lineForOffset2 || i11 >= lineEnd) ? layout.getLineRight(i12) : layout.getPrimaryHorizontal(i11);
                a(Math.min(lineLeft, lineRight), layout.getLineTop(i12), Math.max(lineLeft, lineRight), layout.getLineBottom(i12));
            }
            i12++;
        }
    }

    public sh0(final org.telegram.ui.Cells.q1 q1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = q1Var;
        final int i11 = 1;
        this.k = new t5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.qh0
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
        }, 350L, 420L, gr.h);
        this.b = i10;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public sh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i14 = 0;
        this.k = new t5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ph0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
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
        }, 350L, 420L, gr.h);
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            org.telegram.messenger.hj hjVar = (org.telegram.messenger.hj) arrayList.get(i15);
            if (hjVar != null && i11 <= hjVar.r && i12 >= (i13 = hjVar.n)) {
                int max = Math.max(0, i11 - i13);
                int i16 = hjVar.n;
                int min = Math.min(i12 - i16, hjVar.r - i16);
                float f10 = -f7;
                this.n = f10;
                if (hjVar.H && !hjVar.I) {
                    this.n = f10 + (hjVar.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(10.0f));
                }
                this.o = hjVar.o(arrayList) + hjVar.f;
                this.p = hjVar.I ? org.telegram.messenger.i0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.i0.L1(hjVar.e.getText());
                if (z10) {
                    hjVar.e.getSelectionPath(max, min, this);
                } else {
                    e(hjVar.e, max, min);
                }
                if (hjVar.J && hjVar.f()) {
                    this.m.add(Integer.valueOf(hjVar.c));
                }
            }
        }
        d();
    }

    public sh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, org.telegram.messenger.wv wvVar, int i11, int i12) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jq();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        final int i13 = 1;
        this.k = new t5(0.0f, new Runnable() { // from class: org.telegram.ui.Components.ph0
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
        }, 350L, 420L, gr.h);
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = false;
        this.f = false;
        if (wvVar == null) {
            return;
        }
        ArrayList arrayList = wvVar.n;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i14);
            Layout a2 = u9Var == null ? null : u9Var.a();
            if (a2 != null && a2.getText() != null) {
                int intValue = ((Integer) wvVar.o.get(i14)).intValue();
                int length = a2.getText().length();
                int j10 = Utilities.j(i11 - intValue, length, 0);
                int j11 = Utilities.j(i12 - intValue, length, 0);
                if (j10 < j11) {
                    this.n = u9Var.getX();
                    this.o = u9Var.getY();
                    this.s = u9Var;
                    this.q = null;
                    int size = this.l.size();
                    if (org.telegram.messenger.i0.L1(a2.getText())) {
                        a2.getSelectionPath(j10, j11, this);
                    } else {
                        e(a2, j10, j11);
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
