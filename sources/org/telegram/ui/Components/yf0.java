package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yf0 {
    public final zf0 a = new zf0();
    public final zf0 b = new zf0();
    public final zf0 c = new zf0();
    public final zf0 d = new zf0();
    public final ByteBuffer e;
    public int f;

    public yf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        zf0 zf0Var = this.a;
        if (zf0Var.f == null) {
            zf0Var.a();
        }
        float[] fArr = zf0Var.f;
        zf0 zf0Var2 = this.b;
        if (zf0Var2.f == null) {
            zf0Var2.a();
        }
        float[] fArr2 = zf0Var2.f;
        zf0 zf0Var3 = this.c;
        if (zf0Var3.f == null) {
            zf0Var3.a();
        }
        float[] fArr3 = zf0Var3.f;
        zf0 zf0Var4 = this.d;
        if (zf0Var4.f == null) {
            zf0Var4.a();
        }
        float[] fArr4 = zf0Var4.f;
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
