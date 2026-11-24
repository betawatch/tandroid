// default package

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class idc extends hd3 {
    public final /* synthetic */ ndc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idc(ndc ndcVar, Context context) {
        super(context);
        this.d = ndcVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [float[], java.io.Serializable] */
    @Override // hd3
    public final cb3 b(Context context) {
        c40 c40Var = new c40(context, (byte) 2);
        yk9 yk9Var = new yk9();
        yk9Var.f = this.d;
        yo4 yo4Var = new yo4();
        yo4Var.e = new float[0];
        yo4Var.b = (byte) 3;
        yo4Var.d = new float[513];
        yo4Var.a = new float[1024];
        yo4Var.c = new float[1024];
        int[] iArr = new int[1024];
        yo4Var.h = iArr;
        iArr[0] = 0;
        int i = 512;
        int i2 = 1;
        while (i2 < 1024) {
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr2 = (int[]) yo4Var.h;
                iArr2[i3 + i2] = iArr2[i3] + i;
            }
            i2 <<= 1;
            i >>= 1;
        }
        yo4Var.f = new float[1024];
        yo4Var.g = new float[1024];
        for (int i4 = 0; i4 < 1024; i4++) {
            double d = (-3.1415927f) / i4;
            ((float[]) yo4Var.f)[i4] = (float) Math.sin(d);
            ((float[]) yo4Var.g)[i4] = (float) Math.cos(d);
        }
        yk9Var.c = yo4Var;
        yk9Var.d = new float[1024];
        yk9Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        yk9Var.e = allocateDirect;
        allocateDirect.position(0);
        c40Var.d = new mx6(new p30[]{new fib(yk9Var)});
        return c40Var.b();
    }
}
