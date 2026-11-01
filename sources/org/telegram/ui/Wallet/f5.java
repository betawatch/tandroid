package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ de d;

    public f5(String[] strArr, m2 m2Var, Runnable[] runnableArr, de deVar) {
        this.a = strArr;
        this.b = m2Var;
        this.c = runnableArr;
        this.d = deVar;
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
        de deVar = this.d;
        org.telegram.messenger.i0.r(deVar);
        org.telegram.messenger.i0.h3(deVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
