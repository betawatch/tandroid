package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kf0 {
    public final lf0 a = new lf0();
    public final lf0 b = new lf0();
    public final lf0 c = new lf0();
    public final lf0 d = new lf0();
    public final ByteBuffer e;
    public int f;

    public kf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        lf0 lf0Var = this.a;
        if (lf0Var.f == null) {
            lf0Var.a();
        }
        float[] fArr = lf0Var.f;
        lf0 lf0Var2 = this.b;
        if (lf0Var2.f == null) {
            lf0Var2.a();
        }
        float[] fArr2 = lf0Var2.f;
        lf0 lf0Var3 = this.c;
        if (lf0Var3.f == null) {
            lf0Var3.a();
        }
        float[] fArr3 = lf0Var3.f;
        lf0 lf0Var4 = this.d;
        if (lf0Var4.f == null) {
            lf0Var4.a();
        }
        float[] fArr4 = lf0Var4.f;
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
