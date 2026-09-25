package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ ki0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), k2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.m2 m2Var = this.b;
                if (m2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) m2Var;
                    premiumPreviewFragment.p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.p0 = true;
                    if (m2Var != null) {
                        m2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (m2Var != null && (m2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        m2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) m2Var.getParentActivity()).x0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 4:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 5:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 6:
                this.b.presentFragment(new WallpapersListActivity(1));
                break;
            case 7:
                this.b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 8:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 9:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 10:
                org.telegram.messenger.ok.m(3, this.b);
                break;
            case 11:
                org.telegram.messenger.ok.m(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var2 = this.b;
                rg.x0 x0Var = new rg.x0(m2Var2, 5, false);
                x0Var.B();
                m2Var2.showDialog(x0Var);
                break;
            case 13:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 14:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 15:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.ok.m(1, this.b);
                break;
            case 18:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 21:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.ok.m(0, this.b);
                break;
            case 28:
                this.b.presentFragment(new StickersActivity(0, null));
                break;
            default:
                this.b.presentFragment(new StickersActivity(0, null));
                break;
        }
    }
}
