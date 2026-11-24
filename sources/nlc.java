// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class nlc implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ mhc b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ox1 d;

    public nlc(String[] strArr, mhc mhcVar, Runnable[] runnableArr, ox1 ox1Var) {
        this.a = strArr;
        this.b = mhcVar;
        this.c = runnableArr;
        this.d = ox1Var;
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
        ox1 ox1Var = this.d;
        gl.r(ox1Var);
        gl.d3(ox1Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
