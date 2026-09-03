package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y01 b;
    public final /* synthetic */ x01 c;

    public /* synthetic */ w01(y01 y01Var, x01 x01Var, int i10) {
        this.a = i10;
        this.b = y01Var;
        this.c = x01Var;
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
