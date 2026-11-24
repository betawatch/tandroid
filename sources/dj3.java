// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dj3 extends el9 {
    public boolean T;
    public mk3 U;
    public final /* synthetic */ gk3 V;
    public final /* synthetic */ Context W;
    public final /* synthetic */ nk3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(nk3 nk3Var, Context context, gk3 gk3Var, Context context2) {
        super(context);
        this.a0 = nk3Var;
        this.V = gk3Var;
        this.W = context2;
        this.e = 0.0f;
        this.n = new po(null);
        this.N = true;
    }

    @Override // el9
    public final void d(boolean z) {
        mk3 mk3Var = this.U;
        mk3Var.c.G = true;
        mk3Var.d.N(this.U.a, c());
        mk3 mk3Var2 = this.U;
        mk3Var2.d.H = false;
        mk3Var2.H.H = false;
        nk3 nk3Var = this.a0;
        nk3Var.U4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z);
        nk3Var.E = false;
        this.V.requestLayout();
        if (!c()) {
            nk3Var.R = true;
            if (nk3Var.O != 0.0f) {
                nk3Var.S = true;
            }
            View view = nk3Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        sj3 sj3Var = nk3Var.D0;
        if (sj3Var != null) {
            sj3Var.S();
        }
        nk3Var.s5(false, true);
        nk3Var.Z2();
        nk3Var.q5();
    }

    @Override // el9
    public final void e(boolean z) {
        sy4 sy4Var;
        int i;
        nk3 nk3Var = this.a0;
        nk3Var.E = true;
        nk3Var.F = z;
        this.V.requestLayout();
        mk3 mk3Var = nk3Var.f0[0];
        this.U = mk3Var;
        if (mk3Var.G == null) {
            mk3Var.G = new bj3(this.W, null);
            sy4Var = ((d) nk3Var).glassEngine;
            sy4Var.b(this.U.G);
            this.U.G.setLayoutManager(new cj3(this, this.U));
            mk3 mk3Var2 = this.U;
            int i2 = this.U.s;
            int i3 = nk3Var.Y2;
            boolean z2 = nk3Var.n2;
            ArrayList arrayList = nk3Var.K2;
            i = ((d) nk3Var).currentAccount;
            mk3Var2.H = new zk3(nk3Var, this.W, i2, i3, z2, arrayList, i, nk3Var.H);
            mk3 mk3Var3 = this.U;
            zk3 zk3Var = mk3Var3.H;
            zk3Var.T = true;
            mk3Var3.G.setAdapter(zk3Var);
            mk3 mk3Var4 = this.U;
            mk3Var4.addView(mk3Var4.G);
        }
        if (!z) {
            nk3Var.R = false;
            u69 L = this.U.a.L((nk3Var.y3() && this.U.s == 0) ? 1 : 0, false);
            nk3Var.W4((L == null || L.a.getTop() < this.U.a.getPaddingTop()) ? -nk3Var.q3() : 0.0f);
        }
        this.U.a.D0();
        mk3 mk3Var5 = this.U;
        zk3 zk3Var2 = mk3Var5.H;
        zk3Var2.h = mk3Var5.s;
        zk3Var2.f();
        mk3 mk3Var6 = this.U;
        mk3Var6.d.N(mk3Var6.a, false);
        mk3 mk3Var7 = this.U;
        mk3Var7.d.H = true;
        mk3Var7.H.H = true;
        mk3Var7.c.H = false;
        nk3Var.U4(true, true);
        nk3Var.B3(this.T);
        this.U.d.f();
        this.U.H.f();
        float f = nk3Var.O;
        if (z) {
            f = -f;
        }
        mk3 mk3Var8 = this.U;
        mk3Var8.a.B1(mk3Var8.G, f, false);
        this.U.a.setClipChildren(false);
        this.U.a.D0();
        nk3Var.Z2();
        nk3Var.q5();
    }

    @Override // el9
    public final boolean getOccupyStatusbar() {
        a aVar;
        a aVar2;
        nk3 nk3Var = this.a0;
        aVar = ((d) nk3Var).actionBar;
        if (aVar == null) {
            return false;
        }
        aVar2 = ((d) nk3Var).actionBar;
        return aVar2.getOccupyStatusBar();
    }

    @Override // el9
    public final void setOpenProgress(float f) {
        a aVar;
        a aVar2;
        jk3 jk3Var;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        boolean z = f > 0.0f;
        if (this.T != z) {
            this.T = z;
        }
        nk3 nk3Var = this.a0;
        View view = nk3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aVar = ((d) nk3Var).actionBar;
        if (aVar.getTitleTextView() != null) {
            aVar4 = ((d) nk3Var).actionBar;
            aVar4.getTitleTextView().setAlpha(1.0f - f);
            aVar5 = ((d) nk3Var).actionBar;
            if (aVar5.getTitleTextView().getAlpha() > 0.0f) {
                aVar6 = ((d) nk3Var).actionBar;
                aVar6.getTitleTextView().setVisibility(0);
            }
        }
        aVar2 = ((d) nk3Var).actionBar;
        if (aVar2.getBackButton() != null) {
            aVar3 = ((d) nk3Var).actionBar;
            aVar3.getBackButton().setAlpha(f != 1.0f ? 1.0f : 0.0f);
        }
        if (nk3Var.Y2 != 0 || nk3Var.a3 != 0) {
            Paint paint = nk3Var.h1;
            int i = cmb.c6;
            paint.setColor(on2.f(f, nk3Var.getThemedColor(i), nk3Var.getThemedColor(i)));
        }
        mk3 mk3Var = this.U;
        if (mk3Var != null) {
            mk3Var.a.setOpenRightFragmentProgress(f);
        }
        nk3Var.Y2();
        nk3Var.d3();
        nk3Var.Q2();
        nk3Var.a3();
        mk3 mk3Var2 = nk3Var.f0[0];
        if (mk3Var2 != null && (jk3Var = mk3Var2.a) != null) {
            jk3Var.requestLayout();
        }
        View view2 = nk3Var.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
