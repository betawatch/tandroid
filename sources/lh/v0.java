package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z4 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z4 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        w0 w0Var = this.a;
        w0Var.n(!z4 ? lf.a.h(editable.toString(), w0Var.B.a) : lf.a.i(0L, w0Var.B.a), false, false, true);
        w0Var.b.c(w0Var.c.isFocused(), true ^ TextUtils.isEmpty(w0Var.c.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
