package org.telegram.messenger;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;

    public /* synthetic */ bl(TranslateController translateController, long j3, int i10) {
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
