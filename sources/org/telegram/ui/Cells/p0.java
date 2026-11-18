package org.telegram.ui.Cells;

import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh0 b;

    public /* synthetic */ p0(mh0 mh0Var, int i7) {
        this.a = i7;
        this.b = mh0Var;
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
