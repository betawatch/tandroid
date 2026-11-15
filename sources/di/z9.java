package di;

import android.content.DialogInterface;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ is c;

    public /* synthetic */ z9(int i7, la laVar) {
        this.b = i7;
        this.c = laVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ns.f(this.b).n((la) this.c, ns.A3);
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                g0Var.o0(false);
                g0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ z9(tg.g0 g0Var, int i7) {
        this.c = g0Var;
        this.b = i7;
    }
}
