package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class im implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ im(vp vpVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, cs csVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = vpVar;
        this.c = context;
        this.e = x1Var;
        this.f = csVar;
        this.b = j10;
        this.g = runnable;
        this.h = k2Var;
        this.i = tL_messages_migrateChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                cs csVar = (cs) this.f;
                Runnable runnable = (Runnable) this.g;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.i;
                Context context = this.c;
                if (tL_error != null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    i0.g3(new gn(vpVar, csVar, context, x1Var, tL_error, k2Var, tL_messages_migrateChat, 0));
                    break;
                } else {
                    if (context != null) {
                        i0.g3(new fn(0, context, x1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    vpVar.L3(updates, false);
                    i0.g3(new d4(csVar, updates, this.b, 17));
                    break;
                }
            default:
                final rh.e6 e6Var = (rh.e6) this.d;
                final j20 j20Var = (j20) this.e;
                final String str = (String) this.f;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.g;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.h;
                final String str2 = (String) this.i;
                final long j10 = this.b;
                final Context context2 = this.c;
                i0.g3(new Runnable() { // from class: rh.x4
                    @Override // java.lang.Runnable
                    public final void run() {
                        w90 w90Var;
                        e6 e6Var2 = e6.this;
                        TLObject tLObject2 = tLObject;
                        j20 j20Var2 = j20Var;
                        long j11 = j10;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        cc a02 = !org.telegram.messenger.i0.u1(Q) ? cc.a0(Q) : cc.X();
                        int i10 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                j20Var2.a(0L, Boolean.FALSE);
                                a02.Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (vp.r1(e6Var2.a).k7) {
                                j20Var2.a(0L, Boolean.FALSE);
                                e6.c0(context3, p6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                x7 x7Var = new x7(context3, p6Var2, j11, 1, chatInvite2.title, new r4(e6Var2, zArr, str4, chatInvite2, j20Var2, 1), 0L);
                                x7Var.setOnDismissListener(new d5(j20Var2, zArr, 0));
                                x7Var.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new b5(e6Var2, tL_payments_paymentResult, i10));
                        TLRPC.Updates updates2 = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates2.update;
                        long j12 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates2.updates != null) {
                            for (int i11 = 0; i11 < tL_payments_paymentResult.updates.updates.size(); i11++) {
                                if (tL_payments_paymentResult.updates.updates.get(i11) instanceof TL_update.TL_updateChannel) {
                                    j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i11)).channel_id;
                                }
                            }
                        }
                        j20Var2.a(Long.valueOf(j12), Boolean.TRUE);
                        if (j12 == 0) {
                            a02.I(R.raw.stars_send, cd.L0(2131745012, null), org.telegram.messenger.i0.W2(cd.G((int) j11, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null && (w90Var = launchActivity.x0) != null) {
                            w90Var.c(true);
                        }
                        e6Var2.S(true);
                        e6Var2.R();
                    }
                });
                break;
        }
    }

    public /* synthetic */ im(rh.e6 e6Var, j20 j20Var, long j10, String str, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = e6Var;
        this.e = j20Var;
        this.b = j10;
        this.f = str;
        this.c = context;
        this.g = p6Var;
        this.h = chatInvite;
        this.i = str2;
    }
}
