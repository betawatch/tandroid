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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class e61 extends ll0 {
    public s4.c0 X2;
    public final w51 Y2;
    public s4.y Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public s4.c1 d3;
    public boolean e3;

    public e61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public boolean A1() {
        return false;
    }

    public final void B1(Utilities.Callback2 callback2, boolean z10) {
        this.b3 = z10;
        s4.y yVar = new s4.y(new bi.g(this, 4));
        this.Z2 = yVar;
        yVar.e(this);
        this.Y2.L = callback2;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            w51 w51Var = this.Y2;
            ArrayList arrayList = w51Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u51 u51Var = (u51) arrayList.get(i10);
                int i11 = u51Var.b;
                if (i11 >= 0) {
                    int i12 = u51Var.a;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(w51Var.n ? org.telegram.ui.ActionBar.i6.h5 : org.telegram.ui.ActionBar.i6.d6, w51Var.v);
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
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.ll0
    public final void q1(int i10, float f7, boolean z10) {
        s1(new xi(this, 3), new ei.c(6), i10, f7, new lv(this, 27), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.e3 = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
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
        iVar.O = new ms0(this, iVar, 1);
        this.X2 = iVar;
        setLayoutManager(iVar);
    }

    public final void w1(boolean z10) {
        if (this.c3 == z10) {
            return;
        }
        this.c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new ya0(this, 1));
    }

    public final int x1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.Y2;
            if (i11 >= w51Var.x.size()) {
                return -1;
            }
            i51 G = w51Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View y1(int i10) {
        int i11 = 0;
        while (true) {
            w51 w51Var = this.Y2;
            if (i11 >= w51Var.x.size()) {
                i11 = -1;
                break;
            }
            i51 G = w51Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return U0(i11);
    }

    public final View z1(Object obj) {
        int i10 = 0;
        while (true) {
            w51 w51Var = this.Y2;
            if (i10 >= w51Var.x.size()) {
                i10 = -1;
                break;
            }
            i51 G = w51Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return U0(i10);
    }

    public e61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, e6Var, -1, 1);
    }

    public e61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.e6 e6Var, int i12, int i13) {
        super(context, e6Var);
        this.e3 = true;
        if (i12 == -1) {
            a61 a61Var = new a61(this, i13);
            this.X2 = a61Var;
            setLayoutManager(a61Var);
        } else {
            b61 b61Var = new b61(this, i12);
            b61Var.O = new c61(this, b61Var);
            this.X2 = b61Var;
            setLayoutManager(b61Var);
        }
        w51 w51Var = new w51(this, context, i10, i11, z10, callback2, e6Var);
        this.Y2 = w51Var;
        setAdapter(w51Var);
        if (callback5 != null) {
            setOnItemClickListener(new mf(16, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new mf(17, this, callback5Return));
        }
        d61 d61Var = new d61(this);
        d61Var.m = false;
        d61Var.C = false;
        d61Var.o(qr.h);
        d61Var.n(350L);
        setItemAnimator(d61Var);
    }

    public void C1() {
    }

    public void D1() {
    }

    public void E1(s4.c1 c1Var) {
    }

    public void F1(s4.c1 c1Var) {
    }

    public void G1(s4.c1 c1Var) {
    }

    public void H1() {
    }
}
