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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a11 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public a11(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f3 && b10 != profileActivity.T2 && b10 != profileActivity.h3 && b10 != profileActivity.g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.z3 && b10 != profileActivity.i3 && b10 != profileActivity.j3 && b10 != profileActivity.q3 && b10 != profileActivity.n3 && b10 != profileActivity.k3 && b10 != profileActivity.m3 && b10 != profileActivity.r3 && b10 != profileActivity.s3 && b10 != profileActivity.v3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.a4 && b10 != profileActivity.c4 && b10 != profileActivity.g4 && b10 != profileActivity.f4 && b10 != profileActivity.l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.d4 && b10 != profileActivity.e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.za) {
                Object currentObject = ((org.telegram.ui.Cells.za) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f;
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
                    SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.i("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        t01 t01Var = new t01(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, t01Var);
                        clickableSpan = t01Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.e.z0)), 0, spannableString.length(), 33);
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
        if (i10 == profileActivity.D3 || i10 == profileActivity.t4 || i10 == profileActivity.e3 || i10 == profileActivity.S2 || i10 == profileActivity.p3 || i10 == profileActivity.u3 || i10 == profileActivity.n4) {
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
        if (i10 == profileActivity.q4 || i10 == profileActivity.r4 || i10 == profileActivity.V3 || i10 == profileActivity.X3 || i10 == profileActivity.W3 || i10 == profileActivity.x4 || i10 == profileActivity.y4 || i10 == profileActivity.z4 || i10 == profileActivity.A4 || i10 == profileActivity.G4 || i10 == profileActivity.w4 || i10 == profileActivity.L4 || i10 == profileActivity.K4 || i10 == profileActivity.U3 || i10 == profileActivity.f3 || i10 == profileActivity.h3 || i10 == profileActivity.g3 || i10 == profileActivity.i3 || i10 == profileActivity.j3 || i10 == profileActivity.q3 || i10 == profileActivity.n3 || i10 == profileActivity.k3 || i10 == profileActivity.m3 || i10 == profileActivity.r3 || i10 == profileActivity.s3 || i10 == profileActivity.v3 || i10 == profileActivity.w3 || i10 == profileActivity.x3 || i10 == profileActivity.y3 || i10 == profileActivity.O2 || i10 == profileActivity.a4 || i10 == profileActivity.Z3 || i10 == profileActivity.l3 || i10 == profileActivity.g4 || i10 == profileActivity.f4 || i10 == profileActivity.B4 || i10 == profileActivity.C4 || i10 == profileActivity.D4) {
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
        if (i10 == profileActivity.M4 || i10 == profileActivity.H4 || i10 == profileActivity.m4 || i10 == profileActivity.s4 || i10 == profileActivity.d3 || i10 == profileActivity.o3 || i10 == profileActivity.t3 || i10 == profileActivity.P2 || i10 == profileActivity.b3 || i10 == profileActivity.X2 || i10 == profileActivity.h4 || i10 == profileActivity.Y3 || i10 == profileActivity.R2 || i10 == profileActivity.Z2 || i10 == profileActivity.F4 || i10 == profileActivity.p4 || i10 == profileActivity.E4 || i10 == profileActivity.k4) {
            return 7;
        }
        if (i10 >= profileActivity.u4 && i10 < profileActivity.v4) {
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
        if (i10 == profileActivity.J4) {
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
        if (i10 == profileActivity.R3 || i10 == profileActivity.T3) {
            return 26;
        }
        if (i10 == profileActivity.j4) {
            return 32;
        }
        if (i10 == profileActivity.l4) {
            return 33;
        }
        if (i10 == profileActivity.S3) {
            return 27;
        }
        return (i10 == profileActivity.E3 || i10 == profileActivity.F3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:566:0x0e37, code lost:
    
        if (r0.about != null) goto L574;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x130a  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x134a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
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
        long j3;
        TLRPC.Chat chat3;
        String str3;
        String str4;
        boolean z10;
        String str5;
        long j10;
        long j11;
        long j12;
        String str6;
        boolean z11;
        long j13;
        long j14;
        long j15;
        int i26;
        long j16;
        TLRPC.TL_username tL_username;
        String str7;
        String str8;
        long j17;
        int i27;
        CharSequence formatTextWithEntities;
        long j18;
        String string2;
        String str9;
        boolean z12;
        TLRPC.UserFull userFull;
        long j19;
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
        org.telegram.ui.Cells.r8 r8Var;
        int i72;
        int i73;
        TLRPC.UserFull userFull13;
        boolean z16;
        int i74;
        boolean z17;
        int i75;
        TLRPC.UserFull userFull14;
        int i76;
        int i77;
        int i78;
        long j20;
        int i79;
        TLRPC.ChatFull chatFull5;
        int i80;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i81;
        int i82;
        long j21;
        int i83;
        long j22;
        int i84;
        long j23;
        int i85;
        long j24;
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
        long j25;
        boolean z18;
        boolean z19;
        NotificationsController notificationsController;
        boolean z20;
        long j26;
        long j27;
        String str12;
        final boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        long j28;
        boolean z25;
        boolean z26;
        boolean z27;
        int i96;
        int i97;
        int i98;
        long j29;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i99;
        int i100;
        long j30;
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
        Long l4;
        long j31;
        TLRPC.User user2;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i103;
        org.telegram.ui.ActionBar.f6 f6Var;
        long j32;
        TLRPC.Chat chat11;
        long j33;
        long j34;
        int i104;
        int i105;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.Q4;
        ArrayList arrayList2 = profileActivity.R4;
        HashSet hashSet = profileActivity.h5;
        int i106 = c1Var.f;
        View view = c1Var.a;
        String str13 = "";
        String str14 = null;
        r10 = null;
        String str15 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        r12 = true;
        boolean z30 = true;
        int i107 = 0;
        switch (i106) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                i11 = profileActivity.D3;
                if (i10 == i11) {
                    chat = profileActivity.E2;
                    if (ChatObject.isChannel(chat)) {
                        chat2 = profileActivity.E2;
                        if (!chat2.megagroup && profileActivity.K3 != -1) {
                            l4Var.setText(LocaleController.getString(R.string.ReportChatDescription));
                        }
                    }
                    l4Var.setText(LocaleController.getString(R.string.Info));
                } else {
                    i12 = profileActivity.t4;
                    if (i10 == i12) {
                        l4Var.setText(LocaleController.getString(R.string.ChannelMembers));
                    } else {
                        i13 = profileActivity.e3;
                        if (i10 == i13) {
                            l4Var.setText(LocaleController.getString(R.string.SETTINGS));
                        } else {
                            i14 = profileActivity.S2;
                            if (i10 == i14) {
                                l4Var.setText(LocaleController.getString(R.string.Account));
                            } else {
                                i15 = profileActivity.p3;
                                if (i10 == i15) {
                                    l4Var.setText(LocaleController.getString(R.string.SettingsHelp));
                                } else {
                                    i16 = profileActivity.u3;
                                    if (i10 == i16) {
                                        l4Var.setText(LocaleController.getString(R.string.SettingsDebug));
                                    } else {
                                        i17 = profileActivity.n4;
                                        if (i10 == i17) {
                                            l4Var.setText(LocaleController.getString(R.string.BotProfilePermissions));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                l4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.L6));
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                if (i10 == profileActivity.U2) {
                    MessagesController messagesController = profileActivity.getMessagesController();
                    j19 = profileActivity.e1;
                    TLRPC.UserFull userFull34 = messagesController.getUserFull(j19);
                    if (userFull34 != null && userFull34.birthday != null) {
                        boolean isToday = BirthdayController.isToday(userFull34);
                        TL_account.TL_birthday tL_birthday = userFull34.birthday;
                        boolean z31 = (tL_birthday.flags & 1) != 0;
                        int years = z31 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String Z = UserInfoActivity.Z(userFull34.birthday);
                        if (z31) {
                            formatString = LocaleController.formatPluralString(isToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, Z);
                        } else {
                            formatString = LocaleController.formatString(isToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, Z);
                        }
                        c9Var.c(Emoji.replaceWithRestrictedEmoji(formatString, c9Var.a, new ai0(this, c1Var, i10, 7)), LocaleController.getString(isToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday), (!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) ? false : true);
                        if (!profileActivity.s1 && isToday && !profileActivity.getMessagesController().premiumPurchaseBlocked()) {
                            i28 = 1;
                            i107 = i28;
                        }
                    }
                    i28 = 0;
                    i107 = i28;
                } else {
                    i18 = profileActivity.G3;
                    if (i10 == i18) {
                        MessagesController messagesController2 = profileActivity.getMessagesController();
                        j18 = profileActivity.e1;
                        TLRPC.User user3 = messagesController2.getUser(Long.valueOf(j18));
                        if (user3 != null && !TextUtils.isEmpty(profileActivity.d5)) {
                            string2 = org.telegram.messenger.w1.j(new StringBuilder("+"), profileActivity.d5, gf.b.c());
                            str9 = profileActivity.d5;
                        } else if (user3 == null || TextUtils.isEmpty(user3.phone)) {
                            string2 = LocaleController.getString(R.string.PhoneHidden);
                            str9 = null;
                        } else {
                            String j35 = org.telegram.messenger.w1.j(new StringBuilder("+"), user3.phone, gf.b.c());
                            str9 = user3.phone;
                            string2 = j35;
                        }
                        profileActivity.b5 = str9 != null && str9.matches("888\\d{8}");
                        z12 = profileActivity.b5;
                        c9Var.c(string2, LocaleController.getString(z12 ? R.string.AnonymousNumber : R.string.PhoneMobile), false);
                    } else {
                        i19 = profileActivity.H3;
                        if (i10 == i19) {
                            MessagesController messagesController3 = profileActivity.getMessagesController();
                            j17 = profileActivity.e1;
                            TLRPC.UserFull userFull35 = messagesController3.getUserFull(j17);
                            if (userFull35 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = userFull35.note;
                                i27 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                if (UserConfig.getInstance(i27).isPremium()) {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities);
                                    if (!(formatTextWithEntities instanceof SpannableStringBuilder)) {
                                        formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
                                    }
                                    AndroidUtilities.addLinksSafe((SpannableStringBuilder) formatTextWithEntities, 1, false, false);
                                } else {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(MessageObject.removeLinks(tL_textWithEntities));
                                }
                                c9Var.d(formatTextWithEntities, LocaleController.getString(R.string.ProfileNotes), LocaleController.getString(R.string.ProfileNotesInfo));
                            }
                        } else {
                            i20 = profileActivity.L3;
                            if (i10 == i20) {
                                ArrayList arrayList3 = new ArrayList();
                                j3 = profileActivity.e1;
                                if (j3 != 0) {
                                    MessagesController messagesController4 = profileActivity.getMessagesController();
                                    j16 = profileActivity.e1;
                                    TLRPC.User user4 = messagesController4.getUser(Long.valueOf(j16));
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
                                                t01 t01Var = new t01(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, t01Var);
                                                clickableSpan = t01Var;
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
                                        j10 = profileActivity.f1;
                                        TLRPC.Chat chat13 = messagesController5.getChat(Long.valueOf(j10));
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
                                            j14 = profileActivity.g1;
                                            String str16 = str13;
                                            if (j14 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j15 = profileActivity.g1;
                                                sb3.append(j15);
                                                str16 = sb3.toString();
                                            }
                                            sb2.append(str16);
                                            str6 = sb2.toString();
                                            str4 = LocaleController.getString(R.string.InviteLink);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().linkPrefix);
                                            sb4.append("/c/");
                                            j11 = profileActivity.f1;
                                            sb4.append(j11);
                                            j12 = profileActivity.g1;
                                            String str17 = str13;
                                            if (j12 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j13 = profileActivity.g1;
                                                sb5.append(j13);
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
                                        str3 = "";
                                        str4 = str3;
                                        z10 = false;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i26 = profileActivity.F3;
                                c9Var.c(str3, E, i26 == -1 && !(!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) && profileActivity.U2 < 0);
                                if (i107 == 0) {
                                    Drawable d = f0.e.d(c9Var.getContext(), R.drawable.msg_input_gift);
                                    d.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.V6), PorterDuff.Mode.MULTIPLY));
                                    userFull = profileActivity.v2;
                                    if (UserObject.areGiftsDisabled(userFull)) {
                                        c9Var.setImage(null);
                                        c9Var.setImageClickListener(null);
                                    } else {
                                        c9Var.b(d, LocaleController.getString(R.string.GiftPremium));
                                        c9Var.setImageClickListener(new jy0(profileActivity, 11));
                                    }
                                } else if (z10) {
                                    Drawable d10 = f0.e.d(c9Var.getContext(), R.drawable.header_qr_24);
                                    d10.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.v8), PorterDuff.Mode.MULTIPLY));
                                    c9Var.b(d10, LocaleController.getString(R.string.GetQRCode));
                                    c9Var.setImageClickListener(new jy0(profileActivity, 12));
                                } else {
                                    c9Var.setImage(null);
                                    c9Var.setImageClickListener(null);
                                }
                                c9Var.setTag(Integer.valueOf(i10));
                                c9Var.a.setLoading(profileActivity.i5);
                                c9Var.b.setLoading(profileActivity.i5);
                                break;
                            } else {
                                i21 = profileActivity.I3;
                                if (i10 == i21) {
                                    chatFull = profileActivity.u2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.u2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.u2;
                                            c9Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, LocaleController.getString(R.string.AttachLocation), false);
                                        }
                                    }
                                } else {
                                    i22 = profileActivity.T2;
                                    if (i10 == i22) {
                                        i25 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                        TLRPC.User currentUser = UserConfig.getInstance(i25).getCurrentUser();
                                        c9Var.c((currentUser == null || (str2 = currentUser.phone) == null || str2.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.w1.j(new StringBuilder("+"), currentUser.phone, gf.b.c()), LocaleController.getString(R.string.TapToChangePhone), true);
                                        c9Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i23 = profileActivity.V2;
                                        if (i10 == i23) {
                                            i24 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                            TLRPC.User currentUser2 = UserConfig.getInstance(i24).getCurrentUser();
                                            String string4 = LocaleController.getString(R.string.Username);
                                            if (currentUser2 == null || currentUser2.usernames.size() <= 0) {
                                                String publicUsername2 = UserObject.getPublicUsername(currentUser2);
                                                if (currentUser2 == null || TextUtils.isEmpty(publicUsername2)) {
                                                    string = LocaleController.getString(R.string.UsernameEmpty);
                                                    charSequence = string4;
                                                } else {
                                                    string = org.telegram.ui.Cells.p6.i("@", publicUsername2);
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
                                            c9Var.c(string, charSequence, true);
                                            c9Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z10 = false;
                if (i107 == 0) {
                }
                c9Var.setTag(Integer.valueOf(i10));
                c9Var.a.setLoading(profileActivity.i5);
                c9Var.b.setLoading(profileActivity.i5);
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
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                int i110 = org.telegram.ui.ActionBar.j6.m6;
                int i111 = org.telegram.ui.ActionBar.j6.G6;
                r8Var2.e(i110, i111);
                r8Var2.setTag(Integer.valueOf(i111));
                i31 = profileActivity.q4;
                if (i10 == i31) {
                    int i112 = org.telegram.messenger.w1.m(profileActivity.getMessagesController(), profileActivity.i1).ttl;
                    r8Var2.o(LocaleController.getString(R.string.MessageLifetime), i112 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : LocaleController.formatTTLString(i112), false, false);
                } else {
                    i32 = profileActivity.K4;
                    if (i10 == i32) {
                        r8Var2.i(LocaleController.getString(R.string.Unblock), false);
                        r8Var2.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    } else {
                        i33 = profileActivity.r4;
                        if (i10 == i33) {
                            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40();
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(profileActivity.getMessagesController(), profileActivity.i1);
                            byte[] bArr = m10.key_hash;
                            m40Var.a = bArr;
                            if (bArr == null) {
                                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(m10.auth_key);
                                m40Var.a = calcAuthKeyHash;
                                m10.key_hash = calcAuthKeyHash;
                            }
                            m40Var.invalidateSelf();
                            r8Var2.t(LocaleController.getString(R.string.EncryptionKey), m40Var, false);
                        } else {
                            i34 = profileActivity.L4;
                            if (i10 == i34) {
                                r8Var2.e(-1, org.telegram.ui.ActionBar.j6.o6);
                                chat10 = profileActivity.E2;
                                if (chat10.megagroup) {
                                    r8Var2.i(LocaleController.getString(R.string.ProfileJoinGroup), false);
                                } else {
                                    r8Var2.i(LocaleController.getString(R.string.ProfileJoinChannel), false);
                                }
                            } else {
                                i35 = profileActivity.x4;
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
                                                int i113 = R.drawable.msg_groups;
                                                i93 = profileActivity.H4;
                                                r8Var2.q(string6, formatNumber, i113, i10 != i93 - 1);
                                            }
                                        }
                                        String string7 = LocaleController.getString(R.string.ChannelMembers);
                                        chatFull13 = profileActivity.u2;
                                        String formatNumber2 = LocaleController.formatNumber(chatFull13.participants_count, ',');
                                        int i114 = R.drawable.msg_groups;
                                        i92 = profileActivity.H4;
                                        r8Var2.q(string7, formatNumber2, i114, i10 != i92 - 1);
                                    } else {
                                        chat6 = profileActivity.E2;
                                        if (ChatObject.isChannel(chat6)) {
                                            chat7 = profileActivity.E2;
                                            if (!chat7.megagroup) {
                                                String string8 = LocaleController.getString(R.string.ChannelSubscribers);
                                                int i115 = R.drawable.msg_groups;
                                                i91 = profileActivity.H4;
                                                r8Var2.m(i115, string8, i10 != i91 - 1);
                                            }
                                        }
                                        String string9 = LocaleController.getString(R.string.ChannelMembers);
                                        int i116 = R.drawable.msg_groups;
                                        i90 = profileActivity.H4;
                                        r8Var2.m(i116, string9, i10 != i90 - 1);
                                    }
                                } else {
                                    i36 = profileActivity.y4;
                                    if (i10 == i36) {
                                        chatFull10 = profileActivity.u2;
                                        if (chatFull10 != null) {
                                            String string10 = LocaleController.getString(R.string.SubscribeRequests);
                                            chatFull11 = profileActivity.u2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            int i117 = R.drawable.msg_requests;
                                            i89 = profileActivity.H4;
                                            r8Var2.q(string10, format, i117, i10 != i89 - 1);
                                        }
                                    } else {
                                        i37 = profileActivity.z4;
                                        if (i10 == i37) {
                                            chatFull8 = profileActivity.u2;
                                            if (chatFull8 != null) {
                                                String string11 = LocaleController.getString(R.string.ChannelAdministrators);
                                                chatFull9 = profileActivity.u2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                int i118 = R.drawable.msg_admins;
                                                i88 = profileActivity.H4;
                                                r8Var2.q(string11, format2, i118, i10 != i88 - 1);
                                            } else {
                                                String string12 = LocaleController.getString(R.string.ChannelAdministrators);
                                                int i119 = R.drawable.msg_admins;
                                                i87 = profileActivity.H4;
                                                r8Var2.m(i119, string12, i10 != i87 - 1);
                                            }
                                        } else {
                                            i38 = profileActivity.A4;
                                            if (i10 == i38) {
                                                String string13 = LocaleController.getString(R.string.ChannelAdminSettings);
                                                int i120 = R.drawable.msg_customize;
                                                i86 = profileActivity.H4;
                                                r8Var2.m(i120, string13, i10 != i86 - 1);
                                            } else {
                                                i39 = profileActivity.D4;
                                                if (i10 == i39) {
                                                    i84 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                    zh.o g10 = zh.o.g(i84);
                                                    j23 = profileActivity.f1;
                                                    TL_stars.StarsAmount c10 = g10.c(-j23);
                                                    i85 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                    zh.o g11 = zh.o.g(i85);
                                                    j24 = profileActivity.f1;
                                                    long i121 = g11.i(-j24);
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
                                                    if (c10.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) zh.v7.K0(c10, 0.777f, ' '));
                                                    }
                                                    r8Var2.q(LocaleController.getString(R.string.ChannelStars), ke.f0(zh.v7.X0(false, spannableStringBuilder, 0.7f, null), r8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i40 = profileActivity.B4;
                                                    if (i10 == i40) {
                                                        i83 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                        zh.o g12 = zh.o.g(i83);
                                                        j22 = profileActivity.e1;
                                                        TL_stars.StarsAmount c11 = g12.c(j22);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c11.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) zh.v7.K0(c11, 0.777f, ' '));
                                                        }
                                                        r8Var2.q(LocaleController.getString(R.string.BotBalanceStars), ke.f0(zh.v7.X0(false, spannableStringBuilder2, 0.7f, null), r8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i41 = profileActivity.C4;
                                                        if (i10 == i41) {
                                                            i82 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                            zh.o g13 = zh.o.g(i82);
                                                            j21 = profileActivity.e1;
                                                            long i122 = g13.i(j21);
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
                                                            r8Var2.q(LocaleController.getString(R.string.BotBalanceTON), ke.f0(zh.v7.X0(false, spannableStringBuilder3, 0.7f, null), r8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i42 = profileActivity.G4;
                                                            if (i10 == i42) {
                                                                chatFull5 = profileActivity.u2;
                                                                if (chatFull5 != null) {
                                                                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    chatFull6 = profileActivity.u2;
                                                                    int i123 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.u2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i123, chatFull7.kicked_count)));
                                                                    int i124 = R.drawable.msg_user_remove;
                                                                    i81 = profileActivity.H4;
                                                                    r8Var2.q(string14, format3, i124, i10 != i81 - 1);
                                                                } else {
                                                                    String string15 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    int i125 = R.drawable.msg_user_remove;
                                                                    i80 = profileActivity.H4;
                                                                    r8Var2.m(i125, string15, i10 != i80 - 1);
                                                                }
                                                            } else {
                                                                i43 = profileActivity.w4;
                                                                if (i10 == i43) {
                                                                    r8Var2.e(i110, i111);
                                                                    int i126 = i10 + 1;
                                                                    boolean z32 = i126 >= profileActivity.u4 && i126 < profileActivity.v4;
                                                                    String string16 = LocaleController.getString(R.string.AddMember);
                                                                    int i127 = R.drawable.msg_contact_add;
                                                                    i79 = profileActivity.H4;
                                                                    r8Var2.m(i127, string16, i79 == -1 || z32);
                                                                } else {
                                                                    i44 = profileActivity.U3;
                                                                    if (i10 == i44) {
                                                                        r8Var2.i(LocaleController.getString(R.string.SendMessageLocation), true);
                                                                    } else {
                                                                        i45 = profileActivity.Z3;
                                                                        if (i10 == i45) {
                                                                            r8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), false);
                                                                            r8Var2.e(i110, i111);
                                                                        } else {
                                                                            i46 = profileActivity.W3;
                                                                            if (i10 == i46) {
                                                                                r8Var2.m(R.drawable.menu_reaction_delete_24, LocaleController.getString(R.string.DeleteReactionMenu), false);
                                                                                r8Var2.e(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                                                                            } else {
                                                                                i47 = profileActivity.X3;
                                                                                if (i10 == i47) {
                                                                                    MessagesController messagesController7 = profileActivity.getMessagesController();
                                                                                    j20 = profileActivity.a5;
                                                                                    TLRPC.Chat chat14 = messagesController7.getChat(Long.valueOf(-j20));
                                                                                    if (chat14 == null || !ChatObject.canBlockUsers(chat14)) {
                                                                                        r8Var2.m(R.drawable.msg_report, LocaleController.getString(R.string.ReportReaction2), false);
                                                                                    } else {
                                                                                        r8Var2.m(R.drawable.msg_block2, LocaleController.getString(R.string.ReportReactionAndBan2), false);
                                                                                    }
                                                                                    r8Var2.e(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                                                                                } else {
                                                                                    i48 = profileActivity.V3;
                                                                                    if (i10 == i48) {
                                                                                        r8Var2.i(LocaleController.getString(R.string.ReportUserLocation), false);
                                                                                        int i128 = org.telegram.ui.ActionBar.j6.p7;
                                                                                        r8Var2.e(-1, i128);
                                                                                        r8Var2.e(-1, i128);
                                                                                    } else {
                                                                                        i49 = profileActivity.g3;
                                                                                        if (i10 == i49) {
                                                                                            r8Var2.s(LocaleController.getString(R.string.Language), LocaleController.getCurrentLanguageName(), false, R.drawable.msg2_language, false);
                                                                                            r8Var2.setImageLeft(23);
                                                                                        } else {
                                                                                            i50 = profileActivity.f3;
                                                                                            if (i10 == i50) {
                                                                                                r8Var2.m(R.drawable.msg2_notifications, LocaleController.getString(R.string.NotificationsAndSounds), true);
                                                                                            } else {
                                                                                                i51 = profileActivity.h3;
                                                                                                if (i10 == i51) {
                                                                                                    r8Var2.m(R.drawable.msg2_secret, LocaleController.getString(R.string.PrivacySettings), true);
                                                                                                } else {
                                                                                                    i52 = profileActivity.i3;
                                                                                                    if (i10 == i52) {
                                                                                                        r8Var2.m(R.drawable.msg2_data, LocaleController.getString(R.string.DataSettings), true);
                                                                                                    } else {
                                                                                                        i53 = profileActivity.j3;
                                                                                                        if (i10 == i53) {
                                                                                                            r8Var2.m(R.drawable.msg2_discussion, LocaleController.getString(R.string.ChatSettings), true);
                                                                                                        } else {
                                                                                                            i54 = profileActivity.k3;
                                                                                                            if (i10 == i54) {
                                                                                                                r8Var2.m(R.drawable.msg2_folder, LocaleController.getString(R.string.Filters), true);
                                                                                                            } else {
                                                                                                                i55 = profileActivity.m3;
                                                                                                                if (i10 == i55) {
                                                                                                                    r8Var2.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), true);
                                                                                                                } else {
                                                                                                                    i56 = profileActivity.l3;
                                                                                                                    if (i10 == i56) {
                                                                                                                        r8Var2.m(R.drawable.msg2_battery, LocaleController.getString(R.string.PowerUsage), true);
                                                                                                                    } else {
                                                                                                                        i57 = profileActivity.q3;
                                                                                                                        if (i10 == i57) {
                                                                                                                            r8Var2.m(R.drawable.msg2_ask_question, LocaleController.getString(R.string.AskAQuestion), true);
                                                                                                                        } else {
                                                                                                                            i58 = profileActivity.r3;
                                                                                                                            if (i10 == i58) {
                                                                                                                                r8Var2.m(R.drawable.msg2_help, LocaleController.getString(R.string.TelegramFAQ), true);
                                                                                                                            } else {
                                                                                                                                i59 = profileActivity.s3;
                                                                                                                                if (i10 == i59) {
                                                                                                                                    r8Var2.m(R.drawable.msg2_policy, LocaleController.getString(R.string.PrivacyPolicy), false);
                                                                                                                                } else {
                                                                                                                                    i60 = profileActivity.v3;
                                                                                                                                    if (i10 == i60) {
                                                                                                                                        r8Var2.i(LocaleController.getString(R.string.DebugSendLogs), true);
                                                                                                                                    } else {
                                                                                                                                        i61 = profileActivity.w3;
                                                                                                                                        if (i10 == i61) {
                                                                                                                                            r8Var2.i(LocaleController.getString(R.string.DebugSendLastLogs), true);
                                                                                                                                        } else {
                                                                                                                                            i62 = profileActivity.x3;
                                                                                                                                            if (i10 == i62) {
                                                                                                                                                r8Var2.i(LocaleController.getString(R.string.DebugClearLogs), profileActivity.y3 != -1);
                                                                                                                                            } else if (i10 == profileActivity.y3) {
                                                                                                                                                r8Var2.i("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i63 = profileActivity.n3;
                                                                                                                                                if (i10 == i63) {
                                                                                                                                                    r8Var2.m(R.drawable.msg2_devices, LocaleController.getString(R.string.Devices), true);
                                                                                                                                                } else {
                                                                                                                                                    i64 = profileActivity.O2;
                                                                                                                                                    if (i10 == i64) {
                                                                                                                                                        profileActivity.W.N(86);
                                                                                                                                                        profileActivity.W.J();
                                                                                                                                                        r8Var2.n(LocaleController.getString(R.string.SetProfilePhoto), profileActivity.W, false);
                                                                                                                                                        r8Var2.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                                                                                                                                        r8Var2.getImageView().setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                                                                                                                                                        r8Var2.setImageLeft(12);
                                                                                                                                                        profileActivity.M2 = r8Var2;
                                                                                                                                                    } else {
                                                                                                                                                        i65 = profileActivity.a4;
                                                                                                                                                        if (i10 == i65) {
                                                                                                                                                            r8Var2.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.AddToGroupOrChannel), false);
                                                                                                                                                        } else {
                                                                                                                                                            i66 = profileActivity.c4;
                                                                                                                                                            if (i10 == i66) {
                                                                                                                                                                r8Var2.n(LocaleController.getString(R.string.TelegramPremium), new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), sg.d1.d().f), true);
                                                                                                                                                                r8Var2.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i67 = profileActivity.d4;
                                                                                                                                                                if (i10 == i67) {
                                                                                                                                                                    i78 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                                                                                                                                    zh.s5 w10 = zh.s5.w(i78);
                                                                                                                                                                    long j36 = w10.p().amount;
                                                                                                                                                                    String string17 = LocaleController.getString(R.string.MenuTelegramStars);
                                                                                                                                                                    CharSequence charSequence2 = str13;
                                                                                                                                                                    if (w10.e) {
                                                                                                                                                                        charSequence2 = str13;
                                                                                                                                                                        if (j36 > 0) {
                                                                                                                                                                            charSequence2 = zh.v7.J0(w10.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    r8Var2.r(string17, charSequence2, new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), sg.d1.d().h), true);
                                                                                                                                                                    r8Var2.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i68 = profileActivity.e4;
                                                                                                                                                                    if (i10 == i68) {
                                                                                                                                                                        i77 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                                                                                                                                                                        zh.s5 L = zh.s5.L(i77);
                                                                                                                                                                        long j37 = L.p().amount;
                                                                                                                                                                        String string18 = LocaleController.getString(R.string.MyTON);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j37 > 0) {
                                                                                                                                                                                charSequence3 = zh.v7.J0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        r8Var2.q(string18, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        r8Var2.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i69 = profileActivity.f4;
                                                                                                                                                                        if (i10 == i69) {
                                                                                                                                                                            r8Var2.m(R.drawable.menu_shop, LocaleController.getString(R.string.TelegramBusiness), true);
                                                                                                                                                                            r8Var2.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i70 = profileActivity.g4;
                                                                                                                                                                            if (i10 == i70) {
                                                                                                                                                                                r8Var2.m(R.drawable.menu_gift, LocaleController.getString(R.string.SendAGift), false);
                                                                                                                                                                                r8Var2.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i71 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i10 == i71) {
                                                                                                                                                                                    String string19 = LocaleController.getString(R.string.BotProfilePermissionLocation);
                                                                                                                                                                                    fi.w0 w0Var = profileActivity.s2;
                                                                                                                                                                                    boolean z33 = w0Var != null && w0Var.g();
                                                                                                                                                                                    int i129 = R.drawable.filled_access_location;
                                                                                                                                                                                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.uj);
                                                                                                                                                                                    i76 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    r8Var = r8Var2;
                                                                                                                                                                                    r8Var.k(string19, z33, i129, themedColor, i76 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    r8Var = r8Var2;
                                                                                                                                                                                    i72 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i10 == i72) {
                                                                                                                                                                                        String string20 = LocaleController.getString(R.string.BotProfilePermissionBiometry);
                                                                                                                                                                                        fi.s sVar = profileActivity.t2;
                                                                                                                                                                                        r8Var.k(string20, sVar != null && sVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.xj), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i73 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i10 == i73) {
                                                                                                                                                                                            String string21 = LocaleController.getString(R.string.BotProfilePermissionEmojiStatus);
                                                                                                                                                                                            userFull13 = profileActivity.v2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.v2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    int i130 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.sj);
                                                                                                                                                                                                    i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i74 == -1) {
                                                                                                                                                                                                        i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i75 == -1) {
                                                                                                                                                                                                            z17 = false;
                                                                                                                                                                                                            r8Var.k(string21, z16, i130, themedColor2, z17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z17 = true;
                                                                                                                                                                                                    r8Var.k(string21, z16, i130, themedColor2, z17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                            int i1302 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                            int themedColor22 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.sj);
                                                                                                                                                                                            i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i74 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z17 = true;
                                                                                                                                                                                            r8Var.k(string21, z16, i1302, themedColor22, z17);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                r8Var2 = r8Var;
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
                r8Var2.c.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.I6));
                break;
            case 6:
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                i94 = profileActivity.N3;
                if (i10 == i94) {
                    i95 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i95);
                    long j38 = profileActivity.i1;
                    if (j38 == 0) {
                        j26 = profileActivity.e1;
                        if (j26 != 0) {
                            j38 = profileActivity.e1;
                        } else {
                            j27 = profileActivity.f1;
                            j38 = -j27;
                        }
                    }
                    j25 = profileActivity.g1;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j38, j25);
                    boolean z34 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, false);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c12 = org.telegram.messenger.w1.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    int c13 = org.telegram.messenger.w1.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
                    if (c12 == 3 && c13 != Integer.MAX_VALUE) {
                        int currentTime = c13 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str14 = z34 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsOn);
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
                    } else if (c12 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.isGlobalNotificationsEnabled(j38, false, false);
                            if (z18 || !z34) {
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
                        if (c12 != 1) {
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
                    z20 = profileActivity.l5;
                    i5Var.setAnimationsEnabled(z20);
                    i5Var.b(LocaleController.getString(R.string.Notifications), str19, 0, z19, 0, false, profileActivity.i4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i10));
                break;
            case 8:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i10 - profileActivity.u4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.u4);
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                            z27 = true;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(str20)) {
                                    str20 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().getClientUserId();
                                z26 = true;
                            } else {
                                z25 = false;
                                z26 = false;
                            }
                            z27 = false;
                        }
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
                            z23 = true;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(str21)) {
                                    str21 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().getClientUserId();
                                str12 = str21;
                                z22 = true;
                            } else {
                                str12 = str21;
                                z21 = false;
                                z22 = false;
                            }
                            z23 = false;
                        }
                    }
                    final TLRPC.User user5 = profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    if (UserObject.isUserSelf(user5)) {
                        MessagesController messagesController8 = profileActivity.getMessagesController();
                        j28 = profileActivity.f1;
                        if (ChatObject.canManageMyTag(messagesController8.getChat(Long.valueOf(j28)))) {
                            z24 = true;
                            final String str22 = str12;
                            final boolean z35 = z22;
                            final boolean z36 = z23;
                            zaVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.q01
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i131;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    ProfileActivity profileActivity2 = a11.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i131 = ((org.telegram.ui.ActionBar.n2) profileActivity2).currentAccount;
                                    long a2 = profileActivity2.a();
                                    f6Var2 = ((org.telegram.ui.ActionBar.n2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.a01.b(parentActivity, i131, a2, user5, str22, z35, z36, z21, f6Var2);
                                }
                            });
                            zaVar.f(user5, i10 != profileActivity.v4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str222 = str12;
                    final boolean z352 = z22;
                    final boolean z362 = z23;
                    zaVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.q01
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i131;
                            org.telegram.ui.ActionBar.f6 f6Var2;
                            ProfileActivity profileActivity2 = a11.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i131 = ((org.telegram.ui.ActionBar.n2) profileActivity2).currentAccount;
                            long a2 = profileActivity2.a();
                            f6Var2 = ((org.telegram.ui.ActionBar.n2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.a01.b(parentActivity, i131, a2, user5, str222, z352, z362, z21, f6Var2);
                        }
                    });
                    zaVar.f(user5, i10 != profileActivity.v4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                i96 = profileActivity.c3;
                if (i10 != i96) {
                    i97 = profileActivity.a3;
                    if (i10 != i97) {
                        i98 = profileActivity.Y2;
                        if (i10 == i98) {
                            z6Var.setType(2);
                            break;
                        }
                    } else {
                        z6Var.setType(0);
                        break;
                    }
                } else {
                    z6Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.BotAddToGroupOrChannelInfo));
                break;
            case 20:
                String string22 = LocaleController.getString(R.string.Notifications);
                MessagesController messagesController9 = profileActivity.getMessagesController();
                long a2 = profileActivity.a();
                j29 = profileActivity.g1;
                ((org.telegram.ui.Cells.w8) view).f(string22, !messagesController9.isDialogMuted(a2, j29), false);
                break;
            case 21:
                ig.k1 k1Var = (ig.k1) view;
                userFull15 = profileActivity.v2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.v2;
                    tL_businessLocation = userFull16.business_location;
                }
                k1Var.a(tL_businessLocation, profileActivity.M3 < 0 && !profileActivity.s1);
                break;
            case 22:
                ig.j1 j1Var = (ig.j1) view;
                j1Var.setOnTimezoneSwitchClick(new p01(this, r12 ? 1 : 0));
                userFull17 = profileActivity.v2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.v2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.N4;
                z29 = profileActivity.O4;
                if ((profileActivity.M3 >= 0 || profileActivity.s1) && profileActivity.P3 < 0) {
                    z30 = false;
                }
                j1Var.b(tL_businessWorkHours, z28, z29, z30);
                break;
            case 23:
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                MessagesController messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.v2;
                TLRPC.Chat chat15 = messagesController10.getChat(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.f6 f6Var2 = profileActivity.w2;
                g6Var.a(f6Var2 != null ? f6Var2.d : null, chat15);
                break;
            case 26:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setLinkTextRippleColor(null);
                i99 = profileActivity.R3;
                if (i10 == i99) {
                    profileActivity.getMessagesController().getUserOrChat(profileActivity.a());
                    userFull26 = profileActivity.v2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.v2;
                        botverification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.u2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.u2;
                            botverification = chatFull16.bot_verification;
                        } else {
                            botverification = null;
                        }
                    }
                    userFull27 = profileActivity.v2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.v2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.v2;
                            l4 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.i4 < 0 || botverification != null || l4 != null) {
                                e9Var.setFixedSize(0);
                                MessagesController messagesController11 = profileActivity.getMessagesController();
                                j31 = profileActivity.e1;
                                TLRPC.User user6 = messagesController11.getUser(Long.valueOf(j31));
                                boolean z37 = user6 == null && user6.bot && user6.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.i4 >= 0) {
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleTag(LocaleController.getString(z37 ? R.string.ProfileBotOpenAppInfoOwner : R.string.ProfileBotOpenAppInfo), new org.telegram.ui.Components.mr0(10, this, z37)));
                                    if (botverification != null || l4 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botverification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.z5(botverification.icon, e9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
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
                                            spannableString2.setSpan(new s01(this, url, url), spanStart, spanEnd, 33);
                                            i107++;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l4 != null && (user2 = profileActivity.getMessagesController().getUser(l4)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.nq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.ProfileBotManagedBy, UserObject.getPublicUsername(user2)), profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.gc), new rx0(15, this, l4)));
                                }
                                e9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.B6))));
                                e9Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                e9Var.setFixedSize(14);
                                e9Var.setText(null);
                                break;
                            }
                        }
                    }
                    l4 = null;
                    if (profileActivity.i4 < 0) {
                    }
                    e9Var.setFixedSize(0);
                    MessagesController messagesController112 = profileActivity.getMessagesController();
                    j31 = profileActivity.e1;
                    TLRPC.User user62 = messagesController112.getUser(Long.valueOf(j31));
                    if (user62 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.i4 >= 0) {
                    }
                    if (botverification == null) {
                    }
                    e9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.B6))));
                    e9Var.setText(spannableStringBuilder42);
                } else {
                    i100 = profileActivity.T3;
                    if (i10 == i100) {
                        MessagesController messagesController12 = profileActivity.getMessagesController();
                        j30 = profileActivity.e1;
                        TLRPC.User user7 = messagesController12.getUser(Long.valueOf(j30));
                        if (user7 != null && user7.bot && user7.bot_can_edit) {
                            e9Var.setFixedSize(0);
                            int i131 = R.string.ProfileBotAffiliateProgramInfoOwner;
                            String userName = UserObject.getUserName(user7);
                            userFull23 = profileActivity.v2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.v2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.v2;
                                    i102 = userFull25.starref_program.commission_permille;
                                    e9Var.setText(LocaleController.formatString(i131, userName, fi.m.G0(i102)));
                                    break;
                                }
                            }
                            i102 = 0;
                            e9Var.setText(LocaleController.formatString(i131, userName, fi.m.G0(i102)));
                        } else {
                            e9Var.setFixedSize(0);
                            int i132 = R.string.ProfileBotAffiliateProgramInfo;
                            String userName2 = UserObject.getUserName(user7);
                            userFull20 = profileActivity.v2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.v2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.v2;
                                    i101 = userFull22.starref_program.commission_permille;
                                    e9Var.setText(LocaleController.formatString(i132, userName2, fi.m.G0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            e9Var.setText(LocaleController.formatString(i132, userName2, fi.m.G0(i101)));
                        }
                    }
                }
                break;
            case 27:
                fi.j jVar2 = (fi.j) view;
                jVar2.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_affiliate, LocaleController.getString(R.string.ProfileBotAffiliateProgram), null);
                userFull31 = profileActivity.v2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.v2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.v2;
                        str15 = fi.m.G0(userFull33.starref_program.commission_permille);
                    }
                }
                jVar2.setPercent(str15);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                i103 = profileActivity.j4;
                if (i10 == i103) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.round_warn);
                    nqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    int i133 = org.telegram.ui.ActionBar.j6.wj;
                    f6Var = profileActivity.z0;
                    nqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.v0(i133, f6Var));
                    spannableStringBuilder5.setSpan(nqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    int i134 = R.string.ProfileUnofficialSecurityRisk;
                    MessagesController messagesController13 = profileActivity.getMessagesController();
                    j32 = profileActivity.e1;
                    spannableStringBuilder5.append((CharSequence) LocaleController.formatString(i134, UserObject.getForcedFirstName(messagesController13.getUser(Long.valueOf(j32)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                hi.c cVar = (hi.c) view;
                chat11 = profileActivity.E2;
                if (chat11 == null) {
                    j33 = profileActivity.e1;
                    if (j33 != 0) {
                        MessagesController messagesController14 = profileActivity.getMessagesController();
                        j34 = profileActivity.e1;
                        TLRPC.User user8 = messagesController14.getUser(Long.valueOf(j34));
                        if (user8 != null) {
                            i104 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                            cVar.a(i104, profileActivity.getMessagesController().getChat(Long.valueOf(user8.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i105 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                    MessagesController messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.E2;
                    cVar.a(i105, messagesController15.getChat(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zaVar;
        View x01Var;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                zaVar = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, profileActivity.z0);
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                u01 u01Var = new u01(this, this.c, profileActivity.z0, i10 == 30, i10 == 19);
                u01Var.setContentDescriptionValueFirst(true);
                zaVar = u01Var;
                break;
            case 3:
                v01 v01Var = new v01(this, context, profileActivity, profileActivity.z0);
                profileActivity.N5 = v01Var;
                zaVar = v01Var;
                break;
            case 4:
                zaVar = new qs(this, context, profileActivity.z0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.z0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                zaVar = c3Var;
                break;
            case 6:
                zaVar = new w01(this, context, profileActivity.z0);
                break;
            case 7:
                zaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 8:
                zaVar = new org.telegram.ui.Cells.za(profileActivity.w4 == -1 ? 9 : 6, 0, this.c, profileActivity.z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, profileActivity.z0));
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                zaVar = e9Var;
                break;
            case 11:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                View s3Var = new org.telegram.ui.Cells.s3(context, AndroidUtilities.dp(i10 == 31 ? 12.0f : 6.0f), 2);
                s3Var.setTag(-33024);
                zaVar = s3Var;
                break;
            case 12:
                x01Var = new x01(this, context);
                x01Var.setBackground(new ColorDrawable(0));
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                x01Var = profileActivity.O;
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 15:
                zaVar = new z01(this, context, profileActivity.z0);
                break;
            case 17:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.z0);
                break;
            case 18:
            case 24:
                View u1Var = new sg.u1(context, i10 == 18 ? 0 : 1, profileActivity.z0);
                u1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0));
                zaVar = u1Var;
                break;
            case 20:
                zaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.z0, false);
                break;
            case 21:
                View k1Var = new ig.k1(context, profileActivity.z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0));
                zaVar = k1Var;
                break;
            case 22:
                View y01Var = new y01(this, context, profileActivity.z0);
                y01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0));
                zaVar = y01Var;
                break;
            case 23:
                zaVar = new r01(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                di.d dVar = new di.d(context, profileActivity.z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new p01(this, 0));
                frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0));
                zaVar = frameLayout;
                break;
            case 26:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.z0);
                break;
            case 27:
                zaVar = new fi.j(context, profileActivity.z0);
                break;
            case 28:
                x01Var = new org.telegram.ui.Components.jn(context, 22);
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 32:
                zaVar = new n11(profileActivity, context);
                break;
            case 33:
                zaVar = new hi.c(context, profileActivity.z0);
                break;
        }
        if (i10 != 13) {
            zaVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.vk0(zaVar);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).a.setLoading(profileActivity.i5);
            ((org.telegram.ui.Cells.c9) view).b.setLoading(profileActivity.i5);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        View view = c1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
