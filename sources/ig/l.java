package ig;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l extends i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = mVar;
                super(context, str, true, false, i10, d6Var);
                break;
            default:
                this.y = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
    public final void a(boolean z10) {
        u61 u61Var;
        u61 u61Var2;
        switch (this.x) {
            case 0:
                if (z10 && (u61Var = this.y.a) != null) {
                    u61Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (u61Var2 = this.y.a) != null) {
                    u61Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
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
