package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
