// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class fb9 implements TextWatcher {
    public final /* synthetic */ gb9 a;

    public fb9(gb9 gb9Var) {
        this.a = gb9Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        gb9 gb9Var = this.a;
        if (gb9Var.d2 != null) {
            gb9Var.d2 = null;
            gb9Var.a2.i(k96.M0(2131754056, null), true, true);
            l5c l5cVar = gb9Var.U1;
            if (l5cVar != null) {
                l5cVar.O(true);
            }
        }
        gb9Var.Y0();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
