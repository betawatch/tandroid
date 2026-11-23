package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements w10 {
    public final /* synthetic */ w10 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ q3(w10 w10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.a = w10Var;
        this.b = wallPaper;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        w10 w10Var = this.a;
        if (aVar != null) {
            w10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        fc b10 = fc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.r0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.h1 = new org.telegram.tgnet.f(this.c, this.d, this.e, w10Var);
        ec.D().M(imageReceiver, null);
    }
}
