package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ x(p10 p10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = p10Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Exception exc = this.c;
                this.b.a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            default:
                Exception exc2 = this.c;
                this.b.a(null, exc2.getMessage() == null ? "NULL_ERROR" : exc2.getMessage());
                break;
        }
    }
}
