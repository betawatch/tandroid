package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ a50(b50 b50Var, int i10) {
        this.a = i10;
        this.b = b50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b50 b50Var = this.b;
                ag.s0 s0Var = b50Var.b;
                if (s0Var != null) {
                    s0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new a50(b50Var, 2), 16L);
                break;
            case 1:
                ag.s0 s0Var2 = this.b.b;
                if (s0Var2 != null) {
                    s0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
