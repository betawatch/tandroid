// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bh4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ bh4(FiltersSetupActivity filtersSetupActivity, byte b) {
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
                filtersSetupActivity.a.g1(new lu3(filtersSetupActivity, (byte) 20), 700, true);
                break;
            case 2:
                filtersSetupActivity.showDialog(new xk8((e) filtersSetupActivity, 9, true));
                break;
            default:
                filtersSetupActivity.getMessagesController().k3(true, null);
                break;
        }
    }
}
