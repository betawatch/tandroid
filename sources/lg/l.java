package lg;

import ai.h4;
import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends k3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ m G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i3, e6 e6Var, int i10) {
        super(context, str, false, false, i3, e6Var);
        this.F = i10;
        switch (i10) {
            case 1:
                this.G = mVar;
                super(context, str, true, false, i3, e6Var);
                break;
            default:
                this.G = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void a(boolean z10) {
        h4 h4Var;
        h4 h4Var2;
        switch (this.F) {
            case 0:
                if (z10 && (h4Var = this.G.a) != null) {
                    h4Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (h4Var2 = this.G.a) != null) {
                    h4Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                m mVar = this.G;
                mVar.n.d(mVar.s.getText().toString(), mVar.w.getText().toString());
                mVar.j0(true);
                break;
            default:
                m mVar2 = this.G;
                mVar2.n.d(mVar2.s.getText().toString(), mVar2.w.getText().toString());
                mVar2.j0(true);
                break;
        }
    }
}
