package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l0 extends ul0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ n0 f;

    public l0(n0 n0Var, Context context) {
        this.f = n0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        g2 g2Var = (g2) c1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof j2) {
                    return;
                }
                j2 j2Var = (j2) obj;
                g2Var.a(j2Var, this.e, z10);
                g2Var.d.a(this.f.w.contains(Integer.valueOf(j2Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof j2) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        Context context = this.c;
        if (i10 == 0) {
            g2Var = new g2(context, this.f.a, false);
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
