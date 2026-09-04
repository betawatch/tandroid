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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class d61 extends ll0 {
    public s4.c0 X2;
    public final v51 Y2;
    public s4.y Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public s4.c1 d3;
    public boolean e3;

    public d61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final void A1(Utilities.Callback2 callback2, boolean z10) {
        this.b3 = z10;
        s4.y yVar = new s4.y(new ci.f(this, 4));
        this.Z2 = yVar;
        yVar.d(this);
        this.Y2.L = callback2;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!a1()) {
            v51 v51Var = this.Y2;
            ArrayList arrayList = v51Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                t51 t51Var = (t51) arrayList.get(i10);
                int i11 = t51Var.b;
                if (i11 >= 0) {
                    int i12 = t51Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(v51Var.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6, v51Var.v);
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
                            if (this.u2 == null) {
                                this.u2 = new Paint(1);
                            }
                            this.u2.setColor(v02);
                            canvas.drawRect(0.0f, i13, getWidth(), i14, this.u2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            return ((nz) c0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.ll0
    public final void o1() {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.ll0
    public final void p1(int i10, float f7, boolean z10) {
        r1(new xi(this, 3), new fi.c(6), i10, f7, new kv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.e3 = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public void setSections(boolean z10) {
        p1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.X2;
        if (c0Var instanceof nz) {
            ((nz) c0Var).y1(i10);
            return;
        }
        if (c0Var == null || i10 == -1) {
            return;
        }
        getContext();
        ci.h hVar = new ci.h(this, i10);
        hVar.O = new ls0(this, hVar, 1);
        this.X2 = hVar;
        setLayoutManager(hVar);
    }

    public final void v1(boolean z10) {
        if (this.c3 == z10) {
            return;
        }
        this.c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new za0(this, 1));
    }

    public final int w1(int i10) {
        int i11 = 0;
        while (true) {
            v51 v51Var = this.Y2;
            if (i11 >= v51Var.x.size()) {
                return -1;
            }
            h51 G = v51Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View x1(int i10) {
        int i11 = 0;
        while (true) {
            v51 v51Var = this.Y2;
            if (i11 >= v51Var.x.size()) {
                i11 = -1;
                break;
            }
            h51 G = v51Var.G(i11);
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
            v51 v51Var = this.Y2;
            if (i10 >= v51Var.x.size()) {
                i10 = -1;
                break;
            }
            h51 G = v51Var.G(i10);
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

    public d61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public d61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.e3 = true;
        if (i12 == -1) {
            z51 z51Var = new z51(this, i13);
            this.X2 = z51Var;
            setLayoutManager(z51Var);
        } else {
            a61 a61Var = new a61(this, i12);
            a61Var.O = new b61(this, a61Var);
            this.X2 = a61Var;
            setLayoutManager(a61Var);
        }
        v51 v51Var = new v51(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = v51Var;
        setAdapter(v51Var);
        if (callback5 != null) {
            setOnItemClickListener(new b3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new b3(18, this, callback5Return));
        }
        c61 c61Var = new c61(this);
        c61Var.m = false;
        c61Var.C = false;
        c61Var.o(pr.h);
        c61Var.n(350L);
        setItemAnimator(c61Var);
    }

    public void B1() {
    }

    public void C1() {
    }

    public void D1(s4.c1 c1Var) {
    }

    public void E1(s4.c1 c1Var) {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1() {
    }
}
