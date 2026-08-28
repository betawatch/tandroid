package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ l80(LaunchActivity launchActivity, int i9) {
        this.a = i9;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = null;
        int i10 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(launchActivity, null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.gc.g(R, obVar, 1500).j();
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
                    launchActivity.m0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.cx0(launchActivity, launchActivity.f0, launchActivity.d0, launchActivity.e0));
                    break;
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.x1;
                launchActivity.getClass();
                org.telegram.ui.Components.j20.a0 = false;
                org.telegram.ui.Components.j20.j(launchActivity);
                break;
            case 5:
                ArrayList arrayList = launchActivity.Z;
                ArrayList arrayList2 = launchActivity.a0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
                }
                if (!(o2Var instanceof ProxyListActivity) && !(o2Var instanceof k11)) {
                    launchActivity.p0(new ProxyListActivity());
                    break;
                }
                break;
            case 6:
                if (!launchActivity.r1) {
                    try {
                        org.telegram.ui.ActionBar.c2 C = org.telegram.ui.Components.y4.C(launchActivity);
                        C.setOnDismissListener(new m80(launchActivity, i10));
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
                    File file = new File(ApplicationLoader.getFilesDirFixed(), aa.d.q(new StringBuilder("remote"), launchActivity.P0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.P0;
                    org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new oc1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    break;
                }
                break;
            case 8:
                Pattern pattern4 = LaunchActivity.x1;
                launchActivity.getClass();
                launchActivity.p0(new sb0());
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
