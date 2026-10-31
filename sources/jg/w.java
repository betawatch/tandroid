package jg;

import android.content.DialogInterface;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;
import rh.j7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ us c;

    public /* synthetic */ w(int i10, j7 j7Var) {
        this.b = i10;
        this.c = j7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                PhotoViewer photoViewer = ((er0) r0Var).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.h0();
                }
                r0Var.A0(this.b);
                break;
            default:
                zs.f(this.b).n((j7) this.c, zs.A3);
                break;
        }
    }

    public /* synthetic */ w(r0 r0Var, int i10) {
        this.c = r0Var;
        this.b = i10;
    }
}
