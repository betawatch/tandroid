package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ c80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.a = i10;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.Z(this.b);
                break;
            case 1:
                LanguageSelectActivity.X(this.b);
                break;
            default:
                this.b.a.l();
                break;
        }
    }
}
