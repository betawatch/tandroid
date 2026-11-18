package bi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z4 implements TextWatcher {
    public final /* synthetic */ a5 a;

    public z4(a5 a5Var) {
        this.a = a5Var;
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
