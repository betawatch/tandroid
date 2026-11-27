// default package

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e41 extends zt3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ g41 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(g41 g41Var, Context context, String str, int i, vnb vnbVar, byte b) {
        super(context, str, false, false, i, vnbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = g41Var;
                super(context, str, true, false, i, vnbVar);
                break;
            default:
                this.G = g41Var;
                break;
        }
    }

    @Override // zt3
    public final void a(boolean z) {
        wa waVar;
        wa waVar2;
        byte b = this.F;
        g41 g41Var = this.G;
        switch (b) {
            case 0:
                if (z && (waVar = g41Var.a) != null) {
                    waVar.A0(2);
                    break;
                }
                break;
            default:
                if (z && (waVar2 = g41Var.a) != null) {
                    waVar2.A0(3);
                    break;
                }
                break;
        }
    }

    @Override // zt3
    public final void b(Editable editable) {
        byte b = this.F;
        g41 g41Var = this.G;
        switch (b) {
            case 0:
                g41Var.n.c(g41Var.s.getText().toString(), g41Var.w.getText().toString());
                g41Var.f0(true);
                break;
            default:
                g41Var.n.c(g41Var.s.getText().toString(), g41Var.w.getText().toString());
                g41Var.f0(true);
                break;
        }
    }
}
