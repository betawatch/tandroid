package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gg0 {
    public final hg0 a = new hg0();
    public final hg0 b = new hg0();
    public final hg0 c = new hg0();
    public final hg0 d = new hg0();
    public final ByteBuffer e;
    public int f;

    public gg0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        hg0 hg0Var = this.a;
        if (hg0Var.f == null) {
            hg0Var.a();
        }
        float[] fArr = hg0Var.f;
        hg0 hg0Var2 = this.b;
        if (hg0Var2.f == null) {
            hg0Var2.a();
        }
        float[] fArr2 = hg0Var2.f;
        hg0 hg0Var3 = this.c;
        if (hg0Var3.f == null) {
            hg0Var3.a();
        }
        float[] fArr3 = hg0Var3.f;
        hg0 hg0Var4 = this.d;
        if (hg0Var4.f == null) {
            hg0Var4.a();
        }
        float[] fArr4 = hg0Var4.f;
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
