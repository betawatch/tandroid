package org.telegram.ui.Components.voip;

import di.k4;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;
    public final /* synthetic */ fh0 c;

    public /* synthetic */ e1(k4 k4Var, fh0 fh0Var, int i7) {
        this.a = i7;
        this.b = k4Var;
        this.c = fh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new e1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
