package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c4 implements ResultCallback {
    public final /* synthetic */ ig.b a;
    public final /* synthetic */ org.telegram.ui.fe b;

    public c4(ig.b bVar, org.telegram.ui.fe feVar) {
        this.a = bVar;
        this.b = feVar;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.ui.fe feVar;
        org.telegram.ui.ActionBar.r3 r3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            feVar = this.b;
            if (!hasNext) {
                feVar.onComplete(null);
                return;
            }
            r3Var = (org.telegram.ui.ActionBar.r3) it.next();
        } while (!this.a.equals(r3Var.c));
        r3Var.k();
        feVar.onComplete(r3Var);
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
