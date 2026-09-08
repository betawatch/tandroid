package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f0 extends hl0 {
    public final ArrayList r;
    public final int s;
    public final Context v;
    public final /* synthetic */ i0 w;

    public f0(i0 i0Var, Context context) {
        this.w = i0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.s = i10;
        this.v = context;
        arrayList.addAll(b2.f(i10).e());
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.hl0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.hl0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.hl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f == 0) {
            x1 x1Var = (x1) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof a2) {
                a2 a2Var = (a2) O;
                x1Var.a(a2Var, null, z10);
                x1Var.d.a(this.w.w.contains(Integer.valueOf(a2Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.hl0, s4.h0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(b2.f(this.s).e());
        X(false);
        this.w.L();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x1Var;
        Context context = this.v;
        if (i10 == 0) {
            x1Var = new x1(context, this.w.a, false);
        } else if (i10 != 1) {
            x1Var = new View(context);
            x1Var.setTag(-33024);
        } else {
            x1Var = new View(context);
            x1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            x1Var.setTag(-33024);
        }
        return new vk0(x1Var);
    }
}
