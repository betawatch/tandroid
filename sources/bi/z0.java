package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        a1Var.f1(!z9 ? cg.a.h(editable.toString(), a1Var.f2.a) : cg.a.i(0L, a1Var.f2.a), false, false, true);
        a1Var.V1.c(a1Var.W1.isFocused(), true ^ TextUtils.isEmpty(a1Var.W1.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
