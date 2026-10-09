package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o31(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
    
        java.util.Arrays.fill(r3, (byte) 0);
        r6.cleanup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0217, code lost:
    
        if (r2 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        org.telegram.ui.Wallet.k0.i("getSecretPhrase: couldn't decrypt " + r0 + " part");
        r9.run(null, "WALLET_PART_" + r0 + "_CANT_DECRYPT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0208, code lost:
    
        if (r12 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020a, code lost:
    
        r0 = r12.share;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020c, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020e, code lost:
    
        java.util.Arrays.fill(r0, (byte) 0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ty tyVar;
        org.telegram.ui.ty tyVar2;
        org.telegram.ui.Wallet.h0 h0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        int i10 = this.a;
        long j3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                c41 c41Var = (c41) obj3;
                ArrayList arrayList = (ArrayList) obj;
                c41Var.e0.removeAll((HashSet) obj2);
                c41Var.p();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        c41Var.m(intValue, false);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.ty tyVar3 = (org.telegram.ui.ty) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter != null && tyVar3.d4(dialog)) {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        i12 = Math.min(i12, dialogFilter.pinnedDialogs.valueAt(i13));
                    }
                    i12 -= tyVar3.N2;
                }
                int i14 = i12;
                long j10 = this.b;
                TLRPC.EncryptedChat l4 = DialogObject.isEncryptedDialog(j10) ? org.telegram.messenger.q.l(tyVar3.getMessagesController(), j10) : null;
                UndoView V3 = tyVar3.V3();
                if (V3 == null) {
                    return;
                }
                if (tyVar3.d4(dialog)) {
                    tyVar = tyVar3;
                    tyVar.p4(j10, false, dialogFilter, i14, true);
                    V3.k(0L, 79, 1, 1600, null, null);
                } else {
                    tyVar = tyVar3;
                    tyVar.p4(j10, true, dialogFilter, i14, true);
                    V3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (l4 != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(l4.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(l4.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j10))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j10));
                        }
                    }
                }
                if (dialogFilter != null) {
                    org.telegram.ui.ty tyVar4 = tyVar;
                    org.telegram.ui.f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, tyVar4, null);
                    tyVar2 = tyVar4;
                } else {
                    tyVar2 = tyVar;
                }
                tyVar2.getMessagesController().reorderPinnedDialogs(tyVar2.V2, null, 0L);
                tyVar2.Q4(true);
                if (tyVar2.e0 != null) {
                    int i15 = 0;
                    while (true) {
                        org.telegram.ui.sy[] syVarArr = tyVar2.e0;
                        if (i15 < syVarArr.length) {
                            syVarArr[i15].d.H = false;
                            i15++;
                        }
                    }
                }
                tyVar2.d5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 2:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = g60Var.a1;
                if (call == null || g60Var.s0) {
                    return;
                }
                call.addInvitedUser(j3);
                g60Var.P0(true);
                i40 i40Var = g60Var.E1;
                if (i40Var != null) {
                    i40Var.dismiss();
                }
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                g60Var.l1().k(0L, 34, user, g60Var.Z0, null, null);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.vq vqVar = (org.telegram.ui.vq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    vqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                vqVar.run();
                return;
            case 4:
                org.telegram.ui.ya0 ya0Var = (org.telegram.ui.ya0) obj3;
                LaunchActivity launchActivity = ya0Var.g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf(!r3.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.xa0(ya0Var, accountInstance, j11, n2Var, 0));
                            return;
                        } else {
                            if (n2Var.getParentActivity() != null) {
                                org.telegram.messenger.q.q(R.string.InviteExpired, ad.a0(n2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                long j13 = this.b;
                ai.l lVar = new ai.l(photoViewer, (String) obj2, photoEntry, j13, 8);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.tf0(26, lVar, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.B2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                if (bitmap == null) {
                    lVar.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j13, null, true));
                    return;
                } else {
                    lVar.run(bitmap);
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj3;
                TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) obj2;
                org.telegram.ui.Wallet.i iVar = (org.telegram.ui.Wallet.i) obj;
                byte[] bArr2 = null;
                int i16 = 0;
                while (true) {
                    try {
                        if (i16 < encryptedsecretphrasepartArr.length) {
                            byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i16].data, 0, 32);
                            byte[] bArr3 = encryptedsecretphrasepartArr[i16].data;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, 32, bArr3.length);
                            long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                            byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j3, key_from_public_key), copyOfRange2);
                            ConferenceCall.key_destroy(key_from_public_key);
                            SerializedData serializedData = new SerializedData(decrypt_message_for_one);
                            try {
                                mnemonic_decryptedkeypart = TL_wallet.mnemonic_decryptedKeyPart.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                if (mnemonic_decryptedkeypart == null) {
                                    break;
                                } else {
                                    try {
                                        byte[] bArr4 = mnemonic_decryptedkeypart.share;
                                        if (bArr4 == null) {
                                            break;
                                        } else {
                                            if (bArr2 == null) {
                                                bArr2 = (byte[]) bArr4.clone();
                                            } else if (bArr4.length != bArr2.length) {
                                                org.telegram.ui.Wallet.k0.i("getSecretPhrase: part " + i16 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr2.length);
                                                iVar.run(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                                byte[] bArr5 = mnemonic_decryptedkeypart.share;
                                                if (bArr5 != null) {
                                                    Arrays.fill(bArr5, (byte) 0);
                                                }
                                                Arrays.fill(decrypt_message_for_one, (byte) 0);
                                                serializedData.cleanup();
                                            } else {
                                                for (int i17 = 0; i17 < bArr2.length; i17++) {
                                                    bArr2[i17] = (byte) (bArr2[i17] ^ mnemonic_decryptedkeypart.share[i17]);
                                                }
                                            }
                                            byte[] bArr6 = mnemonic_decryptedkeypart.share;
                                            if (bArr6 != null) {
                                                Arrays.fill(bArr6, (byte) 0);
                                            }
                                            Arrays.fill(decrypt_message_for_one, (byte) 0);
                                            serializedData.cleanup();
                                            i16++;
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
                            } catch (Throwable th3) {
                                th = th3;
                                mnemonic_decryptedkeypart = null;
                            }
                        } else if (bArr2 == null) {
                            org.telegram.ui.Wallet.k0.i("getSecretPhrase: no parts???");
                            iVar.run(null, "WALLET_NO_PARTS");
                            if (bArr2 == null) {
                                return;
                            }
                        } else {
                            h0Var = new org.telegram.ui.Wallet.h0(bArr2);
                            try {
                                Arrays.fill(bArr2, (byte) 0);
                                byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
                                TL_wallet.WalletState walletState = k0Var.e;
                                byte[] bArr7 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
                                if (secretPhraseToPublicKey != null && bArr7 != null && Arrays.equals(secretPhraseToPublicKey, bArr7)) {
                                    Arrays.fill(bArr2, (byte) 0);
                                    org.telegram.ui.Wallet.k0.E("getSecretPhrase, received the phrase!");
                                    iVar.run(h0Var, null);
                                    return;
                                }
                                org.telegram.ui.Wallet.k0.i("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.bytesToHex(bArr7) + " derived=" + Utilities.bytesToHex(secretPhraseToPublicKey));
                                h0Var.close();
                                iVar.run(null, "WALLET_WORDS_DONT_MATCH");
                            } catch (Throwable th4) {
                                th = th4;
                                if (h0Var != null) {
                                    try {
                                        h0Var.close();
                                    } catch (Throwable th5) {
                                        if (bArr2 != null) {
                                            Arrays.fill(bArr2, (byte) 0);
                                        }
                                        throw th5;
                                    }
                                }
                                iVar.run(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
                                org.telegram.ui.Wallet.k0.j("getSecretPhrase: encryption error", th);
                                if (bArr2 != null) {
                                    Arrays.fill(bArr2, (byte) 0);
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        h0Var = null;
                    }
                }
                Arrays.fill(bArr2, (byte) 0);
                return;
            case 7:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                String str = (String) obj;
                if (callback == null) {
                    p0Var.getClass();
                    return;
                }
                if (j3 != p0Var.l()) {
                    str = "STORAGE_CANCELED";
                }
                callback.run(str);
                return;
            case 8:
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj2;
                try {
                    ((Utilities.Callback) obj).run(j3 == ((org.telegram.ui.Wallet.p0) obj3).l() ? h0Var2 : null);
                    if (h0Var2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (h0Var2 != null) {
                        h0Var2.close();
                    }
                }
            case 9:
                yh.s3 s3Var = (yh.s3) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (((yh.m5) obj2).e) {
                    s3Var.w1(j3, callback2);
                    return;
                }
                tc Q = s3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 10:
                yh.s3.e0((yh.s3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.ty) obj);
                return;
            case 11:
                yh.s3 s3Var2 = (yh.s3) obj3;
                s3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                s3Var2.k0.setLoading(false);
                s3Var2.w1(j3, (Utilities.Callback) obj);
                return;
            case 12:
                ((yh.m5) obj2).d0((MessageObject) obj, ((yh.w3) obj3).a, this.b, true, true, null);
                return;
            case 13:
                yh.m5 m5Var = (yh.m5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                if (!(tLObject2 instanceof TL_stars.starGiftUpgradePreview)) {
                    m5Var.getClass();
                    callback3.run(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    m5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback3.run(stargiftupgradepreview);
                    return;
                }
            case 14:
                yh.m5 m5Var2 = (yh.m5) obj3;
                Utilities.Callback callback4 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (m5Var2.e) {
                    m5Var2.H(starGift, this.b, null, true, callback4);
                    return;
                } else {
                    yh.m5.e("NO_BALANCE");
                    callback4.run(null);
                    return;
                }
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                ad a02 = ad.a0((org.telegram.ui.zn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                return;
            default:
                ((yh.m5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                return;
        }
    }

    public /* synthetic */ o31(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ o31(org.telegram.ui.ActionBar.f3 f3Var, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = f3Var;
        this.b = j3;
        this.d = obj;
        this.e = obj2;
    }
}
