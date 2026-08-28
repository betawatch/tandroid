package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ ai0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), m2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.l0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.l0 = true;
                    if (o2Var != null) {
                        o2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (o2Var != null && (o2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        o2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) o2Var.getParentActivity()).t0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 4:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 5:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 6:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 7:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 8:
                this.b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 9:
                this.b.presentFragment(new WallpapersListActivity(1));
                break;
            case 10:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 11:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.b;
                zf.x0 x0Var = new zf.x0(o2Var2, 4, false);
                x0Var.C();
                o2Var2.showDialog(x0Var);
                break;
            case 13:
                org.telegram.messenger.ll.m(3, this.b);
                break;
            case 14:
                org.telegram.messenger.ll.m(3, this.b);
                break;
            case 15:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 18:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 19:
                org.telegram.messenger.ll.m(1, this.b);
                break;
            case 20:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            case 28:
                org.telegram.messenger.ll.m(0, this.b);
                break;
            default:
                org.telegram.messenger.ll.m(0, this.b);
                break;
        }
    }
}
