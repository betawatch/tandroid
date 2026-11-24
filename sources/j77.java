// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j77 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j77(na7 na7Var, Context context, hd hdVar, vc7 vc7Var, long j, n92 n92Var, d dVar, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = na7Var;
        this.c = context;
        this.e = hdVar;
        this.f = vc7Var;
        this.b = j;
        this.g = n92Var;
        this.h = dVar;
        this.i = tL_messages_migrateChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj6;
                hd hdVar = (hd) obj5;
                vc7 vc7Var = (vc7) obj4;
                n92 n92Var = (n92) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                Context context = this.c;
                if (tL_error != null) {
                    if (n92Var != null) {
                        n92Var.run();
                    }
                    gl.d3(new i87((Object) na7Var, (Object) vc7Var, (Object) context, (Object) hdVar, (Object) tL_error, (Object) dVar, (Object) tL_messages_migrateChat, (byte) 0));
                    break;
                } else {
                    if (context != null) {
                        gl.d3(new oe(hdVar, context));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7Var.Q3(updates, false);
                    gl.d3(new go6((Object) vc7Var, (Object) updates, this.b, (byte) 5));
                    break;
                }
            default:
                final gta gtaVar = (gta) obj6;
                final i8c i8cVar = (i8c) obj5;
                final String str = (String) obj4;
                final wjb wjbVar = (wjb) obj3;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) obj2;
                final String str2 = (String) obj;
                final long j = this.b;
                final Context context2 = this.c;
                gl.d3(new Runnable() { // from class: xra
                    @Override // java.lang.Runnable
                    public final void run() {
                        vz5 vz5Var;
                        gta gtaVar2 = gta.this;
                        TLObject tLObject2 = tLObject;
                        i8c i8cVar2 = i8cVar;
                        long j2 = j;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        wjb wjbVar2 = wjbVar;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        d Q = LaunchActivity.Q();
                        u21 b0 = !gl.s1(Q) ? u21.b0(Q) : u21.Y();
                        byte b2 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                i8cVar2.a(0L, Boolean.FALSE);
                                b0.Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (!na7.q1(gtaVar2.a).Z4()) {
                                i8cVar2.a(0L, Boolean.FALSE);
                                gta.c0(context3, wjbVar2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                zua zuaVar = new zua(context3, wjbVar2, j2, 1, chatInvite2.title, new ex7((Object) gtaVar2, (Object) zArr, (Object) str4, (Object) chatInvite2, (Object) i8cVar2, (byte) 25), 0L);
                                zuaVar.setOnDismissListener(new csa((byte) 0, i8cVar2, zArr));
                                zuaVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new bsa(gtaVar2, tL_payments_paymentResult, b2));
                        TLRPC.Updates updates2 = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates2.update;
                        long j3 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates2.updates != null) {
                            for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                                if (tL_payments_paymentResult.updates.updates.get(i) instanceof TL_update.TL_updateChannel) {
                                    j3 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
                                }
                            }
                        }
                        i8cVar2.a(Long.valueOf(j3), Boolean.TRUE);
                        if (j3 == 0) {
                            b0.I(R.raw.stars_send, k96.M0(2131744757, null), gl.T2(k96.G((int) j2, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                            vz5Var.c(true);
                        }
                        gtaVar2.P(true);
                        gtaVar2.O();
                    }
                });
                break;
        }
    }

    public /* synthetic */ j77(gta gtaVar, i8c i8cVar, long j, String str, Context context, wjb wjbVar, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = gtaVar;
        this.e = i8cVar;
        this.b = j;
        this.f = str;
        this.c = context;
        this.g = wjbVar;
        this.h = chatInvite;
        this.i = str2;
    }
}
