// default package

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d51 extends su3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ f51 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(f51 f51Var, Context context, String str, int i, ylb ylbVar, byte b) {
        super(context, str, false, false, i, ylbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = f51Var;
                super(context, str, true, false, i, ylbVar);
                break;
            default:
                this.G = f51Var;
                break;
        }
    }

    @Override // su3
    public final void a(boolean z) {
        va vaVar;
        va vaVar2;
        byte b = this.F;
        f51 f51Var = this.G;
        switch (b) {
            case 0:
                if (z && (vaVar = f51Var.a) != null) {
                    vaVar.z0(2);
                    break;
                }
                break;
            default:
                if (z && (vaVar2 = f51Var.a) != null) {
                    vaVar2.z0(3);
                    break;
                }
                break;
        }
    }

    @Override // su3
    public final void b(Editable editable) {
        byte b = this.F;
        f51 f51Var = this.G;
        switch (b) {
            case 0:
                f51Var.n.c(f51Var.s.getText().toString(), f51Var.w.getText().toString());
                f51Var.g0(true);
                break;
            default:
                f51Var.n.c(f51Var.s.getText().toString(), f51Var.w.getText().toString());
                f51Var.g0(true);
                break;
        }
    }
}
