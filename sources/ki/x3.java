package ki;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ x3(boolean[] zArr, ai.b1 b1Var, boolean[] zArr2, y10 y10Var, int[] iArr, int i7) {
        this.b = zArr;
        this.e = b1Var;
        this.c = zArr2;
        this.f = y10Var;
        this.h = iArr;
        this.d = i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.b[0]) {
                    boolean[] zArr = this.c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c4.e(context, this.d, user.id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
            default:
                ai.b1 b1Var = (ai.b1) this.e;
                y10 y10Var = (y10) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                b1Var.run();
                boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    y10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x3(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i7;
        this.f = user;
        this.h = oVar;
    }
}
