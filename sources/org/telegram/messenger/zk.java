package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranslateController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
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
