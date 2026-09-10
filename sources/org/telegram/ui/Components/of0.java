package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class of0 {
    public final pf0 a = new pf0();
    public final pf0 b = new pf0();
    public final pf0 c = new pf0();
    public final pf0 d = new pf0();
    public final ByteBuffer e;
    public int f;

    public of0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        pf0 pf0Var = this.a;
        if (pf0Var.f == null) {
            pf0Var.a();
        }
        float[] fArr = pf0Var.f;
        pf0 pf0Var2 = this.b;
        if (pf0Var2.f == null) {
            pf0Var2.a();
        }
        float[] fArr2 = pf0Var2.f;
        pf0 pf0Var3 = this.c;
        if (pf0Var3.f == null) {
            pf0Var3.a();
        }
        float[] fArr3 = pf0Var3.f;
        pf0 pf0Var4 = this.d;
        if (pf0Var4.f == null) {
            pf0Var4.a();
        }
        float[] fArr4 = pf0Var4.f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        return this.a.b() && this.b.b() && this.c.b() && this.d.b();
    }
}
