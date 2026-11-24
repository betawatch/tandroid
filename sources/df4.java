// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class df4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ df4(FiltersSetupActivity filtersSetupActivity, byte b) {
        this.a = b;
        this.b = filtersSetupActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FiltersSetupActivity filtersSetupActivity = this.b;
        switch (b) {
            case 0:
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                filtersSetupActivity.a.f1(new kx3(filtersSetupActivity, (byte) 17), 700, true);
                break;
            case 2:
                filtersSetupActivity.showDialog(new jh8((d) filtersSetupActivity, 9, true));
                break;
            default:
                filtersSetupActivity.getMessagesController().e3(true, null);
                break;
        }
    }
}
