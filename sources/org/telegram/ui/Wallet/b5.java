package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.yd;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ ma1 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ yd d;

    public b5(String[] strArr, ma1 ma1Var, Runnable[] runnableArr, yd ydVar) {
        this.a = strArr;
        this.b = ma1Var;
        this.c = runnableArr;
        this.d = ydVar;
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
        yd ydVar = this.d;
        org.telegram.messenger.g0.r(ydVar);
        org.telegram.messenger.g0.i3(ydVar, 1000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
