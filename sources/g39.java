// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g39 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ h39 e;

    public g39(h39 h39Var, View view, int i, float f, float f2) {
        this.e = h39Var;
        this.a = view;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ds5 ds5Var = this.e.b;
        o39 o39Var = (o39) ds5Var.b;
        if (this == o39Var.R1) {
            o39Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            o39Var.k1(view, 0.0f, 0.0f, false);
            if (((o39) ds5Var.b).Q1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i = this.b;
            if (i != -1) {
                o39 o39Var2 = (o39) ds5Var.b;
                c39 c39Var = o39Var2.U0;
                if (c39Var != null) {
                    c39Var.d(i, view);
                    return;
                }
                d39 d39Var = o39Var2.V0;
                if (d39Var != null) {
                    d39Var.e(this.c - view.getX(), this.d - view.getY(), i, view);
                }
            }
        }
    }
}
