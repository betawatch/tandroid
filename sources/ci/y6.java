package ci;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.messenger.n10;
import org.telegram.messenger.vm;
import org.telegram.messenger.wm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject i;

    public /* synthetic */ y6(e9 e9Var, n10 n10Var, long j10, String str, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = e9Var;
        this.e = n10Var;
        this.c = j10;
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
                final e9 e9Var = (e9) this.d;
                final n10 n10Var = (n10) this.e;
                final String str = (String) this.f;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.i;
                final String str2 = (String) this.g;
                final long j10 = this.c;
                final Context context = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.l7
                    @Override // java.lang.Runnable
                    public final void run() {
                        p80 p80Var;
                        e9 e9Var2 = e9.this;
                        TLObject tLObject2 = tLObject;
                        n10 n10Var2 = n10Var;
                        long j11 = j10;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.fc a02 = !org.telegram.messenger.g0.u1(Q) ? org.telegram.ui.Components.fc.a0(Q) : org.telegram.ui.Components.fc.X();
                        int i3 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                n10Var2.a(0L, Boolean.FALSE);
                                a02.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (hp.s1(e9Var2.a).j7) {
                                n10Var2.a(0L, Boolean.FALSE);
                                e9.c0(context2, e6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                mb mbVar = new mb(context2, e6Var2, j11, 1, chatInvite2.title, new ai.t6(e9Var2, zArr, str4, chatInvite2, n10Var2, 3), 0L);
                                mbVar.setOnDismissListener(new u7(n10Var2, zArr, 0));
                                mbVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new q7(e9Var2, tL_payments_paymentResult, i3));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j12 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                    j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                }
                            }
                        }
                        n10Var2.a(Long.valueOf(j12), Boolean.TRUE);
                        if (j12 == 0) {
                            a02.I(R.raw.stars_send, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j11, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null && (p80Var = launchActivity.y0) != null) {
                            p80Var.c(true);
                        }
                        e9Var2.S(true);
                        e9Var2.R();
                    }
                });
                break;
            default:
                hp hpVar = (hp) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                lr lrVar = (lr) this.f;
                Runnable runnable = (Runnable) this.g;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.i;
                Context context2 = this.b;
                if (tL_error != null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new wm(hpVar, lrVar, context2, s1Var, tL_error, d2Var, tL_messages_migrateChat, 0));
                    break;
                } else {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new vm(0, context2, s1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hpVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(lrVar, updates, this.c, 18));
                    break;
                }
        }
    }

    public /* synthetic */ y6(hp hpVar, Context context, org.telegram.ui.ActionBar.s1 s1Var, lr lrVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = hpVar;
        this.b = context;
        this.e = s1Var;
        this.f = lrVar;
        this.c = j10;
        this.g = runnable;
        this.h = d2Var;
        this.i = tL_messages_migrateChat;
    }
}
