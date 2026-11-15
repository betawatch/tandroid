package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ih(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i7 = jn.s1;
                break;
            case 2:
                PhotoViewer.p1().z0(false, false);
                break;
            case 3:
                PhotoViewer.p1().z0(false, false);
                break;
            case 4:
                int[] iArr = ft.d2;
                break;
            case 5:
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
                break;
            case 6:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.ns.e().k(98, 512);
                break;
            case 8:
                org.telegram.messenger.ns.e().k(99, 512);
                break;
            case 9:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), c2Var);
                    break;
                }
                break;
            case 10:
                int i10 = py0.f;
                break;
            case 11:
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                fz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 12:
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                fz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 13:
                int i11 = p11.m0;
                break;
            case 14:
                org.telegram.messenger.tv.h();
                break;
            case 15:
                org.telegram.ui.Components.voip.f0.m();
                break;
            case 16:
                org.telegram.ui.Components.voip.k1.o();
                break;
            case 17:
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
                break;
            case 18:
                org.telegram.ui.Components.voip.i2.b();
                break;
            case 19:
                org.telegram.ui.Components.voip.j2.g();
                break;
            case 20:
                fi.o5.I0();
                break;
            case 21:
                org.telegram.ui.c40 c40Var = org.telegram.ui.c40.C5;
                if (c40Var != null) {
                    c40Var.show();
                    break;
                }
                break;
            case 22:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 23:
                String str = LaunchActivity.C1;
                break;
            case 24:
                String str2 = LaunchActivity.C1;
                break;
            case 25:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                break;
            case 26:
                break;
            case 27:
                CallReceiver.a();
                break;
            case 28:
                CallReceiver.a();
                break;
            default:
                cc.X().N(org.telegram.messenger.hd.M0(2131745861, null), org.telegram.messenger.hd.M0(2131751105, null)).j();
                break;
        }
    }

    public /* synthetic */ ih(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }
}
