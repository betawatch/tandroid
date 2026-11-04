package gi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.sr;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d1(int i3) {
        this.a = i3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                int i3 = i2.z1;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                sr.j.edit().putInt("dismissed_count", sr.j.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = dz0.e;
                break;
            case 5:
                x30 x30Var = x30.v5;
                break;
            case 6:
                break;
            case 7:
                org.telegram.utils.twidget.p.i = false;
                break;
            default:
                MediaController.h2 = false;
                break;
        }
    }

    public /* synthetic */ d1(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
