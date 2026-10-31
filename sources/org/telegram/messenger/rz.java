package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import java.util.regex.Pattern;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rz implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ rz(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = tz.a;
                break;
            case 1:
                c00.y = null;
                break;
            case 2:
                org.telegram.ui.ActionBar.t6.F(false);
                break;
            case 3:
                int i11 = org.telegram.ui.un.ad;
                break;
            case 4:
                sg.k0.b(true);
                break;
            case 5:
                zs e = zs.e();
                Boolean bool = Boolean.TRUE;
                e.k(zs.n4, Boolean.FALSE, bool, bool);
                break;
            case 6:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    T.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), i2Var);
                    break;
                }
                break;
            case 7:
                Pattern pattern = org.telegram.ui.Components.s4.a;
                break;
            case 8:
                i0.r(org.telegram.ui.Components.f5.w);
                try {
                    if (org.telegram.ui.Components.f5.r != null) {
                        for (int i12 = 0; i12 < org.telegram.ui.Components.f5.r.size(); i12++) {
                            LongSparseArray longSparseArray = (LongSparseArray) org.telegram.ui.Components.f5.r.valueAt(i12);
                            int i13 = 0;
                            while (i13 < longSparseArray.size()) {
                                if (!((org.telegram.ui.Components.f5) longSparseArray.valueAt(i13)).a) {
                                    longSparseArray.removeAt(i13);
                                    i13--;
                                }
                                i13++;
                            }
                        }
                        break;
                    }
                } catch (Exception unused) {
                    boolean z10 = v2.a;
                    return;
                }
                break;
            case 9:
                org.telegram.ui.Components.w7 w7Var = org.telegram.ui.Components.w7.P2;
                break;
            case 10:
                gw.h();
                break;
            case 11:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && !launchActivity.isFinishing()) {
                    Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                    intent.setFlags(268468224);
                    LaunchActivity.I1.startActivity(intent);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", d20.i(Q.getCurrentAccount()).e());
                    bundle.putInt("chatMode", 1);
                    Q.presentFragment(new org.telegram.ui.un(bundle));
                    break;
                }
                break;
            case 13:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 14:
                MediaController.B().B0(0, 0, false, false);
                break;
            case 15:
                break;
            case 16:
                int i14 = org.telegram.ui.Components.jn.r1;
                break;
            case 17:
                PhotoViewer.v1().H0(false, false);
                break;
            case 18:
                PhotoViewer.v1().H0(false, false);
                break;
            case 19:
                int[] iArr = org.telegram.ui.Components.mt.X1;
                break;
            case 20:
                zs.e().k(zs.F2, new Object[0]);
                break;
            case 21:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 22:
                zs.e().k(98, 512);
                break;
            case 23:
                zs.e().k(99, 512);
                break;
            case 24:
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2();
                    i2Var2.a = true;
                    Q2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), i2Var2);
                    break;
                }
                break;
            case 25:
                int i15 = rz0.f;
                break;
            case 26:
                SharedPreferences.Editor edit = vp.d1().edit();
                h01.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                break;
            case 27:
                SharedPreferences.Editor edit2 = vp.d1().edit();
                h01.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                break;
            case 28:
                int i16 = o21.o0;
                break;
            default:
                gw.h();
                break;
        }
    }

    private final void a() {
    }
}
