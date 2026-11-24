// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eq1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    public /* synthetic */ eq1(tm tmVar, byte b) {
        this.a = b;
        this.b = tmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                tmVar.a();
                break;
            case 1:
                tmVar.a();
                break;
            default:
                tmVar.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                tmVar.b();
                break;
            case 1:
                tmVar.b();
                break;
            default:
                tmVar.b();
                break;
        }
    }
}
