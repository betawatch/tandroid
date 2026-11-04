package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ go(int i3) {
        this.a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc a02;
        switch (this.a) {
            case 0:
                PhotoViewer.v1().H0(false, false);
                break;
            case 1:
                PhotoViewer.v1().H0(false, false);
                break;
            case 2:
                int[] iArr = xs.Y1;
                break;
            case 3:
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
                break;
            case 4:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.hs.e().k(98, 512);
                break;
            case 6:
                org.telegram.messenger.hs.e().k(99, 512);
                break;
            case 7:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), b2Var);
                    break;
                }
                break;
            case 8:
                int i3 = my0.f;
                break;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                cz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 10:
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                cz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 11:
                int i10 = g11.m0;
                break;
            case 12:
                org.telegram.messenger.nv.h();
                break;
            case 13:
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
                break;
            case 14:
                org.telegram.ui.Components.voip.u1.a();
                break;
            case 15:
                ei.w5.I0();
                break;
            case 16:
                org.telegram.ui.x30 x30Var = org.telegram.ui.x30.v5;
                if (x30Var != null) {
                    x30Var.show();
                    break;
                }
                break;
            case 17:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 18:
                String str = LaunchActivity.E1;
                break;
            case 19:
                String str2 = LaunchActivity.E1;
                break;
            case 20:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                break;
            case 21:
                break;
            case 22:
                CallReceiver.a();
                break;
            case 23:
                CallReceiver.a();
                break;
            case 24:
                fc.X().N(org.telegram.messenger.bd.M0(2131745871, null), org.telegram.messenger.bd.M0(2131751106, null)).j();
                break;
            case 25:
                fc.X().N(org.telegram.messenger.bd.M0(2131745871, null), org.telegram.messenger.bd.M0(2131751106, null)).j();
                break;
            case 26:
                Drawable[] drawableArr = PhotoViewer.V8;
                break;
            case 27:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && (a02 = fc.a0(T)) != null) {
                    ac I = a02.I(R.raw.msg_antispam, org.telegram.messenger.bd.M0(2131746232, null), org.telegram.messenger.bd.M0(2131746195, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 28:
                int i11 = org.telegram.ui.j31.W1;
                break;
            default:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.F(false);
                break;
        }
    }

    public /* synthetic */ go(Object obj, int i3) {
        this.a = i3;
    }

    private final void a() {
    }
}
