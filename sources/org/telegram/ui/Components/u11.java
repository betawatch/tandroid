package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w11 b;
    public final /* synthetic */ v11 c;

    public /* synthetic */ u11(w11 w11Var, v11 v11Var, int i10) {
        this.a = i10;
        this.b = w11Var;
        this.c = v11Var;
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
