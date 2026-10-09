package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w4(int i10, String str, long j3, long j10, boolean z10) {
        this.e = i10;
        this.f = str;
        this.c = j3;
        this.d = j10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ImageLoader.5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f, this.c, this.d, this.b);
                break;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f, this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ w4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f = tLObject;
        this.b = z10;
        this.c = j3;
        this.d = j10;
        this.e = i10;
    }
}
