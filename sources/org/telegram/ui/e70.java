package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ e70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.a = i10;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.c0(this.b);
                break;
            case 1:
                LanguageSelectActivity.a0(this.b);
                break;
            default:
                this.b.a.f();
                break;
        }
    }
}
