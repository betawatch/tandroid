package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class m extends j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context, String str, int i10, d6 d6Var, int i11) {
        super(context, str, false, false, i10, d6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = nVar;
                super(context, str, true, false, i10, d6Var);
                break;
            default:
                this.y = nVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void a(boolean z10) {
        y61 y61Var;
        y61 y61Var2;
        switch (this.x) {
            case 0:
                if (z10 && (y61Var = this.y.a) != null) {
                    y61Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (y61Var2 = this.y.a) != null) {
                    y61Var2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                n nVar = this.y;
                nVar.r.d(nVar.v.getText().toString(), nVar.w.getText().toString());
                nVar.e0(true);
                break;
            default:
                n nVar2 = this.y;
                nVar2.r.d(nVar2.v.getText().toString(), nVar2.w.getText().toString());
                nVar2.e0(true);
                break;
        }
    }
}
