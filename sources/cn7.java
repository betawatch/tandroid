// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class cn7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ bn7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jn7 c;

    public cn7(jn7 jn7Var, bn7 bn7Var, int i) {
        this.c = jn7Var;
        this.a = bn7Var;
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
