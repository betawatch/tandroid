package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bg0 {
    public final cg0 a = new cg0();
    public final cg0 b = new cg0();
    public final cg0 c = new cg0();
    public final cg0 d = new cg0();
    public final ByteBuffer e;
    public int f;

    public bg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        cg0 cg0Var = this.a;
        if (cg0Var.f == null) {
            cg0Var.a();
        }
        float[] fArr = cg0Var.f;
        cg0 cg0Var2 = this.b;
        if (cg0Var2.f == null) {
            cg0Var2.a();
        }
        float[] fArr2 = cg0Var2.f;
        cg0 cg0Var3 = this.c;
        if (cg0Var3.f == null) {
            cg0Var3.a();
        }
        float[] fArr3 = cg0Var3.f;
        cg0 cg0Var4 = this.d;
        if (cg0Var4.f == null) {
            cg0Var4.a();
        }
        float[] fArr4 = cg0Var4.f;
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
