package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i51 extends l2.j {
    public final /* synthetic */ n51 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(Context context, n51 n51Var) {
        super(context);
        this.d = n51Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // l2.j
    public final n2.q0 a(Context context) {
        di.h4 h4Var = new di.h4(context, 1);
        li.b6 b6Var = new li.b6();
        b6Var.f = this.d;
        ai.n1 n1Var = new ai.n1();
        n1Var.e = new float[0];
        n1Var.a = 3;
        n1Var.d = new float[513];
        n1Var.b = new float[1024];
        n1Var.c = new float[1024];
        int[] iArr = new int[1024];
        n1Var.f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) n1Var.f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        n1Var.g = new float[1024];
        n1Var.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) n1Var.g)[i12] = (float) Math.sin(d);
            ((float[]) n1Var.h)[i12] = (float) Math.cos(d);
        }
        b6Var.c = n1Var;
        b6Var.d = new float[1024];
        b6Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        b6Var.e = allocateDirect;
        allocateDirect.position(0);
        h4Var.d = new h6.m(new f2.n[]{new n2.x0(b6Var)});
        return h4Var.a();
    }
}
