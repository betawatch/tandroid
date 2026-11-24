// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class co0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ co0(lo0 lo0Var, byte b) {
        this.a = b;
        this.b = lo0Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        lo0 lo0Var = this.b;
        switch (b) {
            case 0:
                lo0Var.V = (ng1) obj;
                break;
            default:
                gl.c3(new z20(lo0Var, (TL_stories.TL_premium_boostsStatus) obj, (byte) 14));
                break;
        }
    }
}
