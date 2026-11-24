// default package

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ kv1(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                if (dVar == null) {
                    if (dVar.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) dVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new jh8(dVar, 11, false).show();
                    break;
                }
                break;
            case 1:
                dVar.presentFragment(new StickersActivity(0, null));
                break;
            case 2:
                dVar.presentFragment(new hmc());
                break;
            case 3:
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                dVar.showAsSheet(new PremiumPreviewFragment(0, "effect"), ag0Var);
                break;
            case 4:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                dVar.presentFragment(themeActivity);
                break;
            case 5:
                if (dVar instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) dVar;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().T0(false);
                    premiumPreviewFragment.a.z0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (dVar != null) {
                        dVar.presentFragment(premiumPreviewFragment2);
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (dVar != null && (dVar.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        dVar.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) dVar.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 6:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 7:
            case 8:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 28:
            default:
                de9.o(0, dVar);
                break;
            case 9:
                dVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 10:
                dVar.presentFragment(new WallpapersListActivity(1));
                break;
            case 11:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 12:
                dVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 14:
            case 15:
                de9.o(3, dVar);
                break;
            case 16:
                jh8 jh8Var = new jh8(dVar, 5, false);
                jh8Var.F0();
                dVar.showDialog(jh8Var);
                break;
            case 21:
                de9.o(1, dVar);
                break;
            case 23:
                dVar.presentFragment(new NotificationsSettingsActivity());
                break;
            case 27:
                dVar.presentFragment(new NotificationsSettingsActivity());
                break;
        }
    }
}
