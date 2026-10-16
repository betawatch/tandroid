package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bb0;
import org.telegram.ui.br;
import org.telegram.ui.cb0;
import org.telegram.ui.fo;
import org.telegram.ui.k10;
import org.telegram.ui.n60;
import org.telegram.ui.rr0;
import org.telegram.ui.uc;
import org.telegram.ui.wa0;
import org.telegram.ui.xy;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b8(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        org.telegram.ui.Wallet.h0 h0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.b;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.e;
        byte[] bArr3 = null;
        for (int i10 = 0; i10 < encryptedsecretphrasepartArr.length; i10++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i10].data, 0, 32);
                byte[] bArr4 = encryptedsecretphrasepartArr[i10].data;
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, 32, bArr4.length);
                long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j10, key_from_public_key), copyOfRange2);
                ConferenceCall.key_destroy(key_from_public_key);
                SerializedData serializedData = new SerializedData(decrypt_message_for_one);
                try {
                    mnemonic_decryptedkeypart = TL_wallet.mnemonic_decryptedKeyPart.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    if (mnemonic_decryptedkeypart != null) {
                        try {
                            byte[] bArr5 = mnemonic_decryptedkeypart.share;
                            if (bArr5 != null) {
                                if (bArr3 == null) {
                                    bArr3 = (byte[]) bArr5.clone();
                                } else {
                                    if (bArr5.length != bArr3.length) {
                                        org.telegram.ui.Wallet.k0.i("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
                                        jVar.run(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                        byte[] bArr6 = mnemonic_decryptedkeypart.share;
                                        if (bArr6 != null) {
                                            Arrays.fill(bArr6, (byte) 0);
                                        }
                                        Arrays.fill(decrypt_message_for_one, (byte) 0);
                                        serializedData.cleanup();
                                        Arrays.fill(bArr3, (byte) 0);
                                        return;
                                    }
                                    for (int i11 = 0; i11 < bArr3.length; i11++) {
                                        bArr3[i11] = (byte) (bArr3[i11] ^ mnemonic_decryptedkeypart.share[i11]);
                                    }
                                }
                                byte[] bArr7 = mnemonic_decryptedkeypart.share;
                                if (bArr7 != null) {
                                    Arrays.fill(bArr7, (byte) 0);
                                }
                                Arrays.fill(decrypt_message_for_one, (byte) 0);
                                serializedData.cleanup();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (mnemonic_decryptedkeypart != null && (bArr = mnemonic_decryptedkeypart.share) != null) {
                                Arrays.fill(bArr, (byte) 0);
                            }
                            Arrays.fill(decrypt_message_for_one, (byte) 0);
                            serializedData.cleanup();
                            throw th;
                        }
                    }
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: couldn't decrypt " + i10 + " part");
                    jVar.run(null, "WALLET_PART_" + i10 + "_CANT_DECRYPT");
                    if (mnemonic_decryptedkeypart != null && (bArr2 = mnemonic_decryptedkeypart.share) != null) {
                        Arrays.fill(bArr2, (byte) 0);
                    }
                    Arrays.fill(decrypt_message_for_one, (byte) 0);
                    serializedData.cleanup();
                    if (bArr3 != null) {
                        Arrays.fill(bArr3, (byte) 0);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    mnemonic_decryptedkeypart = null;
                }
            } catch (Throwable th4) {
                th = th4;
                h0Var = null;
            }
        }
        if (bArr3 == null) {
            org.telegram.ui.Wallet.k0.i("getSecretPhrase: no parts???");
            jVar.run(null, "WALLET_NO_PARTS");
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
                return;
            }
            return;
        }
        h0Var = new org.telegram.ui.Wallet.h0(bArr3);
        try {
            Arrays.fill(bArr3, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            TL_wallet.WalletState walletState = k0Var.e;
            byte[] bArr8 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
            if (secretPhraseToPublicKey != null && bArr8 != null && Arrays.equals(secretPhraseToPublicKey, bArr8)) {
                Arrays.fill(bArr3, (byte) 0);
                org.telegram.ui.Wallet.k0.E("getSecretPhrase, received the phrase!");
                jVar.run(h0Var, null);
                return;
            }
            org.telegram.ui.Wallet.k0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr8) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
            h0Var.close();
            jVar.run(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr3, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (h0Var != null) {
                try {
                    h0Var.close();
                } catch (Throwable th6) {
                    if (bArr3 != null) {
                        Arrays.fill(bArr3, (byte) 0);
                    }
                    throw th6;
                }
            }
            jVar.run(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void b() {
        qi.q qVar = (qi.q) this.c;
        qi.k kVar = (qi.k) this.d;
        long j10 = this.b;
        byte[] bArr = (byte[]) this.e;
        if (qVar.m != qi.o.h) {
            return;
        }
        long length = kVar.b.length();
        qVar.a(kVar, length);
        synchronized (qVar.k) {
            if (kVar.d && !kVar.e) {
                kVar.e = true;
                qVar.j.execute(new qi.c(qVar, kVar, length, j10, 2));
                qVar.C = new qi.n(kVar.b, j10, bArr);
                qVar.r(qi.o.n);
                qVar.e.onCompleted(qVar.C);
                qVar.c();
                qVar.s();
                qVar.l("completed");
            }
        }
    }

    private final void c() {
        zh.r3.e0((zh.r3) this.c, this.b, (TL_stars.TL_starGiftUnique) this.d, (yy) this.e);
    }

    private final void d() {
        zh.r3 r3Var = (zh.r3) this.c;
        boolean[] zArr = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        r3Var.getClass();
        zArr[0] = true;
        r3Var.k0.setLoading(false);
        r3Var.w1(this.b, callback);
    }

    private final void f() {
        ((zh.n5) this.d).d0((MessageObject) this.e, ((zh.v3) this.c).a, this.b, true, true, null);
    }

    private final void g() {
        zh.n5 n5Var = (zh.n5) this.c;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
            n5Var.getClass();
            callback.run(null);
        } else {
            TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
            n5Var.M.put(Long.valueOf(this.b), stargiftupgradepreview);
            callback.run(stargiftupgradepreview);
        }
    }

    private final void h() {
        zh.n5 n5Var = (zh.n5) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        if (n5Var.e) {
            n5Var.H(starGift, this.b, null, true, callback);
        } else {
            zh.n5.e("NO_BALANCE");
            callback.run(null);
        }
    }

    private final void i() {
        fo foVar = (fo) this.c;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
        CharSequence charSequence = (CharSequence) this.e;
        zc a02 = zc.a0(foVar);
        TLRPC.Document document = starGift.sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) this.b, new Object[0]));
        }
        a02.s(document, string, charSequence).k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x040f A[Catch: all -> 0x03f5, Exception -> 0x03f8, TRY_ENTER, TRY_LEAVE, TryCatch #24 {Exception -> 0x03f8, all -> 0x03f5, blocks: (B:206:0x03ae, B:208:0x03b4, B:174:0x040f, B:177:0x041c), top: B:205:0x03ae }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041c A[Catch: all -> 0x03f5, Exception -> 0x03f8, TRY_ENTER, TRY_LEAVE, TryCatch #24 {Exception -> 0x03f8, all -> 0x03f5, blocks: (B:206:0x03ae, B:208:0x03b4, B:174:0x040f, B:177:0x041c), top: B:205:0x03ae }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0907  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        Object obj;
        TL_stories.StoryItem storyItem;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        SQLiteCursor sQLiteCursor;
        Runnable runnable;
        ig.b2 b2Var;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor2;
        ig.a2 a2Var;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i11;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        MessageObject messageObject;
        yy yyVar;
        yy yyVar2;
        int i12 = this.a;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i13 = 2;
        int i14 = 0;
        long j10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                x8 x8Var = (x8) obj4;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ArrayList arrayList3 = x8Var.h;
                ArrayList arrayList4 = x8Var.g;
                int i15 = x8Var.a;
                FileLog.d("StoriesController update stories for dialog " + j10);
                x8Var.n0(j10, Collections.singletonList(tL_updateStory.story), false);
                x8Var.l0(j10, Collections.singletonList(tL_updateStory.story), true);
                a0.h hVar = x8Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) hVar.f(j10);
                ArrayList arrayList5 = new ArrayList();
                int i16 = x8Var.u;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i15).processDeleteStory(j10, storyItem2.id);
                    }
                    int i17 = 0;
                    while (true) {
                        if (i17 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i17).id != storyItem2.id) {
                            i17++;
                        } else if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i17);
                            org.telegram.messenger.g0.o(storyItem2.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem3 = peerStories.stories.get(i17);
                            storyItem2 = x8.f(storyItem3, storyItem2);
                            arrayList5.add(storyItem2);
                            peerStories.stories.set(i17, storyItem2);
                            if (storyItem2.attachPath == null) {
                                storyItem2.attachPath = storyItem3.attachPath;
                            }
                            if (storyItem2.firstFramePath == null) {
                                storyItem2.firstFramePath = storyItem3.firstFramePath;
                            }
                            org.telegram.messenger.g0.o(storyItem2.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (z11) {
                        z10 = false;
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                            FileLog.d("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (s9.w(i15, storyItem2)) {
                            FileLog.d("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j10 > 0 && (user == null || (!user.self && !x8Var.M(user)))) {
                            FileLog.d("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList5.add(storyItem2);
                        peerStories.stories.add(storyItem2);
                        FileLog.d("StoriesController add new story id=" + storyItem2.id + " total stories count " + peerStories.stories.size());
                        x8Var.W(j10, storyItem2);
                        x8Var.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || x8Var.K(j10)) {
                            Collections.sort(peerStories.stories, x8.X);
                        } else {
                            arrayList4.remove(peerStories);
                            arrayList3.remove(peerStories);
                            hVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            x8Var.u--;
                        }
                    }
                    if (i16 != x8Var.u) {
                        x8Var.l.edit().putInt("total_stores", x8Var.u).apply();
                    }
                    x8Var.v(arrayList4);
                    x8Var.v(arrayList3);
                    if (z10) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            i10 = 0;
                            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyDeleted, Long.valueOf(j10), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i10 = 0;
                        }
                        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                    }
                    MessagesController.getInstance(i15).checkArchiveFolder();
                    return;
                }
                TL_stories.StoryItem storyItem4 = tL_updateStory.story;
                if (storyItem4 instanceof TL_stories.TL_storyItemDeleted) {
                    FileLog.d("StoriesController can't add user " + j10 + " with new story DELETED");
                    return;
                }
                if (s9.w(i15, storyItem4)) {
                    FileLog.d("StoriesController can't add user " + j10 + " with new story isExpired");
                    return;
                }
                if (j10 > 0 && (user == null || (!user.self && !x8Var.M(user)))) {
                    FileLog.d("StoriesController can't add user cause is not contact");
                    return;
                }
                TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory.peer;
                tL_peerStories.stories.add(tL_updateStory.story);
                org.telegram.messenger.g0.o(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                x8Var.b0(peerDialogId, tL_peerStories);
                if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                    TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                    x8Var.g(tL_peerStories);
                    if (user2 != null && !user2.stories_hidden) {
                        x8Var.X(tL_peerStories);
                    }
                }
                FileLog.d("StoriesController applyNewStories " + peerDialogId);
                x8Var.n0(peerDialogId, tL_peerStories.stories, false);
                x8Var.u = x8Var.u + 1;
                x8Var.O(j10);
                z10 = true;
                if (i16 != x8Var.u) {
                }
                x8Var.v(arrayList4);
                x8Var.v(arrayList3);
                if (z10) {
                }
                MessagesController.getInstance(i15).checkArchiveFolder();
                return;
            case 1:
                TLObject tLObject = (TLObject) obj3;
                wa0 wa0Var = (wa0) obj2;
                x8 x8Var2 = ((c8) obj4).c;
                int i18 = x8Var2.a;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i18).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i18).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i19 = 0; i19 < peerStories2.stories.size(); i19++) {
                            if ((peerStories2.stories.get(i19).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i19) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar2 = x8Var2.E;
                                obj = (TL_stories.StoryItem) peerStories2.stories.get(i19);
                                hVar2.k(obj, j10);
                                wa0Var.run(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                wa0Var.run(obj);
                return;
            case 2:
                TLObject tLObject2 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                x8 x8Var3 = ((d8) obj4).c;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(x8Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(x8Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar3 = x8Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        hVar3.k(storyItem, j10);
                        callback.run(storyItem);
                        return;
                    }
                }
                storyItem = null;
                callback.run(storyItem);
                return;
            case 3:
                long j11 = this.b;
                AndroidUtilities.runOnUIThread(new a3.i0((r9) obj4, (View) obj3, j11, 6), 500L);
                ((m9) obj2).f(j11);
                return;
            case 4:
                di.x9 x9Var = (di.x9) obj4;
                boolean isChannel = ChatObject.isChannel((TLRPC.Chat) obj3);
                long j12 = this.b;
                TLRPC.ChatFull loadChatInfoInQueue = ((MessagesStorage) obj2).loadChatInfoInQueue(j12, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new di.n9(x9Var, isChannel, j12, 0));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new a3.i0(x9Var, j12, loadChatInfoInQueue, 7));
                    return;
                }
            case 5:
                ig.b2 b2Var2 = (ig.b2) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor queryFinalized = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                ig.a2 a2Var2 = new ig.a2();
                                a2Var2.a = queryFinalized.intValue(i14);
                                a2Var2.b = queryFinalized.stringValue(1);
                                a2Var2.c = queryFinalized.intValue(2);
                                a2Var2.f = queryFinalized.intValue(3);
                                arrayList6.add(a2Var2);
                                i14 = i14;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Exception e) {
                            e = e;
                            runnable = runnable2;
                            b2Var = b2Var2;
                            arrayList2 = arrayList6;
                        }
                    }
                    int i20 = i14;
                    queryFinalized.dispose();
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    ArrayList arrayList10 = new ArrayList();
                    runnable = runnable2;
                    int i21 = i20;
                    while (i21 < arrayList6.size()) {
                        try {
                            try {
                                a2Var = (ig.a2) arrayList6.get(i21);
                                arrayList2 = arrayList6;
                            } catch (Exception e7) {
                                e = e7;
                                b2Var = b2Var2;
                                arrayList2 = arrayList6;
                            }
                            try {
                                sQLiteCursor2 = queryFinalized;
                                try {
                                    try {
                                        Object[] objArr = new Object[1];
                                        objArr[i20] = Integer.valueOf(a2Var.a);
                                        queryFinalized = database.queryFinalized(str2, objArr);
                                        try {
                                            if (queryFinalized.next()) {
                                                sQLiteDatabase = database;
                                                boolean z13 = i20;
                                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(z13 ? 1 : 0);
                                                if (byteBufferValue != null) {
                                                    str = str2;
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z13), z13);
                                                    i11 = i21;
                                                    TLdeserialize.send_state = queryFinalized.intValue(1);
                                                    TLdeserialize.readAttachPath(byteBufferValue, j10);
                                                    byteBufferValue.reuse();
                                                    TLdeserialize.id = queryFinalized.intValue(2);
                                                    TLdeserialize.date = queryFinalized.intValue(3);
                                                    TLdeserialize.flags |= TLObject.FLAG_30;
                                                    TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                                                    TLdeserialize.ttl = queryFinalized.intValue(5);
                                                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList9, arrayList10, null);
                                                    b2Var = b2Var2;
                                                    try {
                                                        MessageObject messageObject2 = new MessageObject(b2Var2.a, TLdeserialize, false, true);
                                                        a2Var.e = messageObject2;
                                                        a2Var.d = TLdeserialize.id;
                                                        messageObject2.generateThumbs(false);
                                                        a2Var.e.applyQuickReply(a2Var.b, a2Var.a);
                                                        queryFinalized.dispose();
                                                        i21 = i11 + 1;
                                                        arrayList6 = arrayList2;
                                                        database = sQLiteDatabase;
                                                        str2 = str;
                                                        b2Var2 = b2Var;
                                                        i20 = 0;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        sQLiteCursor = queryFinalized;
                                                        try {
                                                            FileLog.e(e);
                                                            if (sQLiteCursor != null) {
                                                                sQLiteCursor.dispose();
                                                            }
                                                            AndroidUtilities.runOnUIThread(new c3(b2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                                            return;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            } else {
                                                sQLiteDatabase = database;
                                            }
                                            b2Var = b2Var2;
                                            str = str2;
                                            i11 = i21;
                                            queryFinalized.dispose();
                                            i21 = i11 + 1;
                                            arrayList6 = arrayList2;
                                            database = sQLiteDatabase;
                                            str2 = str;
                                            b2Var2 = b2Var;
                                            i20 = 0;
                                        } catch (Exception e11) {
                                            e = e11;
                                            b2Var = b2Var2;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        b2Var = b2Var2;
                                        sQLiteCursor = sQLiteCursor2;
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                        }
                                        AndroidUtilities.runOnUIThread(new c3(b2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor = sQLiteCursor2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                b2Var = b2Var2;
                                sQLiteCursor2 = queryFinalized;
                                sQLiteCursor = sQLiteCursor2;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                }
                                AndroidUtilities.runOnUIThread(new c3(b2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                                return;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor2 = queryFinalized;
                        }
                    }
                    b2Var = b2Var2;
                    arrayList2 = arrayList6;
                    sQLiteCursor2 = queryFinalized;
                    try {
                        if (!arrayList10.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList9, arrayList7);
                        }
                        sQLiteCursor2.dispose();
                    } catch (Exception e14) {
                        e = e14;
                        sQLiteCursor = sQLiteCursor2;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                        }
                        AndroidUtilities.runOnUIThread(new c3(b2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    runnable = runnable2;
                    b2Var = b2Var2;
                    arrayList2 = arrayList6;
                    sQLiteCursor = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new c3(b2Var, arrayList7, arrayList8, arrayList2, runnable, 7));
                return;
            case 6:
                ig.b2 b2Var3 = (ig.b2) obj4;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj3;
                ig.a2 a2Var3 = (ig.a2) obj2;
                try {
                    ArrayList<Long> arrayList11 = new ArrayList<>();
                    ArrayList arrayList12 = new ArrayList();
                    SQLiteCursor queryFinalized2 = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(a2Var3.a));
                    try {
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor4 = queryFinalized2;
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor4 = queryFinalized2;
                    }
                    try {
                        if (queryFinalized2.next()) {
                            try {
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.send_state = queryFinalized2.intValue(1);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j10);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.id = queryFinalized2.intValue(2);
                                    TLdeserialize2.date = queryFinalized2.intValue(3);
                                    TLdeserialize2.flags |= TLObject.FLAG_30;
                                    TLdeserialize2.quick_reply_shortcut_id = queryFinalized2.intValue(4);
                                    TLdeserialize2.ttl = queryFinalized2.intValue(5);
                                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList11, arrayList12, null);
                                    messageObject = new MessageObject(b2Var3.a, TLdeserialize2, false, true);
                                    queryFinalized2.dispose();
                                    ArrayList<TLRPC.User> arrayList13 = new ArrayList<>();
                                    ArrayList<TLRPC.Chat> arrayList14 = new ArrayList<>();
                                    if (!arrayList12.isEmpty()) {
                                        messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList12), arrayList14);
                                    }
                                    if (!arrayList11.isEmpty()) {
                                        messagesStorage2.getUsersInternal(arrayList11, arrayList13);
                                    }
                                    sQLiteCursor4 = queryFinalized2;
                                    AndroidUtilities.runOnUIThread(new c3(b2Var3, arrayList13, arrayList14, a2Var3, messageObject, 8));
                                    sQLiteCursor4.dispose();
                                    return;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                sQLiteCursor3 = queryFinalized2;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor3 == null) {
                                        sQLiteCursor3.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (sQLiteCursor3 != null) {
                                        sQLiteCursor3.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor3 = queryFinalized2;
                                if (sQLiteCursor3 != null) {
                                }
                                throw th;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new c3(b2Var3, arrayList13, arrayList14, a2Var3, messageObject, 8));
                        sQLiteCursor4.dispose();
                        return;
                    } catch (Exception e18) {
                        e = e18;
                        sQLiteCursor3 = sQLiteCursor4;
                        FileLog.e(e);
                        if (sQLiteCursor3 == null) {
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteCursor3 = sQLiteCursor4;
                        if (sQLiteCursor3 != null) {
                        }
                        throw th;
                    }
                    messageObject = null;
                    queryFinalized2.dispose();
                    ArrayList<TLRPC.User> arrayList132 = new ArrayList<>();
                    ArrayList<TLRPC.Chat> arrayList142 = new ArrayList<>();
                    if (!arrayList12.isEmpty()) {
                    }
                    if (!arrayList11.isEmpty()) {
                    }
                    sQLiteCursor4 = queryFinalized2;
                } catch (Exception e19) {
                    e = e19;
                    sQLiteCursor3 = null;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteCursor3 = null;
                }
            case 7:
                ((CameraController) obj4).lambda$finishRecordingVideo$15((File) obj3, (Bitmap) obj2, j10);
                return;
            case 8:
                vi viVar = (vi) obj4;
                fo foVar = (fo) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                Context context = viVar.getContext();
                int i22 = viVar.M1;
                MessageSuggestionParams messageSuggestionParams = foVar.g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new zh.d0(context, i22, this.b, messageSuggestionParams, foVar, c6Var, 0, new uc(17, viVar, foVar)).show();
                return;
            case 9:
                y31 y31Var = (y31) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                ((l80) obj3).u();
                TLRPC.User user3 = MessagesController.getInstance(y31Var.b).getUser(Long.valueOf(j10));
                if (user3 != null) {
                    fo foVar2 = y31Var.h;
                    org.telegram.ui.Components.g5.q(foVar2, -1, user3, chat, true, new p1(y31Var, j10, 6), foVar2.getResourceProvider());
                    return;
                }
                return;
            case 10:
                y31 y31Var2 = (y31) obj4;
                ArrayList arrayList15 = (ArrayList) obj2;
                y31Var2.e0.removeAll((HashSet) obj3);
                y31Var2.o();
                int size = arrayList15.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj5 = arrayList15.get(i23);
                    i23++;
                    long intValue = ((Integer) obj5).intValue();
                    if (j10 == intValue) {
                        y31Var2.m(intValue, false);
                        return;
                    }
                }
                return;
            case 11:
                yy yyVar3 = (yy) obj4;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj2;
                int i24 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter != null && yyVar3.e4(dialog)) {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i25 = 0; i25 < size2; i25++) {
                        i24 = Math.min(i24, dialogFilter.pinnedDialogs.valueAt(i25));
                    }
                    i24 -= yyVar3.O2;
                }
                int i26 = i24;
                long j13 = this.b;
                TLRPC.EncryptedChat l4 = DialogObject.isEncryptedDialog(j13) ? org.telegram.messenger.g0.l(yyVar3.getMessagesController(), j13) : null;
                UndoView W3 = yyVar3.W3();
                if (W3 == null) {
                    return;
                }
                if (yyVar3.e4(dialog)) {
                    yyVar = yyVar3;
                    yyVar.q4(j13, false, dialogFilter, i26, true);
                    W3.k(0L, 79, 1, 1600, null, null);
                } else {
                    yyVar = yyVar3;
                    yyVar.q4(j13, true, dialogFilter, i26, true);
                    W3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (l4 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(l4.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(l4.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j13))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j13));
                        }
                    }
                }
                if (dialogFilter != null) {
                    yy yyVar4 = yyVar;
                    k10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, yyVar4, null);
                    yyVar2 = yyVar4;
                } else {
                    yyVar2 = yyVar;
                }
                yyVar2.getMessagesController().reorderPinnedDialogs(yyVar2.W2, null, 0L);
                yyVar2.R4(true);
                if (yyVar2.e0 != null) {
                    int i27 = 0;
                    while (true) {
                        xy[] xyVarArr = yyVar2.e0;
                        if (i27 < xyVarArr.length) {
                            xyVarArr[i27].d.H = false;
                            i27++;
                        }
                    }
                }
                yyVar2.e5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 12:
                n60 n60Var = (n60) obj4;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj3;
                TLRPC.User user4 = (TLRPC.User) obj2;
                ChatObject.Call call = n60Var.a1;
                if (call == null || n60Var.s0) {
                    return;
                }
                call.addInvitedUser(j10);
                n60Var.P0(true);
                e40 e40Var = n60Var.E1;
                if (e40Var != null) {
                    e40Var.dismiss();
                }
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                n60Var.l1().k(0L, 34, user4, n60Var.Z0, null, null);
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                br brVar = (br) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (!(tLObject3 instanceof TL_stories.TL_stories_peerStories)) {
                    brVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories2 = (TL_stories.TL_stories_peerStories) tLObject3;
                messagesController.putUsers(tL_stories_peerStories2.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories2.stories);
                brVar.run();
                return;
            case 14:
                cb0 cb0Var = (cb0) obj4;
                LaunchActivity launchActivity = cb0Var.g;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                if (((String) obj3) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j14 = this.b;
                    long j15 = -j14;
                    if (messagesController2.getGroupCall(j15, false) != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j15));
                        accountInstance.getMessagesController().getInputPeer(j14);
                        org.telegram.ui.Components.voip.d2.l(chat2, null, false, Boolean.valueOf(!r2.call.rtmp_stream), launchActivity, m2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j15);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j15, true, new bb0(cb0Var, accountInstance, j14, m2Var, 0));
                            return;
                        } else {
                            if (m2Var.getParentActivity() != null) {
                                org.telegram.messenger.g0.q(R.string.InviteExpired, zc.a0(m2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Drawable[] drawableArr = PhotoViewer.U8;
                long j16 = this.b;
                i iVar = new i(photoViewer, (String) obj3, photoEntry, j16, 5);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new rr0(i13, iVar, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.B2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                if (bitmap == null) {
                    iVar.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j16, null, true));
                    return;
                } else {
                    iVar.run(bitmap);
                    return;
                }
            case 16:
                a();
                return;
            case 17:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str3 = (String) obj2;
                if (callback2 == null) {
                    p0Var.getClass();
                    return;
                }
                if (j10 != p0Var.l()) {
                    str3 = "STORAGE_CANCELED";
                }
                callback2.run(str3);
                return;
            case 18:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj3;
                try {
                    ((Utilities.Callback) obj2).run(j10 == ((org.telegram.ui.Wallet.p0) obj4).l() ? h0Var : null);
                    if (h0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 19:
                b();
                return;
            case 20:
                zh.r3 r3Var = (zh.r3) obj4;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                if (((zh.n5) obj3).e) {
                    r3Var.w1(j10, callback3);
                    return;
                }
                sc Q = r3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 21:
                c();
                return;
            case 22:
                d();
                return;
            case 23:
                f();
                return;
            case 24:
                g();
                return;
            case 25:
                h();
                return;
            case 26:
                i();
                return;
            default:
                ((zh.n5) obj4).h0((LaunchActivity) obj3, j10, (String) obj2);
                return;
        }
    }

    public /* synthetic */ b8(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ b8(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }
}
