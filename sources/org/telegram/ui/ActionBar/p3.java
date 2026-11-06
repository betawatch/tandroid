package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements c20 {
    public final /* synthetic */ c20 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ p3(c20 c20Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.a = c20Var;
        this.b = wallPaper;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        c20 c20Var = this.a;
        if (aVar != null) {
            c20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        hc b10 = hc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.z1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.g1 = new org.telegram.tgnet.f(this.c, this.d, this.e, c20Var);
        gc.D().M(imageReceiver, null);
    }
}
