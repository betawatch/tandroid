package n2;

import android.os.Handler;
import e2.d0;
import i2.g0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d implements l {
    public final j a;
    public g b;
    public boolean c;
    public final /* synthetic */ e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.a = jVar;
    }

    @Override // n2.l
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new g0(this, 13));
    }
}
