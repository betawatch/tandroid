package ch;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m extends e0 {
    public final /* synthetic */ p i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Context context, h6 h6Var, int i7) {
        super(i7, context, h6Var);
        this.i2 = pVar;
    }

    @Override // org.telegram.ui.Components.ot
    public final void G(int i7, int i10) {
        if (i10 > i7) {
            this.i2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ot, android.widget.EditText, android.widget.TextView
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
