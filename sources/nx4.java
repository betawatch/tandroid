// default package

import org.telegram.messenger.beta.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nx4 {
    public static final nx4 E;
    public static final nx4 F;
    public static final nx4 G;
    public static final nx4 H;
    public static final nx4 I;
    public static final nx4 J;
    public static final nx4 K;
    public static final nx4 L;
    public static final nx4 M;
    public static final nx4 N;
    public static final nx4 O;
    public static final nx4 P;
    public static final nx4 Q;
    public static final nx4 R;
    public static final nx4 S;
    public static final /* synthetic */ nx4[] T;
    public static final nx4 f;
    public static final nx4 h;
    public static final nx4 n;
    public static final nx4 r;
    public static final nx4 s;
    public static final nx4 w;
    public static final nx4 x;
    public static final nx4 y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    nx4 EF7;

    /* JADX INFO: Fake field, exist only in values array */
    nx4 EF0;

    static {
        nx4 nx4Var = new nx4("CONTACTS", 0, R.raw.tab_contacts);
        f = nx4Var;
        nx4 nx4Var2 = new nx4("CALLS", 1, R.raw.tab_calls);
        h = nx4Var2;
        nx4 nx4Var3 = new nx4("CHATS", 2, R.raw.tab_chats);
        n = nx4Var3;
        nx4 nx4Var4 = new nx4("SETTINGS", 3, R.raw.tab_settings);
        r = nx4Var4;
        nx4 nx4Var5 = new nx4(4, R.raw.tab_checklist, R.raw.tab_checklist_reverse, "CHECKLIST");
        s = nx4Var5;
        nx4 nx4Var6 = new nx4(5, R.raw.tab_colors, R.raw.tab_colors_reverse, "COLORS");
        w = nx4Var6;
        nx4 nx4Var7 = new nx4(6, R.raw.tab_files, R.raw.tab_files_reverse, "FILES");
        x = nx4Var7;
        nx4 nx4Var8 = new nx4(7, R.raw.tab_gallery, R.raw.tab_gallery_reverse, "GALLERY");
        y = nx4Var8;
        nx4 nx4Var9 = new nx4(8, R.raw.tab_gift, R.raw.tab_gift_reverse, "GIFT");
        nx4 nx4Var10 = new nx4(9, R.raw.tab_location, R.raw.tab_location_reverse, "LOCATION");
        E = nx4Var10;
        nx4 nx4Var11 = new nx4(10, R.raw.tab_sticker, R.raw.tab_sticker_reverse, "STICKER");
        F = nx4Var11;
        nx4 nx4Var12 = new nx4(11, R.raw.tab_emoji, R.raw.tab_emoji_reverse, "EMOJI");
        G = nx4Var12;
        nx4 nx4Var13 = new nx4(12, R.raw.tab_models, R.raw.tab_models_reverse, "MODELS");
        H = nx4Var13;
        nx4 nx4Var14 = new nx4(13, R.raw.tab_music, R.raw.tab_music_reverse, "MUSIC");
        I = nx4Var14;
        nx4 nx4Var15 = new nx4(14, R.raw.tab_poll, R.raw.tab_poll_reverse, "POLL");
        J = nx4Var15;
        nx4 nx4Var16 = new nx4(15, R.raw.tab_symbols, R.raw.tab_symbols_reverse, "SYMBOLS");
        K = nx4Var16;
        nx4 nx4Var17 = new nx4(16, R.raw.tab_reply, R.raw.tab_reply_reverse, "REPLIES");
        L = nx4Var17;
        nx4 nx4Var18 = new nx4(17, R.raw.tab_wallet, R.raw.tab_wallet_reverse, "WALLET");
        nx4 nx4Var19 = new nx4();
        M = nx4Var19;
        nx4 nx4Var20 = new nx4(19, R.raw.tab_article, R.raw.tab_article_reverse, "ARTICLE");
        N = nx4Var20;
        nx4 nx4Var21 = new nx4(20, R.raw.gram, R.raw.gram_reverse, "GRAM");
        O = nx4Var21;
        nx4 nx4Var22 = new nx4(21, R.raw.boosts, 25, 49, "BOOSTS");
        P = nx4Var22;
        nx4 nx4Var23 = new nx4(22, R.raw.monetize, 19, 45, "MONETIZATION");
        Q = nx4Var23;
        nx4 nx4Var24 = new nx4(23, R.raw.msg_stories_saved, 20, 40, "STORIES_SAVED");
        R = nx4Var24;
        nx4 nx4Var25 = new nx4("STORIES_ARCHIVE", 24, R.raw.msg_stories_archive);
        S = nx4Var25;
        T = new nx4[]{nx4Var, nx4Var2, nx4Var3, nx4Var4, nx4Var5, nx4Var6, nx4Var7, nx4Var8, nx4Var9, nx4Var10, nx4Var11, nx4Var12, nx4Var13, nx4Var14, nx4Var15, nx4Var16, nx4Var17, nx4Var18, nx4Var19, nx4Var20, nx4Var21, nx4Var22, nx4Var23, nx4Var24, nx4Var25};
    }

    public nx4() {
        this.c = R.drawable.tabs_link_24;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public static nx4 valueOf(String str) {
        return (nx4) Enum.valueOf(nx4.class, str);
    }

    public static nx4[] values() {
        return (nx4[]) T.clone();
    }

    public nx4(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.c = -1;
    }

    public nx4(String str, int i, int i2) {
        this.a = i2;
        this.b = i2;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    public nx4(int i, int i2, int i3, String str) {
        this.a = i2;
        this.b = i3;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
