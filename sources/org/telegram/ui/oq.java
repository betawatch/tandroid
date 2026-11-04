package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;

    public /* synthetic */ oq(pq pqVar, int i3) {
        this.a = i3;
        this.b = pqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ai.h4 h4Var = this.b.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    break;
                }
                break;
            default:
                ai.h4 h4Var2 = this.b.a;
                if (h4Var2 != null) {
                    h4Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
