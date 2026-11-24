// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dk7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ck7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kk7 c;

    public dk7(kk7 kk7Var, ck7 ck7Var, int i) {
        this.c = kk7Var;
        this.a = ck7Var;
        this.b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c.a(this.a, this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.n(this.a, this.b);
    }
}
