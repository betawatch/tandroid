package o3;

import android.os.Handler;
import h5.d0;
import nh.n5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        d0.K(handler, new n5(this, 14));
    }
}
