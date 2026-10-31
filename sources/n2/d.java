package n2;

import android.os.Handler;
import e2.l0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        l0.W(handler, new lg.s(this, 10));
    }
}
