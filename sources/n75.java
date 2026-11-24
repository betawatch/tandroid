// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n75 implements TextWatcher {
    public final /* synthetic */ g95 a;

    public n75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g95 g95Var = this.a;
        io ioVar = g95Var.F1;
        g95Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i = g95Var.W1;
        String valueOf = codePointCount + 25 > i ? String.valueOf(i - codePointCount) : null;
        ioVar.a();
        ioVar.setText(valueOf);
        ioVar.setTextColor(codePointCount >= i ? -1280137 : -1);
        if (codePointCount > i) {
            xx0.E.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
