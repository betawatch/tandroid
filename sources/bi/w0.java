package bi;

import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ w0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                if (x0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
