// default package

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fbc extends vb3 {
    public final /* synthetic */ lbc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbc(lbc lbcVar, Context context) {
        super(context);
        this.d = lbcVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [float[], java.io.Serializable] */
    @Override // vb3
    public final q93 b(Context context) {
        c30 c30Var = new c30(context, (byte) 2);
        xi9 xi9Var = new xi9();
        xi9Var.f = this.d;
        xm4 xm4Var = new xm4();
        xm4Var.e = new float[0];
        xm4Var.b = (byte) 3;
        xm4Var.d = new float[513];
        xm4Var.a = new float[1024];
        xm4Var.c = new float[1024];
        int[] iArr = new int[1024];
        xm4Var.h = iArr;
        iArr[0] = 0;
        int i = 512;
        int i2 = 1;
        while (i2 < 1024) {
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr2 = (int[]) xm4Var.h;
                iArr2[i3 + i2] = iArr2[i3] + i;
            }
            i2 <<= 1;
            i >>= 1;
        }
        xm4Var.f = new float[1024];
        xm4Var.g = new float[1024];
        for (int i4 = 0; i4 < 1024; i4++) {
            double d = (-3.1415927f) / i4;
            ((float[]) xm4Var.f)[i4] = (float) Math.sin(d);
            ((float[]) xm4Var.g)[i4] = (float) Math.cos(d);
        }
        xi9Var.c = xm4Var;
        xi9Var.d = new float[1024];
        xi9Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        xi9Var.e = allocateDirect;
        allocateDirect.position(0);
        c30Var.d = new mv6(new p20[]{new egb(xi9Var)});
        return c30Var.b();
    }
}
