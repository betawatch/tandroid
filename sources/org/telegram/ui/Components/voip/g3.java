package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g3(l3 l3Var, int i10, int i11) {
        this.a = i11;
        this.b = l3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.b, this.c, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.b, this.c, 3));
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
