package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e21 b;
    public final /* synthetic */ d21 c;

    public /* synthetic */ c21(e21 e21Var, d21 d21Var, int i10) {
        this.a = i10;
        this.b = e21Var;
        this.c = d21Var;
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
