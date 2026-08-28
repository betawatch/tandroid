package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class me0 {
    public final ne0 a = new ne0();
    public final ne0 b = new ne0();
    public final ne0 c = new ne0();
    public final ne0 d = new ne0();
    public final ByteBuffer e;
    public int f;

    public me0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        ne0 ne0Var = this.a;
        if (ne0Var.f == null) {
            ne0Var.a();
        }
        float[] fArr = ne0Var.f;
        ne0 ne0Var2 = this.b;
        if (ne0Var2.f == null) {
            ne0Var2.a();
        }
        float[] fArr2 = ne0Var2.f;
        ne0 ne0Var3 = this.c;
        if (ne0Var3.f == null) {
            ne0Var3.a();
        }
        float[] fArr3 = ne0Var3.f;
        ne0 ne0Var4 = this.d;
        if (ne0Var4.f == null) {
            ne0Var4.a();
        }
        float[] fArr4 = ne0Var4.f;
        for (int i9 = 0; i9 < 200; i9++) {
            byteBuffer.put((byte) (fArr2[i9] * 255.0f));
            byteBuffer.put((byte) (fArr3[i9] * 255.0f));
            byteBuffer.put((byte) (fArr4[i9] * 255.0f));
            byteBuffer.put((byte) (fArr[i9] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final boolean b() {
        return this.a.b() && this.b.b() && this.c.b() && this.d.b();
    }
}
