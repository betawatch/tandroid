package li;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ v(c0 c0Var, int i7) {
        this.a = i7;
        this.b = c0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                String obj = editable.toString();
                c0 c0Var = this.b;
                boolean isEmpty = TextUtils.isEmpty(c0Var.M1);
                c0Var.M1 = obj;
                c0Var.A1.h(0L, c0Var.p1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                c0 c0Var2 = this.b;
                c0Var2.N1 = obj2;
                c0Var2.B1.g3.O(true);
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
