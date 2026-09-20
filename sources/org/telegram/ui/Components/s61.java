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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class s61 extends vl0 {
    public s4.c0 X2;
    public final k61 Y2;
    public s4.y Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public s4.c1 d3;
    public boolean e3;

    public s61(org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return) {
        this(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), false, callback2, callback5, callback5Return, n2Var.getResourceProvider());
    }

    public final View A1(Object obj) {
        int i10 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i10 >= k61Var.x.size()) {
                i10 = -1;
                break;
            }
            w51 G = k61Var.G(i10);
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

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!c1()) {
            k61 k61Var = this.Y2;
            ArrayList arrayList = k61Var.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                i61 i61Var = (i61) arrayList.get(i10);
                int i11 = i61Var.b;
                if (i11 >= 0) {
                    int i12 = i61Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(k61Var.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6, k61Var.v);
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

    @Override // org.telegram.ui.Components.vl0
    public final void q1() {
        r1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // org.telegram.ui.Components.vl0
    public final void r1(int i10, float f7, boolean z10) {
        t1(new xi(this, 3), new ei.c(6), i10, f7, new mv(this, 28), z10);
    }

    public void setReorderLongPressEnabled(boolean z10) {
        this.e3 = z10;
    }

    @Override // org.telegram.ui.Components.vl0
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
        iVar.O = new xs0(this, iVar, 1);
        this.X2 = iVar;
        setLayoutManager(iVar);
    }

    public final void x1(boolean z10) {
        if (this.c3 == z10) {
            return;
        }
        this.c3 = z10;
        this.Y2.M = z10;
        AndroidUtilities.forEachViews((RecyclerView) this, (e2.h) new gb0(this, 1));
    }

    public final int y1(int i10) {
        int i11 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i11 >= k61Var.x.size()) {
                return -1;
            }
            w51 G = k61Var.G(i11);
            if (G != null && G.d == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final View z1(int i10) {
        int i11 = 0;
        while (true) {
            k61 k61Var = this.Y2;
            if (i11 >= k61Var.x.size()) {
                i11 = -1;
                break;
            }
            w51 G = k61Var.G(i11);
            if (G != null && G.d == i10) {
                break;
            }
            i11++;
        }
        return V0(i11);
    }

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, i11, z10, callback2, callback5, callback5Return, f6Var, -1, 1);
    }

    public s61(Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, org.telegram.ui.ActionBar.f6 f6Var, int i12, int i13) {
        super(context, f6Var);
        this.e3 = true;
        if (i12 == -1) {
            o61 o61Var = new o61(this, i13);
            this.X2 = o61Var;
            setLayoutManager(o61Var);
        } else {
            p61 p61Var = new p61(this, i12);
            p61Var.O = new q61(this, p61Var);
            this.X2 = p61Var;
            setLayoutManager(p61Var);
        }
        k61 k61Var = new k61(this, context, i10, i11, z10, callback2, f6Var);
        this.Y2 = k61Var;
        setAdapter(k61Var);
        if (callback5 != null) {
            setOnItemClickListener(new a3(17, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new a3(18, this, callback5Return));
        }
        r61 r61Var = new r61(this);
        r61Var.m = false;
        r61Var.C = false;
        r61Var.o(qr.h);
        r61Var.n(350L);
        setItemAnimator(r61Var);
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
