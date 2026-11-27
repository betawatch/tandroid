// default package

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class jb4 implements Runnable {
    public final /* synthetic */ xb4 a;
    public final /* synthetic */ hb4[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ jn5 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ib4 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ jb4(xb4 xb4Var, hb4[] hb4VarArr, TLRPC.Document document, jn5 jn5Var, Object obj, int i, ib4 ib4Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = xb4Var;
        this.b = hb4VarArr;
        this.c = document;
        this.d = jn5Var;
        this.e = obj;
        this.f = i;
        this.h = ib4Var;
        this.n = j;
        this.r = z;
        this.s = i2;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document = this.c;
        jn5 jn5Var = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || jn5Var == null) ? null : jn5Var.f;
        if (document == null && jn5Var != null) {
            str = "mp4";
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, jn5Var, this.e, str, (document != null || jn5Var == null) ? 0L : jn5Var.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
