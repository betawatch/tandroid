package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = delayedMessage;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i10 = this.a;
        Object obj2 = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.c;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) notificationCenterDelegate).lambda$performSendMessageRequestMulti$67((ArrayList) obj2, (ArrayList) obj5, (ArrayList) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.b, (TLObject) obj);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) notificationCenterDelegate;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                TLRPC.User user = (TLRPC.User) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj4;
                String str = (String) obj3;
                Integer num = (Integer) obj;
                int i11 = ProfileActivity.R6;
                profileActivity.getClass();
                boolean z10 = this.b;
                if (channelParticipant != null) {
                    profileActivity.I4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    break;
                } else {
                    profileActivity.I4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    break;
                }
            default:
                f61 f61Var = (f61) notificationCenterDelegate;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj5;
                String str2 = (String) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i12 = f61Var.V;
                if (this.b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                    for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                        if (stickerSets.get(i13).documents != null && (arrayList2 = stickerSets.get(i13).documents) != null) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i14), null);
                                long j10 = arrayList2.get(i14).id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                    for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                        if ((featuredEmojiSets.get(i15) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i15)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i15)).documents) != null) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i16), null);
                                long j11 = arrayList.get(i16).id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                } else {
                    MediaDataController.getInstance(i12).getEmojiSuggestions(f61.b2, str2, false, new bi.p7(f61Var, linkedHashSet, hashMap, arrayList3, runnable), null, true, f61Var.W == 3, false, 30);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f = chatParticipant;
        this.b = z10;
        this.g = str;
    }

    public /* synthetic */ lk(f61 f61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.c = f61Var;
        this.b = z10;
        this.e = linkedHashSet;
        this.f = str;
        this.g = hashMap;
        this.d = arrayList;
    }
}
