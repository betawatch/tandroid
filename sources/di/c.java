package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                    tVar.b0.i(pb.Z0(false, tVar.Y ? gd.N0(2131752957, null) : gd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z), tVar.d0), true, true);
                    break;
                } else {
                    tVar.b0.i(gd.N0(2131752956, null), true, true);
                    if (tVar.s0 == null) {
                        tVar.s0 = new SpannableStringBuilder("l");
                        kq kqVar = new kq(R.drawable.mini_switch_lock, 0);
                        kqVar.n = 1;
                        tVar.s0.setSpan(kqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.fc fcVar = tVar.k0;
                    if (fcVar != null) {
                        org.telegram.ui.Components.kb kbVar = fcVar.e;
                        if ((kbVar instanceof org.telegram.ui.Components.nb) && kbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.nb) tVar.k0.e).b);
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
                vf.c.t(tVar.getParentActivity(), gd.N0(2131752944, null));
                break;
            case 3:
                t.Z(tVar);
                break;
            case 4:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753017, null));
                break;
            case 5:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753037, null));
                break;
            default:
                tVar.c0.setLoading(false);
                break;
        }
    }
}
