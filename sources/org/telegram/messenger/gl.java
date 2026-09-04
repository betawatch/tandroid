package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gl(TranslateController translateController, long j3, String str) {
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

    public /* synthetic */ gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.b = translateController;
        this.d = messageObject;
        this.c = j3;
    }
}
