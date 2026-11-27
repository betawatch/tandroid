// default package

import android.content.Context;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ffc extends oc3 {
    public final /* synthetic */ kfc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffc(kfc kfcVar, Context context) {
        super(context);
        this.d = kfcVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [float[], java.io.Serializable] */
    @Override // oc3
    public final ja3 b(Context context) {
        d30 d30Var = new d30(context, (byte) 2);
        lm9 lm9Var = new lm9();
        lm9Var.f = this.d;
        cp4 cp4Var = new cp4();
        cp4Var.e = new float[0];
        cp4Var.b = (byte) 3;
        cp4Var.d = new float[513];
        cp4Var.a = new float[1024];
        cp4Var.c = new float[1024];
        int[] iArr = new int[1024];
        cp4Var.h = iArr;
        iArr[0] = 0;
        int i = 512;
        int i2 = 1;
        while (i2 < 1024) {
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr2 = (int[]) cp4Var.h;
                iArr2[i3 + i2] = iArr2[i3] + i;
            }
            i2 <<= 1;
            i >>= 1;
        }
        cp4Var.f = new float[1024];
        cp4Var.g = new float[1024];
        for (int i4 = 0; i4 < 1024; i4++) {
            double d = (-3.1415927f) / i4;
            ((float[]) cp4Var.f)[i4] = (float) Math.sin(d);
            ((float[]) cp4Var.g)[i4] = (float) Math.cos(d);
        }
        lm9Var.c = cp4Var;
        lm9Var.d = new float[1024];
        lm9Var.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_13);
        lm9Var.e = allocateDirect;
        allocateDirect.position(0);
        d30Var.d = new rx6(new q20[]{new akb(lm9Var)});
        return d30Var.b();
    }
}
