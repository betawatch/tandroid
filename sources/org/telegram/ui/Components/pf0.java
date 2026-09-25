package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pf0 {
    public final qf0 a = new qf0();
    public final qf0 b = new qf0();
    public final qf0 c = new qf0();
    public final qf0 d = new qf0();
    public final ByteBuffer e;
    public int f;

    public pf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        qf0 qf0Var = this.a;
        if (qf0Var.f == null) {
            qf0Var.a();
        }
        float[] fArr = qf0Var.f;
        qf0 qf0Var2 = this.b;
        if (qf0Var2.f == null) {
            qf0Var2.a();
        }
        float[] fArr2 = qf0Var2.f;
        qf0 qf0Var3 = this.c;
        if (qf0Var3.f == null) {
            qf0Var3.a();
        }
        float[] fArr3 = qf0Var3.f;
        qf0 qf0Var4 = this.d;
        if (qf0Var4.f == null) {
            qf0Var4.a();
        }
        float[] fArr4 = qf0Var4.f;
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
