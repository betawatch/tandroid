package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ f60(LanguageSelectActivity languageSelectActivity, int i7) {
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
