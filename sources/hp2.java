// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hp2 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pp2 b;

    public /* synthetic */ hp2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        pp2 pp2Var = this.b;
        switch (b) {
            case 0:
                String obj = editable.toString();
                boolean isEmpty = TextUtils.isEmpty(pp2Var.L1);
                pp2Var.L1 = obj;
                pp2Var.z1.h(0L, pp2Var.o1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                pp2Var.M1 = editable.toString();
                pp2Var.A1.g3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
