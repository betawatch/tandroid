package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l10 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ l10(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hc a02;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.qs.e().k(98, 512);
                break;
            case 2:
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            case 3:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), d2Var);
                    break;
                }
                break;
            case 4:
                int i7 = my0.f;
                break;
            case 5:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                cz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 6:
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                cz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 7:
                int i10 = g11.l0;
                break;
            case 8:
                org.telegram.messenger.vv.h();
                break;
            case 9:
                org.telegram.ui.Components.voip.e0.m();
                break;
            case 10:
                org.telegram.ui.Components.voip.g1.o();
                break;
            case 11:
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
                break;
            case 12:
                org.telegram.ui.Components.voip.e2.b();
                break;
            case 13:
                org.telegram.ui.Components.voip.f2.d();
                break;
            case 14:
                di.w5.I0();
                break;
            case 15:
                org.telegram.ui.c40 c40Var = org.telegram.ui.c40.u5;
                if (c40Var != null) {
                    c40Var.show();
                    break;
                }
                break;
            case 16:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 17:
                String str = LaunchActivity.B1;
                break;
            case 18:
                String str2 = LaunchActivity.B1;
                break;
            case 19:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.t0.E = false;
                org.telegram.messenger.t0.G = System.currentTimeMillis();
                break;
            case 20:
                break;
            case 21:
                CallReceiver.a();
                break;
            case 22:
                CallReceiver.a();
                break;
            case 23:
                hc.X().N(org.telegram.messenger.hd.M0(2131745862, null), org.telegram.messenger.hd.M0(2131751106, null)).j();
                break;
            case 24:
                hc.X().N(org.telegram.messenger.hd.M0(2131745862, null), org.telegram.messenger.hd.M0(2131751106, null)).j();
                break;
            case 25:
                Drawable[] drawableArr = PhotoViewer.Y8;
                break;
            case 26:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && (a02 = hc.a0(T)) != null) {
                    cc I = a02.I(R.raw.msg_antispam, org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746186, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 27:
                int i11 = org.telegram.ui.t31.V1;
                break;
            case 28:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            default:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l10(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }
}
