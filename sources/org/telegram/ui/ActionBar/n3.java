package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.u10;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements u10 {
    public final /* synthetic */ u10 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ n3(u10 u10Var, TLRPC.WallPaper wallPaper, int i3, int i10, long j10) {
        this.a = u10Var;
        this.b = wallPaper;
        this.c = i3;
        this.d = i10;
        this.e = j10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        hg.a aVar = (hg.a) obj;
        u10 u10Var = this.a;
        if (aVar != null) {
            u10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        ac b10 = ac.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.h1 = new org.telegram.tgnet.f(this.c, this.d, this.e, u10Var);
        zb.D().M(imageReceiver, null);
    }
}
