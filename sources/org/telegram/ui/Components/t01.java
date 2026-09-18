package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w01 b;
    public final /* synthetic */ v01 c;

    public /* synthetic */ t01(w01 w01Var, v01 v01Var, int i10) {
        this.a = i10;
        this.b = w01Var;
        this.c = v01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
