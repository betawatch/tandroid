package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e0 extends tj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ g0 f;

    public e0(g0 g0Var, Context context) {
        this.f = g0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        this.f.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        Object obj;
        if (e1Var.f != 0) {
            return;
        }
        q1 q1Var = (q1) e1Var.a;
        boolean z10 = i7 != b() + (-2);
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                obj = arrayList.get(i10);
                if (obj instanceof u1) {
                    return;
                }
                u1 u1Var = (u1) obj;
                q1Var.a(u1Var, this.e, z10);
                q1Var.d.a(this.f.x.contains(Integer.valueOf(u1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof u1) {
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View q1Var;
        Context context = this.c;
        if (i7 == 0) {
            q1Var = new q1(context, this.f.a, false);
        } else if (i7 != 1) {
            q1Var = new View(context);
            q1Var.setTag(-33024);
        } else {
            q1Var = new View(context);
            q1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            q1Var.setTag(-33024);
        }
        return new cj0(q1Var);
    }
}
