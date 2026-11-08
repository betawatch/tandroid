package bi;

import android.content.DialogInterface;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ls c;

    public /* synthetic */ mb(int i7, zb zbVar) {
        this.b = i7;
        this.c = zbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                qs.f(this.b).n((zb) this.c, qs.A3);
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                g0Var.o0(false);
                g0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ mb(tg.g0 g0Var, int i7) {
        this.c = g0Var;
        this.b = i7;
    }
}
