package ii;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                boolean isEmpty = TextUtils.isEmpty(d0Var.I1);
                d0Var.I1 = obj;
                d0Var.w1.h(0L, d0Var.l1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                d0 d0Var2 = this.b;
                d0Var2.J1 = obj2;
                d0Var2.x1.f3.O(true);
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
