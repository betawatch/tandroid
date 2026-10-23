package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dg0 {
    public final eg0 a = new eg0();
    public final eg0 b = new eg0();
    public final eg0 c = new eg0();
    public final eg0 d = new eg0();
    public final ByteBuffer e;
    public int f;

    public dg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        eg0 eg0Var = this.a;
        if (eg0Var.f == null) {
            eg0Var.a();
        }
        float[] fArr = eg0Var.f;
        eg0 eg0Var2 = this.b;
        if (eg0Var2.f == null) {
            eg0Var2.a();
        }
        float[] fArr2 = eg0Var2.f;
        eg0 eg0Var3 = this.c;
        if (eg0Var3.f == null) {
            eg0Var3.a();
        }
        float[] fArr3 = eg0Var3.f;
        eg0 eg0Var4 = this.d;
        if (eg0Var4.f == null) {
            eg0Var4.a();
        }
        float[] fArr4 = eg0Var4.f;
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
