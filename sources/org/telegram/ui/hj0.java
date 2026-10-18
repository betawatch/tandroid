package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj0 b;

    public /* synthetic */ hj0(oj0 oj0Var, int i10) {
        this.a = i10;
        this.b = oj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.b.b);
                break;
            default:
                AndroidUtilities.showKeyboard(this.b.d.getEditText());
                break;
        }
    }
}
