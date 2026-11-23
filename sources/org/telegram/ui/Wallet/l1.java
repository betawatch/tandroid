package org.telegram.ui.Wallet;

import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l1(a31 a31Var, String str, int i7) {
        this.a = i7;
        this.b = a31Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
