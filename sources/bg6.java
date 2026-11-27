// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
