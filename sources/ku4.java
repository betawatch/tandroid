// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ku4 implements TextWatcher {
    public final /* synthetic */ lu4 a;

    public ku4(lu4 lu4Var) {
        this.a = lu4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        lu4 lu4Var = this.a;
        lu4Var.E0(!z ? nj.i(editable.toString(), lu4Var.A1.a) : nj.j(0L, lu4Var.A1.a), false, false, true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
