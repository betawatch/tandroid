package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ fg0(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new fg0(this.b, 0));
                break;
        }
    }
}
