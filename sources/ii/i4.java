package ii;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i4(boolean[] zArr, bi.q0 q0Var, boolean[] zArr2, u10 u10Var, int[] iArr, int i3) {
        this.b = zArr;
        this.e = q0Var;
        this.c = zArr2;
        this.f = u10Var;
        this.h = iArr;
        this.d = i3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.h;
                if (!this.b[0]) {
                    boolean[] zArr = this.c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        o4.e(context, this.d, user.id);
                        pVar.a(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
            default:
                bi.q0 q0Var = (bi.q0) this.e;
                u10 u10Var = (u10) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                q0Var.run();
                boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i4(boolean[] zArr, boolean[] zArr2, Context context, int i3, TLRPC.User user, org.telegram.ui.web.p pVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i3;
        this.f = user;
        this.h = pVar;
    }
}
