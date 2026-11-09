package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class r41 extends qj0 {
    public v4.b0 e3;
    public final m41 f3;
    public v4.y g3;
    public boolean h3;
    public boolean i3;
    public boolean j3;
    public v4.d1 k3;
    public boolean l3;

    public r41(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var) {
        this(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getClassGuid(), false, v10Var, a20Var, b20Var, f2Var.getResourceProvider());
    }

    public final int A1(int i7) {
        int i10 = 0;
        while (true) {
            m41 m41Var = this.f3;
            if (i10 >= m41Var.D.size()) {
                return -1;
            }
            y31 G = m41Var.G(i10);
            if (G != null && G.d == i7) {
                return i10;
            }
            i10++;
        }
    }

    public final View B1(int i7) {
        int i10 = 0;
        while (true) {
            m41 m41Var = this.f3;
            if (i10 >= m41Var.D.size()) {
                i10 = -1;
                break;
            }
            y31 G = m41Var.G(i10);
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
            m41 m41Var = this.f3;
            if (i7 >= m41Var.D.size()) {
                i7 = -1;
                break;
            }
            y31 G = m41Var.G(i7);
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

    public final void E1(org.telegram.messenger.v10 v10Var, boolean z9) {
        this.i3 = z9;
        v4.y yVar = new v4.y(new ei.d(this, 7));
        this.g3 = yVar;
        yVar.h(this);
        this.f3.M = v10Var;
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            m41 m41Var = this.f3;
            ArrayList arrayList = m41Var.G;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                j41 j41Var = (j41) arrayList.get(i7);
                int i10 = j41Var.b;
                if (i10 >= 0) {
                    int i11 = j41Var.a;
                    int w02 = org.telegram.ui.ActionBar.l6.w0(m41Var.n ? org.telegram.ui.ActionBar.l6.h5 : org.telegram.ui.ActionBar.l6.d6, m41Var.x);
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
                            if (this.s2 == null) {
                                this.s2 = new Paint(1);
                            }
                            this.s2.setColor(w02);
                            canvas.drawRect(0.0f, i12, getWidth(), i13, this.s2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        v4.b0 b0Var = this.e3;
        if (b0Var instanceof ky) {
            return ((ky) b0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void s1(int i7, float f10, boolean z9) {
        t1(new fi(this, 3), new ai.c0(8), i7, f10, z9);
    }

    public void setReorderLongPressEnabled(boolean z9) {
        this.l3 = z9;
    }

    public void setSpanCount(int i7) {
        v4.b0 b0Var = this.e3;
        if (b0Var instanceof ky) {
            ((ky) b0Var).y1(i7);
            return;
        }
        if (b0Var == null || i7 == -1) {
            return;
        }
        getContext();
        p41 p41Var = new p41(this, i7, 1);
        p41Var.O = new tq0(this, p41Var, 2);
        this.e3 = p41Var;
        setLayoutManager(p41Var);
    }

    public final void z1(boolean z9) {
        if (this.j3 == z9) {
            return;
        }
        this.j3 = z9;
        this.f3.N = z9;
        org.telegram.messenger.g0.d0(this, new s2(this, 12));
    }

    public r41(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i7, i10, z9, v10Var, a20Var, b20Var, g6Var, -1, 1);
    }

    public r41(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12) {
        super(context, g6Var);
        this.l3 = true;
        if (i11 == -1) {
            jg.i0 i0Var = new jg.i0(this, i12);
            this.e3 = i0Var;
            setLayoutManager(i0Var);
        } else {
            p41 p41Var = new p41(this, i11, 0);
            p41Var.O = new tq0(this, p41Var, 1);
            this.e3 = p41Var;
            setLayoutManager(p41Var);
        }
        m41 m41Var = new m41(this, context, i7, i10, z9, v10Var, g6Var);
        this.f3 = m41Var;
        setAdapter(m41Var);
        if (a20Var != null) {
            setOnItemClickListener(new f2(20, this, a20Var));
        }
        if (b20Var != null) {
            setOnItemLongClickListener(new f2(21, this, b20Var));
        }
        q41 q41Var = new q41(this);
        q41Var.m = false;
        q41Var.C = false;
        q41Var.o(xq.h);
        q41Var.n(350L);
        setItemAnimator(q41Var);
    }

    public void H1(v4.d1 d1Var) {
    }

    public void I1(v4.d1 d1Var) {
    }

    public void J1(v4.d1 d1Var) {
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }
}
