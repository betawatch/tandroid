package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ol implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ol(TranslateController translateController, long j3, String str) {
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

    public /* synthetic */ ol(TranslateController translateController, MessageObject messageObject, long j3) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j3;
    }
}
