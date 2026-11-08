package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ w7 a;
    public final /* synthetic */ i7[] b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ hc d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ j7 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ CountDownLatch w;

    public /* synthetic */ k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, hc hcVar, Object obj, int i7, j7 j7Var, long j3, boolean z9, int i10, CountDownLatch countDownLatch) {
        this.a = w7Var;
        this.b = i7VarArr;
        this.c = document;
        this.d = hcVar;
        this.e = obj;
        this.f = i7;
        this.h = j7Var;
        this.n = j3;
        this.r = z9;
        this.s = i10;
        this.w = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.a;
        w7Var.getClass();
        TLRPC.Document document = this.c;
        hc hcVar = this.d;
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || hcVar == null) ? null : hcVar.f;
        if (document == null && hcVar != null) {
            str = "mp4";
        }
        this.b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, hcVar, this.e, str, (document != null || hcVar == null) ? 0L : hcVar.r, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
