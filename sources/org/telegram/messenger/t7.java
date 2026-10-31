package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ b8 a;
    public final /* synthetic */ m7[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ ic d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ n7 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ t7(b8 b8Var, m7[] m7VarArr, TLRPC.Document document, ic icVar, Object obj, int i10, n7 n7Var, long j10, boolean z10, int i11, CountDownLatch countDownLatch) {
        this.a = b8Var;
        this.b = m7VarArr;
        this.c = document;
        this.d = icVar;
        this.e = obj;
        this.f = i10;
        this.h = n7Var;
        this.n = j10;
        this.r = z10;
        this.s = i11;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b8 b8Var = this.a;
        b8Var.getClass();
        TLRPC.Document document = this.c;
        ic icVar = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || icVar == null) ? null : icVar.f;
        if (document == null && icVar != null) {
            str = "mp4";
        }
        this.b[0] = b8Var.Z(document, null, null, tL_fileLocationToBeDeprecated, icVar, this.e, str, (document != null || icVar == null) ? 0L : icVar.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
