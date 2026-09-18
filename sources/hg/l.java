package hg;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l extends i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = mVar;
                super(context, str, true, false, i10, f6Var);
                break;
            default:
                this.y = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
    public final void a(boolean z10) {
        z51 z51Var;
        z51 z51Var2;
        switch (this.x) {
            case 0:
                if (z10 && (z51Var = this.y.a) != null) {
                    z51Var.y0(2);
                    break;
                }
                break;
            default:
                if (z10 && (z51Var2 = this.y.a) != null) {
                    z51Var2.y0(3);
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
