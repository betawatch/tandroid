// default package

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class o03 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ o03(boolean[] zArr, gp6 gp6Var, boolean[] zArr2, pcc pccVar, int[] iArr, int i) {
        this.b = zArr;
        this.e = gp6Var;
        this.c = zArr2;
        this.f = pccVar;
        this.h = iArr;
        this.d = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        int i = this.d;
        Object obj3 = this.e;
        boolean[] zArr = this.c;
        boolean[] zArr2 = this.b;
        switch (b) {
            case 0:
                pcc pccVar = (pcc) obj2;
                int[] iArr = (int[]) obj;
                zArr2[0] = true;
                ((gp6) obj3).run();
                if (!zArr[0]) {
                    zArr[0] = true;
                    pccVar.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
            default:
                Context context = (Context) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                yt0 yt0Var = (yt0) obj;
                if (!zArr2[0] && !zArr[0]) {
                    zArr[0] = true;
                    oca.e(context, i, user.id);
                    yt0Var.a(Boolean.TRUE, "cancelled");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o03(boolean[] zArr, boolean[] zArr2, Context context, int i, TLRPC.User user, yt0 yt0Var) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i;
        this.f = user;
        this.h = yt0Var;
    }
}
