package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ w(r10 r10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = r10Var;
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
