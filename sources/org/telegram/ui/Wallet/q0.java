package org.telegram.ui.Wallet;

import a8.af;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q0(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = af.b;
                if (v0Var != null) {
                    if (this.b.equals(v0Var.d)) {
                        af.b.c("STORAGE_CANCELED");
                        af.b.e();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.addToClipboard(this.b);
                break;
        }
    }
}
