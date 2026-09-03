package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d90 b;
    public final /* synthetic */ h90 c;

    public /* synthetic */ c90(d90 d90Var, h90 h90Var, int i10) {
        this.a = i10;
        this.b = d90Var;
        this.c = h90Var;
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
