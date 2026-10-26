package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ag0 {
    public final bg0 a = new bg0();
    public final bg0 b = new bg0();
    public final bg0 c = new bg0();
    public final bg0 d = new bg0();
    public final ByteBuffer e;
    public int f;

    public ag0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        bg0 bg0Var = this.a;
        if (bg0Var.f == null) {
            bg0Var.a();
        }
        float[] fArr = bg0Var.f;
        bg0 bg0Var2 = this.b;
        if (bg0Var2.f == null) {
            bg0Var2.a();
        }
        float[] fArr2 = bg0Var2.f;
        bg0 bg0Var3 = this.c;
        if (bg0Var3.f == null) {
            bg0Var3.a();
        }
        float[] fArr3 = bg0Var3.f;
        bg0 bg0Var4 = this.d;
        if (bg0Var4.f == null) {
            bg0Var4.a();
        }
        float[] fArr4 = bg0Var4.f;
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
