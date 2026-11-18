package kg;

import android.content.Context;
import android.text.Editable;
import bi.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.k3;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l extends k3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ n G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, String str, int i7, i6 i6Var, int i10) {
        super(context, str, false, false, i7, i6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = nVar;
                super(context, str, true, false, i7, i6Var);
                break;
            default:
                this.G = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void a(boolean z10) {
        d6 d6Var;
        d6 d6Var2;
        switch (this.F) {
            case 0:
                if (z10 && (d6Var = this.G.a) != null) {
                    d6Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (d6Var2 = this.G.a) != null) {
                    d6Var2.y0(3);
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
