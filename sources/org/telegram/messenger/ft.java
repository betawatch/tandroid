package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ft(s10 s10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = s10Var;
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
