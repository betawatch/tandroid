package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ct(q10 q10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = q10Var;
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
