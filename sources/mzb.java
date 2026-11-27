// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mzb extends c79 {
    public final /* synthetic */ ozb c;

    public mzb(ozb ozbVar) {
        this.c = ozbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 3 || i == 2;
    }

    @Override // j79
    public final int b() {
        ozb ozbVar = this.c;
        if (ozbVar.o0) {
            return 0;
        }
        return ozbVar.n0;
    }

    @Override // j79
    public final int d(int i) {
        ozb ozbVar = this.c;
        if (i == ozbVar.k0 || i == ozbVar.h0) {
            return 1;
        }
        if (i < ozbVar.i0 || i >= ozbVar.j0) {
            return (i < ozbVar.l0 || i >= ozbVar.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        View view = f89Var.a;
        ozb ozbVar = this.c;
        tzb tzbVar = ozbVar.w0;
        if (d(i) == 1) {
            p55 p55Var = (p55) view;
            if (i == ozbVar.h0) {
                p55Var.setText(ob6.M0(2131743651, null));
            }
            if (i == ozbVar.k0) {
                p55Var.setText(ob6.M0(2131745484, null));
            }
        }
        if (d(i) == 2) {
            zxb zxbVar = (zxb) view;
            zxbVar.setTopic((TLRPC.TL_forumTopic) ozbVar.f0.get(i - ozbVar.i0));
            zxbVar.d = i != ozbVar.j0 - 1;
        }
        if (d(i) == 3) {
            r47 r47Var = (r47) ozbVar.g0.get(i - ozbVar.l0);
            qzb qzbVar = (qzb) view;
            qzbVar.b5 = i != ozbVar.m0 - 1;
            i2 = ((e) tzbVar).currentAccount;
            long b2 = r47.b2(i2, r47Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = tzbVar.s.f(tzbVar.a, b2);
            if (f != null) {
                qzbVar.g0(f, r47.B0(r47Var.k), r47Var, false, false);
                qzbVar.setTopicIcon(f);
            } else {
                cc4.b("cant find topic " + b2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [of3, qzb] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        tzb tzbVar = this.c.w0;
        if (i == 1) {
            frameLayout = new p55(viewGroup.getContext(), null);
        } else if (i == 2) {
            frameLayout = new zxb(viewGroup.getContext());
        } else {
            if (i != 3) {
                xi4.l("unsupported view type");
                return null;
            }
            ?? qzbVar = new qzb(tzbVar, viewGroup.getContext(), true);
            z = ((e) tzbVar).inPreviewMode;
            qzbVar.l0 = z;
            frameLayout = qzbVar;
        }
        frameLayout.setLayoutParams(new r79(-1, -2));
        return new n69(frameLayout);
    }
}
