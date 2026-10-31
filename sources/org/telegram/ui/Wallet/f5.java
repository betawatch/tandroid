package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ k3 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ce d;

    public f5(String[] strArr, k3 k3Var, Runnable[] runnableArr, ce ceVar) {
        this.a = strArr;
        this.b = k3Var;
        this.c = runnableArr;
        this.d = ceVar;
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
        ce ceVar = this.d;
        org.telegram.messenger.i0.r(ceVar);
        org.telegram.messenger.i0.h3(ceVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
