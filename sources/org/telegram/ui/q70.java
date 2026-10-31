package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ q70(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i10 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(launchActivity, null);
                ebVar.d(R.raw.email_check_inbox, new String[0]);
                ebVar.b.setText(org.telegram.messenger.cd.L0(2131742836, null));
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.wb.g(Q, ebVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.X0) {
                    launchActivity.X0 = false;
                    launchActivity.F(false, false, true);
                    break;
                }
                break;
            case 2:
                if (!launchActivity.x1) {
                    try {
                        org.telegram.ui.ActionBar.x1 B = org.telegram.ui.Components.s4.B(launchActivity);
                        B.setOnDismissListener(new k80(launchActivity, i11));
                        launchActivity.x1 = true;
                        B.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 3:
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().d0();
                    break;
                }
                break;
            case 4:
                if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                    launchActivity.q0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.cx0(launchActivity, launchActivity.j0, launchActivity.h0, launchActivity.i0));
                    break;
                }
                break;
            case 5:
                Pattern pattern3 = LaunchActivity.D1;
                launchActivity.getClass();
                org.telegram.ui.Components.g20.e0 = false;
                org.telegram.ui.Components.g20.j(launchActivity);
                break;
            case 6:
                Pattern pattern4 = LaunchActivity.D1;
                if (org.telegram.messenger.i0.g != -10 && org.telegram.messenger.i0.f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.i0.i) != null && weakReference.get() == launchActivity) {
                    int i12 = org.telegram.messenger.i0.h;
                    int i13 = org.telegram.messenger.i0.g;
                    org.telegram.messenger.i0.g = -10;
                    org.telegram.messenger.i0.h = -10;
                    org.telegram.messenger.i0.i = null;
                    try {
                        launchActivity.setRequestedOrientation(i12);
                        launchActivity.setRequestedOrientation(i13);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            case 7:
                launchActivity.v1 = null;
                break;
            case 8:
                if (launchActivity.U0 != null) {
                    File file = new File(org.telegram.messenger.w0.h(), a1.g.q(new StringBuilder("remote"), launchActivity.U0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.U0;
                    org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new m91(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = launchActivity.d0;
                ArrayList arrayList2 = launchActivity.e0;
                if (org.telegram.messenger.i0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                }
                if (!(k2Var instanceof ProxyListActivity) && !(k2Var instanceof jz0)) {
                    launchActivity.t0(new ProxyListActivity());
                    break;
                }
                break;
            case 10:
                launchActivity.w1 = null;
                break;
            default:
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity.getClass();
                launchActivity.t0(new bb0());
                break;
        }
    }
}
