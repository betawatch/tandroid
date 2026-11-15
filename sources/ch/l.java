package ch;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l extends e0 {
    public final /* synthetic */ o i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, e6 e6Var, int i7) {
        super(i7, context, e6Var);
        this.i2 = oVar;
    }

    @Override // org.telegram.ui.Components.ft
    public final void G(int i7, int i10) {
        if (i10 > i7) {
            this.i2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ft, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 == R.id.menu_delete || i7 == 16908320) {
            return this.i2.g0();
        }
        if (i7 == 16908322 || i7 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i7);
    }
}
