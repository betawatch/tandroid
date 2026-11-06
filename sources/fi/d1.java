package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
