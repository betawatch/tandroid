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
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dt;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.me;
import org.telegram.messenger.nj;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.us;
import org.telegram.messenger.vo;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.n11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bd0;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.iz;
import org.telegram.ui.o80;
import org.telegram.ui.p80;
import org.telegram.ui.tp;
import org.telegram.ui.x60;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2(ea eaVar, Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = eaVar;
        this.b = obj;
        this.c = j3;
        this.e = obj2;
    }

    private final void a() {
        e40 e40Var = (e40) this.b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        if (r3Var == null || e40Var.j2) {
            return;
        }
        r3Var.a(this.c);
        e40Var.Q0(true);
        i20 i20Var = e40Var.v3;
        if (i20Var != null) {
            i20Var.dismiss();
        }
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        e40Var.n1().k(0L, 34, user, e40Var.Q2, null, null);
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.b;
        qp qpVar = (qp) this.d;
        tp tpVar = (tp) this.e;
        String str = LaunchActivity.B1;
        if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
            tpVar.run();
            return;
        }
        TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
        qpVar.Y3(tL_stories_peerStories.users, false);
        qpVar.P1().d0(this.c, tL_stories_peerStories.stories);
        tpVar.run();
    }

    private final void c() {
        p80 p80Var = (p80) this.b;
        LaunchActivity launchActivity = p80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.O);
            int i7 = a10.a;
            qp s12 = qp.s1(i7);
            long j3 = this.c;
            long j10 = -j3;
            if (s12.g1(j10, false, null) != null) {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(j10));
                qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, f2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = qp.s1(i7).N0(j10);
            if (N0 != null) {
                if (N0.call != null) {
                    qp.s1(i7).g1(j10, true, new o80(p80Var, a10, j3, f2Var, 0));
                } else if (f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.o(null, 2131749152, org.telegram.ui.Components.hc.a0(f2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        gf gfVar = (gf) this.e;
        Drawable[] drawableArr = PhotoViewer.Y8;
        long j3 = this.c;
        r2 r2Var = new r2(photoViewer, str, gfVar, j3, 6);
        if (photoViewer.D2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.C2, createBitmap, new bd0(29, r2Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.B2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
        if (bitmap == null) {
            r2Var.a(gz.s(gfVar.I, j3, null, true));
        } else {
            r2Var.a(bitmap);
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.i0 i0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
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
                                        org.telegram.ui.Wallet.l0.j("getSecretPhrase: part " + i7 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
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
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: couldn't decrypt " + i7 + " part");
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
                i0Var = null;
            }
        }
        if (bArr3 == null) {
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
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
                org.telegram.ui.Wallet.l0.H("getSecretPhrase, received the phrase!");
                jVar.a(i0Var, null);
                return;
            }
            org.telegram.ui.Wallet.l0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr8) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            i0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
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
            jVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.l0.k("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void g() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
        c20 c20Var = (c20) this.e;
        String str = (String) this.d;
        if (c20Var == null) {
            p0Var.getClass();
            return;
        }
        if (this.c != p0Var.l()) {
            str = "STORAGE_CANCELED";
        }
        c20Var.a(str);
    }

    private final void h() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.d;
        try {
            ((c20) this.e).a(this.c == p0Var.l() ? i0Var : null);
        } finally {
            if (i0Var != null) {
                i0Var.close();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:146|147|149)|143|144) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0462, code lost:
    
        if (r13 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x042e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x042f, code lost:
    
        r27 = r2;
        r24 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0478  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        boolean z9;
        int i10;
        TL_stories.TL_updateStory tL_updateStory;
        a0.h hVar;
        TL_stories.PeerStories peerStories;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList2;
        SQLiteCursor sQLiteCursor;
        kg.t1 t1Var;
        ArrayList arrayList3;
        boolean z12;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        SQLiteCursor queryFinalized;
        ij ijVar;
        NativeByteBuffer byteBufferValue2;
        int i11 = 5;
        boolean z13 = false;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                ea eaVar = (ea) this.d;
                long j3 = this.c;
                c20 c20Var = (c20) this.e;
                if (eaVar.e) {
                    k7Var.r1(j3, c20Var);
                    return;
                }
                org.telegram.ui.Components.cc Q = k7Var.k().Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 1:
                k7 k7Var2 = (k7) this.b;
                long j10 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                yw ywVar = (yw) this.e;
                org.telegram.messenger.d4.f(k7Var2.a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                ywVar.presentFragment(cn.ta(j10), true);
                return;
            case 2:
                k7 k7Var3 = (k7) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j11 = this.c;
                c20 c20Var2 = (c20) this.e;
                k7Var3.getClass();
                zArr[0] = true;
                k7Var3.c2.setLoading(false);
                k7Var3.r1(j11, c20Var2);
                return;
            case 3:
                ((ea) this.d).b0((ij) this.e, ((p7) this.b).a, this.c, true, true, null);
                return;
            case 4:
                ea eaVar2 = (ea) this.d;
                c20 c20Var3 = (c20) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                long j12 = this.c;
                if (eaVar2.e) {
                    eaVar2.H(starGift, j12, null, true, c20Var3);
                    return;
                } else {
                    ea.e("NO_BALANCE");
                    c20Var3.a(null);
                    return;
                }
            case 5:
                cn cnVar = (cn) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j13 = this.c;
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar);
                TLRPC.Document document = starGift2.sticker;
                String M0 = org.telegram.messenger.id.M0(2131745109, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j13, "StarsGiftCompletedText", new Object[0]));
                }
                a02.s(document, M0, charSequence).k(true);
                return;
            case 6:
                ((ea) this.d).f0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 7:
                ea eaVar3 = (ea) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j14 = this.c;
                c20 c20Var4 = (c20) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    eaVar3.getClass();
                    c20Var4.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    eaVar3.M.put(Long.valueOf(j14), stargiftupgradepreview);
                    c20Var4.a(stargiftupgradepreview);
                    return;
                }
            case 8:
                di.z6 z6Var = (di.z6) this.b;
                long j15 = this.c;
                TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList6 = z6Var.h;
                ArrayList arrayList7 = z6Var.g;
                int i12 = z6Var.a;
                org.telegram.messenger.a8.b("StoriesController update stories for dialog " + j15);
                z6Var.q0(j15, Collections.singletonList(tL_updateStory2.story), false);
                z6Var.o0(j15, Collections.singletonList(tL_updateStory2.story), true);
                a0.h hVar2 = z6Var.i;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar2.f(j15);
                ArrayList arrayList8 = new ArrayList();
                int i13 = z6Var.u;
                if (peerStories2 != null) {
                    TL_stories.StoryItem storyItem = tL_updateStory2.story;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        arrayList = arrayList8;
                        i7 = i13;
                        tL_updateStory = tL_updateStory2;
                        peerStories = peerStories2;
                        hVar = hVar2;
                        dt.k0.c(new us(dt.t(i12), j15, storyItem.id, 0));
                    } else {
                        tL_updateStory = tL_updateStory2;
                        hVar = hVar2;
                        peerStories = peerStories2;
                        arrayList = arrayList8;
                        i7 = i13;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 >= peerStories.stories.size()) {
                            z10 = false;
                        } else if (peerStories.stories.get(i14).id != storyItem.id) {
                            i14++;
                        } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i14);
                            jg.g.s(storyItem.id, new StringBuilder("StoriesController remove story id="));
                            z10 = true;
                            z11 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i14);
                            storyItem = di.z6.f(storyItem2, storyItem);
                            arrayList.add(storyItem);
                            peerStories.stories.set(i14, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            jg.g.s(storyItem.id, new StringBuilder("StoriesController update story id="));
                            z10 = true;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z9 = false;
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (di.s7.w(i12, storyItem)) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j15 > 0 && (user == null || (!user.self && !z6Var.O(user)))) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList.add(storyItem);
                        peerStories.stories.add(storyItem);
                        org.telegram.messenger.a8.b("StoriesController add new story id=" + storyItem.id + " total stories count " + peerStories.stories.size());
                        z6Var.Z(j15, storyItem);
                        z6Var.g(peerStories);
                        z9 = true;
                        z11 = true;
                    }
                    if (z11) {
                        if (!peerStories.stories.isEmpty() || z6Var.M(j15)) {
                            Collections.sort(peerStories.stories, di.z6.X);
                        } else {
                            arrayList7.remove(peerStories);
                            arrayList6.remove(peerStories);
                            hVar.l(org.telegram.messenger.m5.o(peerStories.peer));
                            z6Var.u--;
                        }
                        z9 = true;
                    }
                    tL_updateStory2 = tL_updateStory;
                } else {
                    i7 = i13;
                    TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j15 + " with new story DELETED");
                        return;
                    }
                    if (di.s7.w(i12, storyItem3)) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j15 + " with new story isExpired");
                        return;
                    }
                    if (j15 > 0 && (user == null || (!user.self && !z6Var.O(user)))) {
                        org.telegram.messenger.a8.b("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory2.peer;
                    tL_peerStories.stories.add(tL_updateStory2.story);
                    jg.g.s(tL_updateStory2.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long o4 = org.telegram.messenger.m5.o(tL_peerStories.peer);
                    z6Var.e0(o4, tL_peerStories);
                    if (o4 != p10.i(p10.s0).n) {
                        TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(o4));
                        z6Var.g(tL_peerStories);
                        if (a22 != null && !a22.stories_hidden) {
                            z6Var.a0(tL_peerStories);
                        }
                    }
                    org.telegram.messenger.a8.b("StoriesController applyNewStories " + o4);
                    z6Var.q0(o4, tL_peerStories.stories, false);
                    z6Var.u = z6Var.u + 1;
                    z6Var.R(j15);
                    z9 = true;
                }
                if (i7 != z6Var.u) {
                    z6Var.l.edit().putInt("total_stores", z6Var.u).apply();
                }
                z6Var.v(arrayList7);
                z6Var.v(arrayList6);
                if (z9) {
                    if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        qs.f(i12).k(qs.w5, Long.valueOf(j15), Integer.valueOf(tL_updateStory2.story.id));
                    } else {
                        i10 = 0;
                    }
                    qs.f(i12).k(qs.v5, new Object[i10]);
                }
                qp.s1(i12).D();
                return;
            case 9:
                di.h6 h6Var = (di.h6) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j16 = this.c;
                x60 x60Var = (x60) this.e;
                di.z6 z6Var2 = h6Var.c;
                int i15 = z6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    qp.s1(i15).Y3(tL_stories_peerStories.users, false);
                    qp.s1(i15).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories3 = tL_stories_peerStories.stories;
                    if (peerStories3 != null) {
                        for (int i16 = 0; i16 < peerStories3.stories.size(); i16++) {
                            if ((peerStories3.stories.get(i16).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories3.stories.get(i16) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar3 = z6Var2.E;
                                obj = (TL_stories.StoryItem) peerStories3.stories.get(i16);
                                hVar3.k(obj, j16);
                                x60Var.a(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                x60Var.a(obj);
                return;
            case 10:
                di.i6 i6Var = (di.i6) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j17 = this.c;
                c20 c20Var5 = (c20) this.e;
                di.z6 z6Var3 = i6Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    qp.s1(z6Var3.a).Y3(tL_stories_stories.users, false);
                    qp.s1(z6Var3.a).S3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar4 = z6Var3.E;
                        obj2 = (TL_stories.StoryItem) tL_stories_stories.stories.get(0);
                        hVar4.k(obj2, j17);
                        c20Var5.a(obj2);
                        return;
                    }
                }
                obj2 = null;
                c20Var5.a(obj2);
                return;
            case 11:
                di.r7 r7Var = (di.r7) this.b;
                View view = (View) this.d;
                long j18 = this.c;
                di.o7 o7Var = (di.o7) this.e;
                org.telegram.messenger.g0.i3(new d3(r7Var, view, j18, 9), 500L);
                o7Var.f(j18);
                return;
            case 12:
                fi.n8 n8Var = (fi.n8) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                yr yrVar = (yr) this.e;
                long j19 = this.c;
                boolean T = org.telegram.messenger.t3.T(chat);
                TLRPC.ChatFull G0 = yrVar.G0(j19, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.g0.h3(new kd(n8Var, T, j19, 1));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new d3(n8Var, j19, G0, 10));
                    return;
                }
            case 13:
                kg.t1 t1Var2 = (kg.t1) this.b;
                yr yrVar2 = (yr) this.d;
                long j20 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar2.b;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                kg.s1 s1Var = new kg.s1();
                                s1Var.a = sQLiteCursor2.intValue(0);
                                s1Var.b = sQLiteCursor2.stringValue(1);
                                s1Var.c = sQLiteCursor2.intValue(2);
                                s1Var.f = sQLiteCursor2.intValue(3);
                                arrayList9.add(s1Var);
                            } catch (Exception e10) {
                                e = e10;
                                t1Var = t1Var2;
                                arrayList3 = arrayList9;
                                z12 = true;
                                org.telegram.messenger.a8.g(e, z12);
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
                    int i17 = 0;
                    while (i17 < arrayList9.size()) {
                        kg.s1 s1Var2 = (kg.s1) arrayList9.get(i17);
                        boolean z14 = z13;
                        arrayList3 = arrayList9;
                        int i18 = i17;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[z14 ? 1 : 0] = Integer.valueOf(s1Var2.a);
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                            if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(z14 ? 1 : 0)) == null) {
                                t1Var = t1Var2;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z14), z14);
                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j20);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                yr.e(TLdeserialize, arrayList12, arrayList13, null);
                                t1Var = t1Var2;
                                try {
                                    ij ijVar2 = new ij(t1Var2.a, TLdeserialize, false, true);
                                    s1Var2.e = ijVar2;
                                    s1Var2.d = TLdeserialize.id;
                                    ijVar2.r0(false);
                                    s1Var2.e.l(s1Var2.a, s1Var2.b);
                                } catch (Exception e11) {
                                    e = e11;
                                    z12 = true;
                                    org.telegram.messenger.a8.g(e, z12);
                                }
                            }
                            sQLiteCursor2.dispose();
                            i17 = i18 + 1;
                            arrayList9 = arrayList3;
                            t1Var2 = t1Var;
                            z13 = false;
                        } catch (Exception e12) {
                            e = e12;
                            t1Var = t1Var2;
                            z12 = true;
                            org.telegram.messenger.a8.g(e, z12);
                        }
                    }
                    t1Var = t1Var2;
                    arrayList3 = arrayList9;
                    if (!arrayList13.isEmpty()) {
                        yrVar2.Q(TextUtils.join(",", arrayList13), arrayList11);
                    }
                    if (!arrayList12.isEmpty()) {
                        yrVar2.n0(arrayList12, arrayList10, false);
                    }
                } catch (Exception e13) {
                    e = e13;
                    t1Var = t1Var2;
                    arrayList3 = arrayList9;
                    z12 = true;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                org.telegram.messenger.g0.h3(new u0(t1Var, arrayList10, arrayList11, arrayList3, runnable, 17));
                return;
            case 14:
                kg.t1 t1Var3 = (kg.t1) this.b;
                yr yrVar3 = (yr) this.d;
                kg.s1 s1Var3 = (kg.s1) this.e;
                long j21 = this.c;
                try {
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    queryFinalized = yrVar3.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(s1Var3.a));
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor3 = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                        ijVar = null;
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
                        yr.e(TLdeserialize2, arrayList4, arrayList5, null);
                        ijVar = new ij(t1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    if (!arrayList5.isEmpty()) {
                        yrVar3.Q(TextUtils.join(",", arrayList5), arrayList15);
                    }
                    if (!arrayList4.isEmpty()) {
                        yrVar3.n0(arrayList4, arrayList14, false);
                    }
                    org.telegram.messenger.g0.h3(new u0(t1Var3, arrayList14, arrayList15, s1Var3, ijVar, 15));
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
            case 15:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 16:
                di diVar = (di) this.b;
                long j22 = this.c;
                cn cnVar2 = (cn) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                Context context = diVar.getContext();
                int i19 = diVar.D3;
                nj njVar = cnVar2.w5;
                if (njVar == null) {
                    njVar = nj.a();
                }
                new e1(context, i19, j22, njVar, cnVar2, g6Var, 0, new org.telegram.messenger.voip.k(24, diVar, cnVar2)).show();
                return;
            case 17:
                n11 n11Var = (n11) this.b;
                l60 l60Var = (l60) this.d;
                long j23 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                l60Var.u();
                TLRPC.User a23 = qp.s1(n11Var.e).a2(Long.valueOf(j23));
                if (a23 != null) {
                    cn cnVar3 = n11Var.s;
                    org.telegram.ui.Components.v4.q(cnVar3, -1, a23, chat2, true, new di.c1(n11Var, j23, i11), cnVar3.getResourceProvider());
                    return;
                }
                return;
            case 18:
                n11 n11Var2 = (n11) this.b;
                HashSet hashSet = (HashSet) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                long j24 = this.c;
                n11Var2.k0.removeAll(hashSet);
                n11Var2.q();
                int size = arrayList16.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj3 = arrayList16.get(i20);
                    i20++;
                    long intValue = ((Integer) obj3).intValue();
                    if (j24 == intValue) {
                        n11Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 19:
                yw ywVar2 = (yw) this.b;
                vo voVar = (vo) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j25 = this.c;
                int i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (voVar != null) {
                    LongSparseIntArray longSparseIntArray = voVar.j;
                    if (ywVar2.s4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            i21 = Math.min(i21, longSparseIntArray.valueAt(i22));
                        }
                        i21 -= ywVar2.P2;
                    }
                }
                int i23 = i21;
                TLRPC.EncryptedChat a12 = org.telegram.messenger.m5.C(j25) ? ywVar2.getMessagesController().a1(Integer.valueOf((int) (4294967295L & j25))) : null;
                UndoView k42 = ywVar2.k4();
                if (k42 == null) {
                    return;
                }
                if (ywVar2.s4(dialog)) {
                    ywVar2.E4(j25, false, voVar, i23, true);
                    k42.k(0L, 79, 1, 1600, null, null);
                } else {
                    ywVar2.E4(j25, true, voVar, i23, true);
                    k42.k(0L, 78, 1, 1600, null, null);
                    if (voVar != null) {
                        if (a12 != null) {
                            if (!voVar.h.contains(Long.valueOf(a12.user_id))) {
                                voVar.h.add(Long.valueOf(a12.user_id));
                            }
                        } else if (!voVar.h.contains(Long.valueOf(j25))) {
                            voVar.h.add(Long.valueOf(j25));
                        }
                    }
                }
                if (voVar != null) {
                    iz.z0(voVar, voVar.g, voVar.b, voVar.c, voVar.n, voVar.m, voVar.h, voVar.i, voVar.j, false, false, true, true, false, ywVar2, null);
                    ywVar2 = ywVar2;
                }
                ywVar2.getMessagesController().m4(ywVar2.X2, 0L, null);
                ywVar2.f5(true);
                if (ywVar2.e0 != null) {
                    int i24 = 0;
                    while (true) {
                        xw[] xwVarArr = ywVar2.e0;
                        if (i24 < xwVarArr.length) {
                            xwVarArr[i24].d.H = false;
                            i24++;
                        }
                    }
                }
                int i25 = qp.C8;
                ywVar2.u5(196608, true);
                return;
            case 20:
                a();
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
            case 26:
                h();
                return;
            default:
                vi.h hVar5 = (vi.h) this.b;
                vi.g gVar = (vi.g) this.d;
                long j26 = this.c;
                byte[] bArr = (byte[]) this.e;
                if (hVar5.G != 7) {
                    return;
                }
                long length = gVar.b.length();
                hVar5.a(gVar, length);
                synchronized (hVar5.l) {
                    if (gVar.d && !gVar.e) {
                        gVar.e = true;
                        hVar5.k.execute(new vi.c(hVar5, gVar, length, j26, 2));
                        hVar5.C = new ac.e(gVar.b, j26, bArr);
                        hVar5.s(8);
                        j2.n nVar = hVar5.f;
                        ac.e eVar = hVar5.C;
                        MediaController mediaController = ((me) nVar.b).a;
                        String[] strArr = MediaController.V1;
                        mediaController.s(eVar);
                        hVar5.c();
                        hVar5.t();
                        hVar5.l("completed");
                    }
                }
                return;
        }
    }

    public /* synthetic */ w2(ea eaVar, c20 c20Var, TL_stars.StarGift starGift, long j3) {
        this.a = 4;
        this.d = eaVar;
        this.e = c20Var;
        this.b = starGift;
        this.c = j3;
    }

    public /* synthetic */ w2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = j3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ w2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ w2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ w2(org.telegram.ui.Wallet.p0 p0Var, c20 c20Var, long j3, String str) {
        this.a = 25;
        this.b = p0Var;
        this.e = c20Var;
        this.c = j3;
        this.d = str;
    }
}
