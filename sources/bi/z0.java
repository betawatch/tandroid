package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z0 implements TextWatcher {
    public final /* synthetic */ a1 a;

    public z0(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z9 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z9 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        a1 a1Var = this.a;
        a1Var.f1(!z9 ? cg.a.h(editable.toString(), a1Var.i2.a) : cg.a.i(0L, a1Var.i2.a), false, false, true);
        a1Var.Y1.c(a1Var.Z1.isFocused(), true ^ TextUtils.isEmpty(a1Var.Z1.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
