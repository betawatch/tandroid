package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ qk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i9, int i10) {
        this.a = i10;
        this.b = translateController;
        this.c = str;
        this.d = messageObject;
        this.e = j10;
        this.f = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.e;
                int i9 = this.f;
                this.b.lambda$checkLanguage$16(this.c, this.d, j10, i9);
                break;
            default:
                long j11 = this.e;
                int i10 = this.f;
                this.b.lambda$checkLanguage$12(this.c, this.d, j11, i10);
                break;
        }
    }
}
