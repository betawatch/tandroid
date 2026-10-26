package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs b;

    public /* synthetic */ ls(rs rsVar, int i10) {
        this.a = i10;
        this.b = rsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(false);
                break;
            default:
                rs.Q(this.b);
                break;
        }
    }
}
