package ci;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ d(v vVar, int i3) {
        this.a = i3;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        v vVar = this.b;
        switch (i3) {
            case 0:
                d dVar = vVar.t0;
                int currentTime = vVar.getConnectionsManager().getCurrentTime();
                vVar.b0.setEnabled(vVar.Z > 0 || vVar.Q > currentTime);
                if (currentTime >= vVar.Q) {
                    vVar.b0.g(null, true);
                    vVar.b0.i(wb.Y0(false, vVar.Y ? bd.M0(2131752969, null) : bd.H(' ', "BotStarsButtonWithdrawShort", (int) vVar.Z), vVar.d0), true, true);
                    break;
                } else {
                    vVar.b0.i(bd.M0(2131752968, null), true, true);
                    if (vVar.s0 == null) {
                        vVar.s0 = new SpannableStringBuilder("l");
                        wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                        wpVar.n = 1;
                        vVar.s0.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) vVar.s0).append((CharSequence) v.w0(vVar.Q - currentTime));
                    vVar.b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.ac acVar = vVar.k0;
                    if (acVar != null) {
                        org.telegram.ui.Components.fb fbVar = acVar.e;
                        if ((fbVar instanceof org.telegram.ui.Components.ib) && fbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{v.w0(vVar.Q - currentTime)}, ((org.telegram.ui.Components.ib) vVar.k0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(dVar);
                    org.telegram.messenger.g0.i3(dVar, 1000L);
                    break;
                }
                break;
            case 1:
                v.b0(vVar);
                break;
            case 2:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131752956, null));
                break;
            case 3:
                v.Z(vVar);
                break;
            case 4:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131753029, null));
                break;
            case 5:
                sf.c.t(vVar.getParentActivity(), bd.M0(2131753049, null));
                break;
            default:
                vVar.c0.setLoading(false);
                break;
        }
    }
}
