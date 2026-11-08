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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d4 extends c1 {
    public static volatile p5 s = new p5("chatThemeQueue");
    public static final d4[] w = new d4[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final l2.u1 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public d4(int i7) {
        super(i7);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new l2.u1();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        k();
    }

    public static d4 f(int i7) {
        d4 d4Var;
        d4[] d4VarArr = w;
        d4 d4Var2 = d4VarArr[i7];
        if (d4Var2 != null) {
            return d4Var2;
        }
        synchronized (d4.class) {
            try {
                d4Var = d4VarArr[i7];
                if (d4Var == null) {
                    d4Var = new d4(i7);
                    d4VarArr[i7] = d4Var;
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
        new ImageReceiver(null).q0(hc.b(ui.b0(p10.s0).T(str)), "50_50", null, null, null, 0);
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

    public final void a(long j3, boolean z9, boolean z10) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = qp.n1(qp.s1(this.currentAccount).a2(Long.valueOf(j3)));
            tL_messages_setChatWallPaper.revert = z10;
            if (!z10) {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                if (b22 != null) {
                    b22.wallpaper = null;
                    b22.flags &= -16777217;
                    getMessagesStorage().j2(b22, false);
                }
                r(j3, null);
                if (z9) {
                    qs.f(this.currentAccount).k(qs.E0, Long.valueOf(j3), b22);
                }
            }
        } else {
            long j10 = -j3;
            tL_messages_setChatWallPaper.peer = qp.l1(qp.s1(this.currentAccount).M0(Long.valueOf(j10)));
            TLRPC.ChatFull N0 = getMessagesController().N0(j10);
            if (N0 != null) {
                N0.wallpaper = null;
                N0.flags2 &= -129;
                getMessagesStorage().N1(N0, false);
            }
            r(j3, null);
            if (z9) {
                qs f10 = qs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(qs.T, N0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new di.u5(8));
    }

    public final ArrayList b() {
        SharedPreferences h = h();
        int i7 = h.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.v(h.getString("theme_" + i10, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.r3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return arrayList;
    }

    public final org.telegram.ui.ActionBar.r3 c(long j3) {
        ig.b bVar;
        LongSparseArray longSparseArray = this.h;
        ig.b bVar2 = (ig.b) longSparseArray.get(j3);
        if (bVar2 == null) {
            String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + this.currentAccount + "_" + j3, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new ig.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new ig.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new ig.b(string, null);
                }
                bVar2 = bVar;
                longSparseArray.put(j3, bVar2);
            }
            bVar2 = null;
            longSparseArray.put(j3, bVar2);
        }
        return i(bVar2);
    }

    public final TLRPC.WallPaper d(long j3) {
        if (j3 >= 0) {
            TLRPC.UserFull b22 = getMessagesController().b2(j3);
            if (b22 != null) {
                return b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                return N0.wallpaper;
            }
        }
        String string = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j3, null);
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

    public final ArrayList e(int i7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i7, 1);
        boolean hasFlag2 = TLObject.hasFlag(i7, 2);
        boolean hasFlag3 = TLObject.hasFlag(i7, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i10 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((org.telegram.ui.ActionBar.r3) arrayList3.get(0)).a)) {
            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(this.currentAccount);
            r3Var.e = "❌";
            r3Var.c = ig.b.d("❌");
            r3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            r3Var.a = true;
            org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3();
            q3Var.a = org.telegram.ui.ActionBar.r3.d(true);
            r3Var.f.add(q3Var);
            org.telegram.ui.ActionBar.q3 q3Var2 = new org.telegram.ui.ActionBar.q3();
            q3Var2.a = org.telegram.ui.ActionBar.r3.d(false);
            r3Var.f.add(q3Var2);
            arrayList3.add(0, r3Var);
        }
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.r3) obj).k();
        }
        return arrayList3;
    }

    public final File g(long j3) {
        File h = t0.h();
        Locale locale = Locale.US;
        return new File(h, j3 + "_" + this.c + ".jpg");
    }

    public final SharedPreferences h() {
        return t0.b.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    public final org.telegram.ui.ActionBar.r3 i(ig.b bVar) {
        if (bVar == null) {
            return null;
        }
        String str = bVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (org.telegram.ui.ActionBar.r3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
            if (bVar.equals(r3Var.c)) {
                return r3Var;
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
        yr messagesStorage = getMessagesStorage();
        u3 u3Var = new u3(this, 0);
        messagesStorage.getClass();
        messagesStorage.I(new zq(4, messagesStorage, u3Var));
        n("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            n(((org.telegram.ui.ActionBar.r3) obj).e);
        }
    }

    public final void l(boolean z9) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
            long h = r3Var.h(z9 ? 1 : 0);
            if (h != 0 && !g(h).exists()) {
                r3Var.n(z9 ? 1 : 0, null);
            }
        }
    }

    public final void m(boolean z9) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
            long h = r3Var.h(z9 ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                r3Var.p(z9 ? 1 : 0, new j1(this, 1));
            }
        }
    }

    public final void o(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull N0 = getMessagesController().N0(-m5.o(tL_updatePeerWallpaper.peer));
            if (N0 == null || v(N0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j3 = -N0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                N0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                N0.flags2 |= 128;
            } else {
                N0.wallpaper = null;
                N0.flags2 &= -129;
            }
            getMessagesStorage().N1(N0, false);
            r(j3, N0.wallpaper);
            g0.h3(new b4(0, this, N0));
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(tL_updatePeerWallpaper.peer.user_id);
        if (b22 == null || v(b22.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j10 = b22.id;
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
        r(j10, b22.wallpaper);
        g0.h3(new a4(this, j10, b22, 0));
    }

    public final void p(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(this.currentAccount, tL_chatThemeUniqueGift);
            r3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, r3Var);
            yr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.I(new zq(3, messagesStorage, Collections.singletonList(chatTheme)));
        }
    }

    public final void q(final ResultCallback resultCallback, final boolean z9) {
        if (this.c == 0 || this.d == 0) {
            k();
        }
        boolean z10 = System.currentTimeMillis() - this.d > 7200000;
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z10) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            p5 p5Var = s;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(getchatthemes, new v3(p5Var), new v10() { // from class: org.telegram.messenger.w3
                /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                @Override // org.telegram.messenger.v10
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(Object obj, Object obj2) {
                    d4 d4Var = d4.this;
                    ResultCallback resultCallback2 = resultCallback;
                    boolean z11 = z9;
                    TL_account.Themes themes = (TL_account.Themes) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    ArrayList arrayList2 = null;
                    boolean z12 = true;
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
                        for (int i7 = 0; i7 < tL_themes.themes.size(); i7++) {
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i7);
                            i6.k(tL_theme.emoticon);
                            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                            tL_theme.serializeToStream(serializedData);
                            edit.putString("theme_" + i7, Utilities.f(serializedData.toByteArray()));
                            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(d4Var.currentAccount, tL_theme);
                            r3Var.p(0, null);
                            r3Var.p(1, null);
                            r3Var.n(0, null);
                            r3Var.n(1, null);
                            arrayList3.add(r3Var);
                        }
                        edit.apply();
                        arrayList2 = arrayList3;
                    } else {
                        if (!(themes instanceof TL_account.TL_themesNotModified)) {
                            g0.h3(new b4(19, resultCallback2, tL_error));
                            if (z12) {
                                g0.h3(new aa.d0(d4Var, arrayList2, resultCallback2, z11, 10));
                                return;
                            }
                            return;
                        }
                        arrayList2 = d4Var.b();
                    }
                    z12 = false;
                    if (z12) {
                    }
                }
            });
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(e((z9 ? 1 : 0) | 2));
    }

    public final void r(long j3, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j3).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f10 = Utilities.f(serializedData.toByteArray());
        t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j3, f10).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j3, ig.b bVar, TLRPC.ChatTheme chatTheme, boolean z9) {
        String str;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (ig.b.a((ig.b) longSparseArray.get(j3), bVar)) {
            return;
        }
        if (bVar == null) {
            longSparseArray.delete(j3);
        } else {
            longSparseArray.put(j3, bVar);
        }
        t(j3, bVar != null ? bVar.b : null);
        if (j3 >= 0) {
            TLRPC.UserFull b22 = getMessagesController().b2(j3);
            if (b22 != null && (bVar == null || bVar.b() || chatTheme != null)) {
                b22.theme = chatTheme;
                getMessagesStorage().j2(b22, true);
            }
        } else {
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                N0.theme_emoticon = bVar != null ? bVar.a : null;
                getMessagesStorage().N1(N0, true);
            }
        }
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        String str2 = "chatTheme_" + this.currentAccount + "_" + j3;
        if (bVar != null) {
            String str3 = bVar.a;
            String str4 = bVar.b;
            if (str4 != null) {
                str = "gift_".concat(str4);
            } else if (str3 != null) {
                str = "emoticon_".concat(str3);
            }
            edit.putString(str2, str).apply();
            if (z9) {
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
                    tL_messages_setChatTheme.peer = getMessagesController().j1(j3);
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
                    tL_messages_setChatTheme.peer = getMessagesController().j1(j3);
                    getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
                    return;
                }
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().j1(j3);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new d(this, 1));
            return;
        }
        str = null;
        edit.putString(str2, str).apply();
        if (z9) {
        }
    }

    public final void t(long j3, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j3));
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            }
            return;
        }
        if (j3 == 0) {
            Long l10 = (Long) hashMap.remove(str);
            if (l10 != null) {
                hashMap2.remove(l10);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j3), str);
        Long l11 = (Long) hashMap.put(str, Long.valueOf(j3));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l11 == null || l11.longValue() == j3) {
            return;
        }
        hashMap2.remove(l11);
    }

    public final int u(long j3, String str, org.telegram.ui.ActionBar.c6 c6Var, ij ijVar, ai.m0 m0Var) {
        boolean z9;
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = qp.n1(qp.s1(this.currentAccount).a2(Long.valueOf(j3)));
        } else {
            tL_messages_setChatWallPaper.peer = qp.l1(qp.s1(this.currentAccount).M0(Long.valueOf(-j3)));
        }
        tL_messages_setChatWallPaper.for_both = c6Var.o;
        if (ijVar == null || !(ijVar.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = qp.r1(c6Var);
            z9 = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = ijVar.f1();
            if (j3 >= 0) {
                userFull = qp.s1(this.currentAccount).b2(j3);
                N0 = null;
            } else {
                N0 = qp.s1(this.currentAccount).N0(-j3);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) ijVar.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper.id;
            tL_wallPaper.document = wallPaper.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (c6Var.k * 100.0f);
            tL_wallPaperSettings.motion = c6Var.j;
            tL_wallPaperSettings.blur = c6Var.i;
            tL_wallPaperSettings.background_color = c6Var.d;
            tL_wallPaperSettings.second_background_color = c6Var.e;
            tL_wallPaperSettings.third_background_color = c6Var.f;
            tL_wallPaperSettings.fourth_background_color = c6Var.g;
            tL_wallPaperSettings.rotation = c6Var.h;
            tL_wallPaper.uploadingImage = str;
            TLRPC.WallPaper wallPaper2 = userFull != null ? userFull.wallpaper : N0 != null ? N0.wallpaper : null;
            if (wallPaper2 != null && (str2 = wallPaper2.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper2.stripedThumb;
            }
            tL_wallPaper.settings.flags |= qs.F1;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull = N0;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i7 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i7 | 4;
            z9 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().j2(userFull, false);
                qs.f(this.currentAccount).k(qs.E0, Long.valueOf(j3), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().N1(chatFull, false);
                qs f10 = qs.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(qs.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = qp.g2(c6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new y3(this, j3, z9, str, m0Var));
    }
}
