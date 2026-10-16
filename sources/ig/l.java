package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l extends j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = mVar;
                super(context, str, true, false, i10, c6Var);
                break;
            default:
                this.y = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void a(boolean z10) {
        c71 c71Var;
        c71 c71Var2;
        switch (this.x) {
            case 0:
                if (z10 && (c71Var = this.y.a) != null) {
                    c71Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (c71Var2 = this.y.a) != null) {
                    c71Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                m mVar = this.y;
                mVar.n.d(mVar.s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                break;
            default:
                m mVar2 = this.y;
                mVar2.n.d(mVar2.s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                break;
        }
    }
}
