package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x90 b;
    public final /* synthetic */ ba0 c;

    public /* synthetic */ w90(x90 x90Var, ba0 ba0Var, int i10) {
        this.a = i10;
        this.b = x90Var;
        this.c = ba0Var;
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
