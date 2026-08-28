package org.telegram.ui;

import org.telegram.messenger.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c5 {
    public static final c5 d;
    public static final c5 e;
    public static final c5 f;
    public static final c5 h;
    public static final c5 n;
    public static final c5 r;
    public static final /* synthetic */ c5[] s;
    public final String a;
    public final int b;
    public final int c;

    static {
        c5 c5Var = new c5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = c5Var;
        c5 c5Var2 = new c5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = c5Var2;
        int i9 = R.string.OpenGroup2;
        int i10 = R.drawable.msg_discussion;
        c5 c5Var3 = new c5(2, i9, i10, "OPEN_GROUP", "OpenGroup2");
        f = c5Var3;
        c5 c5Var4 = new c5(3, R.string.SendMessage, i10, "SEND_MESSAGE", "SendMessage");
        h = c5Var4;
        c5 c5Var5 = new c5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        n = c5Var5;
        c5 c5Var6 = new c5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        r = c5Var6;
        s = new c5[]{c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6};
    }

    public c5(int i9, int i10, int i11, String str, String str2) {
        this.a = str2;
        this.b = i10;
        this.c = i11;
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) s.clone();
    }
}
