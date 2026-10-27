package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p4 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ yc1 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ org.telegram.messenger.e6 d;

    public p4(String[] strArr, yc1 yc1Var, Runnable[] runnableArr, org.telegram.messenger.e6 e6Var) {
        this.a = strArr;
        this.b = yc1Var;
        this.c = runnableArr;
        this.d = e6Var;
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
        org.telegram.messenger.e6 e6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(e6Var);
        AndroidUtilities.runOnUIThread(e6Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
