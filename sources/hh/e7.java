package hh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Utilities.Callback {
    public final /* synthetic */ u7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ e7(u7 u7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = u7Var;
        this.b = j10;
        this.c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f = context;
        this.g = c6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u7 u7Var = this.a;
        long j10 = u7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            u7Var.Z(str, chatInvite, new s5(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, c6Var, j11, 1, chatInvite.title, new cg.h0(u7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            eaVar.setOnDismissListener(new r5(u7Var, callback, zArr2, zArr, callback2, 0));
            eaVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        u7.e0(context, c6Var);
    }
}
