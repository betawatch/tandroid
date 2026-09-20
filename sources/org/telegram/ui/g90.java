package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ g90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(launchActivity, null);
                xbVar.d(R.raw.email_check_inbox, new String[0]);
                xbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.pc.g(R, xbVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.H(false, false, true);
                    break;
                }
                break;
            case 2:
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    break;
                }
                break;
            case 3:
                if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                    launchActivity.q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.gy0(launchActivity, launchActivity.j0, launchActivity.h0, launchActivity.i0));
                    break;
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.z20.e0 = false;
                org.telegram.ui.Components.z20.j(launchActivity);
                break;
            case 5:
                ArrayList arrayList = launchActivity.d0;
                ArrayList arrayList2 = launchActivity.e0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList);
                }
                if (!(n2Var instanceof ProxyListActivity) && !(n2Var instanceof o21)) {
                    launchActivity.p0(new ProxyListActivity());
                    break;
                }
                break;
            case 6:
                if (!launchActivity.v1) {
                    try {
                        org.telegram.ui.ActionBar.b2 C = org.telegram.ui.Components.d5.C(launchActivity);
                        C.setOnDismissListener(new i90(launchActivity, i11));
                        launchActivity.v1 = true;
                        C.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 7:
                if (launchActivity.T0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), launchActivity.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new xd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    break;
                }
                break;
            case 8:
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.p0(new pc0());
                break;
            case 9:
                launchActivity.t1 = null;
                break;
            default:
                launchActivity.u1 = null;
                break;
        }
    }
}
