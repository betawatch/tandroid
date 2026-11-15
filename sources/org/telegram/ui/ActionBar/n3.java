package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements z10 {
    public final /* synthetic */ z10 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ n3(z10 z10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.a = z10Var;
        this.b = wallPaper;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        z10 z10Var = this.a;
        if (aVar != null) {
            z10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        gc b10 = gc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.h1 = new org.telegram.tgnet.f(this.c, this.d, this.e, z10Var);
        fc.D().M(imageReceiver, null);
    }
}
