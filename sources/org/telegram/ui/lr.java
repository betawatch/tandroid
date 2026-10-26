package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;

    public /* synthetic */ lr(mr mrVar, int i10) {
        this.a = i10;
        this.b = mrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.l71 l71Var = this.b.a;
                if (l71Var != null) {
                    l71Var.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.l71 l71Var2 = this.b.a;
                if (l71Var2 != null) {
                    l71Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
