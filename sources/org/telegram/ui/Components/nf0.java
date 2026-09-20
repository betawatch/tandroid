package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nf0 {
    public final of0 a = new of0();
    public final of0 b = new of0();
    public final of0 c = new of0();
    public final of0 d = new of0();
    public final ByteBuffer e;
    public int f;

    public nf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        of0 of0Var = this.a;
        if (of0Var.f == null) {
            of0Var.a();
        }
        float[] fArr = of0Var.f;
        of0 of0Var2 = this.b;
        if (of0Var2.f == null) {
            of0Var2.a();
        }
        float[] fArr2 = of0Var2.f;
        of0 of0Var3 = this.c;
        if (of0Var3.f == null) {
            of0Var3.a();
        }
        float[] fArr3 = of0Var3.f;
        of0 of0Var4 = this.d;
        if (of0Var4.f == null) {
            of0Var4.a();
        }
        float[] fArr4 = of0Var4.f;
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
