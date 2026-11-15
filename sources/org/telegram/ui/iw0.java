package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class iw0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public iw0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        int b10 = e1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b10 = e1Var.b();
            if (b10 != profileActivity.g3 && b10 != profileActivity.U2 && b10 != profileActivity.i3 && b10 != profileActivity.h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.j3 && b10 != profileActivity.k3 && b10 != profileActivity.r3 && b10 != profileActivity.o3 && b10 != profileActivity.l3 && b10 != profileActivity.n3 && b10 != profileActivity.s3 && b10 != profileActivity.t3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.y3 && b10 != profileActivity.z3 && b10 != profileActivity.P2 && b10 != profileActivity.b4 && b10 != profileActivity.d4 && b10 != profileActivity.h4 && b10 != profileActivity.g4 && b10 != profileActivity.m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.e4 && b10 != profileActivity.f4 && b10 != profileActivity.m4) {
                return false;
            }
        } else {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.q10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = e1Var.f;
            if (i7 == 1 || i7 == 5 || i7 == 7 || i7 == 11 || i7 == 31 || i7 == 28 || i7 == 12 || i7 == 13 || i7 == 9 || i7 == 10 || i7 == 25 || i7 == 32) {
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
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i7)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i7)).username))) {
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
            str3 = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i10);
                    SpannableString spannableString = new SpannableString(r.b.k("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        bw0 bw0Var = new bw0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, bw0Var);
                        clickableSpan = bw0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.Xc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i10 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = org.telegram.messenger.hd.M0(2131743668, null);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf("%1$s");
                str3 = spannableStringBuilder2;
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                    str3 = spannableStringBuilder2;
                }
            }
        }
        return str3;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.O2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e;
        if (i7 == profileActivity.E3 || i7 == profileActivity.u4 || i7 == profileActivity.f3 || i7 == profileActivity.T2 || i7 == profileActivity.q3 || i7 == profileActivity.v3 || i7 == profileActivity.o4) {
            return 1;
        }
        if (i7 == profileActivity.H3 || i7 == profileActivity.J3 || i7 == profileActivity.U2 || i7 == profileActivity.V2) {
            return 2;
        }
        if (i7 == profileActivity.M3 || i7 == profileActivity.W2) {
            return 19;
        }
        if (i7 == profileActivity.I3) {
            return 30;
        }
        if (i7 == profileActivity.K3 || i7 == profileActivity.L3 || i7 == profileActivity.X2) {
            return 3;
        }
        if (i7 == profileActivity.r4 || i7 == profileActivity.s4 || i7 == profileActivity.W3 || i7 == profileActivity.Y3 || i7 == profileActivity.X3 || i7 == profileActivity.y4 || i7 == profileActivity.z4 || i7 == profileActivity.A4 || i7 == profileActivity.B4 || i7 == profileActivity.H4 || i7 == profileActivity.x4 || i7 == profileActivity.N4 || i7 == profileActivity.M4 || i7 == profileActivity.V3 || i7 == profileActivity.g3 || i7 == profileActivity.i3 || i7 == profileActivity.h3 || i7 == profileActivity.j3 || i7 == profileActivity.k3 || i7 == profileActivity.r3 || i7 == profileActivity.o3 || i7 == profileActivity.l3 || i7 == profileActivity.n3 || i7 == profileActivity.s3 || i7 == profileActivity.t3 || i7 == profileActivity.w3 || i7 == profileActivity.x3 || i7 == profileActivity.y3 || i7 == profileActivity.z3 || i7 == profileActivity.P2 || i7 == profileActivity.b4 || i7 == profileActivity.a4 || i7 == profileActivity.m3 || i7 == profileActivity.h4 || i7 == profileActivity.g4 || i7 == profileActivity.C4 || i7 == profileActivity.D4 || i7 == profileActivity.E4) {
            return 4;
        }
        i10 = profileActivity.botPermissionLocation;
        if (i7 == i10) {
            return 4;
        }
        i11 = profileActivity.botPermissionBiometry;
        if (i7 == i11) {
            return 4;
        }
        i12 = profileActivity.botPermissionEmojiStatus;
        if (i7 == i12 || i7 == profileActivity.f4) {
            return 4;
        }
        if (i7 == profileActivity.N3) {
            return 5;
        }
        if (i7 == profileActivity.O3) {
            return 6;
        }
        if (i7 == profileActivity.R3) {
            return 20;
        }
        if (i7 == profileActivity.O4 || i7 == profileActivity.I4 || i7 == profileActivity.n4 || i7 == profileActivity.t4 || i7 == profileActivity.e3 || i7 == profileActivity.p3 || i7 == profileActivity.u3 || i7 == profileActivity.Q2 || i7 == profileActivity.c3 || i7 == profileActivity.Y2 || i7 == profileActivity.i4 || i7 == profileActivity.Z3 || i7 == profileActivity.S2 || i7 == profileActivity.a3 || i7 == profileActivity.G4 || i7 == profileActivity.q4 || i7 == profileActivity.F4 || i7 == profileActivity.l4) {
            return 7;
        }
        if (i7 >= profileActivity.v4 && i7 < profileActivity.w4) {
            return 8;
        }
        if (i7 == profileActivity.B3) {
            return 11;
        }
        if (i7 == profileActivity.C3) {
            return 31;
        }
        if (i7 == profileActivity.D3) {
            return 12;
        }
        if (i7 == profileActivity.L4) {
            return 13;
        }
        if (i7 == profileActivity.A3) {
            return 14;
        }
        if (i7 == profileActivity.d3 || i7 == profileActivity.b3 || i7 == profileActivity.Z2) {
            return 15;
        }
        if (i7 == profileActivity.c4) {
            return 17;
        }
        if (i7 == profileActivity.d4) {
            return 18;
        }
        if (i7 == profileActivity.e4) {
            return 24;
        }
        if (i7 == profileActivity.Q3) {
            return 21;
        }
        if (i7 == profileActivity.P3) {
            return 22;
        }
        if (i7 == profileActivity.R2) {
            return 23;
        }
        if (i7 == profileActivity.j4) {
            return 25;
        }
        if (i7 == profileActivity.S3 || i7 == profileActivity.U3) {
            return 26;
        }
        if (i7 == profileActivity.k4) {
            return 32;
        }
        if (i7 == profileActivity.m4) {
            return 33;
        }
        if (i7 == profileActivity.T3) {
            return 27;
        }
        return (i7 == profileActivity.F3 || i7 == profileActivity.G3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:563:0x0ea3, code lost:
    
        if (r0.about != null) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String L0;
        CharSequence charSequence;
        String str;
        int i24;
        String str2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        long j3;
        TLRPC.Chat chat3;
        boolean z10;
        String str3;
        String str4;
        String str5;
        long j10;
        long j11;
        long j12;
        String str6;
        boolean z11;
        long j13;
        long j14;
        long j15;
        int i25;
        long j16;
        TLRPC.TL_username tL_username;
        String str7;
        long j17;
        int i26;
        CharSequence h02;
        long j18;
        String L02;
        String str8;
        boolean z12;
        TLRPC.UserFull userFull;
        long j19;
        int i27;
        String Z;
        int i28;
        int i29;
        TLRPC.UserFull userFull2;
        TLRPC.UserFull userFull3;
        TLRPC.UserFull userFull4;
        String str9;
        TLRPC.UserFull userFull5;
        String str10;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        TLRPC.ChatFull chatFull4;
        TLRPC.Chat chat4;
        boolean z13;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User a22;
        boolean z14;
        boolean z15;
        TLRPC.UserFull userFull10;
        TLRPC.UserFull userFull11;
        TLRPC.UserFull userFull12;
        int i30;
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
        TLRPC.UserFull userFull13;
        boolean z16;
        int i73;
        boolean z17;
        int i74;
        TLRPC.UserFull userFull14;
        int i75;
        int i76;
        int i77;
        long j20;
        int i78;
        TLRPC.ChatFull chatFull5;
        int i79;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i80;
        int i81;
        long j21;
        int i82;
        long j22;
        int i83;
        long j23;
        int i84;
        long j24;
        int i85;
        TLRPC.ChatFull chatFull8;
        int i86;
        TLRPC.ChatFull chatFull9;
        int i87;
        TLRPC.ChatFull chatFull10;
        TLRPC.ChatFull chatFull11;
        int i88;
        TLRPC.ChatFull chatFull12;
        TLRPC.Chat chat6;
        int i89;
        TLRPC.Chat chat7;
        int i90;
        TLRPC.Chat chat8;
        TLRPC.ChatFull chatFull13;
        int i91;
        TLRPC.Chat chat9;
        TLRPC.ChatFull chatFull14;
        int i92;
        TLRPC.Chat chat10;
        int i93;
        int i94;
        long j25;
        boolean z18;
        String L03;
        boolean z19;
        String str11;
        org.telegram.messenger.at notificationsController;
        boolean z20;
        String Y;
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
        int i95;
        int i96;
        int i97;
        long j29;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i98;
        int i99;
        long j30;
        TLRPC.UserFull userFull20;
        int i100;
        TLRPC.UserFull userFull21;
        TLRPC.UserFull userFull22;
        TLRPC.UserFull userFull23;
        int i101;
        TLRPC.UserFull userFull24;
        TLRPC.UserFull userFull25;
        TLRPC.UserFull userFull26;
        TLRPC.ChatFull chatFull15;
        TL_bots.BotVerification botVerification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l10;
        long j31;
        TLRPC.User a23;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i102;
        long j32;
        TLRPC.Chat chat11;
        long j33;
        long j34;
        int i103;
        int i104;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.S4;
        ArrayList arrayList2 = profileActivity.T4;
        HashSet hashSet = profileActivity.l5;
        int i105 = e1Var.f;
        View view = e1Var.a;
        String str13 = "";
        TLRPC.ChatParticipant chatParticipant = null;
        r11 = null;
        String str14 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        r9 = true;
        boolean z30 = true;
        int i106 = 0;
        switch (i105) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                i10 = profileActivity.E3;
                if (i7 == i10) {
                    chat = profileActivity.F2;
                    if (org.telegram.messenger.t3.T(chat)) {
                        chat2 = profileActivity.F2;
                        if (!chat2.megagroup && profileActivity.L3 != -1) {
                            n4Var.setText(org.telegram.messenger.hd.L0(2131746228));
                        }
                    }
                    n4Var.setText(org.telegram.messenger.hd.L0(2131749197));
                } else {
                    i11 = profileActivity.u4;
                    if (i7 == i11) {
                        n4Var.setText(org.telegram.messenger.hd.L0(2131752377));
                    } else {
                        i12 = profileActivity.f3;
                        if (i7 == i12) {
                            n4Var.setText(org.telegram.messenger.hd.L0(2131745983));
                        } else {
                            i13 = profileActivity.T2;
                            if (i7 == i13) {
                                n4Var.setText(org.telegram.messenger.hd.L0(2131754710));
                            } else {
                                i14 = profileActivity.q3;
                                if (i7 == i14) {
                                    n4Var.setText(org.telegram.messenger.hd.L0(2131745479));
                                } else {
                                    i15 = profileActivity.v3;
                                    if (i7 == i15) {
                                        n4Var.setText(org.telegram.messenger.hd.L0(2131745486));
                                    } else {
                                        i16 = profileActivity.o4;
                                        if (i7 == i16) {
                                            n4Var.setText(org.telegram.messenger.hd.L0(2131753006));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                n4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.L6));
                break;
            case 2:
            case 19:
            case org.telegram.messenger.ns.T /* 30 */:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (i7 == profileActivity.V2) {
                    org.telegram.messenger.np messagesController = profileActivity.getMessagesController();
                    j19 = profileActivity.e1;
                    TLRPC.UserFull b22 = messagesController.b2(j19);
                    if (b22 != null && b22.birthday != null) {
                        boolean d = org.telegram.messenger.v1.d(b22);
                        TL_account.TL_birthday tL_birthday = b22.birthday;
                        boolean z31 = (tL_birthday.flags & 1) != 0;
                        int years = z31 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String e02 = UserInfoActivity.e0(b22.birthday);
                        if (z31) {
                            Z = org.telegram.messenger.hd.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", e02);
                        } else {
                            Z = org.telegram.messenger.hd.Z(d ? 2131746721 : 2131746718, e02);
                        }
                        w8Var.c(org.telegram.messenger.j6.p(Z, w8Var.a, new org.telegram.ui.Components.u11(this, e1Var, i7, 12)), org.telegram.messenger.hd.L0(d ? 2131746722 : 2131746724), (!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().i7) {
                            i27 = 1;
                            z10 = false;
                            i106 = i27;
                        }
                    }
                    i27 = 0;
                    z10 = false;
                    i106 = i27;
                } else {
                    i17 = profileActivity.H3;
                    if (i7 == i17) {
                        org.telegram.messenger.np messagesController2 = profileActivity.getMessagesController();
                        j18 = profileActivity.e1;
                        TLRPC.User a24 = messagesController2.a2(Long.valueOf(j18));
                        if (a24 != null && !TextUtils.isEmpty(profileActivity.g5)) {
                            L02 = org.telegram.messenger.k5.h(new StringBuilder("+"), profileActivity.g5, pf.b.c());
                            str8 = profileActivity.g5;
                        } else if (a24 == null || TextUtils.isEmpty(a24.phone)) {
                            L02 = org.telegram.messenger.hd.L0(2131747294);
                            str8 = null;
                        } else {
                            String h = org.telegram.messenger.k5.h(new StringBuilder("+"), a24.phone, pf.b.c());
                            str8 = a24.phone;
                            L02 = h;
                        }
                        profileActivity.e5 = str8 != null && str8.matches("888\\d{8}");
                        z12 = profileActivity.e5;
                        w8Var.c(L02, org.telegram.messenger.hd.L0(z12 ? 2131754251 : 2131747291), false);
                    } else {
                        i18 = profileActivity.I3;
                        if (i7 == i18) {
                            org.telegram.messenger.np messagesController3 = profileActivity.getMessagesController();
                            j17 = profileActivity.e1;
                            TLRPC.UserFull b23 = messagesController3.b2(j17);
                            if (b23 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = b23.note;
                                i26 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                if (org.telegram.messenger.m10.i(i26).q()) {
                                    h02 = org.telegram.messenger.gj.h0(tL_textWithEntities, false);
                                    if (!(h02 instanceof SpannableStringBuilder)) {
                                        h02 = new SpannableStringBuilder(h02);
                                    }
                                    org.telegram.messenger.g0.c((SpannableStringBuilder) h02, 1, false, false);
                                } else {
                                    h02 = org.telegram.messenger.gj.h0(org.telegram.messenger.gj.x5(tL_textWithEntities), false);
                                }
                                w8Var.d(h02, org.telegram.messenger.hd.L0(2131746650), org.telegram.messenger.hd.L0(2131746649));
                            }
                        } else {
                            i19 = profileActivity.M3;
                            if (i7 == i19) {
                                ArrayList arrayList3 = new ArrayList();
                                j3 = profileActivity.e1;
                                if (j3 != 0) {
                                    org.telegram.messenger.np messagesController4 = profileActivity.getMessagesController();
                                    j16 = profileActivity.e1;
                                    TLRPC.User a25 = messagesController4.a2(Long.valueOf(j16));
                                    if (a25 != null) {
                                        arrayList3.addAll(a25.usernames);
                                    }
                                    if (a25 == null || TextUtils.isEmpty(a25.username)) {
                                        tL_username = null;
                                        str5 = null;
                                    } else {
                                        tL_username = org.telegram.messenger.m5.b(a25.username, arrayList3);
                                        str5 = a25.username;
                                    }
                                    ArrayList arrayList4 = a25 == null ? new ArrayList() : new ArrayList(a25.usernames);
                                    if (TextUtils.isEmpty(str5)) {
                                        int i107 = 0;
                                        while (true) {
                                            if (i107 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i107);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i107++;
                                                } else {
                                                    str5 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String L04 = org.telegram.messenger.hd.L0(2131743674);
                                    if (str5 != null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                bw0 bw0Var = new bw0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, bw0Var);
                                                clickableSpan = bw0Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str7 = spannableString;
                                        }
                                    } else {
                                        str7 = "—";
                                    }
                                    z10 = !profileActivity.s1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str7;
                                    arrayList3 = arrayList5;
                                    str4 = L04;
                                } else {
                                    chat3 = profileActivity.F2;
                                    if (chat3 != null) {
                                        org.telegram.messenger.np messagesController5 = profileActivity.getMessagesController();
                                        j10 = profileActivity.f1;
                                        TLRPC.Chat M0 = messagesController5.M0(Long.valueOf(j10));
                                        String K = org.telegram.messenger.t3.K(M0, false);
                                        if (M0 != null) {
                                            arrayList3.addAll(M0.usernames);
                                        }
                                        if (org.telegram.messenger.t3.t0(M0)) {
                                            z11 = !profileActivity.s1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().V2);
                                            sb2.append("/");
                                            sb2.append(K);
                                            j14 = profileActivity.g1;
                                            String str15 = str13;
                                            if (j14 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j15 = profileActivity.g1;
                                                sb3.append(j15);
                                                str15 = sb3.toString();
                                            }
                                            sb2.append(str15);
                                            str6 = sb2.toString();
                                            str4 = org.telegram.messenger.hd.L0(2131749149);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().V2);
                                            sb4.append("/c/");
                                            j11 = profileActivity.f1;
                                            sb4.append(j11);
                                            j12 = profileActivity.g1;
                                            String str16 = str13;
                                            if (j12 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j13 = profileActivity.g1;
                                                sb5.append(j13);
                                                str16 = sb5.toString();
                                            }
                                            sb4.append(str16);
                                            String sb6 = sb4.toString();
                                            str4 = org.telegram.messenger.hd.L0(2131749145);
                                            str6 = sb6;
                                            z11 = false;
                                        }
                                        str5 = K;
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
                                i25 = profileActivity.G3;
                                w8Var.c(str3, E, i25 == -1 && !(!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) && profileActivity.V2 < 0);
                            } else {
                                i20 = profileActivity.J3;
                                if (i7 == i20) {
                                    chatFull = profileActivity.v2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.v2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.v2;
                                            w8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, org.telegram.messenger.hd.L0(2131753961), false);
                                        }
                                    }
                                } else {
                                    i21 = profileActivity.U2;
                                    if (i7 == i21) {
                                        i24 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                        TLRPC.User f10 = org.telegram.messenger.m10.i(i24).f();
                                        w8Var.c((f10 == null || (str2 = f10.phone) == null || str2.length() == 0) ? org.telegram.messenger.hd.L0(2131747832) : org.telegram.messenger.k5.h(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.hd.L0(2131744260), true);
                                        w8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i22 = profileActivity.W2;
                                        if (i7 == i22) {
                                            i23 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                            TLRPC.User f11 = org.telegram.messenger.m10.i(i23).f();
                                            String L05 = org.telegram.messenger.hd.L0(2131743674);
                                            if (f11 == null || f11.usernames.size() <= 0) {
                                                String n10 = org.telegram.messenger.q10.n(f11);
                                                if (f11 == null || TextUtils.isEmpty(n10)) {
                                                    L0 = org.telegram.messenger.hd.L0(2131743661);
                                                    charSequence = L05;
                                                } else {
                                                    L0 = r.b.k("@", n10);
                                                    charSequence = L05;
                                                }
                                            } else {
                                                int i108 = 0;
                                                while (true) {
                                                    if (i108 < f11.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = f11.usernames.get(i108);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i108++;
                                                        } else {
                                                            str = tL_username3.username;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                }
                                                if (str == null) {
                                                    str = f11.username;
                                                }
                                                L0 = (str == null || TextUtils.isEmpty(str)) ? org.telegram.messenger.hd.L0(2131743661) : "@".concat(str);
                                                charSequence = E(str, f11.usernames, L05);
                                            }
                                            w8Var.c(L0, charSequence, true);
                                            w8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (i106 != 0) {
                    Drawable d2 = f0.d.d(w8Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.V6);
                    RectF rectF = ProfileActivity.X6;
                    d2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.S6 = d2;
                    userFull = profileActivity.w2;
                    if (org.telegram.messenger.q10.b(userFull)) {
                        w8Var.setImage(null);
                        w8Var.setImageClickListener(null);
                    } else {
                        w8Var.b(d2, org.telegram.messenger.hd.L0(2131749680));
                        w8Var.setImageClickListener(new wt0(profileActivity, 12));
                    }
                } else if (z10) {
                    Drawable d10 = f0.d.d(w8Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.v8);
                    RectF rectF2 = ProfileActivity.X6;
                    d10.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.T6 = d10;
                    w8Var.b(d10, org.telegram.messenger.hd.L0(2131750472));
                    w8Var.setImageClickListener(new wt0(profileActivity, 13));
                } else {
                    w8Var.setImage(null);
                    w8Var.setImageClickListener(null);
                }
                w8Var.setTag(Integer.valueOf(i7));
                w8Var.a.setLoading(profileActivity.m5);
                w8Var.b.setLoading(profileActivity.m5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i28 = profileActivity.K3;
                if (i7 == i28) {
                    userFull8 = profileActivity.w2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.w2;
                        a22 = userFull12.user;
                    } else {
                        org.telegram.messenger.np messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.w2;
                        a22 = messagesController6.a2(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.s2;
                    if (!z14) {
                        if (a22 != null && a22.premium) {
                            userFull11 = profileActivity.w2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.w2;
                        jVar.f(userFull10.about, org.telegram.messenger.hd.L0(2131743765), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.w2;
                    jVar.f(userFull10.about, org.telegram.messenger.hd.L0(2131743765), z15);
                } else if (i7 == profileActivity.L3) {
                    chatFull4 = profileActivity.v2;
                    String str17 = chatFull4.about;
                    while (str17.contains("\n\n\n")) {
                        str17 = str17.replace("\n\n\n", "\n\n");
                    }
                    String L06 = org.telegram.messenger.hd.L0(2131751459);
                    chat4 = profileActivity.F2;
                    if (org.telegram.messenger.t3.T(chat4)) {
                        chat5 = profileActivity.F2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            jVar.f(str17, L06, z13);
                            break;
                        }
                    }
                    z13 = false;
                    jVar.f(str17, L06, z13);
                } else {
                    i29 = profileActivity.X2;
                    if (i7 == i29) {
                        userFull2 = profileActivity.w2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.w2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(org.telegram.messenger.hd.L0(2131743765), org.telegram.messenger.hd.L0(2131743764), false);
                                profileActivity.A2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.w2;
                        if (userFull3 == null) {
                            str9 = org.telegram.messenger.hd.L0(2131748779);
                        } else {
                            userFull4 = profileActivity.w2;
                            str9 = userFull4.about;
                        }
                        jVar.f(str9, org.telegram.messenger.hd.L0(2131743765), profileActivity.getUserConfig().q());
                        userFull5 = profileActivity.w2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.w2;
                            str10 = userFull6.about;
                        } else {
                            str10 = null;
                        }
                        profileActivity.A2 = str10;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i109 = org.telegram.ui.ActionBar.j6.m6;
                int i110 = org.telegram.ui.ActionBar.j6.G6;
                l8Var.g(i109, i110);
                l8Var.setTag(Integer.valueOf(i110));
                i30 = profileActivity.r4;
                if (i7 == i30) {
                    int i111 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.i1))).ttl;
                    l8Var.q(org.telegram.messenger.hd.L0(2131748587), i111 == 0 ? org.telegram.messenger.hd.L0(2131745361) : org.telegram.messenger.hd.c0(i111), false, false);
                } else {
                    i31 = profileActivity.M4;
                    if (i7 == i31) {
                        l8Var.k(org.telegram.messenger.hd.L0(2131743911), false);
                        l8Var.g(-1, org.telegram.ui.ActionBar.j6.p7);
                    } else {
                        i32 = profileActivity.s4;
                        if (i7 == i32) {
                            org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30();
                            TLRPC.EncryptedChat a12 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.i1)));
                            byte[] bArr = a12.key_hash;
                            g30Var.a = bArr;
                            if (bArr == null) {
                                byte[] bArr2 = a12.auth_key;
                                Typeface typeface = org.telegram.messenger.g0.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                                g30Var.a = bArr3;
                                a12.key_hash = bArr3;
                            }
                            g30Var.invalidateSelf();
                            l8Var.v(org.telegram.messenger.hd.L0(2131751132), g30Var, false);
                        } else {
                            i33 = profileActivity.N4;
                            if (i7 == i33) {
                                l8Var.g(-1, org.telegram.ui.ActionBar.j6.o6);
                                chat10 = profileActivity.F2;
                                if (chat10.megagroup) {
                                    l8Var.k(org.telegram.messenger.hd.L0(2131746661), false);
                                } else {
                                    l8Var.k(org.telegram.messenger.hd.L0(2131746662), false);
                                }
                            } else {
                                i34 = profileActivity.y4;
                                if (i7 == i34) {
                                    chatFull12 = profileActivity.v2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.F2;
                                        if (org.telegram.messenger.t3.T(chat8)) {
                                            chat9 = profileActivity.F2;
                                            if (!chat9.megagroup) {
                                                String L07 = org.telegram.messenger.hd.L0(2131752289);
                                                chatFull14 = profileActivity.v2;
                                                String E2 = org.telegram.messenger.hd.E(chatFull14.participants_count, ',');
                                                i92 = profileActivity.I4;
                                                l8Var.s(L07, E2, R.drawable.msg_groups, i7 != i92 - 1);
                                            }
                                        }
                                        String L08 = org.telegram.messenger.hd.L0(2131752377);
                                        chatFull13 = profileActivity.v2;
                                        String E3 = org.telegram.messenger.hd.E(chatFull13.participants_count, ',');
                                        i91 = profileActivity.I4;
                                        l8Var.s(L08, E3, R.drawable.msg_groups, i7 != i91 - 1);
                                    } else {
                                        chat6 = profileActivity.F2;
                                        if (org.telegram.messenger.t3.T(chat6)) {
                                            chat7 = profileActivity.F2;
                                            if (!chat7.megagroup) {
                                                String L09 = org.telegram.messenger.hd.L0(2131752289);
                                                i90 = profileActivity.I4;
                                                l8Var.o(R.drawable.msg_groups, L09, i7 != i90 - 1);
                                            }
                                        }
                                        String L010 = org.telegram.messenger.hd.L0(2131752377);
                                        i89 = profileActivity.I4;
                                        l8Var.o(R.drawable.msg_groups, L010, i7 != i89 - 1);
                                    }
                                } else {
                                    i35 = profileActivity.z4;
                                    if (i7 == i35) {
                                        chatFull10 = profileActivity.v2;
                                        if (chatFull10 != null) {
                                            String L011 = org.telegram.messenger.hd.L0(2131744436);
                                            chatFull11 = profileActivity.v2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            i88 = profileActivity.I4;
                                            l8Var.s(L011, format, R.drawable.msg_requests, i7 != i88 - 1);
                                        }
                                    } else {
                                        i36 = profileActivity.A4;
                                        if (i7 == i36) {
                                            chatFull8 = profileActivity.v2;
                                            if (chatFull8 != null) {
                                                String L012 = org.telegram.messenger.hd.L0(2131752517);
                                                chatFull9 = profileActivity.v2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                i87 = profileActivity.I4;
                                                l8Var.s(L012, format2, R.drawable.msg_admins, i7 != i87 - 1);
                                            } else {
                                                String L013 = org.telegram.messenger.hd.L0(2131752517);
                                                i86 = profileActivity.I4;
                                                l8Var.o(R.drawable.msg_admins, L013, i7 != i86 - 1);
                                            }
                                        } else {
                                            i37 = profileActivity.B4;
                                            if (i7 == i37) {
                                                String L014 = org.telegram.messenger.hd.L0(2131752519);
                                                i85 = profileActivity.I4;
                                                l8Var.o(R.drawable.msg_customize, L014, i7 != i85 - 1);
                                            } else {
                                                i38 = profileActivity.E4;
                                                if (i7 == i38) {
                                                    i83 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                    di.e0 g10 = di.e0.g(i83);
                                                    j23 = profileActivity.f1;
                                                    TL_stars.StarsAmount c10 = g10.c(-j23);
                                                    i84 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                    di.e0 g11 = di.e0.g(i84);
                                                    j24 = profileActivity.f1;
                                                    long i112 = g11.i(-j24);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i112 > 0) {
                                                        double d11 = i112 / 1.0E9d;
                                                        if (d11 > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d11, 0));
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
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) di.lb.N0(c10, 0.777f, ' '));
                                                    }
                                                    l8Var.s(org.telegram.messenger.hd.L0(2131752290), xd.K(di.lb.a1(false, spannableStringBuilder, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i39 = profileActivity.C4;
                                                    if (i7 == i39) {
                                                        i82 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                        di.e0 g12 = di.e0.g(i82);
                                                        j22 = profileActivity.e1;
                                                        TL_stars.StarsAmount c11 = g12.c(j22);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c11.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) di.lb.N0(c11, 0.777f, ' '));
                                                        }
                                                        l8Var.s(org.telegram.messenger.hd.L0(2131753111), xd.K(di.lb.a1(false, spannableStringBuilder2, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i40 = profileActivity.D4;
                                                        if (i7 == i40) {
                                                            i81 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                            di.e0 g13 = di.e0.g(i81);
                                                            j21 = profileActivity.e1;
                                                            long i113 = g13.i(j21);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i113 > 0) {
                                                                double d12 = i113 / 1.0E9d;
                                                                if (d12 > 1000.0d) {
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d12, 0));
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
                                                            l8Var.s(org.telegram.messenger.hd.L0(2131753110), xd.K(di.lb.a1(false, spannableStringBuilder3, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i41 = profileActivity.H4;
                                                            if (i7 == i41) {
                                                                chatFull5 = profileActivity.v2;
                                                                if (chatFull5 != null) {
                                                                    String L015 = org.telegram.messenger.hd.L0(2131752453);
                                                                    chatFull6 = profileActivity.v2;
                                                                    int i114 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.v2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i114, chatFull7.kicked_count)));
                                                                    i80 = profileActivity.I4;
                                                                    l8Var.s(L015, format3, R.drawable.msg_user_remove, i7 != i80 - 1);
                                                                } else {
                                                                    String L016 = org.telegram.messenger.hd.L0(2131752453);
                                                                    i79 = profileActivity.I4;
                                                                    l8Var.o(R.drawable.msg_user_remove, L016, i7 != i79 - 1);
                                                                }
                                                            } else {
                                                                i42 = profileActivity.x4;
                                                                if (i7 == i42) {
                                                                    l8Var.g(i109, i110);
                                                                    int i115 = i7 + 1;
                                                                    boolean z32 = i115 >= profileActivity.v4 && i115 < profileActivity.w4;
                                                                    String L017 = org.telegram.messenger.hd.L0(2131754401);
                                                                    i78 = profileActivity.I4;
                                                                    l8Var.o(R.drawable.msg_contact_add, L017, i78 == -1 || z32);
                                                                } else {
                                                                    i43 = profileActivity.V3;
                                                                    if (i7 == i43) {
                                                                        l8Var.k(org.telegram.messenger.hd.L0(2131745599), true);
                                                                    } else {
                                                                        i44 = profileActivity.a4;
                                                                        if (i7 == i44) {
                                                                            l8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.hd.L0(2131754377), false);
                                                                            l8Var.g(i109, i110);
                                                                        } else {
                                                                            i45 = profileActivity.X3;
                                                                            if (i7 == i45) {
                                                                                l8Var.o(R.drawable.menu_reaction_delete_24, org.telegram.messenger.hd.L0(2131751507), false);
                                                                                l8Var.g(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                                                                            } else {
                                                                                i46 = profileActivity.Y3;
                                                                                if (i7 == i46) {
                                                                                    org.telegram.messenger.np messagesController7 = profileActivity.getMessagesController();
                                                                                    j20 = profileActivity.d5;
                                                                                    TLRPC.Chat M02 = messagesController7.M0(Long.valueOf(-j20));
                                                                                    if (M02 == null || !org.telegram.messenger.t3.w(2, M02)) {
                                                                                        l8Var.o(R.drawable.msg_report, org.telegram.messenger.hd.L0(2131746211), false);
                                                                                    } else {
                                                                                        l8Var.o(R.drawable.msg_block2, org.telegram.messenger.hd.L0(2131746210), false);
                                                                                    }
                                                                                    l8Var.g(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                                                                                } else {
                                                                                    i47 = profileActivity.W3;
                                                                                    if (i7 == i47) {
                                                                                        l8Var.k(org.telegram.messenger.hd.L0(2131746186), false);
                                                                                        int i116 = org.telegram.ui.ActionBar.j6.p7;
                                                                                        l8Var.g(-1, i116);
                                                                                        l8Var.g(-1, i116);
                                                                                    } else {
                                                                                        i48 = profileActivity.h3;
                                                                                        if (i7 == i48) {
                                                                                            l8Var.u(org.telegram.messenger.hd.L0(2131749054), org.telegram.messenger.hd.j0(), false, R.drawable.msg2_language, false);
                                                                                            l8Var.setImageLeft(23);
                                                                                        } else {
                                                                                            i49 = profileActivity.g3;
                                                                                            if (i7 == i49) {
                                                                                                l8Var.o(R.drawable.msg2_notifications, org.telegram.messenger.hd.L0(2131747922), true);
                                                                                            } else {
                                                                                                i50 = profileActivity.i3;
                                                                                                if (i7 == i50) {
                                                                                                    l8Var.o(R.drawable.msg2_secret, org.telegram.messenger.hd.L0(2131746771), true);
                                                                                                } else {
                                                                                                    i51 = profileActivity.j3;
                                                                                                    if (i7 == i51) {
                                                                                                        l8Var.o(R.drawable.msg2_data, org.telegram.messenger.hd.L0(2131751677), true);
                                                                                                    } else {
                                                                                                        i52 = profileActivity.k3;
                                                                                                        if (i7 == i52) {
                                                                                                            l8Var.o(R.drawable.msg2_discussion, org.telegram.messenger.hd.L0(2131752210), true);
                                                                                                        } else {
                                                                                                            i53 = profileActivity.l3;
                                                                                                            if (i7 == i53) {
                                                                                                                l8Var.o(R.drawable.msg2_folder, org.telegram.messenger.hd.L0(2131750696), true);
                                                                                                            } else {
                                                                                                                i54 = profileActivity.n3;
                                                                                                                if (i7 == i54) {
                                                                                                                    l8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.hd.L0(2131744857), true);
                                                                                                                } else {
                                                                                                                    i55 = profileActivity.m3;
                                                                                                                    if (i7 == i55) {
                                                                                                                        l8Var.o(R.drawable.msg2_battery, org.telegram.messenger.hd.L0(2131747066), true);
                                                                                                                    } else {
                                                                                                                        i56 = profileActivity.r3;
                                                                                                                        if (i7 == i56) {
                                                                                                                            l8Var.o(R.drawable.msg2_ask_question, org.telegram.messenger.hd.L0(2131753986), true);
                                                                                                                        } else {
                                                                                                                            i57 = profileActivity.s3;
                                                                                                                            if (i7 == i57) {
                                                                                                                                l8Var.o(R.drawable.msg2_help, org.telegram.messenger.hd.L0(2131744242), true);
                                                                                                                            } else {
                                                                                                                                i58 = profileActivity.t3;
                                                                                                                                if (i7 == i58) {
                                                                                                                                    l8Var.o(R.drawable.msg2_policy, org.telegram.messenger.hd.L0(2131746783), false);
                                                                                                                                } else {
                                                                                                                                    i59 = profileActivity.w3;
                                                                                                                                    if (i7 == i59) {
                                                                                                                                        l8Var.k(org.telegram.messenger.hd.L0(2131751613), true);
                                                                                                                                    } else {
                                                                                                                                        i60 = profileActivity.x3;
                                                                                                                                        if (i7 == i60) {
                                                                                                                                            l8Var.k(org.telegram.messenger.hd.L0(2131751614), true);
                                                                                                                                        } else {
                                                                                                                                            i61 = profileActivity.y3;
                                                                                                                                            if (i7 == i61) {
                                                                                                                                                l8Var.k(org.telegram.messenger.hd.L0(2131751650), profileActivity.z3 != -1);
                                                                                                                                            } else if (i7 == profileActivity.z3) {
                                                                                                                                                l8Var.k("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i62 = profileActivity.o3;
                                                                                                                                                if (i7 == i62) {
                                                                                                                                                    l8Var.o(R.drawable.msg2_devices, org.telegram.messenger.hd.L0(2131751455), true);
                                                                                                                                                } else {
                                                                                                                                                    i63 = profileActivity.P2;
                                                                                                                                                    if (i7 == i63) {
                                                                                                                                                        profileActivity.W.P(86);
                                                                                                                                                        profileActivity.W.L();
                                                                                                                                                        l8Var.p(org.telegram.messenger.hd.L0(2131745516), profileActivity.W, false);
                                                                                                                                                        l8Var.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                                                                                                                                        l8Var.getImageView().setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                                                                                                                                                        l8Var.setImageLeft(12);
                                                                                                                                                        profileActivity.N2 = l8Var;
                                                                                                                                                    } else {
                                                                                                                                                        i64 = profileActivity.b4;
                                                                                                                                                        if (i7 == i64) {
                                                                                                                                                            l8Var.o(R.drawable.msg_groups_create, org.telegram.messenger.hd.L0(2131754372), false);
                                                                                                                                                        } else {
                                                                                                                                                            i65 = profileActivity.d4;
                                                                                                                                                            if (i7 == i65) {
                                                                                                                                                                l8Var.p(org.telegram.messenger.hd.L0(2131744231), new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.y0) ia.f.d().g), true);
                                                                                                                                                                l8Var.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i66 = profileActivity.e4;
                                                                                                                                                                if (i7 == i66) {
                                                                                                                                                                    i77 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                                                                                                                                    di.u8 w10 = di.u8.w(i77);
                                                                                                                                                                    long j35 = w10.p().amount;
                                                                                                                                                                    String L018 = org.telegram.messenger.hd.L0(2131748604);
                                                                                                                                                                    CharSequence charSequence2 = str13;
                                                                                                                                                                    if (w10.e) {
                                                                                                                                                                        charSequence2 = str13;
                                                                                                                                                                        if (j35 > 0) {
                                                                                                                                                                            charSequence2 = di.lb.M0(w10.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    l8Var.t(L018, charSequence2, new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.y0) ia.f.d().i), true);
                                                                                                                                                                    l8Var.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i67 = profileActivity.f4;
                                                                                                                                                                    if (i7 == i67) {
                                                                                                                                                                        i76 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                                                                                                                                                                        di.u8 L = di.u8.L(i76);
                                                                                                                                                                        long j36 = L.p().amount;
                                                                                                                                                                        String L019 = org.telegram.messenger.hd.L0(2131748300);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j36 > 0) {
                                                                                                                                                                                charSequence3 = di.lb.M0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        l8Var.s(L019, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        l8Var.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i68 = profileActivity.g4;
                                                                                                                                                                        if (i7 == i68) {
                                                                                                                                                                            l8Var.o(R.drawable.menu_shop, org.telegram.messenger.hd.L0(2131744252), true);
                                                                                                                                                                            l8Var.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i69 = profileActivity.h4;
                                                                                                                                                                            if (i7 == i69) {
                                                                                                                                                                                l8Var.o(R.drawable.menu_gift, org.telegram.messenger.hd.L0(2131745639), false);
                                                                                                                                                                                l8Var.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i70 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i7 == i70) {
                                                                                                                                                                                    String L020 = org.telegram.messenger.hd.L0(2131753007);
                                                                                                                                                                                    ki.s0 s0Var = profileActivity.t2;
                                                                                                                                                                                    boolean z33 = s0Var != null && s0Var.g();
                                                                                                                                                                                    int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lk);
                                                                                                                                                                                    i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    l8Var.m(L020, z33, R.drawable.filled_access_location, themedColor3, i75 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i71 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i7 == i71) {
                                                                                                                                                                                        String L021 = org.telegram.messenger.hd.L0(2131753009);
                                                                                                                                                                                        ki.r rVar = profileActivity.u2;
                                                                                                                                                                                        l8Var.m(L021, rVar != null && rVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.ok), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i72 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i7 == i72) {
                                                                                                                                                                                            String L022 = org.telegram.messenger.hd.L0(2131753008);
                                                                                                                                                                                            userFull13 = profileActivity.w2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.w2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.jk);
                                                                                                                                                                                                    i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i73 == -1) {
                                                                                                                                                                                                        i74 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i74 == -1) {
                                                                                                                                                                                                            z17 = false;
                                                                                                                                                                                                            l8Var.m(L022, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z17 = true;
                                                                                                                                                                                                    l8Var.m(L022, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                            int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.jk);
                                                                                                                                                                                            i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i73 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z17 = true;
                                                                                                                                                                                            l8Var.m(L022, z16, R.drawable.filled_access_sleeping, themedColor42, z17);
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
                    }
                }
                org.telegram.ui.ActionBar.q6.Y(l8Var.c, org.telegram.ui.ActionBar.j6.I6, profileActivity.A0);
                break;
            case 6:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i93 = profileActivity.O3;
                if (i7 == i93) {
                    i94 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                    SharedPreferences x12 = org.telegram.messenger.np.x1(i94);
                    long j37 = profileActivity.i1;
                    if (j37 == 0) {
                        j26 = profileActivity.e1;
                        if (j26 != 0) {
                            j37 = profileActivity.e1;
                        } else {
                            j27 = profileActivity.f1;
                            j37 = -j27;
                        }
                    }
                    j25 = profileActivity.g1;
                    String v = org.telegram.messenger.at.v(j37, j25, false);
                    boolean z34 = x12.getBoolean("custom_" + v, false);
                    boolean contains = x12.contains("notify2_" + v);
                    int c12 = org.telegram.messenger.k5.c("notify2_", v, x12, 0);
                    int c13 = org.telegram.messenger.k5.c("notifyuntil_", v, x12, 0);
                    if (c12 == 3 && c13 != Integer.MAX_VALUE) {
                        int currentTime = c13 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str11 = z34 ? org.telegram.messenger.hd.L0(2131747918) : org.telegram.messenger.hd.L0(2131747892);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                Y = org.telegram.messenger.hd.Y(2131742865, "WillUnmuteIn", org.telegram.messenger.hd.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                Y = org.telegram.messenger.hd.Y(2131742865, "WillUnmuteIn", org.telegram.messenger.hd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                Y = org.telegram.messenger.hd.Y(2131742865, "WillUnmuteIn", org.telegram.messenger.hd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            } else {
                                z19 = false;
                                str11 = null;
                            }
                            str11 = Y;
                            z19 = false;
                        }
                    } else if (c12 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.C(j37);
                            if (z18 || !z34) {
                                L03 = !z18 ? org.telegram.messenger.hd.L0(2131747892) : org.telegram.messenger.hd.L0(2131747894);
                            } else {
                                L03 = org.telegram.messenger.hd.L0(2131747918);
                            }
                            String str18 = L03;
                            z19 = z18;
                            str11 = str18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        L03 = !z18 ? org.telegram.messenger.hd.L0(2131747892) : org.telegram.messenger.hd.L0(2131747894);
                        String str182 = L03;
                        z19 = z18;
                        str11 = str182;
                    } else {
                        if (c12 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            L03 = !z18 ? org.telegram.messenger.hd.L0(2131747892) : org.telegram.messenger.hd.L0(2131747894);
                            String str1822 = L03;
                            z19 = z18;
                            str11 = str1822;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        L03 = !z18 ? org.telegram.messenger.hd.L0(2131747892) : org.telegram.messenger.hd.L0(2131747894);
                        String str18222 = L03;
                        z19 = z18;
                        str11 = str18222;
                    }
                    if (str11 == null) {
                        str11 = org.telegram.messenger.hd.L0(2131747894);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str11 = String.format(Locale.US, org.telegram.messenger.hd.K0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str11, Integer.valueOf(hashSet.size()));
                    }
                    z20 = profileActivity.p5;
                    h5Var.setAnimationsEnabled(z20);
                    h5Var.b(org.telegram.messenger.hd.L0(2131747924), str11, 0, z19, 0, false, profileActivity.j4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i7));
                break;
            case 8:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i7 - profileActivity.v4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i7 - profileActivity.v4);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str19 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.hd.L0(2131752423);
                            }
                            z26 = true;
                            z27 = true;
                            z25 = false;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.hd.L0(2131752520);
                            }
                            z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z26 = true;
                            z27 = false;
                        } else {
                            z25 = false;
                            z26 = false;
                            z27 = false;
                        }
                        z21 = z25;
                        z22 = z26;
                        z23 = z27;
                        str12 = str19;
                    } else {
                        String str20 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.hd.L0(2131752423);
                            }
                            str12 = str20;
                            z22 = true;
                            z23 = true;
                            z21 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.hd.L0(2131752520);
                            }
                            z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str12 = str20;
                            z22 = true;
                            z23 = false;
                        } else {
                            str12 = str20;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                        }
                    }
                    final TLRPC.User a26 = profileActivity.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                    if (org.telegram.messenger.q10.B(a26)) {
                        org.telegram.messenger.np messagesController8 = profileActivity.getMessagesController();
                        j28 = profileActivity.f1;
                        if (org.telegram.messenger.t3.h(messagesController8.M0(Long.valueOf(j28)))) {
                            z24 = true;
                            final String str21 = str12;
                            final boolean z35 = z22;
                            final boolean z36 = z23;
                            paVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.yv0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i117;
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    ProfileActivity profileActivity2 = iw0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i117 = ((org.telegram.ui.ActionBar.e2) profileActivity2).currentAccount;
                                    long a10 = profileActivity2.a();
                                    e6Var = ((org.telegram.ui.ActionBar.e2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.gy0.b(parentActivity, i117, a10, a26, str21, z35, z36, z21, e6Var);
                                }
                            });
                            paVar.e(a26, i7 != profileActivity.w4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str212 = str12;
                    final boolean z352 = z22;
                    final boolean z362 = z23;
                    paVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.yv0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i117;
                            org.telegram.ui.ActionBar.e6 e6Var;
                            ProfileActivity profileActivity2 = iw0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i117 = ((org.telegram.ui.ActionBar.e2) profileActivity2).currentAccount;
                            long a10 = profileActivity2.a();
                            e6Var = ((org.telegram.ui.ActionBar.e2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.gy0.b(parentActivity, i117, a10, a26, str212, z352, z362, z21, e6Var);
                        }
                    });
                    paVar.e(a26, i7 != profileActivity.w4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                i95 = profileActivity.d3;
                if (i7 != i95) {
                    i96 = profileActivity.b3;
                    if (i7 != i96) {
                        i97 = profileActivity.Z2;
                        if (i7 == i97) {
                            w6Var.setType(2);
                            break;
                        }
                    } else {
                        w6Var.setType(0);
                        break;
                    }
                } else {
                    w6Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.L0(2131753154));
                break;
            case 20:
                String L023 = org.telegram.messenger.hd.L0(2131747924);
                org.telegram.messenger.np messagesController9 = profileActivity.getMessagesController();
                long a10 = profileActivity.a();
                j29 = profileActivity.g1;
                ((org.telegram.ui.Cells.q8) view).f(L023, !messagesController9.q2(a10, j29), false);
                break;
            case 21:
                kg.g1 g1Var = (kg.g1) view;
                userFull15 = profileActivity.w2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.w2;
                    tL_businessLocation = userFull16.business_location;
                }
                g1Var.a(tL_businessLocation, profileActivity.N3 < 0 && !profileActivity.s1);
                break;
            case 22:
                kg.f1 f1Var = (kg.f1) view;
                f1Var.setOnTimezoneSwitchClick(new xv0(this, r9 ? 1 : 0));
                userFull17 = profileActivity.w2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.w2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.P4;
                z29 = profileActivity.Q4;
                if ((profileActivity.N3 >= 0 || profileActivity.s1) && profileActivity.Q3 < 0) {
                    z30 = false;
                }
                f1Var.b(tL_businessWorkHours, z28, z29, z30);
                break;
            case 23:
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                org.telegram.messenger.np messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.w2;
                TLRPC.Chat M03 = messagesController10.M0(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.d6 d6Var = profileActivity.x2;
                e6Var.a(d6Var != null ? d6Var.d : null, M03);
                break;
            case 26:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setLinkTextRippleColor(null);
                i98 = profileActivity.S3;
                if (i7 == i98) {
                    profileActivity.getMessagesController().e2(profileActivity.a());
                    userFull26 = profileActivity.w2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.w2;
                        botVerification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.v2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.v2;
                            botVerification = chatFull16.bot_verification;
                        } else {
                            botVerification = null;
                        }
                    }
                    userFull27 = profileActivity.w2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.w2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.w2;
                            l10 = Long.valueOf(userFull29.bot_manager_id);
                            int i117 = 14;
                            if (profileActivity.j4 < 0 || botVerification != null || l10 != null) {
                                y8Var.setFixedSize(0);
                                org.telegram.messenger.np messagesController11 = profileActivity.getMessagesController();
                                j31 = profileActivity.e1;
                                TLRPC.User a27 = messagesController11.a2(Long.valueOf(j31));
                                boolean z37 = a27 == null && a27.bot && a27.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.j4 >= 0) {
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.L0(z37 ? 2131746705 : 2131746707), new org.telegram.ui.Components.fp0(i117, this, z37)));
                                    if (botVerification != null || l10 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.p5(botVerification.icon, y8Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(org.telegram.messenger.gj.h0(botVerification.description, false));
                                    try {
                                        org.telegram.messenger.g0.c(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i106 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i106];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new aw0(this, url, url), spanStart, spanEnd, 33);
                                            i106++;
                                        }
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.f(e11);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l10 != null && (a23 = profileActivity.getMessagesController().a2(l10)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.eq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.Z(2131746709, org.telegram.messenger.q10.n(a23)), org.telegram.ui.ActionBar.j6.Xc, profileActivity.A0, new mp0(22, this, l10)));
                                }
                                y8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.B6))));
                                y8Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                y8Var.setFixedSize(14);
                                y8Var.setText(null);
                                break;
                            }
                        }
                    }
                    l10 = null;
                    int i1172 = 14;
                    if (profileActivity.j4 < 0) {
                    }
                    y8Var.setFixedSize(0);
                    org.telegram.messenger.np messagesController112 = profileActivity.getMessagesController();
                    j31 = profileActivity.e1;
                    TLRPC.User a272 = messagesController112.a2(Long.valueOf(j31));
                    if (a272 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.j4 >= 0) {
                    }
                    if (botVerification == null) {
                    }
                    y8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.B6))));
                    y8Var.setText(spannableStringBuilder42);
                } else {
                    i99 = profileActivity.U3;
                    if (i7 == i99) {
                        org.telegram.messenger.np messagesController12 = profileActivity.getMessagesController();
                        j30 = profileActivity.e1;
                        TLRPC.User a28 = messagesController12.a2(Long.valueOf(j30));
                        if (a28 != null && a28.bot && a28.bot_can_edit) {
                            y8Var.setFixedSize(0);
                            String p10 = org.telegram.messenger.q10.p(a28);
                            userFull23 = profileActivity.w2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.w2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.w2;
                                    i101 = userFull25.starref_program.commission_permille;
                                    y8Var.setText(org.telegram.messenger.hd.Z(2131746712, p10, ki.k.J0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            y8Var.setText(org.telegram.messenger.hd.Z(2131746712, p10, ki.k.J0(i101)));
                        } else {
                            y8Var.setFixedSize(0);
                            String p11 = org.telegram.messenger.q10.p(a28);
                            userFull20 = profileActivity.w2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.w2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.w2;
                                    i100 = userFull22.starref_program.commission_permille;
                                    y8Var.setText(org.telegram.messenger.hd.Z(2131746713, p11, ki.k.J0(i100)));
                                    break;
                                }
                            }
                            i100 = 0;
                            y8Var.setText(org.telegram.messenger.hd.Z(2131746713, p11, ki.k.J0(i100)));
                        }
                    }
                }
                break;
            case 27:
                ki.h hVar = (ki.h) view;
                hVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lk), R.drawable.filled_affiliate, org.telegram.messenger.hd.L0(2131746714), null);
                userFull31 = profileActivity.w2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.w2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.w2;
                        str14 = ki.k.J0(userFull33.starref_program.commission_permille);
                    }
                }
                hVar.setPercent(str14);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                i102 = profileActivity.k4;
                if (i7 == i102) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.round_warn);
                    eqVar.e(org.telegram.messenger.g0.L(1.0f));
                    eqVar.y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, profileActivity.A0);
                    profileActivity.V6 = eqVar;
                    spannableStringBuilder5.setSpan(eqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    org.telegram.messenger.np messagesController13 = profileActivity.getMessagesController();
                    j32 = profileActivity.e1;
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.hd.Z(2131746621, org.telegram.messenger.q10.k(messagesController13.a2(Long.valueOf(j32)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                mi.c cVar = (mi.c) view;
                chat11 = profileActivity.F2;
                if (chat11 == null) {
                    j33 = profileActivity.e1;
                    if (j33 != 0) {
                        org.telegram.messenger.np messagesController14 = profileActivity.getMessagesController();
                        j34 = profileActivity.e1;
                        TLRPC.User a29 = messagesController14.a2(Long.valueOf(j34));
                        if (a29 != null) {
                            i103 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                            cVar.a(i103, profileActivity.getMessagesController().M0(Long.valueOf(a29.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i104 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                    org.telegram.messenger.np messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.F2;
                    cVar.a(i104, messagesController15.M0(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View paVar;
        View view;
        boolean z11 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i7) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case org.telegram.messenger.ns.T /* 30 */:
                org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
                if (i7 == 30) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                cw0 cw0Var = new cw0(this, this.c, e6Var, z11, i7 == 19 ? true : z10);
                cw0Var.setContentDescriptionValueFirst(true);
                paVar = cw0Var;
                break;
            case 3:
                dw0 dw0Var = new dw0(this, context, profileActivity, profileActivity.A0);
                profileActivity.h6 = dw0Var;
                paVar = dw0Var;
                break;
            case 4:
                paVar = new nr(this, context, profileActivity.A0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.A0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new ew0(this, context, profileActivity.A0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 8:
                paVar = new org.telegram.ui.Cells.pa(profileActivity.x4 == -1 ? 9 : 6, 0, this.c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(10, context, profileActivity.A0);
                y8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.A6, profileActivity.A0);
                y8Var.getTextView().setMovementMethod(null);
                y8Var.setText(org.telegram.messenger.g0.D0());
                y8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = y8Var;
                break;
            case 11:
            case org.telegram.messenger.ns.U /* 31 */:
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(i7 == 31 ? 12.0f : 6.0f), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                View fw0Var = new fw0(this, context);
                fw0Var.setBackground(new ColorDrawable(0));
                fw0Var.setTag(-33024);
                view = fw0Var;
                paVar = view;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view2 = profileActivity.O;
                view2.setTag(-33024);
                view = view2;
                paVar = view;
                break;
            case 15:
                paVar = new hw0(this, context, profileActivity.A0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View m1Var = new ug.m1(i7 == 18 ? 0 : 1, context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, m1Var, profileActivity.A0);
                paVar = m1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.q8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View g1Var = new kg.g1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, g1Var, profileActivity.A0);
                paVar = g1Var;
                break;
            case 22:
                View gw0Var = new gw0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, gw0Var, profileActivity.A0);
                paVar = gw0Var;
                break;
            case 23:
                paVar = new zv0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                hi.d dVar = new hi.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.hd.M0(2131746708, null), false, true);
                dVar.setOnClickListener(new xv0(this, false ? 1 : 0));
                frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, frameLayout, profileActivity.A0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 27:
                paVar = new ki.h(context, profileActivity.A0);
                break;
            case 28:
                View bnVar = new org.telegram.ui.Components.bn(context, 21);
                bnVar.setTag(-33024);
                view = bnVar;
                paVar = view;
                break;
            case 32:
                paVar = new uw0(profileActivity, context);
                break;
            case 33:
                paVar = new mi.c(context, profileActivity.A0);
                break;
        }
        if (i7 != 13) {
            paVar.setLayoutParams(new v4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.cj0(paVar);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        View view = e1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            ((org.telegram.ui.Cells.w8) view).a.setLoading(profileActivity.m5);
            ((org.telegram.ui.Cells.w8) view).b.setLoading(profileActivity.m5);
        }
    }

    @Override // v4.h0
    public final void z(v4.e1 e1Var) {
        View view = e1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
