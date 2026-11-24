// default package

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ g5(boolean[] zArr) {
        this.a = (byte) 1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h5.a = false;
                break;
            case 1:
            case 2:
                break;
            case 3:
                aue.a.edit().putInt("dismissed_count", aue.a.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                break;
            case 5:
                MediaController.h2 = false;
                break;
            case 6:
                break;
            default:
                vvc.i = false;
                break;
        }
    }

    public /* synthetic */ g5(jc jcVar, boolean[] zArr, byte b) {
        this.a = b;
    }

    public /* synthetic */ g5(byte b) {
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
