package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag b;
    public final /* synthetic */ fi.m3 c;

    public /* synthetic */ yf(ag agVar, fi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = agVar;
        this.c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ag agVar = this.b;
                fi.m3 m3Var = this.c;
                agVar.removeView(m3Var);
                if (agVar.b == m3Var) {
                    agVar.b = null;
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
                ag agVar2 = this.b;
                fi.m3 m3Var2 = this.c;
                agVar2.removeView(m3Var2);
                if (agVar2.a == m3Var2) {
                    agVar2.a = null;
                    break;
                }
                break;
        }
    }
}
