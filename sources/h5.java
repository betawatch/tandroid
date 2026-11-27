// default package

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class h5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ h5(boolean[] zArr) {
        this.a = (byte) 1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                i5.a = false;
                break;
            case 1:
                break;
            case 2:
                sye.a.edit().putInt("dismissed_count", sye.a.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 3:
            case 4:
                break;
            case 5:
                MediaController.h2 = false;
                break;
            case 6:
                break;
            default:
                k0d.i = false;
                break;
        }
    }

    public /* synthetic */ h5(kc kcVar, boolean[] zArr, byte b) {
        this.a = b;
    }

    public /* synthetic */ h5(byte b) {
        this.a = b;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }

    private final void c(DialogInterface dialogInterface) {
    }

    private final void d(DialogInterface dialogInterface) {
    }
}
