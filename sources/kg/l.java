package kg;

import android.content.Context;
import android.text.Editable;
import bi.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l3;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l extends l3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ n G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, String str, int i7, h6 h6Var, int i10) {
        super(context, str, false, false, i7, h6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, h6Var);
                break;
            default:
                this.G = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l3
    public final void a(boolean z10) {
        f6 f6Var;
        f6 f6Var2;
        switch (this.F) {
            case 0:
                if (z10 && (f6Var = this.G.a) != null) {
                    f6Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (f6Var2 = this.G.a) != null) {
                    f6Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l3
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
