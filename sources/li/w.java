package li;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class w implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ w(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                String obj = editable.toString();
                d0 d0Var = this.b;
                boolean isEmpty = TextUtils.isEmpty(d0Var.M1);
                d0Var.M1 = obj;
                d0Var.A1.h(0L, d0Var.p1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                d0 d0Var2 = this.b;
                d0Var2.N1 = obj2;
                d0Var2.B1.g3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final /* synthetic */ void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
