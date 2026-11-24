// default package

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nb4 implements Runnable {
    public final /* synthetic */ bc4 a;
    public final /* synthetic */ lb4[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ gn5 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ mb4 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ nb4(bc4 bc4Var, lb4[] lb4VarArr, TLRPC.Document document, gn5 gn5Var, Object obj, int i, mb4 mb4Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = bc4Var;
        this.b = lb4VarArr;
        this.c = document;
        this.d = gn5Var;
        this.e = obj;
        this.f = i;
        this.h = mb4Var;
        this.n = j;
        this.r = z;
        this.s = i2;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document = this.c;
        gn5 gn5Var = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || gn5Var == null) ? null : gn5Var.f;
        if (document == null && gn5Var != null) {
            str = "mp4";
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, gn5Var, this.e, str, (document != null || gn5Var == null) ? 0L : gn5Var.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
