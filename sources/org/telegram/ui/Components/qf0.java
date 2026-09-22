package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qf0 {
    public final rf0 a = new rf0();
    public final rf0 b = new rf0();
    public final rf0 c = new rf0();
    public final rf0 d = new rf0();
    public final ByteBuffer e;
    public int f;

    public qf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        rf0 rf0Var = this.a;
        if (rf0Var.f == null) {
            rf0Var.a();
        }
        float[] fArr = rf0Var.f;
        rf0 rf0Var2 = this.b;
        if (rf0Var2.f == null) {
            rf0Var2.a();
        }
        float[] fArr2 = rf0Var2.f;
        rf0 rf0Var3 = this.c;
        if (rf0Var3.f == null) {
            rf0Var3.a();
        }
        float[] fArr3 = rf0Var3.f;
        rf0 rf0Var4 = this.d;
        if (rf0Var4.f == null) {
            rf0Var4.a();
        }
        float[] fArr4 = rf0Var4.f;
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
