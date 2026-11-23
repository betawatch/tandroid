package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ dt(r10 r10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = r10Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, this.c.getMessage());
                break;
            default:
                this.b.a(null, this.c.getMessage());
                break;
        }
    }
}
