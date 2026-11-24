// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class o05 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ i8c h;
    public final /* synthetic */ c n;

    public o05(c cVar, String str, long j, String str2, byte[] bArr, i8c i8cVar) {
        this.n = cVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = bArr;
        this.h = i8cVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new ae2((Object) this, (Object) this.h, (byte) 20));
    }
}
