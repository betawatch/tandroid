// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class es0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss0 b;

    public /* synthetic */ es0(ss0 ss0Var, byte b) {
        this.a = b;
        this.b = ss0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ss0 ss0Var = this.b;
        switch (b) {
            case 0:
                es0 es0Var = ss0Var.t0;
                int currentTime = ss0Var.getConnectionsManager().getCurrentTime();
                ss0Var.b0.setEnabled(ss0Var.Z > 0 || ss0Var.Q > currentTime);
                int i = ss0Var.Q;
                tb tbVar = ss0Var.b0;
                if (currentTime >= i) {
                    tbVar.g(null, true);
                    ss0Var.b0.i(jva.Y0(false, ss0Var.Y ? k96.M0(2131752957, null) : k96.H(' ', "BotStarsButtonWithdrawShort", (int) ss0Var.Z), ss0Var.d0), true, true);
                    break;
                } else {
                    tbVar.i(k96.M0(2131752956, null), true, true);
                    if (ss0Var.s0 == null) {
                        ss0Var.s0 = new SpannableStringBuilder("l");
                        cm2 cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
                        cm2Var.n = 1;
                        ss0Var.s0.setSpan(cm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ss0Var.s0).append((CharSequence) ss0.w0(ss0Var.Q - currentTime));
                    ss0Var.b0.g(spannableStringBuilder, true);
                    m21 m21Var = ss0Var.k0;
                    if (m21Var != null) {
                        q11 q11Var = m21Var.e;
                        if ((q11Var instanceof t11) && q11Var.isAttachedToWindow()) {
                            de9.r(null, null, 2131752940, new Object[]{ss0.w0(ss0Var.Q - currentTime)}, ((t11) ss0Var.k0.e).b);
                        }
                    }
                    gl.r(es0Var);
                    gl.d3(es0Var, 1000L);
                    break;
                }
                break;
            case 1:
                ss0Var.t0();
                break;
            case 2:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131752944, null));
                break;
            case 3:
                ss0Var.r0();
                break;
            case 4:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131753017, null));
                break;
            case 5:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131753037, null));
                break;
            default:
                ss0Var.c0.setLoading(false);
                break;
        }
    }
}
