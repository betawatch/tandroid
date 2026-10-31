package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class u51 extends tk0 {
    public s4.a0 e3;
    public final p51 f3;
    public s4.x g3;
    public boolean h3;
    public boolean i3;
    public boolean j3;
    public s4.c1 k3;
    public boolean l3;

    public u51(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var) {
        this(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getClassGuid(), false, j20Var, o20Var, p20Var, k2Var.getResourceProvider());
    }

    public final int A1(int i10) {
        int i11 = 0;
        while (true) {
            p51 p51Var = this.f3;
            if (i11 >= p51Var.D.size()) {
                return -1;
            }
            a51 G = p51Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View B1(int i10) {
        int i11 = 0;
        while (true) {
            p51 p51Var = this.f3;
            if (i11 >= p51Var.D.size()) {
                i11 = -1;
                break;
            }
            a51 G = p51Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return T0(i11);
    }

    public final View C1(Object obj) {
        int i10 = 0;
        while (true) {
            p51 p51Var = this.f3;
            if (i10 >= p51Var.D.size()) {
                i10 = -1;
                break;
            }
            a51 G = p51Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return T0(i10);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(org.telegram.messenger.j20 j20Var, boolean z10) {
        this.i3 = z10;
        s4.x xVar = new s4.x(new org.telegram.ui.ja(this, 6));
        this.g3 = xVar;
        xVar.h(this);
        this.f3.M = j20Var;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            p51 p51Var = this.f3;
            ArrayList arrayList = p51Var.G;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m51 m51Var = (m51) arrayList.get(i10);
                int i11 = m51Var.b;
                if (i11 >= 0) {
                    int i12 = m51Var.a;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(p51Var.n ? org.telegram.ui.ActionBar.t6.h5 : org.telegram.ui.ActionBar.t6.d6, p51Var.x);
                    if (i11 >= i12 && i12 >= 0 && i11 >= 0) {
                        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i14 = TLObject.FLAG_31;
                        for (int i15 = 0; i15 < getChildCount(); i15++) {
                            View childAt = getChildAt(i15);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i12 && R <= i11) {
                                    i13 = Math.min(top, i13);
                                    i14 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i14);
                                }
                            }
                        }
                        if (i13 < i14) {
                            if (this.s2 == null) {
                                this.s2 = new Paint(1);
                            }
                            this.s2.setColor(w02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.a0 a0Var = this.e3;
        if (a0Var instanceof yy) {
            return ((yy) a0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void s1(int i10, float f7, boolean z10) {
        t1(new di(this, 3), new org.telegram.ui.zh(5), i10, f7, z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.l3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.a0 a0Var = this.e3;
        if (a0Var instanceof yy) {
            ((yy) a0Var).y1(i10);
            return;
        }
        if (a0Var == null || i10 == -1) {
            return;
        }
        getContext();
        s51 s51Var = new s51(this, i10, 1);
        s51Var.O = new sr0(this, s51Var, 2);
        this.e3 = s51Var;
        setLayoutManager(s51Var);
    }

    public final void z1(boolean z10) {
        if (this.j3 == z10) {
            return;
        }
        this.j3 = z10;
        this.f3.N = z10;
        org.telegram.messenger.i0.d0(this, new r2(this, 12));
    }

    public u51(Context context, int i10, int i11, boolean z10, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, i10, i11, z10, j20Var, o20Var, p20Var, p6Var, -1, 1);
    }

    public u51(Context context, int i10, int i11, boolean z10, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12, int i13) {
        super(context, p6Var);
        this.l3 = true;
        if (i12 == -1) {
            org.telegram.ui.br brVar = new org.telegram.ui.br(this, i13);
            this.e3 = brVar;
            setLayoutManager(brVar);
        } else {
            s51 s51Var = new s51(this, i12, 0);
            s51Var.O = new sr0(this, s51Var, 1);
            this.e3 = s51Var;
            setLayoutManager(s51Var);
        }
        p51 p51Var = new p51(this, context, i10, i11, z10, j20Var, p6Var);
        this.f3 = p51Var;
        setAdapter(p51Var);
        if (o20Var != null) {
            setOnItemClickListener(new f2(21, this, o20Var));
        }
        if (p20Var != null) {
            setOnItemLongClickListener(new f2(22, this, p20Var));
        }
        t51 t51Var = new t51(this);
        t51Var.m = false;
        t51Var.C = false;
        t51Var.o(gr.h);
        t51Var.n(350L);
        setItemAnimator(t51Var);
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1(s4.c1 c1Var) {
    }

    public void J1(s4.c1 c1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
