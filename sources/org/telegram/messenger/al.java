package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
