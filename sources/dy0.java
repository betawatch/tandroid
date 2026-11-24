// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dy0 extends n39 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public dy0(v12 v12Var, Context context) {
        this.c = (byte) 1;
        this.f = v12Var;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // w39
    public final void B(y39 y39Var) {
        switch (this.c) {
            case 0:
                ((n39) this.e).B(new cy0(this, y39Var));
                break;
            default:
                super.B(y39Var);
                break;
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
                return ((n39) this.e).D(s49Var);
            default:
                return s49Var.f == 0;
        }
    }

    @Override // w39
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((n39) obj).b() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // w39
    public final int d(int i) {
        switch (this.c) {
            case 0:
                fy0 fy0Var = (fy0) this.f;
                if (i == (fy0Var.J1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((n39) this.e).d(i - (!fy0Var.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        byte b = this.c;
        Object obj = this.e;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                fy0 fy0Var = (fy0) callback;
                if (i != (fy0Var.J1 ? b() - 1 : 0)) {
                    ((n39) obj).t(s49Var, i - (!fy0Var.J1 ? 1 : 0));
                    break;
                }
                break;
            default:
                qqc qqcVar = (qqc) s49Var.a;
                qqcVar.d(1, false, false);
                qqcVar.setSize(((v12) callback).r);
                qqcVar.e(((ArrayList) obj).get(i), 1, 0, null);
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                return i == -1000 ? new y29(new sb((fy0) this.f, context)) : ((n39) this.e).x(viewGroup, i);
            default:
                u12 u12Var = new u12(this, context);
                u12Var.b = false;
                return new y29(u12Var);
        }
    }

    public dy0(fy0 fy0Var, n39 n39Var, Context context) {
        this.c = (byte) 0;
        this.f = fy0Var;
        this.e = n39Var;
        this.d = context;
    }
}
