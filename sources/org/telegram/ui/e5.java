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
/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e5 {
    public static final e5 d;
    public static final e5 e;
    public static final e5 f;
    public static final e5 h;
    public static final e5 n;
    public static final e5 r;
    public static final /* synthetic */ e5[] s;
    public final String a;
    public final int b;
    public final int c;

    static {
        e5 e5Var = new e5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = e5Var;
        e5 e5Var2 = new e5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = e5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        e5 e5Var3 = new e5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f = e5Var3;
        e5 e5Var4 = new e5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = e5Var4;
        e5 e5Var5 = new e5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        n = e5Var5;
        e5 e5Var6 = new e5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        r = e5Var6;
        s = new e5[]{e5Var, e5Var2, e5Var3, e5Var4, e5Var5, e5Var6};
    }

    public e5(int i10, int i11, int i12, String str, String str2) {
        this.a = str2;
        this.b = i11;
        this.c = i12;
    }

    public static e5 valueOf(String str) {
        return (e5) Enum.valueOf(e5.class, str);
    }

    public static e5[] values() {
        return (e5[]) s.clone();
    }
}
