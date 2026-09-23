package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h0 extends il0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ k0 w;

    public h0(k0 k0Var, Context context) {
        this.w = k0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.s = i10;
        this.v = context;
        arrayList.addAll(c2.f(i10).e());
    }

    @Override // org.telegram.ui.Components.uk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.il0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.il0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.il0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.il0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.il0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.il0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f == 0) {
            y1 y1Var = (y1) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof b2) {
                b2 b2Var = (b2) O;
                y1Var.a(b2Var, null, z10);
                y1Var.d.a(this.w.w.contains(Integer.valueOf(b2Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.il0, s4.h0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(c2.f(this.s).e());
        X(false);
        this.w.L();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.v;
        if (i10 == 0) {
            y1Var = new y1(context, this.w.a, false);
        } else if (i10 != 1) {
            y1Var = new View(context);
            y1Var.setTag(-33024);
        } else {
            y1Var = new View(context);
            y1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            y1Var.setTag(-33024);
        }
        return new wk0(y1Var);
    }
}
