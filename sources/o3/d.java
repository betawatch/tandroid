package o3;

import android.os.Handler;
import h5.d0;
import lh.c3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements n {
    public final l a;
    public i b;
    public boolean c;
    public final /* synthetic */ e d;

    public d(e eVar, l lVar) {
        this.d = eVar;
        this.a = lVar;
    }

    @Override // o3.n
    public final void release() {
        Handler handler = this.d.G;
        handler.getClass();
        d0.K(handler, new c3(this, 22));
    }
}
