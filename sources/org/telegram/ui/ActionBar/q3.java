package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements y10 {
    public final /* synthetic */ y10 a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ q3(y10 y10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.a = y10Var;
        this.b = wallPaper;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        y10 y10Var = this.a;
        if (aVar != null) {
            y10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        gc b10 = gc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.q;
        imageReceiver.q0(b10, (Math.min(point.x, point.y) / org.telegram.messenger.g0.p) + "_" + (Math.max(point.x, point.y) / org.telegram.messenger.g0.p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.h1 = new org.telegram.tgnet.f(this.c, this.d, this.e, y10Var);
        fc.D().M(imageReceiver, null);
    }
}
