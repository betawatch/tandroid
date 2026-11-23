package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
