// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ks7 implements TextWatcher {
    public final /* synthetic */ ls7 a;

    public ks7(ls7 ls7Var) {
        this.a = ls7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable == null ? "" : editable.toString();
        int indexOf = obj.indexOf(46);
        if (indexOf >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
            return;
        }
        boolean z = obj.isEmpty() || ".".equals(obj);
        nk i = z ? null : nk.i(obj, ok.b);
        if (z || i != null) {
            this.a.E0(z ? 0L : i.b);
        } else {
            editable.delete(obj.length() - 1, obj.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
