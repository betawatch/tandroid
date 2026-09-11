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
/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d5 {
    public static final d5 d;
    public static final d5 e;
    public static final d5 f;
    public static final d5 h;
    public static final d5 n;
    public static final d5 r;
    public static final /* synthetic */ d5[] s;
    public final String a;
    public final int b;
    public final int c;

    static {
        d5 d5Var = new d5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = d5Var;
        d5 d5Var2 = new d5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = d5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        d5 d5Var3 = new d5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f = d5Var3;
        d5 d5Var4 = new d5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = d5Var4;
        d5 d5Var5 = new d5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        n = d5Var5;
        d5 d5Var6 = new d5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        r = d5Var6;
        s = new d5[]{d5Var, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6};
    }

    public d5(int i10, int i11, int i12, String str, String str2) {
        this.a = str2;
        this.b = i11;
        this.c = i12;
    }

    public static d5 valueOf(String str) {
        return (d5) Enum.valueOf(d5.class, str);
    }

    public static d5[] values() {
        return (d5[]) s.clone();
    }
}
