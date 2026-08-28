package bg;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.x60;
import org.telegram.ui.s01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x0(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.a = 7;
        this.d = topicsController;
        this.b = j10;
        this.e = arrayList;
        this.c = j11;
        this.f = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGiveaway] */
    /* JADX WARN: Type inference failed for: r13v5, types: [org.telegram.tgnet.TLRPC$InputStorePaymentPurpose] */
    /* JADX WARN: Type inference failed for: r13v6, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiveaway] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? tL_inputStorePaymentStarsGiveaway;
        int i9 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i9) {
            case 0:
                h1 h1Var = (h1) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = u0.l(h1Var.i0);
                int i10 = h1Var.f0;
                int i11 = dg.y.s;
                boolean z10 = i10 == 1;
                h1Var.m0.b(true);
                ArrayList arrayList = h1Var.Y;
                ArrayList arrayList2 = h1Var.a0;
                TLRPC.Chat chat = h1Var.X;
                boolean z11 = h1Var.t0;
                boolean z12 = h1Var.s0;
                int i12 = prepaidGiveaway.quantity;
                String str = h1Var.r0;
                ArrayList arrayList3 = arrayList;
                d1 d1Var = new d1(h1Var, tL_prepaidStarsGiveaway, this.b, this.c, prepaidGiveaway);
                z0 z0Var = new z0(h1Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i13 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i13 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i13 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        ArrayList arrayList4 = arrayList3;
                        Object obj5 = arrayList4.get(i15);
                        i15++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                        arrayList3 = arrayList4;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i16 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i16 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i16 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList2.get(i17);
                        i17++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList3.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        Object obj7 = arrayList3.get(i18);
                        i18++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                        }
                    }
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new b0((Utilities.Callback) z0Var, messagesController, (Utilities.Callback) d1Var, 2));
                break;
            case 1:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
            case 2:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.b, (fh.w) obj, this.c);
                break;
            case 3:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.b, this.c, (Runnable) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.b, this.c, (AtomicReference) obj2, (CountDownLatch) obj);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.b, this.c, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 6:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.b, this.c);
                break;
            case 7:
                ((TopicsController) obj3).lambda$loadTopic$27(this.b, (ArrayList) obj2, this.c, (Runnable) obj);
                break;
            default:
                ((x60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.b);
                bundle.putLong("topic_id", this.c);
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment(new s01(bundle, (b6) obj));
                break;
        }
    }

    public /* synthetic */ x0(Object obj, long j10, long j11, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = j10;
        this.c = j11;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ x0(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = serializable;
        this.b = j10;
        this.c = j11;
        this.f = obj2;
    }

    public /* synthetic */ x0(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = tLObject;
        this.f = tLObject2;
        this.b = j10;
        this.c = j11;
    }

    public /* synthetic */ x0(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, fh.w wVar, long j11) {
        this.a = 2;
        this.d = giftAuctionController;
        this.e = callback2;
        this.b = j10;
        this.f = wVar;
        this.c = j11;
    }
}
