package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o00 b;

    public /* synthetic */ pz(o00 o00Var, int i10) {
        this.a = i10;
        this.b = o00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o00.W(this.b);
                break;
            default:
                o00.X(this.b);
                break;
        }
    }
}
