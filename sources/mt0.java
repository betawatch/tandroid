// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ mt0(au0 au0Var, byte b) {
        this.a = b;
        this.b = au0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        au0 au0Var = this.b;
        switch (b) {
            case 0:
                mt0 mt0Var = au0Var.t0;
                int currentTime = au0Var.getConnectionsManager().getCurrentTime();
                au0Var.b0.setEnabled(au0Var.Z > 0 || au0Var.Q > currentTime);
                int i = au0Var.Q;
                tb tbVar = au0Var.b0;
                if (currentTime >= i) {
                    tbVar.g(null, true);
                    au0Var.b0.i(nxa.Z0(false, au0Var.Y ? jb6.M0(2131752922, null) : jb6.H(' ', "BotStarsButtonWithdrawShort", (int) au0Var.Z), au0Var.d0), true, true);
                    break;
                } else {
                    tbVar.i(jb6.M0(2131752921, null), true, true);
                    if (au0Var.s0 == null) {
                        au0Var.s0 = new SpannableStringBuilder("l");
                        pn2 pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
                        pn2Var.n = 1;
                        au0Var.s0.setSpan(pn2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) au0Var.s0).append((CharSequence) au0.x0(au0Var.Q - currentTime));
                    au0Var.b0.g(spannableStringBuilder, true);
                    u31 u31Var = au0Var.k0;
                    if (u31Var != null) {
                        y21 y21Var = u31Var.e;
                        if ((y21Var instanceof b31) && y21Var.isAttachedToWindow()) {
                            hg9.q(null, null, 2131752905, new Object[]{au0.x0(au0Var.Q - currentTime)}, ((b31) au0Var.k0.e).b);
                        }
                    }
                    gm.r(mt0Var);
                    gm.d3(mt0Var, 1000L);
                    break;
                }
                break;
            case 1:
                au0Var.u0();
                break;
            case 2:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131752909, null));
                break;
            case 3:
                au0Var.s0();
                break;
            case 4:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131752985, null));
                break;
            case 5:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131753005, null));
                break;
            default:
                au0Var.c0.setLoading(false);
                break;
        }
    }
}
