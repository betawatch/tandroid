package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ ii0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), n2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = this.b;
                if (p2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) p2Var;
                    premiumPreviewFragment.m0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.m0 = true;
                    if (p2Var != null) {
                        p2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (p2Var != null && (p2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        p2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) p2Var.getParentActivity()).u0.c(false);
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
                b.k(0, this.b);
                break;
            case 6:
                b.k(0, this.b);
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
                b.k(0, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = this.b;
                fg.n1 n1Var = new fg.n1(p2Var2, 4, false);
                n1Var.C();
                p2Var2.showDialog(n1Var);
                break;
            case 13:
                b.k(3, this.b);
                break;
            case 14:
                b.k(3, this.b);
                break;
            case 15:
                b.k(0, this.b);
                break;
            case 16:
                b.k(0, this.b);
                break;
            case 17:
                b.k(0, this.b);
                break;
            case 18:
                b.k(0, this.b);
                break;
            case 19:
                b.k(1, this.b);
                break;
            case 20:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                b.k(0, this.b);
                break;
            case 22:
                b.k(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                b.k(0, this.b);
                break;
            case 25:
                b.k(0, this.b);
                break;
            case 26:
                b.k(0, this.b);
                break;
            case 27:
                b.k(0, this.b);
                break;
            case 28:
                b.k(0, this.b);
                break;
            default:
                b.k(0, this.b);
                break;
        }
    }
}
