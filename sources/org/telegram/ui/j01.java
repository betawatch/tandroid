package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.time.LocalDate;
import j$.time.Period;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j01 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public j01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        int b10 = e1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f3 != -1) {
            int b10 = e1Var.b();
            if (b10 != profileActivity.f3 && b10 != profileActivity.T2 && b10 != profileActivity.h3 && b10 != profileActivity.g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.z3 && b10 != profileActivity.i3 && b10 != profileActivity.j3 && b10 != profileActivity.q3 && b10 != profileActivity.n3 && b10 != profileActivity.k3 && b10 != profileActivity.m3 && b10 != profileActivity.r3 && b10 != profileActivity.s3 && b10 != profileActivity.v3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.a4 && b10 != profileActivity.c4 && b10 != profileActivity.g4 && b10 != profileActivity.f4 && b10 != profileActivity.l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.d4 && b10 != profileActivity.e4 && b10 != profileActivity.q4) {
                return false;
            }
        } else {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.ab) {
                Object currentObject = ((org.telegram.ui.Cells.ab) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = e1Var.f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 34 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        String str3 = str2;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i10)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i10)).username))) {
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
            str3 = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i11);
                    SpannableString spannableString = new SpannableString(org.telegram.ui.Components.b10.j("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        c01 c01Var = new c01(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, c01Var);
                        clickableSpan = c01Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.gc, this.e.z0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i11 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString(R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%1$s");
                str3 = spannableStringBuilder2;
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                    str3 = spannableStringBuilder2;
                }
            }
        }
        return str3;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 == profileActivity.D3 || i10 == profileActivity.y4 || i10 == profileActivity.e3 || i10 == profileActivity.S2 || i10 == profileActivity.p3 || i10 == profileActivity.u3 || i10 == profileActivity.s4) {
            return 1;
        }
        if (i10 == profileActivity.G3 || i10 == profileActivity.I3 || i10 == profileActivity.T2 || i10 == profileActivity.U2) {
            return 2;
        }
        if (i10 == profileActivity.L3 || i10 == profileActivity.V2) {
            return 19;
        }
        if (i10 == profileActivity.H3) {
            return 30;
        }
        if (i10 == profileActivity.J3 || i10 == profileActivity.K3 || i10 == profileActivity.W2) {
            return 3;
        }
        if (i10 == profileActivity.v4 || i10 == profileActivity.w4 || i10 == profileActivity.V3 || i10 == profileActivity.X3 || i10 == profileActivity.W3 || i10 == profileActivity.C4 || i10 == profileActivity.D4 || i10 == profileActivity.E4 || i10 == profileActivity.F4 || i10 == profileActivity.L4 || i10 == profileActivity.B4 || i10 == profileActivity.R4 || i10 == profileActivity.Q4 || i10 == profileActivity.U3 || i10 == profileActivity.f3 || i10 == profileActivity.h3 || i10 == profileActivity.g3 || i10 == profileActivity.i3 || i10 == profileActivity.j3 || i10 == profileActivity.q3 || i10 == profileActivity.n3 || i10 == profileActivity.k3 || i10 == profileActivity.m3 || i10 == profileActivity.r3 || i10 == profileActivity.s3 || i10 == profileActivity.v3 || i10 == profileActivity.w3 || i10 == profileActivity.x3 || i10 == profileActivity.y3 || i10 == profileActivity.O2 || i10 == profileActivity.a4 || i10 == profileActivity.Z3 || i10 == profileActivity.l3 || i10 == profileActivity.g4 || i10 == profileActivity.f4 || i10 == profileActivity.G4 || i10 == profileActivity.H4 || i10 == profileActivity.I4) {
            return 4;
        }
        i11 = profileActivity.botPermissionLocation;
        if (i10 == i11) {
            return 4;
        }
        i12 = profileActivity.botPermissionBiometry;
        if (i10 == i12) {
            return 4;
        }
        i13 = profileActivity.botPermissionEmojiStatus;
        if (i10 == i13 || i10 == profileActivity.e4) {
            return 4;
        }
        if (i10 == profileActivity.M3) {
            return 5;
        }
        if (i10 == profileActivity.N3) {
            return 6;
        }
        if (i10 == profileActivity.Q3) {
            return 20;
        }
        if (i10 == profileActivity.S4 || i10 == profileActivity.M4 || i10 == profileActivity.r4 || i10 == profileActivity.x4 || i10 == profileActivity.d3 || i10 == profileActivity.o3 || i10 == profileActivity.t3 || i10 == profileActivity.P2 || i10 == profileActivity.b3 || i10 == profileActivity.X2 || i10 == profileActivity.h4 || i10 == profileActivity.Y3 || i10 == profileActivity.R2 || i10 == profileActivity.Z2 || i10 == profileActivity.K4 || i10 == profileActivity.u4 || i10 == profileActivity.J4 || i10 == profileActivity.p4) {
            return 7;
        }
        if (i10 >= profileActivity.z4 && i10 < profileActivity.A4) {
            return 8;
        }
        if (i10 == profileActivity.A3) {
            return 11;
        }
        if (i10 == profileActivity.B3) {
            return 31;
        }
        if (i10 == profileActivity.C3) {
            return 12;
        }
        if (i10 == profileActivity.P4) {
            return 13;
        }
        if (i10 == profileActivity.z3) {
            return 14;
        }
        if (i10 == profileActivity.c3 || i10 == profileActivity.a3 || i10 == profileActivity.Y2) {
            return 15;
        }
        if (i10 == profileActivity.b4) {
            return 17;
        }
        if (i10 == profileActivity.c4) {
            return 18;
        }
        if (i10 == profileActivity.d4) {
            return 24;
        }
        if (i10 == profileActivity.P3) {
            return 21;
        }
        if (i10 == profileActivity.O3) {
            return 22;
        }
        if (i10 == profileActivity.Q2) {
            return 23;
        }
        if (i10 == profileActivity.i4) {
            return 25;
        }
        if (i10 == profileActivity.j4) {
            return 34;
        }
        if (i10 >= profileActivity.k4 && i10 < profileActivity.l4) {
            return 35;
        }
        if (i10 == profileActivity.m4) {
            return 4;
        }
        if (i10 == profileActivity.R3 || i10 == profileActivity.T3 || i10 == profileActivity.n4) {
            return 26;
        }
        if (i10 == profileActivity.o4) {
            return 32;
        }
        if (i10 == profileActivity.q4) {
            return 33;
        }
        if (i10 == profileActivity.S3) {
            return 27;
        }
        return (i10 == profileActivity.E3 || i10 == profileActivity.F3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:588:0x0ec4, code lost:
    
        if (r0.about != null) goto L594;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0655 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String string;
        CharSequence charSequence;
        String str;
        int i25;
        String str2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        long j10;
        TLRPC.Chat chat3;
        boolean z10;
        String str3;
        String str4;
        String str5;
        long j11;
        long j12;
        long j13;
        String str6;
        boolean z11;
        long j14;
        long j15;
        long j16;
        int i26;
        long j17;
        TLRPC.TL_username tL_username;
        String str7;
        String str8;
        long j18;
        int i27;
        CharSequence formatTextWithEntities;
        long j19;
        String string2;
        String str9;
        boolean z12;
        TLRPC.UserFull userFull;
        long j20;
        int i28;
        String formatString;
        int i29;
        int i30;
        TLRPC.UserFull userFull2;
        TLRPC.UserFull userFull3;
        TLRPC.UserFull userFull4;
        String str10;
        TLRPC.UserFull userFull5;
        String str11;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        TLRPC.ChatFull chatFull4;
        TLRPC.Chat chat4;
        boolean z13;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User user;
        boolean z14;
        boolean z15;
        TLRPC.UserFull userFull10;
        TLRPC.UserFull userFull11;
        TLRPC.UserFull userFull12;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        org.telegram.ui.Cells.v8 v8Var;
        int i73;
        int i74;
        TLRPC.UserFull userFull13;
        boolean z16;
        int i75;
        boolean z17;
        int i76;
        TLRPC.UserFull userFull14;
        int i77;
        int i78;
        int i79;
        long j21;
        int i80;
        TLRPC.ChatFull chatFull5;
        int i81;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i82;
        int i83;
        long j22;
        int i84;
        long j23;
        int i85;
        long j24;
        int i86;
        long j25;
        int i87;
        TLRPC.ChatFull chatFull8;
        int i88;
        TLRPC.ChatFull chatFull9;
        int i89;
        TLRPC.ChatFull chatFull10;
        TLRPC.ChatFull chatFull11;
        int i90;
        TLRPC.ChatFull chatFull12;
        TLRPC.Chat chat6;
        int i91;
        TLRPC.Chat chat7;
        int i92;
        TLRPC.Chat chat8;
        TLRPC.ChatFull chatFull13;
        int i93;
        TLRPC.Chat chat9;
        TLRPC.ChatFull chatFull14;
        int i94;
        TLRPC.Chat chat10;
        int i95;
        int i96;
        long j26;
        boolean z18;
        boolean z19;
        NotificationsController notificationsController;
        boolean z20;
        long j27;
        long j28;
        String str12;
        final boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        long j29;
        boolean z25;
        boolean z26;
        boolean z27;
        int i97;
        int i98;
        int i99;
        long j30;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i100;
        int i101;
        long j31;
        TLRPC.UserFull userFull20;
        int i102;
        TLRPC.UserFull userFull21;
        TLRPC.UserFull userFull22;
        TLRPC.UserFull userFull23;
        int i103;
        TLRPC.UserFull userFull24;
        TLRPC.UserFull userFull25;
        TLRPC.UserFull userFull26;
        TLRPC.ChatFull chatFull15;
        TL_bots.BotVerification botVerification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l4;
        long j32;
        TLRPC.User user2;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        int i104;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i105;
        long j33;
        TLRPC.Chat chat11;
        long j34;
        long j35;
        int i106;
        int i107;
        TLRPC.Chat chat12;
        int i108;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.W4;
        ArrayList arrayList2 = profileActivity.X4;
        HashSet hashSet = profileActivity.n5;
        int i109 = e1Var.f;
        View view = e1Var.a;
        String str13 = "";
        String str14 = null;
        r13 = null;
        String str15 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        int i110 = 0;
        switch (i109) {
            case 1:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                i11 = profileActivity.D3;
                if (i10 == i11) {
                    chat = profileActivity.E2;
                    if (ChatObject.isChannel(chat)) {
                        chat2 = profileActivity.E2;
                        if (!chat2.megagroup && profileActivity.K3 != -1) {
                            q4Var.setText(LocaleController.getString(R.string.ReportChatDescription));
                        }
                    }
                    q4Var.setText(LocaleController.getString(R.string.Info));
                } else {
                    i12 = profileActivity.y4;
                    if (i10 == i12) {
                        q4Var.setText(LocaleController.getString(R.string.ChannelMembers));
                    } else {
                        i13 = profileActivity.e3;
                        if (i10 == i13) {
                            q4Var.setText(LocaleController.getString(R.string.SETTINGS));
                        } else {
                            i14 = profileActivity.S2;
                            if (i10 == i14) {
                                q4Var.setText(LocaleController.getString(R.string.Account));
                            } else {
                                i15 = profileActivity.p3;
                                if (i10 == i15) {
                                    q4Var.setText(LocaleController.getString(R.string.SettingsHelp));
                                } else {
                                    i16 = profileActivity.u3;
                                    if (i10 == i16) {
                                        q4Var.setText(LocaleController.getString(R.string.SettingsDebug));
                                    } else {
                                        i17 = profileActivity.s4;
                                        if (i10 == i17) {
                                            q4Var.setText(LocaleController.getString(R.string.BotProfilePermissions));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                q4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.L6));
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                if (i10 == profileActivity.U2) {
                    MessagesController messagesController = profileActivity.getMessagesController();
                    j20 = profileActivity.e1;
                    TLRPC.UserFull userFull34 = messagesController.getUserFull(j20);
                    if (userFull34 != null && userFull34.birthday != null) {
                        boolean isToday = BirthdayController.isToday(userFull34);
                        TL_account.TL_birthday tL_birthday = userFull34.birthday;
                        boolean z30 = (tL_birthday.flags & 1) != 0;
                        int years = z30 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String a02 = UserInfoActivity.a0(userFull34.birthday);
                        if (z30) {
                            formatString = LocaleController.formatPluralString(isToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, a02);
                        } else {
                            formatString = LocaleController.formatString(isToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, a02);
                        }
                        g9Var.c(Emoji.replaceWithRestrictedEmoji(formatString, g9Var.a, new yx(this, e1Var, i10, 10)), LocaleController.getString(isToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday), (!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) ? false : true);
                        if (!profileActivity.s1 && isToday && !profileActivity.getMessagesController().premiumPurchaseBlocked()) {
                            i28 = 1;
                            z10 = false;
                            i110 = i28;
                        }
                    }
                    i28 = 0;
                    z10 = false;
                    i110 = i28;
                } else {
                    i18 = profileActivity.G3;
                    if (i10 == i18) {
                        MessagesController messagesController2 = profileActivity.getMessagesController();
                        j19 = profileActivity.e1;
                        TLRPC.User user3 = messagesController2.getUser(Long.valueOf(j19));
                        if (user3 != null && !TextUtils.isEmpty(profileActivity.j5)) {
                            string2 = org.telegram.messenger.vh.g(new StringBuilder("+"), profileActivity.j5, kf.b.c());
                            str9 = profileActivity.j5;
                        } else if (user3 == null || TextUtils.isEmpty(user3.phone)) {
                            string2 = LocaleController.getString(R.string.PhoneHidden);
                            str9 = null;
                        } else {
                            String g7 = org.telegram.messenger.vh.g(new StringBuilder("+"), user3.phone, kf.b.c());
                            str9 = user3.phone;
                            string2 = g7;
                        }
                        profileActivity.h5 = str9 != null && str9.matches("888\\d{8}");
                        z12 = profileActivity.h5;
                        g9Var.c(string2, LocaleController.getString(z12 ? R.string.AnonymousNumber : R.string.PhoneMobile), false);
                    } else {
                        i19 = profileActivity.H3;
                        if (i10 == i19) {
                            MessagesController messagesController3 = profileActivity.getMessagesController();
                            j18 = profileActivity.e1;
                            TLRPC.UserFull userFull35 = messagesController3.getUserFull(j18);
                            if (userFull35 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = userFull35.note;
                                i27 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                if (UserConfig.getInstance(i27).isPremium()) {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities);
                                    if (!(formatTextWithEntities instanceof SpannableStringBuilder)) {
                                        formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
                                    }
                                    AndroidUtilities.addLinksSafe((SpannableStringBuilder) formatTextWithEntities, 1, false, false);
                                } else {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(MessageObject.removeLinks(tL_textWithEntities));
                                }
                                g9Var.d(formatTextWithEntities, LocaleController.getString(R.string.ProfileNotes), LocaleController.getString(R.string.ProfileNotesInfo));
                            }
                        } else {
                            i20 = profileActivity.L3;
                            if (i10 == i20) {
                                ArrayList arrayList3 = new ArrayList();
                                j10 = profileActivity.e1;
                                if (j10 != 0) {
                                    MessagesController messagesController4 = profileActivity.getMessagesController();
                                    j17 = profileActivity.e1;
                                    TLRPC.User user4 = messagesController4.getUser(Long.valueOf(j17));
                                    if (user4 != null) {
                                        arrayList3.addAll(user4.usernames);
                                    }
                                    if (user4 == null || TextUtils.isEmpty(user4.username)) {
                                        tL_username = null;
                                        str7 = null;
                                    } else {
                                        tL_username = DialogObject.findUsername(user4.username, (ArrayList<TLRPC.TL_username>) arrayList3);
                                        str7 = user4.username;
                                    }
                                    ArrayList arrayList4 = user4 == null ? new ArrayList() : new ArrayList(user4.usernames);
                                    if (TextUtils.isEmpty(str7)) {
                                        int i111 = 0;
                                        while (true) {
                                            if (i111 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i111);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i111++;
                                                } else {
                                                    str7 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String string3 = LocaleController.getString(R.string.Username);
                                    if (str7 != null) {
                                        String concat = "@".concat(str7);
                                        if (tL_username == null || tL_username.editable) {
                                            str8 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                c01 c01Var = new c01(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, c01Var);
                                                clickableSpan = c01Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str8 = spannableString;
                                        }
                                    } else {
                                        str8 = "—";
                                    }
                                    z10 = !profileActivity.s1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str8;
                                    arrayList3 = arrayList5;
                                    str5 = str7;
                                    str4 = string3;
                                } else {
                                    chat3 = profileActivity.E2;
                                    if (chat3 != null) {
                                        MessagesController messagesController5 = profileActivity.getMessagesController();
                                        j11 = profileActivity.f1;
                                        TLRPC.Chat chat13 = messagesController5.getChat(Long.valueOf(j11));
                                        String publicUsername = ChatObject.getPublicUsername(chat13);
                                        if (chat13 != null) {
                                            arrayList3.addAll(chat13.usernames);
                                        }
                                        if (ChatObject.isPublic(chat13)) {
                                            z11 = !profileActivity.s1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().linkPrefix);
                                            sb2.append("/");
                                            sb2.append(publicUsername);
                                            j15 = profileActivity.g1;
                                            String str16 = str13;
                                            if (j15 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j16 = profileActivity.g1;
                                                sb3.append(j16);
                                                str16 = sb3.toString();
                                            }
                                            sb2.append(str16);
                                            str6 = sb2.toString();
                                            str4 = LocaleController.getString(R.string.InviteLink);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().linkPrefix);
                                            sb4.append("/c/");
                                            j12 = profileActivity.f1;
                                            sb4.append(j12);
                                            j13 = profileActivity.g1;
                                            String str17 = str13;
                                            if (j13 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j14 = profileActivity.g1;
                                                sb5.append(j14);
                                                str17 = sb5.toString();
                                            }
                                            sb4.append(str17);
                                            String sb6 = sb4.toString();
                                            str4 = LocaleController.getString(R.string.InviteLinkPrivate);
                                            str6 = sb6;
                                            z11 = false;
                                        }
                                        str5 = publicUsername;
                                        z10 = z11;
                                        str3 = str6;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        z10 = false;
                                        str3 = "";
                                        str4 = str3;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i26 = profileActivity.F3;
                                g9Var.c(str3, E, i26 == -1 && !(!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) && profileActivity.U2 < 0);
                            } else {
                                i21 = profileActivity.I3;
                                if (i10 == i21) {
                                    chatFull = profileActivity.u2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.u2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.u2;
                                            g9Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, LocaleController.getString(R.string.AttachLocation), false);
                                        }
                                    }
                                } else {
                                    i22 = profileActivity.T2;
                                    if (i10 == i22) {
                                        i25 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                        TLRPC.User currentUser = UserConfig.getInstance(i25).getCurrentUser();
                                        g9Var.c((currentUser == null || (str2 = currentUser.phone) == null || str2.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.vh.g(new StringBuilder("+"), currentUser.phone, kf.b.c()), LocaleController.getString(R.string.TapToChangePhone), true);
                                        g9Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i23 = profileActivity.V2;
                                        if (i10 == i23) {
                                            i24 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                            TLRPC.User currentUser2 = UserConfig.getInstance(i24).getCurrentUser();
                                            String string4 = LocaleController.getString(R.string.Username);
                                            if (currentUser2 == null || currentUser2.usernames.size() <= 0) {
                                                String publicUsername2 = UserObject.getPublicUsername(currentUser2);
                                                if (currentUser2 == null || TextUtils.isEmpty(publicUsername2)) {
                                                    string = LocaleController.getString(R.string.UsernameEmpty);
                                                    charSequence = string4;
                                                } else {
                                                    string = org.telegram.ui.Components.b10.j("@", publicUsername2);
                                                    charSequence = string4;
                                                }
                                            } else {
                                                int i112 = 0;
                                                while (true) {
                                                    if (i112 < currentUser2.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = currentUser2.usernames.get(i112);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i112++;
                                                        } else {
                                                            str = tL_username3.username;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                }
                                                if (str == null) {
                                                    str = currentUser2.username;
                                                }
                                                string = (str == null || TextUtils.isEmpty(str)) ? LocaleController.getString(R.string.UsernameEmpty) : "@".concat(str);
                                                charSequence = E(str, currentUser2.usernames, string4);
                                            }
                                            g9Var.c(string, charSequence, true);
                                            g9Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (i110 != 0) {
                    Drawable c10 = f0.c.c(g9Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.V6);
                    int i113 = ProfileActivity.R6;
                    c10.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.M6 = c10;
                    userFull = profileActivity.v2;
                    if (UserObject.areGiftsDisabled(userFull)) {
                        g9Var.setImage(null);
                        g9Var.setImageClickListener(null);
                    } else {
                        g9Var.b(c10, LocaleController.getString(R.string.GiftPremium));
                        g9Var.setImageClickListener(new vx0(profileActivity, 12));
                    }
                } else if (z10) {
                    Drawable c11 = f0.c.c(g9Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.v8);
                    int i114 = ProfileActivity.R6;
                    c11.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.N6 = c11;
                    g9Var.b(c11, LocaleController.getString(R.string.GetQRCode));
                    g9Var.setImageClickListener(new vx0(profileActivity, 13));
                } else {
                    g9Var.setImage(null);
                    g9Var.setImageClickListener(null);
                }
                g9Var.setTag(Integer.valueOf(i10));
                g9Var.a.setLoading(profileActivity.o5);
                g9Var.b.setLoading(profileActivity.o5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i29 = profileActivity.J3;
                if (i10 == i29) {
                    userFull8 = profileActivity.v2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.v2;
                        user = userFull12.user;
                    } else {
                        MessagesController messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.v2;
                        user = messagesController6.getUser(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.r2;
                    if (!z14) {
                        if (user != null && user.premium) {
                            userFull11 = profileActivity.v2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.v2;
                        jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.v2;
                    jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z15);
                } else if (i10 == profileActivity.K3) {
                    chatFull4 = profileActivity.u2;
                    String str18 = chatFull4.about;
                    while (str18.contains("\n\n\n")) {
                        str18 = str18.replace("\n\n\n", "\n\n");
                    }
                    String string5 = LocaleController.getString(R.string.DescriptionPlaceholder);
                    chat4 = profileActivity.E2;
                    if (ChatObject.isChannel(chat4)) {
                        chat5 = profileActivity.E2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            jVar.f(str18, string5, z13);
                            break;
                        }
                    }
                    z13 = false;
                    jVar.f(str18, string5, z13);
                } else {
                    i30 = profileActivity.W2;
                    if (i10 == i30) {
                        userFull2 = profileActivity.v2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.v2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(LocaleController.getString(R.string.UserBio), LocaleController.getString(R.string.UserBioDetail), false);
                                profileActivity.z2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.v2;
                        if (userFull3 == null) {
                            str10 = LocaleController.getString(R.string.Loading);
                        } else {
                            userFull4 = profileActivity.v2;
                            str10 = userFull4.about;
                        }
                        jVar.f(str10, LocaleController.getString(R.string.UserBio), profileActivity.getUserConfig().isPremium());
                        userFull5 = profileActivity.v2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.v2;
                            str11 = userFull6.about;
                        } else {
                            str11 = null;
                        }
                        profileActivity.z2 = str11;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                int i115 = org.telegram.ui.ActionBar.y6.m6;
                int i116 = org.telegram.ui.ActionBar.y6.G6;
                v8Var2.g(i115, i116);
                v8Var2.setTag(Integer.valueOf(i116));
                i31 = profileActivity.v4;
                if (i10 == i31) {
                    int i117 = org.telegram.messenger.t.m(profileActivity.getMessagesController(), profileActivity.i1).ttl;
                    v8Var2.q(LocaleController.getString(R.string.MessageLifetime), i117 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : LocaleController.formatTTLString(i117), false, false);
                } else {
                    i32 = profileActivity.Q4;
                    if (i10 == i32) {
                        v8Var2.k(LocaleController.getString(R.string.Unblock), false);
                        v8Var2.g(-1, org.telegram.ui.ActionBar.y6.p7);
                    } else {
                        i33 = profileActivity.w4;
                        if (i10 == i33) {
                            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40();
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(profileActivity.getMessagesController(), profileActivity.i1);
                            byte[] bArr = m10.key_hash;
                            y40Var.a = bArr;
                            if (bArr == null) {
                                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(m10.auth_key);
                                y40Var.a = calcAuthKeyHash;
                                m10.key_hash = calcAuthKeyHash;
                            }
                            y40Var.invalidateSelf();
                            v8Var2.v(LocaleController.getString(R.string.EncryptionKey), y40Var, false);
                        } else {
                            i34 = profileActivity.R4;
                            if (i10 == i34) {
                                v8Var2.g(-1, org.telegram.ui.ActionBar.y6.o6);
                                chat10 = profileActivity.E2;
                                if (chat10.megagroup) {
                                    v8Var2.k(LocaleController.getString(R.string.ProfileJoinGroup), false);
                                } else {
                                    v8Var2.k(LocaleController.getString(R.string.ProfileJoinChannel), false);
                                }
                            } else {
                                i35 = profileActivity.C4;
                                if (i10 == i35) {
                                    chatFull12 = profileActivity.u2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.E2;
                                        if (ChatObject.isChannel(chat8)) {
                                            chat9 = profileActivity.E2;
                                            if (!chat9.megagroup) {
                                                String string6 = LocaleController.getString(R.string.ChannelSubscribers);
                                                chatFull14 = profileActivity.u2;
                                                String formatNumber = LocaleController.formatNumber(chatFull14.participants_count, ',');
                                                int i118 = R.drawable.msg_groups;
                                                i94 = profileActivity.M4;
                                                v8Var2.s(string6, formatNumber, i118, i10 != i94 - 1);
                                            }
                                        }
                                        String string7 = LocaleController.getString(R.string.ChannelMembers);
                                        chatFull13 = profileActivity.u2;
                                        String formatNumber2 = LocaleController.formatNumber(chatFull13.participants_count, ',');
                                        int i119 = R.drawable.msg_groups;
                                        i93 = profileActivity.M4;
                                        v8Var2.s(string7, formatNumber2, i119, i10 != i93 - 1);
                                    } else {
                                        chat6 = profileActivity.E2;
                                        if (ChatObject.isChannel(chat6)) {
                                            chat7 = profileActivity.E2;
                                            if (!chat7.megagroup) {
                                                String string8 = LocaleController.getString(R.string.ChannelSubscribers);
                                                int i120 = R.drawable.msg_groups;
                                                i92 = profileActivity.M4;
                                                v8Var2.o(i120, string8, i10 != i92 - 1);
                                            }
                                        }
                                        String string9 = LocaleController.getString(R.string.ChannelMembers);
                                        int i121 = R.drawable.msg_groups;
                                        i91 = profileActivity.M4;
                                        v8Var2.o(i121, string9, i10 != i91 - 1);
                                    }
                                } else {
                                    i36 = profileActivity.D4;
                                    if (i10 == i36) {
                                        chatFull10 = profileActivity.u2;
                                        if (chatFull10 != null) {
                                            String string10 = LocaleController.getString(R.string.SubscribeRequests);
                                            chatFull11 = profileActivity.u2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            int i122 = R.drawable.msg_requests;
                                            i90 = profileActivity.M4;
                                            v8Var2.s(string10, format, i122, i10 != i90 - 1);
                                        }
                                    } else {
                                        i37 = profileActivity.E4;
                                        if (i10 == i37) {
                                            chatFull8 = profileActivity.u2;
                                            if (chatFull8 != null) {
                                                String string11 = LocaleController.getString(R.string.ChannelAdministrators);
                                                chatFull9 = profileActivity.u2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                int i123 = R.drawable.msg_admins;
                                                i89 = profileActivity.M4;
                                                v8Var2.s(string11, format2, i123, i10 != i89 - 1);
                                            } else {
                                                String string12 = LocaleController.getString(R.string.ChannelAdministrators);
                                                int i124 = R.drawable.msg_admins;
                                                i88 = profileActivity.M4;
                                                v8Var2.o(i124, string12, i10 != i88 - 1);
                                            }
                                        } else {
                                            i38 = profileActivity.F4;
                                            if (i10 == i38) {
                                                String string13 = LocaleController.getString(R.string.ChannelAdminSettings);
                                                int i125 = R.drawable.msg_customize;
                                                i87 = profileActivity.M4;
                                                v8Var2.o(i125, string13, i10 != i87 - 1);
                                            } else {
                                                i39 = profileActivity.I4;
                                                if (i10 == i39) {
                                                    i85 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                    bi.m0 g10 = bi.m0.g(i85);
                                                    j24 = profileActivity.f1;
                                                    TL_stars.StarsAmount c12 = g10.c(-j24);
                                                    i86 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                    bi.m0 g11 = bi.m0.g(i86);
                                                    j25 = profileActivity.f1;
                                                    long i126 = g11.i(-j25);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i126 > 0) {
                                                        double d = i126 / 1.0E9d;
                                                        if (d > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                                                        } else {
                                                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                                            decimalFormatSymbols.setDecimalSeparator('.');
                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                                            decimalFormat.setMinimumFractionDigits(2);
                                                            decimalFormat.setMaximumFractionDigits(3);
                                                            decimalFormat.setGroupingUsed(false);
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                                                        }
                                                    }
                                                    if (c12.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) bi.dd.J0(c12, 0.777f, ' '));
                                                    }
                                                    v8Var2.s(LocaleController.getString(R.string.ChannelStars), ke.K(bi.dd.W0(false, spannableStringBuilder, 0.7f, null), v8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i40 = profileActivity.m4;
                                                    if (i10 == i40) {
                                                        v8Var2.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                                                        v8Var2.o(R.drawable.ai_model_add, LocaleController.getString(R.string.AgentAddAnotherProvider), false);
                                                        v8Var2.w = 17;
                                                        v8Var2.s = 61;
                                                    } else {
                                                        i41 = profileActivity.G4;
                                                        if (i10 == i41) {
                                                            i84 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                            bi.m0 g12 = bi.m0.g(i84);
                                                            j23 = profileActivity.e1;
                                                            TL_stars.StarsAmount c13 = g12.c(j23);
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                            if (c13.amount > 0) {
                                                                spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) bi.dd.J0(c13, 0.777f, ' '));
                                                            }
                                                            v8Var2.s(LocaleController.getString(R.string.BotBalanceStars), ke.K(bi.dd.W0(false, spannableStringBuilder2, 0.7f, null), v8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                        } else {
                                                            i42 = profileActivity.H4;
                                                            if (i10 == i42) {
                                                                i83 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                                bi.m0 g13 = bi.m0.g(i83);
                                                                j22 = profileActivity.e1;
                                                                long i127 = g13.i(j22);
                                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                                if (i127 > 0) {
                                                                    double d10 = i127 / 1.0E9d;
                                                                    if (d10 > 1000.0d) {
                                                                        spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d10, 0));
                                                                    } else {
                                                                        DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                                                                        decimalFormatSymbols2.setDecimalSeparator('.');
                                                                        DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                                                                        decimalFormat2.setMinimumFractionDigits(2);
                                                                        decimalFormat2.setMaximumFractionDigits(3);
                                                                        decimalFormat2.setGroupingUsed(false);
                                                                        spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d10));
                                                                    }
                                                                }
                                                                v8Var2.s(LocaleController.getString(R.string.BotBalanceTON), ke.K(bi.dd.W0(false, spannableStringBuilder3, 0.7f, null), v8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                            } else {
                                                                i43 = profileActivity.L4;
                                                                if (i10 == i43) {
                                                                    chatFull5 = profileActivity.u2;
                                                                    if (chatFull5 != null) {
                                                                        String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                        chatFull6 = profileActivity.u2;
                                                                        int i128 = chatFull6.banned_count;
                                                                        chatFull7 = profileActivity.u2;
                                                                        String format3 = String.format("%d", Integer.valueOf(Math.max(i128, chatFull7.kicked_count)));
                                                                        int i129 = R.drawable.msg_user_remove;
                                                                        i82 = profileActivity.M4;
                                                                        v8Var2.s(string14, format3, i129, i10 != i82 - 1);
                                                                    } else {
                                                                        String string15 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                        int i130 = R.drawable.msg_user_remove;
                                                                        i81 = profileActivity.M4;
                                                                        v8Var2.o(i130, string15, i10 != i81 - 1);
                                                                    }
                                                                } else {
                                                                    i44 = profileActivity.B4;
                                                                    if (i10 == i44) {
                                                                        v8Var2.g(i115, i116);
                                                                        int i131 = i10 + 1;
                                                                        boolean z31 = i131 >= profileActivity.z4 && i131 < profileActivity.A4;
                                                                        String string16 = LocaleController.getString(R.string.AddMember);
                                                                        int i132 = R.drawable.msg_contact_add;
                                                                        i80 = profileActivity.M4;
                                                                        v8Var2.o(i132, string16, i80 == -1 || z31);
                                                                    } else {
                                                                        i45 = profileActivity.U3;
                                                                        if (i10 == i45) {
                                                                            v8Var2.k(LocaleController.getString(R.string.SendMessageLocation), true);
                                                                        } else {
                                                                            i46 = profileActivity.Z3;
                                                                            if (i10 == i46) {
                                                                                v8Var2.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), false);
                                                                                v8Var2.g(i115, i116);
                                                                            } else {
                                                                                i47 = profileActivity.W3;
                                                                                if (i10 == i47) {
                                                                                    v8Var2.o(R.drawable.menu_reaction_delete_24, LocaleController.getString(R.string.DeleteReactionMenu), false);
                                                                                    v8Var2.g(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                                                                                } else {
                                                                                    i48 = profileActivity.X3;
                                                                                    if (i10 == i48) {
                                                                                        MessagesController messagesController7 = profileActivity.getMessagesController();
                                                                                        j21 = profileActivity.g5;
                                                                                        TLRPC.Chat chat14 = messagesController7.getChat(Long.valueOf(-j21));
                                                                                        if (chat14 == null || !ChatObject.canBlockUsers(chat14)) {
                                                                                            v8Var2.o(R.drawable.msg_report, LocaleController.getString(R.string.ReportReaction2), false);
                                                                                        } else {
                                                                                            v8Var2.o(R.drawable.msg_block2, LocaleController.getString(R.string.ReportReactionAndBan2), false);
                                                                                        }
                                                                                        v8Var2.g(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                                                                                    } else {
                                                                                        i49 = profileActivity.V3;
                                                                                        if (i10 == i49) {
                                                                                            v8Var2.k(LocaleController.getString(R.string.ReportUserLocation), false);
                                                                                            int i133 = org.telegram.ui.ActionBar.y6.p7;
                                                                                            v8Var2.g(-1, i133);
                                                                                            v8Var2.g(-1, i133);
                                                                                        } else {
                                                                                            i50 = profileActivity.g3;
                                                                                            if (i10 == i50) {
                                                                                                v8Var2.u(LocaleController.getString(R.string.Language), LocaleController.getCurrentLanguageName(), false, R.drawable.msg2_language, false);
                                                                                                v8Var2.setImageLeft(23);
                                                                                            } else {
                                                                                                i51 = profileActivity.f3;
                                                                                                if (i10 == i51) {
                                                                                                    v8Var2.o(R.drawable.msg2_notifications, LocaleController.getString(R.string.NotificationsAndSounds), true);
                                                                                                } else {
                                                                                                    i52 = profileActivity.h3;
                                                                                                    if (i10 == i52) {
                                                                                                        v8Var2.o(R.drawable.msg2_secret, LocaleController.getString(R.string.PrivacySettings), true);
                                                                                                    } else {
                                                                                                        i53 = profileActivity.i3;
                                                                                                        if (i10 == i53) {
                                                                                                            v8Var2.o(R.drawable.msg2_data, LocaleController.getString(R.string.DataSettings), true);
                                                                                                        } else {
                                                                                                            i54 = profileActivity.j3;
                                                                                                            if (i10 == i54) {
                                                                                                                v8Var2.o(R.drawable.msg2_discussion, LocaleController.getString(R.string.ChatSettings), true);
                                                                                                            } else {
                                                                                                                i55 = profileActivity.k3;
                                                                                                                if (i10 == i55) {
                                                                                                                    v8Var2.o(R.drawable.msg2_folder, LocaleController.getString(R.string.Filters), true);
                                                                                                                } else {
                                                                                                                    i56 = profileActivity.m3;
                                                                                                                    if (i10 == i56) {
                                                                                                                        v8Var2.o(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), true);
                                                                                                                    } else {
                                                                                                                        i57 = profileActivity.l3;
                                                                                                                        if (i10 == i57) {
                                                                                                                            v8Var2.o(R.drawable.msg2_battery, LocaleController.getString(R.string.PowerUsage), true);
                                                                                                                        } else {
                                                                                                                            i58 = profileActivity.q3;
                                                                                                                            if (i10 == i58) {
                                                                                                                                v8Var2.o(R.drawable.msg2_ask_question, LocaleController.getString(R.string.AskAQuestion), true);
                                                                                                                            } else {
                                                                                                                                i59 = profileActivity.r3;
                                                                                                                                if (i10 == i59) {
                                                                                                                                    v8Var2.o(R.drawable.msg2_help, LocaleController.getString(R.string.TelegramFAQ), true);
                                                                                                                                } else {
                                                                                                                                    i60 = profileActivity.s3;
                                                                                                                                    if (i10 == i60) {
                                                                                                                                        v8Var2.o(R.drawable.msg2_policy, LocaleController.getString(R.string.PrivacyPolicy), false);
                                                                                                                                    } else {
                                                                                                                                        i61 = profileActivity.v3;
                                                                                                                                        if (i10 == i61) {
                                                                                                                                            v8Var2.k(LocaleController.getString(R.string.DebugSendLogs), true);
                                                                                                                                        } else {
                                                                                                                                            i62 = profileActivity.w3;
                                                                                                                                            if (i10 == i62) {
                                                                                                                                                v8Var2.k(LocaleController.getString(R.string.DebugSendLastLogs), true);
                                                                                                                                            } else {
                                                                                                                                                i63 = profileActivity.x3;
                                                                                                                                                if (i10 == i63) {
                                                                                                                                                    v8Var2.k(LocaleController.getString(R.string.DebugClearLogs), profileActivity.y3 != -1);
                                                                                                                                                } else if (i10 == profileActivity.y3) {
                                                                                                                                                    v8Var2.k("Switch Backend", false);
                                                                                                                                                } else {
                                                                                                                                                    i64 = profileActivity.n3;
                                                                                                                                                    if (i10 == i64) {
                                                                                                                                                        v8Var2.o(R.drawable.msg2_devices, LocaleController.getString(R.string.Devices), true);
                                                                                                                                                    } else {
                                                                                                                                                        i65 = profileActivity.O2;
                                                                                                                                                        if (i10 == i65) {
                                                                                                                                                            profileActivity.V.P(86);
                                                                                                                                                            profileActivity.V.L();
                                                                                                                                                            v8Var2.p(LocaleController.getString(R.string.SetProfilePhoto), profileActivity.V, false);
                                                                                                                                                            v8Var2.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                                                                                                                                                            v8Var2.getImageView().setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                                                                                                                                                            v8Var2.setImageLeft(12);
                                                                                                                                                            profileActivity.M2 = v8Var2;
                                                                                                                                                        } else {
                                                                                                                                                            i66 = profileActivity.a4;
                                                                                                                                                            if (i10 == i66) {
                                                                                                                                                                v8Var2.o(R.drawable.msg_groups_create, LocaleController.getString(R.string.AddToGroupOrChannel), false);
                                                                                                                                                            } else {
                                                                                                                                                                i67 = profileActivity.c4;
                                                                                                                                                                if (i10 == i67) {
                                                                                                                                                                    v8Var2.p(LocaleController.getString(R.string.TelegramPremium), new org.telegram.ui.Components.s5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), tg.b1.d().f), true);
                                                                                                                                                                    v8Var2.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i68 = profileActivity.d4;
                                                                                                                                                                    if (i10 == i68) {
                                                                                                                                                                        i79 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                                                                                                                                        bi.ca w10 = bi.ca.w(i79);
                                                                                                                                                                        long j36 = w10.p().amount;
                                                                                                                                                                        String string17 = LocaleController.getString(R.string.MenuTelegramStars);
                                                                                                                                                                        CharSequence charSequence2 = str13;
                                                                                                                                                                        if (w10.e) {
                                                                                                                                                                            charSequence2 = str13;
                                                                                                                                                                            if (j36 > 0) {
                                                                                                                                                                                charSequence2 = bi.dd.I0(w10.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v8Var2.t(string17, charSequence2, new org.telegram.ui.Components.s5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), tg.b1.d().h), true);
                                                                                                                                                                        v8Var2.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i69 = profileActivity.e4;
                                                                                                                                                                        if (i10 == i69) {
                                                                                                                                                                            i78 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                                                                                                                                                                            bi.ca L = bi.ca.L(i78);
                                                                                                                                                                            long j37 = L.p().amount;
                                                                                                                                                                            String string18 = LocaleController.getString(R.string.MyTON);
                                                                                                                                                                            CharSequence charSequence3 = str13;
                                                                                                                                                                            if (L.e) {
                                                                                                                                                                                charSequence3 = str13;
                                                                                                                                                                                if (j37 > 0) {
                                                                                                                                                                                    charSequence3 = bi.dd.I0(L.p(), 0.85f, ' ');
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v8Var2.s(string18, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                            v8Var2.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i70 = profileActivity.f4;
                                                                                                                                                                            if (i10 == i70) {
                                                                                                                                                                                v8Var2.o(R.drawable.menu_shop, LocaleController.getString(R.string.TelegramBusiness), true);
                                                                                                                                                                                v8Var2.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i71 = profileActivity.g4;
                                                                                                                                                                                if (i10 == i71) {
                                                                                                                                                                                    v8Var2.o(R.drawable.menu_gift, LocaleController.getString(R.string.SendAGift), false);
                                                                                                                                                                                    v8Var2.setImageLeft(23);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i72 = profileActivity.botPermissionLocation;
                                                                                                                                                                                    if (i10 == i72) {
                                                                                                                                                                                        String string19 = LocaleController.getString(R.string.BotProfilePermissionLocation);
                                                                                                                                                                                        hi.b1 b1Var = profileActivity.s2;
                                                                                                                                                                                        boolean z32 = b1Var != null && b1Var.g();
                                                                                                                                                                                        int i134 = R.drawable.filled_access_location;
                                                                                                                                                                                        int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.uj);
                                                                                                                                                                                        i77 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                        v8Var = v8Var2;
                                                                                                                                                                                        v8Var.m(string19, z32, i134, themedColor3, i77 != -1);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        v8Var = v8Var2;
                                                                                                                                                                                        i73 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                        if (i10 == i73) {
                                                                                                                                                                                            String string20 = LocaleController.getString(R.string.BotProfilePermissionBiometry);
                                                                                                                                                                                            hi.y yVar = profileActivity.t2;
                                                                                                                                                                                            v8Var.m(string20, yVar != null && yVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.xj), false);
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i74 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                            if (i10 == i74) {
                                                                                                                                                                                                String string21 = LocaleController.getString(R.string.BotProfilePermissionEmojiStatus);
                                                                                                                                                                                                userFull13 = profileActivity.v2;
                                                                                                                                                                                                if (userFull13 != null) {
                                                                                                                                                                                                    userFull14 = profileActivity.v2;
                                                                                                                                                                                                    if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                        z16 = true;
                                                                                                                                                                                                        int i135 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                                        int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.sj);
                                                                                                                                                                                                        i75 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                        if (i75 == -1) {
                                                                                                                                                                                                            i76 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                            if (i76 == -1) {
                                                                                                                                                                                                                z17 = false;
                                                                                                                                                                                                                v8Var.m(string21, z16, i135, themedColor4, z17);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        z17 = true;
                                                                                                                                                                                                        v8Var.m(string21, z16, i135, themedColor4, z17);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                z16 = false;
                                                                                                                                                                                                int i1352 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                                int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.sj);
                                                                                                                                                                                                i75 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                if (i75 == -1) {
                                                                                                                                                                                                }
                                                                                                                                                                                                z17 = true;
                                                                                                                                                                                                v8Var.m(string21, z16, i1352, themedColor42, z17);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v8Var2 = v8Var;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.f7.Z(v8Var2.c, org.telegram.ui.ActionBar.y6.I6, profileActivity.z0);
                break;
            case 6:
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                i95 = profileActivity.N3;
                if (i10 == i95) {
                    i96 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i96);
                    long j38 = profileActivity.i1;
                    if (j38 == 0) {
                        j27 = profileActivity.e1;
                        if (j27 != 0) {
                            j38 = profileActivity.e1;
                        } else {
                            j28 = profileActivity.f1;
                            j38 = -j28;
                        }
                    }
                    j26 = profileActivity.g1;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j38, j26);
                    boolean z33 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, false);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int d11 = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    int d12 = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
                    if (d11 == 3 && d12 != Integer.MAX_VALUE) {
                        int currentTime = d12 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str14 = z33 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsOn);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                            } else if (currentTime < 86400) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                            } else if (currentTime < 31536000) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                            }
                            z19 = false;
                        }
                    } else if (d11 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.isGlobalNotificationsEnabled(j38, false, false);
                            if (z18 || !z33) {
                                str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            } else {
                                str14 = LocaleController.getString(R.string.NotificationsCustom);
                            }
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z19 = z18;
                    } else {
                        if (d11 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z19 = z18;
                    }
                    if (str14 == null) {
                        str14 = LocaleController.getString(R.string.NotificationsOff);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str14 = String.format(Locale.US, LocaleController.getPluralString("NotificationTopicExceptionsDesctription", hashSet.size()), str14, Integer.valueOf(hashSet.size()));
                    }
                    String str19 = str14;
                    z20 = profileActivity.r5;
                    n5Var.setAnimationsEnabled(z20);
                    n5Var.b(LocaleController.getString(R.string.Notifications), str19, 0, z19, 0, false, profileActivity.i4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i10));
                break;
            case 8:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i10 - profileActivity.z4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.z4);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str20 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            z25 = false;
                            z26 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = LocaleController.getString(R.string.ChannelAdmin);
                            }
                            z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().getClientUserId();
                            z27 = false;
                            z26 = true;
                            z21 = z25;
                            str12 = str20;
                            z22 = z26;
                            z23 = z27;
                        } else {
                            z25 = false;
                            z26 = false;
                        }
                        z27 = z26;
                        z21 = z25;
                        str12 = str20;
                        z22 = z26;
                        z23 = z27;
                    } else {
                        String str21 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            str12 = str21;
                            z21 = false;
                            z22 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = LocaleController.getString(R.string.ChannelAdmin);
                            }
                            z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().getClientUserId();
                            str12 = str21;
                            z23 = false;
                            z22 = true;
                        } else {
                            str12 = str21;
                            z21 = false;
                            z22 = false;
                        }
                        z23 = z22;
                    }
                    final TLRPC.User user5 = profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    if (UserObject.isUserSelf(user5)) {
                        MessagesController messagesController8 = profileActivity.getMessagesController();
                        j29 = profileActivity.f1;
                        if (ChatObject.canManageMyTag(messagesController8.getChat(Long.valueOf(j29)))) {
                            z24 = true;
                            final String str22 = str12;
                            final boolean z34 = z22;
                            final boolean z35 = z23;
                            abVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.zz0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i136;
                                    org.telegram.ui.ActionBar.u6 u6Var;
                                    ProfileActivity profileActivity2 = j01.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i136 = ((org.telegram.ui.ActionBar.r2) profileActivity2).currentAccount;
                                    long a2 = profileActivity2.a();
                                    u6Var = ((org.telegram.ui.ActionBar.r2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.i11.b(parentActivity, i136, a2, user5, str22, z34, z35, z21, u6Var);
                                }
                            });
                            abVar.e(user5, i10 != profileActivity.A4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str222 = str12;
                    final boolean z342 = z22;
                    final boolean z352 = z23;
                    abVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.zz0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i136;
                            org.telegram.ui.ActionBar.u6 u6Var;
                            ProfileActivity profileActivity2 = j01.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i136 = ((org.telegram.ui.ActionBar.r2) profileActivity2).currentAccount;
                            long a2 = profileActivity2.a();
                            u6Var = ((org.telegram.ui.ActionBar.r2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.i11.b(parentActivity, i136, a2, user5, str222, z342, z352, z21, u6Var);
                        }
                    });
                    abVar.e(user5, i10 != profileActivity.A4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                i97 = profileActivity.c3;
                if (i10 != i97) {
                    i98 = profileActivity.a3;
                    if (i10 != i98) {
                        i99 = profileActivity.Y2;
                        if (i10 == i99) {
                            e7Var.setType(2);
                            break;
                        }
                    } else {
                        e7Var.setType(0);
                        break;
                    }
                } else {
                    e7Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.BotAddToGroupOrChannelInfo));
                break;
            case 20:
                String string22 = LocaleController.getString(R.string.Notifications);
                MessagesController messagesController9 = profileActivity.getMessagesController();
                long a2 = profileActivity.a();
                j30 = profileActivity.g1;
                ((org.telegram.ui.Cells.a9) view).f(string22, !messagesController9.isDialogMuted(a2, j30), false);
                break;
            case 21:
                jg.l1 l1Var = (jg.l1) view;
                userFull15 = profileActivity.v2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.v2;
                    tL_businessLocation = userFull16.business_location;
                }
                l1Var.a(tL_businessLocation, profileActivity.M3 < 0 && !profileActivity.s1);
                break;
            case 22:
                jg.k1 k1Var = (jg.k1) view;
                k1Var.setOnTimezoneSwitchClick(new yz0(this, 2));
                userFull17 = profileActivity.v2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.v2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.T4;
                z29 = profileActivity.U4;
                if ((profileActivity.M3 >= 0 || profileActivity.s1) && profileActivity.P3 < 0) {
                    r14 = false;
                }
                k1Var.b(tL_businessWorkHours, z28, z29, r14);
                break;
            case 23:
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
                MessagesController messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.v2;
                TLRPC.Chat chat15 = messagesController10.getChat(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.k6 k6Var = profileActivity.w2;
                l6Var.a(k6Var != null ? k6Var.d : null, chat15);
                break;
            case 26:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setLinkTextRippleColor(null);
                if (i10 == profileActivity.R3) {
                    i104 = profileActivity.j4;
                    if (i104 >= 0) {
                        i9Var.setFixedSize(0);
                        i9Var.setText(LocaleController.getString(R.string.AgentSubscriptionInfo));
                        break;
                    }
                }
                i100 = profileActivity.n4;
                if (i10 == i100) {
                    i9Var.setFixedSize(0);
                    i9Var.setText(LocaleController.getString(R.string.AgentTapHoldToDelete));
                    break;
                } else if (i10 == profileActivity.R3) {
                    profileActivity.getMessagesController().getUserOrChat(profileActivity.a());
                    userFull26 = profileActivity.v2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.v2;
                        botVerification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.u2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.u2;
                            botVerification = chatFull16.bot_verification;
                        } else {
                            botVerification = null;
                        }
                    }
                    userFull27 = profileActivity.v2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.v2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.v2;
                            l4 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.i4 < 0 || botVerification != null || l4 != null) {
                                i9Var.setFixedSize(0);
                                MessagesController messagesController11 = profileActivity.getMessagesController();
                                j32 = profileActivity.e1;
                                TLRPC.User user6 = messagesController11.getUser(Long.valueOf(j32));
                                boolean z36 = user6 == null && user6.bot && user6.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.i4 >= 0) {
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleTag(LocaleController.getString(z36 ? R.string.ProfileBotOpenAppInfoOwner : R.string.ProfileBotOpenAppInfo), new org.telegram.ui.Components.d60(17, this, z36)));
                                    if (botVerification != null || l4 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.c6(botVerification.icon, i9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(MessageObject.formatTextWithEntities(botVerification.description));
                                    try {
                                        AndroidUtilities.addLinksSafe(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i110 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i110];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new b01(this, url, url), spanStart, spanEnd, 33);
                                            i110++;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l4 != null && (user2 = profileActivity.getMessagesController().getUser(l4)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.zq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.ProfileBotManagedBy, UserObject.getPublicUsername(user2)), org.telegram.ui.ActionBar.y6.gc, profileActivity.z0, new fy0(7, this, l4)));
                                }
                                i9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.B6))));
                                i9Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                i9Var.setFixedSize(14);
                                i9Var.setText(null);
                                break;
                            }
                        }
                    }
                    l4 = null;
                    if (profileActivity.i4 < 0) {
                    }
                    i9Var.setFixedSize(0);
                    MessagesController messagesController112 = profileActivity.getMessagesController();
                    j32 = profileActivity.e1;
                    TLRPC.User user62 = messagesController112.getUser(Long.valueOf(j32));
                    if (user62 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.i4 >= 0) {
                    }
                    if (botVerification == null) {
                    }
                    i9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.B6))));
                    i9Var.setText(spannableStringBuilder42);
                } else {
                    i101 = profileActivity.T3;
                    if (i10 == i101) {
                        MessagesController messagesController12 = profileActivity.getMessagesController();
                        j31 = profileActivity.e1;
                        TLRPC.User user7 = messagesController12.getUser(Long.valueOf(j31));
                        if (user7 != null && user7.bot && user7.bot_can_edit) {
                            i9Var.setFixedSize(0);
                            int i136 = R.string.ProfileBotAffiliateProgramInfoOwner;
                            String userName = UserObject.getUserName(user7);
                            userFull23 = profileActivity.v2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.v2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.v2;
                                    i103 = userFull25.starref_program.commission_permille;
                                    i9Var.setText(LocaleController.formatString(i136, userName, hi.k.F0(i103)));
                                    break;
                                }
                            }
                            i103 = 0;
                            i9Var.setText(LocaleController.formatString(i136, userName, hi.k.F0(i103)));
                        } else {
                            i9Var.setFixedSize(0);
                            int i137 = R.string.ProfileBotAffiliateProgramInfo;
                            String userName2 = UserObject.getUserName(user7);
                            userFull20 = profileActivity.v2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.v2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.v2;
                                    i102 = userFull22.starref_program.commission_permille;
                                    i9Var.setText(LocaleController.formatString(i137, userName2, hi.k.F0(i102)));
                                    break;
                                }
                            }
                            i102 = 0;
                            i9Var.setText(LocaleController.formatString(i137, userName2, hi.k.F0(i102)));
                        }
                    }
                }
                break;
            case 27:
                hi.h hVar = (hi.h) view;
                hVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.y6.uj), R.drawable.filled_affiliate, LocaleController.getString(R.string.ProfileBotAffiliateProgram), null);
                userFull31 = profileActivity.v2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.v2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.v2;
                        str15 = hi.k.F0(userFull33.starref_program.commission_permille);
                    }
                }
                hVar.setPercent(str15);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                i105 = profileActivity.o4;
                if (i10 == i105) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.round_warn);
                    zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wj, profileActivity.z0));
                    profileActivity.P6 = zqVar;
                    spannableStringBuilder5.setSpan(zqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    int i138 = R.string.ProfileUnofficialSecurityRisk;
                    MessagesController messagesController13 = profileActivity.getMessagesController();
                    j33 = profileActivity.e1;
                    spannableStringBuilder5.append((CharSequence) LocaleController.formatString(i138, UserObject.getForcedFirstName(messagesController13.getUser(Long.valueOf(j33)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                ji.c cVar = (ji.c) view;
                chat11 = profileActivity.E2;
                if (chat11 == null) {
                    j34 = profileActivity.e1;
                    if (j34 != 0) {
                        MessagesController messagesController14 = profileActivity.getMessagesController();
                        j35 = profileActivity.e1;
                        TLRPC.User user8 = messagesController14.getUser(Long.valueOf(j35));
                        if (user8 != null) {
                            i106 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                            cVar.a(i106, profileActivity.getMessagesController().getChat(Long.valueOf(user8.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i107 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                    MessagesController messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.E2;
                    cVar.a(i107, messagesController15.getChat(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
            case 35:
                AgentController agentController = profileActivity.getMessagesController().getAgentController();
                i108 = profileActivity.k4;
                int i139 = i10 - i108;
                TL_agent.settings settingsVar = agentController.settings;
                if (settingsVar != null && i139 >= 0 && i139 < settingsVar.keys.size()) {
                    String str23 = agentController.settings.keys.get(i139).provider;
                    ((hi.s) view).a(agentController.getProvider(str23), str23, true, TextUtils.equals(str23, agentController.settings.active_provider), false, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View abVar;
        View g01Var;
        int i11;
        boolean z11 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                abVar = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 18, 7, false, profileActivity.z0);
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                org.telegram.ui.ActionBar.u6 u6Var = profileActivity.z0;
                if (i10 == 30) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                d01 d01Var = new d01(this, this.c, u6Var, z11, i10 == 19 ? true : z10);
                d01Var.setContentDescriptionValueFirst(true);
                abVar = d01Var;
                break;
            case 3:
                e01 e01Var = new e01(this, context, profileActivity, profileActivity.z0);
                profileActivity.U5 = e01Var;
                abVar = e01Var;
                break;
            case 4:
                abVar = new hs(this, context, profileActivity.z0);
                break;
            case 5:
                View a3Var = new org.telegram.ui.Cells.a3(context, profileActivity.z0);
                a3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                abVar = a3Var;
                break;
            case 6:
                abVar = new f01(this, context, profileActivity.z0);
                break;
            case 7:
                abVar = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 8:
                abVar = new org.telegram.ui.Cells.ab(profileActivity.B4 == -1 ? 9 : 6, 0, this.c, profileActivity.z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 10, profileActivity.z0);
                i9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.A6, profileActivity.z0);
                i9Var.getTextView().setMovementMethod(null);
                i9Var.setText(AndroidUtilities.getBuildVersionInfo());
                i9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                abVar = i9Var;
                break;
            case 11:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                View x3Var = new org.telegram.ui.Cells.x3(context, AndroidUtilities.dp(i10 == 31 ? 12.0f : 6.0f), 2);
                x3Var.setTag(-33024);
                abVar = x3Var;
                break;
            case 12:
                g01Var = new g01(this, context);
                g01Var.setBackground(new ColorDrawable(0));
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                g01Var = profileActivity.N;
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 15:
                abVar = new i01(this, context, profileActivity.z0);
                break;
            case 17:
                abVar = new org.telegram.ui.Cells.i9(context, profileActivity.z0);
                break;
            case 18:
            case 24:
                View s1Var = new tg.s1(context, i10 == 18 ? 0 : 1, profileActivity.z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, s1Var, profileActivity.z0);
                abVar = s1Var;
                break;
            case 20:
                abVar = new org.telegram.ui.Cells.a9(18, context, profileActivity.z0, false);
                break;
            case 21:
                View l1Var = new jg.l1(context, profileActivity.z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, l1Var, profileActivity.z0);
                abVar = l1Var;
                break;
            case 22:
                View h01Var = new h01(this, context, profileActivity.z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, h01Var, profileActivity.z0);
                abVar = h01Var;
                break;
            case 23:
                abVar = new a01(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                fi.d dVar = new fi.d(context, profileActivity.z0, true);
                dVar.f();
                dVar.i(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new yz0(this, 1));
                frameLayout.addView(dVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout, profileActivity.z0);
                abVar = frameLayout;
                break;
            case 26:
                abVar = new org.telegram.ui.Cells.i9(context, profileActivity.z0);
                break;
            case 27:
                abVar = new hi.h(context, profileActivity.z0);
                break;
            case 28:
                g01Var = new org.telegram.ui.Components.vn(context, 22);
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 32:
                abVar = new w01(profileActivity, context);
                break;
            case 33:
                abVar = new ji.c(context, profileActivity.z0);
                break;
            case 34:
                FrameLayout frameLayout2 = new FrameLayout(context);
                fi.d dVar2 = new fi.d(context, profileActivity.z0, true);
                dVar2.f();
                dVar2.i(LocaleController.getString(R.string.AgentAddApiKey), false, true);
                dVar2.setOnClickListener(new yz0(this, 0));
                frameLayout2.addView(dVar2, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 18.0f, 10.0f, 18.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, profileActivity.z0));
                abVar = frameLayout2;
                break;
            case 35:
                i11 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                abVar = new hi.s(context, i11, profileActivity.z0);
                break;
        }
        if (i10 != 13) {
            abVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new org.telegram.ui.Components.vl0(abVar);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        View view = e1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.g9) {
            ((org.telegram.ui.Cells.g9) view).a.setLoading(profileActivity.o5);
            ((org.telegram.ui.Cells.g9) view).b.setLoading(profileActivity.o5);
        }
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        View view = e1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
