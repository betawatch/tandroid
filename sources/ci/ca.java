package ci;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class ca implements TextWatcher {
    public final /* synthetic */ fa a;

    public ca(fa faVar) {
        this.a = faVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        fa faVar = this.a;
        if (faVar.h || (callback = faVar.n) == null || editable == null) {
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
