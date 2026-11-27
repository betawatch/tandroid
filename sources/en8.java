// default package

import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class en8 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ en8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.J0();
                break;
            case 1:
                privacyControlActivity.finishFragment();
                break;
            default:
                privacyControlActivity.finishFragment();
                break;
        }
    }
}
