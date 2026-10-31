package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements q20 {
    public final /* synthetic */ q20 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ v3(q20 q20Var, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.a = q20Var;
        this.b = wallPaper;
        this.c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        wf.a aVar = (wf.a) obj;
        q20 q20Var = this.a;
        if (aVar != null) {
            q20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        ic b10 = ic.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.z1 = false;
        Point point = org.telegram.messenger.i0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.i0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.i0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.g1 = new org.telegram.tgnet.g(this.c, this.d, this.e, q20Var);
        hc.D().M(imageReceiver, null);
    }
}
