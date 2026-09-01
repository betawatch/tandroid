package o3;

import android.os.Handler;
import h5.d0;
import lh.c3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
