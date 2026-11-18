package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz0 b;
    public final /* synthetic */ jz0 c;

    public /* synthetic */ iz0(kz0 kz0Var, jz0 jz0Var, int i7) {
        this.a = i7;
        this.b = kz0Var;
        this.c = jz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
