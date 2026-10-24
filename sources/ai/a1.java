package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a1 implements TextWatcher {
    public final /* synthetic */ b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        b1 b1Var = this.a;
        b1Var.U(!z10 ? ag.a.h(editable.toString(), b1Var.n0.a) : ag.a.i(0L, b1Var.n0.a), false, false, true);
        b1Var.d0.c(b1Var.e0.isFocused(), true ^ TextUtils.isEmpty(b1Var.e0.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
