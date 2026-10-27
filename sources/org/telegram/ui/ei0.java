package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ ei0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), p2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = this.b;
                if (r2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) r2Var;
                    premiumPreviewFragment.p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.p0 = true;
                    if (r2Var != null) {
                        r2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (r2Var != null && (r2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        r2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) r2Var.getParentActivity()).x0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 4:
                org.telegram.messenger.wh.l(0, this.b);
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
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 10:
                org.telegram.messenger.wh.l(3, this.b);
                break;
            case 11:
                org.telegram.messenger.wh.l(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.b;
                tg.y0 y0Var = new tg.y0(r2Var2, 5, false);
                y0Var.F();
                r2Var2.showDialog(y0Var);
                break;
            case 13:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 14:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 15:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 16:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 17:
                org.telegram.messenger.wh.l(1, this.b);
                break;
            case 18:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 21:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 22:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 25:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 26:
                org.telegram.messenger.wh.l(0, this.b);
                break;
            case 27:
                org.telegram.messenger.wh.l(0, this.b);
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
