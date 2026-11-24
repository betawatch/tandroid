// default package

import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ob3 implements hs3 {
    public final fs3 a;
    public cs3 b;
    public boolean c;
    public final /* synthetic */ pb3 d;

    public ob3(pb3 pb3Var, fs3 fs3Var) {
        this.d = pb3Var;
        this.a = fs3Var;
    }

    @Override // hs3
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        hac.X(handler, new xf2(this, (byte) 25));
    }
}
