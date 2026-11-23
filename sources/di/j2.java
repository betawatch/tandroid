package di;

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
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ke;
import org.telegram.messenger.kj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.os;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w10;
import org.telegram.messenger.xs;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ax;
import org.telegram.ui.bd0;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.jz;
import org.telegram.ui.o80;
import org.telegram.ui.p80;
import org.telegram.ui.up;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2(y8 y8Var, Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = y8Var;
        this.b = obj;
        this.c = j3;
        this.e = obj2;
    }

    private final void a() {
        e40 e40Var = (e40) this.b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        if (t3Var == null || e40Var.n2) {
            return;
        }
        t3Var.a(this.c);
        e40Var.R0(true);
        s20 s20Var = e40Var.D3;
        if (s20Var != null) {
            s20Var.dismiss();
        }
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        e40Var.o1().k(0L, 34, user, e40Var.U2, null, null);
    }

    private final void b() {
        p80 p80Var = (p80) this.b;
        LaunchActivity launchActivity = p80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i7 = a10.a;
            mp u12 = mp.u1(i7);
            long j3 = this.c;
            long j10 = -j3;
            if (u12.i1(j10, false, null) != null) {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(j10));
                mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, g2Var, a10);
                return;
            }
            TLRPC.ChatFull P0 = mp.u1(i7).P0(j10);
            if (P0 != null) {
                if (P0.call != null) {
                    mp.u1(i7).i1(j10, true, new o80(p80Var, a10, j3, g2Var, 0));
                } else if (g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.n(null, 2131748959, org.telegram.ui.Components.kc.b0(g2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        ef efVar = (ef) this.e;
        Drawable[] drawableArr = PhotoViewer.f9;
        long j3 = this.c;
        bi.k2 k2Var = new bi.k2(photoViewer, str, efVar, j3, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new bd0(27, k2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            k2Var.a(zy.s(efVar.I, j3, null, true));
        } else {
            k2Var.a(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.s0 s0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j3 = this.c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.e;
        byte[] bArr3 = null;
        for (int i7 = 0; i7 < encryptedsecretphrasepartArr.length; i7++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i7].data, 0, 32);
                byte[] bArr4 = encryptedsecretphrasepartArr[i7].data;
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, 32, bArr4.length);
                long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j3, key_from_public_key), copyOfRange2);
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
                                        org.telegram.ui.Wallet.v0.n("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
                                        jVar.a(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                        byte[] bArr6 = mnemonic_decryptedkeypart.share;
                                        if (bArr6 != null) {
                                            Arrays.fill(bArr6, (byte) 0);
                                        }
                                        Arrays.fill(decrypt_message_for_one, (byte) 0);
                                        serializedData.cleanup();
                                        Arrays.fill(bArr3, (byte) 0);
                                        return;
                                    }
                                    for (int i10 = 0; i10 < bArr3.length; i10++) {
                                        bArr3[i10] = (byte) (bArr3[i10] ^ mnemonic_decryptedkeypart.share[i10]);
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
                    org.telegram.ui.Wallet.v0.n("getSecretPhrase: couldn't decrypt " + i7 + " part");
                    jVar.a(null, "WALLET_PART_" + i7 + "_CANT_DECRYPT");
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
                s0Var = null;
            }
        }
        if (bArr3 == null) {
            org.telegram.ui.Wallet.v0.n("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
                return;
            }
            return;
        }
        s0Var = new org.telegram.ui.Wallet.s0(bArr3);
        try {
            Arrays.fill(bArr3, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(s0Var);
            TL_wallet.WalletState walletState = v0Var.e;
            byte[] bArr8 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
            if (secretPhraseToPublicKey != null && bArr8 != null && Arrays.equals(secretPhraseToPublicKey, bArr8)) {
                Arrays.fill(bArr3, (byte) 0);
                org.telegram.ui.Wallet.v0.P("getSecretPhrase, received the phrase!");
                jVar.a(s0Var, null);
                return;
            }
            org.telegram.ui.Wallet.v0.n("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr8) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            s0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr3, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (s0Var != null) {
                try {
                    s0Var.close();
                } catch (Throwable th6) {
                    if (bArr3 != null) {
                        Arrays.fill(bArr3, (byte) 0);
                    }
                    throw th6;
                }
            }
            jVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.v0.o("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.b;
        w10 w10Var = (w10) this.e;
        String str = (String) this.d;
        if (w10Var == null) {
            a1Var.getClass();
            return;
        }
        if (this.c != a1Var.l()) {
            str = "STORAGE_CANCELED";
        }
        w10Var.a(str);
    }

    private final void g() {
        org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.b;
        org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.d;
        try {
            ((w10) this.e).a(this.c == a1Var.l() ? s0Var : null);
        } finally {
            if (s0Var != null) {
                s0Var.close();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:151|152|154)|148|149) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0490, code lost:
    
        if (r13 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x045c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x045d, code lost:
    
        r27 = r2;
        r26 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x03a3: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:932), block:B:199:0x03a3 */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z10;
        int i10;
        TL_stories.TL_updateStory tL_updateStory;
        a0.h hVar;
        TL_stories.PeerStories peerStories;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        Object obj;
        Object obj2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList2;
        SQLiteCursor sQLiteCursor;
        kg.w1 w1Var;
        ArrayList arrayList3;
        boolean z13;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor4;
        fj fjVar;
        NativeByteBuffer byteBufferValue2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                y8 y8Var = (y8) this.d;
                long j3 = this.c;
                w10 w10Var = (w10) this.e;
                if (y8Var.e) {
                    f6Var.w1(j3, w10Var);
                    return;
                }
                org.telegram.ui.Components.fc Q = f6Var.k().Q(R.raw.error, 36, gd.a0(null, null, 2131743631, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 1:
                f6 f6Var2 = (f6) this.b;
                long j10 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                bx bxVar = (bx) this.e;
                org.telegram.messenger.f4.f(f6Var2.a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                bxVar.presentFragment(bn.ua(j10), true);
                return;
            case 2:
                f6 f6Var3 = (f6) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j11 = this.c;
                w10 w10Var2 = (w10) this.e;
                f6Var3.getClass();
                zArr[0] = true;
                f6Var3.g2.setLoading(false);
                f6Var3.w1(j11, w10Var2);
                return;
            case 3:
                ((y8) this.d).b0((fj) this.e, ((k6) this.b).a, this.c, true, true, null);
                return;
            case 4:
                bn bnVar = (bn) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j12 = this.c;
                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(bnVar);
                TLRPC.Document document = starGift.sticker;
                String N0 = gd.N0(2131744868, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.W2(gd.G((int) j12, "StarsGiftCompletedText", new Object[0]));
                }
                b02.s(document, N0, charSequence).k(true);
                return;
            case 5:
                ((y8) this.d).f0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 6:
                y8 y8Var2 = (y8) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j13 = this.c;
                w10 w10Var3 = (w10) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    y8Var2.getClass();
                    w10Var3.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    y8Var2.M.put(Long.valueOf(j13), stargiftupgradepreview);
                    w10Var3.a(stargiftupgradepreview);
                    return;
                }
            case 7:
                fi.p6 p6Var = (fi.p6) this.b;
                long j14 = this.c;
                TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList4 = p6Var.h;
                ArrayList arrayList5 = p6Var.g;
                int i12 = p6Var.a;
                org.telegram.messenger.a8.b("StoriesController update stories for dialog " + j14);
                p6Var.q0(j14, Collections.singletonList(tL_updateStory2.story), false);
                p6Var.o0(j14, Collections.singletonList(tL_updateStory2.story), true);
                a0.h hVar2 = p6Var.i;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar2.f(j14);
                ArrayList arrayList6 = new ArrayList();
                int i13 = p6Var.u;
                if (peerStories2 != null) {
                    TL_stories.StoryItem storyItem = tL_updateStory2.story;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        arrayList = arrayList6;
                        i7 = i13;
                        tL_updateStory = tL_updateStory2;
                        peerStories = peerStories2;
                        hVar = hVar2;
                        xs.l0.c(new os(xs.t(i12), j14, storyItem.id, 0));
                    } else {
                        tL_updateStory = tL_updateStory2;
                        hVar = hVar2;
                        peerStories = peerStories2;
                        arrayList = arrayList6;
                        i7 = i13;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i14).id != storyItem.id) {
                            i14++;
                        } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i14);
                            i5.c.t(storyItem.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i14);
                            storyItem = fi.p6.f(storyItem2, storyItem);
                            arrayList.add(storyItem);
                            peerStories.stories.set(i14, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            i5.c.t(storyItem.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (z11) {
                        z10 = false;
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (fi.i7.w(i12, storyItem)) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j14 > 0 && (user == null || (!user.self && !p6Var.O(user)))) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList.add(storyItem);
                        peerStories.stories.add(storyItem);
                        org.telegram.messenger.a8.b("StoriesController add new story id=" + storyItem.id + " total stories count " + peerStories.stories.size());
                        p6Var.Z(j14, storyItem);
                        p6Var.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || p6Var.M(j14)) {
                            Collections.sort(peerStories.stories, fi.p6.X);
                        } else {
                            arrayList5.remove(peerStories);
                            arrayList4.remove(peerStories);
                            hVar.l(org.telegram.messenger.n5.o(peerStories.peer));
                            p6Var.u--;
                        }
                        z10 = true;
                    }
                    tL_updateStory2 = tL_updateStory;
                } else {
                    i7 = i13;
                    TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j14 + " with new story DELETED");
                        return;
                    }
                    if (fi.i7.w(i12, storyItem3)) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j14 + " with new story isExpired");
                        return;
                    }
                    if (j14 > 0 && (user == null || (!user.self && !p6Var.O(user)))) {
                        org.telegram.messenger.a8.b("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory2.peer;
                    tL_peerStories.stories.add(tL_updateStory2.story);
                    i5.c.t(tL_updateStory2.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long o4 = org.telegram.messenger.n5.o(tL_peerStories.peer);
                    p6Var.e0(o4, tL_peerStories);
                    if (o4 != i10.i(i10.t0).n) {
                        TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(o4));
                        p6Var.g(tL_peerStories);
                        if (c22 != null && !c22.stories_hidden) {
                            p6Var.a0(tL_peerStories);
                        }
                    }
                    org.telegram.messenger.a8.b("StoriesController applyNewStories " + o4);
                    p6Var.q0(o4, tL_peerStories.stories, false);
                    p6Var.u = p6Var.u + 1;
                    p6Var.R(j14);
                    z10 = true;
                }
                if (i7 != p6Var.u) {
                    p6Var.l.edit().putInt("total_stores", p6Var.u).apply();
                }
                p6Var.v(arrayList5);
                p6Var.v(arrayList4);
                if (z10) {
                    if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        ks.f(i12).k(ks.z5, Long.valueOf(j14), Integer.valueOf(tL_updateStory2.story.id));
                    } else {
                        i10 = 0;
                    }
                    ks.f(i12).k(ks.y5, new Object[i10]);
                }
                mp.u1(i12).D();
                return;
            case 8:
                fi.x5 x5Var = (fi.x5) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j15 = this.c;
                v60 v60Var = (v60) this.e;
                fi.p6 p6Var2 = x5Var.c;
                int i15 = p6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    mp.u1(i15).f4(tL_stories_peerStories.users, false);
                    mp.u1(i15).Z3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories3 = tL_stories_peerStories.stories;
                    if (peerStories3 != null) {
                        for (int i16 = 0; i16 < peerStories3.stories.size(); i16++) {
                            if ((peerStories3.stories.get(i16).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories3.stories.get(i16) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar3 = p6Var2.E;
                                obj = (TL_stories.StoryItem) peerStories3.stories.get(i16);
                                hVar3.k(obj, j15);
                                v60Var.a(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                v60Var.a(obj);
                return;
            case 9:
                fi.y5 y5Var = (fi.y5) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j16 = this.c;
                w10 w10Var4 = (w10) this.e;
                fi.p6 p6Var3 = y5Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    mp.u1(p6Var3.a).f4(tL_stories_stories.users, false);
                    mp.u1(p6Var3.a).Z3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar4 = p6Var3.E;
                        obj2 = (TL_stories.StoryItem) tL_stories_stories.stories.get(0);
                        hVar4.k(obj2, j16);
                        w10Var4.a(obj2);
                        return;
                    }
                }
                obj2 = null;
                w10Var4.a(obj2);
                return;
            case 10:
                fi.h7 h7Var = (fi.h7) this.b;
                View view = (View) this.d;
                long j17 = this.c;
                fi.e7 e7Var = (fi.e7) this.e;
                org.telegram.messenger.g0.h3(new bi.s2(h7Var, view, j17, 10), 500L);
                e7Var.f(j17);
                return;
            case 11:
                hi.f9 f9Var = (hi.f9) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                tr trVar = (tr) this.e;
                long j18 = this.c;
                boolean T = org.telegram.messenger.v3.T(chat);
                TLRPC.ChatFull G0 = trVar.G0(j18, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.g0.g3(new vb(f9Var, T, j18, 1));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new bi.s2(f9Var, j18, G0, 11));
                    return;
                }
            case 12:
                kg.w1 w1Var2 = (kg.w1) this.b;
                tr trVar2 = (tr) this.d;
                long j19 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.b;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            try {
                                kg.v1 v1Var = new kg.v1();
                                v1Var.a = sQLiteCursor2.intValue(0);
                                v1Var.b = sQLiteCursor2.stringValue(1);
                                v1Var.c = sQLiteCursor2.intValue(2);
                                v1Var.f = sQLiteCursor2.intValue(3);
                                arrayList7.add(v1Var);
                            } catch (Exception e10) {
                                e = e10;
                                w1Var = w1Var2;
                                arrayList3 = arrayList7;
                                z13 = true;
                                org.telegram.messenger.a8.g(e, z13);
                                break;
                            }
                        }
                        sQLiteCursor2.dispose();
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i17 = 0;
                        while (i17 < arrayList7.size()) {
                            kg.v1 v1Var2 = (kg.v1) arrayList7.get(i17);
                            boolean z14 = i11;
                            int i18 = i17;
                            arrayList3 = arrayList7;
                            try {
                                Object[] objArr = new Object[1];
                                objArr[z14 ? 1 : 0] = Integer.valueOf(v1Var2.a);
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                                if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(z14 ? 1 : 0)) == null) {
                                    w1Var = w1Var2;
                                } else {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z14), z14);
                                    TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                    TLdeserialize.readAttachPath(byteBufferValue, j19);
                                    byteBufferValue.reuse();
                                    TLdeserialize.id = sQLiteCursor2.intValue(2);
                                    TLdeserialize.date = sQLiteCursor2.intValue(3);
                                    TLdeserialize.flags |= TLObject.FLAG_30;
                                    TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                    TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                    tr.e(TLdeserialize, arrayList10, arrayList11, null);
                                    w1Var = w1Var2;
                                    try {
                                        fj fjVar2 = new fj(w1Var2.a, TLdeserialize, false, true);
                                        v1Var2.e = fjVar2;
                                        v1Var2.d = TLdeserialize.id;
                                        fjVar2.r0(false);
                                        v1Var2.e.l(v1Var2.a, v1Var2.b);
                                    } catch (Exception e11) {
                                        e = e11;
                                        z13 = true;
                                        org.telegram.messenger.a8.g(e, z13);
                                    }
                                }
                                sQLiteCursor2.dispose();
                                i17 = i18 + 1;
                                arrayList7 = arrayList3;
                                w1Var2 = w1Var;
                                i11 = 0;
                            } catch (Exception e12) {
                                e = e12;
                                w1Var = w1Var2;
                                z13 = true;
                                org.telegram.messenger.a8.g(e, z13);
                            }
                        }
                        w1Var = w1Var2;
                        arrayList3 = arrayList7;
                        if (!arrayList11.isEmpty()) {
                            trVar2.Q(TextUtils.join(",", arrayList11), arrayList9);
                        }
                        if (!arrayList10.isEmpty()) {
                            trVar2.n0(arrayList10, arrayList8, false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursor3;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    w1Var = w1Var2;
                    arrayList3 = arrayList7;
                    z13 = true;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                org.telegram.messenger.g0.g3(new bi.s1(w1Var, arrayList8, arrayList9, arrayList3, runnable, 19));
                return;
            case 13:
                kg.w1 w1Var3 = (kg.w1) this.b;
                tr trVar3 = (tr) this.d;
                kg.v1 v1Var3 = (kg.v1) this.e;
                long j20 = this.c;
                try {
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    SQLiteCursor queryFinalized = trVar3.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(v1Var3.a));
                    try {
                        if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                            fjVar = null;
                        } else {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                            TLdeserialize2.send_state = queryFinalized.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue2, j20);
                            byteBufferValue2.reuse();
                            TLdeserialize2.id = queryFinalized.intValue(2);
                            TLdeserialize2.date = queryFinalized.intValue(3);
                            TLdeserialize2.flags |= TLObject.FLAG_30;
                            TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                            TLdeserialize2.ttl = queryFinalized.intValue(5);
                            tr.e(TLdeserialize2, arrayList12, arrayList13, null);
                            fjVar = new fj(w1Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = new ArrayList();
                        if (!arrayList13.isEmpty()) {
                            trVar3.Q(TextUtils.join(",", arrayList13), arrayList15);
                        }
                        if (!arrayList12.isEmpty()) {
                            trVar3.n0(arrayList12, arrayList14, false);
                        }
                        org.telegram.messenger.g0.g3(new bi.s1(w1Var3, arrayList14, arrayList15, v1Var3, fjVar, 17));
                        queryFinalized.dispose();
                        return;
                    } catch (Exception e14) {
                        e = e14;
                        sQLiteCursor4 = queryFinalized;
                        try {
                            org.telegram.messenger.a8.g(e, true);
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
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor4 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor4 = null;
                }
                break;
            case 14:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 15:
                ti tiVar = (ti) this.b;
                long j21 = this.c;
                bn bnVar2 = (bn) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                Context context = tiVar.getContext();
                int i19 = tiVar.H3;
                kj kjVar = bnVar2.y5;
                if (kjVar == null) {
                    kjVar = kj.a();
                }
                new r0(context, i19, j21, kjVar, bnVar2, i6Var, 0, new ph(i11, tiVar, bnVar2)).show();
                return;
            case 16:
                z11 z11Var = (z11) this.b;
                x60 x60Var = (x60) this.d;
                long j22 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                x60Var.v();
                TLRPC.User c23 = mp.u1(z11Var.e).c2(Long.valueOf(j22));
                if (c23 != null) {
                    bn bnVar3 = z11Var.s;
                    org.telegram.ui.Components.b5.q(bnVar3, -1, c23, chat2, true, new ai.z(z11Var, j22, 6), bnVar3.getResourceProvider());
                    return;
                }
                return;
            case 17:
                z11 z11Var2 = (z11) this.b;
                HashSet hashSet = (HashSet) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                long j23 = this.c;
                z11Var2.l0.removeAll(hashSet);
                z11Var2.q();
                int size = arrayList16.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj3 = arrayList16.get(i20);
                    i20++;
                    long intValue = ((Integer) obj3).intValue();
                    if (j23 == intValue) {
                        z11Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 18:
                bx bxVar2 = (bx) this.b;
                ro roVar = (ro) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j24 = this.c;
                int i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (roVar != null) {
                    LongSparseIntArray longSparseIntArray = roVar.j;
                    if (bxVar2.v4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            i21 = Math.min(i21, longSparseIntArray.valueAt(i22));
                        }
                        i21 -= bxVar2.Q2;
                    }
                }
                int i23 = i21;
                TLRPC.EncryptedChat c12 = org.telegram.messenger.n5.C(j24) ? bxVar2.getMessagesController().c1(Integer.valueOf((int) (4294967295L & j24))) : null;
                UndoView l42 = bxVar2.l4();
                if (l42 == null) {
                    return;
                }
                if (bxVar2.v4(dialog)) {
                    bxVar2.L4(j24, false, roVar, i23, true);
                    l42.k(0L, 79, 1, 1600, null, null);
                } else {
                    bxVar2.L4(j24, true, roVar, i23, true);
                    l42.k(0L, 78, 1, 1600, null, null);
                    if (roVar != null) {
                        if (c12 != null) {
                            if (!roVar.h.contains(Long.valueOf(c12.user_id))) {
                                roVar.h.add(Long.valueOf(c12.user_id));
                            }
                        } else if (!roVar.h.contains(Long.valueOf(j24))) {
                            roVar.h.add(Long.valueOf(j24));
                        }
                    }
                }
                if (roVar != null) {
                    jz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, false, false, true, true, false, bxVar2, null);
                    bxVar2 = bxVar2;
                }
                bxVar2.getMessagesController().u4(bxVar2.Y2, 0L, null);
                bxVar2.n5(true);
                if (bxVar2.f0 != null) {
                    int i24 = 0;
                    while (true) {
                        ax[] axVarArr = bxVar2.f0;
                        if (i24 < axVarArr.length) {
                            axVarArr[i24].d.I = false;
                            i24++;
                        }
                    }
                }
                int i25 = mp.I8;
                bxVar2.D5(196608, true);
                return;
            case 19:
                a();
                return;
            case 20:
                TLObject tLObject4 = (TLObject) this.b;
                mp mpVar = (mp) this.d;
                long j25 = this.c;
                up upVar = (up) this.e;
                String str = LaunchActivity.C1;
                if (!(tLObject4 instanceof TL_stories.TL_stories_peerStories)) {
                    upVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories2 = (TL_stories.TL_stories_peerStories) tLObject4;
                mpVar.f4(tL_stories_peerStories2.users, false);
                mpVar.R1().d0(j25, tL_stories_peerStories2.stories);
                upVar.run();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            default:
                yi.j jVar = (yi.j) this.b;
                yi.h hVar5 = (yi.h) this.d;
                long j26 = this.c;
                byte[] bArr = (byte[]) this.e;
                if (jVar.G != 7) {
                    return;
                }
                long length = hVar5.b.length();
                jVar.a(hVar5, length);
                synchronized (jVar.l) {
                    if (hVar5.d && !hVar5.e) {
                        hVar5.e = true;
                        jVar.k.execute(new yi.c(jVar, hVar5, length, j26, 2));
                        jVar.C = new ac.e(hVar5.b, j26, bArr);
                        jVar.s(8);
                        j6.k kVar = jVar.f;
                        ac.e eVar = jVar.C;
                        MediaController mediaController = ((ke) kVar.b).a;
                        String[] strArr = MediaController.W1;
                        mediaController.s(eVar);
                        jVar.c();
                        jVar.t();
                        jVar.l("completed");
                    }
                }
                return;
        }
    }

    public /* synthetic */ j2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = j3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ j2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ j2(org.telegram.ui.Wallet.a1 a1Var, w10 w10Var, long j3, String str) {
        this.a = 24;
        this.b = a1Var;
        this.e = w10Var;
        this.c = j3;
        this.d = str;
    }
}
