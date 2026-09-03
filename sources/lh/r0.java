package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class r0 implements TextWatcher {
    public final /* synthetic */ s0 a;

    public r0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z4 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z4 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        s0 s0Var = this.a;
        s0Var.q(!z4 ? lf.a.h(editable.toString(), s0Var.E.a) : lf.a.i(0L, s0Var.E.a), false, false, true);
        s0Var.f.c(s0Var.h.isFocused(), true ^ TextUtils.isEmpty(s0Var.h.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
