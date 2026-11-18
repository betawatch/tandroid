package bi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y4 implements TextWatcher {
    public final /* synthetic */ z4 a;

    public y4(z4 z4Var) {
        this.a = z4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable == null ? "" : editable.toString();
        int indexOf = obj.indexOf(46);
        if (indexOf >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
            return;
        }
        boolean z10 = obj.isEmpty() || ".".equals(obj);
        cg.a i7 = z10 ? null : cg.a.i(obj, cg.b.b);
        if (z10 || i7 != null) {
            this.a.K0(z10 ? 0L : i7.b);
        } else {
            editable.delete(obj.length() - 1, obj.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
