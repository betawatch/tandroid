// default package

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kg3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mg3 mg3Var = (mg3) obj;
                Dialog dialog = mg3Var.w0;
                if (dialog != null) {
                    mg3Var.onDismiss(dialog);
                    break;
                }
                break;
            default:
                ImageView imageView = ((PhotoViewer) obj).E3;
                if (imageView != null) {
                    imageView.animate().alpha(0.0f).withEndAction(new q78(this, (byte) 3)).setDuration(150L).start();
                    break;
                }
                break;
        }
    }
}
