package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gl(TranslateController translateController, long j10, String str) {
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

    public /* synthetic */ gl(TranslateController translateController, MessageObject messageObject, long j10) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j10;
    }
}
