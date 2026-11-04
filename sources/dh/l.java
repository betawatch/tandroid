package dh;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends c0 {
    public final /* synthetic */ o d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, e6 e6Var, int i3) {
        super(i3, context, e6Var);
        this.d2 = oVar;
    }

    @Override // org.telegram.ui.Components.xs
    public final void F(int i3, int i10) {
        if (i10 > i3) {
            this.d2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.xs, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        if (i3 == R.id.menu_delete || i3 == 16908320) {
            return this.d2.g0();
        }
        if (i3 == 16908322 || i3 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i3);
    }
}
