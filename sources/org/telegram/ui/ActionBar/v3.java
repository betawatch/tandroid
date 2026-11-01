package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements r20 {
    public final /* synthetic */ r20 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ v3(r20 r20Var, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.a = r20Var;
        this.b = wallPaper;
        this.c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        wf.a aVar = (wf.a) obj;
        r20 r20Var = this.a;
        if (aVar != null) {
            r20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        jc b10 = jc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.z1 = false;
        Point point = org.telegram.messenger.i0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.i0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.i0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.g1 = new org.telegram.tgnet.g(this.c, this.d, this.e, r20Var);
        ic.D().M(imageReceiver, null);
    }
}
