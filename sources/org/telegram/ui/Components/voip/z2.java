package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z2(e3 e3Var, int i7, int i10) {
        this.a = i10;
        this.b = e3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
