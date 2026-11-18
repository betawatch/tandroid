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
import org.telegram.messenger.j10;
import org.telegram.messenger.ke;
import org.telegram.messenger.kj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.os;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.x10;
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
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.kz;
import org.telegram.ui.p80;
import org.telegram.ui.q80;
import org.telegram.ui.up;
import org.telegram.ui.w60;
import org.telegram.ui.we0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i2(x8 x8Var, Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = x8Var;
        this.b = obj;
        this.c = j3;
        this.e = obj2;
    }

    private final void a() {
        f40 f40Var = (f40) this.b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var == null || f40Var.n2) {
            return;
        }
        t3Var.a(this.c);
        f40Var.R0(true);
        s20 s20Var = f40Var.D3;
        if (s20Var != null) {
            s20Var.dismiss();
        }
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        f40Var.o1().k(0L, 34, user, f40Var.U2, null, null);
    }

    private final void b() {
        q80 q80Var = (q80) this.b;
        LaunchActivity launchActivity = q80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i7 = a10.a;
            mp u12 = mp.u1(i7);
            long j3 = this.c;
            long j10 = -j3;
            if (u12.i1(j10, false, null) != null) {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(j10));
                mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, h2Var, a10);
                return;
            }
            TLRPC.ChatFull P0 = mp.u1(i7).P0(j10);
            if (P0 != null) {
                if (P0.call != null) {
                    mp.u1(i7).i1(j10, true, new p80(q80Var, a10, j3, h2Var, 0));
                } else if (h2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.n(null, 2131748960, org.telegram.ui.Components.lc.b0(h2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        ef efVar = (ef) this.e;
        Drawable[] drawableArr = PhotoViewer.Z8;
        long j3 = this.c;
        bi.e2 e2Var = new bi.e2(photoViewer, str, efVar, j3, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new we0(20, e2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            e2Var.a(zy.s(efVar.I, j3, null, true));
        } else {
            e2Var.a(bitmap);
        }
    }

    private final void d() {
        org.telegram.ui.Wallet.r0 r0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.b;
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
                                        org.telegram.ui.Wallet.u0.n("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
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
                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: couldn't decrypt " + i7 + " part");
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
                r0Var = null;
            }
        }
        if (bArr3 == null) {
            org.telegram.ui.Wallet.u0.n("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
                return;
            }
            return;
        }
        r0Var = new org.telegram.ui.Wallet.r0(bArr3);
        try {
            Arrays.fill(bArr3, (byte) 0);
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(r0Var);
            TL_wallet.WalletState walletState = u0Var.e;
            byte[] bArr8 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
            if (secretPhraseToPublicKey != null && bArr8 != null && Arrays.equals(secretPhraseToPublicKey, bArr8)) {
                Arrays.fill(bArr3, (byte) 0);
                org.telegram.ui.Wallet.u0.P("getSecretPhrase, received the phrase!");
                jVar.a(r0Var, null);
                return;
            }
            org.telegram.ui.Wallet.u0.n("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr8) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            r0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
            Arrays.fill(bArr3, (byte) 0);
        } catch (Throwable th5) {
            th = th5;
            if (r0Var != null) {
                try {
                    r0Var.close();
                } catch (Throwable th6) {
                    if (bArr3 != null) {
                        Arrays.fill(bArr3, (byte) 0);
                    }
                    throw th6;
                }
            }
            jVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.u0.o("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
        x10 x10Var = (x10) this.e;
        String str = (String) this.d;
        if (x10Var == null) {
            z0Var.getClass();
            return;
        }
        if (this.c != z0Var.l()) {
            str = "STORAGE_CANCELED";
        }
        x10Var.a(str);
    }

    private final void g() {
        org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.d;
        try {
            ((x10) this.e).a(this.c == z0Var.l() ? r0Var : null);
        } finally {
            if (r0Var != null) {
                r0Var.close();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:150|151|153)|147|148) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x048a, code lost:
    
        if (r13 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0456, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0457, code lost:
    
        r27 = r2;
        r26 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04a2  */
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
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        SQLiteCursor queryFinalized;
        fj fjVar;
        NativeByteBuffer byteBufferValue2;
        boolean z14 = false;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                x8 x8Var = (x8) this.d;
                long j3 = this.c;
                x10 x10Var = (x10) this.e;
                if (x8Var.e) {
                    f6Var.w1(j3, x10Var);
                    return;
                }
                org.telegram.ui.Components.gc Q = f6Var.k().Q(R.raw.error, 36, gd.a0(null, null, 2131743641, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 1:
                f6 f6Var2 = (f6) this.b;
                long j10 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                cx cxVar = (cx) this.e;
                org.telegram.messenger.f4.f(f6Var2.a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                cxVar.presentFragment(bn.ua(j10), true);
                return;
            case 2:
                f6 f6Var3 = (f6) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j11 = this.c;
                x10 x10Var2 = (x10) this.e;
                f6Var3.getClass();
                zArr[0] = true;
                f6Var3.g2.setLoading(false);
                f6Var3.w1(j11, x10Var2);
                return;
            case 3:
                ((x8) this.d).b0((fj) this.e, ((k6) this.b).a, this.c, true, true, null);
                return;
            case 4:
                bn bnVar = (bn) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j12 = this.c;
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                TLRPC.Document document = starGift.sticker;
                String M0 = gd.M0(2131744874, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.W2(gd.G((int) j12, "StarsGiftCompletedText", new Object[0]));
                }
                b02.s(document, M0, charSequence).k(true);
                return;
            case 5:
                ((x8) this.d).f0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 6:
                x8 x8Var2 = (x8) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j13 = this.c;
                x10 x10Var3 = (x10) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    x8Var2.getClass();
                    x10Var3.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    x8Var2.M.put(Long.valueOf(j13), stargiftupgradepreview);
                    x10Var3.a(stargiftupgradepreview);
                    return;
                }
            case 7:
                fi.p6 p6Var = (fi.p6) this.b;
                long j14 = this.c;
                TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList6 = p6Var.h;
                ArrayList arrayList7 = p6Var.g;
                int i11 = p6Var.a;
                org.telegram.messenger.a8.b("StoriesController update stories for dialog " + j14);
                p6Var.q0(j14, Collections.singletonList(tL_updateStory2.story), false);
                p6Var.o0(j14, Collections.singletonList(tL_updateStory2.story), true);
                a0.h hVar2 = p6Var.i;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar2.f(j14);
                ArrayList arrayList8 = new ArrayList();
                int i12 = p6Var.u;
                if (peerStories2 != null) {
                    TL_stories.StoryItem storyItem = tL_updateStory2.story;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        arrayList = arrayList8;
                        i7 = i12;
                        tL_updateStory = tL_updateStory2;
                        peerStories = peerStories2;
                        hVar = hVar2;
                        xs.l0.c(new os(xs.t(i11), j14, storyItem.id, 0));
                    } else {
                        tL_updateStory = tL_updateStory2;
                        hVar = hVar2;
                        peerStories = peerStories2;
                        arrayList = arrayList8;
                        i7 = i12;
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i13).id != storyItem.id) {
                            i13++;
                        } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i13);
                            i5.c.t(storyItem.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i13);
                            storyItem = fi.p6.f(storyItem2, storyItem);
                            arrayList.add(storyItem);
                            peerStories.stories.set(i13, storyItem);
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
                        if (fi.i7.w(i11, storyItem)) {
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
                            arrayList7.remove(peerStories);
                            arrayList6.remove(peerStories);
                            hVar.l(org.telegram.messenger.n5.o(peerStories.peer));
                            p6Var.u--;
                        }
                        z10 = true;
                    }
                    tL_updateStory2 = tL_updateStory;
                } else {
                    i7 = i12;
                    TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j14 + " with new story DELETED");
                        return;
                    }
                    if (fi.i7.w(i11, storyItem3)) {
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
                    if (o4 != j10.i(j10.t0).n) {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(o4));
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
                p6Var.v(arrayList7);
                p6Var.v(arrayList6);
                if (z10) {
                    if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        ks.f(i11).k(ks.z5, Long.valueOf(j14), Integer.valueOf(tL_updateStory2.story.id));
                    } else {
                        i10 = 0;
                    }
                    ks.f(i11).k(ks.y5, new Object[i10]);
                }
                mp.u1(i11).D();
                return;
            case 8:
                fi.w5 w5Var = (fi.w5) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j15 = this.c;
                w60 w60Var = (w60) this.e;
                fi.p6 p6Var2 = w5Var.c;
                int i14 = p6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    mp.u1(i14).f4(tL_stories_peerStories.users, false);
                    mp.u1(i14).Z3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories3 = tL_stories_peerStories.stories;
                    if (peerStories3 != null) {
                        for (int i15 = 0; i15 < peerStories3.stories.size(); i15++) {
                            if ((peerStories3.stories.get(i15).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories3.stories.get(i15) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar3 = p6Var2.E;
                                obj = (TL_stories.StoryItem) peerStories3.stories.get(i15);
                                hVar3.k(obj, j15);
                                w60Var.a(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                w60Var.a(obj);
                return;
            case 9:
                fi.x5 x5Var = (fi.x5) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j16 = this.c;
                x10 x10Var4 = (x10) this.e;
                fi.p6 p6Var3 = x5Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    mp.u1(p6Var3.a).f4(tL_stories_stories.users, false);
                    mp.u1(p6Var3.a).Z3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar4 = p6Var3.E;
                        obj2 = (TL_stories.StoryItem) tL_stories_stories.stories.get(0);
                        hVar4.k(obj2, j16);
                        x10Var4.a(obj2);
                        return;
                    }
                }
                obj2 = null;
                x10Var4.a(obj2);
                return;
            case 10:
                fi.h7 h7Var = (fi.h7) this.b;
                View view = (View) this.d;
                long j17 = this.c;
                fi.e7 e7Var = (fi.e7) this.e;
                org.telegram.messenger.g0.h3(new bi.m2(h7Var, view, j17, 10), 500L);
                e7Var.f(j17);
                return;
            case 11:
                hi.l8 l8Var = (hi.l8) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                tr trVar = (tr) this.e;
                long j18 = this.c;
                boolean T = org.telegram.messenger.v3.T(chat);
                TLRPC.ChatFull G0 = trVar.G0(j18, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.g0.g3(new vb(l8Var, T, j18, 1));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new bi.m2(l8Var, j18, G0, 11));
                    return;
                }
            case 12:
                kg.w1 w1Var2 = (kg.w1) this.b;
                tr trVar2 = (tr) this.d;
                long j19 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = trVar2.b;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                kg.v1 v1Var = new kg.v1();
                                v1Var.a = sQLiteCursor2.intValue(0);
                                v1Var.b = sQLiteCursor2.stringValue(1);
                                v1Var.c = sQLiteCursor2.intValue(2);
                                v1Var.f = sQLiteCursor2.intValue(3);
                                arrayList9.add(v1Var);
                            } catch (Exception e10) {
                                e = e10;
                                w1Var = w1Var2;
                                arrayList3 = arrayList9;
                                z13 = true;
                                org.telegram.messenger.a8.g(e, z13);
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursor2;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor2.dispose();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int i16 = 0;
                    while (i16 < arrayList9.size()) {
                        kg.v1 v1Var2 = (kg.v1) arrayList9.get(i16);
                        boolean z15 = z14;
                        int i17 = i16;
                        arrayList3 = arrayList9;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[z15 ? 1 : 0] = Integer.valueOf(v1Var2.a);
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                            if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(z15 ? 1 : 0)) == null) {
                                w1Var = w1Var2;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z15), z15);
                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j19);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                tr.e(TLdeserialize, arrayList12, arrayList13, null);
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
                            i16 = i17 + 1;
                            arrayList9 = arrayList3;
                            w1Var2 = w1Var;
                            z14 = false;
                        } catch (Exception e12) {
                            e = e12;
                            w1Var = w1Var2;
                            z13 = true;
                            org.telegram.messenger.a8.g(e, z13);
                        }
                    }
                    w1Var = w1Var2;
                    arrayList3 = arrayList9;
                    if (!arrayList13.isEmpty()) {
                        trVar2.Q(TextUtils.join(",", arrayList13), arrayList11);
                    }
                    if (!arrayList12.isEmpty()) {
                        trVar2.n0(arrayList12, arrayList10, false);
                    }
                } catch (Exception e13) {
                    e = e13;
                    w1Var = w1Var2;
                    arrayList3 = arrayList9;
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
                org.telegram.messenger.g0.g3(new ai.b(w1Var, arrayList10, arrayList11, arrayList3, runnable, 20));
                return;
            case 13:
                kg.w1 w1Var3 = (kg.w1) this.b;
                tr trVar3 = (tr) this.d;
                kg.v1 v1Var3 = (kg.v1) this.e;
                long j20 = this.c;
                try {
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    queryFinalized = trVar3.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(v1Var3.a));
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor3 = null;
                }
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
                        tr.e(TLdeserialize2, arrayList4, arrayList5, null);
                        fjVar = new fj(w1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    if (!arrayList5.isEmpty()) {
                        trVar3.Q(TextUtils.join(",", arrayList5), arrayList15);
                    }
                    if (!arrayList4.isEmpty()) {
                        trVar3.n0(arrayList4, arrayList14, false);
                    }
                    org.telegram.messenger.g0.g3(new ai.b(w1Var3, arrayList14, arrayList15, v1Var3, fjVar, 18));
                    queryFinalized.dispose();
                    return;
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor3 = queryFinalized;
                    try {
                        org.telegram.messenger.a8.g(e, true);
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor3 = queryFinalized;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
            case 14:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 15:
                si siVar = (si) this.b;
                long j21 = this.c;
                bn bnVar2 = (bn) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                Context context = siVar.getContext();
                int i18 = siVar.H3;
                kj kjVar = bnVar2.y5;
                if (kjVar == null) {
                    kjVar = kj.a();
                }
                new r0(context, i18, j21, kjVar, bnVar2, i6Var, 0, new li.d(29, siVar, bnVar2)).show();
                return;
            case 16:
                z11 z11Var = (z11) this.b;
                y60 y60Var = (y60) this.d;
                long j22 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                y60Var.v();
                TLRPC.User c23 = mp.u1(z11Var.e).c2(Long.valueOf(j22));
                if (c23 != null) {
                    bn bnVar3 = z11Var.s;
                    org.telegram.ui.Components.b5.q(bnVar3, -1, c23, chat2, true, new ai.d0(z11Var, j22, 6), bnVar3.getResourceProvider());
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
                int i19 = 0;
                while (i19 < size) {
                    Object obj3 = arrayList16.get(i19);
                    i19++;
                    long intValue = ((Integer) obj3).intValue();
                    if (j23 == intValue) {
                        z11Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 18:
                cx cxVar2 = (cx) this.b;
                ro roVar = (ro) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j24 = this.c;
                int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (roVar != null) {
                    LongSparseIntArray longSparseIntArray = roVar.j;
                    if (cxVar2.v4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            i20 = Math.min(i20, longSparseIntArray.valueAt(i21));
                        }
                        i20 -= cxVar2.Q2;
                    }
                }
                int i22 = i20;
                TLRPC.EncryptedChat c12 = org.telegram.messenger.n5.C(j24) ? cxVar2.getMessagesController().c1(Integer.valueOf((int) (4294967295L & j24))) : null;
                UndoView l42 = cxVar2.l4();
                if (l42 == null) {
                    return;
                }
                if (cxVar2.v4(dialog)) {
                    cxVar2.L4(j24, false, roVar, i22, true);
                    l42.k(0L, 79, 1, 1600, null, null);
                } else {
                    cxVar2.L4(j24, true, roVar, i22, true);
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
                    kz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, false, false, true, true, false, cxVar2, null);
                    cxVar2 = cxVar2;
                }
                cxVar2.getMessagesController().u4(cxVar2.Y2, 0L, null);
                cxVar2.n5(true);
                if (cxVar2.f0 != null) {
                    int i23 = 0;
                    while (true) {
                        bx[] bxVarArr = cxVar2.f0;
                        if (i23 < bxVarArr.length) {
                            bxVarArr[i23].d.I = false;
                            i23++;
                        }
                    }
                }
                int i24 = mp.I8;
                cxVar2.D5(196608, true);
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
                        ji.j jVar2 = jVar.f;
                        ac.e eVar = jVar.C;
                        MediaController mediaController = ((ke) jVar2.b).a;
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

    public /* synthetic */ i2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = j3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ i2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ i2(org.telegram.ui.Wallet.z0 z0Var, x10 x10Var, long j3, String str) {
        this.a = 24;
        this.b = z0Var;
        this.e = x10Var;
        this.c = j3;
        this.d = str;
    }
}
