package n2;

import android.os.Handler;
import e2.m0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class d implements m {
    public final k a;
    public h b;
    public boolean c;
    public final /* synthetic */ f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.a = kVar;
    }

    @Override // n2.m
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new ki.u(this, 7));
    }
}
