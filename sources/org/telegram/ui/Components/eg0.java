package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class eg0 {
    public final fg0 a = new fg0();
    public final fg0 b = new fg0();
    public final fg0 c = new fg0();
    public final fg0 d = new fg0();
    public final ByteBuffer e;
    public int f;

    public eg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        fg0 fg0Var = this.a;
        if (fg0Var.f == null) {
            fg0Var.a();
        }
        float[] fArr = fg0Var.f;
        fg0 fg0Var2 = this.b;
        if (fg0Var2.f == null) {
            fg0Var2.a();
        }
        float[] fArr2 = fg0Var2.f;
        fg0 fg0Var3 = this.c;
        if (fg0Var3.f == null) {
            fg0Var3.a();
        }
        float[] fArr3 = fg0Var3.f;
        fg0 fg0Var4 = this.d;
        if (fg0Var4.f == null) {
            fg0Var4.a();
        }
        float[] fArr4 = fg0Var4.f;
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
