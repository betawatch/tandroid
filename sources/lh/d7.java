package lh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d7 implements Utilities.Callback {
    public final /* synthetic */ t7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ d7(t7 t7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = t7Var;
        this.b = j10;
        this.c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f = context;
        this.g = f6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.a;
        long j10 = t7Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            t7Var.Z(str, chatInvite, new q5(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            z9 z9Var = new z9(context, f6Var, j11, 1, chatInvite.title, new gg.g0(t7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 0));
            z9Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        t7.e0(context, f6Var);
    }
}
