package gi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class w implements TextWatcher {
    public final /* synthetic */ k0 a;

    public w(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        k0 k0Var = this.a;
        boolean isEmpty = TextUtils.isEmpty(k0Var.R);
        k0Var.R = obj;
        k0Var.F.h(0L, k0Var.e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
