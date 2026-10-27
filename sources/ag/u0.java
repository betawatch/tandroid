package ag;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import fi.c2;
import org.telegram.ui.sx;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u0 implements TextWatcher {
    public final sx a;
    public final EditText b;
    public String c;
    public boolean d;
    public boolean e;

    public u0(c2 c2Var, sx sxVar) {
        this.a = sxVar;
        this.b = c2Var;
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

    public final void b(boolean z10) {
        if (this.d == z10) {
            return;
        }
        sx sxVar = this.a;
        if (sxVar.c()) {
            if (z10) {
                sxVar.i();
            } else {
                sxVar.h();
            }
            this.d = z10;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
