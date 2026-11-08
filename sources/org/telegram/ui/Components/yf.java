package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
