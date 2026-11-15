package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c4 implements ResultCallback {
    public final /* synthetic */ ig.b a;
    public final /* synthetic */ org.telegram.ui.ce b;

    public c4(ig.b bVar, org.telegram.ui.ce ceVar) {
        this.a = bVar;
        this.b = ceVar;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.ui.ce ceVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            ceVar = this.b;
            if (!hasNext) {
                ceVar.onComplete(null);
                return;
            }
            p3Var = (org.telegram.ui.ActionBar.p3) it.next();
        } while (!this.a.equals(p3Var.c));
        p3Var.k();
        ceVar.onComplete(p3Var);
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
