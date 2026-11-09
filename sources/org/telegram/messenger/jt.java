package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class jt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ jt(v10 v10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = v10Var;
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
