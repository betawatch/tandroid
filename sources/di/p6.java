package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cn;
import org.telegram.messenger.dn;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject i;

    public /* synthetic */ p6(u8 u8Var, s10 s10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = u8Var;
        this.e = s10Var;
        this.c = j3;
        this.f = str;
        this.b = context;
        this.h = e6Var;
        this.i = chatInvite;
        this.g = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final u8 u8Var = (u8) this.d;
                final s10 s10Var = (s10) this.e;
                final String str = (String) this.f;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.i;
                final String str2 = (String) this.g;
                final long j3 = this.c;
                final Context context = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.d7
                    @Override // java.lang.Runnable
                    public final void run() {
                        r80 r80Var;
                        u8 u8Var2 = u8.this;
                        TLObject tLObject2 = tLObject;
                        s10 s10Var2 = s10Var;
                        long j10 = j3;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.cc a02 = !org.telegram.messenger.g0.u1(Q) ? org.telegram.ui.Components.cc.a0(Q) : org.telegram.ui.Components.cc.X();
                        int i7 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                s10Var2.a(0L, Boolean.FALSE);
                                a02.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (np.s1(u8Var2.a).k7) {
                                s10Var2.a(0L, Boolean.FALSE);
                                u8.c0(context2, e6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                bb bbVar = new bb(context2, e6Var2, j10, 1, chatInvite2.title, new ai.b(u8Var2, zArr, str4, chatInvite2, s10Var2), 0L);
                                bbVar.setOnDismissListener(new m7(s10Var2, zArr, 0));
                                bbVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new i7(u8Var2, tL_payments_paymentResult, i7));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j11 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                    j11 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                }
                            }
                        }
                        s10Var2.a(Long.valueOf(j11), Boolean.TRUE);
                        if (j11 == 0) {
                            a02.I(R.raw.stars_send, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j10, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (r80Var = launchActivity.w0) != null) {
                            r80Var.c(true);
                        }
                        u8Var2.S(true);
                        u8Var2.R();
                    }
                });
                break;
            default:
                np npVar = (np) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                qr qrVar = (qr) this.f;
                Runnable runnable = (Runnable) this.g;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.i;
                Context context2 = this.b;
                if (tL_error != null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new dn(npVar, qrVar, context2, t1Var, tL_error, e2Var, tL_messages_migrateChat, 0));
                    break;
                } else {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new cn(0, context2, t1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    npVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(qrVar, updates, this.c, 18));
                    break;
                }
        }
    }

    public /* synthetic */ p6(np npVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, qr qrVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = npVar;
        this.b = context;
        this.e = t1Var;
        this.f = qrVar;
        this.c = j3;
        this.g = runnable;
        this.h = e2Var;
        this.i = tL_messages_migrateChat;
    }
}
