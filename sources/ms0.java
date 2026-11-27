// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ms0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ ms0(at0 at0Var, byte b) {
        this.a = b;
        this.b = at0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        at0 at0Var = this.b;
        switch (b) {
            case 0:
                ms0 ms0Var = at0Var.t0;
                int currentTime = at0Var.getConnectionsManager().getCurrentTime();
                at0Var.b0.setEnabled(at0Var.Z > 0 || at0Var.Q > currentTime);
                int i = at0Var.Q;
                ub ubVar = at0Var.b0;
                if (currentTime >= i) {
                    ubVar.g(null, true);
                    at0Var.b0.i(nza.Z0(false, at0Var.Y ? ob6.M0(2131752950, null) : ob6.H(' ', "BotStarsButtonWithdrawShort", (int) at0Var.Z), at0Var.d0), true, true);
                    break;
                } else {
                    ubVar.i(ob6.M0(2131752949, null), true, true);
                    if (at0Var.s0 == null) {
                        at0Var.s0 = new SpannableStringBuilder("l");
                        wm2 wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
                        wm2Var.n = 1;
                        at0Var.s0.setSpan(wm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) at0Var.s0).append((CharSequence) at0.x0(at0Var.Q - currentTime));
                    at0Var.b0.g(spannableStringBuilder, true);
                    v21 v21Var = at0Var.k0;
                    if (v21Var != null) {
                        z11 z11Var = v21Var.e;
                        if ((z11Var instanceof c21) && z11Var.isAttachedToWindow()) {
                            uh9.r(null, null, 2131752933, new Object[]{at0.x0(at0Var.Q - currentTime)}, ((c21) at0Var.k0.e).b);
                        }
                    }
                    hl.r(ms0Var);
                    hl.d3(ms0Var, 1000L);
                    break;
                }
                break;
            case 1:
                at0Var.t0();
                break;
            case 2:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131752937, null));
                break;
            case 3:
                at0Var.r0();
                break;
            case 4:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131753013, null));
                break;
            case 5:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131753033, null));
                break;
            default:
                at0Var.c0.setLoading(false);
                break;
        }
    }
}
