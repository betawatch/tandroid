package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ce;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ r b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ce d;

    public t5(String[] strArr, r rVar, Runnable[] runnableArr, ce ceVar) {
        this.a = strArr;
        this.b = rVar;
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
        org.telegram.messenger.g0.r(ceVar);
        org.telegram.messenger.g0.h3(ceVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
