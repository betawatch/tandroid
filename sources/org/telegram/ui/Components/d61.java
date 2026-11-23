package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d61 extends l2.j {
    public final /* synthetic */ i61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(Context context, i61 i61Var) {
        super(context);
        this.d = i61Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // l2.j
    public final n2.r0 a(Context context) {
        fi.y3 y3Var = new fi.y3(context, 1);
        oi.b6 b6Var = new oi.b6();
        b6Var.f = this.d;
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
        b6Var.c = b1Var;
        b6Var.d = new float[1024];
        b6Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        b6Var.e = allocateDirect;
        allocateDirect.position(0);
        y3Var.d = new h6.m(new f2.n[]{new n2.y0(b6Var)});
        return y3Var.a();
    }
}
