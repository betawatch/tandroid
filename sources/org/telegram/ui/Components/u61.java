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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class u61 extends yl0 {
    public s4.c0 X2;
    public final m61 Y2;
    public s4.y Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public s4.c1 d3;
    public boolean e3;

    public u61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i10 >= m61Var.x.size()) {
                i10 = -1;
                break;
            }
            y51 G = m61Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return V0(i10);
    }

    public boolean B1() {
        return false;
    }

    public final void C1(Utilities.Callback2 callback2, boolean z10) {
        this.b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override // org.telegram.ui.Components.yl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!c1()) {
            m61 m61Var = this.Y2;
            ArrayList arrayList = m61Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                k61 k61Var = (k61) arrayList.get(i10);
                int i11 = k61Var.b;
                if (i11 >= 0) {
                    int i12 = k61Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(m61Var.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6, m61Var.v);
                    if (i11 >= i12 && i12 >= 0 && i11 >= 0) {
                        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i14 = TLObject.FLAG_31;
                        for (int i15 = 0; i15 < getChildCount(); i15++) {
                            View childAt = getChildAt(i15);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= i12 && S <= i11) {
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

    @Override // org.telegram.ui.Components.yl0
    public final void q1() {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.yl0
    public final void r1(int i10, float f7, boolean z10) {
        t1(new xi(this, 3), new ei.c(6), i10, f7, new mv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.e3 = z10;
    }

    @Override // org.telegram.ui.Components.yl0
    public void setSections(boolean z10) {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
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
        bi.i iVar = new bi.i(this, i10);
        iVar.O = new zs0(this, iVar, 1);
        this.X2 = iVar;
        setLayoutManager(iVar);
    }

    public final void x1(boolean z10) {
        if (this.c3 == z10) {
            return;
        }
        this.c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new jb0(this, 1));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i11 >= m61Var.x.size()) {
                return -1;
            }
            y51 G = m61Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View z1(int i10) {
        int i11 = 0;
        while (true) {
            m61 m61Var = this.Y2;
            if (i11 >= m61Var.x.size()) {
                i11 = -1;
                break;
            }
            y51 G = m61Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return V0(i11);
    }

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public u61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.e3 = true;
        if (i12 == -1) {
            q61 q61Var = new q61(this, i13);
            this.X2 = q61Var;
            setLayoutManager(q61Var);
        } else {
            r61 r61Var = new r61(this, i12);
            r61Var.O = new s61(this, r61Var);
            this.X2 = r61Var;
            setLayoutManager(r61Var);
        }
        m61 m61Var = new m61(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = m61Var;
        setAdapter(m61Var);
        if (callback5 != null) {
            setOnItemClickListener(new a3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new a3(18, this, callback5Return));
        }
        t61 t61Var = new t61(this);
        t61Var.m = false;
        t61Var.C = false;
        t61Var.o(qr.h);
        t61Var.n(350L);
        setItemAnimator(t61Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1(s4.c1 c1Var) {
    }

    public void I1() {
    }
}
