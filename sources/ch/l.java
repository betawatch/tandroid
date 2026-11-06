package ch;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l extends d0 {
    public final /* synthetic */ o c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, f6 f6Var, int i7) {
        super(i7, context, f6Var);
        this.c2 = oVar;
    }

    @Override // org.telegram.ui.Components.ys
    public final void F(int i7, int i10) {
        if (i10 > i7) {
            this.c2.E.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ys, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 == R.id.menu_delete || i7 == 16908320) {
            return this.c2.g0();
        }
        if (i7 == 16908322 || i7 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i7);
    }
}
