// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f5a implements View.OnClickListener {
    public final /* synthetic */ n5a a;

    public f5a(n5a n5aVar) {
        this.a = n5aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ry8 ry8Var = this.a.n1;
        if (ry8Var.b() || ry8Var.getAnimatedDrawable() == null) {
            return;
        }
        ry8Var.getAnimatedDrawable().H(40);
        ry8Var.d();
    }
}
