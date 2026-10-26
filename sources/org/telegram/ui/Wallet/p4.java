package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class p4 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ zc1 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ org.telegram.messenger.d6 d;

    public p4(String[] strArr, zc1 zc1Var, Runnable[] runnableArr, org.telegram.messenger.d6 d6Var) {
        this.a = strArr;
        this.b = zc1Var;
        this.c = runnableArr;
        this.d = d6Var;
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
        org.telegram.messenger.d6 d6Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(d6Var);
        AndroidUtilities.runOnUIThread(d6Var, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
