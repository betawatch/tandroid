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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class j71 extends mm0 {
    public s4.b0 Y2;
    public final b71 Z2;
    public s4.y a3;
    public boolean b3;
    public boolean c3;
    public boolean d3;
    public s4.b1 e3;
    public boolean f3;

    public j71(org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), false, callback2, callback5, callback5Return, o2Var.getResourceProvider());
    }

    public final void C1(boolean z10) {
        if (this.d3 == z10) {
            return;
        }
        this.d3 = z10;
        this.Z2.N = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new y2(this, 13));
    }

    public final int D1(int i10) {
        int i11 = 0;
        while (true) {
            b71 b71Var = this.Z2;
            if (i11 >= b71Var.y.size()) {
                return -1;
            }
            m61 G = b71Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View E1(int i10) {
        int i11 = 0;
        while (true) {
            b71 b71Var = this.Z2;
            if (i11 >= b71Var.y.size()) {
                i11 = -1;
                break;
            }
            m61 G = b71Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return V0(i11);
    }

    public final View F1(Object obj) {
        int i10 = 0;
        while (true) {
            b71 b71Var = this.Z2;
            if (i10 >= b71Var.y.size()) {
                i10 = -1;
                break;
            }
            m61 G = b71Var.G(i10);
            if (G != null && G.G == obj) {
                break;
            }
            i10++;
        }
        return V0(i10);
    }

    public boolean G1() {
        return false;
    }

    public final void H1(Utilities.Callback2 callback2, boolean z10) {
        this.c3 = z10;
        s4.y yVar = new s4.y(new di.f(this, 4));
        this.a3 = yVar;
        yVar.d(this);
        this.Z2.M = callback2;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!c1()) {
            b71 b71Var = this.Z2;
            ArrayList arrayList = b71Var.G;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                x61 x61Var = (x61) arrayList.get(i10);
                int i11 = x61Var.b;
                if (i11 >= 0) {
                    int i12 = x61Var.a;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(b71Var.n ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6, b71Var.w);
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
        s4.b0 b0Var = this.Y2;
        if (b0Var instanceof wz) {
            return ((wz) b0Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.f3 = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public void setSections(boolean z10) {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.b0 b0Var = this.Y2;
        if (b0Var instanceof wz) {
            ((wz) b0Var).y1(i10);
            return;
        }
        if (b0Var == null || i10 == -1) {
            return;
        }
        getContext();
        di.h hVar = new di.h(this, i10);
        hVar.O = new lt0(this, hVar, 1);
        this.Y2 = hVar;
        setLayoutManager(hVar);
    }

    @Override // org.telegram.ui.Components.mm0
    public final void t1() {
        u1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.mm0
    public final void u1(int i10, float f7, boolean z10) {
        w1(new vi(this, 3), new gi.c(6), i10, f7, new tv(this, 28), z10);
    }

    public j71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, g6Var, -1, 1);
    }

    public j71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.g6 g6Var, int i12, int i13) {
        super(context, g6Var);
        this.f3 = true;
        if (i12 == -1) {
            f71 f71Var = new f71(this, i13);
            this.Y2 = f71Var;
            setLayoutManager(f71Var);
        } else {
            g71 g71Var = new g71(this, i12);
            g71Var.O = new h71(this, g71Var);
            this.Y2 = g71Var;
            setLayoutManager(g71Var);
        }
        b71 b71Var = new b71(this, context, i10, i11, z10, callback2, g6Var);
        this.Z2 = b71Var;
        setAdapter(b71Var);
        if (callback5 != null) {
            setOnItemClickListener(new p2(24, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new p2(25, this, callback5Return));
        }
        i71 i71Var = new i71(this);
        i71Var.m = false;
        i71Var.C = false;
        i71Var.o(bs.h);
        i71Var.n(350L);
        setItemAnimator(i71Var);
    }

    public void I1() {
    }

    public void J1() {
    }

    public void K1(s4.b1 b1Var) {
    }

    public void L1(s4.b1 b1Var) {
    }

    public void M1(s4.b1 b1Var) {
    }

    public void N1() {
    }
}
