package jg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d6;
import org.telegram.ui.Components.i01;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i10) {
        this.a = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                MediaController.f2 = false;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                d6.i.edit().putInt("dismissed_count", d6.i.getInt("dismissed_count", 0) + 1).apply();
                break;
            case 4:
                int i10 = i01.e;
                break;
            case 5:
                b50 b50Var = b50.u5;
                break;
            case 6:
                break;
            case 7:
                org.telegram.utils.twidget.p.i = false;
                break;
            default:
                int i11 = vh.u1.y1;
                break;
        }
    }

    public /* synthetic */ z(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
