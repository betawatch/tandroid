package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.a = i11;
        this.b = translateController;
        this.c = str;
        this.d = messageObject;
        this.e = j10;
        this.f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f;
                this.b.lambda$checkLanguage$16(this.c, this.d, j10, i10);
                break;
            default:
                long j11 = this.e;
                int i11 = this.f;
                this.b.lambda$checkLanguage$12(this.c, this.d, j11, i11);
                break;
        }
    }
}
