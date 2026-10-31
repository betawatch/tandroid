package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f4 implements ResultCallback {
    public final /* synthetic */ yf.b a;
    public final /* synthetic */ org.telegram.ui.re b;

    public f4(yf.b bVar, org.telegram.ui.re reVar) {
        this.a = bVar;
        this.b = reVar;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.ui.re reVar;
        org.telegram.ui.ActionBar.y3 y3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            reVar = this.b;
            if (!hasNext) {
                reVar.onComplete(null);
                return;
            }
            y3Var = (org.telegram.ui.ActionBar.y3) it.next();
        } while (!this.a.equals(y3Var.c));
        y3Var.k();
        reVar.onComplete(y3Var);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }
}
