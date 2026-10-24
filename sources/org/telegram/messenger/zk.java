package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;

    public /* synthetic */ zk(TranslateController translateController, long j10, int i10) {
        this.a = i10;
        this.b = translateController;
        this.c = j10;
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
