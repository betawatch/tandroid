package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ us(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gc a02;
        switch (this.a) {
            case 0:
                int[] iArr = ys.X1;
                break;
            case 1:
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
                break;
            case 2:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.qs.e().k(98, 512);
                break;
            case 4:
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            case 5:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), d2Var);
                    break;
                }
                break;
            case 6:
                int i7 = ny0.f;
                break;
            case 7:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                dz0.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 8:
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                dz0.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 9:
                int i10 = m11.l0;
                break;
            case 10:
                org.telegram.messenger.vv.h();
                break;
            case 11:
                org.telegram.ui.Components.voip.e0.m();
                break;
            case 12:
                org.telegram.ui.Components.voip.g1.o();
                break;
            case 13:
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
                break;
            case 14:
                org.telegram.ui.Components.voip.e2.b();
                break;
            case 15:
                org.telegram.ui.Components.voip.f2.d();
                break;
            case 16:
                di.x5.I0();
                break;
            case 17:
                org.telegram.ui.f40 f40Var = org.telegram.ui.f40.x5;
                if (f40Var != null) {
                    f40Var.show();
                    break;
                }
                break;
            case 18:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 19:
                String str = LaunchActivity.B1;
                break;
            case 20:
                String str2 = LaunchActivity.B1;
                break;
            case 21:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.t0.E = false;
                org.telegram.messenger.t0.G = System.currentTimeMillis();
                break;
            case 22:
                break;
            case 23:
                CallReceiver.a();
                break;
            case 24:
                CallReceiver.a();
                break;
            case 25:
                gc.X().N(org.telegram.messenger.id.M0(2131745861, null), org.telegram.messenger.id.M0(2131751105, null)).j();
                break;
            case 26:
                gc.X().N(org.telegram.messenger.id.M0(2131745861, null), org.telegram.messenger.id.M0(2131751105, null)).j();
                break;
            case 27:
                Drawable[] drawableArr = PhotoViewer.Y8;
                break;
            case 28:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && (a02 = gc.a0(T)) != null) {
                    bc I = a02.I(R.raw.msg_antispam, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            default:
                int i11 = org.telegram.ui.v31.Y1;
                break;
        }
    }

    public /* synthetic */ us(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }
}
