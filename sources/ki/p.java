package ki;

import ai.m8;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class p implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ m8 b;

    public p(String[] strArr, m8 m8Var) {
        this.a = strArr;
        this.b = m8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a[0] = editable.toString();
        this.b.run();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
