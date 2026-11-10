package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                int i7 = k2.B1;
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
                f40 f40Var = f40.x5;
                break;
            case 6:
                break;
            case 7:
                org.telegram.utils.twidget.n0.i = false;
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
