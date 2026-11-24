// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gm7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ fm7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nm7 c;

    public gm7(nm7 nm7Var, fm7 fm7Var, int i) {
        this.c = nm7Var;
        this.a = fm7Var;
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
