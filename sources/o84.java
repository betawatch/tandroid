// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o84 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ m84 c;
    public final /* synthetic */ TextView[] d;
    public final /* synthetic */ TLRPC.TL_factCheck e;

    public o84(int i, m84 m84Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = m84Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        int length = editable.length();
        boolean z = true;
        int i = this.b;
        if (length > i) {
            this.a = true;
            editable.delete(i, editable.length());
            m84 m84Var = this.c;
            hl.z3(m84Var);
            try {
                m84Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
        TextView[] textViewArr = this.d;
        if (textViewArr[0] != null) {
            if (editable.length() <= 0 && this.e != null) {
                z = false;
            }
            textViewArr[0].setText(ob6.M0(z ? 2131751319 : 2131746048, null));
            textViewArr[0].setTextColor(aob.w0(null, z ? aob.H5 : aob.q7, false));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
