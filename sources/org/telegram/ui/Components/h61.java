package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class h61 extends sl0 {
    public f2.j0 U2;
    public final w51 V2;
    public f2.f0 W2;
    public boolean X2;
    public boolean Y2;
    public boolean Z2;
    public f2.m1 a3;
    public boolean b3;

    public h61(org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), false, callback2, callback5, callback5Return, p2Var.getResourceProvider());
    }

    public final void A1(Utilities.Callback2 callback2, boolean z4) {
        this.Y2 = z4;
        f2.f0 f0Var = new f2.f0(new org.telegram.ui.cp(this, 3));
        this.W2 = f0Var;
        f0Var.d(this);
        this.V2.I = callback2;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!a1()) {
            w51 w51Var = this.V2;
            ArrayList arrayList = w51Var.C;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u51 u51Var = (u51) arrayList.get(i10);
                int i11 = u51Var.b;
                if (i11 >= 0) {
                    int i12 = u51Var.a;
                    int v02 = org.telegram.ui.ActionBar.k6.v0(w51Var.n ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6, w51Var.v);
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
                            if (this.r2 == null) {
                                this.r2 = new Paint(1);
                            }
                            this.r2.setColor(v02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.r2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        f2.j0 j0Var = this.U2;
        if (j0Var instanceof pz) {
            return ((pz) j0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.sl0
    public final void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.sl0
    public final void p1(int i10, float f10, boolean z4) {
        r1(new oi(this, 3), new org.telegram.ui.wh(5), i10, f10, new hv(this, 27), z4);
    }

    public void setReorderLongPressEnabled(boolean z4) {
        this.b3 = z4;
    }

    @Override // org.telegram.ui.Components.sl0
    public void setSections(boolean z4) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSpanCount(int i10) {
        f2.j0 j0Var = this.U2;
        if (j0Var instanceof pz) {
            ((pz) j0Var).y1(i10);
            return;
        }
        if (j0Var == null || i10 == -1) {
            return;
        }
        getContext();
        g61 g61Var = new g61(this, i10);
        g61Var.O = new ls0(this, g61Var, 1);
        this.U2 = g61Var;
        setLayoutManager(g61Var);
    }

    public final void v1(boolean z4) {
        if (this.Z2 == z4) {
            return;
        }
        this.Z2 = z4;
        this.V2.J = z4;
        AndroidUtilities.forEachViews((RecyclerView) this, (h5.d) new cb0(this, 1));
    }

    public final int w1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.V2;
            if (i11 >= w51Var.x.size()) {
                return -1;
            }
            h51 G = w51Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View x1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.V2;
            if (i11 >= w51Var.x.size()) {
                i11 = -1;
                break;
            }
            h51 G = w51Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return T0(i11);
    }

    public final View y1(Object obj) {
        int i10 = 0;
        while (true) {
            w51 w51Var = this.V2;
            if (i10 >= w51Var.x.size()) {
                i10 = -1;
                break;
            }
            h51 G = w51Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return T0(i10);
    }

    public boolean z1() {
        return false;
    }

    public h61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, z4, callback2, callback5, callback5Return, g6Var, -1, 1);
    }

    public h61(Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var, int i12, int i13) {
        super(context, g6Var);
        this.b3 = true;
        if (i12 == -1) {
            c61 c61Var = new c61(this, i13);
            this.U2 = c61Var;
            setLayoutManager(c61Var);
        } else {
            d61 d61Var = new d61(this, i12);
            d61Var.O = new e61(this, d61Var);
            this.U2 = d61Var;
            setLayoutManager(d61Var);
        }
        w51 w51Var = new w51(this, context, i10, i11, z4, callback2, g6Var);
        this.V2 = w51Var;
        setAdapter(w51Var);
        if (callback5 != null) {
            setOnItemClickListener(new o1(25, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new o1(26, this, callback5Return));
        }
        f61 f61Var = new f61(this);
        f61Var.m = false;
        f61Var.C = false;
        f61Var.o(pr.h);
        f61Var.n(350L);
        setItemAnimator(f61Var);
    }

    public void B1() {
    }

    public void C1() {
    }

    public void D1(f2.m1 m1Var) {
    }

    public void E1(f2.m1 m1Var) {
    }

    public void F1(f2.m1 m1Var) {
    }

    public void G1() {
    }
}
