package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ w7 a;
    public final /* synthetic */ i7[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ gc d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ j7 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, gc gcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.a = w7Var;
        this.b = i7VarArr;
        this.c = document;
        this.d = gcVar;
        this.e = obj;
        this.f = i7;
        this.h = j7Var;
        this.n = j3;
        this.r = z10;
        this.s = i10;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.a;
        w7Var.getClass();
        TLRPC.Document document = this.c;
        gc gcVar = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || gcVar == null) ? null : gcVar.f;
        if (document == null && gcVar != null) {
            str = "mp4";
        }
        this.b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, gcVar, this.e, str, (document != null || gcVar == null) ? 0L : gcVar.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
