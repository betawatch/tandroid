// default package

import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ez5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ ez5(LanguageSelectActivity languageSelectActivity, byte b) {
        this.a = b;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LanguageSelectActivity languageSelectActivity = this.b;
        switch (b) {
            case 0:
                languageSelectActivity.l0();
                break;
            case 1:
                languageSelectActivity.h0();
                break;
            default:
                languageSelectActivity.a.f();
                break;
        }
    }
}
