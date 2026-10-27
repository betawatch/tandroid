package ii;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        boolean isEmpty = TextUtils.isEmpty(j0Var.R);
        j0Var.R = obj;
        j0Var.F.h(0L, j0Var.e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
