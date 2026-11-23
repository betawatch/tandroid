package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ne(int i7) {
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
                int i7 = qn.s1;
                break;
            case 4:
                PhotoViewer.p1().z0(false, false);
                break;
            case 5:
                PhotoViewer.p1().z0(false, false);
                break;
            case 6:
                int[] iArr = mt.d2;
                break;
            case 7:
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
                break;
            case 8:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.ks.e().k(98, 512);
                break;
            case 10:
                org.telegram.messenger.ks.e().k(99, 512);
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
                int i10 = xy0.f;
                break;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                nz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 14:
                SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                nz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 15:
                int i11 = z11.m0;
                break;
            case 16:
                org.telegram.messenger.pv.h();
                break;
            case 17:
                org.telegram.ui.Components.voip.f0.h();
                break;
            case 18:
                org.telegram.ui.Components.voip.k1.k();
                break;
            case 19:
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
                break;
            case 20:
                org.telegram.ui.Components.voip.i2.b();
                break;
            case 21:
                org.telegram.ui.Components.voip.j2.d();
                break;
            case 22:
                fi.n5.J0();
                break;
            case 23:
                org.telegram.ui.e40 e40Var = org.telegram.ui.e40.C5;
                if (e40Var != null) {
                    e40Var.show();
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

    public /* synthetic */ ne(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }
}
