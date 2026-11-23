package bi;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.n5 b;

    public /* synthetic */ s2(org.telegram.ui.Components.n5 n5Var, int i7) {
        this.a = i7;
        this.b = n5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
