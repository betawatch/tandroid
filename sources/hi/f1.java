package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.xr;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i7) {
        this.a = i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                int i7 = i2.C1;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                xr.j.edit().putInt("dismissed_count", xr.j.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = gz0.e;
                break;
            case 5:
                c40 c40Var = c40.C5;
                break;
            case 6:
                break;
            case 7:
                org.telegram.utils.twidget.n0.i = false;
                break;
            default:
                MediaController.h2 = false;
                break;
        }
    }

    public /* synthetic */ f1(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
