package ci;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class y9 implements TextWatcher {
    public final /* synthetic */ ba a;

    public y9(ba baVar) {
        this.a = baVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        ba baVar = this.a;
        if (baVar.h || (callback = baVar.n) == null || editable == null) {
            return;
        }
        callback.run(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
