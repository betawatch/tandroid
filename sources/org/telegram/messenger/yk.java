package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yk(TranslateController translateController, long j10, String str) {
        this.b = translateController;
        this.c = j10;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$invalidateTranslation$9((MessageObject) this.d, this.c);
                break;
            default:
                this.b.lambda$setDialogTranslateTo$0(this.c, (String) this.d);
                break;
        }
    }

    public /* synthetic */ yk(TranslateController translateController, MessageObject messageObject, long j10) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j10;
    }
}
