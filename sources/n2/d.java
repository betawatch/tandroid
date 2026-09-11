package n2;

import android.os.Handler;
import e2.d0;
import ig.t0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
