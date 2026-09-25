package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;
    public final /* synthetic */ o90 c;

    public /* synthetic */ j90(k90 k90Var, o90 o90Var, int i10) {
        this.a = i10;
        this.b = k90Var;
        this.c = o90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
