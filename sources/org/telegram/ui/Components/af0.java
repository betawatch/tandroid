package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class af0 {
    public final bf0 a = new bf0();
    public final bf0 b = new bf0();
    public final bf0 c = new bf0();
    public final bf0 d = new bf0();
    public final ByteBuffer e;
    public int f;

    public af0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        bf0 bf0Var = this.a;
        if (bf0Var.f == null) {
            bf0Var.a();
        }
        float[] fArr = bf0Var.f;
        bf0 bf0Var2 = this.b;
        if (bf0Var2.f == null) {
            bf0Var2.a();
        }
        float[] fArr2 = bf0Var2.f;
        bf0 bf0Var3 = this.c;
        if (bf0Var3.f == null) {
            bf0Var3.a();
        }
        float[] fArr3 = bf0Var3.f;
        bf0 bf0Var4 = this.d;
        if (bf0Var4.f == null) {
            bf0Var4.a();
        }
        float[] fArr4 = bf0Var4.f;
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
