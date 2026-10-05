package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ org.telegram.ui.Components.sm0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ af(yn ynVar, org.telegram.ui.Components.sm0 sm0Var, String str, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = sm0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.bi.n(i10, a02);
    }
}
