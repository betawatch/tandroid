package gg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l extends i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = nVar;
                super(context, str, true, false, i10, f6Var);
                break;
            default:
                this.y = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
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
