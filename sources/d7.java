// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d7 extends kk2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(s24 s24Var) {
        super(1.25f);
        this.h = (byte) 2;
        this.i = s24Var;
        this.f = gm.L(7.0f);
    }

    @Override // kk2
    public final int a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((r7) obj).c.b.s0;
            case 1:
                return cmb.v0(cmb.Af, (ylb) obj);
            case 2:
                return cmb.v0(cmb.Af, ((s24) obj).H.a2);
            case 3:
                return cmb.v0(cmb.P5, ((lu9) obj).e);
            default:
                return cmb.v0(cmb.Af, ((ny9) obj).G.a1);
        }
    }

    public /* synthetic */ d7(FrameLayout frameLayout, byte b) {
        this.h = b;
        this.i = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ylb ylbVar) {
        super(1.25f);
        this.h = (byte) 1;
        this.i = ylbVar;
        this.f = gm.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ny9 ny9Var) {
        super(1.25f);
        this.h = (byte) 4;
        this.i = ny9Var;
        this.f = gm.L(7.0f);
    }
}
