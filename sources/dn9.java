// default package

import android.view.Surface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dn9 implements zn9 {
    public final /* synthetic */ on9 a;

    public dn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override // zn9
    public final void a(int i, int i2) {
        gl.c3(new kt(this, i / i2, (byte) 4));
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
