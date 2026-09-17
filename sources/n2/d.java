package n2;

import android.os.Handler;
import e2.d0;
import ig.t0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        d0.U(handler, new t0(this, 15));
    }
}
