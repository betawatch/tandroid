package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class k1 implements TextWatcher {
    public final /* synthetic */ l1 a;

    public k1(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        l1 l1Var = this.a;
        l1Var.o(!z10 ? ag.a.h(editable.toString(), l1Var.E.a) : ag.a.i(0L, l1Var.E.a), false, false, true);
        l1Var.b.c(l1Var.c.isFocused(), true ^ TextUtils.isEmpty(l1Var.c.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
