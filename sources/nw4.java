// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
