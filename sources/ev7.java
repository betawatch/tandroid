// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ev7 extends j79 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ gv7 d;

    public ev7(gv7 gv7Var, Context context) {
        this.d = gv7Var;
        this.c = context;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        fv7 fv7Var = (fv7) f89Var.a;
        ViewGroup.LayoutParams layoutParams = fv7Var.getLayoutParams();
        gv7 gv7Var = this.d;
        layoutParams.height = ((gv7Var.getHeight() - gv7Var.getPaddingTop()) - gv7Var.getPaddingBottom()) / 2;
        a78 a78Var = gv7Var.i3;
        if (a78Var != null) {
            fv7Var.a = a78Var.b(i);
            fv7Var.invalidate();
            fv7Var.b = gv7Var.h3 == i ? 1.0f : 0.0f;
            fv7Var.invalidate();
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new fv7(this.d, this.c));
    }
}
