package ki;

import android.content.Context;
import android.content.DialogInterface;
import bi.u4;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y3(boolean[] zArr, u4 u4Var, boolean[] zArr2, x10 x10Var, int[] iArr, int i7) {
        this.b = zArr;
        this.e = u4Var;
        this.c = zArr2;
        this.f = x10Var;
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
                        d4.e(context, this.d, user.id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
            default:
                u4 u4Var = (u4) this.e;
                x10 x10Var = (x10) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                u4Var.run();
                boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    x10Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y3(boolean[] zArr, boolean[] zArr2, Context context, int i7, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i7;
        this.f = user;
        this.h = oVar;
    }
}
