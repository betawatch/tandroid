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
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.ia0;
import org.telegram.ui.ja0;
import org.telegram.ui.nq;
import org.telegram.ui.o00;
import org.telegram.ui.r80;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.yl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y2(ca caVar, Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = caVar;
        this.b = obj;
        this.c = j10;
        this.e = obj2;
    }

    private final void a() {
        v50 v50Var = (v50) this.b;
        org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        ChatObject.Call call = v50Var.a1;
        if (call == null || v50Var.s0) {
            return;
        }
        call.addInvitedUser(this.c);
        v50Var.O0(true);
        c40 c40Var = v50Var.E1;
        if (c40Var != null) {
            c40Var.dismiss();
        }
        try {
            e2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        e2VarArr[0] = null;
        v50Var.k1().k(0L, 34, user, v50Var.Z0, null, null);
    }

    private final void b() {
        ja0 ja0Var = (ja0) this.b;
        LaunchActivity launchActivity = ja0Var.g;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.e;
        if (str != null) {
            AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
            MessagesController messagesController = accountInstance.getMessagesController();
            long j10 = this.c;
            long j11 = -j10;
            if (messagesController.getGroupCall(j11, false) != null) {
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf(!r0.call.rtmp_stream), launchActivity, r2Var, accountInstance);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j11);
            if (chatFull != null) {
                if (chatFull.call != null) {
                    accountInstance.getMessagesController().getGroupCall(j11, true, new ia0(ja0Var, accountInstance, j10, r2Var, 0));
                } else if (r2Var.getParentActivity() != null) {
                    org.telegram.messenger.t.q(R.string.InviteExpired, org.telegram.ui.Components.wc.b0(r2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.e;
        Drawable[] drawableArr = PhotoViewer.U8;
        long j10 = this.c;
        t2 t2Var = new t2(photoViewer, str, photoEntry, j10, 6);
        if (photoViewer.D2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new yl0(9, t2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.B2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
        if (bitmap == null) {
            t2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j10, null, true));
        } else {
            t2Var.run(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.i0 i0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.c;
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
                                        org.telegram.ui.Wallet.l0.i("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
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
                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: couldn't decrypt " + i10 + " part");
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
                i0Var = null;
            }
        }
        if (bArr3 == null) {
            org.telegram.ui.Wallet.l0.i("getSecretPhrase: no parts???");
            jVar.run(null, "WALLET_NO_PARTS");
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
                return;
            }
            return;
        }
        i0Var = new org.telegram.ui.Wallet.i0(bArr3);
        try {
            Arrays.fill(bArr3, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(i0Var);
            TL_wallet.WalletState walletState = l0Var.e;
            byte[] bArr8 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
            if (secretPhraseToPublicKey != null && bArr8 != null && Arrays.equals(secretPhraseToPublicKey, bArr8)) {
                Arrays.fill(bArr3, (byte) 0);
                org.telegram.ui.Wallet.l0.F("getSecretPhrase, received the phrase!");
                jVar.run(i0Var, null);
                return;
            }
            org.telegram.ui.Wallet.l0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr8) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
            i0Var.close();
            jVar.run(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr3, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (i0Var != null) {
                try {
                    i0Var.close();
                } catch (Throwable th6) {
                    if (bArr3 != null) {
                        Arrays.fill(bArr3, (byte) 0);
                    }
                    throw th6;
                }
            }
            jVar.run(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        String str = (String) this.d;
        if (callback == null) {
            p0Var.getClass();
            return;
        }
        if (this.c != p0Var.l()) {
            str = "STORAGE_CANCELED";
        }
        callback.run(str);
    }

    private final void g() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.d;
        try {
            ((Utilities.Callback) this.e).run(this.c == p0Var.l() ? i0Var : null);
        } finally {
            if (i0Var != null) {
                i0Var.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0475, code lost:
    
        if (r13 != null) goto L160;
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0392: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:915), block:B:193:0x0392 */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07df  */
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
        jg.c2 c2Var;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor4;
        MessageObject messageObject;
        NativeByteBuffer byteBufferValue2;
        boolean z13 = false;
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.b;
                ca caVar = (ca) this.d;
                long j10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                if (caVar.e) {
                    h7Var.P1(j10, callback);
                    return;
                }
                org.telegram.ui.Components.qc R = h7Var.getBulletinFactory().R(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                R.u = true;
                R.j();
                return;
            case 1:
                h7.X((h7) this.b, this.c, (TL_stars.TL_starGiftUnique) this.d, (cy) this.e);
                return;
            case 2:
                h7 h7Var2 = (h7) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j11 = this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                h7Var2.getClass();
                zArr[0] = true;
                h7Var2.k0.setLoading(false);
                h7Var2.P1(j11, callback2);
                return;
            case 3:
                ((ca) this.d).d0((MessageObject) this.e, ((m7) this.b).a, this.c, true, true, null);
                return;
            case 4:
                ca caVar2 = (ca) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j12 = this.c;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    caVar2.getClass();
                    callback3.run(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    caVar2.M.put(Long.valueOf(j12), stargiftupgradepreview);
                    callback3.run(stargiftupgradepreview);
                    return;
                }
            case 5:
                ca caVar3 = (ca) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                long j13 = this.c;
                if (caVar3.e) {
                    caVar3.H(starGift, j13, null, true, callback4);
                    return;
                } else {
                    ca.e("NO_BALANCE");
                    callback4.run(null);
                    return;
                }
            case 6:
                un unVar = (un) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j14 = this.c;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                TLRPC.Document document = starGift2.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j14, new Object[0]));
                }
                b02.s(document, string, charSequence).k(true);
                return;
            case 7:
                ((ca) this.d).h0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 8:
                di.h7 h7Var3 = (di.h7) this.b;
                long j15 = this.c;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList3 = h7Var3.h;
                ArrayList arrayList4 = h7Var3.g;
                int i11 = h7Var3.a;
                FileLog.d("StoriesController update stories for dialog " + j15);
                h7Var3.n0(j15, Collections.singletonList(tL_updateStory.story), false);
                h7Var3.l0(j15, Collections.singletonList(tL_updateStory.story), true);
                a0.h hVar = h7Var3.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) hVar.f(j15);
                ArrayList arrayList5 = new ArrayList();
                int i12 = h7Var3.u;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i11).processDeleteStory(j15, storyItem2.id);
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i13).id != storyItem2.id) {
                            i13++;
                        } else if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i13);
                            org.telegram.messenger.t.o(storyItem2.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem3 = peerStories.stories.get(i13);
                            storyItem2 = di.h7.f(storyItem3, storyItem2);
                            arrayList5.add(storyItem2);
                            peerStories.stories.set(i13, storyItem2);
                            if (storyItem2.attachPath == null) {
                                storyItem2.attachPath = storyItem3.attachPath;
                            }
                            if (storyItem2.firstFramePath == null) {
                                storyItem2.firstFramePath = storyItem3.firstFramePath;
                            }
                            org.telegram.messenger.t.o(storyItem2.id, new StringBuilder("StoriesController update story id="));
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
                        if (di.a8.w(i11, storyItem2)) {
                            FileLog.d("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j15 > 0 && (user == null || (!user.self && !h7Var3.M(user)))) {
                            FileLog.d("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList5.add(storyItem2);
                        peerStories.stories.add(storyItem2);
                        FileLog.d("StoriesController add new story id=" + storyItem2.id + " total stories count " + peerStories.stories.size());
                        h7Var3.W(j15, storyItem2);
                        h7Var3.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || h7Var3.K(j15)) {
                            Collections.sort(peerStories.stories, di.h7.X);
                        } else {
                            arrayList4.remove(peerStories);
                            arrayList3.remove(peerStories);
                            hVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            h7Var3.u--;
                        }
                    }
                    if (i12 != h7Var3.u) {
                        h7Var3.l.edit().putInt("total_stores", h7Var3.u).apply();
                    }
                    h7Var3.v(arrayList4);
                    h7Var3.v(arrayList3);
                    if (z10) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            i10 = 0;
                            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyDeleted, Long.valueOf(j15), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i10 = 0;
                        }
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                    }
                    MessagesController.getInstance(i11).checkArchiveFolder();
                    return;
                }
                TL_stories.StoryItem storyItem4 = tL_updateStory.story;
                if (storyItem4 instanceof TL_stories.TL_storyItemDeleted) {
                    FileLog.d("StoriesController can't add user " + j15 + " with new story DELETED");
                    return;
                }
                if (di.a8.w(i11, storyItem4)) {
                    FileLog.d("StoriesController can't add user " + j15 + " with new story isExpired");
                    return;
                }
                if (j15 > 0 && (user == null || (!user.self && !h7Var3.M(user)))) {
                    FileLog.d("StoriesController can't add user cause is not contact");
                    return;
                }
                TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory.peer;
                tL_peerStories.stories.add(tL_updateStory.story);
                org.telegram.messenger.t.o(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                h7Var3.b0(peerDialogId, tL_peerStories);
                if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                    h7Var3.g(tL_peerStories);
                    if (user2 != null && !user2.stories_hidden) {
                        h7Var3.X(tL_peerStories);
                    }
                }
                FileLog.d("StoriesController applyNewStories " + peerDialogId);
                h7Var3.n0(peerDialogId, tL_peerStories.stories, false);
                h7Var3.u = h7Var3.u + 1;
                h7Var3.O(j15);
                z10 = true;
                if (i12 != h7Var3.u) {
                }
                h7Var3.v(arrayList4);
                h7Var3.v(arrayList3);
                if (z10) {
                }
                MessagesController.getInstance(i11).checkArchiveFolder();
                return;
            case 9:
                di.p6 p6Var = (di.p6) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j16 = this.c;
                r80 r80Var = (r80) this.e;
                di.h7 h7Var4 = p6Var.c;
                int i14 = h7Var4.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i14).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i15 = 0; i15 < peerStories2.stories.size(); i15++) {
                            if ((peerStories2.stories.get(i15).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i15) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar2 = h7Var4.E;
                                obj = (TL_stories.StoryItem) peerStories2.stories.get(i15);
                                hVar2.k(obj, j16);
                                r80Var.run(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                r80Var.run(obj);
                return;
            case 10:
                di.q6 q6Var = (di.q6) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j17 = this.c;
                Utilities.Callback callback5 = (Utilities.Callback) this.e;
                di.h7 h7Var5 = q6Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(h7Var5.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(h7Var5.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar3 = h7Var5.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        hVar3.k(storyItem, j17);
                        callback5.run(storyItem);
                        return;
                    }
                }
                storyItem = null;
                callback5.run(storyItem);
                return;
            case 11:
                di.z7 z7Var = (di.z7) this.b;
                View view = (View) this.d;
                long j18 = this.c;
                di.w7 w7Var = (di.w7) this.e;
                AndroidUtilities.runOnUIThread(new a3.i0(z7Var, view, j18, 9), 500L);
                w7Var.f(j18);
                return;
            case 12:
                fi.g9 g9Var = (fi.g9) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                long j19 = this.c;
                boolean isChannel = ChatObject.isChannel(chat);
                TLRPC.ChatFull loadChatInfoInQueue = messagesStorage.loadChatInfoInQueue(j19, isChannel, true, true, 0);
                if (loadChatInfoInQueue == null || (chatParticipants = loadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < loadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new kd(g9Var, isChannel, j19, 1));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new a3.i0(g9Var, j19, loadChatInfoInQueue, 10));
                    return;
                }
            case 13:
                jg.c2 c2Var2 = (jg.c2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.d;
                long j20 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        sQLiteCursor2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            try {
                                jg.b2 b2Var = new jg.b2();
                                b2Var.a = sQLiteCursor2.intValue(0);
                                b2Var.b = sQLiteCursor2.stringValue(1);
                                b2Var.c = sQLiteCursor2.intValue(2);
                                b2Var.f = sQLiteCursor2.intValue(3);
                                arrayList6.add(b2Var);
                            } catch (Exception e) {
                                e = e;
                                c2Var = c2Var2;
                                arrayList2 = arrayList6;
                            }
                        }
                        sQLiteCursor2.dispose();
                        ArrayList<Long> arrayList9 = new ArrayList<>();
                        ArrayList arrayList10 = new ArrayList();
                        int i16 = 0;
                        while (i16 < arrayList6.size()) {
                            jg.b2 b2Var2 = (jg.b2) arrayList6.get(i16);
                            boolean z14 = z13;
                            int i17 = i16;
                            arrayList2 = arrayList6;
                            try {
                                Object[] objArr = new Object[1];
                                objArr[z14 ? 1 : 0] = Integer.valueOf(b2Var2.a);
                                sQLiteCursor2 = database.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                                if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(z14 ? 1 : 0)) != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z14), z14);
                                    TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                    TLdeserialize.readAttachPath(byteBufferValue, j20);
                                    byteBufferValue.reuse();
                                    TLdeserialize.id = sQLiteCursor2.intValue(2);
                                    TLdeserialize.date = sQLiteCursor2.intValue(3);
                                    TLdeserialize.flags |= TLObject.FLAG_30;
                                    TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                    TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList9, arrayList10, null);
                                    c2Var = c2Var2;
                                    try {
                                        MessageObject messageObject2 = new MessageObject(c2Var2.a, TLdeserialize, false, true);
                                        b2Var2.e = messageObject2;
                                        b2Var2.d = TLdeserialize.id;
                                        messageObject2.generateThumbs(false);
                                        b2Var2.e.applyQuickReply(b2Var2.b, b2Var2.a);
                                    } catch (Exception e10) {
                                        e = e10;
                                        FileLog.e(e);
                                        break;
                                    }
                                } else {
                                    c2Var = c2Var2;
                                }
                                sQLiteCursor2.dispose();
                                i16 = i17 + 1;
                                arrayList6 = arrayList2;
                                c2Var2 = c2Var;
                                z13 = false;
                            } catch (Exception e11) {
                                e = e11;
                                c2Var = c2Var2;
                                FileLog.e(e);
                            }
                        }
                        c2Var = c2Var2;
                        arrayList2 = arrayList6;
                        if (!arrayList10.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList9, arrayList7);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursor3;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    c2Var = c2Var2;
                    arrayList2 = arrayList6;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new u0(c2Var, arrayList7, arrayList8, arrayList2, runnable, 15));
                return;
            case 14:
                jg.c2 c2Var3 = (jg.c2) this.b;
                MessagesStorage messagesStorage3 = (MessagesStorage) this.d;
                jg.b2 b2Var3 = (jg.b2) this.e;
                long j21 = this.c;
                try {
                    ArrayList<Long> arrayList11 = new ArrayList<>();
                    ArrayList arrayList12 = new ArrayList();
                    SQLiteCursor queryFinalized = messagesStorage3.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(b2Var3.a));
                    try {
                        if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                            TLdeserialize2.send_state = queryFinalized.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue2, j21);
                            byteBufferValue2.reuse();
                            TLdeserialize2.id = queryFinalized.intValue(2);
                            TLdeserialize2.date = queryFinalized.intValue(3);
                            TLdeserialize2.flags |= TLObject.FLAG_30;
                            TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                            TLdeserialize2.ttl = queryFinalized.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList11, arrayList12, null);
                            messageObject = new MessageObject(c2Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized.dispose();
                        ArrayList<TLRPC.User> arrayList13 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList14 = new ArrayList<>();
                        if (!arrayList12.isEmpty()) {
                            messagesStorage3.getChatsInternal(TextUtils.join(",", arrayList12), arrayList14);
                        }
                        if (!arrayList11.isEmpty()) {
                            messagesStorage3.getUsersInternal(arrayList11, arrayList13);
                        }
                        AndroidUtilities.runOnUIThread(new u0(c2Var3, arrayList13, arrayList14, b2Var3, messageObject, 16));
                        queryFinalized.dispose();
                        return;
                    } catch (Exception e13) {
                        e = e13;
                        sQLiteCursor4 = queryFinalized;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor4 = queryFinalized;
                        if (sQLiteCursor4 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor4 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor4 = null;
                }
                break;
            case 15:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 16:
                ti tiVar = (ti) this.b;
                long j22 = this.c;
                un unVar2 = (un) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                Context context = tiVar.getContext();
                int i18 = tiVar.M1;
                MessageSuggestionParams messageSuggestionParams = unVar2.s5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new g1(context, i18, j22, messageSuggestionParams, unVar2, u6Var, 0, new li.s2(25, tiVar, unVar2)).show();
                return;
            case 17:
                e41 e41Var = (e41) this.b;
                k80 k80Var = (k80) this.d;
                long j23 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                k80Var.u();
                TLRPC.User user3 = MessagesController.getInstance(e41Var.b).getUser(Long.valueOf(j23));
                if (user3 != null) {
                    un unVar3 = e41Var.h;
                    org.telegram.ui.Components.g5.q(unVar3, -1, user3, chat2, true, new di.d1(e41Var, j23, 6), unVar3.getResourceProvider());
                    return;
                }
                return;
            case 18:
                e41 e41Var2 = (e41) this.b;
                HashSet hashSet = (HashSet) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                long j24 = this.c;
                e41Var2.h0.removeAll(hashSet);
                e41Var2.p();
                int size = arrayList15.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj2 = arrayList15.get(i19);
                    i19++;
                    long intValue = ((Integer) obj2).intValue();
                    if (j24 == intValue) {
                        e41Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 19:
                cy cyVar = (cy) this.b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j25 = this.c;
                int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter != null && cyVar.o4(dialog)) {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        i20 = Math.min(i20, dialogFilter.pinnedDialogs.valueAt(i21));
                    }
                    i20 -= cyVar.O2;
                }
                int i22 = i20;
                TLRPC.EncryptedChat m10 = DialogObject.isEncryptedDialog(j25) ? org.telegram.messenger.t.m(cyVar.getMessagesController(), j25) : null;
                UndoView g42 = cyVar.g4();
                if (g42 == null) {
                    return;
                }
                if (cyVar.o4(dialog)) {
                    cyVar.A4(j25, false, dialogFilter, i22, true);
                    g42.k(0L, 79, 1, 1600, null, null);
                } else {
                    cyVar.A4(j25, true, dialogFilter, i22, true);
                    g42.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (m10 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(m10.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(m10.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j25))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j25));
                        }
                    }
                }
                if (dialogFilter != null) {
                    o00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, cyVar, null);
                    cyVar = cyVar;
                }
                cyVar.getMessagesController().reorderPinnedDialogs(cyVar.W2, null, 0L);
                cyVar.b5(true);
                if (cyVar.e0 != null) {
                    int i23 = 0;
                    while (true) {
                        ay[] ayVarArr = cyVar.e0;
                        if (i23 < ayVarArr.length) {
                            ayVarArr[i23].d.H = false;
                            i23++;
                        }
                    }
                }
                cyVar.q5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 20:
                a();
                return;
            case 21:
                TLObject tLObject4 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.d;
                long j26 = this.c;
                nq nqVar = (nq) this.e;
                Pattern pattern = LaunchActivity.D1;
                if (!(tLObject4 instanceof TL_stories.TL_stories_peerStories)) {
                    nqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories2 = (TL_stories.TL_stories_peerStories) tLObject4;
                messagesController.putUsers(tL_stories_peerStories2.users, false);
                messagesController.getStoriesController().a0(j26, tL_stories_peerStories2.stories);
                nqVar.run();
                return;
            case 22:
                b();
                return;
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                f();
                return;
            case 26:
                g();
                return;
            default:
                ui.o oVar = (ui.o) this.b;
                ui.i iVar = (ui.i) this.d;
                long j27 = this.c;
                byte[] bArr = (byte[]) this.e;
                if (oVar.n != ui.m.h) {
                    return;
                }
                long length = iVar.b.length();
                oVar.a(iVar, length);
                synchronized (oVar.l) {
                    if (iVar.d && !iVar.e) {
                        iVar.e = true;
                        oVar.k.execute(new ui.c(oVar, iVar, length, j27, 2));
                        oVar.D = new ui.l(iVar.b, j27, bArr);
                        oVar.r(ui.m.n);
                        oVar.f.onCompleted(oVar.D);
                        oVar.c();
                        oVar.s();
                        oVar.l("completed");
                    }
                }
                return;
        }
    }

    public /* synthetic */ y2(ca caVar, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.a = 5;
        this.d = caVar;
        this.e = callback;
        this.b = starGift;
        this.c = j10;
    }

    public /* synthetic */ y2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ y2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
        this.e = obj3;
    }

    public /* synthetic */ y2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ y2(org.telegram.ui.Wallet.p0 p0Var, Utilities.Callback callback, long j10, String str) {
        this.a = 25;
        this.b = p0Var;
        this.e = callback;
        this.c = j10;
        this.d = str;
    }
}
