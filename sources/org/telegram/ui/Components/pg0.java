package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pg0 {
    public static final pg0 A;
    public static final pg0 B;
    public static final pg0 C;
    public static final pg0 D;
    public static final pg0 E;
    public static final pg0 F;
    public static final pg0 G;
    public static final /* synthetic */ pg0[] H;
    public static final pg0 d;
    public static final pg0 e;
    public static final pg0 f;
    public static final pg0 h;
    public static final pg0 n;
    public static final pg0 r;
    public static final pg0 s;
    public static final pg0 v;
    public static final pg0 w;
    public static final pg0 x;
    public static final pg0 y;
    public final int a;
    public final int b;
    public final int c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        pg0 pg0Var = new pg0("MESSAGE", 0, i10, i11, i12);
        d = pg0Var;
        pg0 pg0Var2 = new pg0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = pg0Var2;
        pg0 pg0Var3 = new pg0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f = pg0Var3;
        pg0 pg0Var4 = new pg0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = pg0Var4;
        pg0 pg0Var5 = new pg0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        n = pg0Var5;
        pg0 pg0Var6 = new pg0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        r = pg0Var6;
        pg0 pg0Var7 = new pg0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        s = pg0Var7;
        pg0 pg0Var8 = new pg0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = pg0Var8;
        pg0 pg0Var9 = new pg0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        w = pg0Var9;
        pg0 pg0Var10 = new pg0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        x = pg0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        pg0 pg0Var11 = new pg0("LEAVE", 10, i13, i14, i14);
        y = pg0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        pg0 pg0Var12 = new pg0("VOICE_CHAT", 11, i15, i16, i16);
        A = pg0Var12;
        pg0 pg0Var13 = new pg0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        B = pg0Var13;
        pg0 pg0Var14 = new pg0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        C = pg0Var14;
        pg0 pg0Var15 = new pg0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        D = pg0Var15;
        pg0 pg0Var16 = new pg0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        E = pg0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        pg0 pg0Var17 = new pg0("EDIT_USERNAME", 16, i17, i18, i19);
        pg0 pg0Var18 = new pg0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        F = pg0Var18;
        pg0 pg0Var19 = new pg0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        G = pg0Var19;
        H = new pg0[]{pg0Var, pg0Var2, pg0Var3, pg0Var4, pg0Var5, pg0Var6, pg0Var7, pg0Var8, pg0Var9, pg0Var10, pg0Var11, pg0Var12, pg0Var13, pg0Var14, pg0Var15, pg0Var16, pg0Var17, pg0Var18, pg0Var19};
    }

    public pg0(String str, int i10, int i11, int i12, int i13) {
        this.a = i11;
        this.b = i12;
        this.c = i13;
    }

    public static pg0 valueOf(String str) {
        return (pg0) Enum.valueOf(pg0.class, str);
    }

    public static pg0[] values() {
        return (pg0[]) H.clone();
    }
}
