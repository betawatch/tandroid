package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ p80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(launchActivity, null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.qc.g(R, ybVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.X0) {
                    launchActivity.X0 = false;
                    launchActivity.H(false, false, true);
                    break;
                }
                break;
            case 2:
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().Q();
                    break;
                }
                break;
            case 3:
                if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                    launchActivity.q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.dz0(launchActivity, launchActivity.j0, launchActivity.h0, launchActivity.i0));
                    break;
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.D1;
                launchActivity.getClass();
                org.telegram.ui.Components.k30.e0 = false;
                org.telegram.ui.Components.k30.j(launchActivity);
                break;
            case 5:
                Pattern pattern4 = LaunchActivity.D1;
                launchActivity.getClass();
                AndroidUtilities.applyPendingOrientationUnlock(launchActivity);
                break;
            case 6:
                launchActivity.v1 = null;
                break;
            case 7:
                if (launchActivity.U0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a1.g.r(new StringBuilder("remote"), launchActivity.U0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.U0;
                    org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.u0(new vc1(u10, true, 0, false, false));
                    }
                    launchActivity.j0();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = launchActivity.d0;
                ArrayList arrayList2 = launchActivity.e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
                }
                if (!(r2Var instanceof ProxyListActivity) && !(r2Var instanceof d21)) {
                    launchActivity.u0(new ProxyListActivity());
                    break;
                }
                break;
            case 9:
                launchActivity.w1 = null;
                break;
            case 10:
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.u0(new wb0());
                break;
            default:
                if (!launchActivity.x1) {
                    try {
                        org.telegram.ui.ActionBar.e2 B = org.telegram.ui.Components.g5.B(launchActivity);
                        B.setOnDismissListener(new q80(launchActivity, i11));
                        launchActivity.x1 = true;
                        B.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
