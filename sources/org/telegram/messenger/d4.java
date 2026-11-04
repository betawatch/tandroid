package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d4 extends c1 {
    public static volatile p5 s = new p5("chatThemeQueue");
    public static final d4[] w = new d4[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final k2.u1 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public d4(int i3) {
        super(i3);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new k2.u1();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        k();
    }

    public static d4 f(int i3) {
        d4 d4Var;
        d4[] d4VarArr = w;
        d4 d4Var2 = d4VarArr[i3];
        if (d4Var2 != null) {
            return d4Var2;
        }
        synchronized (d4.class) {
            try {
                d4Var = d4VarArr[i3];
                if (d4Var == null) {
                    d4Var = new d4(i3);
                    d4VarArr[i3] = d4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d4Var;
    }

    public static String j(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    public static void n(String str) {
        new ImageReceiver(null).q0(ac.b(li.b0(h10.t0).T(str)), "50_50", null, null, null, 0);
        i6.k(str);
    }

    public static boolean v(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(j(wallPaper), j(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = hp.n1(hp.s1(this.currentAccount).a2(Long.valueOf(j10)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull b22 = getMessagesController().b2(j10);
                if (b22 != null) {
                    b22.wallpaper = null;
                    b22.flags &= -16777217;
                    getMessagesStorage().j2(b22, false);
                }
                r(j10, null);
                if (z10) {
                    hs.f(this.currentAccount).k(hs.E0, Long.valueOf(j10), b22);
                }
            }
        } else {
            long j11 = -j10;
            tL_messages_setChatWallPaper.peer = hp.l1(hp.s1(this.currentAccount).M0(Long.valueOf(j11)));
            TLRPC.ChatFull N0 = getMessagesController().N0(j11);
            if (N0 != null) {
                N0.wallpaper = null;
                N0.flags2 &= -129;
                getMessagesStorage().N1(N0, false);
            }
            r(j10, null);
            if (z10) {
                hs f10 = hs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(hs.T, N0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new ei.u5(8));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i3 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i3);
        for (int i10 = 0; i10 < i3; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i10, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.p3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.p3 c(long j10) {
        jg.b bVar;
        LongSparseArray longSparseArray = this.h;
        jg.b bVar2 = (jg.b) longSparseArray.get(j10);
        if (bVar2 == null) {
            String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j10, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new jg.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new jg.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new jg.b(string, null);
                }
                bVar2 = bVar;
                longSparseArray.put(j10, bVar2);
            }
            bVar2 = null;
            longSparseArray.put(j10, bVar2);
        }
        return i(bVar2);
    }

    public final TLRPC.WallPaper d(long j10) {
        if (j10 >= 0) {
            TLRPC.UserFull b22 = getMessagesController().b2(j10);
            if (b22 != null) {
                return b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 != null) {
                return N0.wallpaper;
            }
        }
        String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j10, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }

    public final ArrayList e(int i3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i3, 1);
        boolean hasFlag2 = TLObject.hasFlag(i3, 2);
        boolean hasFlag3 = TLObject.hasFlag(i3, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i10 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.p3) arrayList3.get(0)).a)) {
            org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(this.currentAccount);
            p3Var.e = "❌";
            p3Var.c = jg.b.d("❌");
            p3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            p3Var.a = true;
            org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3();
            o3Var.a = org.telegram.ui.ActionBar.p3.d(true);
            p3Var.f.add(o3Var);
            org.telegram.ui.ActionBar.o3 o3Var2 = new org.telegram.ui.ActionBar.o3();
            o3Var2.a = org.telegram.ui.ActionBar.p3.d(false);
            p3Var.f.add(o3Var2);
            arrayList3.add(0, p3Var);
        }
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.p3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j10) {
        File h = t0.h();
        Locale locale = Locale.US;
        return new File(h, j10 + "_" + this.c + ".jpg");
    }

    public final SharedPreferences h() {
        return t0.b.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    public final org.telegram.ui.ActionBar.p3 i(jg.b bVar) {
        if (bVar == null) {
            return null;
        }
        String str = bVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (org.telegram.ui.ActionBar.p3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
            if (bVar.equals(p3Var.c)) {
                return p3Var;
            }
        }
        return null;
    }

    public final void k() {
        SharedPreferences h = h();
        this.c = 0L;
        this.d = 0L;
        try {
            this.c = h.getLong("hash", 0L);
            this.d = h.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.b = b();
        qr messagesStorage = getMessagesStorage();
        u3 u3Var = new u3(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new pq(4, messagesStorage, u3Var));
        n("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            n(((org.telegram.ui.ActionBar.p3) obj).e);
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
            long h = p3Var.h(z10 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                p3Var.n(z10 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
            long h = p3Var.h(z10 ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                p3Var.p(z10 ? 1 : 0, new p1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull N0 = getMessagesController().N0(-m5.o(tL_updatePeerWallpaper.peer));
            if (N0 == null || v(N0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j10 = -N0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                N0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                N0.flags2 |= 128;
            } else {
                N0.wallpaper = null;
                N0.flags2 &= -129;
            }
            getMessagesStorage().N1(N0, false);
            r(j10, N0.wallpaper);
            g0.h3(new b4(0, this, N0));
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(tL_updatePeerWallpaper.peer.user_id);
        if (b22 == null || v(b22.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j11 = b22.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            b22.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            b22.wallpaper = tL_updatePeerWallpaper.wallpaper;
            b22.flags |= 16777216;
        } else {
            b22.wallpaper_overridden = false;
            b22.wallpaper = null;
            b22.flags &= -16777217;
        }
        getMessagesStorage().j2(b22, false);
        r(j11, b22.wallpaper);
        g0.h3(new a4(this, j11, b22, 0));
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(this.currentAccount, tL_chatThemeUniqueGift);
            p3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, p3Var);
            qr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.I(new pq(3, messagesStorage, Collections.singletonList(chatTheme)));
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z10) {
        if (this.c == 0 || this.d == 0) {
            k();
        }
        boolean z11 = System.currentTimeMillis() - this.d > 7200000;
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            p5 p5Var = s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new v3(p5Var), new n10() { // from class: org.telegram.messenger.w3
                /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                @Override // org.telegram.messenger.n10
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(Object obj, Object obj2) {
                    d4 d4Var = d4.this;
                    ResultCallback resultCallback2 = resultCallback;
                    boolean z12 = z10;
                    TL_account.Themes themes = (TL_account.Themes) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    ArrayList arrayList2 = null;
                    boolean z13 = true;
                    if (themes instanceof TL_account.TL_themes) {
                        TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                        d4Var.c = tL_themes.hash;
                        d4Var.d = System.currentTimeMillis();
                        SharedPreferences.Editor edit = d4Var.h().edit();
                        edit.clear();
                        edit.putLong("hash", d4Var.c);
                        edit.putLong("lastReload", d4Var.d);
                        edit.putInt("count", tL_themes.themes.size());
                        ArrayList arrayList3 = new ArrayList(tL_themes.themes.size());
                        for (int i3 = 0; i3 < tL_themes.themes.size(); i3++) {
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i3);
                            i6.k(tL_theme.emoticon);
                            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                            tL_theme.serializeToStream(serializedData);
                            edit.putString("theme_" + i3, Utilities.f(serializedData.toByteArray()));
                            org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d4Var.currentAccount, tL_theme);
                            p3Var.p(0, null);
                            p3Var.p(1, null);
                            p3Var.n(0, null);
                            p3Var.n(1, null);
                            arrayList3.add(p3Var);
                        }
                        edit.apply();
                        arrayList2 = arrayList3;
                    } else {
                        if (!(themes instanceof TL_account.TL_themesNotModified)) {
                            g0.h3(new b4(19, resultCallback2, tL_error));
                            if (z13) {
                                g0.h3(new ci.u8(d4Var, arrayList2, resultCallback2, z12, 10));
                                return;
                            }
                            return;
                        }
                        arrayList2 = d4Var.b();
                    }
                    z13 = false;
                    if (z13) {
                    }
                }
            });
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(e((z10 ? 1 : 0) | 2));
    }

    public final void r(long j10, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j10).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f10 = Utilities.f(serializedData.toByteArray());
        t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j10, f10).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j10, jg.b bVar, TLRPC.ChatTheme chatTheme, boolean z10) {
        String str;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (jg.b.a((jg.b) longSparseArray.get(j10), bVar)) {
            return;
        }
        if (bVar == null) {
            longSparseArray.delete(j10);
        } else {
            longSparseArray.put(j10, bVar);
        }
        t(j10, bVar != null ? bVar.b : null);
        if (j10 >= 0) {
            TLRPC.UserFull b22 = getMessagesController().b2(j10);
            if (b22 != null && (bVar == null || bVar.b() || chatTheme != null)) {
                b22.theme = chatTheme;
                getMessagesStorage().j2(b22, true);
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 != null) {
                N0.theme_emoticon = bVar != null ? bVar.a : null;
                getMessagesStorage().N1(N0, true);
            }
        }
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        String str2 = "chatTheme_" + this.currentAccount + "_" + j10;
        if (bVar != null) {
            String str3 = bVar.a;
            String str4 = bVar.b;
            if (str4 != null) {
                str = "gift_".concat(str4);
            } else if (str3 != null) {
                str = "emoticon_".concat(str3);
            }
            edit.putString(str2, str).apply();
            if (z10) {
                return;
            }
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (bVar != null) {
                String str5 = bVar.a;
                if (!TextUtils.isEmpty(str5)) {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str5;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                    tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                    tL_messages_setChatTheme.peer = getMessagesController().j1(j10);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            if (bVar != null) {
                String str6 = bVar.b;
                if (!TextUtils.isEmpty(str6)) {
                    TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
                    tl_inputChatThemeUniqueGift.slug = str6;
                    tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift;
                    tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                    tL_messages_setChatTheme.peer = getMessagesController().j1(j10);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().j1(j10);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
            return;
        }
        str = null;
        edit.putString(str2, str).apply();
        if (z10) {
        }
    }

    public final void t(long j10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j10));
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            }
            return;
        }
        if (j10 == 0) {
            Long l10 = (Long) hashMap.remove(str);
            if (l10 != null) {
                hashMap2.remove(l10);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j10), str);
        Long l11 = (Long) hashMap.put(str, Long.valueOf(j10));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l11 == null || l11.longValue() == j10) {
            return;
        }
        hashMap2.remove(l11);
    }

    public final int u(long j10, String str, org.telegram.ui.ActionBar.b6 b6Var, zi ziVar, ai.y1 y1Var) {
        boolean z10;
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = hp.n1(hp.s1(this.currentAccount).a2(Long.valueOf(j10)));
        } else {
            tL_messages_setChatWallPaper.peer = hp.l1(hp.s1(this.currentAccount).M0(Long.valueOf(-j10)));
        }
        tL_messages_setChatWallPaper.for_both = b6Var.o;
        if (ziVar == null || !(ziVar.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = hp.r1(b6Var);
            z10 = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = ziVar.f1();
            if (j10 >= 0) {
                userFull = hp.s1(this.currentAccount).b2(j10);
                N0 = null;
            } else {
                N0 = hp.s1(this.currentAccount).N0(-j10);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) ziVar.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper.id;
            tL_wallPaper.document = wallPaper.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (b6Var.k * 100.0f);
            tL_wallPaperSettings.motion = b6Var.j;
            tL_wallPaperSettings.blur = b6Var.i;
            tL_wallPaperSettings.background_color = b6Var.d;
            tL_wallPaperSettings.second_background_color = b6Var.e;
            tL_wallPaperSettings.third_background_color = b6Var.f;
            tL_wallPaperSettings.fourth_background_color = b6Var.g;
            tL_wallPaperSettings.rotation = b6Var.h;
            tL_wallPaper.uploadingImage = str;
            TLRPC.WallPaper wallPaper2 = userFull != null ? userFull.wallpaper : N0 != null ? N0.wallpaper : null;
            if (wallPaper2 != null && (str2 = wallPaper2.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper2.stripedThumb;
            }
            tL_wallPaper.settings.flags |= hs.F1;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = N0;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i3 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i3 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                hs.f(this.currentAccount).k(hs.E0, Long.valueOf(j10), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                hs f10 = hs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(hs.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = hp.g2(b6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new y3(this, j10, z10, str, y1Var));
    }
}
