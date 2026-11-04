package bi;

import ai.v2;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.fj;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o0 implements cs {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public final k0 G;
    public final k0 H;
    public TLRPC.ShareTheme I;
    public final int a;
    public final a1 b;
    public final m0 c;
    public int d = 0;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v1, types: [bi.k0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bi.k0] */
    public o0(int i3, a1 a1Var, m0 m0Var) {
        final int i10 = 0;
        this.G = new Runnable(this) { // from class: bi.k0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.H = new Runnable(this) { // from class: bi.k0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.a = i3;
        this.b = a1Var;
        this.c = m0Var;
    }

    public static LongSparseArray h(int i3) {
        LongSparseArray[] longSparseArrayArr = J;
        if (longSparseArrayArr[i3] == null) {
            longSparseArrayArr[i3] = new LongSparseArray();
        }
        return longSparseArrayArr[i3];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.I = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        a1 a1Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = a1Var.w1;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i3)).id == tL_starGiftUnique.id) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i3 = 0;
                }
                x0 x0Var = a1Var.G;
                if (x0Var.a == 2 && x0Var.q == i3) {
                    return;
                }
                a1Var.f2 = true;
                a1Var.J.clear();
                Runnable runnable = a1Var.e2;
                if (runnable != null) {
                    runnable.run();
                }
                a1Var.M7 = i3;
                a1Var.O7 = a1Var.g2 ? 1.0f : 0.0f;
                a1Var.P7 = 1.0f;
                a1Var.I0(a1Var.getWidth() / 2.0f, (a1Var.l() / 2.0f) + a1Var.m(), i3);
                a1Var.f2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            a1Var.d(a1.H9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i10 = tL_shareThemeEmojiBackdrop.flags;
        a1Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i10 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i10 & 1) != 0);
    }

    public final void b() {
        this.w = null;
        org.telegram.messenger.g0.r(this.H);
        int i3 = this.a;
        LongSparseArray h = h(i3);
        long j10 = this.c.f;
        n0 n0Var = (n0) h.get(j10);
        if (n0Var == null || n0Var.b != 0) {
            return;
        }
        h(i3).remove(j10);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        String string = f().getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = f().getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        m0 m0Var = this.c;
        String str = m0Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || m0Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j10 = this.c.f;
        if (i3 == hs.k0) {
            r();
            return;
        }
        if (i3 == hs.E0) {
            if (((Long) objArr[0]).longValue() == j10) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i3 == hs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == j10) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        m0 m0Var = this.c;
        if (m0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer j12 = hp.s1(this.a).j1(m0Var.f);
        if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return j12;
    }

    public final SharedPreferences f() {
        return hp.s1(this.a).e7;
    }

    public final void g() {
        int i3 = this.a;
        hp s12 = hp.s1(i3);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.User a22 = s12.a2(Long.valueOf(j10));
            if (a22 == null) {
                return;
            }
            hs.f(i3).c(this, hs.E0);
            s12.g3(a22, true, 0);
            return;
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        if (M0 == null) {
            return;
        }
        hs.f(i3).c(this, hs.T);
        qr.a0(i3).F0(M0.id, t3.T(M0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j10 = this.c.f;
        if (this.F) {
            return;
        }
        if (shareTheme == null) {
            shareTheme = new TLRPC.TL_shareThemeDefault();
        }
        int i3 = this.a;
        n0 n0Var = (n0) h(i3).get(j10);
        if (n0Var != null) {
            TLRPC.ShareTheme shareTheme2 = n0Var.a;
            byte[] q10 = q(shareTheme);
            byte[] q11 = q(shareTheme2);
            if (q10 != null && Arrays.equals(q10, q11)) {
                h(i3).remove(j10);
            } else {
                if (n0Var.b == 0 || SystemClock.elapsedRealtime() - n0Var.b < 10000) {
                    k(n0Var.a);
                    return;
                }
                h(i3).remove(j10);
            }
        }
        if (this.y) {
            return;
        }
        TLRPC.ShareTheme shareTheme3 = this.I;
        if (shareTheme3 == null) {
            a1 a1Var = this.b;
            a1Var.setInstantTheme(true);
            a(shareTheme);
            a1Var.setInstantTheme(false);
            return;
        }
        byte[] q12 = q(shareTheme);
        byte[] q13 = q(shareTheme3);
        if (q12 == null || !Arrays.equals(q12, q13)) {
            a(shareTheme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.y = true;
        boolean z10 = false;
        this.E = false;
        m0 m0Var = this.c;
        if (m0Var.g) {
            a1 a1Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = a1Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = a1Var.getPickedEmoji();
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            r6 = null;
            r6 = null;
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
            tL_shareThemeGift2 = null;
            if (themeGift != null) {
                if (!m0Var.e) {
                    long themeGiftSavedId = a1Var.getThemeGiftSavedId();
                    TLRPC.InputPeer e10 = e();
                    if (themeGiftSavedId != 0 && e10 != null) {
                        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                        tL_inputSavedStarGiftChat2.peer = e10;
                        tL_inputSavedStarGiftChat2.saved_id = themeGiftSavedId;
                        tL_inputSavedStarGiftChat = tL_inputSavedStarGiftChat2;
                    }
                } else if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
                if (tL_inputSavedStarGiftChat == null) {
                    b();
                    return;
                }
                ?? tL_inputShareThemeGift = new TLRPC.TL_inputShareThemeGift();
                tL_inputShareThemeGift.stargift = tL_inputSavedStarGiftChat;
                tL_shareThemeGift2 = new TLRPC.TL_shareThemeGift();
                tL_shareThemeGift2.stargift = themeGift;
                tL_shareThemeGift = tL_inputShareThemeGift;
            } else {
                int themeBackdropIndex = a1Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != a1.H9) {
                    z10 = true;
                }
                if (z10 && a.h == null) {
                    b();
                    this.E = true;
                    return;
                } else if (z10 || !pickedEmoji.isEmpty()) {
                    ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                    if (z10) {
                        tL_shareThemeEmojiBackdrop.flags = 1 | tL_shareThemeEmojiBackdrop.flags;
                        tL_shareThemeEmojiBackdrop.backdrop_id = a.h[themeBackdropIndex];
                    }
                    if (!pickedEmoji.isEmpty()) {
                        tL_shareThemeEmojiBackdrop.flags |= 2;
                        tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
                    }
                    tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
                } else {
                    tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
                }
            }
            if (tL_shareThemeGift2 == null) {
                tL_shareThemeGift2 = tL_shareThemeGift;
            }
            this.I = tL_shareThemeGift2;
            n0 n0Var = new n0();
            n0Var.a = tL_shareThemeGift2;
            h(this.a).put(m0Var.f, n0Var);
            k(this.I);
            this.w = tL_shareThemeGift;
            k0 k0Var = this.H;
            org.telegram.messenger.g0.r(k0Var);
            org.telegram.messenger.g0.i3(k0Var, 700L);
        }
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i3 = this.a;
        hp s12 = hp.s1(i3);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.UserFull b22 = s12.b2(j10);
            if (b22 != null) {
                b22.share_theme = shareTheme;
                qr.a0(i3).j2(b22, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = s12.N0(-j10);
        if (N0 != null) {
            N0.share_theme = shareTheme;
            qr.a0(i3).N1(N0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i3 = this.a;
        hs.f(i3).n(this, hs.k0);
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.T);
        org.telegram.messenger.g0.r(this.G);
        org.telegram.messenger.g0.r(this.H);
        o();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void m() {
        this.s = SystemClock.elapsedRealtime();
        hp s12 = hp.s1(this.a);
        v2 v2Var = new v2(this, 6);
        if (s12.W7) {
            return;
        }
        if (s12.X7 != null && r0.expires > System.currentTimeMillis() / 1000) {
            v2Var.a(s12.X7);
            return;
        }
        s12.W7 = true;
        s12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new fj(s12, v2Var, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z10, boolean z11) {
        int i3 = this.n;
        int i10 = this.a;
        if (i3 != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new c3.b(1), new l0(this, r6, z11, 0));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.w == null) {
            return;
        }
        TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
        TLRPC.InputPeer e10 = e();
        tL_messages_setShareTheme.peer = e10;
        tL_messages_setShareTheme.theme = this.w;
        this.w = null;
        if (e10 == null) {
            return;
        }
        int i3 = this.x;
        int i10 = this.a;
        if (i3 != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.x, true);
        }
        LongSparseArray h = h(i10);
        m0 m0Var = this.c;
        n0 n0Var = (n0) h.get(m0Var.f);
        long j10 = m0Var.f;
        int i11 = this.a;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new c3.b(1), new ai.f0(this, r7, n0Var, i11, j10));
        this.x = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        k0 k0Var = this.G;
        org.telegram.messenger.g0.r(k0Var);
        if (this.F) {
            return;
        }
        if (this.d == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.f.expires - 5))) {
            n(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            m();
        }
        org.telegram.messenger.g0.i3(k0Var, 1000L);
    }

    public final void r() {
        long j10;
        int i3 = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = g5.r(i3).Y;
        if (globalPrivacySettings == null) {
            g5.r(i3).B();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        a1 a1Var = this.b;
        a1Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            a1Var.w0 = true;
            a1Var.x0 = false;
            a1Var.C0 = 1.0f;
            a1Var.E0 = 1.0f;
            a1Var.D0 = 1.0f;
            a1Var.G0 = true;
            a1Var.H0 = 1.0f;
            a1Var.A2 = null;
            a1Var.B2 = -1;
            a1Var.u1(false);
            a1Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken c2 = c();
            this.f = c2;
            if (c2 != null) {
                a1Var.setFreeLink(d(c2));
            }
            n(false, false);
        }
    }
}
