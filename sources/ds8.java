// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ds8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ ds8(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(new z61());
                break;
            case 1:
                eVar.presentFragment(new z61());
                break;
            case 2:
                eVar.presentFragment(new a93());
                break;
            case 3:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                break;
            case 4:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 5:
                eVar.presentFragment(new DataAutoDownloadActivity(0));
                break;
            case 6:
                eVar.presentFragment(new DataAutoDownloadActivity(1));
                break;
            case 7:
                eVar.presentFragment(new DataAutoDownloadActivity(2));
                break;
            case 8:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 9:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 10:
                xk8 xk8Var = new xk8(eVar, 3, false);
                xk8Var.G0();
                eVar.showDialog(xk8Var);
                break;
            case 11:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 12:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 13:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 14:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 15:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                break;
            case 16:
                eVar.presentFragment(new ProxyListActivity());
                break;
            case 17:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 18:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 19:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 20:
                eVar.presentFragment(new DataSettingsActivity());
                break;
            case 21:
                xk8 xk8Var2 = new xk8(eVar, 4, false);
                xk8Var2.G0();
                eVar.showDialog(xk8Var2);
                break;
            case 22:
                eVar.presentFragment(new uqc());
                break;
            case 23:
                uqc.K0(eVar.getContext(), eVar.getResourceProvider());
                break;
            case 24:
                jj.q0(7, null, eVar);
                break;
            case 25:
                jj.q0(8, null, eVar);
                break;
            case 26:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                eVar.presentFragment(themeActivity);
                break;
            case 27:
                uh9.o(1, eVar);
                break;
            case 28:
                eVar.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
            default:
                if (d31.a(eVar)) {
                    d31.b0(eVar).I(R.raw.contact_check, ob6.M0(2131742801, null), ob6.M0(2131742800, null)).j();
                    break;
                }
                break;
        }
    }
}
