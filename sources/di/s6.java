package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.messenger.r10;
import org.telegram.messenger.wm;
import org.telegram.messenger.xm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject i;

    public /* synthetic */ s6(y8 y8Var, r10 r10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = y8Var;
        this.e = r10Var;
        this.c = j3;
        this.f = str;
        this.b = context;
        this.h = h6Var;
        this.i = chatInvite;
        this.g = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final y8 y8Var = (y8) this.d;
                final r10 r10Var = (r10) this.e;
                final String str = (String) this.f;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.i;
                final String str2 = (String) this.g;
                final long j3 = this.c;
                final Context context = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: di.g7
                    @Override // java.lang.Runnable
                    public final void run() {
                        u80 u80Var;
                        y8 y8Var2 = y8.this;
                        TLObject tLObject2 = tLObject;
                        r10 r10Var2 = r10Var;
                        long j10 = j3;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        org.telegram.ui.Components.lc b02 = !org.telegram.messenger.g0.u1(Q) ? org.telegram.ui.Components.lc.b0(Q) : org.telegram.ui.Components.lc.Y();
                        int i7 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                r10Var2.a(0L, Boolean.FALSE);
                                b02.Q(R.raw.error, 36, hd.a0(null, null, 2131743633, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (np.u1(y8Var2.a).m7) {
                                r10Var2.a(0L, Boolean.FALSE);
                                y8.c0(context2, h6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                fb fbVar = new fb(context2, h6Var2, j10, 1, chatInvite2.title, new ai.b(y8Var2, zArr, str4, chatInvite2, r10Var2), 0L);
                                fbVar.setOnDismissListener(new n7(0, r10Var2, zArr));
                                fbVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new l7(y8Var2, tL_payments_paymentResult, i7));
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
                        r10Var2.a(Long.valueOf(j11), Boolean.TRUE);
                        if (j11 == 0) {
                            b02.I(R.raw.stars_send, hd.N0(2131744751, null), org.telegram.messenger.g0.W2(hd.G((int) j10, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (u80Var = launchActivity.w0) != null) {
                            u80Var.c(true);
                        }
                        y8Var2.R(true);
                        y8Var2.Q();
                    }
                });
                break;
            default:
                np npVar = (np) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                pr prVar = (pr) this.f;
                Runnable runnable = (Runnable) this.g;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.i;
                Context context2 = this.b;
                if (tL_error != null) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new xm(npVar, prVar, context2, t1Var, tL_error, g2Var, tL_messages_migrateChat, 0));
                    break;
                } else {
                    if (context2 != null) {
                        org.telegram.messenger.g0.g3(new wm(0, context2, t1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    npVar.V3(updates, false);
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.d4(prVar, updates, this.c, 17));
                    break;
                }
        }
    }

    public /* synthetic */ s6(np npVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, pr prVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = npVar;
        this.b = context;
        this.e = t1Var;
        this.f = prVar;
        this.c = j3;
        this.g = runnable;
        this.h = g2Var;
        this.i = tL_messages_migrateChat;
    }
}
