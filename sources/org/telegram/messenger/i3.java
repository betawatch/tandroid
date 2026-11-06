package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i3 {
    public final org.telegram.ui.an a;
    public final ArrayList b = new ArrayList(10);
    public final ArrayList c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public i3(org.telegram.ui.an anVar) {
        this.a = anVar;
    }

    public final void a(org.telegram.ui.jl jlVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        final i3 i3Var = this;
        ArrayList L = jlVar.L();
        org.telegram.ui.an anVar = i3Var.a;
        if (anVar.c() || i7 < 0 || i10 < 0) {
            return;
        }
        int i11 = jlVar.J;
        int i12 = (i10 - i11) - 10;
        int i13 = (i7 - i11) + 10;
        if (i12 < 0) {
            i12 = 0;
        }
        if (i13 > L.size()) {
            i13 = L.size();
        }
        ArrayList arrayList = i3Var.b;
        arrayList.clear();
        ArrayList arrayList2 = i3Var.c;
        arrayList2.clear();
        ArrayList arrayList3 = i3Var.d;
        arrayList3.clear();
        while (i12 < i13) {
            ij ijVar = (ij) L.get(i12);
            if (anVar.l4 != ijVar && ijVar.f1() > 0 && ((ijVar.k.action == null || ijVar.z()) && j3 - ijVar.E > 15000)) {
                ijVar.E = j3;
                arrayList.add(ijVar);
            }
            if (anVar.l4 != ijVar && ijVar.f1() > 0 && ((ijVar.r2() || ((messageMedia = ijVar.k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (ijVar.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - ijVar.F > 30000)) {
                ijVar.F = j3;
                arrayList2.add(ijVar);
            }
            int i14 = ijVar.D;
            if (i14 == 23 || i14 == 24 || ijVar.k.replyStory != null) {
                TL_stories.StoryItem storyItem2 = (i14 == 23 || i14 == 24) ? ijVar.k.media.storyItem : ijVar.k.replyStory;
                if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                    storyItem2.lastUpdateTime = j3;
                    arrayList3.add(ijVar);
                }
            }
            i12++;
        }
        long a10 = anVar.a();
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
            tL_messages_getMessagesReactions.peer = anVar.getMessagesController().j1(a10);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                tL_messages_getMessagesReactions.id.add(Integer.valueOf(((ij) arrayList.get(i15)).f1()));
            }
            final int i16 = 1;
            Integer valueOf = Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(i3Var) { // from class: org.telegram.messenger.g3
                public final /* synthetic */ i3 b;

                {
                    this.b = i3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i16) {
                        case 0:
                            i3 i3Var2 = this.b;
                            if (tL_error == null) {
                                i3Var2.a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                i3Var2.getClass();
                                break;
                            }
                        default:
                            i3 i3Var3 = this.b;
                            i3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i17 = 0; i17 < updates.updates.size(); i17++) {
                                    if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i17)).updateUnreadState = false;
                                    }
                                }
                                i3Var3.a.getMessagesController().O3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            }));
            ArrayList arrayList4 = i3Var.e;
            arrayList4.add(valueOf);
            if (arrayList4.size() > 5) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
            }
        }
        long a11 = anVar.a();
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList5 = i3Var.f;
        if (!isEmpty) {
            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
            tL_messages_getExtendedMedia.peer = anVar.getMessagesController().j1(a11);
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                tL_messages_getExtendedMedia.id.add(Integer.valueOf(((ij) arrayList2.get(i17)).f1()));
            }
            final int i18 = 0;
            arrayList5.add(Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(i3Var) { // from class: org.telegram.messenger.g3
                public final /* synthetic */ i3 b;

                {
                    this.b = i3Var;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i18) {
                        case 0:
                            i3 i3Var2 = this.b;
                            if (tL_error == null) {
                                i3Var2.a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                break;
                            } else {
                                i3Var2.getClass();
                                break;
                            }
                        default:
                            i3 i3Var3 = this.b;
                            i3Var3.getClass();
                            if (tL_error == null) {
                                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                for (int i172 = 0; i172 < updates.updates.size(); i172++) {
                                    if (updates.updates.get(i172) instanceof TL_update.TL_updateMessageReactions) {
                                        ((TL_update.TL_updateMessageReactions) updates.updates.get(i172)).updateUnreadState = false;
                                    }
                                }
                                i3Var3.a.getMessagesController().O3(updates, false);
                                break;
                            }
                            break;
                    }
                }
            })));
            if (arrayList5.size() > 10) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        int i19 = 0;
        while (i19 < arrayList3.size()) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            ij ijVar2 = (ij) arrayList3.get(i19);
            new TL_stories.TL_storyItem();
            int i20 = ijVar2.D;
            if (i20 == 23 || i20 == 24) {
                TLRPC.MessageMedia messageMedia2 = ijVar2.k.media;
                TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                storyItem3.dialogId = messageMedia2.user_id;
                storyItem = storyItem3;
            } else {
                TLRPC.Message message = ijVar2.k;
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null) {
                    storyItem = message.replyStory;
                    storyItem.dialogId = m5.o(messageReplyHeader.peer);
                } else {
                    i19++;
                    i3Var = this;
                }
            }
            long j10 = storyItem.dialogId;
            tL_stories_getStoriesByID.peer = anVar.getMessagesController().j1(j10);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            arrayList5.add(Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new h3(storyItem.id, 0, j10, i3Var, ijVar2))));
            i19++;
            i3Var = this;
        }
        if (arrayList5.size() > 10) {
            anVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
        }
    }
}
