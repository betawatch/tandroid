package n2;

import android.os.Handler;
import e2.m0;
import ig.t0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d implements m {
    public final k a;
    public g b;
    public boolean c;
    public final /* synthetic */ e d;

    public d(e eVar, k kVar) {
        this.d = eVar;
        this.a = kVar;
    }

    @Override // n2.m
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new t0(this, 18));
    }
}
