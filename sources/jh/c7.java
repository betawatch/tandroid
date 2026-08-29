package jh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Utilities.Callback {
    public final /* synthetic */ s7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ c7(s7 s7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = s7Var;
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
        s7 s7Var = this.a;
        long j10 = s7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            s7Var.Z(str, chatInvite, new q5(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            y9 y9Var = new y9(context, c6Var, j11, 1, chatInvite.title, new eg.h0(s7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            y9Var.setOnDismissListener(new p5(s7Var, callback, zArr2, zArr, callback2, 0));
            y9Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        s7.e0(context, c6Var);
    }
}
