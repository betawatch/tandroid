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
import android.text.style.ForegroundColorSpan;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i01 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public i01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        int b10 = m1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.L2) {
            profileActivity.J2 = null;
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.c3 != -1) {
            int b10 = m1Var.b();
            if (b10 != profileActivity.c3 && b10 != profileActivity.Q2 && b10 != profileActivity.e3 && b10 != profileActivity.d3 && b10 != profileActivity.S2 && b10 != profileActivity.T2 && b10 != profileActivity.w3 && b10 != profileActivity.f3 && b10 != profileActivity.g3 && b10 != profileActivity.n3 && b10 != profileActivity.k3 && b10 != profileActivity.h3 && b10 != profileActivity.j3 && b10 != profileActivity.o3 && b10 != profileActivity.p3 && b10 != profileActivity.s3 && b10 != profileActivity.t3 && b10 != profileActivity.u3 && b10 != profileActivity.v3 && b10 != profileActivity.L2 && b10 != profileActivity.X3 && b10 != profileActivity.Z3 && b10 != profileActivity.d4 && b10 != profileActivity.c4 && b10 != profileActivity.i3 && b10 != profileActivity.R2 && b10 != profileActivity.N2 && b10 != profileActivity.a4 && b10 != profileActivity.b4 && b10 != profileActivity.i4) {
                return false;
            }
        } else {
            View view = m1Var.a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = m1Var.f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
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
                    SpannableString spannableString = new SpannableString(yh.k("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        b01 b01Var = new b01(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, b01Var);
                        clickableSpan = b01Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, this.e.w0)), 0, spannableString.length(), 33);
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

    @Override // f2.p0
    public final int h() {
        return this.e.K2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 == profileActivity.A3 || i10 == profileActivity.q4 || i10 == profileActivity.b3 || i10 == profileActivity.P2 || i10 == profileActivity.m3 || i10 == profileActivity.r3 || i10 == profileActivity.k4) {
            return 1;
        }
        if (i10 == profileActivity.D3 || i10 == profileActivity.F3 || i10 == profileActivity.Q2 || i10 == profileActivity.R2) {
            return 2;
        }
        if (i10 == profileActivity.I3 || i10 == profileActivity.S2) {
            return 19;
        }
        if (i10 == profileActivity.E3) {
            return 30;
        }
        if (i10 == profileActivity.G3 || i10 == profileActivity.H3 || i10 == profileActivity.T2) {
            return 3;
        }
        if (i10 == profileActivity.n4 || i10 == profileActivity.o4 || i10 == profileActivity.S3 || i10 == profileActivity.U3 || i10 == profileActivity.T3 || i10 == profileActivity.u4 || i10 == profileActivity.v4 || i10 == profileActivity.w4 || i10 == profileActivity.x4 || i10 == profileActivity.D4 || i10 == profileActivity.t4 || i10 == profileActivity.I4 || i10 == profileActivity.H4 || i10 == profileActivity.R3 || i10 == profileActivity.c3 || i10 == profileActivity.e3 || i10 == profileActivity.d3 || i10 == profileActivity.f3 || i10 == profileActivity.g3 || i10 == profileActivity.n3 || i10 == profileActivity.k3 || i10 == profileActivity.h3 || i10 == profileActivity.j3 || i10 == profileActivity.o3 || i10 == profileActivity.p3 || i10 == profileActivity.s3 || i10 == profileActivity.t3 || i10 == profileActivity.u3 || i10 == profileActivity.v3 || i10 == profileActivity.L2 || i10 == profileActivity.X3 || i10 == profileActivity.W3 || i10 == profileActivity.i3 || i10 == profileActivity.d4 || i10 == profileActivity.c4 || i10 == profileActivity.y4 || i10 == profileActivity.z4 || i10 == profileActivity.A4) {
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
        if (i10 == i13 || i10 == profileActivity.b4) {
            return 4;
        }
        if (i10 == profileActivity.J3) {
            return 5;
        }
        if (i10 == profileActivity.K3) {
            return 6;
        }
        if (i10 == profileActivity.N3) {
            return 20;
        }
        if (i10 == profileActivity.J4 || i10 == profileActivity.E4 || i10 == profileActivity.j4 || i10 == profileActivity.p4 || i10 == profileActivity.a3 || i10 == profileActivity.l3 || i10 == profileActivity.q3 || i10 == profileActivity.M2 || i10 == profileActivity.Y2 || i10 == profileActivity.U2 || i10 == profileActivity.e4 || i10 == profileActivity.V3 || i10 == profileActivity.O2 || i10 == profileActivity.W2 || i10 == profileActivity.C4 || i10 == profileActivity.m4 || i10 == profileActivity.B4 || i10 == profileActivity.h4) {
            return 7;
        }
        if (i10 >= profileActivity.r4 && i10 < profileActivity.s4) {
            return 8;
        }
        if (i10 == profileActivity.x3) {
            return 11;
        }
        if (i10 == profileActivity.y3) {
            return 31;
        }
        if (i10 == profileActivity.z3) {
            return 12;
        }
        if (i10 == profileActivity.G4) {
            return 13;
        }
        if (i10 == profileActivity.w3) {
            return 14;
        }
        if (i10 == profileActivity.Z2 || i10 == profileActivity.X2 || i10 == profileActivity.V2) {
            return 15;
        }
        if (i10 == profileActivity.Y3) {
            return 17;
        }
        if (i10 == profileActivity.Z3) {
            return 18;
        }
        if (i10 == profileActivity.a4) {
            return 24;
        }
        if (i10 == profileActivity.M3) {
            return 21;
        }
        if (i10 == profileActivity.L3) {
            return 22;
        }
        if (i10 == profileActivity.N2) {
            return 23;
        }
        if (i10 == profileActivity.f4) {
            return 25;
        }
        if (i10 == profileActivity.O3 || i10 == profileActivity.Q3) {
            return 26;
        }
        if (i10 == profileActivity.g4) {
            return 32;
        }
        if (i10 == profileActivity.i4) {
            return 33;
        }
        if (i10 == profileActivity.P3) {
            return 27;
        }
        return (i10 == profileActivity.B3 || i10 == profileActivity.C3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:566:0x0e36, code lost:
    
        if (r0.about != null) goto L574;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1309  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x1349  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
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
        String str3;
        String str4;
        boolean z4;
        String str5;
        long j11;
        long j12;
        long j13;
        String str6;
        boolean z10;
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
        boolean z11;
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
        boolean z12;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User user;
        boolean z13;
        boolean z14;
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
        org.telegram.ui.Cells.o8 o8Var;
        int i72;
        int i73;
        TLRPC.UserFull userFull13;
        boolean z15;
        int i74;
        boolean z16;
        int i75;
        TLRPC.UserFull userFull14;
        int i76;
        int i77;
        int i78;
        long j21;
        int i79;
        TLRPC.ChatFull chatFull5;
        int i80;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i81;
        int i82;
        long j22;
        int i83;
        long j23;
        int i84;
        long j24;
        int i85;
        long j25;
        int i86;
        TLRPC.ChatFull chatFull8;
        int i87;
        TLRPC.ChatFull chatFull9;
        int i88;
        TLRPC.ChatFull chatFull10;
        TLRPC.ChatFull chatFull11;
        int i89;
        TLRPC.ChatFull chatFull12;
        TLRPC.Chat chat6;
        int i90;
        TLRPC.Chat chat7;
        int i91;
        TLRPC.Chat chat8;
        TLRPC.ChatFull chatFull13;
        int i92;
        TLRPC.Chat chat9;
        TLRPC.ChatFull chatFull14;
        int i93;
        TLRPC.Chat chat10;
        int i94;
        int i95;
        long j26;
        boolean z17;
        boolean z18;
        NotificationsController notificationsController;
        boolean z19;
        long j27;
        long j28;
        String str12;
        final boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        long j29;
        boolean z24;
        boolean z25;
        boolean z26;
        int i96;
        int i97;
        int i98;
        long j30;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z27;
        boolean z28;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i99;
        int i100;
        long j31;
        TLRPC.UserFull userFull20;
        int i101;
        TLRPC.UserFull userFull21;
        TLRPC.UserFull userFull22;
        TLRPC.UserFull userFull23;
        int i102;
        TLRPC.UserFull userFull24;
        TLRPC.UserFull userFull25;
        TLRPC.UserFull userFull26;
        TLRPC.ChatFull chatFull15;
        TL_bots.botVerification botverification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l10;
        long j32;
        TLRPC.User user2;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i103;
        org.telegram.ui.ActionBar.g6 g6Var;
        long j33;
        TLRPC.Chat chat11;
        long j34;
        long j35;
        int i104;
        int i105;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.N4;
        ArrayList arrayList2 = profileActivity.O4;
        HashSet hashSet = profileActivity.e5;
        int i106 = m1Var.f;
        View view = m1Var.a;
        String str13 = "";
        String str14 = null;
        r10 = null;
        String str15 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        r12 = true;
        boolean z29 = true;
        int i107 = 0;
        switch (i106) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                i11 = profileActivity.A3;
                if (i10 == i11) {
                    chat = profileActivity.B2;
                    if (ChatObject.isChannel(chat)) {
                        chat2 = profileActivity.B2;
                        if (!chat2.megagroup && profileActivity.H3 != -1) {
                            m4Var.setText(LocaleController.getString(R.string.ReportChatDescription));
                        }
                    }
                    m4Var.setText(LocaleController.getString(R.string.Info));
                } else {
                    i12 = profileActivity.q4;
                    if (i10 == i12) {
                        m4Var.setText(LocaleController.getString(R.string.ChannelMembers));
                    } else {
                        i13 = profileActivity.b3;
                        if (i10 == i13) {
                            m4Var.setText(LocaleController.getString(R.string.SETTINGS));
                        } else {
                            i14 = profileActivity.P2;
                            if (i10 == i14) {
                                m4Var.setText(LocaleController.getString(R.string.Account));
                            } else {
                                i15 = profileActivity.m3;
                                if (i10 == i15) {
                                    m4Var.setText(LocaleController.getString(R.string.SettingsHelp));
                                } else {
                                    i16 = profileActivity.r3;
                                    if (i10 == i16) {
                                        m4Var.setText(LocaleController.getString(R.string.SettingsDebug));
                                    } else {
                                        i17 = profileActivity.k4;
                                        if (i10 == i17) {
                                            m4Var.setText(LocaleController.getString(R.string.BotProfilePermissions));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.L6));
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == profileActivity.R2) {
                    MessagesController messagesController = profileActivity.getMessagesController();
                    j20 = profileActivity.b1;
                    TLRPC.UserFull userFull34 = messagesController.getUserFull(j20);
                    if (userFull34 != null && userFull34.birthday != null) {
                        boolean isToday = BirthdayController.isToday(userFull34);
                        TL_account.TL_birthday tL_birthday = userFull34.birthday;
                        boolean z30 = (tL_birthday.flags & 1) != 0;
                        int years = z30 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String Z = UserInfoActivity.Z(userFull34.birthday);
                        if (z30) {
                            formatString = LocaleController.formatPluralString(isToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, Z);
                        } else {
                            formatString = LocaleController.formatString(isToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, Z);
                        }
                        y8Var.c(Emoji.replaceWithRestrictedEmoji(formatString, y8Var.a, new bu0(this, m1Var, i10, 4)), LocaleController.getString(isToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday), (!profileActivity.n1 && profileActivity.L3 == -1 && profileActivity.M3 == -1) ? false : true);
                        if (!profileActivity.p1 && isToday && !profileActivity.getMessagesController().premiumPurchaseBlocked()) {
                            i28 = 1;
                            i107 = i28;
                        }
                    }
                    i28 = 0;
                    i107 = i28;
                } else {
                    i18 = profileActivity.D3;
                    if (i10 == i18) {
                        MessagesController messagesController2 = profileActivity.getMessagesController();
                        j19 = profileActivity.b1;
                        TLRPC.User user3 = messagesController2.getUser(Long.valueOf(j19));
                        if (user3 != null && !TextUtils.isEmpty(profileActivity.a5)) {
                            string2 = org.telegram.messenger.y3.j(new StringBuilder("+"), profileActivity.a5, se.b.c());
                            str9 = profileActivity.a5;
                        } else if (user3 == null || TextUtils.isEmpty(user3.phone)) {
                            string2 = LocaleController.getString(R.string.PhoneHidden);
                            str9 = null;
                        } else {
                            String j36 = org.telegram.messenger.y3.j(new StringBuilder("+"), user3.phone, se.b.c());
                            str9 = user3.phone;
                            string2 = j36;
                        }
                        profileActivity.Y4 = str9 != null && str9.matches("888\\d{8}");
                        z11 = profileActivity.Y4;
                        y8Var.c(string2, LocaleController.getString(z11 ? R.string.AnonymousNumber : R.string.PhoneMobile), false);
                    } else {
                        i19 = profileActivity.E3;
                        if (i10 == i19) {
                            MessagesController messagesController3 = profileActivity.getMessagesController();
                            j18 = profileActivity.b1;
                            TLRPC.UserFull userFull35 = messagesController3.getUserFull(j18);
                            if (userFull35 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = userFull35.note;
                                i27 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                if (UserConfig.getInstance(i27).isPremium()) {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities);
                                    if (!(formatTextWithEntities instanceof SpannableStringBuilder)) {
                                        formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
                                    }
                                    AndroidUtilities.addLinksSafe((SpannableStringBuilder) formatTextWithEntities, 1, false, false);
                                } else {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(MessageObject.removeLinks(tL_textWithEntities));
                                }
                                y8Var.d(formatTextWithEntities, LocaleController.getString(R.string.ProfileNotes), LocaleController.getString(R.string.ProfileNotesInfo));
                            }
                        } else {
                            i20 = profileActivity.I3;
                            if (i10 == i20) {
                                ArrayList arrayList3 = new ArrayList();
                                j10 = profileActivity.b1;
                                if (j10 != 0) {
                                    MessagesController messagesController4 = profileActivity.getMessagesController();
                                    j17 = profileActivity.b1;
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
                                        int i108 = 0;
                                        while (true) {
                                            if (i108 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i108);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i108++;
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
                                                b01 b01Var = new b01(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, b01Var);
                                                clickableSpan = b01Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str8 = spannableString;
                                        }
                                    } else {
                                        str8 = "—";
                                    }
                                    z4 = !profileActivity.p1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str8;
                                    arrayList3 = arrayList5;
                                    str5 = str7;
                                    str4 = string3;
                                } else {
                                    chat3 = profileActivity.B2;
                                    if (chat3 != null) {
                                        MessagesController messagesController5 = profileActivity.getMessagesController();
                                        j11 = profileActivity.c1;
                                        TLRPC.Chat chat13 = messagesController5.getChat(Long.valueOf(j11));
                                        String publicUsername = ChatObject.getPublicUsername(chat13);
                                        if (chat13 != null) {
                                            arrayList3.addAll(chat13.usernames);
                                        }
                                        if (ChatObject.isPublic(chat13)) {
                                            z10 = !profileActivity.p1;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(profileActivity.getMessagesController().linkPrefix);
                                            sb.append("/");
                                            sb.append(publicUsername);
                                            j15 = profileActivity.d1;
                                            String str16 = str13;
                                            if (j15 != 0) {
                                                StringBuilder sb2 = new StringBuilder("/");
                                                j16 = profileActivity.d1;
                                                sb2.append(j16);
                                                str16 = sb2.toString();
                                            }
                                            sb.append(str16);
                                            str6 = sb.toString();
                                            str4 = LocaleController.getString(R.string.InviteLink);
                                        } else {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(profileActivity.getMessagesController().linkPrefix);
                                            sb3.append("/c/");
                                            j12 = profileActivity.c1;
                                            sb3.append(j12);
                                            j13 = profileActivity.d1;
                                            String str17 = str13;
                                            if (j13 != 0) {
                                                StringBuilder sb4 = new StringBuilder("/");
                                                j14 = profileActivity.d1;
                                                sb4.append(j14);
                                                str17 = sb4.toString();
                                            }
                                            sb3.append(str17);
                                            String sb5 = sb3.toString();
                                            str4 = LocaleController.getString(R.string.InviteLinkPrivate);
                                            str6 = sb5;
                                            z10 = false;
                                        }
                                        str5 = publicUsername;
                                        z4 = z10;
                                        str3 = str6;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        str3 = "";
                                        str4 = str3;
                                        z4 = false;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i26 = profileActivity.C3;
                                y8Var.c(str3, E, i26 == -1 && !(!profileActivity.n1 && profileActivity.L3 == -1 && profileActivity.M3 == -1) && profileActivity.R2 < 0);
                                if (i107 == 0) {
                                    Drawable d = f0.e.d(y8Var.getContext(), R.drawable.msg_input_gift);
                                    d.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.V6), PorterDuff.Mode.MULTIPLY));
                                    userFull = profileActivity.s2;
                                    if (UserObject.areGiftsDisabled(userFull)) {
                                        y8Var.setImage(null);
                                        y8Var.setImageClickListener(null);
                                    } else {
                                        y8Var.b(d, LocaleController.getString(R.string.GiftPremium));
                                        y8Var.setImageClickListener(new qx0(profileActivity, 11));
                                    }
                                } else if (z4) {
                                    Drawable d10 = f0.e.d(y8Var.getContext(), R.drawable.header_qr_24);
                                    d10.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.v8), PorterDuff.Mode.MULTIPLY));
                                    y8Var.b(d10, LocaleController.getString(R.string.GetQRCode));
                                    y8Var.setImageClickListener(new qx0(profileActivity, 12));
                                } else {
                                    y8Var.setImage(null);
                                    y8Var.setImageClickListener(null);
                                }
                                y8Var.setTag(Integer.valueOf(i10));
                                y8Var.a.setLoading(profileActivity.f5);
                                y8Var.b.setLoading(profileActivity.f5);
                                break;
                            } else {
                                i21 = profileActivity.F3;
                                if (i10 == i21) {
                                    chatFull = profileActivity.r2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.r2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.r2;
                                            y8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, LocaleController.getString(R.string.AttachLocation), false);
                                        }
                                    }
                                } else {
                                    i22 = profileActivity.Q2;
                                    if (i10 == i22) {
                                        i25 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                        TLRPC.User currentUser = UserConfig.getInstance(i25).getCurrentUser();
                                        y8Var.c((currentUser == null || (str2 = currentUser.phone) == null || str2.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.y3.j(new StringBuilder("+"), currentUser.phone, se.b.c()), LocaleController.getString(R.string.TapToChangePhone), true);
                                        y8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i23 = profileActivity.S2;
                                        if (i10 == i23) {
                                            i24 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                            TLRPC.User currentUser2 = UserConfig.getInstance(i24).getCurrentUser();
                                            String string4 = LocaleController.getString(R.string.Username);
                                            if (currentUser2 == null || currentUser2.usernames.size() <= 0) {
                                                String publicUsername2 = UserObject.getPublicUsername(currentUser2);
                                                if (currentUser2 == null || TextUtils.isEmpty(publicUsername2)) {
                                                    string = LocaleController.getString(R.string.UsernameEmpty);
                                                    charSequence = string4;
                                                } else {
                                                    string = yh.k("@", publicUsername2);
                                                    charSequence = string4;
                                                }
                                            } else {
                                                int i109 = 0;
                                                while (true) {
                                                    if (i109 < currentUser2.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = currentUser2.usernames.get(i109);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i109++;
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
                                            y8Var.c(string, charSequence, true);
                                            y8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z4 = false;
                if (i107 == 0) {
                }
                y8Var.setTag(Integer.valueOf(i10));
                y8Var.a.setLoading(profileActivity.f5);
                y8Var.b.setLoading(profileActivity.f5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i29 = profileActivity.G3;
                if (i10 == i29) {
                    userFull8 = profileActivity.s2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.s2;
                        user = userFull12.user;
                    } else {
                        MessagesController messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.s2;
                        user = messagesController6.getUser(Long.valueOf(userFull9.id));
                    }
                    z13 = profileActivity.o2;
                    if (!z13) {
                        if (user != null && user.premium) {
                            userFull11 = profileActivity.s2;
                            break;
                        }
                        z14 = false;
                        userFull10 = profileActivity.s2;
                        jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z14);
                        break;
                    }
                    z14 = true;
                    userFull10 = profileActivity.s2;
                    jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z14);
                } else if (i10 == profileActivity.H3) {
                    chatFull4 = profileActivity.r2;
                    String str18 = chatFull4.about;
                    while (str18.contains("\n\n\n")) {
                        str18 = str18.replace("\n\n\n", "\n\n");
                    }
                    String string5 = LocaleController.getString(R.string.DescriptionPlaceholder);
                    chat4 = profileActivity.B2;
                    if (ChatObject.isChannel(chat4)) {
                        chat5 = profileActivity.B2;
                        if (!chat5.megagroup) {
                            z12 = true;
                            jVar.f(str18, string5, z12);
                            break;
                        }
                    }
                    z12 = false;
                    jVar.f(str18, string5, z12);
                } else {
                    i30 = profileActivity.T2;
                    if (i10 == i30) {
                        userFull2 = profileActivity.s2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.s2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(LocaleController.getString(R.string.UserBio), LocaleController.getString(R.string.UserBioDetail), false);
                                profileActivity.w2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.s2;
                        if (userFull3 == null) {
                            str10 = LocaleController.getString(R.string.Loading);
                        } else {
                            userFull4 = profileActivity.s2;
                            str10 = userFull4.about;
                        }
                        jVar.f(str10, LocaleController.getString(R.string.UserBio), profileActivity.getUserConfig().isPremium());
                        userFull5 = profileActivity.s2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.s2;
                            str11 = userFull6.about;
                        } else {
                            str11 = null;
                        }
                        profileActivity.w2 = str11;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                int i110 = org.telegram.ui.ActionBar.k6.m6;
                int i111 = org.telegram.ui.ActionBar.k6.G6;
                o8Var2.e(i110, i111);
                o8Var2.setTag(Integer.valueOf(i111));
                i31 = profileActivity.n4;
                if (i10 == i31) {
                    int i112 = org.telegram.messenger.y3.n(profileActivity.getMessagesController(), profileActivity.f1).ttl;
                    o8Var2.o(LocaleController.getString(R.string.MessageLifetime), i112 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : LocaleController.formatTTLString(i112), false, false);
                } else {
                    i32 = profileActivity.H4;
                    if (i10 == i32) {
                        o8Var2.i(LocaleController.getString(R.string.Unblock), false);
                        o8Var2.e(-1, org.telegram.ui.ActionBar.k6.p7);
                    } else {
                        i33 = profileActivity.o4;
                        if (i10 == i33) {
                            org.telegram.ui.Components.q40 q40Var = new org.telegram.ui.Components.q40();
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(profileActivity.getMessagesController(), profileActivity.f1);
                            byte[] bArr = n10.key_hash;
                            q40Var.a = bArr;
                            if (bArr == null) {
                                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(n10.auth_key);
                                q40Var.a = calcAuthKeyHash;
                                n10.key_hash = calcAuthKeyHash;
                            }
                            q40Var.invalidateSelf();
                            o8Var2.t(LocaleController.getString(R.string.EncryptionKey), q40Var, false);
                        } else {
                            i34 = profileActivity.I4;
                            if (i10 == i34) {
                                o8Var2.e(-1, org.telegram.ui.ActionBar.k6.o6);
                                chat10 = profileActivity.B2;
                                if (chat10.megagroup) {
                                    o8Var2.i(LocaleController.getString(R.string.ProfileJoinGroup), false);
                                } else {
                                    o8Var2.i(LocaleController.getString(R.string.ProfileJoinChannel), false);
                                }
                            } else {
                                i35 = profileActivity.u4;
                                if (i10 == i35) {
                                    chatFull12 = profileActivity.r2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.B2;
                                        if (ChatObject.isChannel(chat8)) {
                                            chat9 = profileActivity.B2;
                                            if (!chat9.megagroup) {
                                                String string6 = LocaleController.getString(R.string.ChannelSubscribers);
                                                chatFull14 = profileActivity.r2;
                                                String formatNumber = LocaleController.formatNumber(chatFull14.participants_count, ',');
                                                int i113 = R.drawable.msg_groups;
                                                i93 = profileActivity.E4;
                                                o8Var2.q(string6, formatNumber, i113, i10 != i93 - 1);
                                            }
                                        }
                                        String string7 = LocaleController.getString(R.string.ChannelMembers);
                                        chatFull13 = profileActivity.r2;
                                        String formatNumber2 = LocaleController.formatNumber(chatFull13.participants_count, ',');
                                        int i114 = R.drawable.msg_groups;
                                        i92 = profileActivity.E4;
                                        o8Var2.q(string7, formatNumber2, i114, i10 != i92 - 1);
                                    } else {
                                        chat6 = profileActivity.B2;
                                        if (ChatObject.isChannel(chat6)) {
                                            chat7 = profileActivity.B2;
                                            if (!chat7.megagroup) {
                                                String string8 = LocaleController.getString(R.string.ChannelSubscribers);
                                                int i115 = R.drawable.msg_groups;
                                                i91 = profileActivity.E4;
                                                o8Var2.m(i115, string8, i10 != i91 - 1);
                                            }
                                        }
                                        String string9 = LocaleController.getString(R.string.ChannelMembers);
                                        int i116 = R.drawable.msg_groups;
                                        i90 = profileActivity.E4;
                                        o8Var2.m(i116, string9, i10 != i90 - 1);
                                    }
                                } else {
                                    i36 = profileActivity.v4;
                                    if (i10 == i36) {
                                        chatFull10 = profileActivity.r2;
                                        if (chatFull10 != null) {
                                            String string10 = LocaleController.getString(R.string.SubscribeRequests);
                                            chatFull11 = profileActivity.r2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            int i117 = R.drawable.msg_requests;
                                            i89 = profileActivity.E4;
                                            o8Var2.q(string10, format, i117, i10 != i89 - 1);
                                        }
                                    } else {
                                        i37 = profileActivity.w4;
                                        if (i10 == i37) {
                                            chatFull8 = profileActivity.r2;
                                            if (chatFull8 != null) {
                                                String string11 = LocaleController.getString(R.string.ChannelAdministrators);
                                                chatFull9 = profileActivity.r2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                int i118 = R.drawable.msg_admins;
                                                i88 = profileActivity.E4;
                                                o8Var2.q(string11, format2, i118, i10 != i88 - 1);
                                            } else {
                                                String string12 = LocaleController.getString(R.string.ChannelAdministrators);
                                                int i119 = R.drawable.msg_admins;
                                                i87 = profileActivity.E4;
                                                o8Var2.m(i119, string12, i10 != i87 - 1);
                                            }
                                        } else {
                                            i38 = profileActivity.x4;
                                            if (i10 == i38) {
                                                String string13 = LocaleController.getString(R.string.ChannelAdminSettings);
                                                int i120 = R.drawable.msg_customize;
                                                i86 = profileActivity.E4;
                                                o8Var2.m(i120, string13, i10 != i86 - 1);
                                            } else {
                                                i39 = profileActivity.A4;
                                                if (i10 == i39) {
                                                    i84 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                    mh.a0 g10 = mh.a0.g(i84);
                                                    j24 = profileActivity.c1;
                                                    TL_stars.StarsAmount c3 = g10.c(-j24);
                                                    i85 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                    mh.a0 g11 = mh.a0.g(i85);
                                                    j25 = profileActivity.c1;
                                                    long i121 = g11.i(-j25);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i121 > 0) {
                                                        double d11 = i121 / 1.0E9d;
                                                        if (d11 > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d11, 0));
                                                        } else {
                                                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                                            decimalFormatSymbols.setDecimalSeparator('.');
                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                                            decimalFormat.setMinimumFractionDigits(2);
                                                            decimalFormat.setMaximumFractionDigits(3);
                                                            decimalFormat.setGroupingUsed(false);
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d11));
                                                        }
                                                    }
                                                    if (c3.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) mh.ja.K0(c3, 0.777f, ' '));
                                                    }
                                                    o8Var2.q(LocaleController.getString(R.string.ChannelStars), ke.f0(mh.ja.X0(false, spannableStringBuilder, 0.7f, null), o8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i40 = profileActivity.y4;
                                                    if (i10 == i40) {
                                                        i83 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                        mh.a0 g12 = mh.a0.g(i83);
                                                        j23 = profileActivity.b1;
                                                        TL_stars.StarsAmount c10 = g12.c(j23);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c10.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) mh.ja.K0(c10, 0.777f, ' '));
                                                        }
                                                        o8Var2.q(LocaleController.getString(R.string.BotBalanceStars), ke.f0(mh.ja.X0(false, spannableStringBuilder2, 0.7f, null), o8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i41 = profileActivity.z4;
                                                        if (i10 == i41) {
                                                            i82 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                            mh.a0 g13 = mh.a0.g(i82);
                                                            j22 = profileActivity.b1;
                                                            long i122 = g13.i(j22);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i122 > 0) {
                                                                double d12 = i122 / 1.0E9d;
                                                                if (d12 > 1000.0d) {
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d12, 0));
                                                                } else {
                                                                    DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                                                                    decimalFormatSymbols2.setDecimalSeparator('.');
                                                                    DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                                                                    decimalFormat2.setMinimumFractionDigits(2);
                                                                    decimalFormat2.setMaximumFractionDigits(3);
                                                                    decimalFormat2.setGroupingUsed(false);
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d12));
                                                                }
                                                            }
                                                            o8Var2.q(LocaleController.getString(R.string.BotBalanceTON), ke.f0(mh.ja.X0(false, spannableStringBuilder3, 0.7f, null), o8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i42 = profileActivity.D4;
                                                            if (i10 == i42) {
                                                                chatFull5 = profileActivity.r2;
                                                                if (chatFull5 != null) {
                                                                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    chatFull6 = profileActivity.r2;
                                                                    int i123 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.r2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i123, chatFull7.kicked_count)));
                                                                    int i124 = R.drawable.msg_user_remove;
                                                                    i81 = profileActivity.E4;
                                                                    o8Var2.q(string14, format3, i124, i10 != i81 - 1);
                                                                } else {
                                                                    String string15 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    int i125 = R.drawable.msg_user_remove;
                                                                    i80 = profileActivity.E4;
                                                                    o8Var2.m(i125, string15, i10 != i80 - 1);
                                                                }
                                                            } else {
                                                                i43 = profileActivity.t4;
                                                                if (i10 == i43) {
                                                                    o8Var2.e(i110, i111);
                                                                    int i126 = i10 + 1;
                                                                    boolean z31 = i126 >= profileActivity.r4 && i126 < profileActivity.s4;
                                                                    String string16 = LocaleController.getString(R.string.AddMember);
                                                                    int i127 = R.drawable.msg_contact_add;
                                                                    i79 = profileActivity.E4;
                                                                    o8Var2.m(i127, string16, i79 == -1 || z31);
                                                                } else {
                                                                    i44 = profileActivity.R3;
                                                                    if (i10 == i44) {
                                                                        o8Var2.i(LocaleController.getString(R.string.SendMessageLocation), true);
                                                                    } else {
                                                                        i45 = profileActivity.W3;
                                                                        if (i10 == i45) {
                                                                            o8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), false);
                                                                            o8Var2.e(i110, i111);
                                                                        } else {
                                                                            i46 = profileActivity.T3;
                                                                            if (i10 == i46) {
                                                                                o8Var2.m(R.drawable.menu_reaction_delete_24, LocaleController.getString(R.string.DeleteReactionMenu), false);
                                                                                o8Var2.e(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                            } else {
                                                                                i47 = profileActivity.U3;
                                                                                if (i10 == i47) {
                                                                                    MessagesController messagesController7 = profileActivity.getMessagesController();
                                                                                    j21 = profileActivity.X4;
                                                                                    TLRPC.Chat chat14 = messagesController7.getChat(Long.valueOf(-j21));
                                                                                    if (chat14 == null || !ChatObject.canBlockUsers(chat14)) {
                                                                                        o8Var2.m(R.drawable.msg_report, LocaleController.getString(R.string.ReportReaction2), false);
                                                                                    } else {
                                                                                        o8Var2.m(R.drawable.msg_block2, LocaleController.getString(R.string.ReportReactionAndBan2), false);
                                                                                    }
                                                                                    o8Var2.e(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                                } else {
                                                                                    i48 = profileActivity.S3;
                                                                                    if (i10 == i48) {
                                                                                        o8Var2.i(LocaleController.getString(R.string.ReportUserLocation), false);
                                                                                        int i128 = org.telegram.ui.ActionBar.k6.p7;
                                                                                        o8Var2.e(-1, i128);
                                                                                        o8Var2.e(-1, i128);
                                                                                    } else {
                                                                                        i49 = profileActivity.d3;
                                                                                        if (i10 == i49) {
                                                                                            o8Var2.s(LocaleController.getString(R.string.Language), LocaleController.getCurrentLanguageName(), false, R.drawable.msg2_language, false);
                                                                                            o8Var2.setImageLeft(23);
                                                                                        } else {
                                                                                            i50 = profileActivity.c3;
                                                                                            if (i10 == i50) {
                                                                                                o8Var2.m(R.drawable.msg2_notifications, LocaleController.getString(R.string.NotificationsAndSounds), true);
                                                                                            } else {
                                                                                                i51 = profileActivity.e3;
                                                                                                if (i10 == i51) {
                                                                                                    o8Var2.m(R.drawable.msg2_secret, LocaleController.getString(R.string.PrivacySettings), true);
                                                                                                } else {
                                                                                                    i52 = profileActivity.f3;
                                                                                                    if (i10 == i52) {
                                                                                                        o8Var2.m(R.drawable.msg2_data, LocaleController.getString(R.string.DataSettings), true);
                                                                                                    } else {
                                                                                                        i53 = profileActivity.g3;
                                                                                                        if (i10 == i53) {
                                                                                                            o8Var2.m(R.drawable.msg2_discussion, LocaleController.getString(R.string.ChatSettings), true);
                                                                                                        } else {
                                                                                                            i54 = profileActivity.h3;
                                                                                                            if (i10 == i54) {
                                                                                                                o8Var2.m(R.drawable.msg2_folder, LocaleController.getString(R.string.Filters), true);
                                                                                                            } else {
                                                                                                                i55 = profileActivity.j3;
                                                                                                                if (i10 == i55) {
                                                                                                                    o8Var2.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), true);
                                                                                                                } else {
                                                                                                                    i56 = profileActivity.i3;
                                                                                                                    if (i10 == i56) {
                                                                                                                        o8Var2.m(R.drawable.msg2_battery, LocaleController.getString(R.string.PowerUsage), true);
                                                                                                                    } else {
                                                                                                                        i57 = profileActivity.n3;
                                                                                                                        if (i10 == i57) {
                                                                                                                            o8Var2.m(R.drawable.msg2_ask_question, LocaleController.getString(R.string.AskAQuestion), true);
                                                                                                                        } else {
                                                                                                                            i58 = profileActivity.o3;
                                                                                                                            if (i10 == i58) {
                                                                                                                                o8Var2.m(R.drawable.msg2_help, LocaleController.getString(R.string.TelegramFAQ), true);
                                                                                                                            } else {
                                                                                                                                i59 = profileActivity.p3;
                                                                                                                                if (i10 == i59) {
                                                                                                                                    o8Var2.m(R.drawable.msg2_policy, LocaleController.getString(R.string.PrivacyPolicy), false);
                                                                                                                                } else {
                                                                                                                                    i60 = profileActivity.s3;
                                                                                                                                    if (i10 == i60) {
                                                                                                                                        o8Var2.i(LocaleController.getString(R.string.DebugSendLogs), true);
                                                                                                                                    } else {
                                                                                                                                        i61 = profileActivity.t3;
                                                                                                                                        if (i10 == i61) {
                                                                                                                                            o8Var2.i(LocaleController.getString(R.string.DebugSendLastLogs), true);
                                                                                                                                        } else {
                                                                                                                                            i62 = profileActivity.u3;
                                                                                                                                            if (i10 == i62) {
                                                                                                                                                o8Var2.i(LocaleController.getString(R.string.DebugClearLogs), profileActivity.v3 != -1);
                                                                                                                                            } else if (i10 == profileActivity.v3) {
                                                                                                                                                o8Var2.i("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i63 = profileActivity.k3;
                                                                                                                                                if (i10 == i63) {
                                                                                                                                                    o8Var2.m(R.drawable.msg2_devices, LocaleController.getString(R.string.Devices), true);
                                                                                                                                                } else {
                                                                                                                                                    i64 = profileActivity.L2;
                                                                                                                                                    if (i10 == i64) {
                                                                                                                                                        profileActivity.T.N(86);
                                                                                                                                                        profileActivity.T.J();
                                                                                                                                                        o8Var2.n(LocaleController.getString(R.string.SetProfilePhoto), profileActivity.T, false);
                                                                                                                                                        o8Var2.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                                                                                                                                        o8Var2.getImageView().setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                                                                                                                                                        o8Var2.setImageLeft(12);
                                                                                                                                                        profileActivity.J2 = o8Var2;
                                                                                                                                                    } else {
                                                                                                                                                        i65 = profileActivity.X3;
                                                                                                                                                        if (i10 == i65) {
                                                                                                                                                            o8Var2.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.AddToGroupOrChannel), false);
                                                                                                                                                        } else {
                                                                                                                                                            i66 = profileActivity.Z3;
                                                                                                                                                            if (i10 == i66) {
                                                                                                                                                                o8Var2.n(LocaleController.getString(R.string.TelegramPremium), new org.telegram.ui.Components.k5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), fg.q1.d().f), true);
                                                                                                                                                                o8Var2.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i67 = profileActivity.a4;
                                                                                                                                                                if (i10 == i67) {
                                                                                                                                                                    i78 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                                                                                                                                    mh.t7 w10 = mh.t7.w(i78);
                                                                                                                                                                    long j37 = w10.p().amount;
                                                                                                                                                                    String string17 = LocaleController.getString(R.string.MenuTelegramStars);
                                                                                                                                                                    CharSequence charSequence2 = str13;
                                                                                                                                                                    if (w10.e) {
                                                                                                                                                                        charSequence2 = str13;
                                                                                                                                                                        if (j37 > 0) {
                                                                                                                                                                            charSequence2 = mh.ja.J0(w10.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    o8Var2.r(string17, charSequence2, new org.telegram.ui.Components.k5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), fg.q1.d().h), true);
                                                                                                                                                                    o8Var2.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i68 = profileActivity.b4;
                                                                                                                                                                    if (i10 == i68) {
                                                                                                                                                                        i77 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                                                                                                                                                                        mh.t7 L = mh.t7.L(i77);
                                                                                                                                                                        long j38 = L.p().amount;
                                                                                                                                                                        String string18 = LocaleController.getString(R.string.MyTON);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j38 > 0) {
                                                                                                                                                                                charSequence3 = mh.ja.J0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        o8Var2.q(string18, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        o8Var2.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i69 = profileActivity.c4;
                                                                                                                                                                        if (i10 == i69) {
                                                                                                                                                                            o8Var2.m(R.drawable.menu_shop, LocaleController.getString(R.string.TelegramBusiness), true);
                                                                                                                                                                            o8Var2.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i70 = profileActivity.d4;
                                                                                                                                                                            if (i10 == i70) {
                                                                                                                                                                                o8Var2.m(R.drawable.menu_gift, LocaleController.getString(R.string.SendAGift), false);
                                                                                                                                                                                o8Var2.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i71 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i10 == i71) {
                                                                                                                                                                                    String string19 = LocaleController.getString(R.string.BotProfilePermissionLocation);
                                                                                                                                                                                    sh.q0 q0Var = profileActivity.p2;
                                                                                                                                                                                    boolean z32 = q0Var != null && q0Var.g();
                                                                                                                                                                                    int i129 = R.drawable.filled_access_location;
                                                                                                                                                                                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.uj);
                                                                                                                                                                                    i76 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    o8Var = o8Var2;
                                                                                                                                                                                    o8Var.k(string19, z32, i129, themedColor, i76 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    o8Var = o8Var2;
                                                                                                                                                                                    i72 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i10 == i72) {
                                                                                                                                                                                        String string20 = LocaleController.getString(R.string.BotProfilePermissionBiometry);
                                                                                                                                                                                        sh.p pVar = profileActivity.q2;
                                                                                                                                                                                        o8Var.k(string20, pVar != null && pVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.xj), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i73 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i10 == i73) {
                                                                                                                                                                                            String string21 = LocaleController.getString(R.string.BotProfilePermissionEmojiStatus);
                                                                                                                                                                                            userFull13 = profileActivity.s2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.s2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z15 = true;
                                                                                                                                                                                                    int i130 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.sj);
                                                                                                                                                                                                    i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i74 == -1) {
                                                                                                                                                                                                        i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i75 == -1) {
                                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                                            o8Var.k(string21, z15, i130, themedColor2, z16);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    o8Var.k(string21, z15, i130, themedColor2, z16);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z15 = false;
                                                                                                                                                                                            int i1302 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                            int themedColor22 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.sj);
                                                                                                                                                                                            i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i74 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = true;
                                                                                                                                                                                            o8Var.k(string21, z15, i1302, themedColor22, z16);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                o8Var2 = o8Var;
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
                o8Var2.c.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.I6));
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i94 = profileActivity.K3;
                if (i10 == i94) {
                    i95 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i95);
                    long j39 = profileActivity.f1;
                    if (j39 == 0) {
                        j27 = profileActivity.b1;
                        if (j27 != 0) {
                            j39 = profileActivity.b1;
                        } else {
                            j28 = profileActivity.c1;
                            j39 = -j28;
                        }
                    }
                    j26 = profileActivity.d1;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j39, j26);
                    boolean z33 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, false);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c11 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    int c12 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
                    if (c11 == 3 && c12 != Integer.MAX_VALUE) {
                        int currentTime = c12 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str14 = z33 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsOn);
                            z18 = true;
                        } else {
                            if (currentTime < 3600) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                            } else if (currentTime < 86400) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                            } else if (currentTime < 31536000) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                            }
                            z18 = false;
                        }
                    } else if (c11 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z17 = notificationsController.isGlobalNotificationsEnabled(j39, false, false);
                            if (z17 || !z33) {
                                str14 = LocaleController.getString(!z17 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            } else {
                                str14 = LocaleController.getString(R.string.NotificationsCustom);
                            }
                            z18 = z17;
                        }
                        z17 = true;
                        if (z17) {
                        }
                        str14 = LocaleController.getString(!z17 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z18 = z17;
                    } else {
                        if (c11 != 1) {
                            z17 = false;
                            if (z17) {
                            }
                            str14 = LocaleController.getString(!z17 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            z18 = z17;
                        }
                        z17 = true;
                        if (z17) {
                        }
                        str14 = LocaleController.getString(!z17 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z18 = z17;
                    }
                    if (str14 == null) {
                        str14 = LocaleController.getString(R.string.NotificationsOff);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str14 = String.format(Locale.US, LocaleController.getPluralString("NotificationTopicExceptionsDesctription", hashSet.size()), str14, Integer.valueOf(hashSet.size()));
                    }
                    String str19 = str14;
                    z19 = profileActivity.i5;
                    j5Var.setAnimationsEnabled(z19);
                    j5Var.b(LocaleController.getString(R.string.Notifications), str19, 0, z18, 0, false, profileActivity.f4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i10));
                break;
            case 8:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i10 - profileActivity.r4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.r4);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str20 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            z24 = false;
                            z25 = true;
                            z26 = true;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(str20)) {
                                    str20 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z24 = channelParticipant.promoted_by == profileActivity.getUserConfig().getClientUserId();
                                z25 = true;
                            } else {
                                z24 = false;
                                z25 = false;
                            }
                            z26 = false;
                        }
                        z20 = z24;
                        str12 = str20;
                        z21 = z25;
                        z22 = z26;
                    } else {
                        String str21 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            str12 = str21;
                            z20 = false;
                            z21 = true;
                            z22 = true;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(str21)) {
                                    str21 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z20 = chatParticipant.inviter_id == profileActivity.getUserConfig().getClientUserId();
                                str12 = str21;
                                z21 = true;
                            } else {
                                str12 = str21;
                                z20 = false;
                                z21 = false;
                            }
                            z22 = false;
                        }
                    }
                    final TLRPC.User user5 = profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    if (UserObject.isUserSelf(user5)) {
                        MessagesController messagesController8 = profileActivity.getMessagesController();
                        j29 = profileActivity.c1;
                        if (ChatObject.canManageMyTag(messagesController8.getChat(Long.valueOf(j29)))) {
                            z23 = true;
                            final String str22 = str12;
                            final boolean z34 = z21;
                            final boolean z35 = z22;
                            vaVar.a(str12, z21, z22, z23, new View.OnClickListener() { // from class: org.telegram.ui.yz0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i131;
                                    org.telegram.ui.ActionBar.g6 g6Var2;
                                    ProfileActivity profileActivity2 = i01.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i131 = ((org.telegram.ui.ActionBar.p2) profileActivity2).currentAccount;
                                    long a2 = profileActivity2.a();
                                    g6Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.g01.b(parentActivity, i131, a2, user5, str22, z34, z35, z20, g6Var2);
                                }
                            });
                            vaVar.f(user5, i10 != profileActivity.s4 - 1);
                            break;
                        }
                    }
                    z23 = false;
                    final String str222 = str12;
                    final boolean z342 = z21;
                    final boolean z352 = z22;
                    vaVar.a(str12, z21, z22, z23, new View.OnClickListener() { // from class: org.telegram.ui.yz0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i131;
                            org.telegram.ui.ActionBar.g6 g6Var2;
                            ProfileActivity profileActivity2 = i01.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i131 = ((org.telegram.ui.ActionBar.p2) profileActivity2).currentAccount;
                            long a2 = profileActivity2.a();
                            g6Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.g01.b(parentActivity, i131, a2, user5, str222, z342, z352, z20, g6Var2);
                        }
                    });
                    vaVar.f(user5, i10 != profileActivity.s4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                i96 = profileActivity.Z2;
                if (i10 != i96) {
                    i97 = profileActivity.X2;
                    if (i10 != i97) {
                        i98 = profileActivity.V2;
                        if (i10 == i98) {
                            y6Var.setType(2);
                            break;
                        }
                    } else {
                        y6Var.setType(0);
                        break;
                    }
                } else {
                    y6Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.a9) view).setText(LocaleController.getString(R.string.BotAddToGroupOrChannelInfo));
                break;
            case 20:
                String string22 = LocaleController.getString(R.string.Notifications);
                MessagesController messagesController9 = profileActivity.getMessagesController();
                long a2 = profileActivity.a();
                j30 = profileActivity.d1;
                ((org.telegram.ui.Cells.s8) view).f(string22, !messagesController9.isDialogMuted(a2, j30), false);
                break;
            case 21:
                vf.b1 b1Var = (vf.b1) view;
                userFull15 = profileActivity.s2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.s2;
                    tL_businessLocation = userFull16.business_location;
                }
                b1Var.a(tL_businessLocation, profileActivity.J3 < 0 && !profileActivity.p1);
                break;
            case 22:
                vf.a1 a1Var = (vf.a1) view;
                a1Var.setOnTimezoneSwitchClick(new xz0(this, r12 ? 1 : 0));
                userFull17 = profileActivity.s2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.s2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z27 = profileActivity.K4;
                z28 = profileActivity.L4;
                if ((profileActivity.J3 >= 0 || profileActivity.p1) && profileActivity.M3 < 0) {
                    z29 = false;
                }
                a1Var.b(tL_businessWorkHours, z27, z28, z29);
                break;
            case 23:
                org.telegram.ui.Cells.g6 g6Var2 = (org.telegram.ui.Cells.g6) view;
                MessagesController messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.s2;
                TLRPC.Chat chat15 = messagesController10.getChat(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.f6 f6Var = profileActivity.t2;
                g6Var2.a(f6Var != null ? f6Var.d : null, chat15);
                break;
            case 26:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setLinkTextRippleColor(null);
                i99 = profileActivity.O3;
                if (i10 == i99) {
                    profileActivity.getMessagesController().getUserOrChat(profileActivity.a());
                    userFull26 = profileActivity.s2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.s2;
                        botverification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.r2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.r2;
                            botverification = chatFull16.bot_verification;
                        } else {
                            botverification = null;
                        }
                    }
                    userFull27 = profileActivity.s2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.s2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.s2;
                            l10 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.f4 < 0 || botverification != null || l10 != null) {
                                a9Var.setFixedSize(0);
                                MessagesController messagesController11 = profileActivity.getMessagesController();
                                j32 = profileActivity.b1;
                                TLRPC.User user6 = messagesController11.getUser(Long.valueOf(j32));
                                boolean z36 = user6 == null && user6.bot && user6.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.f4 >= 0) {
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleTag(LocaleController.getString(z36 ? R.string.ProfileBotOpenAppInfoOwner : R.string.ProfileBotOpenAppInfo), new org.telegram.ui.Components.rv0(7, this, z36)));
                                    if (botverification != null || l10 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botverification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.u5(botverification.icon, a9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(botverification.description);
                                    try {
                                        AndroidUtilities.addLinksSafe(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i107 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i107];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new a01(this, url, url), spanStart, spanEnd, 33);
                                            i107++;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l10 != null && (user2 = profileActivity.getMessagesController().getUser(l10)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.oq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.ProfileBotManagedBy, UserObject.getPublicUsername(user2)), profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.gc), new br0(26, this, l10)));
                                }
                                a9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
                                a9Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                a9Var.setFixedSize(14);
                                a9Var.setText(null);
                                break;
                            }
                        }
                    }
                    l10 = null;
                    if (profileActivity.f4 < 0) {
                    }
                    a9Var.setFixedSize(0);
                    MessagesController messagesController112 = profileActivity.getMessagesController();
                    j32 = profileActivity.b1;
                    TLRPC.User user62 = messagesController112.getUser(Long.valueOf(j32));
                    if (user62 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.f4 >= 0) {
                    }
                    if (botverification == null) {
                    }
                    a9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
                    a9Var.setText(spannableStringBuilder42);
                } else {
                    i100 = profileActivity.Q3;
                    if (i10 == i100) {
                        MessagesController messagesController12 = profileActivity.getMessagesController();
                        j31 = profileActivity.b1;
                        TLRPC.User user7 = messagesController12.getUser(Long.valueOf(j31));
                        if (user7 != null && user7.bot && user7.bot_can_edit) {
                            a9Var.setFixedSize(0);
                            int i131 = R.string.ProfileBotAffiliateProgramInfoOwner;
                            String userName = UserObject.getUserName(user7);
                            userFull23 = profileActivity.s2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.s2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.s2;
                                    i102 = userFull25.starref_program.commission_permille;
                                    a9Var.setText(LocaleController.formatString(i131, userName, sh.j.G0(i102)));
                                    break;
                                }
                            }
                            i102 = 0;
                            a9Var.setText(LocaleController.formatString(i131, userName, sh.j.G0(i102)));
                        } else {
                            a9Var.setFixedSize(0);
                            int i132 = R.string.ProfileBotAffiliateProgramInfo;
                            String userName2 = UserObject.getUserName(user7);
                            userFull20 = profileActivity.s2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.s2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.s2;
                                    i101 = userFull22.starref_program.commission_permille;
                                    a9Var.setText(LocaleController.formatString(i132, userName2, sh.j.G0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            a9Var.setText(LocaleController.formatString(i132, userName2, sh.j.G0(i101)));
                        }
                    }
                }
                break;
            case 27:
                sh.g gVar = (sh.g) view;
                gVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.uj), R.drawable.filled_affiliate, LocaleController.getString(R.string.ProfileBotAffiliateProgram), null);
                userFull31 = profileActivity.s2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.s2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.s2;
                        str15 = sh.j.G0(userFull33.starref_program.commission_permille);
                    }
                }
                gVar.setPercent(str15);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                i103 = profileActivity.g4;
                if (i10 == i103) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.round_warn);
                    oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    int i133 = org.telegram.ui.ActionBar.k6.wj;
                    g6Var = profileActivity.w0;
                    oqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.v0(i133, g6Var));
                    spannableStringBuilder5.setSpan(oqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    int i134 = R.string.ProfileUnofficialSecurityRisk;
                    MessagesController messagesController13 = profileActivity.getMessagesController();
                    j33 = profileActivity.b1;
                    spannableStringBuilder5.append((CharSequence) LocaleController.formatString(i134, UserObject.getForcedFirstName(messagesController13.getUser(Long.valueOf(j33)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                uh.b bVar = (uh.b) view;
                chat11 = profileActivity.B2;
                if (chat11 == null) {
                    j34 = profileActivity.b1;
                    if (j34 != 0) {
                        MessagesController messagesController14 = profileActivity.getMessagesController();
                        j35 = profileActivity.b1;
                        TLRPC.User user8 = messagesController14.getUser(Long.valueOf(j35));
                        if (user8 != null) {
                            i104 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                            bVar.a(i104, profileActivity.getMessagesController().getChat(Long.valueOf(user8.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i105 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                    MessagesController messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.B2;
                    bVar.a(i105, messagesController15.getChat(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View vaVar;
        View f01Var;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                vaVar = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, profileActivity.w0);
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                c01 c01Var = new c01(this, this.c, profileActivity.w0, i10 == 30, i10 == 19);
                c01Var.setContentDescriptionValueFirst(true);
                vaVar = c01Var;
                break;
            case 3:
                d01 d01Var = new d01(this, context, profileActivity, profileActivity.w0);
                profileActivity.K5 = d01Var;
                vaVar = d01Var;
                break;
            case 4:
                vaVar = new ms(this, context, profileActivity.w0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.w0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new e01(this, context, profileActivity.w0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                vaVar = new org.telegram.ui.Cells.va(profileActivity.t4 == -1 ? 9 : 6, 0, this.c, profileActivity.w0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 10, profileActivity.w0);
                a9Var.getTextView().setGravity(1);
                a9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, profileActivity.w0));
                a9Var.getTextView().setMovementMethod(null);
                a9Var.setText(AndroidUtilities.getBuildVersionInfo());
                a9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                vaVar = a9Var;
                break;
            case 11:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                View s3Var = new org.telegram.ui.Cells.s3(context, AndroidUtilities.dp(i10 == 31 ? 12.0f : 6.0f), 2);
                s3Var.setTag(-33024);
                vaVar = s3Var;
                break;
            case 12:
                f01Var = new f01(this, context);
                f01Var.setBackground(new ColorDrawable(0));
                f01Var.setTag(-33024);
                vaVar = f01Var;
                break;
            case 13:
                if (profileActivity.L.getParent() != null) {
                    ((ViewGroup) profileActivity.L.getParent()).removeView(profileActivity.L);
                }
                f01Var = profileActivity.L;
                f01Var.setTag(-33024);
                vaVar = f01Var;
                break;
            case 15:
                vaVar = new h01(this, context, profileActivity.w0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.a9(context, profileActivity.w0);
                break;
            case 18:
            case 24:
                View k2Var = new fg.k2(context, i10 == 18 ? 0 : 1, profileActivity.w0);
                k2Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, profileActivity.w0));
                vaVar = k2Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.s8(18, context, profileActivity.w0, false);
                break;
            case 21:
                View b1Var = new vf.b1(context, profileActivity.w0);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, profileActivity.w0));
                vaVar = b1Var;
                break;
            case 22:
                View g01Var = new g01(this, context, profileActivity.w0);
                g01Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, profileActivity.w0));
                vaVar = g01Var;
                break;
            case 23:
                vaVar = new zz0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                qh.d dVar = new qh.d(context, profileActivity.w0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new xz0(this, 0));
                frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, profileActivity.w0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.a9(context, profileActivity.w0);
                break;
            case 27:
                vaVar = new sh.g(context, profileActivity.w0);
                break;
            case 28:
                f01Var = new org.telegram.ui.Components.jn(context, 19);
                f01Var.setTag(-33024);
                vaVar = f01Var;
                break;
            case 32:
                vaVar = new u01(profileActivity, context);
                break;
            case 33:
                vaVar = new uh.b(context, profileActivity.w0);
                break;
        }
        if (i10 != 13) {
            vaVar.setLayoutParams(new f2.x0(-1, -2));
        }
        return new org.telegram.ui.Components.fl0(vaVar);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        View view = m1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.L) {
            profileActivity.N = true;
        }
        if (view instanceof org.telegram.ui.Cells.y8) {
            ((org.telegram.ui.Cells.y8) view).a.setLoading(profileActivity.f5);
            ((org.telegram.ui.Cells.y8) view).b.setLoading(profileActivity.f5);
        }
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        View view = m1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.L) {
            profileActivity.N = false;
        }
    }
}
