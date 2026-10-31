package gh;

import org.telegram.messenger.beta.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a {
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final a Q;
    public static final a R;
    public static final /* synthetic */ a[] S;
    public static final a f;
    public static final a h;
    public static final a n;
    public static final a r;
    public static final a s;
    public static final a w;
    public static final a x;
    public static final a y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    a EF7;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("CONTACTS", 0, R.raw.tab_contacts);
        f = aVar;
        a aVar2 = new a("CALLS", 1, R.raw.tab_calls);
        h = aVar2;
        a aVar3 = new a("CHATS", 2, R.raw.tab_chats);
        n = aVar3;
        a aVar4 = new a("SETTINGS", 3, R.raw.tab_settings);
        r = aVar4;
        a aVar5 = new a(4, R.raw.tab_checklist, "CHECKLIST", R.raw.tab_checklist_reverse);
        s = aVar5;
        a aVar6 = new a(5, R.raw.tab_colors, "COLORS", R.raw.tab_colors_reverse);
        w = aVar6;
        a aVar7 = new a(6, R.raw.tab_files, "FILES", R.raw.tab_files_reverse);
        x = aVar7;
        a aVar8 = new a(7, R.raw.tab_gallery, "GALLERY", R.raw.tab_gallery_reverse);
        y = aVar8;
        a aVar9 = new a(8, R.raw.tab_gift, "GIFT", R.raw.tab_gift_reverse);
        a aVar10 = new a(9, R.raw.tab_location, "LOCATION", R.raw.tab_location_reverse);
        D = aVar10;
        a aVar11 = new a(10, R.raw.tab_sticker, "STICKER", R.raw.tab_sticker_reverse);
        E = aVar11;
        a aVar12 = new a(11, R.raw.tab_emoji, "EMOJI", R.raw.tab_emoji_reverse);
        F = aVar12;
        a aVar13 = new a(12, R.raw.tab_models, "MODELS", R.raw.tab_models_reverse);
        G = aVar13;
        a aVar14 = new a(13, R.raw.tab_music, "MUSIC", R.raw.tab_music_reverse);
        H = aVar14;
        a aVar15 = new a(14, R.raw.tab_poll, "POLL", R.raw.tab_poll_reverse);
        I = aVar15;
        a aVar16 = new a(15, R.raw.tab_symbols, "SYMBOLS", R.raw.tab_symbols_reverse);
        J = aVar16;
        a aVar17 = new a(16, R.raw.tab_reply, "REPLIES", R.raw.tab_reply_reverse);
        K = aVar17;
        a aVar18 = new a(17, R.raw.tab_wallet, "WALLET", R.raw.tab_wallet_reverse);
        a aVar19 = new a();
        L = aVar19;
        a aVar20 = new a(19, R.raw.tab_article, "ARTICLE", R.raw.tab_article_reverse);
        M = aVar20;
        a aVar21 = new a(20, R.raw.gram, "GRAM", R.raw.gram_reverse);
        N = aVar21;
        a aVar22 = new a("BOOSTS", 21, R.raw.boosts, 25, 49);
        O = aVar22;
        a aVar23 = new a("MONETIZATION", 22, R.raw.monetize, 19, 45);
        P = aVar23;
        a aVar24 = new a("STORIES_SAVED", 23, R.raw.msg_stories_saved, 20, 40);
        Q = aVar24;
        a aVar25 = new a("STORIES_ARCHIVE", 24, R.raw.msg_stories_archive);
        R = aVar25;
        S = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25};
    }

    public a(String str, int i10, int i11, int i12, int i13) {
        this.a = i11;
        this.b = i11;
        this.d = i12;
        this.e = i13;
        this.c = -1;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) S.clone();
    }

    public a() {
        this.c = R.drawable.tabs_link_24;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public a(String str, int i10, int i11) {
        this.a = i11;
        this.b = i11;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    public a(int i10, int i11, String str, int i12) {
        this.a = i11;
        this.b = i12;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
