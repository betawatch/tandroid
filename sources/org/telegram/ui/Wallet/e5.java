package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.ee;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class e5 implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ sb1 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ ee d;

    public e5(String[] strArr, sb1 sb1Var, Runnable[] runnableArr, ee eeVar) {
        this.a = strArr;
        this.b = sb1Var;
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
