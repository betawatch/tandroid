package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
