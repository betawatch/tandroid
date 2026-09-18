package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
