package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg b;
    public final /* synthetic */ hi.m3 c;

    public /* synthetic */ ng(pg pgVar, hi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = pgVar;
        this.c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pg pgVar = this.b;
                hi.m3 m3Var = this.c;
                pgVar.removeView(m3Var);
                if (pgVar.b == m3Var) {
                    pgVar.b = null;
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
                pg pgVar2 = this.b;
                hi.m3 m3Var2 = this.c;
                pgVar2.removeView(m3Var2);
                if (pgVar2.a == m3Var2) {
                    pgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
