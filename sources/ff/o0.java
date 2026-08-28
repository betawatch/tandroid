package ff;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.e5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 implements TextWatcher {
    public final e5 a;
    public final EditText b;
    public String c;
    public boolean d;
    public boolean e;

    public o0(fg.g gVar, e5 e5Var) {
        this.a = e5Var;
        this.b = gVar;
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
        this.a.q(this.b);
        if (isEmpty || !isEmpty2 || this.e) {
            return;
        }
        b(false);
    }

    public final void b(boolean z10) {
        if (this.d == z10) {
            return;
        }
        e5 e5Var = this.a;
        if (e5Var.c()) {
            if (z10) {
                e5Var.n();
            } else {
                e5Var.m();
            }
            this.d = z10;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
