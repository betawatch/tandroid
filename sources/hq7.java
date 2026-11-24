// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hq7 implements TextWatcher {
    public final /* synthetic */ iq7 a;

    public hq7(iq7 iq7Var) {
        this.a = iq7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable == null ? "" : editable.toString();
        int indexOf = obj.indexOf(46);
        if (indexOf >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
            return;
        }
        boolean z = obj.isEmpty() || ".".equals(obj);
        nj i = z ? null : nj.i(obj, oj.b);
        if (z || i != null) {
            this.a.E0(z ? 0L : i.b);
        } else {
            editable.delete(obj.length() - 1, obj.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
