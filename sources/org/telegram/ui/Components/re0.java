package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class re0 {
    public final se0 a = new se0();
    public final se0 b = new se0();
    public final se0 c = new se0();
    public final se0 d = new se0();
    public final ByteBuffer e;
    public int f;

    public re0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        se0 se0Var = this.a;
        if (se0Var.f == null) {
            se0Var.a();
        }
        float[] fArr = se0Var.f;
        se0 se0Var2 = this.b;
        if (se0Var2.f == null) {
            se0Var2.a();
        }
        float[] fArr2 = se0Var2.f;
        se0 se0Var3 = this.c;
        if (se0Var3.f == null) {
            se0Var3.a();
        }
        float[] fArr3 = se0Var3.f;
        se0 se0Var4 = this.d;
        if (se0Var4.f == null) {
            se0Var4.a();
        }
        float[] fArr4 = se0Var4.f;
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
