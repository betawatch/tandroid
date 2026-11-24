// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ng6 extends pe6 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ kla f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng6(rg6 rg6Var, Context context, byte b) {
        super(rg6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = rg6Var;
                super(rg6Var.v0, context);
                break;
            default:
                this.f = rg6Var;
                break;
        }
    }

    @Override // pe6
    public final boolean a() {
        byte b = this.e;
        kla klaVar = this.f;
        switch (b) {
            case 0:
                return ((rg6) klaVar).l0;
            case 1:
                return ((rg6) klaVar).l0;
            default:
                return ((pf6) klaVar).N;
        }
    }

    @Override // pe6
    public final boolean b() {
        byte b = this.e;
        kla klaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() == 0) {
                    rg6 rg6Var = (rg6) klaVar;
                    if (rg6Var.b0 <= 0 || rg6Var.U == null) {
                        break;
                    }
                }
                break;
            case 1:
                rg6 rg6Var2 = (rg6) klaVar;
                if (isClickable() && getVisibility() == 0 && !rg6Var2.g0) {
                    ng6 ng6Var = rg6Var2.w;
                    if ((ng6Var == null || ng6Var.getVisibility() == 8) && !rg6Var2.l0) {
                        break;
                    }
                }
                break;
            default:
                if (getVisibility() == 0) {
                    pf6 pf6Var = (pf6) klaVar;
                    if (pf6Var.Q <= 0 || pf6Var.O == null) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng6(pf6 pf6Var, Context context) {
        super(pf6Var.b0, context);
        this.e = (byte) 2;
        this.f = pf6Var;
    }
}
