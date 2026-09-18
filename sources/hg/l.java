package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class l extends j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, e6 e6Var, int i11) {
        super(context, str, false, false, i10, e6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = mVar;
                super(context, str, true, false, i10, e6Var);
                break;
            default:
                this.y = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void a(boolean z10) {
        n61 n61Var;
        n61 n61Var2;
        switch (this.x) {
            case 0:
                if (z10 && (n61Var = this.y.a) != null) {
                    n61Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (n61Var2 = this.y.a) != null) {
                    n61Var2.y0(3);
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
                mVar.r.d(mVar.v.getText().toString(), mVar.w.getText().toString());
                mVar.e0(true);
                break;
            default:
                m mVar2 = this.y;
                mVar2.r.d(mVar2.v.getText().toString(), mVar2.w.getText().toString());
                mVar2.e0(true);
                break;
        }
    }
}
