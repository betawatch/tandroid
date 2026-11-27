// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bg6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ cg6 d;
    public long a = System.currentTimeMillis();
    public final ag6 c = new ag6(this, (byte) 0);

    public bg6(cg6 cg6Var) {
        this.d = cg6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
