package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ee;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class d5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ n b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ee d;

    public d5(String[] strArr, n nVar, Runnable[] runnableArr, ee eeVar) {
        this.a = strArr;
        this.b = nVar;
        this.c = runnableArr;
        this.d = eeVar;
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
        ee eeVar = this.d;
        org.telegram.messenger.g0.r(eeVar);
        org.telegram.messenger.g0.i3(eeVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
