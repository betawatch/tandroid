package di;

import android.content.DialogInterface;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ fs c;

    public /* synthetic */ ca(int i7, oa oaVar) {
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
