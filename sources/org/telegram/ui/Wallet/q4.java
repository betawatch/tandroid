package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q4 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ u3 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ org.telegram.messenger.a6 d;

    public q4(String[] strArr, u3 u3Var, Runnable[] runnableArr, org.telegram.messenger.a6 a6Var) {
        this.a = strArr;
        this.b = u3Var;
        this.c = runnableArr;
        this.d = a6Var;
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
        org.telegram.messenger.a6 a6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        AndroidUtilities.runOnUIThread(a6Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
