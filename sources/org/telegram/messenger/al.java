package org.telegram.messenger;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
