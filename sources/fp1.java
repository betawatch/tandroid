// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fp1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ul b;

    public /* synthetic */ fp1(ul ulVar, byte b) {
        this.a = b;
        this.b = ulVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ul ulVar = this.b;
        switch (b) {
            case 0:
                ulVar.a();
                break;
            case 1:
                ulVar.a();
                break;
            default:
                ulVar.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ul ulVar = this.b;
        switch (b) {
            case 0:
                ulVar.b();
                break;
            case 1:
                ulVar.b();
                break;
            default:
                ulVar.b();
                break;
        }
    }
}
