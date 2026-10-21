package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zf0 {
    public final ag0 a = new ag0();
    public final ag0 b = new ag0();
    public final ag0 c = new ag0();
    public final ag0 d = new ag0();
    public final ByteBuffer e;
    public int f;

    public zf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        ag0 ag0Var = this.a;
        if (ag0Var.f == null) {
            ag0Var.a();
        }
        float[] fArr = ag0Var.f;
        ag0 ag0Var2 = this.b;
        if (ag0Var2.f == null) {
            ag0Var2.a();
        }
        float[] fArr2 = ag0Var2.f;
        ag0 ag0Var3 = this.c;
        if (ag0Var3.f == null) {
            ag0Var3.a();
        }
        float[] fArr3 = ag0Var3.f;
        ag0 ag0Var4 = this.d;
        if (ag0Var4.f == null) {
            ag0Var4.a();
        }
        float[] fArr4 = ag0Var4.f;
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
