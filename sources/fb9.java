// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
