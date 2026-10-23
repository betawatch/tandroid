package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s31 b;

    public /* synthetic */ a31(s31 s31Var, int i10) {
        this.a = i10;
        this.b = s31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s31 s31Var = this.b;
                h31 h31Var = s31Var.G;
                h31Var.x1(true);
                f31 f31Var = s31Var.s;
                f31Var.x1(true);
                s31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(f31Var);
                AndroidUtilities.updateVisibleRows(h31Var);
                break;
            default:
                s31 s31Var2 = this.b;
                if (s31Var2.k()) {
                    s31Var2.l();
                    break;
                }
                break;
        }
    }
}
