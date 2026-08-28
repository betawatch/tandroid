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
import org.telegram.ui.b61;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
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
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (SendMessagesHelper.DelayedMessage) this.g, this.b, (TLObject) obj);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f;
                String str = (String) this.g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    break;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    break;
                }
            default:
                b61 b61Var = (b61) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f;
                HashMap hashMap = (HashMap) this.g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i9 = b61Var.R;
                if (this.b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(5);
                    for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                        if (stickerSets.get(i10).documents != null && (arrayList2 = stickerSets.get(i10).documents) != null) {
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i11), null);
                                long j10 = arrayList2.get(i11).id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i9).getFeaturedEmojiSets();
                    for (int i12 = 0; i12 < featuredEmojiSets.size(); i12++) {
                        if ((featuredEmojiSets.get(i12) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i12)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i12)).documents) != null) {
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i13), null);
                                long j11 = arrayList.get(i13).id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                } else {
                    MediaDataController.getInstance(i9).getEmojiSuggestions(b61.W1, str2, false, new f1.a(b61Var, linkedHashSet, hashMap, arrayList3, runnable), null, true, b61Var.S == 3, false, 30);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f = chatParticipant;
        this.b = z10;
        this.g = str;
    }

    public /* synthetic */ dk(b61 b61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.c = b61Var;
        this.b = z10;
        this.e = linkedHashSet;
        this.f = str;
        this.g = hashMap;
        this.d = arrayList;
    }
}
