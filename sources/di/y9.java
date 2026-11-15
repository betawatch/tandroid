package di;

import android.content.DialogInterface;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ is c;

    public /* synthetic */ y9(int i7, ka kaVar) {
        this.b = i7;
        this.c = kaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ns.f(this.b).n((ka) this.c, ns.A3);
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                g0Var.o0(false);
                g0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ y9(tg.g0 g0Var, int i7) {
        this.c = g0Var;
        this.b = i7;
    }
}
