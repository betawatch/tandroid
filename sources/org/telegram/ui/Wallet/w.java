package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ w(q10 q10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = q10Var;
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
