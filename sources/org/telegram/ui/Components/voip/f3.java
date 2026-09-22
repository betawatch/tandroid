package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
