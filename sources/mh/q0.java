package mh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q0 implements TextWatcher {
    public final /* synthetic */ r0 a;

    public q0(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z4 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z4 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        r0 r0Var = this.a;
        r0Var.q(!z4 ? mf.a.h(editable.toString(), r0Var.E.a) : mf.a.i(0L, r0Var.E.a), false, false, true);
        r0Var.f.c(r0Var.h.isFocused(), true ^ TextUtils.isEmpty(r0Var.h.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
