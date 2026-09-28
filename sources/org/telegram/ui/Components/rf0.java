package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rf0 {
    public final sf0 a = new sf0();
    public final sf0 b = new sf0();
    public final sf0 c = new sf0();
    public final sf0 d = new sf0();
    public final ByteBuffer e;
    public int f;

    public rf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        sf0 sf0Var = this.a;
        if (sf0Var.f == null) {
            sf0Var.a();
        }
        float[] fArr = sf0Var.f;
        sf0 sf0Var2 = this.b;
        if (sf0Var2.f == null) {
            sf0Var2.a();
        }
        float[] fArr2 = sf0Var2.f;
        sf0 sf0Var3 = this.c;
        if (sf0Var3.f == null) {
            sf0Var3.a();
        }
        float[] fArr3 = sf0Var3.f;
        sf0 sf0Var4 = this.d;
        if (sf0Var4.f == null) {
            sf0Var4.a();
        }
        float[] fArr4 = sf0Var4.f;
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
