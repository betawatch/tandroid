package jg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m extends g3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ n F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context, String str, int i10, u6 u6Var, int i11) {
        super(context, str, false, false, i10, u6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = nVar;
                super(context, str, true, false, i10, u6Var);
                break;
            default:
                this.F = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void a(boolean z10) {
        m71 m71Var;
        m71 m71Var2;
        switch (this.E) {
            case 0:
                if (z10 && (m71Var = this.F.a) != null) {
                    m71Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (m71Var2 = this.F.a) != null) {
                    m71Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                n nVar = this.F;
                nVar.n.d(nVar.s.getText().toString(), nVar.v.getText().toString());
                nVar.f0(true);
                break;
            default:
                n nVar2 = this.F;
                nVar2.n.d(nVar2.s.getText().toString(), nVar2.v.getText().toString());
                nVar2.f0(true);
                break;
        }
    }
}
