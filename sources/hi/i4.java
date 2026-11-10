package hi;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i4(boolean[] zArr, ai.a1 a1Var, boolean[] zArr2, c20 c20Var, int[] iArr, int i7) {
        this.b = zArr;
        this.e = a1Var;
        this.c = zArr2;
        this.f = c20Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.h;
                if (!this.b[0]) {
                    boolean[] zArr = this.c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        o4.e(context, this.d, user.id);
                        nVar.a(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
            default:
                ai.a1 a1Var = (ai.a1) this.e;
                c20 c20Var = (c20) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                a1Var.run();
                boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c20Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i4(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.n nVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i7;
        this.f = user;
        this.h = nVar;
    }
}
