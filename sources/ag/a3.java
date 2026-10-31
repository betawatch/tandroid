package ag;

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dt;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.g4;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.kt;
import org.telegram.messenger.m5;
import org.telegram.messenger.me;
import org.telegram.messenger.o5;
import org.telegram.messenger.oj;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.i00;
import org.telegram.ui.ko;
import org.telegram.ui.q90;
import org.telegram.ui.qq;
import org.telegram.ui.r90;
import org.telegram.ui.u70;
import org.telegram.ui.uf0;
import org.telegram.ui.un;
import org.telegram.ui.zx;
import rh.e4;
import rh.e6;
import rh.i4;
import th.e5;
import th.n4;
import th.o4;
import th.p5;
import th.t5;
import th.v5;
import th.w5;
import vh.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a3(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = j10;
        this.c = obj2;
        this.e = obj3;
    }

    private final void a() {
        org.telegram.ui.Wallet.h0 h0Var;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte[] bArr;
        byte[] bArr2;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
        TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.c;
        long j10 = this.d;
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
                                        org.telegram.ui.Wallet.k0.j("getSecretPhrase: part " + i10 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
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
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: couldn't decrypt " + i10 + " part");
                    jVar.a(null, "WALLET_PART_" + i10 + "_CANT_DECRYPT");
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

    private final void b() {
        int i10;
        char c10;
        boolean z10;
        int i11;
        TL_stories.TL_updateStory tL_updateStory;
        TL_stories.PeerStories peerStories;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        boolean z11;
        boolean z12;
        boolean z13;
        e5 e5Var = (e5) this.b;
        TL_stories.TL_updateStory tL_updateStory2 = (TL_stories.TL_updateStory) this.c;
        TLRPC.User user = (TLRPC.User) this.e;
        ArrayList arrayList2 = e5Var.h;
        ArrayList arrayList3 = e5Var.g;
        int i12 = e5Var.a;
        StringBuilder sb2 = new StringBuilder("StoriesController update stories for dialog ");
        long j10 = this.d;
        sb2.append(j10);
        f8.b(sb2.toString());
        e5Var.q0(j10, Collections.singletonList(tL_updateStory2.story), false);
        e5Var.o0(j10, Collections.singletonList(tL_updateStory2.story), true);
        a0.h hVar = e5Var.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        ArrayList arrayList4 = new ArrayList();
        int i13 = e5Var.u;
        if (peerStories2 != null) {
            TL_stories.StoryItem storyItem3 = tL_updateStory2.story;
            c10 = 1;
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i10 = i13;
                peerStories = peerStories2;
                tL_updateStory = tL_updateStory2;
                arrayList = arrayList4;
                storyItem = storyItem3;
                ot.k0.c(new dt(ot.t(i12), j10, storyItem3.id, 0));
            } else {
                tL_updateStory = tL_updateStory2;
                peerStories = peerStories2;
                arrayList = arrayList4;
                i10 = i13;
                storyItem = storyItem3;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= peerStories.stories.size()) {
                    storyItem2 = storyItem;
                    z11 = false;
                    break;
                }
                if (peerStories.stories.get(i14).id != storyItem.id) {
                    i14++;
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i14);
                    i0.a.p(storyItem.id, new StringBuilder("StoriesController remove story id="));
                    storyItem2 = storyItem;
                    z11 = true;
                    z12 = true;
                } else {
                    TL_stories.StoryItem storyItem4 = peerStories.stories.get(i14);
                    storyItem2 = e5.f(storyItem4, storyItem);
                    arrayList.add(storyItem2);
                    peerStories.stories.set(i14, storyItem2);
                    if (storyItem2.attachPath == null) {
                        storyItem2.attachPath = storyItem4.attachPath;
                    }
                    if (storyItem2.firstFramePath == null) {
                        storyItem2.firstFramePath = storyItem4.firstFramePath;
                    }
                    i0.a.p(storyItem2.id, new StringBuilder("StoriesController update story id="));
                    z11 = true;
                }
            }
            z12 = false;
            if (z11) {
                z13 = false;
            } else {
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    f8.b("StoriesController can't add new story DELETED");
                    return;
                }
                if (w5.w(i12, storyItem2)) {
                    f8.b("StoriesController can't add new story isExpired");
                    return;
                }
                if (j10 > 0 && (user == null || (!user.self && !e5Var.O(user)))) {
                    f8.b("StoriesController can't add new story user is not contact");
                    return;
                }
                arrayList.add(storyItem2);
                peerStories.stories.add(storyItem2);
                f8.b("StoriesController add new story id=" + storyItem2.id + " total stories count " + peerStories.stories.size());
                e5Var.Z(j10, storyItem2);
                e5Var.g(peerStories);
                z13 = true;
                z12 = true;
            }
            if (z12) {
                if (!peerStories.stories.isEmpty() || e5Var.M(j10)) {
                    Collections.sort(peerStories.stories, e5.X);
                } else {
                    arrayList3.remove(peerStories);
                    arrayList2.remove(peerStories);
                    hVar.l(o5.o(peerStories.peer));
                    e5Var.u--;
                }
                z13 = true;
            }
            z10 = z13;
            tL_updateStory2 = tL_updateStory;
        } else {
            i10 = i13;
            c10 = 1;
            TL_stories.StoryItem storyItem5 = tL_updateStory2.story;
            if (storyItem5 instanceof TL_stories.TL_storyItemDeleted) {
                f8.b("StoriesController can't add user " + j10 + " with new story DELETED");
                return;
            }
            if (w5.w(i12, storyItem5)) {
                f8.b("StoriesController can't add user " + j10 + " with new story isExpired");
                return;
            }
            if (j10 > 0 && (user == null || (!user.self && !e5Var.O(user)))) {
                f8.b("StoriesController can't add user cause is not contact");
                return;
            }
            TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
            tL_peerStories.peer = tL_updateStory2.peer;
            tL_peerStories.stories.add(tL_updateStory2.story);
            i0.a.p(tL_updateStory2.story.id, new StringBuilder("StoriesController add new user with story id="));
            long o10 = o5.o(tL_peerStories.peer);
            e5Var.e0(o10, tL_peerStories);
            if (o10 != d20.i(d20.s0).n) {
                TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(o10));
                e5Var.g(tL_peerStories);
                if (Z1 != null && !Z1.stories_hidden) {
                    e5Var.a0(tL_peerStories);
                }
            }
            f8.b("StoriesController applyNewStories " + o10);
            e5Var.q0(o10, tL_peerStories.stories, false);
            e5Var.u = e5Var.u + 1;
            e5Var.R(j10);
            z10 = true;
        }
        if (i10 != e5Var.u) {
            e5Var.l.edit().putInt("total_stores", e5Var.u).apply();
        }
        e5Var.v(arrayList3);
        e5Var.v(arrayList2);
        if (z10) {
            if (tL_updateStory2.story instanceof TL_stories.TL_storyItemDeleted) {
                zs f7 = zs.f(i12);
                Long valueOf = Long.valueOf(j10);
                Integer valueOf2 = Integer.valueOf(tL_updateStory2.story.id);
                Object[] objArr = new Object[2];
                i11 = 0;
                objArr[0] = valueOf;
                objArr[c10] = valueOf2;
                f7.k(zs.w5, objArr);
            } else {
                i11 = 0;
            }
            zs.f(i12).k(zs.v5, new Object[i11]);
        }
        vp.r1(i12).D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x081c, code lost:
    
        if (r13 == null) goto L280;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0832  */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r2v72, types: [org.telegram.ui.Wallet.h0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [org.telegram.tgnet.TLRPC$Message] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        i3 i3Var;
        ArrayList arrayList;
        boolean z10;
        SQLiteCursor sQLiteCursor2;
        ?? byteBufferValue;
        SQLiteCursor sQLiteCursor3;
        jj jjVar;
        NativeByteBuffer byteBufferValue2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList2;
        int i10 = 4;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                i3 i3Var2 = (i3) this.b;
                hs hsVar = (hs) this.c;
                long j10 = this.d;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                try {
                                    h3 h3Var = new h3();
                                    h3Var.a = sQLiteCursor2.intValue(0);
                                    h3Var.b = sQLiteCursor2.stringValue(1);
                                    h3Var.c = sQLiteCursor2.intValue(2);
                                    h3Var.f = sQLiteCursor2.intValue(3);
                                    arrayList3.add(h3Var);
                                } catch (Exception e) {
                                    e = e;
                                    i3Var = i3Var2;
                                    arrayList = arrayList3;
                                    z10 = true;
                                    f8.g(e, z10);
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
                        } catch (Exception e7) {
                            e = e7;
                            i3Var = i3Var2;
                            arrayList = arrayList3;
                        }
                    }
                    sQLiteCursor2.dispose();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        h3 h3Var2 = (h3) arrayList3.get(i13);
                        ?? r22 = i11;
                        arrayList = arrayList3;
                        try {
                            Object[] objArr = new Object[1];
                            objArr[r22 == true ? 1 : 0] = Integer.valueOf(h3Var2.a);
                            sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                            if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r22 == true ? 1 : 0)) == 0) {
                                i3Var = i3Var2;
                            } else {
                                ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r22), r22);
                                TLdeserialize.send_state = sQLiteCursor2.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j10);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor2.intValue(2);
                                TLdeserialize.date = sQLiteCursor2.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor2.intValue(5);
                                hs.e(TLdeserialize, arrayList6, arrayList7, null);
                                i3Var = i3Var2;
                                try {
                                    jj jjVar2 = new jj(i3Var2.a, TLdeserialize, false, true);
                                    h3Var2.e = jjVar2;
                                    h3Var2.d = TLdeserialize.id;
                                    jjVar2.r0(false);
                                    h3Var2.e.l(h3Var2.a, h3Var2.b);
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = true;
                                    f8.g(e, z10);
                                }
                            }
                            sQLiteCursor2.dispose();
                            i13++;
                            arrayList3 = arrayList;
                            i3Var2 = i3Var;
                            i11 = 0;
                        } catch (Exception e11) {
                            e = e11;
                            i3Var = i3Var2;
                            z10 = true;
                            f8.g(e, z10);
                        }
                    }
                    i3Var = i3Var2;
                    arrayList = arrayList3;
                    if (!arrayList7.isEmpty()) {
                        hsVar.Q(TextUtils.join(",", arrayList7), arrayList5);
                    }
                    if (!arrayList6.isEmpty()) {
                        hsVar.n0(arrayList6, arrayList4, false);
                    }
                } catch (Exception e12) {
                    e = e12;
                    i3Var = i3Var2;
                    arrayList = arrayList3;
                    z10 = true;
                    sQLiteCursor2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                org.telegram.messenger.i0.g3(new e3(i3Var, arrayList4, arrayList5, arrayList, runnable, 2));
                return;
            case 1:
                i3 i3Var3 = (i3) this.b;
                hs hsVar2 = (hs) this.c;
                h3 h3Var3 = (h3) this.e;
                long j11 = this.d;
                try {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor queryFinalized = hsVar2.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(h3Var3.a));
                    try {
                        if (!queryFinalized.next() || (byteBufferValue2 = queryFinalized.byteBufferValue(0)) == null) {
                            jjVar = null;
                        } else {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                            TLdeserialize2.send_state = queryFinalized.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue2, j11);
                            byteBufferValue2.reuse();
                            TLdeserialize2.id = queryFinalized.intValue(2);
                            TLdeserialize2.date = queryFinalized.intValue(3);
                            TLdeserialize2.flags |= TLObject.FLAG_30;
                            TLdeserialize2.quick_reply_shortcut_id = queryFinalized.intValue(4);
                            TLdeserialize2.ttl = queryFinalized.intValue(5);
                            hs.e(TLdeserialize2, arrayList8, arrayList9, null);
                            jjVar = new jj(i3Var3.a, TLdeserialize2, false, true);
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        if (!arrayList9.isEmpty()) {
                            hsVar2.Q(TextUtils.join(",", arrayList9), arrayList11);
                        }
                        if (!arrayList8.isEmpty()) {
                            hsVar2.n0(arrayList8, arrayList10, false);
                        }
                        org.telegram.messenger.i0.g3(new e3(i3Var3, arrayList10, arrayList11, h3Var3, jjVar, 0));
                        queryFinalized.dispose();
                        return;
                    } catch (Exception e13) {
                        e = e13;
                        sQLiteCursor3 = queryFinalized;
                        try {
                            f8.g(e, true);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor3 = queryFinalized;
                        if (sQLiteCursor3 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor3 = null;
                }
                break;
            case 2:
                ki.k kVar = (ki.k) this.b;
                ki.j jVar = (ki.j) this.c;
                long j12 = this.d;
                byte[] bArr = (byte[]) this.e;
                if (kVar.G != 7) {
                    return;
                }
                long length = jVar.b.length();
                kVar.a(jVar, length);
                synchronized (kVar.l) {
                    if (jVar.d && !jVar.e) {
                        jVar.e = true;
                        kVar.k.execute(new ki.c(kVar, jVar, length, j12, 2));
                        kVar.C = new ki.g(jVar.b, j12, bArr);
                        kVar.s(8);
                        m5.e eVar = kVar.f;
                        ki.g gVar = kVar.C;
                        MediaController mediaController = ((me) eVar.b).a;
                        String[] strArr = MediaController.U1;
                        mediaController.s(gVar);
                        kVar.c();
                        kVar.t();
                        kVar.l("completed");
                    }
                }
                return;
            case 3:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.c, (Bitmap) this.e, this.d);
                return;
            case 4:
                bi biVar = (bi) this.b;
                long j13 = this.d;
                un unVar = (un) this.c;
                p6 p6Var = (p6) this.e;
                Context context = biVar.getContext();
                int i14 = biVar.D3;
                oj ojVar = unVar.w5;
                if (ojVar == null) {
                    ojVar = oj.a();
                }
                new rh.e0(context, i14, j13, ojVar, unVar, p6Var, 0, new vg(i12, biVar, unVar)).show();
                return;
            case 5:
                o21 o21Var = (o21) this.b;
                z60 z60Var = (z60) this.c;
                long j14 = this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                z60Var.u();
                TLRPC.User Z1 = vp.r1(o21Var.n).Z1(Long.valueOf(j14));
                if (Z1 != null) {
                    un unVar2 = o21Var.y;
                    s4.q(unVar2, -1, Z1, chat, true, new m4.x0(o21Var, j14, i10), unVar2.getResourceProvider());
                    return;
                }
                return;
            case 6:
                o21 o21Var2 = (o21) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList12 = (ArrayList) this.e;
                long j15 = this.d;
                o21Var2.n0.removeAll(hashSet);
                o21Var2.q();
                int size = arrayList12.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList12.get(i15);
                    i15++;
                    long intValue = ((Integer) obj).intValue();
                    if (j15 == intValue) {
                        o21Var2.n(intValue, false);
                        return;
                    }
                }
                return;
            case 7:
                ay ayVar = (ay) this.b;
                ap apVar = (ap) this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                long j16 = this.d;
                int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (apVar != null) {
                    LongSparseIntArray longSparseIntArray = apVar.j;
                    if (ayVar.r4(dialog)) {
                        int size2 = longSparseIntArray.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            i16 = Math.min(i16, longSparseIntArray.valueAt(i17));
                        }
                        i16 -= ayVar.O2;
                    }
                }
                int i18 = i16;
                TLRPC.EncryptedChat Z0 = o5.C(j16) ? ayVar.getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j16))) : null;
                UndoView j42 = ayVar.j4();
                if (j42 == null) {
                    return;
                }
                if (ayVar.r4(dialog)) {
                    ayVar.D4(j16, false, apVar, i18, true);
                    j42.k(0L, 79, 1, 1600, null, null);
                } else {
                    ayVar.D4(j16, true, apVar, i18, true);
                    j42.k(0L, 78, 1, 1600, null, null);
                    if (apVar != null) {
                        if (Z0 != null) {
                            if (!apVar.h.contains(Long.valueOf(Z0.user_id))) {
                                apVar.h.add(Long.valueOf(Z0.user_id));
                            }
                        } else if (!apVar.h.contains(Long.valueOf(j16))) {
                            apVar.h.add(Long.valueOf(j16));
                        }
                    }
                }
                if (apVar != null) {
                    i00.y0(apVar, apVar.g, apVar.b, apVar.c, apVar.n, apVar.m, apVar.h, apVar.i, apVar.j, false, false, true, true, false, ayVar, null);
                    ayVar = ayVar;
                }
                ayVar.getMessagesController().j4(ayVar.W2, 0L, null);
                ayVar.e5(true);
                if (ayVar.e0 != null) {
                    int i19 = 0;
                    while (true) {
                        zx[] zxVarArr = ayVar.e0;
                        if (i19 < zxVarArr.length) {
                            zxVarArr[i19].d.H = false;
                            i19++;
                        }
                    }
                }
                int i20 = vp.D8;
                ayVar.t5(196608, true);
                return;
            case 8:
                b50 b50Var = (b50) this.b;
                long j17 = this.d;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.c;
                TLRPC.User user = (TLRPC.User) this.e;
                u3 u3Var = b50Var.R2;
                if (u3Var == null || b50Var.j2) {
                    return;
                }
                u3Var.a(j17);
                b50Var.Q0(true);
                z20 z20Var = b50Var.v3;
                if (z20Var != null) {
                    z20Var.dismiss();
                }
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr[0] = null;
                b50Var.m1().k(0L, 34, user, b50Var.Q2, null, null);
                return;
            case 9:
                TLObject tLObject = (TLObject) this.b;
                vp vpVar = (vp) this.c;
                long j18 = this.d;
                qq qqVar = (qq) this.e;
                Pattern pattern = LaunchActivity.D1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    qqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                vpVar.V3(tL_stories_peerStories.users, false);
                vpVar.O1().d0(j18, tL_stories_peerStories.stories);
                qqVar.run();
                return;
            case 10:
                r90 r90Var = (r90) this.b;
                LaunchActivity launchActivity = r90Var.h;
                String str = (String) this.c;
                long j19 = this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                if (str != null) {
                    org.telegram.messenger.c a2 = org.telegram.messenger.c.a(launchActivity.O);
                    int i21 = a2.a;
                    long j20 = -j19;
                    if (vp.r1(i21).f1(j20, false, null) != null) {
                        TLRPC.Chat L0 = vp.r1(i21).L0(Long.valueOf(j20));
                        vp.r1(i21).i1(j19);
                        org.telegram.ui.Components.voip.m1.l(L0, null, false, Boolean.valueOf(!r3.b.rtmp_stream), launchActivity, k2Var, a2);
                        return;
                    }
                    TLRPC.ChatFull M0 = vp.r1(i21).M0(j20);
                    if (M0 != null) {
                        if (M0.call != null) {
                            vp.r1(i21).f1(j20, true, new q90(r90Var, a2, j19, k2Var, 0));
                            return;
                        } else {
                            if (k2Var.getParentActivity() != null) {
                                m5.n(null, 2131749162, cc.a0(k2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                String str2 = (String) this.c;
                ef efVar = (ef) this.e;
                long j21 = this.d;
                Drawable[] drawableArr = PhotoViewer.U8;
                ko koVar = new ko(photoViewer, str2, efVar, j21, 2);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.i0.A0(photoViewer.C2, createBitmap, new uf0(21, koVar, createBitmap));
                    return;
                }
                TextureView textureView = photoViewer.B2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                if (bitmap == null) {
                    koVar.a(qz.s(efVar.I, j21, null, true));
                    return;
                } else {
                    koVar.a(bitmap);
                    return;
                }
            case 12:
                a();
                return;
            case 13:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.b;
                q20 q20Var = (q20) this.c;
                long j22 = this.d;
                String str3 = (String) this.e;
                if (q20Var == null) {
                    p0Var.getClass();
                    return;
                }
                if (j22 != p0Var.l()) {
                    str3 = "STORAGE_CANCELED";
                }
                q20Var.a(str3);
                return;
            case 14:
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) this.b;
                ?? r23 = (org.telegram.ui.Wallet.h0) this.c;
                try {
                    ((q20) this.e).a(this.d == p0Var2.l() ? r23 : null);
                    if (r23 != 0) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (r23 != 0) {
                        r23.close();
                    }
                }
            case 15:
                e4 e4Var = (e4) this.b;
                e6 e6Var = (e6) this.c;
                long j23 = this.d;
                q20 q20Var2 = (q20) this.e;
                if (e6Var.e) {
                    e4Var.s1(j23, q20Var2);
                    return;
                }
                wb Q = e4Var.k().Q(R.raw.error, 36, cd.a0(null, null, 2131743903, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 16:
                e4 e4Var2 = (e4) this.b;
                long j24 = this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                ay ayVar2 = (ay) this.e;
                g4.f(e4Var2.a).s(j24, new yf.b(null, tL_starGiftUnique.slug), null, true);
                ayVar2.presentFragment(un.ha(j24), true);
                return;
            case 17:
                e4 e4Var3 = (e4) this.b;
                boolean[] zArr = (boolean[]) this.c;
                long j25 = this.d;
                q20 q20Var3 = (q20) this.e;
                e4Var3.getClass();
                zArr[0] = true;
                e4Var3.c2.setLoading(false);
                e4Var3.s1(j25, q20Var3);
                return;
            case 18:
                ((e6) this.c).b0((jj) this.e, ((i4) this.b).a, this.d, true, true, null);
                return;
            case 19:
                e6 e6Var2 = (e6) this.b;
                q20 q20Var4 = (q20) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j26 = this.d;
                if (e6Var2.e) {
                    e6Var2.H(starGift, j26, null, true, q20Var4);
                    return;
                } else {
                    e6.e("NO_BALANCE");
                    q20Var4.a(null);
                    return;
                }
            case 20:
                un unVar3 = (un) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.c;
                CharSequence charSequence = (CharSequence) this.e;
                long j27 = this.d;
                cc a02 = cc.a0(unVar3);
                TLRPC.Document document = starGift2.sticker;
                String L02 = cd.L0(2131745127, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.i0.W2(cd.G((int) j27, "StarsGiftCompletedText", new Object[0]));
                }
                a02.s(document, L02, charSequence).k(true);
                return;
            case 21:
                ((e6) this.b).f0((LaunchActivity) this.c, this.d, (String) this.e);
                return;
            case 22:
                e6 e6Var3 = (e6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                long j28 = this.d;
                q20 q20Var5 = (q20) this.e;
                if (!(tLObject2 instanceof TL_stars.starGiftUpgradePreview)) {
                    e6Var3.getClass();
                    q20Var5.a(null);
                    return;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    e6Var3.M.put(Long.valueOf(j28), stargiftupgradepreview);
                    q20Var5.a(stargiftupgradepreview);
                    return;
                }
            case 23:
                b();
                return;
            case 24:
                n4 n4Var = (n4) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                long j29 = this.d;
                u70 u70Var = (u70) this.e;
                e5 e5Var = n4Var.c;
                int i22 = e5Var.a;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories2 = (TL_stories.TL_stories_peerStories) tLObject3;
                    vp.r1(i22).V3(tL_stories_peerStories2.users, false);
                    vp.r1(i22).P3(tL_stories_peerStories2.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories2.stories;
                    if (peerStories != null) {
                        while (true) {
                            if (i11 < peerStories.stories.size()) {
                                if (!(peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i11++;
                                } else {
                                    a0.h hVar = e5Var.E;
                                    r8 = peerStories.stories.get(i11);
                                    hVar.k(r8, j29);
                                }
                            }
                        }
                    }
                }
                u70Var.a(r8);
                return;
            case 25:
                o4 o4Var = (o4) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                long j30 = this.d;
                q20 q20Var6 = (q20) this.e;
                e5 e5Var2 = o4Var.c;
                if (tLObject4 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    vp.r1(e5Var2.a).V3(tL_stories_stories.users, false);
                    vp.r1(e5Var2.a).P3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar2 = e5Var2.E;
                        r8 = tL_stories_stories.stories.get(0);
                        hVar2.k(r8, j30);
                    }
                }
                q20Var6.a(r8);
                return;
            case 26:
                v5 v5Var = (v5) this.b;
                View view = (View) this.c;
                long j31 = this.d;
                t5 t5Var = (t5) this.e;
                org.telegram.messenger.i0.h3(new p5(v5Var, view, j31, 2), 500L);
                t5Var.f(j31);
                return;
            default:
                r6 r6Var = (r6) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                hs hsVar3 = (hs) this.c;
                long j32 = this.d;
                boolean T = w3.T(chat2);
                TLRPC.ChatFull G0 = hsVar3.G0(j32, T, true, true);
                if (G0 == null || (chatParticipants = G0.participants) == null || ((arrayList2 = chatParticipants.participants) != null && arrayList2.size() < G0.participants_count - 1)) {
                    org.telegram.messenger.i0.g3(new kt(r6Var, T, j32, 3));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new p5(r6Var, j32, G0, 3));
                    return;
                }
        }
    }

    public /* synthetic */ a3(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = j10;
        this.e = obj3;
    }

    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = j10;
    }

    public /* synthetic */ a3(r6 r6Var, TLRPC.Chat chat, hs hsVar, long j10) {
        this.a = 27;
        this.b = r6Var;
        this.e = chat;
        this.c = hsVar;
        this.d = j10;
    }
}
