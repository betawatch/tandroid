// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g22 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public f22 f;
    public int h;
    public final /* synthetic */ k22 n;

    public g22(k22 k22Var, Context context) {
        this.n = k22Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return this.d.get(i2);
    }

    @Override // w39
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // w39
    public final void f() {
        super.f();
        this.n.S();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLRPC.User user;
        if (s49Var.f == 0) {
            j22 j22Var = (j22) s49Var.a;
            boolean z = i != b() + (-2);
            Object E = E(i);
            if (E instanceof nu2) {
                nu2 nu2Var = (nu2) E;
                user = nu2Var.m;
                if (user == null) {
                    j22Var.setCurrentId(nu2Var.a);
                    j22Var.a(null, (CharSequence) this.e.get(i - 1), new c22(nu2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                j22Var.a(user, (CharSequence) this.e.get(i - 1), new d22(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(a22.a(E));
            wf2 wf2Var = j22Var.d;
            if (wf2Var.getVisibility() != 0) {
                wf2Var.setVisibility(0);
            }
            wf2Var.a(containsKey, false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View j22Var;
        Context context = this.c;
        if (i == 0) {
            j22Var = new j22(context, this.n.a);
        } else if (i != 1) {
            j22Var = new View(context);
            j22Var.setTag(-33024);
        } else {
            j22Var = new View(context);
            j22Var.setLayoutParams(new e49(-1, gl.L(56.0f)));
            j22Var.setTag(-33024);
        }
        return new y29(j22Var);
    }
}
