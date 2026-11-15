package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                    tVar.b0.i(mb.Y0(false, tVar.Y ? hd.M0(2131752969, null) : hd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z), tVar.d0), true, true);
                    break;
                } else {
                    tVar.b0.i(hd.M0(2131752968, null), true, true);
                    if (tVar.s0 == null) {
                        tVar.s0 = new SpannableStringBuilder("l");
                        eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                        eqVar.n = 1;
                        tVar.s0.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.s0).append((CharSequence) t.w0(tVar.Q - currentTime));
                    tVar.b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.xb xbVar = tVar.k0;
                    if (xbVar != null) {
                        org.telegram.ui.Components.cb cbVar = xbVar.e;
                        if ((cbVar instanceof org.telegram.ui.Components.fb) && cbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.q(null, null, 2131752952, new Object[]{t.w0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.fb) tVar.k0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.i3(cVar, 1000L);
                    break;
                }
                break;
            case 1:
                t.b0(tVar);
                break;
            case 2:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131752956, null));
                break;
            case 3:
                t.Z(tVar);
                break;
            case 4:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131753029, null));
                break;
            case 5:
                vf.c.t(tVar.getParentActivity(), hd.M0(2131753049, null));
                break;
            default:
                tVar.c0.setLoading(false);
                break;
        }
    }
}
