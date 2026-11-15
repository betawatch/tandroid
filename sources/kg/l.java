package kg;

import android.content.Context;
import android.text.Editable;
import bi.v3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k3;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l extends k3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ n G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, String str, int i7, e6 e6Var, int i10) {
        super(context, str, false, false, i7, e6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, e6Var);
                break;
            default:
                this.G = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void a(boolean z10) {
        v3 v3Var;
        v3 v3Var2;
        switch (this.F) {
            case 0:
                if (z10 && (v3Var = this.G.a) != null) {
                    v3Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (v3Var2 = this.G.a) != null) {
                    v3Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                n nVar = this.G;
                nVar.n.d(nVar.s.getText().toString(), nVar.w.getText().toString());
                nVar.j0(true);
                break;
            default:
                n nVar2 = this.G;
                nVar2.n.d(nVar2.s.getText().toString(), nVar2.w.getText().toString());
                nVar2.j0(true);
                break;
        }
    }
}
