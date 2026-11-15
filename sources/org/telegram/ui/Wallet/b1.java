package org.telegram.ui.Wallet;

import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b1(x21 x21Var, String str, int i7) {
        this.a = i7;
        this.b = x21Var;
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
