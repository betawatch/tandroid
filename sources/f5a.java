// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
