package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fg0 {
    public final gg0 a = new gg0();
    public final gg0 b = new gg0();
    public final gg0 c = new gg0();
    public final gg0 d = new gg0();
    public final ByteBuffer e;
    public int f;

    public fg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        gg0 gg0Var = this.a;
        if (gg0Var.f == null) {
            gg0Var.a();
        }
        float[] fArr = gg0Var.f;
        gg0 gg0Var2 = this.b;
        if (gg0Var2.f == null) {
            gg0Var2.a();
        }
        float[] fArr2 = gg0Var2.f;
        gg0 gg0Var3 = this.c;
        if (gg0Var3.f == null) {
            gg0Var3.a();
        }
        float[] fArr3 = gg0Var3.f;
        gg0 gg0Var4 = this.d;
        if (gg0Var4.f == null) {
            gg0Var4.a();
        }
        float[] fArr4 = gg0Var4.f;
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
