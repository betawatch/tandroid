package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c4 implements ResultCallback {
    public final /* synthetic */ jg.b a;
    public final /* synthetic */ org.telegram.ui.de b;

    public c4(jg.b bVar, org.telegram.ui.de deVar) {
        this.a = bVar;
        this.b = deVar;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.ui.de deVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            deVar = this.b;
            if (!hasNext) {
                deVar.onComplete(null);
                return;
            }
            p3Var = (org.telegram.ui.ActionBar.p3) it.next();
        } while (!this.a.equals(p3Var.c));
        p3Var.k();
        deVar.onComplete(p3Var);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }
}
