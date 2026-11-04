package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h51 extends k2.j {
    public final /* synthetic */ m51 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(Context context, m51 m51Var) {
        super(context);
        this.d = m51Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // k2.j
    public final m2.s0 a(Context context) {
        ei.i4 i4Var = new ei.i4(context, 1);
        mi.c6 c6Var = new mi.c6();
        c6Var.f = this.d;
        bi.c1 c1Var = new bi.c1();
        c1Var.e = new float[0];
        c1Var.a = 3;
        c1Var.d = new float[513];
        c1Var.b = new float[1024];
        c1Var.c = new float[1024];
        int[] iArr = new int[1024];
        c1Var.f = iArr;
        iArr[0] = 0;
        int i3 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) c1Var.f;
                iArr2[i11 + i10] = iArr2[i11] + i3;
            }
            i10 <<= 1;
            i3 >>= 1;
        }
        c1Var.g = new float[1024];
        c1Var.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) c1Var.g)[i12] = (float) Math.sin(d);
            ((float[]) c1Var.h)[i12] = (float) Math.cos(d);
        }
        c6Var.c = c1Var;
        c6Var.d = new float[1024];
        c6Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        c6Var.e = allocateDirect;
        allocateDirect.position(0);
        i4Var.d = new k4.j(new m2.z0(c6Var));
        return i4Var.a();
    }
}
