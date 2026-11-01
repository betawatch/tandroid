package jg;

import android.content.DialogInterface;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;
import rh.j7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ vs c;

    public /* synthetic */ w(int i10, j7 j7Var) {
        this.b = i10;
        this.c = j7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                PhotoViewer photoViewer = ((cr0) r0Var).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.h0();
                }
                r0Var.A0(this.b);
                break;
            default:
                at.f(this.b).n((j7) this.c, at.A3);
                break;
        }
    }

    public /* synthetic */ w(r0 r0Var, int i10) {
        this.c = r0Var;
        this.b = i10;
    }
}
