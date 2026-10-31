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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g4 extends f1 {
    public static volatile r5 s = new r5("chatThemeQueue");
    public static final g4[] w = new g4[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final i2.w1 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public g4(int i10) {
        super(i10);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new i2.w1();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        k();
    }

    public static g4 f(int i10) {
        g4 g4Var;
        g4[] g4VarArr = w;
        g4 g4Var2 = g4VarArr[i10];
        if (g4Var2 != null) {
            return g4Var2;
        }
        synchronized (g4.class) {
            try {
                g4Var = g4VarArr[i10];
                if (g4Var == null) {
                    g4Var = new g4(i10);
                    g4VarArr[i10] = g4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g4Var;
    }

    public static String j(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    public static void n(String str) {
        new ImageReceiver(null).q0(ic.b(ui.b0(d20.s0).T(str)), "50_50", null, null, null, 0);
        k6.k(str);
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
        int i10 = 3;
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = vp.m1(vp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull a2 = getMessagesController().a2(j10);
                if (a2 != null) {
                    a2.wallpaper = null;
                    a2.flags &= -16777217;
                    getMessagesStorage().j2(a2, false);
                }
                r(j10, null);
                if (z10) {
                    zs.f(this.currentAccount).k(zs.E0, Long.valueOf(j10), a2);
                }
            }
        } else {
            long j11 = -j10;
            tL_messages_setChatWallPaper.peer = vp.k1(vp.r1(this.currentAccount).L0(Long.valueOf(j11)));
            TLRPC.ChatFull M0 = getMessagesController().M0(j11);
            if (M0 != null) {
                M0.wallpaper = null;
                M0.flags2 &= -129;
                getMessagesStorage().N1(M0, false);
            }
            r(j10, null);
            if (z10) {
                zs f7 = zs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f7.k(zs.T, M0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new ag.c3(i10));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i10 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i11, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.y3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.y3 c(long j10) {
        yf.b bVar;
        LongSparseArray longSparseArray = this.h;
        yf.b bVar2 = (yf.b) longSparseArray.get(j10);
        if (bVar2 == null) {
            String string = w0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j10, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new yf.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new yf.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new yf.b(string, null);
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
            TLRPC.UserFull a2 = getMessagesController().a2(j10);
            if (a2 != null) {
                return a2.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null) {
                return M0.wallpaper;
            }
        }
        String string = w0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j10, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return null;
    }

    public final ArrayList e(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i10, 1);
        boolean hasFlag2 = TLObject.hasFlag(i10, 2);
        boolean hasFlag3 = TLObject.hasFlag(i10, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i11 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.y3) arrayList3.get(0)).a)) {
            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.currentAccount);
            y3Var.e = "❌";
            y3Var.c = yf.b.d("❌");
            y3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            y3Var.a = true;
            org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3();
            x3Var.a = org.telegram.ui.ActionBar.y3.d(true);
            y3Var.f.add(x3Var);
            org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3();
            x3Var2.a = org.telegram.ui.ActionBar.y3.d(false);
            y3Var.f.add(x3Var2);
            arrayList3.add(0, y3Var);
        }
        int size = arrayList3.size();
        while (i11 < size) {
            Object obj = arrayList3.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.y3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j10) {
        File h = w0.h();
        Locale locale = Locale.US;
        return new File(h, j10 + "_" + this.c + ".jpg");
    }

    public final SharedPreferences h() {
        return w0.b.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    public final org.telegram.ui.ActionBar.y3 i(yf.b bVar) {
        if (bVar == null) {
            return null;
        }
        String str = bVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (org.telegram.ui.ActionBar.y3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
            if (bVar.equals(y3Var.c)) {
                return y3Var;
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
        } catch (Exception e) {
            f8.g(e, true);
        }
        this.b = b();
        hs messagesStorage = getMessagesStorage();
        x3 x3Var = new x3(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new hr(3, messagesStorage, x3Var));
        n("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n(((org.telegram.ui.ActionBar.y3) obj).e);
        }
    }

    public final void l(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
            long h = y3Var.h(z10 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                y3Var.n(z10 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
            long h = y3Var.h(z10 ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                y3Var.p(z10 ? 1 : 0, new s1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull M0 = getMessagesController().M0(-o5.o(tL_updatePeerWallpaper.peer));
            if (M0 == null || v(M0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j10 = -M0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                M0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                M0.flags2 |= 128;
            } else {
                M0.wallpaper = null;
                M0.flags2 &= -129;
            }
            getMessagesStorage().N1(M0, false);
            r(j10, M0.wallpaper);
            i0.g3(new e4(0, this, M0));
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(tL_updatePeerWallpaper.peer.user_id);
        if (a2 == null || v(a2.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j11 = a2.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            a2.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            a2.wallpaper = tL_updatePeerWallpaper.wallpaper;
            a2.flags |= 16777216;
        } else {
            a2.wallpaper_overridden = false;
            a2.wallpaper = null;
            a2.flags &= -16777217;
        }
        getMessagesStorage().j2(a2, false);
        r(j11, a2.wallpaper);
        i0.g3(new d4(this, j11, a2, 0));
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.currentAccount, tL_chatThemeUniqueGift);
            y3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, y3Var);
            hs messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.I(new hr(2, messagesStorage, Collections.singletonList(chatTheme)));
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
            r5 r5Var = s;
            Objects.requireNonNull(r5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new y3(r5Var), new j20() { // from class: org.telegram.messenger.z3
                /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                @Override // org.telegram.messenger.j20
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(Object obj, Object obj2) {
                    g4 g4Var = g4.this;
                    ResultCallback resultCallback2 = resultCallback;
                    boolean z12 = z10;
                    TL_account.Themes themes = (TL_account.Themes) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    ArrayList arrayList2 = null;
                    boolean z13 = true;
                    if (themes instanceof TL_account.TL_themes) {
                        TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                        g4Var.c = tL_themes.hash;
                        g4Var.d = System.currentTimeMillis();
                        SharedPreferences.Editor edit = g4Var.h().edit();
                        edit.clear();
                        edit.putLong("hash", g4Var.c);
                        edit.putLong("lastReload", g4Var.d);
                        edit.putInt("count", tL_themes.themes.size());
                        ArrayList arrayList3 = new ArrayList(tL_themes.themes.size());
                        for (int i10 = 0; i10 < tL_themes.themes.size(); i10++) {
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i10);
                            k6.k(tL_theme.emoticon);
                            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                            tL_theme.serializeToStream(serializedData);
                            edit.putString("theme_" + i10, Utilities.f(serializedData.toByteArray()));
                            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(g4Var.currentAccount, tL_theme);
                            y3Var.p(0, null);
                            y3Var.p(1, null);
                            y3Var.n(0, null);
                            y3Var.n(1, null);
                            arrayList3.add(y3Var);
                        }
                        edit.apply();
                        arrayList2 = arrayList3;
                    } else {
                        if (!(themes instanceof TL_account.TL_themesNotModified)) {
                            i0.g3(new e4(17, resultCallback2, tL_error));
                            if (z13) {
                                i0.g3(new bi.n4(g4Var, arrayList2, resultCallback2, z12, 8));
                                return;
                            }
                            return;
                        }
                        arrayList2 = g4Var.b();
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
            w0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j10).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f7 = Utilities.f(serializedData.toByteArray());
        w0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j10, f7).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j10, yf.b bVar, TLRPC.ChatTheme chatTheme, boolean z10) {
        String str;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (yf.b.a((yf.b) longSparseArray.get(j10), bVar)) {
            return;
        }
        if (bVar == null) {
            longSparseArray.delete(j10);
        } else {
            longSparseArray.put(j10, bVar);
        }
        t(j10, bVar != null ? bVar.b : null);
        if (j10 >= 0) {
            TLRPC.UserFull a2 = getMessagesController().a2(j10);
            if (a2 != null && (bVar == null || bVar.b() || chatTheme != null)) {
                a2.theme = chatTheme;
                getMessagesStorage().j2(a2, true);
            }
        } else {
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null) {
                M0.theme_emoticon = bVar != null ? bVar.a : null;
                getMessagesStorage().N1(M0, true);
            }
        }
        SharedPreferences.Editor edit = w0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
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
                    tL_messages_setChatTheme.peer = getMessagesController().i1(j10);
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
                    tL_messages_setChatTheme.peer = getMessagesController().i1(j10);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().i1(j10);
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
            Long l4 = (Long) hashMap.remove(str);
            if (l4 != null) {
                hashMap2.remove(l4);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j10), str);
        Long l10 = (Long) hashMap.put(str, Long.valueOf(j10));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l10 == null || l10.longValue() == j10) {
            return;
        }
        hashMap2.remove(l10);
    }

    public final int u(long j10, String str, org.telegram.ui.ActionBar.m6 m6Var, jj jjVar, ag.f3 f3Var) {
        boolean z10;
        TLRPC.ChatFull M0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = vp.m1(vp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
        } else {
            tL_messages_setChatWallPaper.peer = vp.k1(vp.r1(this.currentAccount).L0(Long.valueOf(-j10)));
        }
        tL_messages_setChatWallPaper.for_both = m6Var.o;
        if (jjVar == null || !(jjVar.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = vp.q1(m6Var);
            z10 = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = jjVar.f1();
            if (j10 >= 0) {
                userFull = vp.r1(this.currentAccount).a2(j10);
                M0 = null;
            } else {
                M0 = vp.r1(this.currentAccount).M0(-j10);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) jjVar.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper.id;
            tL_wallPaper.document = wallPaper.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (m6Var.k * 100.0f);
            tL_wallPaperSettings.motion = m6Var.j;
            tL_wallPaperSettings.blur = m6Var.i;
            tL_wallPaperSettings.background_color = m6Var.d;
            tL_wallPaperSettings.second_background_color = m6Var.e;
            tL_wallPaperSettings.third_background_color = m6Var.f;
            tL_wallPaperSettings.fourth_background_color = m6Var.g;
            tL_wallPaperSettings.rotation = m6Var.h;
            tL_wallPaper.uploadingImage = str;
            TLRPC.WallPaper wallPaper2 = userFull != null ? userFull.wallpaper : M0 != null ? M0.wallpaper : null;
            if (wallPaper2 != null && (str2 = wallPaper2.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper2.stripedThumb;
            }
            tL_wallPaper.settings.flags |= zs.F1;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = M0;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i10 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i10 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                zs.f(this.currentAccount).k(zs.E0, Long.valueOf(j10), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                zs f7 = zs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f7.k(zs.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = vp.f2(m6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new b4(this, j10, z10, str, f3Var));
    }
}
