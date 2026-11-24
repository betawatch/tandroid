// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class me implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ me(Runnable runnable, byte b) {
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
