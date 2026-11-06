package fi;

import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                if (s0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s0Var.getParent()).removeView(s0Var);
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
