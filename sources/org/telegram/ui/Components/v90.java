package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w90 b;
    public final /* synthetic */ aa0 c;

    public /* synthetic */ v90(w90 w90Var, aa0 aa0Var, int i10) {
        this.a = i10;
        this.b = w90Var;
        this.c = aa0Var;
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
