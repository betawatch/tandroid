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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m97 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m97(oc7 oc7Var, Context context, he heVar, xe7 xe7Var, long j, ra2 ra2Var, d dVar, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = oc7Var;
        this.c = context;
        this.e = heVar;
        this.f = xe7Var;
        this.b = j;
        this.g = ra2Var;
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
                oc7 oc7Var = (oc7) obj6;
                he heVar = (he) obj5;
                xe7 xe7Var = (xe7) obj4;
                ra2 ra2Var = (ra2) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                Context context = this.c;
                if (tL_error != null) {
                    if (ra2Var != null) {
                        ra2Var.run();
                    }
                    gm.c3(new ja7((Object) oc7Var, (Object) xe7Var, (Object) context, (Object) heVar, (Object) tL_error, (Object) dVar, (Object) tL_messages_migrateChat, (byte) 0));
                    break;
                } else {
                    if (context != null) {
                        gm.c3(new of(heVar, context));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7Var.T3(updates, false);
                    gm.c3(new hq6((Object) xe7Var, (Object) updates, this.b, (byte) 5));
                    break;
                }
            default:
                final jva jvaVar = (jva) obj6;
                final jac jacVar = (jac) obj5;
                final String str = (String) obj4;
                final ylb ylbVar = (ylb) obj3;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) obj2;
                final String str2 = (String) obj;
                final long j = this.b;
                final Context context2 = this.c;
                gm.c3(new Runnable() { // from class: zta
                    @Override // java.lang.Runnable
                    public final void run() {
                        v16 v16Var;
                        jva jvaVar2 = jva.this;
                        TLObject tLObject2 = tLObject;
                        jac jacVar2 = jacVar;
                        long j2 = j;
                        String str3 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        ylb ylbVar2 = ylbVar;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str4 = str2;
                        d Q = LaunchActivity.Q();
                        c41 b0 = !gm.s1(Q) ? c41.b0(Q) : c41.Y();
                        byte b2 = 1;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                jacVar2.a(0L, Boolean.FALSE);
                                b0.Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                return;
                            } else if (!oc7.r1(jvaVar2.a).c5()) {
                                jacVar2.a(0L, Boolean.FALSE);
                                jva.c0(context3, ylbVar2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                dxa dxaVar = new dxa(context3, ylbVar2, j2, 1, chatInvite2.title, new hz7((Object) jvaVar2, (Object) zArr, (Object) str4, (Object) chatInvite2, (Object) jacVar2, (byte) 25), 0L);
                                dxaVar.setOnDismissListener(new eua((byte) 0, jacVar2, zArr));
                                dxaVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.d.c(new dua(jvaVar2, tL_payments_paymentResult, b2));
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
                        jacVar2.a(Long.valueOf(j3), Boolean.TRUE);
                        if (j3 == 0) {
                            b0.I(R.raw.stars_send, jb6.M0(2131744683, null), gm.S2(jb6.G((int) j2, "StarsSubscriptionCompletedText", str3))).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
                            v16Var.c(true);
                        }
                        jvaVar2.P(true);
                        jvaVar2.O();
                    }
                });
                break;
        }
    }

    public /* synthetic */ m97(jva jvaVar, jac jacVar, long j, String str, Context context, ylb ylbVar, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = jvaVar;
        this.e = jacVar;
        this.b = j;
        this.f = str;
        this.c = context;
        this.g = ylbVar;
        this.h = chatInvite;
        this.i = str2;
    }
}
