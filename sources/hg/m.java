package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        l61 l61Var;
        l61 l61Var2;
        switch (this.x) {
            case 0:
                if (z10 && (l61Var = this.y.a) != null) {
                    l61Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (l61Var2 = this.y.a) != null) {
                    l61Var2.x0(3);
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
