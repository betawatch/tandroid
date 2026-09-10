package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k0 extends rl0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ n0 w;

    public k0(n0 n0Var, Context context) {
        this.w = n0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.s = i10;
        this.v = context;
        arrayList.addAll(k2.f(i10).e());
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.rl0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.rl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f == 0) {
            g2 g2Var = (g2) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof j2) {
                j2 j2Var = (j2) O;
                g2Var.a(j2Var, null, z10);
                g2Var.d.a(this.w.w.contains(Integer.valueOf(j2Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.rl0, s4.h0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(k2.f(this.s).e());
        X(false);
        this.w.L();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        Context context = this.v;
        if (i10 == 0) {
            g2Var = new g2(context, this.w.a, false);
        } else if (i10 != 1) {
            g2Var = new View(context);
            g2Var.setTag(-33024);
        } else {
            g2Var = new View(context);
            g2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            g2Var.setTag(-33024);
        }
        return new fl0(g2Var);
    }
}
