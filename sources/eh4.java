// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eh4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ eh4(FiltersSetupActivity filtersSetupActivity, byte b) {
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
                filtersSetupActivity.a.f1(new yu3(filtersSetupActivity, (byte) 20), 700, true);
                break;
            case 2:
                filtersSetupActivity.showDialog(new kj8((d) filtersSetupActivity, 9, true));
                break;
            default:
                filtersSetupActivity.getMessagesController().g3(true, null);
                break;
        }
    }
}
