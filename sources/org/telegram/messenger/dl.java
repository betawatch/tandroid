package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dl(TranslateController translateController, long j10, String str) {
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

    public /* synthetic */ dl(TranslateController translateController, MessageObject messageObject, long j10) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j10;
    }
}
