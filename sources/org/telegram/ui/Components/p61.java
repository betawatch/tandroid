package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p61 extends i2.j {
    public final /* synthetic */ u61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(Context context, u61 u61Var) {
        super(context);
        this.d = u61Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // i2.j
    public final k2.w0 a(Context context) {
        k2.t0 t0Var = new k2.t0(context, 0);
        bi.r6 r6Var = new bi.r6();
        r6Var.f = this.d;
        org.telegram.messenger.k9 k9Var = new org.telegram.messenger.k9();
        k9Var.e = new float[0];
        k9Var.a = 3;
        k9Var.d = new float[513];
        k9Var.b = new float[1024];
        k9Var.c = new float[1024];
        int[] iArr = new int[1024];
        k9Var.h = iArr;
        iArr[0] = 0;
        int i10 = 512;
        int i11 = 1;
        while (i11 < 1024) {
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = (int[]) k9Var.h;
                iArr2[i12 + i11] = iArr2[i12] + i10;
            }
            i11 <<= 1;
            i10 >>= 1;
        }
        k9Var.f = new float[1024];
        k9Var.g = new float[1024];
        for (int i13 = 0; i13 < 1024; i13++) {
            double d = (-3.1415927f) / i13;
            ((float[]) k9Var.f)[i13] = (float) Math.sin(d);
            ((float[]) k9Var.g)[i13] = (float) Math.cos(d);
        }
        r6Var.c = k9Var;
        r6Var.d = new float[1024];
        r6Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        r6Var.e = allocateDirect;
        allocateDirect.position(0);
        t0Var.d = new android.support.v4.media.session.a0(new c2.m[]{new k2.d1(r6Var)});
        return t0Var.a();
    }
}
