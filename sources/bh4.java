// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
