package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p51 extends l2.j {
    public final /* synthetic */ u51 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(Context context, u51 u51Var) {
        super(context);
        this.d = u51Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // l2.j
    public final n2.r0 a(Context context) {
        fi.a4 a4Var = new fi.a4(context, 1);
        oi.z5 z5Var = new oi.z5();
        z5Var.f = this.d;
        ci.b1 b1Var = new ci.b1();
        b1Var.e = new float[0];
        b1Var.a = 3;
        b1Var.d = new float[513];
        b1Var.b = new float[1024];
        b1Var.c = new float[1024];
        int[] iArr = new int[1024];
        b1Var.f = iArr;
        iArr[0] = 0;
        int i7 = 512;
        int i10 = 1;
        while (i10 < 1024) {
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr2 = (int[]) b1Var.f;
                iArr2[i11 + i10] = iArr2[i11] + i7;
            }
            i10 <<= 1;
            i7 >>= 1;
        }
        b1Var.g = new float[1024];
        b1Var.h = new float[1024];
        for (int i12 = 0; i12 < 1024; i12++) {
            double d = (-3.1415927f) / i12;
            ((float[]) b1Var.g)[i12] = (float) Math.sin(d);
            ((float[]) b1Var.h)[i12] = (float) Math.cos(d);
        }
        z5Var.c = b1Var;
        z5Var.d = new float[1024];
        z5Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        z5Var.e = allocateDirect;
        allocateDirect.position(0);
        a4Var.d = new h6.m(new f2.m[]{new n2.y0(z5Var)});
        return a4Var.a();
    }
}
