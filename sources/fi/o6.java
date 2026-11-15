package fi;

import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ o6(r6 r6Var, int i7) {
        this.a = i7;
        this.b = r6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        bi.j jVar;
        TLRPC.Updates updates;
        boolean z10;
        int i7;
        int i10;
        TLRPC.Updates updates2;
        ArrayList arrayList;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                r6 r6Var = this.b;
                long j3 = r6Var.K;
                String str = r6Var.f;
                boolean z11 = r6Var.b;
                hi.d7 d7Var = r6Var.c;
                int i13 = r6Var.N.a;
                if (tLObject instanceof TLRPC.Updates) {
                    r6Var.J = false;
                    TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
                    if (d7Var.b0) {
                        np.s1(i13).O3(updates3, false);
                        org.telegram.messenger.g0.h3(new p6(r6Var, 1));
                        break;
                    } else {
                        int i14 = 0;
                        int i15 = 0;
                        TL_stories.StoryItem storyItem = null;
                        while (i14 < updates3.updates.size()) {
                            if (updates3.updates.get(i14) instanceof TL_stories.TL_updateStory) {
                                TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) updates3.updates.get(i14)).story;
                                storyItem2.attachPath = r6Var.e;
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
                                    int i17 = d7Var.I0;
                                    if (i17 == Integer.MAX_VALUE) {
                                        i17 = 86400;
                                    }
                                    storyItem.expire_date = currentTime + i17;
                                    storyItem.parsedPrivacy = null;
                                    ArrayList arrayList2 = d7Var.F0;
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
                                                            i19 = com.google.android.gms.internal.vision.e2.g(i19, 1, tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users);
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
                                                                i20 = com.google.android.gms.internal.vision.e2.g(i20, 1, tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users);
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
                                            i7 = i14;
                                            i10 = i13;
                                            storyItem.privacy = arrayList3;
                                            storyItem.pinned = d7Var.I0 == Integer.MAX_VALUE;
                                            storyItem.dialogId = m10.i(i10).n;
                                            storyItem.attachPath = r6Var.e;
                                            storyItem.firstFramePath = str;
                                            storyItem.id = tL_updateStoryID.id;
                                            storyItem.justUploaded = !z10;
                                            i14 = i7 + 1;
                                            z11 = z10;
                                            i13 = i10;
                                            updates3 = updates;
                                        }
                                    }
                                }
                            }
                            updates = updates3;
                            z10 = z11;
                            i7 = i14;
                            i10 = i13;
                            i14 = i7 + 1;
                            z11 = z10;
                            i13 = i10;
                            updates3 = updates;
                        }
                        TLRPC.Updates updates4 = updates3;
                        boolean z12 = z11;
                        int i21 = i13;
                        if (r6Var.w) {
                            TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                            tL_stories_deleteStories.peer = np.s1(i21).j1(j3);
                            tL_stories_deleteStories.id.add(Integer.valueOf(i15));
                            ConnectionsManager.getInstance(i21).sendRequest(tL_stories_deleteStories, new o6(r6Var, 1));
                        } else {
                            if ((i15 == 0 || z12) && storyItem != null) {
                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                tL_updateStory.peer = np.s1(i21).z1(j3);
                                tL_updateStory.story = storyItem;
                                org.telegram.messenger.g0.h3(new f6(2, r6Var, tL_updateStory));
                            }
                            TLRPC.MessageMedia messageMedia = storyItem.media;
                            if (messageMedia != null && storyItem.attachPath != null) {
                                if (messageMedia.document != null) {
                                    org.telegram.messenger.w7.G(i21).e0(storyItem.attachPath, storyItem.media.document);
                                } else {
                                    TLRPC.Photo photo = messageMedia.photo;
                                    if (photo != null) {
                                        org.telegram.messenger.w7.G(i21).e0(storyItem.attachPath, org.telegram.messenger.w7.w(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false));
                                    }
                                }
                            }
                            org.telegram.messenger.g0.h3(new bi.m1(r6Var, j3, storyItem, 7));
                            np.s1(i21).N3(updates4.updates, updates4.users, updates4.chats, false, updates4.date);
                        }
                    }
                } else if (tLObject instanceof TL_bots.botPreviewMedia) {
                    r6Var.M = (TL_bots.botPreviewMedia) tLObject;
                } else if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && d7Var.c0 != null && (jVar = d7Var.d0) != null) {
                    jVar.a(new q6(r6Var, 0));
                    d7Var.d0 = null;
                    break;
                } else if (tL_error != null && !z11) {
                    org.telegram.messenger.g0.h3(new f6(3, r6Var, tL_error));
                }
                org.telegram.messenger.g0.h3(new p6(r6Var, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new x5(this.b.N, 2));
                break;
        }
    }
}
