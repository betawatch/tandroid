package gh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ v7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ f7(v7 v7Var, long j10, int i9, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = v7Var;
        this.b = j10;
        this.c = i9;
        this.d = zArr;
        this.e = callback2;
        this.f = context;
        this.g = b6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v7 v7Var = this.a;
        long j10 = v7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            v7Var.Z(str, chatInvite, new t5(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.b6 b6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, b6Var, j11, 1, chatInvite.title, new bg.k0(v7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            eaVar.setOnDismissListener(new s5(v7Var, callback, zArr2, zArr, callback2, 0));
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
        v7.e0(context, b6Var);
    }
}
