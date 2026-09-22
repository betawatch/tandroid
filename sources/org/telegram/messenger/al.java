package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.a = i11;
        this.b = translateController;
        this.c = str;
        this.d = messageObject;
        this.e = j3;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f;
                this.b.lambda$checkLanguage$16(this.c, this.d, j3, i10);
                break;
            default:
                long j10 = this.e;
                int i11 = this.f;
                this.b.lambda$checkLanguage$12(this.c, this.d, j10, i11);
                break;
        }
    }
}
