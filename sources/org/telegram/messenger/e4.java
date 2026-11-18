package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e4 implements ResultCallback {
    public final /* synthetic */ ig.b a;
    public final /* synthetic */ org.telegram.ui.ee b;

    public e4(ig.b bVar, org.telegram.ui.ee eeVar) {
        this.a = bVar;
        this.b = eeVar;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.ui.ee eeVar;
        org.telegram.ui.ActionBar.t3 t3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            eeVar = this.b;
            if (!hasNext) {
                eeVar.onComplete(null);
                return;
            }
            t3Var = (org.telegram.ui.ActionBar.t3) it.next();
        } while (!this.a.equals(t3Var.c));
        t3Var.k();
        eeVar.onComplete(t3Var);
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
