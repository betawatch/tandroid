package ci;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class z9 implements TextWatcher {
    public final /* synthetic */ ca a;

    public z9(ca caVar) {
        this.a = caVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        ca caVar = this.a;
        if (caVar.h || (callback = caVar.n) == null || editable == null) {
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
