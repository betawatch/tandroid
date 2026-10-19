package ki;

import ai.m8;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
