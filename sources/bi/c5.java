package bi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c5 implements TextWatcher {
    public final /* synthetic */ d5 a;

    public c5(d5 d5Var) {
        this.a = d5Var;
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
