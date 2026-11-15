package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class u41 extends uj0 {
    public v4.b0 f3;
    public final p41 g3;
    public v4.y h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public v4.e1 l3;
    public boolean m3;

    public u41(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var) {
        this(e2Var.getContext(), e2Var.getCurrentAccount(), e2Var.getClassGuid(), false, s10Var, x10Var, y10Var, e2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            p41 p41Var = this.g3;
            if (i10 >= p41Var.E.size()) {
                return -1;
            }
            b41 G = p41Var.G(i10);
            if (G != null && G.d == i7) {
                return i10;
            }
            i10++;
        }
    }

    public final View B1(int i7) {
        int i10 = 0;
        while (true) {
            p41 p41Var = this.g3;
            if (i10 >= p41Var.E.size()) {
                i10 = -1;
                break;
            }
            b41 G = p41Var.G(i10);
            if (G != null && G.d == i7) {
                break;
            }
            i10++;
        }
        return T0(i10);
    }

    public final View C1(Object obj) {
        int i7 = 0;
        while (true) {
            p41 p41Var = this.g3;
            if (i7 >= p41Var.E.size()) {
                i7 = -1;
                break;
            }
            b41 G = p41Var.G(i7);
            if (G != null && G.G == obj) {
                break;
            }
            i7++;
        }
        return T0(i7);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.s10 s10Var, boolean z10) {
        this.j3 = z10;
        v4.y yVar = new v4.y(new gi.c(this, 7));
        this.h3 = yVar;
        yVar.h(this);
        this.g3.N = s10Var;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            p41 p41Var = this.g3;
            ArrayList arrayList = p41Var.H;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                m41 m41Var = (m41) arrayList.get(i7);
                int i10 = m41Var.b;
                if (i10 >= 0) {
                    int i11 = m41Var.a;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(p41Var.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6, p41Var.x);
                    if (i10 >= i11 && i11 >= 0 && i10 >= 0) {
                        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i13 = TLObject.FLAG_31;
                        for (int i14 = 0; i14 < getChildCount(); i14++) {
                            View childAt = getChildAt(i14);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i11 && R <= i10) {
                                    i12 = Math.min(top, i12);
                                    i13 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i13);
                                }
                            }
                        }
                        if (i12 < i13) {
                            if (this.t2 == null) {
                                this.t2 = new Paint(1);
                            }
                            this.t2.setColor(w02);
                            canvas.drawRect(0.0f, i12, getWidth(), i13, this.t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.b0 b0Var = this.f3;
        if (b0Var instanceof oy) {
            return ((oy) b0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.uj0
    public final void s1(int i7, float f10, boolean z10) {
        t1(new mi(this, 3), new ci.x(8), i7, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.m3 = z10;
    }

    public void setSpanCount(int i7) {
        v4.b0 b0Var = this.f3;
        if (b0Var instanceof oy) {
            ((oy) b0Var).y1(i7);
            return;
        }
        if (b0Var == null || i7 == -1) {
            return;
        }
        getContext();
        s41 s41Var = new s41(this, i7, 1);
        s41Var.O = new tq0(this, s41Var, 2);
        this.f3 = s41Var;
        setLayoutManager(s41Var);
    }

    public final void z1(boolean z10) {
        if (this.k3 == z10) {
            return;
        }
        this.k3 = z10;
        this.g3.O = z10;
        org.telegram.messenger.g0.d0(this, new q2(this, 14));
    }

    public u41(Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, i10, z10, s10Var, x10Var, y10Var, e6Var, -1, 1);
    }

    public u41(Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, e6Var);
        this.m3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            s41 s41Var = new s41(this, i11, 0);
            s41Var.O = new tq0(this, s41Var, 1);
            this.f3 = s41Var;
            setLayoutManager(s41Var);
        }
        p41 p41Var = new p41(this, context, i7, i10, z10, s10Var, e6Var);
        this.g3 = p41Var;
        setAdapter(p41Var);
        if (x10Var != null) {
            setOnItemClickListener(new f1(24, this, x10Var));
        }
        if (y10Var != null) {
            setOnItemLongClickListener(new f1(25, this, y10Var));
        }
        t41 t41Var = new t41(this);
        t41Var.m = false;
        t41Var.C = false;
        t41Var.o(er.h);
        t41Var.n(350L);
        setItemAnimator(t41Var);
    }

    public void H1(v4.e1 e1Var) {
    }

    public void I1(v4.e1 e1Var) {
    }

    public void J1(v4.e1 e1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
