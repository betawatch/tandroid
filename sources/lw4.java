// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lw4 implements TextWatcher {
    public final /* synthetic */ mw4 a;

    public lw4(mw4 mw4Var) {
        this.a = mw4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        mw4 mw4Var = this.a;
        mw4Var.E0(!z ? nk.i(editable.toString(), mw4Var.A1.a) : nk.j(0L, mw4Var.A1.a), false, false, true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
