// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d7 extends wi2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(h14 h14Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = h14Var;
        this.f = gl.L(7.0f);
    }

    @Override // wi2
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((r7) obj).c.b.s0;
            case 1:
                return bkb.v0(bkb.Af, (wjb) obj);
            case 2:
                return bkb.v0(bkb.Af, ((h14) obj).H.a2);
            case 3:
                return bkb.v0(bkb.P5, ((js9) obj).e);
            default:
                return bkb.v0(bkb.Af, ((lw9) obj).G.a1);
        }
    }

    public /* synthetic */ d7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(wjb wjbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = wjbVar;
        this.f = gl.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(lw9 lw9Var) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = lw9Var;
        this.f = gl.L(7.0f);
    }
}
