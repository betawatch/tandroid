package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l3 {
    public final org.telegram.ui.un a;
    public final ArrayList b = new ArrayList(10);
    public final ArrayList c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public l3(org.telegram.ui.un unVar) {
        this.a = unVar;
    }

    public final void a(org.telegram.ui.fm fmVar, int i10, int i11, long j10) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        final l3 l3Var = this;
        ArrayList L = fmVar.L();
        org.telegram.ui.un unVar = l3Var.a;
        if (unVar.c() || i10 < 0 || i11 < 0) {
            return;
        }
        int i12 = fmVar.J;
        int i13 = (i11 - i12) - 10;
        int i14 = (i10 - i12) + 10;
        if (i13 < 0) {
            i13 = 0;
        }
        if (i14 > L.size()) {
            i14 = L.size();
        }
        ArrayList arrayList = l3Var.b;
        arrayList.clear();
        ArrayList arrayList2 = l3Var.c;
        arrayList2.clear();
        ArrayList arrayList3 = l3Var.d;
        arrayList3.clear();
        while (i13 < i14) {
            jj jjVar = (jj) L.get(i13);
            if (unVar.l4 != jjVar && jjVar.f1() > 0 && ((jjVar.k.action == null || jjVar.z()) && j10 - jjVar.E > 15000)) {
                jjVar.E = j10;
                arrayList.add(jjVar);
            }
            if (unVar.l4 != jjVar && jjVar.f1() > 0 && ((jjVar.r2() || ((messageMedia = jjVar.k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (jjVar.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j10 - jjVar.F > 30000)) {
                jjVar.F = j10;
                arrayList2.add(jjVar);
            }
            int i15 = jjVar.D;
            if (i15 == 23 || i15 == 24 || jjVar.k.replyStory != null) {
                TL_stories.StoryItem storyItem2 = (i15 == 23 || i15 == 24) ? jjVar.k.media.storyItem : jjVar.k.replyStory;
                if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j10 - storyItem2.lastUpdateTime > 300000) {
                    storyItem2.lastUpdateTime = j10;
                    arrayList3.add(jjVar);
                }
            }
            i13++;
        }
        long a2 = unVar.a();
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
            tL_messages_getMessagesReactions.peer = unVar.getMessagesController().i1(a2);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                tL_messages_getMessagesReactions.id.add(Integer.valueOf(((jj) arrayList.get(i16)).f1()));
            }
            final int i17 = 1;
            Integer valueOf = Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(l3Var) { // from class: org.telegram.messenger.j3
                public final /* synthetic */ l3 b;

                {
                    this.b = l3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i17) {
                        case 0:
                            l3 l3Var2 = this.b;
                            if (tL_error == null) {
                                l3Var2.a.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                l3Var2.getClass();
                                break;
                            }
                        default:
                            l3 l3Var3 = this.b;
                            l3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i18 = 0; i18 < updates.updates.size(); i18++) {
                                    if (updates.updates.get(i18) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i18)).updateUnreadState = false;
                                    }
                                }
                                l3Var3.a.getMessagesController().L3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            }));
            ArrayList arrayList4 = l3Var.e;
            arrayList4.add(valueOf);
            if (arrayList4.size() > 5) {
                unVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
            }
        }
        long a10 = unVar.a();
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList5 = l3Var.f;
        if (!isEmpty) {
            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
            tL_messages_getExtendedMedia.peer = unVar.getMessagesController().i1(a10);
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                tL_messages_getExtendedMedia.id.add(Integer.valueOf(((jj) arrayList2.get(i18)).f1()));
            }
            final int i19 = 0;
            arrayList5.add(Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(l3Var) { // from class: org.telegram.messenger.j3
                public final /* synthetic */ l3 b;

                {
                    this.b = l3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            l3 l3Var2 = this.b;
                            if (tL_error == null) {
                                l3Var2.a.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                l3Var2.getClass();
                                break;
                            }
                        default:
                            l3 l3Var3 = this.b;
                            l3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i182 = 0; i182 < updates.updates.size(); i182++) {
                                    if (updates.updates.get(i182) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i182)).updateUnreadState = false;
                                    }
                                }
                                l3Var3.a.getMessagesController().L3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            })));
            if (arrayList5.size() > 10) {
                unVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        int i20 = 0;
        while (i20 < arrayList3.size()) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            jj jjVar2 = (jj) arrayList3.get(i20);
            new TL_stories.TL_storyItem();
            int i21 = jjVar2.D;
            if (i21 == 23 || i21 == 24) {
                TLRPC.MessageMedia messageMedia2 = jjVar2.k.media;
                TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                storyItem3.dialogId = messageMedia2.user_id;
                storyItem = storyItem3;
            } else {
                TLRPC.Message message = jjVar2.k;
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null) {
                    storyItem = message.replyStory;
                    storyItem.dialogId = o5.o(messageReplyHeader.peer);
                } else {
                    i20++;
                    l3Var = this;
                }
            }
            long j11 = storyItem.dialogId;
            tL_stories_getStoriesByID.peer = unVar.getMessagesController().i1(j11);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            arrayList5.add(Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new k3(storyItem.id, 0, j11, l3Var, jjVar2))));
            i20++;
            l3Var = this;
        }
        if (arrayList5.size() > 10) {
            unVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
        }
    }
}
