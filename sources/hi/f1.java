package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                int i7 = j2.C1;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                vr.j.edit().putInt("dismissed_count", vr.j.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = nz0.e;
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
