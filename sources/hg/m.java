package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m extends i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context, String str, int i10, e6 e6Var, int i11) {
        super(context, str, false, false, i10, e6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = nVar;
                super(context, str, true, false, i10, e6Var);
                break;
            default:
                this.y = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
    public final void a(boolean z10) {
        y51 y51Var;
        y51 y51Var2;
        switch (this.x) {
            case 0:
                if (z10 && (y51Var = this.y.a) != null) {
                    y51Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (y51Var2 = this.y.a) != null) {
                    y51Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
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
