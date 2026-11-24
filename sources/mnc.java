// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mnc implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ qhc b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ bz1 d;

    public mnc(String[] strArr, qhc qhcVar, Runnable[] runnableArr, bz1 bz1Var) {
        this.a = strArr;
        this.b = qhcVar;
        this.c = runnableArr;
        this.d = bz1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a[0] = editable.toString();
        this.b.run();
        Runnable[] runnableArr = this.c;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
        bz1 bz1Var = this.d;
        gm.r(bz1Var);
        gm.d3(bz1Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
