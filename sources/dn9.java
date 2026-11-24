// default package

import android.view.Surface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dn9 implements zn9 {
    public final /* synthetic */ on9 a;

    public dn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override // zn9
    public final void a(int i, int i2) {
        gl.d3(new kt(this, i / i2, (byte) 4));
    }

    @Override // zn9
    public final boolean b() {
        return true;
    }

    @Override // zn9
    public final Surface getSurface() {
        return this.a.r0;
    }
}
