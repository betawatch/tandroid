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
/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f5 {
    public static final f5 d;
    public static final f5 e;
    public static final f5 f;
    public static final f5 h;
    public static final f5 n;
    public static final f5 r;
    public static final /* synthetic */ f5[] s;
    public final String a;
    public final int b;
    public final int c;

    static {
        f5 f5Var = new f5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = f5Var;
        f5 f5Var2 = new f5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = f5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        f5 f5Var3 = new f5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f = f5Var3;
        f5 f5Var4 = new f5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = f5Var4;
        f5 f5Var5 = new f5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        n = f5Var5;
        f5 f5Var6 = new f5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        r = f5Var6;
        s = new f5[]{f5Var, f5Var2, f5Var3, f5Var4, f5Var5, f5Var6};
    }

    public f5(int i10, int i11, int i12, String str, String str2) {
        this.a = str2;
        this.b = i11;
        this.c = i12;
    }

    public static f5 valueOf(String str) {
        return (f5) Enum.valueOf(f5.class, str);
    }

    public static f5[] values() {
        return (f5[]) s.clone();
    }
}
