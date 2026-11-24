// default package

import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ ex5(LanguageSelectActivity languageSelectActivity, byte b) {
        this.a = b;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LanguageSelectActivity languageSelectActivity = this.b;
        switch (b) {
            case 0:
                languageSelectActivity.k0();
                break;
            case 1:
                languageSelectActivity.g0();
                break;
            default:
                languageSelectActivity.a.f();
                break;
        }
    }
}
