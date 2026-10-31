package ag;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ii;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends org.telegram.ui.Cells.m3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ w F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, Context context, String str, int i10, p6 p6Var, int i11) {
        super(context, str, false, false, i10, p6Var);
        this.E = i11;
        switch (i11) {
            case 1:
                this.F = wVar;
                super(context, str, true, false, i10, p6Var);
                break;
            default:
                this.F = wVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m3
    public final void a(boolean z10) {
        ii iiVar;
        ii iiVar2;
        switch (this.E) {
            case 0:
                if (z10 && (iiVar = this.F.a) != null) {
                    iiVar.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (iiVar2 = this.F.a) != null) {
                    iiVar2.y0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                w wVar = this.F;
                wVar.n.d(wVar.s.getText().toString(), wVar.w.getText().toString());
                wVar.i0(true);
                break;
            default:
                w wVar2 = this.F;
                wVar2.n.d(wVar2.s.getText().toString(), wVar2.w.getText().toString());
                wVar2.i0(true);
                break;
        }
    }
}
