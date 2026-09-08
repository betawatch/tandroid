package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ p8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        o4 o4Var;
        TLRPC.Updates updates;
        boolean z10;
        int i10;
        int i11;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                t8 t8Var = this.b;
                long j3 = t8Var.J;
                String str = t8Var.f;
                boolean z11 = t8Var.b;
                di.o8 o8Var = t8Var.c;
                int i14 = t8Var.M.a;
                if (tLObject instanceof TLRPC.Updates) {
                    t8Var.I = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (o8Var.b0) {
                        MessagesController.getInstance(i14).processUpdates(updates3, false);
                        AndroidUtilities.runOnUIThread(new q8(t8Var, 1));
                        break;
                    } else {
                        int i15 = 0;
                        int i16 = 0;
                        TL_stories.StoryItem storyItem = null;
                        while (i15 < updates3.updates.size()) {
                            if (updates3.updates.get(i15) instanceof TL_stories.TL_updateStory) {
                                TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i15)).story;
                                storyItem2.attachPath = t8Var.e;
                                storyItem2.firstFramePath = str;
                                storyItem2.justUploaded = !z11;
                                int i17 = storyItem2.id;
                                if (storyItem == null) {
                                    storyItem = storyItem2;
                                } else {
                                    storyItem.media = storyItem2.media;
                                }
                                i16 = i17;
                            }
                            if (updates3.updates.get(i15) instanceof TL_update.TL_updateStoryID) {
                                TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i15);
                                if (storyItem == null) {
                                    storyItem = new TL_stories.TL_storyItem();
                                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                                    storyItem.date = currentTime;
                                    int i18 = o8Var.I0;
                                    if (i18 == Integer.MAX_VALUE) {
                                        i18 = 86400;
                                    }
                                    storyItem.expire_date = currentTime + i18;
                                    storyItem.parsedPrivacy = null;
                                    ArrayList arrayList2 = o8Var.F0;
                                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                    int i19 = 0;
                                    while (true) {
                                        z10 = z11;
                                        if (i19 < arrayList2.size()) {
                                            TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i19);
                                            if (inputPrivacyRule != null) {
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                                    arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                                                } else {
                                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                        TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                        arrayList = arrayList2;
                                                        i12 = i15;
                                                        int i20 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; i20 < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                            i20 = com.google.android.gms.internal.vision.e2.g(tL_inputPrivacyValueDisallowUsers.users.get(i20).user_id, tL_privacyValueDisallowUsers.users, i20, 1);
                                                            i14 = i14;
                                                            updates3 = updates3;
                                                        }
                                                        updates2 = updates3;
                                                        i13 = i14;
                                                        arrayList3.add(tL_privacyValueDisallowUsers);
                                                    } else {
                                                        updates2 = updates3;
                                                        arrayList = arrayList2;
                                                        i12 = i15;
                                                        i13 = i14;
                                                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                            int i21 = 0;
                                                            for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i21 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                                i21 = com.google.android.gms.internal.vision.e2.g(tL_inputPrivacyValueAllowUsers.users.get(i21).user_id, tL_privacyValueAllowUsers.users, i21, 1);
                                                            }
                                                            arrayList3.add(tL_privacyValueAllowUsers);
                                                        }
                                                    }
                                                    i19++;
                                                    z11 = z10;
                                                    arrayList2 = arrayList;
                                                    i15 = i12;
                                                    i14 = i13;
                                                    updates3 = updates2;
                                                }
                                            }
                                            updates2 = updates3;
                                            arrayList = arrayList2;
                                            i12 = i15;
                                            i13 = i14;
                                            i19++;
                                            z11 = z10;
                                            arrayList2 = arrayList;
                                            i15 = i12;
                                            i14 = i13;
                                            updates3 = updates2;
                                        } else {
                                            updates = updates3;
                                            i10 = i15;
                                            i11 = i14;
                                            storyItem.privacy = arrayList3;
                                            storyItem.pinned = o8Var.I0 == Integer.MAX_VALUE;
                                            storyItem.dialogId = UserConfig.getInstance(i11).clientUserId;
                                            storyItem.attachPath = t8Var.e;
                                            storyItem.firstFramePath = str;
                                            storyItem.id = tL_updateStoryID.id;
                                            storyItem.justUploaded = !z10;
                                            i15 = i10 + 1;
                                            z11 = z10;
                                            i14 = i11;
                                            updates3 = updates;
                                        }
                                    }
                                }
                            }
                            updates = updates3;
                            z10 = z11;
                            i10 = i15;
                            i11 = i14;
                            i15 = i10 + 1;
                            z11 = z10;
                            i14 = i11;
                            updates3 = updates;
                        }
                        TLRPC.Updates updates4 = updates3;
                        boolean z12 = z11;
                        int i22 = i14;
                        if (t8Var.v) {
                            TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i22).getInputPeer(j3);
                            tL_stories_deleteStories.peer = inputPeer;
                            if (inputPeer != null) {
                                tL_stories_deleteStories.id.add(Integer.valueOf(i16));
                                ConnectionsManager.getInstance(i22).sendRequest(tL_stories_deleteStories, new p8(t8Var, 1));
                            }
                        } else {
                            if ((i16 == 0 || z12) && storyItem != null) {
                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                tL_updateStory.peer = MessagesController.getInstance(i22).getPeer(j3);
                                tL_updateStory.story = storyItem;
                                AndroidUtilities.runOnUIThread(new a1.e(28, t8Var, tL_updateStory));
                            }
                            TLRPC.MessageMedia messageMedia = storyItem.media;
                            if (messageMedia != null && storyItem.attachPath != null) {
                                if (messageMedia.document != null) {
                                    FileLoader.getInstance(i22).setLocalPathTo(storyItem.media.document, storyItem.attachPath);
                                } else {
                                    TLRPC.Photo photo = messageMedia.photo;
                                    if (photo != null) {
                                        FileLoader.getInstance(i22).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.attachPath);
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new a3.h0(t8Var, j3, storyItem, 3));
                            MessagesController.getInstance(i22).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                        }
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    t8Var.L = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && o8Var.c0 != null && (o4Var = o8Var.d0) != null) {
                    o4Var.run(new r8(t8Var, 0));
                    o8Var.d0 = null;
                    break;
                } else if (tL_error != null && !z11) {
                    AndroidUtilities.runOnUIThread(new a1.e(29, t8Var, tL_error));
                }
                AndroidUtilities.runOnUIThread(new q8(t8Var, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new r7(this.b.M, 2));
                break;
        }
    }
}
