package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ ch0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), i2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.k2 k2Var = this.b;
                if (k2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) k2Var;
                    premiumPreviewFragment.p0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.p0 = true;
                    if (k2Var != null) {
                        k2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (k2Var != null && (k2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        k2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) k2Var.getParentActivity()).x0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 4:
                org.telegram.messenger.z20.k(0, this.b);
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
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 10:
                org.telegram.messenger.z20.k(3, this.b);
                break;
            case 11:
                org.telegram.messenger.z20.k(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.k2 k2Var2 = this.b;
                kg.i1 i1Var = new kg.i1(k2Var2, 5, false);
                i1Var.K0();
                k2Var2.showDialog(i1Var);
                break;
            case 13:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 14:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 15:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 16:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 17:
                org.telegram.messenger.z20.k(1, this.b);
                break;
            case 18:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 21:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 22:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 25:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 26:
                org.telegram.messenger.z20.k(0, this.b);
                break;
            case 27:
                org.telegram.messenger.z20.k(0, this.b);
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
