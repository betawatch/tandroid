// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fh8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ImageReceiver b;

    public /* synthetic */ fh8(ImageReceiver imageReceiver, byte b) {
        this.a = b;
        this.b = imageReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.I();
                break;
            default:
                imageReceiver.I();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.K();
                break;
            default:
                imageReceiver.K();
                break;
        }
    }
}
