package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ w7 a;
    public final /* synthetic */ i7[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ ac d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ j7 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ o7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, ac acVar, Object obj, int i3, j7 j7Var, long j10, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.a = w7Var;
        this.b = i7VarArr;
        this.c = document;
        this.d = acVar;
        this.e = obj;
        this.f = i3;
        this.h = j7Var;
        this.n = j10;
        this.r = z10;
        this.s = i10;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.a;
        w7Var.getClass();
        TLRPC.Document document = this.c;
        ac acVar = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || acVar == null) ? null : acVar.f;
        if (document == null && acVar != null) {
            str = "mp4";
        }
        this.b[0] = w7Var.Z(document, null, null, tL_fileLocationToBeDeprecated, acVar, this.e, str, (document != null || acVar == null) ? 0L : acVar.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
