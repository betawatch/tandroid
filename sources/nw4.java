// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nw4 implements TextWatcher {
    public final /* synthetic */ ow4 a;

    public nw4(ow4 ow4Var) {
        this.a = ow4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        ow4 ow4Var = this.a;
        ow4Var.F0(!z ? oj.i(editable.toString(), ow4Var.A1.a) : oj.j(0L, ow4Var.A1.a), false, false, true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
