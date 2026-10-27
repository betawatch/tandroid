package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ef0(lf0 lf0Var, int i10, int i11) {
        this.a = i11;
        this.b = lf0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ef0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].l(1.0f);
                break;
        }
    }
}
