// default package

import android.os.Handler;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ca3 implements xq3 {
    public final vq3 a;
    public sq3 b;
    public boolean c;
    public final /* synthetic */ da3 d;

    public ca3(da3 da3Var, vq3 vq3Var) {
        this.d = da3Var;
        this.a = vq3Var;
    }

    @Override // xq3
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        g8c.X(handler, new mk2(this, (byte) 20));
    }
}
