package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;

    public /* synthetic */ al(TranslateController translateController, long j3, int i10) {
        this.a = i10;
        this.b = translateController;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkDialogTranslatable$17(this.c);
                break;
            default:
                this.b.lambda$checkDialogMessageSure$11(this.c);
                break;
        }
    }
}
