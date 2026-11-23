package di;

import android.content.DialogInterface;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ gs c;

    public /* synthetic */ ca(int i7, oa oaVar) {
        this.b = i7;
        this.c = oaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ls.f(this.b).n((oa) this.c, ls.C3);
                break;
            default:
                tg.h0 h0Var = (tg.h0) this.c;
                h0Var.o0(false);
                h0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ ca(tg.h0 h0Var, int i7) {
        this.c = h0Var;
        this.b = i7;
    }
}
