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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class i71 extends mm0 {
    public s4.b0 V2;
    public final a71 W2;
    public s4.y X2;
    public boolean Y2;
    public boolean Z2;
    public boolean a3;
    public s4.b1 b3;
    public boolean c3;

    public i71(org.telegram.ui.ActionBar.m2 m2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), false, callback2, callback5, callback5Return, m2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            a71 a71Var = this.W2;
            if (i10 >= a71Var.x.size()) {
                i10 = -1;
                break;
            }
            m61 G = a71Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return U0(i10);
    }

    public boolean B1() {
        return false;
    }

    public final void C1(Utilities.Callback2 callback2, boolean z10) {
        this.Z2 = z10;
        s4.y yVar = new s4.y(new ci.f(this, 4));
        this.X2 = yVar;
        yVar.d(this);
        this.W2.L = callback2;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            a71 a71Var = this.W2;
            ArrayList arrayList = a71Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                y61 y61Var = (y61) arrayList.get(i10);
                int i11 = y61Var.b;
                if (i11 >= 0) {
                    int i12 = y61Var.a;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(a71Var.n ? org.telegram.ui.ActionBar.g6.h5 : org.telegram.ui.ActionBar.g6.d6, a71Var.v);
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
        s4.b0 b0Var = this.V2;
        if (b0Var instanceof zz) {
            return ((zz) b0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.mm0
    public final void q1(int i10, float f7, boolean z10) {
        s1(new xi(this, 3), new fi.c(6), i10, f7, new xv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.c3 = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.b0 b0Var = this.V2;
        if (b0Var instanceof zz) {
            ((zz) b0Var).y1(i10);
            return;
        }
        if (b0Var == null || i10 == -1) {
            return;
        }
        getContext();
        ci.h hVar = new ci.h(this, i10);
        hVar.O = new lt0(this, hVar, 1);
        this.V2 = hVar;
        setLayoutManager(hVar);
    }

    public final void x1(boolean z10) {
        if (this.a3 == z10) {
            return;
        }
        this.a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new a3(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            a71 a71Var = this.W2;
            if (i11 >= a71Var.x.size()) {
                return -1;
            }
            m61 G = a71Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View z1(int i10) {
        int i11 = 0;
        while (true) {
            a71 a71Var = this.W2;
            if (i11 >= a71Var.x.size()) {
                i11 = -1;
                break;
            }
            m61 G = a71Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return U0(i11);
    }

    public i71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, c6Var, -1, 1);
    }

    public i71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.c6 c6Var, int i12, int i13) {
        super(context, c6Var);
        this.c3 = true;
        if (i12 == -1) {
            e71 e71Var = new e71(this, i13);
            this.V2 = e71Var;
            setLayoutManager(e71Var);
        } else {
            f71 f71Var = new f71(this, i12);
            f71Var.O = new g71(this, f71Var);
            this.V2 = f71Var;
            setLayoutManager(f71Var);
        }
        a71 a71Var = new a71(this, context, i10, i11, z10, callback2, c6Var);
        this.W2 = a71Var;
        setAdapter(a71Var);
        if (callback5 != null) {
            setOnItemClickListener(new u2(20, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new u2(21, this, callback5Return));
        }
        h71 h71Var = new h71(this);
        h71Var.m = false;
        h71Var.C = false;
        h71Var.o(es.h);
        h71Var.n(350L);
        setItemAnimator(h71Var);
    }

    public void D1() {
    }

    public void E1() {
    }

    public void F1(s4.b1 b1Var) {
    }

    public void G1(s4.b1 b1Var) {
    }

    public void H1(s4.b1 b1Var) {
    }

    public void I1() {
    }
}
