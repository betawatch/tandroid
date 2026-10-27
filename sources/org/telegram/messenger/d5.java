package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d5(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f = str;
        this.c = j10;
        this.d = j11;
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

    public /* synthetic */ d5(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f = tLObject;
        this.b = z10;
        this.c = j10;
        this.d = j11;
        this.e = i10;
    }
}
