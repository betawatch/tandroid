package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j9 implements Utilities.Callback {
    public final /* synthetic */ ca a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ j9(ca caVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = caVar;
        this.b = j10;
        this.c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f = context;
        this.g = u6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ca caVar = this.a;
        long j10 = caVar.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            caVar.Z(str, chatInvite, new t7(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.u6 u6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, u6Var, j11, 1, chatInvite.title, new r7(caVar, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            tcVar.setOnDismissListener(new s7(caVar, callback, zArr2, zArr, callback2, 0));
            tcVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        ca.e0(context, u6Var);
    }
}
