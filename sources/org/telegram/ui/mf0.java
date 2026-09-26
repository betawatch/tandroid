package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mf0(tf0 tf0Var, int i10, int i11) {
        this.a = i11;
        this.b = tf0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.b, this.c, 1));
                break;
            case 1:
                this.b.A(this.c);
                break;
            default:
                this.b.f.f[this.c].l(1.0f);
                break;
        }
    }
}
