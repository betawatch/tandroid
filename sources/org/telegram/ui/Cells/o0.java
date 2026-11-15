package org.telegram.ui.Cells;

import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ o0(ch0 ch0Var, int i7) {
        this.a = i7;
        this.b = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
