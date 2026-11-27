// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oi1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ oi1(ij1 ij1Var, int i, byte b) {
        this.a = b;
        this.b = ij1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long f;
        byte b = this.a;
        int i = this.c;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                m01.u(ij1Var.getContext(), ob6.M0(i, null));
                break;
            case 1:
                oi1 oi1Var = ij1Var.f1;
                xs0 xs0Var = ij1Var.O0;
                v21.e();
                if (ij1Var.D0.amount < uc7.s1(i).l4.y2.f()) {
                    ij1Var.M0 = true;
                    f = ij1Var.D0.amount;
                    ij1Var.N0 = f;
                } else {
                    ij1Var.M0 = false;
                    f = uc7.s1(i).l4.y2.f();
                    ij1Var.N0 = f;
                }
                ij1Var.L0 = true;
                xs0Var.setText(Long.toString(f));
                xs0Var.setSelection(xs0Var.getText().length());
                ij1Var.L0 = false;
                hl.r(oi1Var);
                oi1Var.run();
                break;
            default:
                oi1 oi1Var2 = ij1Var.f1;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                xi1 xi1Var = ij1Var.G0;
                xi1Var.setEnabled(ij1Var.N0 > 0 || ij1Var.B0 > currentTime);
                if (currentTime >= ij1Var.B0) {
                    xi1Var.g(null, true);
                    xi1Var.i(nza.Z0(false, ij1Var.M0 ? ob6.M0(2131748122, null) : ob6.H(' ', "MonetizationStarsWithdraw", (int) ij1Var.N0), ij1Var.H0), true, true);
                    break;
                } else {
                    xi1Var.i(ob6.M0(2131748121, null), true, true);
                    if (ij1Var.e1 == null) {
                        ij1Var.e1 = new SpannableStringBuilder("l");
                        wm2 wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
                        wm2Var.n = 1;
                        ij1Var.e1.setSpan(wm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ij1Var.e1).append((CharSequence) at0.x0(ij1Var.B0 - currentTime));
                    xi1Var.g(spannableStringBuilder, true);
                    v21 v21Var = ij1Var.P0;
                    if (v21Var != null) {
                        z11 z11Var = v21Var.e;
                        if ((z11Var instanceof c21) && z11Var.isAttachedToWindow()) {
                            uh9.r(null, null, 2131752933, new Object[]{at0.x0(ij1Var.B0 - currentTime)}, ((c21) ij1Var.P0.e).b);
                        }
                    }
                    hl.r(oi1Var2);
                    hl.d3(oi1Var2, 1000L);
                    break;
                }
                break;
        }
    }
}
