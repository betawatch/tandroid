package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class l extends h3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, g6 g6Var, int i11) {
        super(context, str, false, false, i10, g6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = mVar;
                super(context, str, true, false, i10, g6Var);
                break;
            default:
                this.F = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.h3
    public final void a(boolean z10) {
        d71 d71Var;
        d71 d71Var2;
        switch (this.E) {
            case 0:
                if (z10 && (d71Var = this.F.a) != null) {
                    d71Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (d71Var2 = this.F.a) != null) {
                    d71Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                m mVar = this.F;
                mVar.v.d(mVar.x.getText().toString(), mVar.y.getText().toString());
                mVar.e0(true);
                break;
            default:
                m mVar2 = this.F;
                mVar2.v.d(mVar2.x.getText().toString(), mVar2.y.getText().toString());
                mVar2.e0(true);
                break;
        }
    }
}
