// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ nf(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                runnable.run();
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
