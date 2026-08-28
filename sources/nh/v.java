package nh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ j0 a;

    public v(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        j0 j0Var = this.a;
        boolean isEmpty = TextUtils.isEmpty(j0Var.N);
        j0Var.N = obj;
        j0Var.B.h(0L, j0Var.e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
