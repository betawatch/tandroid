package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f3(k3 k3Var, int i10, int i11) {
        this.a = i11;
        this.b = k3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.b, this.c, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
