package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jf0 {
    public final kf0 a = new kf0();
    public final kf0 b = new kf0();
    public final kf0 c = new kf0();
    public final kf0 d = new kf0();
    public final ByteBuffer e;
    public int f;

    public jf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        kf0 kf0Var = this.a;
        if (kf0Var.f == null) {
            kf0Var.a();
        }
        float[] fArr = kf0Var.f;
        kf0 kf0Var2 = this.b;
        if (kf0Var2.f == null) {
            kf0Var2.a();
        }
        float[] fArr2 = kf0Var2.f;
        kf0 kf0Var3 = this.c;
        if (kf0Var3.f == null) {
            kf0Var3.a();
        }
        float[] fArr3 = kf0Var3.f;
        kf0 kf0Var4 = this.d;
        if (kf0Var4.f == null) {
            kf0Var4.a();
        }
        float[] fArr4 = kf0Var4.f;
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
