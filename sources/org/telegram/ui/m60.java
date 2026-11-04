package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ m60(LaunchActivity launchActivity, int i3) {
        this.a = i3;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i3 = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = null;
        int i10 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(launchActivity, null);
                ibVar.d(R.raw.email_check_inbox, new String[0]);
                ibVar.b.setText(org.telegram.messenger.bd.M0(2131742821, null));
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.ac.g(Q, ibVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.Y0) {
                    launchActivity.Y0 = false;
                    launchActivity.F(false, false, true);
                    break;
                }
                break;
            case 2:
                if (!launchActivity.y1) {
                    try {
                        org.telegram.ui.ActionBar.s1 B = org.telegram.ui.Components.t4.B(launchActivity);
                        B.setOnDismissListener(new e70(launchActivity, i10));
                        launchActivity.y1 = true;
                        B.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 3:
                String str2 = LaunchActivity.E1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().d0();
                    break;
                }
                break;
            case 4:
                if (!launchActivity.r0.getFragmentStack().isEmpty()) {
                    launchActivity.r0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.xv0(launchActivity, launchActivity.k0, launchActivity.i0, launchActivity.j0));
                    break;
                }
                break;
            case 5:
                String str3 = LaunchActivity.E1;
                launchActivity.getClass();
                org.telegram.ui.Components.l10.f0 = false;
                org.telegram.ui.Components.l10.j(launchActivity);
                break;
            case 6:
                String str4 = LaunchActivity.E1;
                if (org.telegram.messenger.g0.g != -10 && org.telegram.messenger.g0.f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.i) != null && weakReference.get() == launchActivity) {
                    int i11 = org.telegram.messenger.g0.h;
                    int i12 = org.telegram.messenger.g0.g;
                    org.telegram.messenger.g0.g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.i = null;
                    try {
                        launchActivity.setRequestedOrientation(i11);
                        launchActivity.setRequestedOrientation(i12);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 7:
                launchActivity.w1 = null;
                break;
            case 8:
                if (launchActivity.V0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a1.g.r(new StringBuilder("remote"), launchActivity.V0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.V0;
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new l71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = launchActivity.e0;
                ArrayList arrayList2 = launchActivity.f0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                }
                if (!(d2Var instanceof ProxyListActivity) && !(d2Var instanceof mx0)) {
                    launchActivity.t0(new ProxyListActivity());
                    break;
                }
                break;
            case 10:
                launchActivity.x1 = null;
                break;
            default:
                String str5 = LaunchActivity.E1;
                launchActivity.getClass();
                launchActivity.t0(new t90());
                break;
        }
    }
}
