package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ d(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        z zVar = this.b;
        switch (i7) {
            case 0:
                d dVar = zVar.s0;
                int currentTime = zVar.getConnectionsManager().getCurrentTime();
                zVar.a0.setEnabled(zVar.Y > 0 || zVar.P > currentTime);
                if (currentTime >= zVar.P) {
                    zVar.a0.g(null, true);
                    zVar.a0.i(dd.Y0(false, zVar.X ? org.telegram.messenger.id.M0(2131752969, null) : org.telegram.messenger.id.H(' ', "BotStarsButtonWithdrawShort", (int) zVar.Y), zVar.c0), true, true);
                    break;
                } else {
                    zVar.a0.i(org.telegram.messenger.id.M0(2131752968, null), true, true);
                    if (zVar.r0 == null) {
                        zVar.r0 = new SpannableStringBuilder("l");
                        wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                        wpVar.n = 1;
                        zVar.r0.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) zVar.r0).append((CharSequence) z.w0(zVar.P - currentTime));
                    zVar.a0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.cc ccVar = zVar.j0;
                    if (ccVar != null) {
                        org.telegram.ui.Components.gb gbVar = ccVar.e;
                        if ((gbVar instanceof org.telegram.ui.Components.kb) && gbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{z.w0(zVar.P - currentTime)}, ((org.telegram.ui.Components.kb) zVar.j0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(dVar);
                    org.telegram.messenger.g0.i3(dVar, 1000L);
                    break;
                }
                break;
            case 1:
                z.b0(zVar);
                break;
            case 2:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.id.M0(2131752956, null));
                break;
            case 3:
                z.Z(zVar);
                break;
            case 4:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.id.M0(2131753029, null));
                break;
            case 5:
                vf.c.t(zVar.getParentActivity(), org.telegram.messenger.id.M0(2131753049, null));
                break;
            default:
                zVar.b0.setLoading(false);
                break;
        }
    }
}
