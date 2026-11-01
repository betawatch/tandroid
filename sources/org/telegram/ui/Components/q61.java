package org.telegram.ui.Components;

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q61 extends i2.j {
    public final /* synthetic */ v61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(Context context, v61 v61Var) {
        super(context);
        this.d = v61Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [float[], java.io.Serializable] */
    @Override // i2.j
    public final k2.w0 a(Context context) {
        k2.t0 t0Var = new k2.t0(context, 0);
        bi.r6 r6Var = new bi.r6();
        r6Var.f = this.d;
        org.telegram.messenger.l9 l9Var = new org.telegram.messenger.l9();
        l9Var.e = new float[0];
        l9Var.a = 3;
        l9Var.d = new float[513];
        l9Var.b = new float[1024];
        l9Var.c = new float[1024];
        int[] iArr = new int[1024];
        l9Var.h = iArr;
        iArr[0] = 0;
        int i10 = 512;
        int i11 = 1;
        while (i11 < 1024) {
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = (int[]) l9Var.h;
                iArr2[i12 + i11] = iArr2[i12] + i10;
            }
            i11 <<= 1;
            i10 >>= 1;
        }
        l9Var.f = new float[1024];
        l9Var.g = new float[1024];
        for (int i13 = 0; i13 < 1024; i13++) {
            double d = (-3.1415927f) / i13;
            ((float[]) l9Var.f)[i13] = (float) Math.sin(d);
            ((float[]) l9Var.g)[i13] = (float) Math.cos(d);
        }
        r6Var.c = l9Var;
        r6Var.d = new float[1024];
        r6Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        r6Var.e = allocateDirect;
        allocateDirect.position(0);
        t0Var.d = new android.support.v4.media.session.a0(new c2.m[]{new k2.d1(r6Var)});
        return t0Var.a();
    }
}
