package di;

import android.content.DialogInterface;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ fs c;

    public /* synthetic */ ba(int i7, oa oaVar) {
        this.b = i7;
        this.c = oaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ks.f(this.b).n((oa) this.c, ks.C3);
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                g0Var.o0(false);
                g0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ ba(tg.g0 g0Var, int i7) {
        this.c = g0Var;
        this.b = i7;
    }
}
