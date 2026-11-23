package hi;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ b1(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                if (c1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) c1Var.getParent()).removeView(c1Var);
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
