// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ly0 extends c79 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ly0(m22 m22Var, Context context) {
        this.c = (byte) 1;
        this.f = m22Var;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // j79
    public final void B(l79 l79Var) {
        switch (this.c) {
            case 0:
                ((c79) this.e).B(new ky0(this, l79Var));
                break;
            default:
                super.B(l79Var);
                break;
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
                return ((c79) this.e).D(f89Var);
            default:
                return f89Var.f == 0;
        }
    }

    @Override // j79
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((c79) obj).b() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // j79
    public final int d(int i) {
        switch (this.c) {
            case 0:
                ny0 ny0Var = (ny0) this.f;
                if (i == (ny0Var.J1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((c79) this.e).d(i - (!ny0Var.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        byte b = this.c;
        Object obj = this.e;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                ny0 ny0Var = (ny0) callback;
                if (i != (ny0Var.J1 ? b() - 1 : 0)) {
                    ((c79) obj).t(f89Var, i - (!ny0Var.J1 ? 1 : 0));
                    break;
                }
                break;
            default:
                evc evcVar = (evc) f89Var.a;
                evcVar.d(1, false, false);
                evcVar.setSize(((m22) callback).r);
                evcVar.e(((ArrayList) obj).get(i), 1, 0, null);
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                return i == -1000 ? new n69(new tb((ny0) this.f, context)) : ((c79) this.e).x(viewGroup, i);
            default:
                l22 l22Var = new l22(this, context);
                l22Var.b = false;
                return new n69(l22Var);
        }
    }

    public ly0(ny0 ny0Var, c79 c79Var, Context context) {
        this.c = (byte) 0;
        this.f = ny0Var;
        this.e = c79Var;
        this.d = context;
    }
}
