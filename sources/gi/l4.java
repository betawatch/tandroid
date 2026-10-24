package gi;

import ai.db;
import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l4(boolean[] zArr, db dbVar, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.b = zArr;
        this.e = dbVar;
        this.c = zArr2;
        this.f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.h;
                if (!this.b[0]) {
                    boolean[] zArr = this.c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        r4.e(context, this.d, user.id);
                        rVar.run(Boolean.TRUE, "cancelled");
                        break;
                    }
                }
                break;
            default:
                db dbVar = (db) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                int[] iArr = (int[]) this.h;
                this.b[0] = true;
                dbVar.run();
                boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    callback.run(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.r rVar) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i10;
        this.f = user;
        this.h = rVar;
    }
}
