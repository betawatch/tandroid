// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eu3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gu3 d;

    public eu3(gu3 gu3Var, int i, qu3 qu3Var, boolean z) {
        this.d = gu3Var;
        this.a = i;
        this.b = qu3Var;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        gu3 gu3Var = this.d;
        boolean z = gu3Var.a;
        int i = this.a;
        if (!z) {
            if (i > 0 && editable != null && editable.length() > i) {
                gu3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i);
                qu3 qu3Var = this.b;
                qu3Var.setText(subSequence);
                qu3Var.setSelection(qu3Var.length());
                gu3Var.a = false;
            }
            gu3Var.b(editable);
        }
        if (this.c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                } else {
                    editable.delete(indexOf, indexOf + 1);
                }
            }
        }
        ho hoVar = gu3Var.y;
        if (hoVar == null || i <= 0) {
            return;
        }
        hoVar.a();
        gu3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
