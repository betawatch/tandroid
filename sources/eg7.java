// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eg7 extends u41 {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ fy0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg7(fy0 fy0Var, Context context, wjb wjbVar, byte b) {
        super(wjbVar, context, true);
        this.m0 = b;
        this.n0 = fy0Var;
    }

    @Override // u41
    public final float b(float f, float f2) {
        boolean z;
        byte b = this.m0;
        fy0 fy0Var = this.n0;
        switch (b) {
            case 0:
                gg7 gg7Var = (gg7) fy0Var;
                z = gg7Var.i2 == 0.0f;
                gg7Var.i2 = f;
                if (z) {
                    gg7Var.j2 = new bg2(gg7Var, (byte) 2);
                    gg7Var.Z0(false);
                    break;
                }
                break;
            default:
                s7c s7cVar = (s7c) fy0Var;
                z = s7cVar.n2 == 0.0f;
                s7cVar.n2 = f;
                if (z) {
                    s7cVar.o2 = new bg2(s7cVar, (byte) 4);
                    s7cVar.e1(false);
                    break;
                }
                break;
        }
        return f;
    }
}
