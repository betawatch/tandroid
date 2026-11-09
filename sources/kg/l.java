package kg;

import android.content.Context;
import android.text.Editable;
import fi.w3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k3;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l extends k3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i7, g6 g6Var, int i10) {
        super(context, str, false, false, i7, g6Var);
        this.E = i10;
        switch (i10) {
            case 1:
                this.F = mVar;
                super(context, str, true, false, i7, g6Var);
                break;
            default:
                this.F = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void a(boolean z9) {
        w3 w3Var;
        w3 w3Var2;
        switch (this.E) {
            case 0:
                if (z9 && (w3Var = this.F.a) != null) {
                    w3Var.y0(2);
                    break;
                }
                break;
            default:
                if (z9 && (w3Var2 = this.F.a) != null) {
                    w3Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                m mVar = this.F;
                mVar.n.d(mVar.s.getText().toString(), mVar.w.getText().toString());
                mVar.j0(true);
                break;
            default:
                m mVar2 = this.F;
                mVar2.n.d(mVar2.s.getText().toString(), mVar2.w.getText().toString());
                mVar2.j0(true);
                break;
        }
    }
}
