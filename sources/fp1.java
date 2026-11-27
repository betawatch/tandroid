// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
