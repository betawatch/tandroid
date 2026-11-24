// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kvb extends n39 {
    public final /* synthetic */ mvb c;

    public kvb(mvb mvbVar) {
        this.c = mvbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 3 || i == 2;
    }

    @Override // w39
    public final int b() {
        mvb mvbVar = this.c;
        if (mvbVar.o0) {
            return 0;
        }
        return mvbVar.n0;
    }

    @Override // w39
    public final int d(int i) {
        mvb mvbVar = this.c;
        if (i == mvbVar.k0 || i == mvbVar.h0) {
            return 1;
        }
        if (i < mvbVar.i0 || i >= mvbVar.j0) {
            return (i < mvbVar.l0 || i >= mvbVar.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        View view = s49Var.a;
        mvb mvbVar = this.c;
        qvb qvbVar = mvbVar.w0;
        if (d(i) == 1) {
            l35 l35Var = (l35) view;
            if (i == mvbVar.h0) {
                l35Var.setText(k96.M0(2131743757, null));
            }
            if (i == mvbVar.k0) {
                l35Var.setText(k96.M0(2131745564, null));
            }
        }
        if (d(i) == 2) {
            ytb ytbVar = (ytb) view;
            ytbVar.setTopic((TLRPC.TL_forumTopic) mvbVar.f0.get(i - mvbVar.i0));
            ytbVar.d = i != mvbVar.j0 - 1;
        }
        if (d(i) == 3) {
            k27 k27Var = (k27) mvbVar.g0.get(i - mvbVar.l0);
            nvb nvbVar = (nvb) view;
            nvbVar.b5 = i != mvbVar.m0 - 1;
            i2 = ((d) qvbVar).currentAccount;
            long b2 = k27.b2(i2, k27Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = qvbVar.s.f(qvbVar.a, b2);
            if (f != null) {
                nvbVar.h0(f, k27.B0(k27Var.k), k27Var, false, false);
                nvbVar.setTopicIcon(f);
            } else {
                fa4.b("cant find topic " + b2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [nvb, ue3] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        qvb qvbVar = this.c.w0;
        if (i == 1) {
            frameLayout = new l35(viewGroup.getContext(), null);
        } else if (i == 2) {
            frameLayout = new ytb(viewGroup.getContext());
        } else {
            if (i != 3) {
                wn4.j("unsupported view type");
                return null;
            }
            ?? nvbVar = new nvb(qvbVar, viewGroup.getContext(), true);
            z = ((d) qvbVar).inPreviewMode;
            nvbVar.l0 = z;
            frameLayout = nvbVar;
        }
        frameLayout.setLayoutParams(new e49(-1, -2));
        return new y29(frameLayout);
    }
}
