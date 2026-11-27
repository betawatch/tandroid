// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h39 extends j79 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ vnb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ o39 h;

    public h39(o39 o39Var, int i, Context context, vnb vnbVar, boolean z) {
        this.h = o39Var;
        this.c = i;
        this.d = context;
        this.e = vnbVar;
        this.f = z;
    }

    @Override // j79
    public final int b() {
        o39 o39Var = this.h;
        return o39Var.n.size() + ((o39Var.I.isEmpty() || uc7.s1(this.c).M3()) ? 0 : 1);
    }

    @Override // j79
    public final int d(int i) {
        return i < this.h.n.size() ? 0 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            ((e39) f89Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout e39Var;
        if (i != 0) {
            o39 o39Var = this.h;
            q37 q37Var = o39Var.K;
            if (q37Var == null) {
                o39Var.e();
            } else if (q37Var.getParent() != null) {
                ((ViewGroup) o39Var.K.getParent()).removeView(o39Var.K);
            }
            Context context = this.d;
            e39Var = new FrameLayout(context);
            View view = new View(context);
            yob.i(view, yob.K(0.06f, aob.E8), this.e);
            e39Var.addView(view, tre.c(8.0f, -1));
            e39Var.addView(o39Var.K, tre.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            e39Var = new e39(0, this.c, this.e, this.d, true, this.f);
        }
        return new n69(e39Var);
    }
}
