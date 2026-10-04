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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public class c71 extends zl0 {
    public s4.c0 e3;
    public final u61 f3;
    public s4.y g3;
    public boolean h3;
    public boolean i3;
    public boolean j3;
    public s4.c1 k3;
    public boolean l3;

    public c71(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(int i10) {
        int i11 = 0;
        while (true) {
            u61 u61Var = this.f3;
            if (i11 >= u61Var.x.size()) {
                i11 = -1;
                break;
            }
            g61 G = u61Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return V0(i11);
    }

    public final View B1(Object obj) {
        int i10 = 0;
        while (true) {
            u61 u61Var = this.f3;
            if (i10 >= u61Var.x.size()) {
                i10 = -1;
                break;
            }
            g61 G = u61Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return V0(i10);
    }

    public boolean C1() {
        return false;
    }

    public final void D1(Utilities.Callback2 callback2, boolean z10) {
        this.i3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.g3 = yVar;
        yVar.e(this);
        this.f3.L = callback2;
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!c1()) {
            u61 u61Var = this.f3;
            ArrayList arrayList = u61Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                s61 s61Var = (s61) arrayList.get(i10);
                int i11 = s61Var.b;
                if (i11 >= 0) {
                    int i12 = s61Var.a;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(u61Var.n ? org.telegram.ui.ActionBar.i6.h5 : org.telegram.ui.ActionBar.i6.d6, u61Var.v);
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
        s4.c0 c0Var = this.e3;
        if (c0Var instanceof qz) {
            return ((qz) c0Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.l3 = z10;
    }

    public void setSpanCount(int i10) {
        s4.c0 c0Var = this.e3;
        if (c0Var instanceof qz) {
            ((qz) c0Var).y1(i10);
            return;
        }
        if (c0Var == null || i10 == -1) {
            return;
        }
        getContext();
        bi.i iVar = new bi.i(this, i10);
        iVar.O = new dt0(this, iVar, 1);
        this.e3 = iVar;
        setLayoutManager(iVar);
    }

    @Override // org.telegram.ui.Components.zl0
    public final void t1(int i10, float f7, boolean z10) {
        u1(new zi(this, 3), new ei.c(6), i10, f7, z10);
    }

    public final void y1(boolean z10) {
        if (this.j3 == z10) {
            return;
        }
        this.j3 = z10;
        this.f3.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int z1(int i10) {
        int i11 = 0;
        while (true) {
            u61 u61Var = this.f3;
            if (i11 >= u61Var.x.size()) {
                return -1;
            }
            g61 G = u61Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public c71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public c71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.l3 = true;
        if (i12 == -1) {
            y61 y61Var = new y61(this, i13);
            this.e3 = y61Var;
            setLayoutManager(y61Var);
        } else {
            z61 z61Var = new z61(this, i12);
            z61Var.O = new a71(this, z61Var);
            this.e3 = z61Var;
            setLayoutManager(z61Var);
        }
        u61 u61Var = new u61(this, context, i10, i11, z10, callback2, d6Var);
        this.f3 = u61Var;
        setAdapter(u61Var);
        if (callback5 != null) {
            setOnItemClickListener(new w2(19, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new w2(20, this, callback5Return));
        }
        b71 b71Var = new b71(this);
        b71Var.m = false;
        b71Var.C = false;
        b71Var.o(tr.h);
        b71Var.n(350L);
        setItemAnimator(b71Var);
    }

    public void E1() {
    }

    public void F1() {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1(s4.c1 c1Var) {
    }

    public void J1() {
    }
}
