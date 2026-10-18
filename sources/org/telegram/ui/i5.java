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
/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class i5 {
    public static final i5 d;
    public static final i5 e;
    public static final i5 f;
    public static final i5 h;
    public static final i5 n;
    public static final i5 r;
    public static final /* synthetic */ i5[] s;
    public final String a;
    public final int b;
    public final int c;

    static {
        i5 i5Var = new i5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = i5Var;
        i5 i5Var2 = new i5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = i5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        i5 i5Var3 = new i5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f = i5Var3;
        i5 i5Var4 = new i5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = i5Var4;
        i5 i5Var5 = new i5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        n = i5Var5;
        i5 i5Var6 = new i5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        r = i5Var6;
        s = new i5[]{i5Var, i5Var2, i5Var3, i5Var4, i5Var5, i5Var6};
    }

    public i5(int i10, int i11, int i12, String str, String str2) {
        this.a = str2;
        this.b = i11;
        this.c = i12;
    }

    public static i5 valueOf(String str) {
        return (i5) Enum.valueOf(i5.class, str);
    }

    public static i5[] values() {
        return (i5[]) s.clone();
    }
}
