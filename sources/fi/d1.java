package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d1(int i7) {
        this.a = i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                int i7 = k2.y1;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                as.j.edit().putInt("dismissed_count", as.j.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = ez0.e;
                break;
            case 5:
                c40 c40Var = c40.u5;
                break;
            case 6:
                break;
            case 7:
                org.telegram.utils.twidget.p.i = false;
                break;
            default:
                MediaController.g2 = false;
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
