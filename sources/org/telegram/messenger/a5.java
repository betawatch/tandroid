package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a5(int i10, String str, long j10, long j11, boolean z10) {
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

    public /* synthetic */ a5(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f = tLObject;
        this.b = z10;
        this.c = j10;
        this.d = j11;
        this.e = i10;
    }
}
