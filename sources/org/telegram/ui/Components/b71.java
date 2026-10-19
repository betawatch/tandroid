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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class b71 extends im0 {
    public s4.b0 V2;
    public final t61 W2;
    public s4.y X2;
    public boolean Y2;
    public boolean Z2;
    public boolean a3;
    public s4.b1 b3;
    public boolean c3;

    public b71(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            t61 t61Var = this.W2;
            if (i10 >= t61Var.x.size()) {
                i10 = -1;
                break;
            }
            g61 G = t61Var.G(i10);
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
        s4.y yVar = new s4.y(new di.f(this, 4));
        this.X2 = yVar;
        yVar.d(this);
        this.W2.L = callback2;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!b1()) {
            t61 t61Var = this.W2;
            ArrayList arrayList = t61Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r61 r61Var = (r61) arrayList.get(i10);
                int i11 = r61Var.b;
                if (i11 >= 0) {
                    int i12 = r61Var.a;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(t61Var.n ? org.telegram.ui.ActionBar.h6.h5 : org.telegram.ui.ActionBar.h6.d6, t61Var.v);
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
        if (b0Var instanceof wz) {
            return ((wz) b0Var).J;
        }
        return -1;
    }

    @Override // org.telegram.ui.Components.im0
    public final void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.im0
    public final void q1(int i10, float f7, boolean z10) {
        s1(new vi(this, 3), new gi.c(6), i10, f7, new tv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.c3 = z10;
    }

    @Override // org.telegram.ui.Components.im0
    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSpanCount(int i10) {
        s4.b0 b0Var = this.V2;
        if (b0Var instanceof wz) {
            ((wz) b0Var).y1(i10);
            return;
        }
        if (b0Var == null || i10 == -1) {
            return;
        }
        getContext();
        di.h hVar = new di.h(this, i10);
        hVar.O = new ht0(this, hVar, 1);
        this.V2 = hVar;
        setLayoutManager(hVar);
    }

    public final void x1(boolean z10) {
        if (this.a3 == z10) {
            return;
        }
        this.a3 = z10;
        this.W2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (Utilities.Callback<View>) new z2(this, 13));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            t61 t61Var = this.W2;
            if (i11 >= t61Var.x.size()) {
                return -1;
            }
            g61 G = t61Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View z1(int i10) {
        int i11 = 0;
        while (true) {
            t61 t61Var = this.W2;
            if (i11 >= t61Var.x.size()) {
                i11 = -1;
                break;
            }
            g61 G = t61Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return U0(i11);
    }

    public b71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, d6Var, -1, 1);
    }

    public b71(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.d6 d6Var, int i12, int i13) {
        super(context, d6Var);
        this.c3 = true;
        if (i12 == -1) {
            x61 x61Var = new x61(this, i13);
            this.V2 = x61Var;
            setLayoutManager(x61Var);
        } else {
            y61 y61Var = new y61(this, i12);
            y61Var.O = new z61(this, y61Var);
            this.V2 = y61Var;
            setLayoutManager(y61Var);
        }
        t61 t61Var = new t61(this, context, i10, i11, z10, callback2, d6Var);
        this.W2 = t61Var;
        setAdapter(t61Var);
        if (callback5 != null) {
            setOnItemClickListener(new q2(22, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new q2(23, this, callback5Return));
        }
        a71 a71Var = new a71(this);
        a71Var.m = false;
        a71Var.C = false;
        a71Var.o(bs.h);
        a71Var.n(350L);
        setItemAnimator(a71Var);
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
