package ji;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ u(b0 b0Var, int i3) {
        this.a = i3;
        this.b = b0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                String obj = editable.toString();
                b0 b0Var = this.b;
                boolean isEmpty = TextUtils.isEmpty(b0Var.J1);
                b0Var.J1 = obj;
                b0Var.x1.h(0L, b0Var.m1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                b0 b0Var2 = this.b;
                b0Var2.K1 = obj2;
                b0Var2.y1.g3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final /* synthetic */ void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
