// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hi7 extends b61 {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ mz0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi7(mz0 mz0Var, Context context, ylb ylbVar, byte b) {
        super(ylbVar, context, true);
        this.m0 = b;
        this.n0 = mz0Var;
    }

    @Override // b61
    public final float b(float f, float f2) {
        boolean z;
        byte b = this.m0;
        mz0 mz0Var = this.n0;
        switch (b) {
            case 0:
                ji7 ji7Var = (ji7) mz0Var;
                z = ji7Var.i2 == 0.0f;
                ji7Var.i2 = f;
                if (z) {
                    ji7Var.j2 = new ph2(ji7Var, (byte) 2);
                    ji7Var.Z0(false);
                    break;
                }
                break;
            default:
                t9c t9cVar = (t9c) mz0Var;
                z = t9cVar.n2 == 0.0f;
                t9cVar.n2 = f;
                if (z) {
                    t9cVar.o2 = new ph2(t9cVar, (byte) 4);
                    t9cVar.e1(false);
                    break;
                }
                break;
        }
        return f;
    }
}
