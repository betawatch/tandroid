// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c94 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a94 c;
    public final /* synthetic */ TextView[] d;
    public final /* synthetic */ TLRPC.TL_factCheck e;

    public c94(int i, a94 a94Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = a94Var;
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
            a94 a94Var = this.c;
            gm.z3(a94Var);
            try {
                a94Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
        TextView[] textViewArr = this.d;
        if (textViewArr[0] != null) {
            if (editable.length() <= 0 && this.e != null) {
                z = false;
            }
            textViewArr[0].setText(jb6.M0(z ? 2131751291 : 2131746054, null));
            textViewArr[0].setTextColor(cmb.w0(null, z ? cmb.G5 : cmb.p7, false));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
