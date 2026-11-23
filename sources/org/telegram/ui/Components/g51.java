package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class g51 extends ek0 {
    public v4.c0 f3;
    public final b51 g3;
    public v4.z h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public v4.f1 l3;
    public boolean m3;

    public g51(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var) {
        this(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getClassGuid(), false, p10Var, u10Var, v10Var, g2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            b51 b51Var = this.g3;
            if (i10 >= b51Var.E.size()) {
                return -1;
            }
            n41 G = b51Var.G(i10);
            if (G != null && G.d == i7) {
                return i10;
            }
            i10++;
        }
    }

    public final View B1(int i7) {
        int i10 = 0;
        while (true) {
            b51 b51Var = this.g3;
            if (i10 >= b51Var.E.size()) {
                i10 = -1;
                break;
            }
            n41 G = b51Var.G(i10);
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
            b51 b51Var = this.g3;
            if (i7 >= b51Var.E.size()) {
                i7 = -1;
                break;
            }
            n41 G = b51Var.G(i7);
            if (G != null && G.H == obj) {
                break;
            }
            i7++;
        }
        return T0(i7);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.p10 p10Var, boolean z10) {
        this.j3 = z10;
        v4.z zVar = new v4.z(new gi.c(this, 7));
        this.h3 = zVar;
        zVar.h(this);
        this.g3.N = p10Var;
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            b51 b51Var = this.g3;
            ArrayList arrayList = b51Var.H;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                y41 y41Var = (y41) arrayList.get(i7);
                int i10 = y41Var.b;
                if (i10 >= 0) {
                    int i11 = y41Var.a;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(b51Var.n ? org.telegram.ui.ActionBar.n6.h5 : org.telegram.ui.ActionBar.n6.d6, b51Var.x);
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
        v4.c0 c0Var = this.f3;
        if (c0Var instanceof ty) {
            return ((ty) c0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void s1(int i7, float f10, boolean z10) {
        t1(new vi(this, 3), new ci.y(8), i7, f10, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.m3 = z10;
    }

    public void setSpanCount(int i7) {
        v4.c0 c0Var = this.f3;
        if (c0Var instanceof ty) {
            ((ty) c0Var).y1(i7);
            return;
        }
        if (c0Var == null || i7 == -1) {
            return;
        }
        getContext();
        e51 e51Var = new e51(this, i7, 1);
        e51Var.O = new cr0(this, e51Var, 2);
        this.f3 = e51Var;
        setLayoutManager(e51Var);
    }

    public final void z1(boolean z10) {
        if (this.k3 == z10) {
            return;
        }
        this.k3 = z10;
        this.g3.O = z10;
        org.telegram.messenger.g0.d0(this, new y2(this, 14));
    }

    public g51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var, -1, 1);
    }

    public g51(Context context, int i7, int i10, boolean z10, org.telegram.messenger.p10 p10Var, org.telegram.messenger.u10 u10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i6Var);
        this.m3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.f3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            e51 e51Var = new e51(this, i11, 0);
            e51Var.O = new cr0(this, e51Var, 1);
            this.f3 = e51Var;
            setLayoutManager(e51Var);
        }
        b51 b51Var = new b51(this, context, i7, i10, z10, p10Var, i6Var);
        this.g3 = b51Var;
        setAdapter(b51Var);
        if (u10Var != null) {
            setOnItemClickListener(new g2(23, this, u10Var));
        }
        if (v10Var != null) {
            setOnItemLongClickListener(new g2(24, this, v10Var));
        }
        f51 f51Var = new f51(this);
        f51Var.m = false;
        f51Var.C = false;
        f51Var.o(kr.h);
        f51Var.n(350L);
        setItemAnimator(f51Var);
    }

    public void H1(v4.f1 f1Var) {
    }

    public void I1(v4.f1 f1Var) {
    }

    public void J1(v4.f1 f1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
