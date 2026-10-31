package mg;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.z60;
import org.telegram.ui.un;
import org.telegram.ui.uy0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n0(long j10, long j11, w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway) {
        this.d = w0Var;
        this.e = prepaidGiveaway;
        this.f = tL_prepaidStarsGiveaway;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGiveaway] */
    /* JADX WARN: Type inference failed for: r9v4, types: [org.telegram.tgnet.TLRPC$InputStorePaymentPurpose] */
    /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiveaway] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = k0.l(w0Var.e2);
                int i11 = w0Var.b2;
                int i12 = og.w.w;
                boolean z10 = i11 == 1;
                w0Var.i2.b(true);
                ArrayList arrayList = w0Var.U1;
                ArrayList arrayList2 = w0Var.W1;
                TLRPC.Chat chat = w0Var.T1;
                boolean z11 = w0Var.p2;
                boolean z12 = w0Var.o2;
                int i13 = prepaidGiveaway.quantity;
                String str = w0Var.n2;
                s0 s0Var = new s0(this.b, this.c, w0Var, prepaidGiveaway, tL_prepaidStarsGiveaway);
                o0 o0Var = new o0(w0Var, 6);
                vp r12 = vp.r1(d20.s0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i14 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i14 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i14 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = r12.i1(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj5 = arrayList.get(i16);
                        i16++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i17 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i17 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i17 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = r12.i1(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj6 = arrayList2.get(i18);
                        i18++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size4) {
                        Object obj7 = arrayList.get(i19);
                        i19++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject2).id));
                        }
                    }
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = r12.i1(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new ag.p0(o0Var, r12, s0Var, 5));
                break;
            default:
                ((z60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.b);
                bundle.putLong("topic_id", this.c);
                ((k2) obj2).presentFragment(new uy0(bundle, (p6) obj));
                break;
        }
    }

    public /* synthetic */ n0(z60 z60Var, long j10, long j11, un unVar, p6 p6Var) {
        this.d = z60Var;
        this.b = j10;
        this.c = j11;
        this.e = unVar;
        this.f = p6Var;
    }
}
