package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class k3 {
    public final org.telegram.ui.bn a;
    public final ArrayList b = new ArrayList(10);
    public final ArrayList c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public k3(org.telegram.ui.bn bnVar) {
        this.a = bnVar;
    }

    public final void a(org.telegram.ui.kl klVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        final k3 k3Var = this;
        ArrayList L = klVar.L();
        org.telegram.ui.bn bnVar = k3Var.a;
        if (bnVar.c() || i7 < 0 || i10 < 0) {
            return;
        }
        int i11 = klVar.K;
        int i12 = (i10 - i11) - 10;
        int i13 = (i7 - i11) + 10;
        if (i12 < 0) {
            i12 = 0;
        }
        if (i13 > L.size()) {
            i13 = L.size();
        }
        ArrayList arrayList = k3Var.b;
        arrayList.clear();
        ArrayList arrayList2 = k3Var.c;
        arrayList2.clear();
        ArrayList arrayList3 = k3Var.d;
        arrayList3.clear();
        while (i12 < i13) {
            fj fjVar = (fj) L.get(i12);
            if (bnVar.m4 != fjVar && fjVar.e1() > 0 && ((fjVar.k.action == null || fjVar.z()) && j3 - fjVar.E > 15000)) {
                fjVar.E = j3;
                arrayList.add(fjVar);
            }
            if (bnVar.m4 != fjVar && fjVar.e1() > 0 && ((fjVar.q2() || ((messageMedia = fjVar.k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (fjVar.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - fjVar.F > 30000)) {
                fjVar.F = j3;
                arrayList2.add(fjVar);
            }
            int i14 = fjVar.D;
            if (i14 == 23 || i14 == 24 || fjVar.k.replyStory != null) {
                TL_stories.StoryItem storyItem2 = (i14 == 23 || i14 == 24) ? fjVar.k.media.storyItem : fjVar.k.replyStory;
                if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                    storyItem2.lastUpdateTime = j3;
                    arrayList3.add(fjVar);
                }
            }
            i12++;
        }
        long a10 = bnVar.a();
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
            tL_messages_getMessagesReactions.peer = bnVar.getMessagesController().l1(a10);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                tL_messages_getMessagesReactions.id.add(Integer.valueOf(((fj) arrayList.get(i15)).e1()));
            }
            final int i16 = 1;
            Integer valueOf = Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(k3Var) { // from class: org.telegram.messenger.i3
                public final /* synthetic */ k3 b;

                {
                    this.b = k3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i16) {
                        case 0:
                            k3 k3Var2 = this.b;
                            if (tL_error == null) {
                                k3Var2.a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                k3Var2.getClass();
                                break;
                            }
                        default:
                            k3 k3Var3 = this.b;
                            k3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i17 = 0; i17 < updates.updates.size(); i17++) {
                                    if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i17)).updateUnreadState = false;
                                    }
                                }
                                k3Var3.a.getMessagesController().V3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            }));
            ArrayList arrayList4 = k3Var.e;
            arrayList4.add(valueOf);
            if (arrayList4.size() > 5) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
            }
        }
        long a11 = bnVar.a();
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList5 = k3Var.f;
        if (!isEmpty) {
            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
            tL_messages_getExtendedMedia.peer = bnVar.getMessagesController().l1(a11);
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                tL_messages_getExtendedMedia.id.add(Integer.valueOf(((fj) arrayList2.get(i17)).e1()));
            }
            final int i18 = 0;
            arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(k3Var) { // from class: org.telegram.messenger.i3
                public final /* synthetic */ k3 b;

                {
                    this.b = k3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i18) {
                        case 0:
                            k3 k3Var2 = this.b;
                            if (tL_error == null) {
                                k3Var2.a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                k3Var2.getClass();
                                break;
                            }
                        default:
                            k3 k3Var3 = this.b;
                            k3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i172 = 0; i172 < updates.updates.size(); i172++) {
                                    if (updates.updates.get(i172) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i172)).updateUnreadState = false;
                                    }
                                }
                                k3Var3.a.getMessagesController().V3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            })));
            if (arrayList5.size() > 10) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        int i19 = 0;
        while (i19 < arrayList3.size()) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            fj fjVar2 = (fj) arrayList3.get(i19);
            new TL_stories.TL_storyItem();
            int i20 = fjVar2.D;
            if (i20 == 23 || i20 == 24) {
                TLRPC.MessageMedia messageMedia2 = fjVar2.k.media;
                TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                storyItem3.dialogId = messageMedia2.user_id;
                storyItem = storyItem3;
            } else {
                TLRPC.Message message = fjVar2.k;
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null) {
                    storyItem = message.replyStory;
                    storyItem.dialogId = n5.o(messageReplyHeader.peer);
                } else {
                    i19++;
                    k3Var = this;
                }
            }
            long j10 = storyItem.dialogId;
            tL_stories_getStoriesByID.peer = bnVar.getMessagesController().l1(j10);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new j3(storyItem.id, 0, j10, k3Var, fjVar2))));
            i19++;
            k3Var = this;
        }
        if (arrayList5.size() > 10) {
            bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
        }
    }
}
