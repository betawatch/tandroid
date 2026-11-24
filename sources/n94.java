// default package

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class n94 implements Runnable {
    public final /* synthetic */ ba4 a;
    public final /* synthetic */ l94[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ gl5 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ m94 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ n94(ba4 ba4Var, l94[] l94VarArr, TLRPC.Document document, gl5 gl5Var, Object obj, int i, m94 m94Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = ba4Var;
        this.b = l94VarArr;
        this.c = document;
        this.d = gl5Var;
        this.e = obj;
        this.f = i;
        this.h = m94Var;
        this.n = j;
        this.r = z;
        this.s = i2;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document = this.c;
        gl5 gl5Var = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || gl5Var == null) ? null : gl5Var.f;
        if (document == null && gl5Var != null) {
            str = "mp4";
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, gl5Var, this.e, str, (document != null || gl5Var == null) ? 0L : gl5Var.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
