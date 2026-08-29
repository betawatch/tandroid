package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ org.telegram.ui.Components.yl0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ oe(tn tnVar, org.telegram.ui.Components.yl0 yl0Var, String str, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = yl0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.tc a02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.tc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.n(i10, a02);
    }
}
