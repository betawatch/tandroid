package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ vh.p2 c;

    public /* synthetic */ uf(wf wfVar, vh.p2 p2Var, int i10) {
        this.a = i10;
        this.b = wfVar;
        this.c = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf wfVar = this.b;
                vh.p2 p2Var = this.c;
                wfVar.removeView(p2Var);
                if (wfVar.b == p2Var) {
                    wfVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                wf wfVar2 = this.b;
                vh.p2 p2Var2 = this.c;
                wfVar2.removeView(p2Var2);
                if (wfVar2.a == p2Var2) {
                    wfVar2.a = null;
                    break;
                }
                break;
        }
    }
}
