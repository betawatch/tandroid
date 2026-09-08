package bh;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import org.telegram.messenger.AndroidUtilities;
import yf.g0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e {
    public final d b;
    public final d c;
    public long e;
    public final RenderNode a = y.c();
    public final Rect d = new Rect();

    public e(f fVar) {
        if (fVar.a) {
            d dVar = new d(fVar, "glass", 0, true);
            this.c = dVar;
            dVar.e = 4;
            dVar.f = 4;
            dVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            d dVar2 = new d(fVar, "blur", 0, false);
            this.b = dVar2;
            dVar2.e = 8;
            dVar2.f = 8;
            dVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!fVar.c) {
            d dVar3 = new d(fVar, "blur", 1, false);
            this.b = dVar3;
            dVar3.e = 8;
            dVar3.f = 8;
            dVar3.c(AndroidUtilities.dpf2(40.0f));
            dVar3.e(g0.b());
            this.c = null;
            return;
        }
        d dVar4 = new d(fVar, "blur", 0, false);
        this.b = dVar4;
        boolean z10 = fVar.b;
        int i10 = z10 ? 16 : 8;
        int i11 = z10 ? 16 : 8;
        dVar4.e = i10;
        dVar4.f = i11;
        dVar4.d(AndroidUtilities.dpf2(40.0f), g0.b());
        this.c = null;
    }
}
