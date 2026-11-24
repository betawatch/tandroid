// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kz0 extends q59 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public kz0(h32 h32Var, Context context) {
        this.c = (byte) 1;
        this.f = h32Var;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // y59
    public final void B(a69 a69Var) {
        switch (this.c) {
            case 0:
                ((q59) this.e).B(new jz0(this, a69Var));
                break;
            default:
                super.B(a69Var);
                break;
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
                return ((q59) this.e).D(u69Var);
            default:
                return u69Var.f == 0;
        }
    }

    @Override // y59
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((q59) obj).b() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // y59
    public final int d(int i) {
        switch (this.c) {
            case 0:
                mz0 mz0Var = (mz0) this.f;
                if (i == (mz0Var.J1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((q59) this.e).d(i - (!mz0Var.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        byte b = this.c;
        Object obj = this.e;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                mz0 mz0Var = (mz0) callback;
                if (i != (mz0Var.J1 ? b() - 1 : 0)) {
                    ((q59) obj).t(u69Var, i - (!mz0Var.J1 ? 1 : 0));
                    break;
                }
                break;
            default:
                ssc sscVar = (ssc) u69Var.a;
                sscVar.d(1, false, false);
                sscVar.setSize(((h32) callback).r);
                sscVar.e(((ArrayList) obj).get(i), 1, 0, null);
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                return i == -1000 ? new b59(new sb((mz0) this.f, context)) : ((q59) this.e).x(viewGroup, i);
            default:
                g32 g32Var = new g32(this, context);
                g32Var.b = false;
                return new b59(g32Var);
        }
    }

    public kz0(mz0 mz0Var, q59 q59Var, Context context) {
        this.c = (byte) 0;
        this.f = mz0Var;
        this.e = q59Var;
        this.d = context;
    }
}
