package org.telegram.messenger;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.w70;
import org.telegram.ui.c21;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x2(long j3, long j10, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.a = 6;
        this.d = topicsController;
        this.b = j3;
        this.e = arrayList;
        this.c = j10;
        this.f = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [org.telegram.tgnet.TLRPC$InputStorePaymentPurpose] */
    /* JADX WARN: Type inference failed for: r9v11, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiveaway] */
    /* JADX WARN: Type inference failed for: r9v9, types: [org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGiveaway] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10;
        int i11;
        int i12 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
            case 1:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.b, (wh.l) obj, this.c);
                break;
            case 2:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.b, this.c, (Runnable) obj);
                break;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.b, this.c, (AtomicReference) obj2, (CountDownLatch) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.b, this.c, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.b, this.c);
                break;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.b, (ArrayList) obj2, this.c, (Runnable) obj);
                break;
            case 7:
                ((w70) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.b);
                bundle.putLong("topic_id", this.c);
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(new c21(bundle, (org.telegram.ui.ActionBar.f6) obj));
                break;
            default:
                sg.a0 a0Var = (sg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = sg.s.l(a0Var.m0);
                int i13 = a0Var.j0;
                int i14 = ug.u.s;
                boolean z10 = i13 == 1;
                a0Var.q0.b(true);
                ArrayList arrayList = a0Var.c0;
                ArrayList arrayList2 = a0Var.e0;
                TLRPC.Chat chat = a0Var.b0;
                boolean z11 = a0Var.x0;
                boolean z12 = a0Var.w0;
                int i15 = prepaidGiveaway.quantity;
                String str = a0Var.v0;
                sg.y yVar = new sg.y(a0Var, tL_prepaidStarsGiveaway, this.b, this.c, prepaidGiveaway);
                sg.v vVar = new sg.v(a0Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i16 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i16 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i16 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj4 = arrayList2.get(i17);
                        i17++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj5 = arrayList.get(i18);
                        i18++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            i11 = size2;
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        } else {
                            i11 = size2;
                        }
                        size2 = i11;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i19 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i19 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i19 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj6 = arrayList2.get(i20);
                        i20++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj7 = arrayList.get(i21);
                        i21++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            i10 = size4;
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                        } else {
                            i10 = size4;
                        }
                        size4 = i10;
                    }
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.wa(vVar, messagesController, yVar, 17));
                break;
        }
    }

    public /* synthetic */ x2(Object obj, long j3, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = j10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ x2(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = serializable;
        this.b = j3;
        this.c = j10;
        this.f = obj2;
    }

    public /* synthetic */ x2(Object obj, TLObject tLObject, TLObject tLObject2, long j3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f = tLObject2;
        this.b = j3;
        this.c = j10;
    }

    public /* synthetic */ x2(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j3, wh.l lVar, long j10) {
        this.a = 1;
        this.d = giftAuctionController;
        this.e = callback2;
        this.b = j3;
        this.f = lVar;
        this.c = j10;
    }
}
