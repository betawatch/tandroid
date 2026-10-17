package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g0 extends hm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ i0 f;

    public g0(i0 i0Var, Context context) {
        this.f = i0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        this.f.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        Object obj;
        if (b1Var.f != 0) {
            return;
        }
        u1 u1Var = (u1) b1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof x1) {
                    return;
                }
                x1 x1Var = (x1) obj;
                u1Var.a(x1Var, this.e, z10);
                u1Var.d.a(this.f.w.contains(Integer.valueOf(x1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof x1) {
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u1Var;
        Context context = this.c;
        if (i10 == 0) {
            u1Var = new u1(context, this.f.a, false);
        } else if (i10 != 1) {
            u1Var = new View(context);
            u1Var.setTag(-33024);
        } else {
            u1Var = new View(context);
            u1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
            u1Var.setTag(-33024);
        }
        return new sl0(u1Var);
    }
}
