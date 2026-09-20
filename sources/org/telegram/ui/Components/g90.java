package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;
    public final /* synthetic */ l90 c;

    public /* synthetic */ g90(h90 h90Var, l90 l90Var, int i10) {
        this.a = i10;
        this.b = h90Var;
        this.c = l90Var;
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
