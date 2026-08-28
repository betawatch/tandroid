package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ r6(u6 u6Var, int i9) {
        this.a = i9;
        this.b = u6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fh.i iVar;
        TLRPC.Updates updates;
        boolean z10;
        int i9;
        int i10;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                u6 u6Var = this.b;
                long j10 = u6Var.F;
                String str = u6Var.f;
                boolean z11 = u6Var.b;
                kh.a8 a8Var = u6Var.c;
                int i13 = u6Var.I.a;
                if (tLObject instanceof TLRPC.Updates) {
                    u6Var.E = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (a8Var.b0) {
                        MessagesController.getInstance(i13).processUpdates(updates3, false);
                        AndroidUtilities.runOnUIThread(new s6(u6Var, 1));
                        break;
                    } else {
                        int i14 = 0;
                        int i15 = 0;
                        TL_stories.StoryItem storyItem = null;
                        while (i14 < updates3.updates.size()) {
                            if (updates3.updates.get(i14) instanceof TL_stories.TL_updateStory) {
                                TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i14)).story;
                                storyItem2.attachPath = u6Var.e;
                                storyItem2.firstFramePath = str;
                                storyItem2.justUploaded = !z11;
                                int i16 = storyItem2.id;
                                if (storyItem == null) {
                                    storyItem = storyItem2;
                                } else {
                                    storyItem.media = storyItem2.media;
                                }
                                i15 = i16;
                            }
                            if (updates3.updates.get(i14) instanceof TL_update.TL_updateStoryID) {
                                TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) updates3.updates.get(i14);
                                if (storyItem == null) {
                                    storyItem = new TL_stories.TL_storyItem();
                                    int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                                    storyItem.date = currentTime;
                                    int i17 = a8Var.I0;
                                    if (i17 == Integer.MAX_VALUE) {
                                        i17 = 86400;
                                    }
                                    storyItem.expire_date = currentTime + i17;
                                    storyItem.parsedPrivacy = null;
                                    ArrayList arrayList2 = a8Var.F0;
                                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                                    int i18 = 0;
                                    while (true) {
                                        z10 = z11;
                                        if (i18 < arrayList2.size()) {
                                            TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i18);
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
                                                        i11 = i14;
                                                        int i19 = 0;
                                                        for (TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule; i19 < tL_inputPrivacyValueDisallowUsers.users.size(); tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers) {
                                                            i19 = aa.d.g(tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users, i19, 1);
                                                            i13 = i13;
                                                            updates3 = updates3;
                                                        }
                                                        updates2 = updates3;
                                                        i12 = i13;
                                                        arrayList3.add(tL_privacyValueDisallowUsers);
                                                    } else {
                                                        updates2 = updates3;
                                                        arrayList = arrayList2;
                                                        i11 = i14;
                                                        i12 = i13;
                                                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                            int i20 = 0;
                                                            for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i20 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                                                i20 = aa.d.g(tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users, i20, 1);
                                                            }
                                                            arrayList3.add(tL_privacyValueAllowUsers);
                                                        }
                                                    }
                                                    i18++;
                                                    z11 = z10;
                                                    arrayList2 = arrayList;
                                                    i14 = i11;
                                                    i13 = i12;
                                                    updates3 = updates2;
                                                }
                                            }
                                            updates2 = updates3;
                                            arrayList = arrayList2;
                                            i11 = i14;
                                            i12 = i13;
                                            i18++;
                                            z11 = z10;
                                            arrayList2 = arrayList;
                                            i14 = i11;
                                            i13 = i12;
                                            updates3 = updates2;
                                        } else {
                                            updates = updates3;
                                            i9 = i14;
                                            i10 = i13;
                                            storyItem.privacy = arrayList3;
                                            storyItem.pinned = a8Var.I0 == Integer.MAX_VALUE;
                                            storyItem.dialogId = UserConfig.getInstance(i10).clientUserId;
                                            storyItem.attachPath = u6Var.e;
                                            storyItem.firstFramePath = str;
                                            storyItem.id = tL_updateStoryID.id;
                                            storyItem.justUploaded = !z10;
                                            i14 = i9 + 1;
                                            z11 = z10;
                                            i13 = i10;
                                            updates3 = updates;
                                        }
                                    }
                                }
                            }
                            updates = updates3;
                            z10 = z11;
                            i9 = i14;
                            i10 = i13;
                            i14 = i9 + 1;
                            z11 = z10;
                            i13 = i10;
                            updates3 = updates;
                        }
                        TLRPC.Updates updates4 = updates3;
                        boolean z12 = z11;
                        int i21 = i13;
                        if (u6Var.v) {
                            TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i21).getInputPeer(j10);
                            tL_stories_deleteStories.peer = inputPeer;
                            if (inputPeer != null) {
                                tL_stories_deleteStories.id.add(Integer.valueOf(i15));
                                ConnectionsManager.getInstance(i21).sendRequest(tL_stories_deleteStories, new r6(u6Var, 1));
                            }
                        } else {
                            if ((i15 == 0 || z12) && storyItem != null) {
                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                tL_updateStory.peer = MessagesController.getInstance(i21).getPeer(j10);
                                tL_updateStory.story = storyItem;
                                AndroidUtilities.runOnUIThread(new h3.g0(21, u6Var, tL_updateStory));
                            }
                            TLRPC.MessageMedia messageMedia = storyItem.media;
                            if (messageMedia != null && storyItem.attachPath != null) {
                                if (messageMedia.document != null) {
                                    FileLoader.getInstance(i21).setLocalPathTo(storyItem.media.document, storyItem.attachPath);
                                } else {
                                    TLRPC.Photo photo = messageMedia.photo;
                                    if (photo != null) {
                                        FileLoader.getInstance(i21).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.attachPath);
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new e5.w(u6Var, j10, storyItem, 7));
                            MessagesController.getInstance(i21).processUpdateArray(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                        }
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    u6Var.H = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && a8Var.c0 != null && (iVar = a8Var.d0) != null) {
                    iVar.run(new t6(u6Var, 0));
                    a8Var.d0 = null;
                    break;
                } else if (tL_error != null && !z11) {
                    AndroidUtilities.runOnUIThread(new h3.g0(22, u6Var, tL_error));
                }
                AndroidUtilities.runOnUIThread(new s6(u6Var, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new z5(this.b.I, 2));
                break;
        }
    }
}
