package di;

import android.content.DialogInterface;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
