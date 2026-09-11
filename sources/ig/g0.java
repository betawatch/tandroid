package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class g0 extends kl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ i0 f;

    public g0(i0 i0Var, Context context) {
        this.f = i0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        this.f.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        Object obj;
        if (c1Var.f != 0) {
            return;
        }
        x1 x1Var = (x1) c1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof a2) {
                    return;
                }
                a2 a2Var = (a2) obj;
                x1Var.a(a2Var, this.e, z10);
                x1Var.d.a(this.f.w.contains(Integer.valueOf(a2Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof a2) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x1Var;
        Context context = this.c;
        if (i10 == 0) {
            x1Var = new x1(context, this.f.a, false);
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
