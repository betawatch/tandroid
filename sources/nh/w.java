package nh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w implements TextWatcher {
    public final /* synthetic */ j0 a;

    public w(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        j0 j0Var = this.a;
        j0Var.O = obj;
        j0Var.C.U2.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
