package lg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f0 extends sj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ h0 f;

    public f0(h0 h0Var, Context context) {
        this.f = h0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return i3 == b() - 1 ? 2 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        this.f.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        Object obj;
        if (d1Var.f != 0) {
            return;
        }
        q1 q1Var = (q1) d1Var.a;
        boolean z10 = i3 != b() + (-2);
        int i10 = i3 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                obj = arrayList.get(i10);
                if (obj instanceof t1) {
                    return;
                }
                t1 t1Var = (t1) obj;
                q1Var.a(t1Var, this.e, z10);
                q1Var.d.a(this.f.x.contains(Integer.valueOf(t1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof t1) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q1Var;
        Context context = this.c;
        if (i3 == 0) {
            q1Var = new q1(context, this.f.a, false);
        } else if (i3 != 1) {
            q1Var = new View(context);
            q1Var.setTag(-33024);
        } else {
            q1Var = new View(context);
            q1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            q1Var.setTag(-33024);
        }
        return new bj0(q1Var);
    }
}
