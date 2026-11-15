package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.de;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class d5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ r b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ de d;

    public d5(String[] strArr, r rVar, Runnable[] runnableArr, de deVar) {
        this.a = strArr;
        this.b = rVar;
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
        org.telegram.messenger.g0.i3(deVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
