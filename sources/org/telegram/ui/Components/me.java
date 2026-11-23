package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ me(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 1:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 2:
                break;
            case 3:
                int i7 = tn.s1;
                break;
            case 4:
                PhotoViewer.p1().z0(false, false);
                break;
            case 5:
                PhotoViewer.p1().z0(false, false);
                break;
            case 6:
                int[] iArr = ot.d2;
                break;
            case 7:
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
                break;
            case 8:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.ls.e().k(98, 512);
                break;
            case 10:
                org.telegram.messenger.ls.e().k(99, 512);
                break;
            case 11:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), e2Var);
                    break;
                }
                break;
            case 12:
                int i10 = yy0.f;
                break;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                oz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 14:
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.g1().edit();
                oz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 15:
                int i11 = a21.m0;
                break;
            case 16:
                org.telegram.messenger.qv.h();
                break;
            case 17:
                org.telegram.ui.Components.voip.e0.m();
                break;
            case 18:
                org.telegram.ui.Components.voip.j1.o();
                break;
            case 19:
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
                break;
            case 20:
                org.telegram.ui.Components.voip.h2.b();
                break;
            case 21:
                org.telegram.ui.Components.voip.i2.g();
                break;
            case 22:
                fi.n5.J0();
                break;
            case 23:
                org.telegram.ui.f40 f40Var = org.telegram.ui.f40.C5;
                if (f40Var != null) {
                    f40Var.show();
                    break;
                }
                break;
            case 24:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 25:
                String str = LaunchActivity.C1;
                break;
            case 26:
                String str2 = LaunchActivity.C1;
                break;
            case 27:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                break;
            case 28:
                break;
            default:
                CallReceiver.a();
                break;
        }
    }

    public /* synthetic */ me(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }
}
