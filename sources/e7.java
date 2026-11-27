// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e7 extends sj2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(c24 c24Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = c24Var;
        this.f = hl.L(7.0f);
    }

    @Override // sj2
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((s7) obj).c.b.s0;
            case 1:
                return aob.v0(aob.Bf, (vnb) obj);
            case 2:
                return aob.v0(aob.Bf, ((c24) obj).H.a2);
            case 3:
                return aob.v0(aob.Q5, ((cw9) obj).e);
            default:
                return aob.v0(aob.Bf, ((e0a) obj).G.a1);
        }
    }

    public /* synthetic */ e7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(vnb vnbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = vnbVar;
        this.f = hl.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(e0a e0aVar) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = e0aVar;
        this.f = hl.L(7.0f);
    }
}
