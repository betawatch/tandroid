package ch;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m extends e0 {
    public final /* synthetic */ p i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Context context, i6 i6Var, int i7) {
        super(i7, context, i6Var);
        this.i2 = pVar;
    }

    @Override // org.telegram.ui.Components.mt
    public final void G(int i7, int i10) {
        if (i10 > i7) {
            this.i2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
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
