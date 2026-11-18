package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ c(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        t tVar = this.b;
        switch (i7) {
            case 0:
                c cVar = tVar.t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                tVar.b0.setEnabled(tVar.Z > 0 || tVar.Q > currentTime);
                if (currentTime >= tVar.Q) {
                    tVar.b0.g(null, true);
                    tVar.b0.i(pb.Z0(false, tVar.Y ? gd.M0(2131752958, null) : gd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z), tVar.d0), true, true);
                    break;
                } else {
                    tVar.b0.i(gd.M0(2131752957, null), true, true);
                    if (tVar.s0 == null) {
                        tVar.s0 = new SpannableStringBuilder("l");
                        lq lqVar = new lq(R.drawable.mini_switch_lock, 0);
                        lqVar.n = 1;
                        tVar.s0.setSpan(lqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = tVar.k0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752941, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.ob) tVar.k0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.h3(cVar, 1000L);
                    break;
                }
                break;
            case 1:
                t.b0(tVar);
                break;
            case 2:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131752945, null));
                break;
            case 3:
                t.Z(tVar);
                break;
            case 4:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131753018, null));
                break;
            case 5:
                vf.c.t(tVar.getParentActivity(), gd.M0(2131753038, null));
                break;
            default:
                tVar.c0.setLoading(false);
                break;
        }
    }
}
