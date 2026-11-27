// default package

import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jz5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ jz5(LanguageSelectActivity languageSelectActivity, byte b) {
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
                languageSelectActivity.a.f();
                break;
            default:
                languageSelectActivity.g0();
                break;
        }
    }
}
