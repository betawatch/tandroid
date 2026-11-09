package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fn;
import org.telegram.messenger.gn;
import org.telegram.messenger.qp;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject i;

    public /* synthetic */ x7(ea eaVar, v10 v10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = eaVar;
        this.e = v10Var;
        this.c = j3;
        this.f = str;
        this.b = context;
        this.h = g6Var;
        this.i = chatInvite;
        this.g = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ea eaVar = (ea) this.d;
                final v10 v10Var = (v10) this.e;
                final String str = (String) this.f;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.i;
                final String str2 = (String) this.g;
                final long j3 = this.c;
                final Context context = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.k8
                    @Override // java.lang.Runnable
                    public final void run() {
                        t80 t80Var;
                        ea eaVar2 = ea.this;
                        TLObject tLObject2 = tLObject;
                        v10 v10Var2 = v10Var;
                        long j10 = j3;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.hc a02 = !org.telegram.messenger.g0.u1(Q) ? org.telegram.ui.Components.hc.a0(Q) : org.telegram.ui.Components.hc.X();
                        int i7 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                v10Var2.a(0L, Boolean.FALSE);
                                a02.Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (qp.s1(eaVar2.a).j7) {
                                v10Var2.a(0L, Boolean.FALSE);
                                ea.c0(context2, g6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                tc tcVar = new tc(context2, g6Var2, j10, 1, chatInvite2.title, new u0(eaVar2, zArr, str4, chatInvite2, v10Var2, 2), 0L);
                                tcVar.setOnDismissListener(new t8(v10Var2, zArr, 0));
                                tcVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new p8(eaVar2, tL_payments_paymentResult, i7));
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
                        v10Var2.a(Long.valueOf(j11), Boolean.TRUE);
                        if (j11 == 0) {
                            a02.I(R.raw.stars_send, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j10, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null && (t80Var = launchActivity.v0) != null) {
                            t80Var.c(true);
                        }
                        eaVar2.S(true);
                        eaVar2.R();
                    }
                });
                break;
            default:
                qp qpVar = (qp) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                tr trVar = (tr) this.f;
                Runnable runnable = (Runnable) this.g;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.i;
                Context context2 = this.b;
                if (tL_error != null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new gn(qpVar, trVar, context2, u1Var, tL_error, f2Var, tL_messages_migrateChat, 0));
                    break;
                } else {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new fn(0, context2, u1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qpVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(trVar, updates, this.c, 18));
                    break;
                }
        }
    }

    public /* synthetic */ x7(qp qpVar, Context context, org.telegram.ui.ActionBar.u1 u1Var, tr trVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = qpVar;
        this.b = context;
        this.e = u1Var;
        this.f = trVar;
        this.c = j3;
        this.g = runnable;
        this.h = f2Var;
        this.i = tL_messages_migrateChat;
    }
}
