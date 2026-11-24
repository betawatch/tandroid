// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g62 implements TextWatcher {
    public final /* synthetic */ f62 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s20 c;

    public g62(s20 s20Var, f62 f62Var, int i) {
        this.c = s20Var;
        this.a = f62Var;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        k62 k62Var = (k62) this.c.e;
        f62 f62Var = this.a;
        if (f62Var.getTag() != null) {
            return;
        }
        int i = this.b;
        int i2 = i == 11 ? k62Var.o0 : k62Var.n0;
        s49 K = k62Var.s.K(i2);
        if (K != null && k62Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            vu3.l(editable, f62Var.getEditField().getPaint().getFontMetricsInt(), false);
            k62Var.y.setDirection(1);
            k62Var.y.setDelegate(f62Var);
            k62Var.y.setTranslationY(K.a.getY());
            k62Var.y.d();
        }
        if (i == 11) {
            k62Var.P = editable;
        } else {
            k62Var.O = editable;
        }
        if (K != null) {
            k62Var.i0(i2, K.a);
        }
        k62Var.T();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
