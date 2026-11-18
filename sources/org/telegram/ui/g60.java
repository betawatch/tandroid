package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
