package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wr;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
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
                wr.j.edit().putInt("dismissed_count", wr.j.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = pz0.e;
                break;
            case 5:
                f40 f40Var = f40.C5;
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
