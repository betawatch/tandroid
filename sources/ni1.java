// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ni1 implements TextWatcher {
    public final /* synthetic */ zi1 a;

    public ni1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        zi1 zi1Var = this.a;
        fi1 fi1Var = zi1Var.f1;
        ps0 ps0Var = zi1Var.O0;
        if (zi1Var.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        zi1Var.N0 = parseLong;
        long j = zi1Var.D0.amount;
        if (parseLong > j) {
            zi1Var.N0 = j;
            zi1Var.L0 = true;
            ps0Var.setText(Long.toString(j));
            ps0Var.setSelection(ps0Var.getText().length());
            zi1Var.L0 = false;
        }
        zi1Var.M0 = zi1Var.N0 == zi1Var.D0.amount;
        gl.r(fi1Var);
        fi1Var.run();
        zi1Var.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
