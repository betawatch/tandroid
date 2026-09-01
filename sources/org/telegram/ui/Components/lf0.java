package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lf0 {
    public final mf0 a = new mf0();
    public final mf0 b = new mf0();
    public final mf0 c = new mf0();
    public final mf0 d = new mf0();
    public final ByteBuffer e;
    public int f;

    public lf0() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.e = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a() {
        ByteBuffer byteBuffer = this.e;
        byteBuffer.position(0);
        mf0 mf0Var = this.a;
        if (mf0Var.f == null) {
            mf0Var.a();
        }
        float[] fArr = mf0Var.f;
        mf0 mf0Var2 = this.b;
        if (mf0Var2.f == null) {
            mf0Var2.a();
        }
        float[] fArr2 = mf0Var2.f;
        mf0 mf0Var3 = this.c;
        if (mf0Var3.f == null) {
            mf0Var3.a();
        }
        float[] fArr3 = mf0Var3.f;
        mf0 mf0Var4 = this.d;
        if (mf0Var4.f == null) {
            mf0Var4.a();
        }
        float[] fArr4 = mf0Var4.f;
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
