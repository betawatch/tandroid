package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f1 implements NotificationCenter.NotificationCenterDelegate {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean E;
    public final a1 F;
    public final a1 G;
    public TLRPC.ShareTheme H;
    public final int a;
    public final t1 b;
    public final d1 c;
    public int d = 0;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme v;
    public int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v1, types: [ai.a1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ai.a1] */
    public f1(int i10, t1 t1Var, d1 d1Var) {
        final int i11 = 0;
        this.F = new Runnable(this) { // from class: ai.a1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.n();
                        break;
                    default:
                        this.b.m();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.G = new Runnable(this) { // from class: ai.a1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.n();
                        break;
                    default:
                        this.b.m();
                        break;
                }
            }
        };
        this.a = i10;
        this.b = t1Var;
        this.c = d1Var;
    }

    public static LongSparseArray g(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] o(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        t1 t1Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = t1Var.v1;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        i10 = -1;
                        break;
                    } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i10)).id == tL_starGiftUnique.id) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                q1 q1Var = t1Var.F;
                if (q1Var.a == 2 && q1Var.q == i10) {
                    return;
                }
                t1Var.e2 = true;
                t1Var.I.clear();
                Runnable runnable = t1Var.d2;
                if (runnable != null) {
                    runnable.run();
                }
                t1Var.M7 = i10;
                t1Var.O7 = t1Var.f2 ? 1.0f : 0.0f;
                t1Var.P7 = 1.0f;
                t1Var.I0(t1Var.getWidth() / 2.0f, (t1Var.l() / 2.0f) + t1Var.m(), i10);
                t1Var.e2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            t1Var.d(t1.H9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i11 = tL_shareThemeEmojiBackdrop.flags;
        t1Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i11 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i11 & 1) != 0);
    }

    public final void b() {
        this.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
        int i10 = this.a;
        LongSparseArray g7 = g(i10);
        long j10 = this.c.f;
        e1 e1Var = (e1) g7.get(j10);
        if (e1Var == null || e1Var.b != 0) {
            return;
        }
        g(i10).remove(j10);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        int i10 = this.a;
        String string = MessagesController.getMainSettings(i10).getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = MessagesController.getMainSettings(i10).getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        d1 d1Var = this.c;
        String str = d1Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || d1Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            p();
            return;
        }
        int i12 = NotificationCenter.userInfoDidLoad;
        d1 d1Var = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == d1Var.f) {
                h(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == d1Var.f) {
            h(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        d1 d1Var = this.c;
        if (d1Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.a).getInputPeer(d1Var.f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    public final void f() {
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            if (user == null) {
                return;
            }
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
            messagesController.loadUserInfo(user, true, 0);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
        MessagesStorage.getInstance(i10).loadChatInfo(chat.id, ChatObject.isChannel(chat), null, true, false);
    }

    public final void h(TLRPC.ShareTheme shareTheme) {
        long j10 = this.c.f;
        if (this.E) {
            return;
        }
        if (shareTheme == null) {
            shareTheme = new TLRPC.TL_shareThemeDefault();
        }
        int i10 = this.a;
        e1 e1Var = (e1) g(i10).get(j10);
        if (e1Var != null) {
            TLRPC.ShareTheme shareTheme2 = e1Var.a;
            byte[] o10 = o(shareTheme);
            byte[] o11 = o(shareTheme2);
            if (o10 != null && Arrays.equals(o10, o11)) {
                g(i10).remove(j10);
            } else {
                if (e1Var.b == 0 || SystemClock.elapsedRealtime() - e1Var.b < 10000) {
                    j(e1Var.a);
                    return;
                }
                g(i10).remove(j10);
            }
        }
        if (this.x) {
            return;
        }
        TLRPC.ShareTheme shareTheme3 = this.H;
        if (shareTheme3 == null) {
            t1 t1Var = this.b;
            t1Var.setInstantTheme(true);
            a(shareTheme);
            t1Var.setInstantTheme(false);
            return;
        }
        byte[] o12 = o(shareTheme);
        byte[] o13 = o(shareTheme3);
        if (o12 == null || !Arrays.equals(o12, o13)) {
            a(shareTheme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    public final void i() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.x = true;
        boolean z10 = false;
        this.y = false;
        d1 d1Var = this.c;
        if (d1Var.g) {
            t1 t1Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = t1Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = t1Var.getPickedEmoji();
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            r6 = null;
            r6 = null;
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
            tL_shareThemeGift2 = null;
            if (themeGift != null) {
                if (!d1Var.e) {
                    long themeGiftSavedId = t1Var.getThemeGiftSavedId();
                    TLRPC.InputPeer e = e();
                    if (themeGiftSavedId != 0 && e != null) {
                        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                        tL_inputSavedStarGiftChat2.peer = e;
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
                int themeBackdropIndex = t1Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != t1.H9) {
                    z10 = true;
                }
                if (z10 && a.h == null) {
                    b();
                    this.y = true;
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
            this.H = tL_shareThemeGift2;
            e1 e1Var = new e1();
            e1Var.a = tL_shareThemeGift2;
            g(this.a).put(d1Var.f, e1Var);
            j(this.H);
            this.v = tL_shareThemeGift;
            a1 a1Var = this.G;
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            AndroidUtilities.runOnUIThread(a1Var, 700L);
        }
    }

    public final void j(TLRPC.ShareTheme shareTheme) {
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j10);
            if (userFull != null) {
                userFull.share_theme = shareTheme;
                MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j10);
        if (chatFull != null) {
            chatFull.share_theme = shareTheme;
            MessagesStorage.getInstance(i10).updateChatInfo(chatFull, false);
        }
    }

    public final void k() {
        this.E = true;
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        m();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void l(boolean z10, boolean z11) {
        int i10 = this.n;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new org.telegram.messenger.a(), new b1(this, r6, z11, 0));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void m() {
        if (this.v == null) {
            return;
        }
        TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
        TLRPC.InputPeer e = e();
        tL_messages_setShareTheme.peer = e;
        tL_messages_setShareTheme.theme = this.v;
        this.v = null;
        if (e == null) {
            return;
        }
        int i10 = this.w;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.w, true);
        }
        LongSparseArray g7 = g(i11);
        d1 d1Var = this.c;
        e1 e1Var = (e1) g7.get(d1Var.f);
        long j10 = d1Var.f;
        int i12 = this.a;
        int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new org.telegram.messenger.a(), new c1(this, r7, e1Var, i12, j10));
        this.w = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void n() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        a1 a1Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(a1Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.a;
        if (i10 == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f.expires - 5))) {
            l(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            this.s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new i(this, 2));
        }
        AndroidUtilities.runOnUIThread(a1Var, 1000L);
    }

    public final void p() {
        long j10;
        int i10 = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        t1 t1Var = this.b;
        t1Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            t1Var.v0 = true;
            t1Var.w0 = false;
            t1Var.B0 = 1.0f;
            t1Var.D0 = 1.0f;
            t1Var.C0 = 1.0f;
            t1Var.F0 = true;
            t1Var.G0 = 1.0f;
            t1Var.z2 = null;
            t1Var.A2 = -1;
            t1Var.u1(false);
            t1Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
            this.f = c10;
            if (c10 != null) {
                t1Var.setFreeLink(d(c10));
            }
            l(false, false);
        }
    }
}
