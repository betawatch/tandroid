package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ pq(qq qqVar, int i7) {
        this.a = i7;
        this.b = qqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fi.w3 w3Var = this.b.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            default:
                fi.w3 w3Var2 = this.b.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    break;
                }
                break;
        }
    }
}
