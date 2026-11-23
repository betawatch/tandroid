package org.telegram.ui.Wallet;

import org.telegram.ui.p51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p51 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k1(p51 p51Var, String str, int i7) {
        this.a = i7;
        this.b = p51Var;
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
