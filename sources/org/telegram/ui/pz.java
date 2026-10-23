package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ pz(n00 n00Var, int i10) {
        this.a = i10;
        this.b = n00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n00.V(this.b);
                break;
            default:
                n00.W(this.b);
                break;
        }
    }
}
