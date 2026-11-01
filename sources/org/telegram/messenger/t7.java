package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ b8 a;
    public final /* synthetic */ m7[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ jc d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ n7 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ t7(b8 b8Var, m7[] m7VarArr, TLRPC.Document document, jc jcVar, Object obj, int i10, n7 n7Var, long j10, boolean z10, int i11, CountDownLatch countDownLatch) {
        this.a = b8Var;
        this.b = m7VarArr;
        this.c = document;
        this.d = jcVar;
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
        jc jcVar = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || jcVar == null) ? null : jcVar.f;
        if (document == null && jcVar != null) {
            str = "mp4";
        }
        this.b[0] = b8Var.Z(document, null, null, tL_fileLocationToBeDeprecated, jcVar, this.e, str, (document != null || jcVar == null) ? 0L : jcVar.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
