package hi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o implements TextWatcher {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        q qVar = this.a;
        qVar.m0.setVisibility((editable == null || editable.length() == 0) ? 0 : 8);
        qVar.U(false);
        qVar.V();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
