package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ o80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(launchActivity, null);
                ubVar.d(R.raw.email_check_inbox, new String[0]);
                ubVar.b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.mc.g(R, ubVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.S0) {
                    launchActivity.S0 = false;
                    launchActivity.H(false, false, true);
                    break;
                }
                break;
            case 2:
                Pattern pattern2 = LaunchActivity.x1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    break;
                }
                break;
            case 3:
                if (!launchActivity.m0.getFragmentStack().isEmpty()) {
                    launchActivity.m0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.nx0(launchActivity, launchActivity.f0, launchActivity.d0, launchActivity.e0));
                    break;
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.x1;
                launchActivity.getClass();
                org.telegram.ui.Components.w20.a0 = false;
                org.telegram.ui.Components.w20.j(launchActivity);
                break;
            case 5:
                ArrayList arrayList = launchActivity.Z;
                ArrayList arrayList2 = launchActivity.a0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof l11)) {
                    launchActivity.p0(new ProxyListActivity());
                    break;
                }
                break;
            case 6:
                if (!launchActivity.r1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.c5.C(launchActivity);
                        C.setOnDismissListener(new p80(launchActivity, i11));
                        launchActivity.r1 = true;
                        C.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 7:
                if (launchActivity.P0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.w.p(new StringBuilder("remote"), launchActivity.P0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.P0;
                    org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new qc1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    break;
                }
                break;
            case 8:
                Pattern pattern4 = LaunchActivity.x1;
                launchActivity.getClass();
                launchActivity.p0(new ub0());
                break;
            case 9:
                launchActivity.p1 = null;
                break;
            default:
                launchActivity.q1 = null;
                break;
        }
    }
}
