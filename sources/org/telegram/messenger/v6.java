package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class v6 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t6 c;
    public final /* synthetic */ TextView[] d;
    public final /* synthetic */ TLRPC.TL_factCheck e;

    public v6(int i7, t6 t6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i7;
        this.c = t6Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        int length = editable.length();
        boolean z9 = true;
        int i7 = this.b;
        if (length > i7) {
            this.a = true;
            editable.delete(i7, editable.length());
            t6 t6Var = this.c;
            g0.F3(t6Var);
            try {
                t6Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
        TextView[] textViewArr = this.d;
        if (textViewArr[0] != null) {
            if (editable.length() <= 0 && this.e != null) {
                z9 = false;
            }
            textViewArr[0].setText(id.M0(z9 ? 2131751355 : 2131746322, null));
            textViewArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, z9 ? org.telegram.ui.ActionBar.k6.H5 : org.telegram.ui.ActionBar.k6.q7, false));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
