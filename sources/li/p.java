package li;

import android.text.Editable;
import android.text.TextWatcher;
import bi.i8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class p implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ i8 b;

    public p(String[] strArr, i8 i8Var) {
        this.a = strArr;
        this.b = i8Var;
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
