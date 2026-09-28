package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.a = i10;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.Y(this.b);
                break;
            case 1:
                LanguageSelectActivity.W(this.b);
                break;
            default:
                this.b.a.l();
                break;
        }
    }
}
