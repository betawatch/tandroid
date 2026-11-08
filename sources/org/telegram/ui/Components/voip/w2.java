package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2(b3 b3Var, int i7, int i10) {
        this.a = i10;
        this.b = b3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.b, this.c, 3));
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
