package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ej;
import org.telegram.messenger.ge;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ls;
import org.telegram.messenger.mo;
import org.telegram.messenger.qr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ez;
import org.telegram.ui.hk0;
import org.telegram.ui.j80;
import org.telegram.ui.k80;
import org.telegram.ui.p60;
import org.telegram.ui.pp;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l2(e9 e9Var, Object obj, long j10, Object obj2, int i3) {
        this.a = i3;
        this.d = e9Var;
        this.b = obj;
        this.c = j10;
        this.e = obj2;
    }

    private final void a() {
        x30 x30Var = (x30) this.b;
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var == null || x30Var.k2) {
            return;
        }
        r3Var.a(this.c);
        x30Var.Q0(true);
        d20 d20Var = x30Var.w3;
        if (d20Var != null) {
            d20Var.dismiss();
        }
        try {
            s1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        s1VarArr[0] = null;
        x30Var.m1().k(0L, 34, user, x30Var.R2, null, null);
    }

    private final void b() {
        TLObject tLObject = (TLObject) this.b;
        hp hpVar = (hp) this.d;
        pp ppVar = (pp) this.e;
        String str = LaunchActivity.E1;
        if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
            ppVar.run();
            return;
        }
        TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
        hpVar.Y3(tL_stories_peerStories.users, false);
        hpVar.P1().d0(this.c, tL_stories_peerStories.stories);
        ppVar.run();
    }

    private final void c() {
        k80 k80Var = (k80) this.b;
        LaunchActivity launchActivity = k80Var.h;
        String str = (String) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
        if (str != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(launchActivity.P);
            int i3 = a10.a;
            hp s12 = hp.s1(i3);
            long j10 = this.c;
            long j11 = -j10;
            if (s12.g1(j11, false, null) != null) {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(j11));
                hp.s1(i3).j1(j10);
                org.telegram.ui.Components.voip.n1.l(M0, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, d2Var, a10);
                return;
            }
            TLRPC.ChatFull N0 = hp.s1(i3).N0(j11);
            if (N0 != null) {
                if (N0.call != null) {
                    hp.s1(i3).g1(j11, true, new j80(k80Var, a10, j10, d2Var, 0));
                } else if (d2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.o(null, 2131749160, org.telegram.ui.Components.fc.a0(d2Var), R.raw.linkbroken, 36);
                }
            }
        }
    }

    private final void e() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        ye yeVar = (ye) this.e;
        Drawable[] drawableArr = PhotoViewer.V8;
        long j10 = this.c;
        ai.m1 m1Var = new ai.m1(photoViewer, str, yeVar, j10, 7);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            org.telegram.messenger.g0.A0(photoViewer.D2, createBitmap, new hk0(3, m1Var, createBitmap));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            m1Var.a(yy.s(yeVar.I, j10, null, true));
        } else {
            m1Var.a(bitmap);
        }
    }

    private final void f() {
        org.telegram.ui.Wallet.h0 h0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
        long j10 = this.c;
        org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.e;
        byte[] bArr3 = null;
        for (int i3 = 0; i3 < encryptedsecretphrasepartArr.length; i3++) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i3].data, 0, 32);
                byte[] bArr4 = encryptedsecretphrasepartArr[i3].data;
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
                                        org.telegram.ui.Wallet.k0.j("getSecretPhrase: part " + i3 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
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
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: couldn't decrypt " + i3 + " part");
                    jVar.a(null, "WALLET_PART_" + i3 + "_CANT_DECRYPT");
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
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: no parts???");
            jVar.a(null, "WALLET_NO_PARTS");
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
                org.telegram.ui.Wallet.k0.H("getSecretPhrase, received the phrase!");
                jVar.a(h0Var, null);
                return;
            }
            org.telegram.ui.Wallet.k0.j("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr8) + " derived=" + Utilities.f(secretPhraseToPublicKey));
            h0Var.close();
            jVar.a(null, "WALLET_WORDS_DONT_MATCH");
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
            jVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
            org.telegram.ui.Wallet.k0.k("getSecretPhrase: encryption error", th);
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    private final void g() {
        org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.b;
        u10 u10Var = (u10) this.e;
        String str = (String) this.d;
        if (u10Var == null) {
            o0Var.getClass();
            return;
        }
        if (this.c != o0Var.l()) {
            str = "STORAGE_CANCELED";
        }
        u10Var.a(str);
    }

    private final void h() {
        org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.b;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.d;
        try {
            ((u10) this.e).a(this.c == o0Var.l() ? h0Var : null);
        } finally {
            if (h0Var != null) {
                h0Var.close();
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
        int i3;
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
        lg.u1 u1Var;
        ArrayList arrayList3;
        boolean z13;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        SQLiteCursor queryFinalized;
        zi ziVar;
        NativeByteBuffer byteBufferValue2;
        boolean z14 = false;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.b;
                e9 e9Var = (e9) this.d;
                long j10 = this.c;
                u10 u10Var = (u10) this.e;
                if (e9Var.e) {
                    l6Var.s1(j10, u10Var);
                    return;
                }
                org.telegram.ui.Components.ac Q = l6Var.k().Q(R.raw.error, 36, bd.a0(null, null, 2131743888, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 1:
                l6 l6Var2 = (l6) this.b;
                long j11 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                uw uwVar = (uw) this.e;
                org.telegram.messenger.d4.f(l6Var2.a).s(j11, new jg.b(null, tL_starGiftUnique.slug), null, true);
                uwVar.presentFragment(wm.ra(j11), true);
                return;
            case 2:
                l6 l6Var3 = (l6) this.b;
                boolean[] zArr = (boolean[]) this.d;
                long j12 = this.c;
                u10 u10Var2 = (u10) this.e;
                l6Var3.getClass();
                zArr[0] = true;
                l6Var3.d2.setLoading(false);
                l6Var3.s1(j12, u10Var2);
                return;
            case 3:
                ((e9) this.d).b0((zi) this.e, ((q6) this.b).a, this.c, true, true, null);
                return;
            case 4:
                e9 e9Var2 = (e9) this.d;
                u10 u10Var3 = (u10) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                long j13 = this.c;
                if (e9Var2.e) {
                    e9Var2.H(starGift, j13, null, true, u10Var3);
                    return;
                } else {
                    e9.e("NO_BALANCE");
                    u10Var3.a(null);
                    return;
                }
            case 5:
                wm wmVar = (wm) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                long j14 = this.c;
                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
                TLRPC.Document document = starGift2.sticker;
                String M0 = bd.M0(2131745119, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(bd.G((int) j14, "StarsGiftCompletedText", new Object[0]));
                }
                a02.s(document, M0, charSequence).k(true);
                return;
            case 6:
                ((e9) this.d).f0((LaunchActivity) this.b, this.c, (String) this.e);
                return;
            case 7:
                e9 e9Var3 = (e9) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j15 = this.c;
                u10 u10Var4 = (u10) this.e;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    e9Var3.getClass();
                    u10Var4.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    e9Var3.M.put(Long.valueOf(j15), stargiftupgradepreview);
                    u10Var4.a(stargiftupgradepreview);
                    return;
                }
            case 8:
                ei.z6 z6Var = (ei.z6) this.b;
                long j16 = this.c;
                TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ArrayList arrayList6 = z6Var.h;
                ArrayList arrayList7 = z6Var.g;
                int i11 = z6Var.a;
                org.telegram.messenger.a8.b("StoriesController update stories for dialog " + j16);
                z6Var.q0(j16, Collections.singletonList(tL_updateStory2.story), false);
                z6Var.o0(j16, Collections.singletonList(tL_updateStory2.story), true);
                a0.h hVar2 = z6Var.i;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar2.f(j16);
                ArrayList arrayList8 = new ArrayList();
                int i12 = z6Var.u;
                if (peerStories2 != null) {
                    TL_stories.StoryItem storyItem = tL_updateStory2.story;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        arrayList = arrayList8;
                        i3 = i12;
                        tL_updateStory = tL_updateStory2;
                        peerStories = peerStories2;
                        hVar = hVar2;
                        us.l0.c(new ls(us.t(i11), j16, storyItem.id, 0));
                    } else {
                        tL_updateStory = tL_updateStory2;
                        hVar = hVar2;
                        peerStories = peerStories2;
                        arrayList = arrayList8;
                        i3 = i12;
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i13).id != storyItem.id) {
                            i13++;
                        } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i13);
                            k2.p1.q(storyItem.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i13);
                            storyItem = ei.z6.f(storyItem2, storyItem);
                            arrayList.add(storyItem);
                            peerStories.stories.set(i13, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            k2.p1.q(storyItem.id, new StringBuilder("StoriesController update story id="));
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
                        if (ei.s7.w(i11, storyItem)) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j16 > 0 && (user == null || (!user.self && !z6Var.O(user)))) {
                            org.telegram.messenger.a8.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList.add(storyItem);
                        peerStories.stories.add(storyItem);
                        org.telegram.messenger.a8.b("StoriesController add new story id=" + storyItem.id + " total stories count " + peerStories.stories.size());
                        z6Var.Z(j16, storyItem);
                        z6Var.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || z6Var.M(j16)) {
                            Collections.sort(peerStories.stories, ei.z6.X);
                        } else {
                            arrayList7.remove(peerStories);
                            arrayList6.remove(peerStories);
                            hVar.l(org.telegram.messenger.m5.o(peerStories.peer));
                            z6Var.u--;
                        }
                        z10 = true;
                    }
                    tL_updateStory2 = tL_updateStory;
                } else {
                    i3 = i12;
                    TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j16 + " with new story DELETED");
                        return;
                    }
                    if (ei.s7.w(i11, storyItem3)) {
                        org.telegram.messenger.a8.b("StoriesController can't add user " + j16 + " with new story isExpired");
                        return;
                    }
                    if (j16 > 0 && (user == null || (!user.self && !z6Var.O(user)))) {
                        org.telegram.messenger.a8.b("StoriesController can't add user cause is not contact");
                        return;
                    }
                    TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                    tL_peerStories.peer = tL_updateStory2.peer;
                    tL_peerStories.stories.add(tL_updateStory2.story);
                    k2.p1.q(tL_updateStory2.story.id, new StringBuilder("StoriesController add new user with story id="));
                    long o10 = org.telegram.messenger.m5.o(tL_peerStories.peer);
                    z6Var.e0(o10, tL_peerStories);
                    if (o10 != h10.i(h10.t0).n) {
                        TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(o10));
                        z6Var.g(tL_peerStories);
                        if (a22 != null && !a22.stories_hidden) {
                            z6Var.a0(tL_peerStories);
                        }
                    }
                    org.telegram.messenger.a8.b("StoriesController applyNewStories " + o10);
                    z6Var.q0(o10, tL_peerStories.stories, false);
                    z6Var.u = z6Var.u + 1;
                    z6Var.R(j16);
                    z10 = true;
                }
                if (i3 != z6Var.u) {
                    z6Var.l.edit().putInt("total_stores", z6Var.u).apply();
                }
                z6Var.v(arrayList7);
                z6Var.v(arrayList6);
                if (z10) {
                    if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                        i10 = 0;
                        hs.f(i11).k(hs.w5, Long.valueOf(j16), Integer.valueOf(tL_updateStory2.story.id));
                    } else {
                        i10 = 0;
                    }
                    hs.f(i11).k(hs.v5, new Object[i10]);
                }
                hp.s1(i11).D();
                return;
            case 9:
                ei.h6 h6Var = (ei.h6) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                long j17 = this.c;
                p60 p60Var = (p60) this.e;
                ei.z6 z6Var2 = h6Var.c;
                int i14 = z6Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    hp.s1(i14).Y3(tL_stories_peerStories.users, false);
                    hp.s1(i14).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories3 = tL_stories_peerStories.stories;
                    if (peerStories3 != null) {
                        for (int i15 = 0; i15 < peerStories3.stories.size(); i15++) {
                            if ((peerStories3.stories.get(i15).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories3.stories.get(i15) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar3 = z6Var2.E;
                                obj = (TL_stories.StoryItem) peerStories3.stories.get(i15);
                                hVar3.k(obj, j17);
                                p60Var.a(obj);
                                return;
                            }
                        }
                    }
                }
                obj = null;
                p60Var.a(obj);
                return;
            case 10:
                ei.i6 i6Var = (ei.i6) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                long j18 = this.c;
                u10 u10Var5 = (u10) this.e;
                ei.z6 z6Var3 = i6Var.c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    hp.s1(z6Var3.a).Y3(tL_stories_stories.users, false);
                    hp.s1(z6Var3.a).S3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar4 = z6Var3.E;
                        obj2 = (TL_stories.StoryItem) tL_stories_stories.stories.get(0);
                        hVar4.k(obj2, j18);
                        u10Var5.a(obj2);
                        return;
                    }
                }
                obj2 = null;
                u10Var5.a(obj2);
                return;
            case 11:
                ei.r7 r7Var = (ei.r7) this.b;
                View view = (View) this.d;
                long j19 = this.c;
                ei.o7 o7Var = (ei.o7) this.e;
                org.telegram.messenger.g0.i3(new ai.r1(r7Var, view, j19, 10), 500L);
                o7Var.f(j19);
                return;
            case 12:
                gi.o8 o8Var = (gi.o8) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                qr qrVar = (qr) this.e;
                long j20 = this.c;
                boolean T = org.telegram.messenger.t3.T(chat);
                TLRPC.ChatFull G0 = qrVar.G0(j20, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.g0.h3(new cc(o8Var, T, j20, 1));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new ai.r1(o8Var, j20, G0, 11));
                    return;
                }
            case 13:
                lg.u1 u1Var2 = (lg.u1) this.b;
                qr qrVar2 = (qr) this.d;
                long j21 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar2.b;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                lg.t1 t1Var = new lg.t1();
                                t1Var.a = sQLiteCursor2.intValue(0);
                                t1Var.b = sQLiteCursor2.stringValue(1);
                                t1Var.c = sQLiteCursor2.intValue(2);
                                t1Var.f = sQLiteCursor2.intValue(3);
                                arrayList9.add(t1Var);
                            } catch (Exception e10) {
                                e = e10;
                                u1Var = u1Var2;
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
                        lg.t1 t1Var2 = (lg.t1) arrayList9.get(i16);
                        boolean z15 = z14;
                        int i17 = i16;
                        arrayList3 = arrayList9;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[z15 ? 1 : 0] = Integer.valueOf(t1Var2.a);
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                            if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(z15 ? 1 : 0)) == null) {
                                u1Var = u1Var2;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z15), z15);
                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j21);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                qr.e(TLdeserialize, arrayList12, arrayList13, null);
                                u1Var = u1Var2;
                                try {
                                    zi ziVar2 = new zi(u1Var2.a, TLdeserialize, false, true);
                                    t1Var2.e = ziVar2;
                                    t1Var2.d = TLdeserialize.id;
                                    ziVar2.r0(false);
                                    t1Var2.e.l(t1Var2.a, t1Var2.b);
                                } catch (Exception e11) {
                                    e = e11;
                                    z13 = true;
                                    org.telegram.messenger.a8.g(e, z13);
                                }
                            }
                            sQLiteCursor2.dispose();
                            i16 = i17 + 1;
                            arrayList9 = arrayList3;
                            u1Var2 = u1Var;
                            z14 = false;
                        } catch (Exception e12) {
                            e = e12;
                            u1Var = u1Var2;
                            z13 = true;
                            org.telegram.messenger.a8.g(e, z13);
                        }
                    }
                    u1Var = u1Var2;
                    arrayList3 = arrayList9;
                    if (!arrayList13.isEmpty()) {
                        qrVar2.Q(TextUtils.join(",", arrayList13), arrayList11);
                    }
                    if (!arrayList12.isEmpty()) {
                        qrVar2.n0(arrayList12, arrayList10, false);
                    }
                } catch (Exception e13) {
                    e = e13;
                    u1Var = u1Var2;
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
                org.telegram.messenger.g0.h3(new ai.t6(u1Var, arrayList10, arrayList11, arrayList3, runnable, 18));
                return;
            case 14:
                lg.u1 u1Var3 = (lg.u1) this.b;
                qr qrVar3 = (qr) this.d;
                lg.t1 t1Var3 = (lg.t1) this.e;
                long j22 = this.c;
                try {
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    queryFinalized = qrVar3.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(t1Var3.a));
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor3 = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                        ziVar = null;
                    } else {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                        TLdeserialize2.send_state = queryFinalized.intValue(1);
                        TLdeserialize2.readAttachPath(byteBufferValue2, j22);
                        byteBufferValue2.reuse();
                        TLdeserialize2.id = queryFinalized.intValue(2);
                        TLdeserialize2.date = queryFinalized.intValue(3);
                        TLdeserialize2.flags |= TLObject.FLAG_30;
                        TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                        TLdeserialize2.ttl = queryFinalized.intValue(5);
                        qr.e(TLdeserialize2, arrayList4, arrayList5, null);
                        ziVar = new zi(u1Var3.a, TLdeserialize2, false, true);
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    if (!arrayList5.isEmpty()) {
                        qrVar3.Q(TextUtils.join(",", arrayList5), arrayList15);
                    }
                    if (!arrayList4.isEmpty()) {
                        qrVar3.n0(arrayList4, arrayList14, false);
                    }
                    org.telegram.messenger.g0.h3(new ai.t6(u1Var3, arrayList14, arrayList15, t1Var3, ziVar, 16));
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
                bi biVar = (bi) this.b;
                long j23 = this.c;
                wm wmVar2 = (wm) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Context context = biVar.getContext();
                int i18 = biVar.E3;
                ej ejVar = wmVar2.x5;
                if (ejVar == null) {
                    ejVar = ej.a();
                }
                new x0(context, i18, j23, ejVar, wmVar2, e6Var, 0, new mi.f(28, biVar, wmVar2)).show();
                return;
            case 17:
                g11 g11Var = (g11) this.b;
                f60 f60Var = (f60) this.d;
                long j24 = this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                f60Var.u();
                TLRPC.User a23 = hp.s1(g11Var.e).a2(Long.valueOf(j24));
                if (a23 != null) {
                    wm wmVar3 = g11Var.s;
                    org.telegram.ui.Components.t4.q(wmVar3, -1, a23, chat2, true, new ei.c1(g11Var, j24, 6), wmVar3.getResourceProvider());
                    return;
                }
                return;
            case 18:
                g11 g11Var2 = (g11) this.b;
                HashSet hashSet = (HashSet) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                long j25 = this.c;
                g11Var2.l0.removeAll(hashSet);
                g11Var2.q();
                int size = arrayList16.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj3 = arrayList16.get(i19);
                    i19++;
                    long intValue = ((Integer) obj3).intValue();
                    if (j25 == intValue) {
                        g11Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 19:
                uw uwVar2 = (uw) this.b;
                mo moVar = (mo) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j26 = this.c;
                int i20 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (moVar != null) {
                    LongSparseIntArray longSparseIntArray = moVar.j;
                    if (uwVar2.s4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            i20 = Math.min(i20, longSparseIntArray.valueAt(i21));
                        }
                        i20 -= uwVar2.P2;
                    }
                }
                int i22 = i20;
                TLRPC.EncryptedChat a12 = org.telegram.messenger.m5.C(j26) ? uwVar2.getMessagesController().a1(Integer.valueOf((int) (4294967295L & j26))) : null;
                UndoView k42 = uwVar2.k4();
                if (k42 == null) {
                    return;
                }
                if (uwVar2.s4(dialog)) {
                    uwVar2.E4(j26, false, moVar, i22, true);
                    k42.k(0L, 79, 1, 1600, null, null);
                } else {
                    uwVar2.E4(j26, true, moVar, i22, true);
                    k42.k(0L, 78, 1, 1600, null, null);
                    if (moVar != null) {
                        if (a12 != null) {
                            if (!moVar.h.contains(Long.valueOf(a12.user_id))) {
                                moVar.h.add(Long.valueOf(a12.user_id));
                            }
                        } else if (!moVar.h.contains(Long.valueOf(j26))) {
                            moVar.h.add(Long.valueOf(j26));
                        }
                    }
                }
                if (moVar != null) {
                    ez.z0(moVar, moVar.g, moVar.b, moVar.c, moVar.n, moVar.m, moVar.h, moVar.i, moVar.j, false, false, true, true, false, uwVar2, null);
                    uwVar2 = uwVar2;
                }
                uwVar2.getMessagesController().m4(uwVar2.X2, 0L, null);
                uwVar2.f5(true);
                if (uwVar2.f0 != null) {
                    int i23 = 0;
                    while (true) {
                        tw[] twVarArr = uwVar2.f0;
                        if (i23 < twVarArr.length) {
                            twVarArr[i23].d.I = false;
                            i23++;
                        }
                    }
                }
                int i24 = hp.C8;
                uwVar2.u5(196608, true);
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
                e();
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
                vi.j jVar = (vi.j) this.b;
                vi.i iVar = (vi.i) this.d;
                long j27 = this.c;
                byte[] bArr = (byte[]) this.e;
                if (jVar.G != 7) {
                    return;
                }
                long length = iVar.b.length();
                jVar.a(iVar, length);
                synchronized (jVar.l) {
                    if (iVar.d && !iVar.e) {
                        iVar.e = true;
                        jVar.k.execute(new vi.c(jVar, iVar, length, j27, 2));
                        jVar.C = new vi.f(iVar.b, j27, bArr);
                        jVar.s(8);
                        mi.h0 h0Var = jVar.f;
                        vi.f fVar = jVar.C;
                        MediaController mediaController = ((ge) h0Var.b).a;
                        String[] strArr = MediaController.W1;
                        mediaController.s(fVar);
                        jVar.c();
                        jVar.t();
                        jVar.l("completed");
                    }
                }
                return;
        }
    }

    public /* synthetic */ l2(e9 e9Var, u10 u10Var, TL_stars.StarGift starGift, long j10) {
        this.a = 4;
        this.d = e9Var;
        this.e = u10Var;
        this.b = starGift;
        this.c = j10;
    }

    public /* synthetic */ l2(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ l2(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
        this.e = obj3;
    }

    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ l2(org.telegram.ui.Wallet.o0 o0Var, u10 u10Var, long j10, String str) {
        this.a = 25;
        this.b = o0Var;
        this.e = u10Var;
        this.c = j10;
        this.d = str;
    }
}
