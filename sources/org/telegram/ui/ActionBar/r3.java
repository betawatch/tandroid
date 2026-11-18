package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements x10 {
    public final /* synthetic */ x10 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ r3(x10 x10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.a = x10Var;
        this.b = wallPaper;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        x10 x10Var = this.a;
        if (aVar != null) {
            x10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        fc b10 = fc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.h1 = new org.telegram.tgnet.f(this.c, this.d, this.e, x10Var);
        ec.D().M(imageReceiver, null);
    }
}
