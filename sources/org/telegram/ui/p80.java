package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ p80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.a = i10;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.X(this.b);
                break;
            case 1:
                LanguageSelectActivity.U(this.b);
                break;
            default:
                this.b.a.l();
                break;
        }
    }
}
