// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class av9 implements TextWatcher {
    public final q20 a;
    public final l7 b;
    public String c;
    public boolean d;
    public boolean e;

    public av9(l7 l7Var, q20 q20Var) {
        this.a = q20Var;
        this.b = l7Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.c = obj;
        this.a.l(this.b);
        if (isEmpty || !isEmpty2 || this.e) {
            return;
        }
        b(false);
    }

    public final void b(boolean z) {
        if (this.d != z) {
            q20 q20Var = this.a;
            if (q20Var.c()) {
                if (z) {
                    q20Var.i();
                } else {
                    q20Var.h();
                }
                this.d = z;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
