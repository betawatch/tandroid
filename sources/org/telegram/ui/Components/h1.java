package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 d;

    public /* synthetic */ h1(f5 f5Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.a = i10;
        this.b = f5Var;
        this.c = e2Var;
        this.d = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.b, this.c, this.d, 1));
                break;
            default:
                g5.d0(this.b, this.c, this.d);
                break;
        }
    }
}
