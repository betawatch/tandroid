package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class f0 extends fm0 {
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
        arrayList.addAll(a2.f(i10).e());
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.fm0
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.fm0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.fm0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        if (b1Var.f == 0) {
            w1 w1Var = (w1) b1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof z1) {
                z1 z1Var = (z1) O;
                w1Var.a(z1Var, null, z10);
                w1Var.d.a(this.w.w.contains(Integer.valueOf(z1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.fm0, s4.g0
    public final void l() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(a2.f(this.s).e());
        X(false);
        this.w.O();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View w1Var;
        Context context = this.v;
        if (i10 == 0) {
            w1Var = new w1(context, this.w.a, false);
        } else if (i10 != 1) {
            w1Var = new View(context);
            w1Var.setTag(-33024);
        } else {
            w1Var = new View(context);
            w1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
            w1Var.setTag(-33024);
        }
        return new tl0(w1Var);
    }
}
