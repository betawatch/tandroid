package bi;

import android.content.DialogInterface;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
