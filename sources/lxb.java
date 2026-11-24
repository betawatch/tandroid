// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lxb extends q59 {
    public final /* synthetic */ nxb c;

    public lxb(nxb nxbVar) {
        this.c = nxbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 2;
    }

    @Override // y59
    public final int b() {
        nxb nxbVar = this.c;
        if (nxbVar.o0) {
            return 0;
        }
        return nxbVar.n0;
    }

    @Override // y59
    public final int d(int i) {
        nxb nxbVar = this.c;
        if (i == nxbVar.k0 || i == nxbVar.h0) {
            return 1;
        }
        if (i < nxbVar.i0 || i >= nxbVar.j0) {
            return (i < nxbVar.l0 || i >= nxbVar.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        View view = u69Var.a;
        nxb nxbVar = this.c;
        sxb sxbVar = nxbVar.w0;
        if (d(i) == 1) {
            l55 l55Var = (l55) view;
            if (i == nxbVar.h0) {
                l55Var.setText(jb6.M0(2131743683, null));
            }
            if (i == nxbVar.k0) {
                l55Var.setText(jb6.M0(2131745490, null));
            }
        }
        if (d(i) == 2) {
            zvb zvbVar = (zvb) view;
            zvbVar.setTopic((TLRPC.TL_forumTopic) nxbVar.f0.get(i - nxbVar.i0));
            zvbVar.d = i != nxbVar.j0 - 1;
        }
        if (d(i) == 3) {
            k47 k47Var = (k47) nxbVar.g0.get(i - nxbVar.l0);
            pxb pxbVar = (pxb) view;
            pxbVar.b5 = i != nxbVar.m0 - 1;
            i2 = ((d) sxbVar).currentAccount;
            long b2 = k47.b2(i2, k47Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = sxbVar.s.f(sxbVar.a, b2);
            if (f != null) {
                pxbVar.g0(f, k47.B0(k47Var.k), k47Var, false, false);
                pxbVar.setTopicIcon(f);
            } else {
                fc4.b("cant find topic " + b2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [hg3, pxb] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        sxb sxbVar = this.c.w0;
        if (i == 1) {
            frameLayout = new l55(viewGroup.getContext(), null);
        } else if (i == 2) {
            frameLayout = new zvb(viewGroup.getContext());
        } else {
            if (i != 3) {
                zo4.k("unsupported view type");
                return null;
            }
            ?? pxbVar = new pxb(sxbVar, viewGroup.getContext(), true);
            z = ((d) sxbVar).inPreviewMode;
            pxbVar.l0 = z;
            frameLayout = pxbVar;
        }
        frameLayout.setLayoutParams(new g69(-1, -2));
        return new b59(frameLayout);
    }
}
