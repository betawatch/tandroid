package di;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
