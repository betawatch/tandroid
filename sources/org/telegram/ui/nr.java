package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;

    public /* synthetic */ nr(or orVar, int i10) {
        this.a = i10;
        this.b = orVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.m71 m71Var = this.b.a;
                if (m71Var != null) {
                    m71Var.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.m71 m71Var2 = this.b.a;
                if (m71Var2 != null) {
                    m71Var2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
