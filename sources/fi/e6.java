package fi;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ e6(h6 h6Var, int i7) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h6 h6Var = this.b;
        switch (i7) {
            case 0:
                ls.f(h6Var.c).k(ls.A5, h6Var);
                break;
            case 1:
                h6Var.u = false;
                h6Var.w = true;
                ls.f(h6Var.c).k(ls.A5, h6Var, Boolean.FALSE);
                break;
            case 2:
                h6Var.z = false;
                break;
            default:
                h6Var.k.clear();
                h6Var.d(true);
                break;
        }
    }
}
