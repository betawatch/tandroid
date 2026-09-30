package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m extends j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = nVar;
                super(context, str, true, false, i10, d6Var);
                break;
            default:
                this.y = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void a(boolean z10) {
        n61 n61Var;
        n61 n61Var2;
        switch (this.x) {
            case 0:
                if (z10 && (n61Var = this.y.a) != null) {
                    n61Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (n61Var2 = this.y.a) != null) {
                    n61Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                n nVar = this.y;
                nVar.n.d(nVar.s.getText().toString(), nVar.v.getText().toString());
                nVar.e0(true);
                break;
            default:
                n nVar2 = this.y;
                nVar2.n.d(nVar2.s.getText().toString(), nVar2.v.getText().toString());
                nVar2.e0(true);
                break;
        }
    }
}
