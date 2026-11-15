package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o0 implements TextWatcher {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        p0 p0Var = this.a;
        p0Var.f1(!z10 ? cg.a.h(editable.toString(), p0Var.j2.a) : cg.a.i(0L, p0Var.j2.a), false, false, true);
        p0Var.Z1.c(p0Var.a2.isFocused(), true ^ TextUtils.isEmpty(p0Var.a2.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
