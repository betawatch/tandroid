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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.messenger.lj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.rs;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.hz;
import org.telegram.ui.jd0;
import org.telegram.ui.m80;
import org.telegram.ui.n80;
import org.telegram.ui.t60;
import org.telegram.ui.tp;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f2(v8 v8Var, Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = v8Var;
        this.b = obj;
        this.c = j3;
        this.e = obj2;
    }

    private final void a() {
        c40 c40Var = (c40) this.b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        if (r3Var == null || c40Var.n2) {
            return;
        }
        r3Var.a(this.c);
        c40Var.Q0(true);
        k20 k20Var = c40Var.D3;
        if (k20Var != null) {
            k20Var.dismiss();
        }
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        c40Var.n1().k(0L, 34, user, c40Var.U2, null, null);
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.b;
        np npVar = (np) this.d;
        tp tpVar = (tp) this.e;
        String str = LaunchActivity.C1;
        if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
            tpVar.run();
            return;
        }
        TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
        npVar.Y3(tL_stories_peerStories.users, false);
        npVar.P1().d0(this.c, tL_stories_peerStories.stories);
        tpVar.run();
    }

    private final void c() {
        n80 n80Var = (n80) this.b;
        LaunchActivity launchActivity = n80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i7 = a10.a;
            np s12 = np.s1(i7);
            long j3 = this.c;
            long j10 = -j3;
            if (s12.g1(j10, false, null) != null) {
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(j10));
                np.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.c2.l(M0, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, e2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = np.s1(i7).N0(j10);
            if (N0 != null) {
                if (N0.call != null) {
                    np.s1(i7).g1(j10, true, new m80(n80Var, a10, j3, e2Var, 0));
                } else if (e2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.n(null, 2131749152, org.telegram.ui.Components.cc.a0(e2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void d() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        ff ffVar = (ff) this.e;
        Drawable[] drawableArr = PhotoViewer.Z8;
        long j3 = this.c;
        bi.i1 i1Var = new bi.i1(photoViewer, str, ffVar, j3, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new jd0(25, i1Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            i1Var.a(ez.s(ffVar.I, j3, null, true));
        } else {
            i1Var.a(bitmap);
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
        z10 z10Var = (z10) this.e;
        String str = (String) this.d;
        if (z10Var == null) {
            p0Var.getClass();
            return;
        }
        if (this.c != p0Var.l()) {
            str = "STORAGE_CANCELED";
        }
        z10Var.a(str);
    }

    private final void h() {
        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.d;
        try {
            ((z10) this.e).a(this.c == p0Var.l() ? i0Var : null);
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
        r26 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047a  */
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
        kg.v1 v1Var;
        ArrayList arrayList3;
        boolean z13;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        SQLiteCursor queryFinalized;
        gj gjVar;
        NativeByteBuffer byteBufferValue2;
        boolean z14 = false;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                v8 v8Var = (v8) this.d;
                long j3 = this.c;
                z10 z10Var = (z10) this.e;
                if (v8Var.e) {
                    c6Var.s1(j3, z10Var);
                    return;
                }
                org.telegram.ui.Components.xb Q = c6Var.k().Q(R.raw.error, 36, hd.a0(null, null, 2131743878, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 1:
                c6 c6Var2 = (c6) this.b;
                long j10 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                yw ywVar = (yw) this.e;
                org.telegram.messenger.d4.f(c6Var2.a).s(j10, new ig.b(null, tL_starGiftUnique.slug), null, true);
                ywVar.presentFragment(an.ua(j10), true);
                return;
            case 2:
                c6 c6Var3 = (c6) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j11 = this.c;
                z10 z10Var2 = (z10) this.e;
                c6Var3.getClass();
                zArr[0] = true;
                c6Var3.g2.setLoading(false);
                c6Var3.s1(j11, z10Var2);
                return;
            case 3:
                ((v8) this.d).b0((gj) this.e, ((h6) this.b).a, this.c, true, true, null);
                return;
            case 4:
                v8 v8Var2 = (v8) this.d;
                z10 z10Var3 = (z10) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                long j12 = this.c;
                if (v8Var2.e) {
                    v8Var2.H(starGift, j12, null, true, z10Var3);
                    return;
                } else {
                    v8.e("NO_BALANCE");
                    z10Var3.a(null);
                    return;
                }
            case 5:
                an anVar = (an) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j13 = this.c;
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
                TLRPC.Document document = starGift2.sticker;
                String M0 = hd.M0(2131745109, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(hd.G((int) j13, "StarsGiftCompletedText", new Object[0]));
                }
                a02.s(document, M0, charSequence).k(true);
                return;
            case 6:
                ((v8) this.d).f0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 7:
                v8 v8Var3 = (v8) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j14 = this.c;
                z10 z10Var4 = (z10) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    v8Var3.getClass();
                    z10Var4.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    v8Var3.M.put(Long.valueOf(j14), stargiftupgradepreview);
                    z10Var4.a(stargiftupgradepreview);
                    return;
                }
            case 8:
                fi.s6 s6Var = (fi.s6) this.b;
                long j15 = this.c;
                TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList6 = s6Var.h;
                ArrayList arrayList7 = s6Var.g;
                int i11 = s6Var.a;
                org.telegram.messenger.a8.b("StoriesController update stories for dialog " + j15);
                s6Var.q0(j15, Collections.singletonList(tL_updateStory2.story), false);
                s6Var.o0(j15, Collections.singletonList(tL_updateStory2.story), true);
                a0.h hVar2 = s6Var.i;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar2.f(j15);
                ArrayList arrayList8 = new ArrayList();
                int i12 = s6Var.u;
                if (peerStories2 != null) {
                    TL_stories.StoryItem storyItem = tL_updateStory2.story;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        arrayList = arrayList8;
                        i7 = i12;
                        tL_updateStory = tL_updateStory2;
                        peerStories = peerStories2;
                        hVar = hVar2;
                        at.l0.c(new rs(at.t(i11), j15, storyItem.id, 0));
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
                            i5.c.r(storyItem.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i13);
                            storyItem = fi.s6.f(storyItem2, storyItem);
                            arrayList.add(storyItem);
                            peerStories.stories.set(i13, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            i5.c.r(storyItem.id, new StringBuilder("StoriesController update story id="));
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
                        if (fi.l7.w(i11, storyItem)) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j15 > 0 && (user == null || (!user.self && !s6Var.O(user)))) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList.add(storyItem);
                        peerStories.stories.add(storyItem);
                        org.telegram.messenger.a8.b("StoriesController add new story id=" + storyItem.id + " total stories count " + peerStories.stories.size());
                        s6Var.Z(j15, storyItem);
                        s6Var.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || s6Var.M(j15)) {
                            Collections.sort(peerStories.stories, fi.s6.X);
                        } else {
                            arrayList7.remove(peerStories);
                            arrayList6.remove(peerStories);
                            hVar.l(org.telegram.messenger.m5.o(peerStories.peer));
                            s6Var.u--;
                        }
                        z10 = true;
                    }
                    tL_updateStory2 = tL_updateStory;
                } else {
                    i7 = i12;
                    TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j15 + " with new story DELETED");
                        return;
                    }
                    if (fi.l7.w(i11, storyItem3)) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j15 + " with new story isExpired");
                        return;
                    }
                    if (j15 > 0 && (user == null || (!user.self && !s6Var.O(user)))) {
                        org.telegram.messenger.a8.b("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory2.peer;
                    tL_peerStories.stories.add(tL_updateStory2.story);
                    i5.c.r(tL_updateStory2.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long o4 = org.telegram.messenger.m5.o(tL_peerStories.peer);
                    s6Var.e0(o4, tL_peerStories);
                    if (o4 != m10.i(m10.t0).n) {
                        TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(o4));
                        s6Var.g(tL_peerStories);
                        if (a22 != null && !a22.stories_hidden) {
                            s6Var.a0(tL_peerStories);
                        }
                    }
                    org.telegram.messenger.a8.b("StoriesController applyNewStories " + o4);
                    s6Var.q0(o4, tL_peerStories.stories, false);
                    s6Var.u = s6Var.u + 1;
                    s6Var.R(j15);
                    z10 = true;
                }
                if (i7 != s6Var.u) {
                    s6Var.l.edit().putInt("total_stores", s6Var.u).apply();
                }
                s6Var.v(arrayList7);
                s6Var.v(arrayList6);
                if (z10) {
                    if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        ns.f(i11).k(ns.w5, Long.valueOf(j15), Integer.valueOf(tL_updateStory2.story.id));
                    } else {
                        i10 = 0;
                    }
                    ns.f(i11).k(ns.v5, new Object[i10]);
                }
                np.s1(i11).D();
                return;
            case 9:
                fi.z5 z5Var = (fi.z5) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j16 = this.c;
                t60 t60Var = (t60) this.e;
                fi.s6 s6Var2 = z5Var.c;
                int i14 = s6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    np.s1(i14).Y3(tL_stories_peerStories.users, false);
                    np.s1(i14).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories3 = tL_stories_peerStories.stories;
                    if (peerStories3 != null) {
                        for (int i15 = 0; i15 < peerStories3.stories.size(); i15++) {
                            if ((peerStories3.stories.get(i15).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories3.stories.get(i15) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar3 = s6Var2.E;
                                obj = (TL_stories.StoryItem) peerStories3.stories.get(i15);
                                hVar3.k(obj, j16);
                                t60Var.a(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                t60Var.a(obj);
                return;
            case 10:
                fi.a6 a6Var = (fi.a6) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j17 = this.c;
                z10 z10Var5 = (z10) this.e;
                fi.s6 s6Var3 = a6Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    np.s1(s6Var3.a).Y3(tL_stories_stories.users, false);
                    np.s1(s6Var3.a).S3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar4 = s6Var3.E;
                        obj2 = (TL_stories.StoryItem) tL_stories_stories.stories.get(0);
                        hVar4.k(obj2, j17);
                        z10Var5.a(obj2);
                        return;
                    }
                }
                obj2 = null;
                z10Var5.a(obj2);
                return;
            case 11:
                fi.k7 k7Var = (fi.k7) this.b;
                View view = (View) this.d;
                long j18 = this.c;
                fi.h7 h7Var = (fi.h7) this.e;
                org.telegram.messenger.g0.i3(new bi.m1(k7Var, view, j18, 10), 500L);
                h7Var.f(j18);
                return;
            case 12:
                hi.l8 l8Var = (hi.l8) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                vr vrVar = (vr) this.e;
                long j19 = this.c;
                boolean T = org.telegram.messenger.t3.T(chat);
                TLRPC.ChatFull G0 = vrVar.G0(j19, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.g0.h3(new sb(l8Var, T, j19, 1));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new bi.m1(l8Var, j19, G0, 11));
                    return;
                }
            case 13:
                kg.v1 v1Var2 = (kg.v1) this.b;
                vr vrVar2 = (vr) this.d;
                long j20 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = vrVar2.b;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                kg.u1 u1Var = new kg.u1();
                                u1Var.a = sQLiteCursor2.intValue(0);
                                u1Var.b = sQLiteCursor2.stringValue(1);
                                u1Var.c = sQLiteCursor2.intValue(2);
                                u1Var.f = sQLiteCursor2.intValue(3);
                                arrayList9.add(u1Var);
                            } catch (Exception e10) {
                                e = e10;
                                v1Var = v1Var2;
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
                        kg.u1 u1Var2 = (kg.u1) arrayList9.get(i16);
                        boolean z15 = z14;
                        int i17 = i16;
                        arrayList3 = arrayList9;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[z15 ? 1 : 0] = Integer.valueOf(u1Var2.a);
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                            if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(z15 ? 1 : 0)) == null) {
                                v1Var = v1Var2;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z15), z15);
                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j20);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                vr.e(TLdeserialize, arrayList12, arrayList13, null);
                                v1Var = v1Var2;
                                try {
                                    gj gjVar2 = new gj(v1Var2.a, TLdeserialize, false, true);
                                    u1Var2.e = gjVar2;
                                    u1Var2.d = TLdeserialize.id;
                                    gjVar2.r0(false);
                                    u1Var2.e.l(u1Var2.a, u1Var2.b);
                                } catch (Exception e11) {
                                    e = e11;
                                    z13 = true;
                                    org.telegram.messenger.a8.g(e, z13);
                                }
                            }
                            sQLiteCursor2.dispose();
                            i16 = i17 + 1;
                            arrayList9 = arrayList3;
                            v1Var2 = v1Var;
                            z14 = false;
                        } catch (Exception e12) {
                            e = e12;
                            v1Var = v1Var2;
                            z13 = true;
                            org.telegram.messenger.a8.g(e, z13);
                        }
                    }
                    v1Var = v1Var2;
                    arrayList3 = arrayList9;
                    if (!arrayList13.isEmpty()) {
                        vrVar2.Q(TextUtils.join(",", arrayList13), arrayList11);
                    }
                    if (!arrayList12.isEmpty()) {
                        vrVar2.n0(arrayList12, arrayList10, false);
                    }
                } catch (Exception e13) {
                    e = e13;
                    v1Var = v1Var2;
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
                org.telegram.messenger.g0.h3(new ai.b(v1Var, arrayList10, arrayList11, arrayList3, runnable, 19));
                return;
            case 14:
                kg.v1 v1Var3 = (kg.v1) this.b;
                vr vrVar3 = (vr) this.d;
                kg.u1 u1Var3 = (kg.u1) this.e;
                long j21 = this.c;
                try {
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    queryFinalized = vrVar3.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(u1Var3.a));
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor3 = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                        gjVar = null;
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
                        vr.e(TLdeserialize2, arrayList4, arrayList5, null);
                        gjVar = new gj(v1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    if (!arrayList5.isEmpty()) {
                        vrVar3.Q(TextUtils.join(",", arrayList5), arrayList15);
                    }
                    if (!arrayList4.isEmpty()) {
                        vrVar3.n0(arrayList4, arrayList14, false);
                    }
                    org.telegram.messenger.g0.h3(new ai.b(v1Var3, arrayList14, arrayList15, u1Var3, gjVar, 17));
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
                ki kiVar = (ki) this.b;
                long j22 = this.c;
                an anVar2 = (an) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Context context = kiVar.getContext();
                int i18 = kiVar.H3;
                lj ljVar = anVar2.x5;
                if (ljVar == null) {
                    ljVar = lj.a();
                }
                new s0(context, i18, j22, ljVar, anVar2, e6Var, 0, new li.v(29, kiVar, anVar2)).show();
                return;
            case 17:
                p11 p11Var = (p11) this.b;
                m60 m60Var = (m60) this.d;
                long j23 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                m60Var.u();
                TLRPC.User a23 = np.s1(p11Var.e).a2(Long.valueOf(j23));
                if (a23 != null) {
                    an anVar3 = p11Var.s;
                    org.telegram.ui.Components.t4.q(anVar3, -1, a23, chat2, true, new ai.c0(p11Var, j23, 6), anVar3.getResourceProvider());
                    return;
                }
                return;
            case 18:
                p11 p11Var2 = (p11) this.b;
                HashSet hashSet = (HashSet) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                long j24 = this.c;
                p11Var2.l0.removeAll(hashSet);
                p11Var2.q();
                int size = arrayList16.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj3 = arrayList16.get(i19);
                    i19++;
                    long intValue = ((Integer) obj3).intValue();
                    if (j24 == intValue) {
                        p11Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 19:
                yw ywVar2 = (yw) this.b;
                so soVar = (so) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j25 = this.c;
                int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (soVar != null) {
                    LongSparseIntArray longSparseIntArray = soVar.j;
                    if (ywVar2.s4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            i20 = Math.min(i20, longSparseIntArray.valueAt(i21));
                        }
                        i20 -= ywVar2.Q2;
                    }
                }
                int i22 = i20;
                TLRPC.EncryptedChat a12 = org.telegram.messenger.m5.C(j25) ? ywVar2.getMessagesController().a1(Integer.valueOf((int) (4294967295L & j25))) : null;
                UndoView k42 = ywVar2.k4();
                if (k42 == null) {
                    return;
                }
                if (ywVar2.s4(dialog)) {
                    ywVar2.E4(j25, false, soVar, i22, true);
                    k42.k(0L, 79, 1, 1600, null, null);
                } else {
                    ywVar2.E4(j25, true, soVar, i22, true);
                    k42.k(0L, 78, 1, 1600, null, null);
                    if (soVar != null) {
                        if (a12 != null) {
                            if (!soVar.h.contains(Long.valueOf(a12.user_id))) {
                                soVar.h.add(Long.valueOf(a12.user_id));
                            }
                        } else if (!soVar.h.contains(Long.valueOf(j25))) {
                            soVar.h.add(Long.valueOf(j25));
                        }
                    }
                }
                if (soVar != null) {
                    hz.z0(soVar, soVar.g, soVar.b, soVar.c, soVar.n, soVar.m, soVar.h, soVar.i, soVar.j, false, false, true, true, false, ywVar2, null);
                    ywVar2 = ywVar2;
                }
                ywVar2.getMessagesController().m4(ywVar2.Y2, 0L, null);
                ywVar2.f5(true);
                if (ywVar2.f0 != null) {
                    int i23 = 0;
                    while (true) {
                        xw[] xwVarArr = ywVar2.f0;
                        if (i23 < xwVarArr.length) {
                            xwVarArr[i23].d.I = false;
                            i23++;
                        }
                    }
                }
                int i24 = np.D8;
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
                yi.j jVar = (yi.j) this.b;
                yi.i iVar = (yi.i) this.d;
                long j26 = this.c;
                byte[] bArr = (byte[]) this.e;
                if (jVar.G != 7) {
                    return;
                }
                long length = iVar.b.length();
                jVar.a(iVar, length);
                synchronized (jVar.l) {
                    if (iVar.d && !iVar.e) {
                        iVar.e = true;
                        jVar.k.execute(new yi.c(jVar, iVar, length, j26, 2));
                        jVar.C = new ac.e(iVar.b, j26, bArr);
                        jVar.s(8);
                        ji.j jVar2 = jVar.f;
                        ac.e eVar = jVar.C;
                        MediaController mediaController = ((le) jVar2.b).a;
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

    public /* synthetic */ f2(v8 v8Var, z10 z10Var, TL_stars.StarGift starGift, long j3) {
        this.a = 4;
        this.d = v8Var;
        this.e = z10Var;
        this.b = starGift;
        this.c = j3;
    }

    public /* synthetic */ f2(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = j3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ f2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ f2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ f2(org.telegram.ui.Wallet.p0 p0Var, z10 z10Var, long j3, String str) {
        this.a = 25;
        this.b = p0Var;
        this.e = z10Var;
        this.c = j3;
        this.d = str;
    }
}
