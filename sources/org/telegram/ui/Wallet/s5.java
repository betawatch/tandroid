package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ u4 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ de d;

    public s5(String[] strArr, u4 u4Var, Runnable[] runnableArr, de deVar) {
        this.a = strArr;
        this.b = u4Var;
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
        org.telegram.messenger.g0.r(deVar);
        org.telegram.messenger.g0.h3(deVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
