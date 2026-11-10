package org.telegram.messenger;

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.s3 s3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            feVar = this.b;
            if (!hasNext) {
                feVar.onComplete(null);
                return;
            }
            s3Var = (org.telegram.ui.ActionBar.s3) it.next();
        } while (!this.a.equals(s3Var.c));
        s3Var.k();
        feVar.onComplete(s3Var);
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
