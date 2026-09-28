package org.telegram.messenger;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class fl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fl(TranslateController translateController, long j3, String str) {
        this.b = translateController;
        this.c = j3;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setDialogTranslateTo$0(this.c, (String) this.d);
                break;
            default:
                this.b.lambda$invalidateTranslation$9((MessageObject) this.d, this.c);
                break;
        }
    }

    public /* synthetic */ fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j3;
    }
}
