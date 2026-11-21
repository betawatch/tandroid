package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ g60(LanguageSelectActivity languageSelectActivity, int i7) {
        this.a = i7;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.d0(this.b);
                break;
            case 1:
                LanguageSelectActivity.b0(this.b);
                break;
            default:
                this.b.a.f();
                break;
        }
    }
}
