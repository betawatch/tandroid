package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        d0.U(handler, new h0(this, 13));
    }
}
