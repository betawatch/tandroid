// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class aqc implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ slc b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ a84 d;

    public aqc(String[] strArr, slc slcVar, Runnable[] runnableArr, a84 a84Var) {
        this.a = strArr;
        this.b = slcVar;
        this.c = runnableArr;
        this.d = a84Var;
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
        a84 a84Var = this.d;
        hl.r(a84Var);
        hl.d3(a84Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
