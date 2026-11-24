// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hc implements TextWatcher {
    public final /* synthetic */ jc a;

    public hc(jc jcVar) {
        this.a = jcVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jc jcVar = this.a;
        jcVar.h2.setVisibility((editable == null || editable.length() == 0) ? 0 : 8);
        jcVar.c1(false);
        jcVar.d1();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
