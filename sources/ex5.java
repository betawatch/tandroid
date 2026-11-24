// default package

import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
