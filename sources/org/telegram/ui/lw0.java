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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lw0 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public lw0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b10 = f1Var.b();
            if (b10 != profileActivity.g3 && b10 != profileActivity.U2 && b10 != profileActivity.i3 && b10 != profileActivity.h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.j3 && b10 != profileActivity.k3 && b10 != profileActivity.r3 && b10 != profileActivity.o3 && b10 != profileActivity.l3 && b10 != profileActivity.n3 && b10 != profileActivity.s3 && b10 != profileActivity.t3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.y3 && b10 != profileActivity.z3 && b10 != profileActivity.P2 && b10 != profileActivity.d4 && b10 != profileActivity.f4 && b10 != profileActivity.j4 && b10 != profileActivity.i4 && b10 != profileActivity.m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.g4 && b10 != profileActivity.h4 && b10 != profileActivity.o4) {
                return false;
            }
        } else {
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.ra) {
                Object currentObject = ((org.telegram.ui.Cells.ra) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.o10.C((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = f1Var.f;
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
                    SpannableString spannableString = new SpannableString(p5.c.k("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        dw0 dw0Var = new dw0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, dw0Var);
                        clickableSpan = dw0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.Xc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i10 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = org.telegram.messenger.gd.M0(2131743431, null);
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

    @Override // v4.i0
    public final int b() {
        return this.e.O2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e;
        if (i7 == profileActivity.E3 || i7 == profileActivity.w4 || i7 == profileActivity.f3 || i7 == profileActivity.T2 || i7 == profileActivity.q3 || i7 == profileActivity.v3 || i7 == profileActivity.q4) {
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
        if (i7 == profileActivity.t4 || i7 == profileActivity.u4 || i7 == profileActivity.W3 || i7 == profileActivity.Y3 || i7 == profileActivity.X3 || i7 == profileActivity.A4 || i7 == profileActivity.B4 || i7 == profileActivity.C4 || i7 == profileActivity.D4 || i7 == profileActivity.J4 || i7 == profileActivity.z4 || i7 == profileActivity.P4 || i7 == profileActivity.O4 || i7 == profileActivity.V3 || i7 == profileActivity.g3 || i7 == profileActivity.i3 || i7 == profileActivity.h3 || i7 == profileActivity.j3 || i7 == profileActivity.k3 || i7 == profileActivity.r3 || i7 == profileActivity.o3 || i7 == profileActivity.l3 || i7 == profileActivity.n3 || i7 == profileActivity.s3 || i7 == profileActivity.t3 || i7 == profileActivity.w3 || i7 == profileActivity.x3 || i7 == profileActivity.y3 || i7 == profileActivity.z3 || i7 == profileActivity.P2 || i7 == profileActivity.d4 || i7 == profileActivity.b4 || i7 == profileActivity.a4 || i7 == profileActivity.m3 || i7 == profileActivity.j4 || i7 == profileActivity.i4 || i7 == profileActivity.E4 || i7 == profileActivity.F4 || i7 == profileActivity.G4) {
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
        if (i7 == i12 || i7 == profileActivity.h4) {
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
        if (i7 == profileActivity.Q4 || i7 == profileActivity.K4 || i7 == profileActivity.p4 || i7 == profileActivity.v4 || i7 == profileActivity.e3 || i7 == profileActivity.p3 || i7 == profileActivity.u3 || i7 == profileActivity.Q2 || i7 == profileActivity.c3 || i7 == profileActivity.Y2 || i7 == profileActivity.k4 || i7 == profileActivity.Z3 || i7 == profileActivity.c4 || i7 == profileActivity.S2 || i7 == profileActivity.a3 || i7 == profileActivity.I4 || i7 == profileActivity.s4 || i7 == profileActivity.H4 || i7 == profileActivity.n4) {
            return 7;
        }
        if (i7 >= profileActivity.x4 && i7 < profileActivity.y4) {
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
        if (i7 == profileActivity.N4) {
            return 13;
        }
        if (i7 == profileActivity.A3) {
            return 14;
        }
        if (i7 == profileActivity.d3 || i7 == profileActivity.b3 || i7 == profileActivity.Z2) {
            return 15;
        }
        if (i7 == profileActivity.e4) {
            return 17;
        }
        if (i7 == profileActivity.f4) {
            return 18;
        }
        if (i7 == profileActivity.g4) {
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
        if (i7 == profileActivity.l4) {
            return 25;
        }
        if (i7 == profileActivity.S3 || i7 == profileActivity.U3) {
            return 26;
        }
        if (i7 == profileActivity.m4) {
            return 32;
        }
        if (i7 == profileActivity.o4) {
            return 33;
        }
        if (i7 == profileActivity.T3) {
            return 27;
        }
        return (i7 == profileActivity.F3 || i7 == profileActivity.G3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:607:0x0f86, code lost:
    
        if (r0.about != null) goto L604;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0f2a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0292  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
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
        String str8;
        long j17;
        int i26;
        CharSequence h02;
        long j18;
        String L02;
        String str9;
        boolean z12;
        TLRPC.UserFull userFull;
        long j19;
        int i27;
        int i28;
        int i29;
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
        TLRPC.User c22;
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
        org.telegram.messenger.xs notificationsController;
        boolean z20;
        long j26;
        long j27;
        final String str12;
        final boolean z21;
        final boolean z22;
        final boolean z23;
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
        TL_bots.BotVerification botVerification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l10;
        TLRPC.UserFull userFull28;
        TLRPC.PeerSettings peerSettings;
        CharSequence charSequence2;
        TLRPC.User user;
        TLRPC.User c23;
        long j31;
        SpannableStringBuilder spannableStringBuilder;
        int i103;
        org.telegram.ui.Cells.a9 a9Var;
        TLRPC.User c24;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        TLRPC.UserFull userFull34;
        TLRPC.UserFull userFull35;
        int i104;
        long j32;
        TLRPC.Chat chat11;
        long j33;
        long j34;
        int i105;
        int i106;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.U4;
        ArrayList arrayList2 = profileActivity.V4;
        HashSet hashSet = profileActivity.n5;
        int i107 = f1Var.f;
        View view = f1Var.a;
        String str13 = "";
        String str14 = null;
        r12 = null;
        String str15 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        final int i108 = 0;
        switch (i107) {
            case 1:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                i10 = profileActivity.E3;
                if (i7 == i10) {
                    chat = profileActivity.F2;
                    if (org.telegram.messenger.v3.T(chat)) {
                        chat2 = profileActivity.F2;
                        if (!chat2.megagroup && profileActivity.L3 != -1) {
                            o4Var.setText(org.telegram.messenger.gd.L0(2131746033));
                        }
                    }
                    o4Var.setText(org.telegram.messenger.gd.L0(2131749005));
                } else {
                    i11 = profileActivity.w4;
                    if (i7 == i11) {
                        o4Var.setText(org.telegram.messenger.gd.L0(2131752366));
                    } else {
                        i12 = profileActivity.f3;
                        if (i7 == i12) {
                            o4Var.setText(org.telegram.messenger.gd.L0(2131745788));
                        } else {
                            i13 = profileActivity.T2;
                            if (i7 == i13) {
                                o4Var.setText(org.telegram.messenger.gd.L0(2131754710));
                            } else {
                                i14 = profileActivity.q3;
                                if (i7 == i14) {
                                    o4Var.setText(org.telegram.messenger.gd.L0(2131745284));
                                } else {
                                    i15 = profileActivity.v3;
                                    if (i7 == i15) {
                                        o4Var.setText(org.telegram.messenger.gd.L0(2131745291));
                                    } else {
                                        i16 = profileActivity.q4;
                                        if (i7 == i16) {
                                            o4Var.setText(org.telegram.messenger.gd.L0(2131752995));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                o4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.L6));
                break;
            case 2:
            case 19:
            case org.telegram.messenger.ks.T /* 30 */:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == profileActivity.V2) {
                    org.telegram.messenger.mp messagesController = profileActivity.getMessagesController();
                    j19 = profileActivity.e1;
                    TLRPC.UserFull d2 = messagesController.d2(j19);
                    if (d2 != null && d2.birthday != null) {
                        boolean d = org.telegram.messenger.v1.d(d2);
                        TL_account.TL_birthday tL_birthday = d2.birthday;
                        boolean z30 = (tL_birthday.flags & 1) != 0;
                        int years = z30 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String e02 = UserInfoActivity.e0(d2.birthday);
                        y8Var.c(org.telegram.messenger.j6.p(z30 ? org.telegram.messenger.gd.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", e02) : org.telegram.messenger.gd.Z(d ? 2131746528 : 2131746525, e02), y8Var.a, new org.telegram.ui.Components.h01(this, f1Var, i7, 13)), org.telegram.messenger.gd.L0(d ? 2131746529 : 2131746531), (!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().k7) {
                            i27 = 1;
                            z10 = false;
                            i108 = i27;
                        }
                    }
                    i27 = 0;
                    z10 = false;
                    i108 = i27;
                } else {
                    i17 = profileActivity.H3;
                    if (i7 == i17) {
                        org.telegram.messenger.mp messagesController2 = profileActivity.getMessagesController();
                        j18 = profileActivity.e1;
                        TLRPC.User c25 = messagesController2.c2(Long.valueOf(j18));
                        if (c25 != null && !TextUtils.isEmpty(profileActivity.i5)) {
                            L02 = org.telegram.messenger.n10.h(new StringBuilder("+"), profileActivity.i5, pf.b.c());
                            str9 = profileActivity.i5;
                        } else if (c25 == null || TextUtils.isEmpty(c25.phone)) {
                            L02 = org.telegram.messenger.gd.L0(2131747101);
                            str9 = null;
                        } else {
                            String h = org.telegram.messenger.n10.h(new StringBuilder("+"), c25.phone, pf.b.c());
                            str9 = c25.phone;
                            L02 = h;
                        }
                        profileActivity.g5 = str9 != null && str9.matches("888\\d{8}");
                        z12 = profileActivity.g5;
                        y8Var.c(L02, org.telegram.messenger.gd.L0(z12 ? 2131754249 : 2131747098), false);
                    } else {
                        i18 = profileActivity.I3;
                        if (i7 == i18) {
                            org.telegram.messenger.mp messagesController3 = profileActivity.getMessagesController();
                            j17 = profileActivity.e1;
                            TLRPC.UserFull d22 = messagesController3.d2(j17);
                            if (d22 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = d22.note;
                                i26 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                if (org.telegram.messenger.j10.i(i26).q()) {
                                    h02 = org.telegram.messenger.fj.h0(tL_textWithEntities, false);
                                    if (!(h02 instanceof SpannableStringBuilder)) {
                                        h02 = new SpannableStringBuilder(h02);
                                    }
                                    org.telegram.messenger.g0.c((SpannableStringBuilder) h02, 1, false, false);
                                } else {
                                    h02 = org.telegram.messenger.fj.h0(org.telegram.messenger.fj.x5(tL_textWithEntities), false);
                                }
                                y8Var.d(h02, org.telegram.messenger.gd.L0(2131746455), org.telegram.messenger.gd.L0(2131746454));
                            }
                        } else {
                            i19 = profileActivity.M3;
                            if (i7 == i19) {
                                ArrayList arrayList3 = new ArrayList();
                                j3 = profileActivity.e1;
                                if (j3 != 0) {
                                    org.telegram.messenger.mp messagesController4 = profileActivity.getMessagesController();
                                    j16 = profileActivity.e1;
                                    TLRPC.User c26 = messagesController4.c2(Long.valueOf(j16));
                                    if (c26 != null) {
                                        arrayList3.addAll(c26.usernames);
                                    }
                                    if (c26 == null || TextUtils.isEmpty(c26.username)) {
                                        tL_username = null;
                                        str7 = null;
                                    } else {
                                        tL_username = org.telegram.messenger.n5.b(c26.username, arrayList3);
                                        str7 = c26.username;
                                    }
                                    ArrayList arrayList4 = c26 == null ? new ArrayList() : new ArrayList(c26.usernames);
                                    if (TextUtils.isEmpty(str7)) {
                                        int i109 = 0;
                                        while (true) {
                                            if (i109 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i109);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i109++;
                                                } else {
                                                    str7 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String L03 = org.telegram.messenger.gd.L0(2131743437);
                                    if (str7 != null) {
                                        String concat = "@".concat(str7);
                                        if (tL_username == null || tL_username.editable) {
                                            str8 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                dw0 dw0Var = new dw0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, dw0Var);
                                                clickableSpan = dw0Var;
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
                                    str4 = L03;
                                } else {
                                    chat3 = profileActivity.F2;
                                    if (chat3 != null) {
                                        org.telegram.messenger.mp messagesController5 = profileActivity.getMessagesController();
                                        j10 = profileActivity.f1;
                                        TLRPC.Chat O0 = messagesController5.O0(Long.valueOf(j10));
                                        String K = org.telegram.messenger.v3.K(O0, false);
                                        if (O0 != null) {
                                            arrayList3.addAll(O0.usernames);
                                        }
                                        if (org.telegram.messenger.v3.t0(O0)) {
                                            z11 = !profileActivity.s1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().X2);
                                            sb2.append("/");
                                            sb2.append(K);
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
                                            str4 = org.telegram.messenger.gd.L0(2131748957);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().X2);
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
                                            str4 = org.telegram.messenger.gd.L0(2131748953);
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
                                y8Var.c(str3, E, i25 == -1 && !(!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) && profileActivity.V2 < 0);
                            } else {
                                i20 = profileActivity.J3;
                                if (i7 == i20) {
                                    chatFull = profileActivity.v2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.v2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.v2;
                                            y8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, org.telegram.messenger.gd.L0(2131753959), false);
                                        }
                                    }
                                } else {
                                    i21 = profileActivity.U2;
                                    if (i7 == i21) {
                                        i24 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                        TLRPC.User f10 = org.telegram.messenger.j10.i(i24).f();
                                        y8Var.c((f10 == null || (str2 = f10.phone) == null || str2.length() == 0) ? org.telegram.messenger.gd.L0(2131747639) : org.telegram.messenger.n10.h(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.gd.L0(2131744025), true);
                                        y8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i22 = profileActivity.W2;
                                        if (i7 == i22) {
                                            i23 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                            TLRPC.User f11 = org.telegram.messenger.j10.i(i23).f();
                                            String L04 = org.telegram.messenger.gd.L0(2131743437);
                                            if (f11 == null || f11.usernames.size() <= 0) {
                                                String o4 = org.telegram.messenger.o10.o(f11);
                                                if (f11 == null || TextUtils.isEmpty(o4)) {
                                                    L0 = org.telegram.messenger.gd.L0(2131743424);
                                                    charSequence = L04;
                                                } else {
                                                    L0 = p5.c.k("@", o4);
                                                    charSequence = L04;
                                                }
                                            } else {
                                                int i110 = 0;
                                                while (true) {
                                                    if (i110 < f11.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = f11.usernames.get(i110);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i110++;
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
                                                L0 = (str == null || TextUtils.isEmpty(str)) ? org.telegram.messenger.gd.L0(2131743424) : "@".concat(str);
                                                charSequence = E(str, f11.usernames, L04);
                                            }
                                            y8Var.c(L0, charSequence, true);
                                            y8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (i108 != 0) {
                    Drawable d10 = f0.d.d(y8Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.V6);
                    RectF rectF = ProfileActivity.Z6;
                    d10.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.U6 = d10;
                    userFull = profileActivity.w2;
                    if (org.telegram.messenger.o10.c(userFull)) {
                        y8Var.setImage(null);
                        y8Var.setImageClickListener(null);
                    } else {
                        y8Var.b(d10, org.telegram.messenger.gd.L0(2131749508));
                        y8Var.setImageClickListener(new au0(profileActivity, 12));
                    }
                } else if (z10) {
                    Drawable d11 = f0.d.d(y8Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.v8);
                    RectF rectF2 = ProfileActivity.Z6;
                    d11.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.V6 = d11;
                    y8Var.b(d11, org.telegram.messenger.gd.L0(2131750456));
                    y8Var.setImageClickListener(new au0(profileActivity, 13));
                } else {
                    y8Var.setImage(null);
                    y8Var.setImageClickListener(null);
                }
                y8Var.setTag(Integer.valueOf(i7));
                y8Var.a.setLoading(profileActivity.o5);
                y8Var.b.setLoading(profileActivity.o5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i28 = profileActivity.K3;
                if (i7 == i28) {
                    userFull8 = profileActivity.w2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.w2;
                        c22 = userFull12.user;
                    } else {
                        org.telegram.messenger.mp messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.w2;
                        c22 = messagesController6.c2(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.s2;
                    if (!z14) {
                        if (c22 != null && c22.premium) {
                            userFull11 = profileActivity.w2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.w2;
                        jVar.f(userFull10.about, org.telegram.messenger.gd.L0(2131743528), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.w2;
                    jVar.f(userFull10.about, org.telegram.messenger.gd.L0(2131743528), z15);
                } else if (i7 == profileActivity.L3) {
                    chatFull4 = profileActivity.v2;
                    String str18 = chatFull4.about;
                    while (str18.contains("\n\n\n")) {
                        str18 = str18.replace("\n\n\n", "\n\n");
                    }
                    String L05 = org.telegram.messenger.gd.L0(2131751448);
                    chat4 = profileActivity.F2;
                    if (org.telegram.messenger.v3.T(chat4)) {
                        chat5 = profileActivity.F2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            jVar.f(str18, L05, z13);
                            break;
                        }
                    }
                    z13 = false;
                    jVar.f(str18, L05, z13);
                } else {
                    i29 = profileActivity.X2;
                    if (i7 == i29) {
                        userFull2 = profileActivity.w2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.w2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(org.telegram.messenger.gd.L0(2131743528), org.telegram.messenger.gd.L0(2131743527), false);
                                profileActivity.A2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.w2;
                        if (userFull3 == null) {
                            str10 = org.telegram.messenger.gd.L0(2131748587);
                        } else {
                            userFull4 = profileActivity.w2;
                            str10 = userFull4.about;
                        }
                        jVar.f(str10, org.telegram.messenger.gd.L0(2131743528), profileActivity.getUserConfig().q());
                        userFull5 = profileActivity.w2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.w2;
                            str11 = userFull6.about;
                        } else {
                            str11 = null;
                        }
                        profileActivity.A2 = str11;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                int i111 = org.telegram.ui.ActionBar.n6.m6;
                int i112 = org.telegram.ui.ActionBar.n6.G6;
                n8Var.g(i111, i112);
                n8Var.setTag(Integer.valueOf(i112));
                i30 = profileActivity.t4;
                if (i7 == i30) {
                    int i113 = profileActivity.getMessagesController().c1(Integer.valueOf(org.telegram.messenger.n5.h(profileActivity.i1))).ttl;
                    n8Var.q(org.telegram.messenger.gd.L0(2131748395), i113 == 0 ? org.telegram.messenger.gd.L0(2131745166) : org.telegram.messenger.gd.c0(i113), false, false);
                } else {
                    i31 = profileActivity.O4;
                    if (i7 == i31) {
                        n8Var.k(org.telegram.messenger.gd.L0(2131743674), false);
                        n8Var.g(-1, org.telegram.ui.ActionBar.n6.p7);
                    } else {
                        i32 = profileActivity.u4;
                        if (i7 == i32) {
                            org.telegram.ui.Components.o30 o30Var = new org.telegram.ui.Components.o30();
                            TLRPC.EncryptedChat c12 = profileActivity.getMessagesController().c1(Integer.valueOf(org.telegram.messenger.n5.h(profileActivity.i1)));
                            byte[] bArr = c12.key_hash;
                            o30Var.a = bArr;
                            if (bArr == null) {
                                byte[] bArr2 = c12.auth_key;
                                Typeface typeface = org.telegram.messenger.g0.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                                o30Var.a = bArr3;
                                c12.key_hash = bArr3;
                            }
                            o30Var.invalidateSelf();
                            n8Var.v(org.telegram.messenger.gd.L0(2131751121), o30Var, false);
                        } else {
                            i33 = profileActivity.P4;
                            if (i7 == i33) {
                                n8Var.g(-1, org.telegram.ui.ActionBar.n6.o6);
                                chat10 = profileActivity.F2;
                                if (chat10.megagroup) {
                                    n8Var.k(org.telegram.messenger.gd.L0(2131746466), false);
                                } else {
                                    n8Var.k(org.telegram.messenger.gd.L0(2131746467), false);
                                }
                            } else {
                                i34 = profileActivity.A4;
                                if (i7 == i34) {
                                    chatFull12 = profileActivity.v2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.F2;
                                        if (org.telegram.messenger.v3.T(chat8)) {
                                            chat9 = profileActivity.F2;
                                            if (!chat9.megagroup) {
                                                String L06 = org.telegram.messenger.gd.L0(2131752278);
                                                chatFull14 = profileActivity.v2;
                                                String E2 = org.telegram.messenger.gd.E(chatFull14.participants_count, ',');
                                                i93 = profileActivity.K4;
                                                n8Var.s(L06, E2, R.drawable.msg_groups, i7 != i93 + (-1));
                                            }
                                        }
                                        String L07 = org.telegram.messenger.gd.L0(2131752366);
                                        chatFull13 = profileActivity.v2;
                                        String E3 = org.telegram.messenger.gd.E(chatFull13.participants_count, ',');
                                        i92 = profileActivity.K4;
                                        n8Var.s(L07, E3, R.drawable.msg_groups, i7 != i92 + (-1));
                                    } else {
                                        chat6 = profileActivity.F2;
                                        if (org.telegram.messenger.v3.T(chat6)) {
                                            chat7 = profileActivity.F2;
                                            if (!chat7.megagroup) {
                                                String L08 = org.telegram.messenger.gd.L0(2131752278);
                                                i91 = profileActivity.K4;
                                                n8Var.o(R.drawable.msg_groups, L08, i7 != i91 + (-1));
                                            }
                                        }
                                        String L09 = org.telegram.messenger.gd.L0(2131752366);
                                        i90 = profileActivity.K4;
                                        n8Var.o(R.drawable.msg_groups, L09, i7 != i90 + (-1));
                                    }
                                } else {
                                    i35 = profileActivity.B4;
                                    if (i7 == i35) {
                                        chatFull10 = profileActivity.v2;
                                        if (chatFull10 != null) {
                                            String L010 = org.telegram.messenger.gd.L0(2131744201);
                                            chatFull11 = profileActivity.v2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            i89 = profileActivity.K4;
                                            n8Var.s(L010, format, R.drawable.msg_requests, i7 != i89 - 1);
                                        }
                                    } else {
                                        i36 = profileActivity.C4;
                                        if (i7 == i36) {
                                            chatFull8 = profileActivity.v2;
                                            if (chatFull8 != null) {
                                                String L011 = org.telegram.messenger.gd.L0(2131752506);
                                                chatFull9 = profileActivity.v2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                i88 = profileActivity.K4;
                                                n8Var.s(L011, format2, R.drawable.msg_admins, i7 != i88 - 1);
                                            } else {
                                                String L012 = org.telegram.messenger.gd.L0(2131752506);
                                                i87 = profileActivity.K4;
                                                n8Var.o(R.drawable.msg_admins, L012, i7 != i87 - 1);
                                            }
                                        } else {
                                            i37 = profileActivity.D4;
                                            if (i7 == i37) {
                                                String L013 = org.telegram.messenger.gd.L0(2131752508);
                                                i86 = profileActivity.K4;
                                                n8Var.o(R.drawable.msg_customize, L013, i7 != i86 - 1);
                                            } else {
                                                i38 = profileActivity.G4;
                                                if (i7 == i38) {
                                                    i84 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                    di.e0 g10 = di.e0.g(i84);
                                                    j23 = profileActivity.f1;
                                                    TL_stars.StarsAmount c10 = g10.c(-j23);
                                                    i85 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                    di.e0 g11 = di.e0.g(i85);
                                                    j24 = profileActivity.f1;
                                                    long i114 = g11.i(-j24);
                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                    if (i114 > 0) {
                                                        double d12 = i114 / 1.0E9d;
                                                        if (d12 > 1000.0d) {
                                                            spannableStringBuilder2.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d12, 0));
                                                        } else {
                                                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                                            decimalFormatSymbols.setDecimalSeparator('.');
                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                                            decimalFormat.setMinimumFractionDigits(2);
                                                            decimalFormat.setMaximumFractionDigits(3);
                                                            decimalFormat.setGroupingUsed(false);
                                                            spannableStringBuilder2.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d12));
                                                        }
                                                    }
                                                    if (c10.amount > 0) {
                                                        if (spannableStringBuilder2.length() > 0) {
                                                            spannableStringBuilder2.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) di.pb.N0(c10, 0.777f, ' '));
                                                    }
                                                    n8Var.s(org.telegram.messenger.gd.L0(2131752279), xd.K(di.pb.b1(false, spannableStringBuilder2, 0.7f, null), n8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i39 = profileActivity.E4;
                                                    if (i7 == i39) {
                                                        i83 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                        di.e0 g12 = di.e0.g(i83);
                                                        j22 = profileActivity.e1;
                                                        TL_stars.StarsAmount c11 = g12.c(j22);
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                        if (c11.amount > 0) {
                                                            spannableStringBuilder3.append((CharSequence) "XTR ").append((CharSequence) di.pb.N0(c11, 0.777f, ' '));
                                                        }
                                                        n8Var.s(org.telegram.messenger.gd.L0(2131753109), xd.K(di.pb.b1(false, spannableStringBuilder3, 0.7f, null), n8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i40 = profileActivity.F4;
                                                        if (i7 == i40) {
                                                            i82 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                            di.e0 g13 = di.e0.g(i82);
                                                            j21 = profileActivity.e1;
                                                            long i115 = g13.i(j21);
                                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                                            if (i115 > 0) {
                                                                double d13 = i115 / 1.0E9d;
                                                                if (d13 > 1000.0d) {
                                                                    spannableStringBuilder4.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d13, 0));
                                                                } else {
                                                                    DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                                                                    decimalFormatSymbols2.setDecimalSeparator('.');
                                                                    DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                                                                    decimalFormat2.setMinimumFractionDigits(2);
                                                                    decimalFormat2.setMaximumFractionDigits(3);
                                                                    decimalFormat2.setGroupingUsed(false);
                                                                    spannableStringBuilder4.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d13));
                                                                }
                                                            }
                                                            n8Var.s(org.telegram.messenger.gd.L0(2131753108), xd.K(di.pb.b1(false, spannableStringBuilder4, 0.7f, null), n8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i41 = profileActivity.J4;
                                                            if (i7 == i41) {
                                                                chatFull5 = profileActivity.v2;
                                                                if (chatFull5 != null) {
                                                                    String L014 = org.telegram.messenger.gd.L0(2131752442);
                                                                    chatFull6 = profileActivity.v2;
                                                                    int i116 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.v2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i116, chatFull7.kicked_count)));
                                                                    i81 = profileActivity.K4;
                                                                    n8Var.s(L014, format3, R.drawable.msg_user_remove, i7 != i81 - 1);
                                                                } else {
                                                                    String L015 = org.telegram.messenger.gd.L0(2131752442);
                                                                    i80 = profileActivity.K4;
                                                                    n8Var.o(R.drawable.msg_user_remove, L015, i7 != i80 - 1);
                                                                }
                                                            } else {
                                                                i42 = profileActivity.z4;
                                                                if (i7 == i42) {
                                                                    n8Var.g(i111, i112);
                                                                    int i117 = i7 + 1;
                                                                    boolean z31 = i117 >= profileActivity.x4 && i117 < profileActivity.y4;
                                                                    String L016 = org.telegram.messenger.gd.L0(2131754399);
                                                                    i79 = profileActivity.K4;
                                                                    n8Var.o(R.drawable.msg_contact_add, L016, i79 == -1 || z31);
                                                                } else {
                                                                    i43 = profileActivity.V3;
                                                                    if (i7 == i43) {
                                                                        n8Var.k(org.telegram.messenger.gd.L0(2131745404), true);
                                                                    } else {
                                                                        i44 = profileActivity.a4;
                                                                        if (i7 == i44) {
                                                                            n8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.L0(2131754375), false);
                                                                            n8Var.g(i111, i112);
                                                                        } else {
                                                                            i45 = profileActivity.X3;
                                                                            if (i7 == i45) {
                                                                                n8Var.o(R.drawable.menu_reaction_delete_24, org.telegram.messenger.gd.L0(2131751496), false);
                                                                                n8Var.g(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
                                                                            } else {
                                                                                i46 = profileActivity.Y3;
                                                                                if (i7 == i46) {
                                                                                    org.telegram.messenger.mp messagesController7 = profileActivity.getMessagesController();
                                                                                    j20 = profileActivity.f5;
                                                                                    TLRPC.Chat O02 = messagesController7.O0(Long.valueOf(-j20));
                                                                                    if (O02 == null || !org.telegram.messenger.v3.w(2, O02)) {
                                                                                        n8Var.o(R.drawable.msg_report, org.telegram.messenger.gd.L0(2131746016), false);
                                                                                    } else {
                                                                                        n8Var.o(R.drawable.msg_block2, org.telegram.messenger.gd.L0(2131746015), false);
                                                                                    }
                                                                                    n8Var.g(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
                                                                                } else {
                                                                                    i47 = profileActivity.W3;
                                                                                    if (i7 == i47) {
                                                                                        n8Var.k(org.telegram.messenger.gd.L0(2131745991), false);
                                                                                        int i118 = org.telegram.ui.ActionBar.n6.p7;
                                                                                        n8Var.g(-1, i118);
                                                                                        n8Var.g(-1, i118);
                                                                                    } else {
                                                                                        i48 = profileActivity.h3;
                                                                                        if (i7 == i48) {
                                                                                            n8Var.u(org.telegram.messenger.gd.L0(2131748862), org.telegram.messenger.gd.j0(), false, R.drawable.msg2_language, false);
                                                                                            n8Var.setImageLeft(23);
                                                                                        } else {
                                                                                            i49 = profileActivity.g3;
                                                                                            if (i7 == i49) {
                                                                                                n8Var.o(R.drawable.msg2_notifications, org.telegram.messenger.gd.L0(2131747729), true);
                                                                                            } else {
                                                                                                i50 = profileActivity.i3;
                                                                                                if (i7 == i50) {
                                                                                                    n8Var.o(R.drawable.msg2_secret, org.telegram.messenger.gd.L0(2131746578), true);
                                                                                                } else {
                                                                                                    i51 = profileActivity.j3;
                                                                                                    if (i7 == i51) {
                                                                                                        n8Var.o(R.drawable.msg2_data, org.telegram.messenger.gd.L0(2131751666), true);
                                                                                                    } else {
                                                                                                        i52 = profileActivity.k3;
                                                                                                        if (i7 == i52) {
                                                                                                            n8Var.o(R.drawable.msg2_discussion, org.telegram.messenger.gd.L0(2131752199), true);
                                                                                                        } else {
                                                                                                            i53 = profileActivity.l3;
                                                                                                            if (i7 == i53) {
                                                                                                                n8Var.o(R.drawable.msg2_folder, org.telegram.messenger.gd.L0(2131750680), true);
                                                                                                            } else {
                                                                                                                i54 = profileActivity.n3;
                                                                                                                if (i7 == i54) {
                                                                                                                    n8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.gd.L0(2131744622), true);
                                                                                                                } else {
                                                                                                                    i55 = profileActivity.m3;
                                                                                                                    if (i7 == i55) {
                                                                                                                        n8Var.o(R.drawable.msg2_battery, org.telegram.messenger.gd.L0(2131746873), true);
                                                                                                                    } else {
                                                                                                                        i56 = profileActivity.r3;
                                                                                                                        if (i7 == i56) {
                                                                                                                            n8Var.o(R.drawable.msg2_ask_question, org.telegram.messenger.gd.L0(2131753984), true);
                                                                                                                        } else {
                                                                                                                            i57 = profileActivity.s3;
                                                                                                                            if (i7 == i57) {
                                                                                                                                n8Var.o(R.drawable.msg2_help, org.telegram.messenger.gd.L0(2131744007), true);
                                                                                                                            } else {
                                                                                                                                i58 = profileActivity.t3;
                                                                                                                                if (i7 == i58) {
                                                                                                                                    n8Var.o(R.drawable.msg2_policy, org.telegram.messenger.gd.L0(2131746590), false);
                                                                                                                                } else {
                                                                                                                                    i59 = profileActivity.w3;
                                                                                                                                    if (i7 == i59) {
                                                                                                                                        n8Var.k(org.telegram.messenger.gd.L0(2131751602), true);
                                                                                                                                    } else {
                                                                                                                                        i60 = profileActivity.x3;
                                                                                                                                        if (i7 == i60) {
                                                                                                                                            n8Var.k(org.telegram.messenger.gd.L0(2131751603), true);
                                                                                                                                        } else {
                                                                                                                                            i61 = profileActivity.y3;
                                                                                                                                            if (i7 == i61) {
                                                                                                                                                n8Var.k(org.telegram.messenger.gd.L0(2131751639), profileActivity.z3 != -1);
                                                                                                                                            } else if (i7 == profileActivity.z3) {
                                                                                                                                                n8Var.k("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i62 = profileActivity.o3;
                                                                                                                                                if (i7 == i62) {
                                                                                                                                                    n8Var.o(R.drawable.msg2_devices, org.telegram.messenger.gd.L0(2131751444), true);
                                                                                                                                                } else {
                                                                                                                                                    i63 = profileActivity.P2;
                                                                                                                                                    if (i7 == i63) {
                                                                                                                                                        profileActivity.W.P(86);
                                                                                                                                                        profileActivity.W.L();
                                                                                                                                                        n8Var.p(org.telegram.messenger.gd.L0(2131745321), profileActivity.W, false);
                                                                                                                                                        n8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                                                                                                                                                        n8Var.getImageView().setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                                                                                                                                                        n8Var.setImageLeft(12);
                                                                                                                                                        profileActivity.N2 = n8Var;
                                                                                                                                                    } else {
                                                                                                                                                        i64 = profileActivity.b4;
                                                                                                                                                        if (i7 == i64) {
                                                                                                                                                            n8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.L0(2131753049), false);
                                                                                                                                                            n8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                                                                                                                                                        } else {
                                                                                                                                                            i65 = profileActivity.d4;
                                                                                                                                                            if (i7 == i65) {
                                                                                                                                                                n8Var.o(R.drawable.msg_groups_create, org.telegram.messenger.gd.L0(2131754370), false);
                                                                                                                                                            } else {
                                                                                                                                                                i66 = profileActivity.f4;
                                                                                                                                                                if (i7 == i66) {
                                                                                                                                                                    n8Var.p(org.telegram.messenger.gd.L0(2131743996), new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.a1) ia.e.d().g), true);
                                                                                                                                                                    n8Var.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i67 = profileActivity.g4;
                                                                                                                                                                    if (i7 == i67) {
                                                                                                                                                                        i78 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                                                                                                                                        di.x8 w10 = di.x8.w(i78);
                                                                                                                                                                        long j35 = w10.p().amount;
                                                                                                                                                                        String L017 = org.telegram.messenger.gd.L0(2131748412);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (w10.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j35 > 0) {
                                                                                                                                                                                charSequence3 = di.pb.M0(w10.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        n8Var.t(L017, charSequence3, new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.a1) ia.e.d().i), true);
                                                                                                                                                                        n8Var.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i68 = profileActivity.h4;
                                                                                                                                                                        if (i7 == i68) {
                                                                                                                                                                            i77 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                                                                                                                                                                            di.x8 y10 = di.x8.y(i77, true);
                                                                                                                                                                            long j36 = y10.p().amount;
                                                                                                                                                                            String L018 = org.telegram.messenger.gd.L0(2131748108);
                                                                                                                                                                            CharSequence charSequence4 = str13;
                                                                                                                                                                            if (y10.e) {
                                                                                                                                                                                charSequence4 = str13;
                                                                                                                                                                                if (j36 > 0) {
                                                                                                                                                                                    charSequence4 = di.pb.M0(y10.p(), 0.85f, ' ');
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            n8Var.s(L018, charSequence4, R.drawable.settings_gram_24, true);
                                                                                                                                                                            n8Var.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i69 = profileActivity.i4;
                                                                                                                                                                            if (i7 == i69) {
                                                                                                                                                                                n8Var.o(R.drawable.menu_shop, org.telegram.messenger.gd.L0(2131744017), true);
                                                                                                                                                                                n8Var.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i70 = profileActivity.j4;
                                                                                                                                                                                if (i7 == i70) {
                                                                                                                                                                                    n8Var.o(R.drawable.menu_gift, org.telegram.messenger.gd.L0(2131745444), false);
                                                                                                                                                                                    n8Var.setImageLeft(23);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i71 = profileActivity.botPermissionLocation;
                                                                                                                                                                                    if (i7 == i71) {
                                                                                                                                                                                        String L019 = org.telegram.messenger.gd.L0(2131752996);
                                                                                                                                                                                        ki.s0 s0Var = profileActivity.t2;
                                                                                                                                                                                        boolean z32 = s0Var != null && s0Var.g();
                                                                                                                                                                                        int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.lk);
                                                                                                                                                                                        i76 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                        n8Var.m(L019, z32, R.drawable.filled_access_location, themedColor3, i76 != -1);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i72 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                        if (i7 == i72) {
                                                                                                                                                                                            String L020 = org.telegram.messenger.gd.L0(2131752998);
                                                                                                                                                                                            ki.q qVar = profileActivity.u2;
                                                                                                                                                                                            n8Var.m(L020, qVar != null && qVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.ok), false);
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i73 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                            if (i7 == i73) {
                                                                                                                                                                                                String L021 = org.telegram.messenger.gd.L0(2131752997);
                                                                                                                                                                                                userFull13 = profileActivity.w2;
                                                                                                                                                                                                if (userFull13 != null) {
                                                                                                                                                                                                    userFull14 = profileActivity.w2;
                                                                                                                                                                                                    if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                        z16 = true;
                                                                                                                                                                                                        int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.jk);
                                                                                                                                                                                                        i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                        if (i74 == -1) {
                                                                                                                                                                                                            i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                            if (i75 == -1) {
                                                                                                                                                                                                                z17 = false;
                                                                                                                                                                                                                n8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        z17 = true;
                                                                                                                                                                                                        n8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                z16 = false;
                                                                                                                                                                                                int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.jk);
                                                                                                                                                                                                i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                if (i74 == -1) {
                                                                                                                                                                                                }
                                                                                                                                                                                                z17 = true;
                                                                                                                                                                                                n8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor42, z17);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        n8Var = n8Var;
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
                org.telegram.ui.ActionBar.u6.Y(n8Var.c, org.telegram.ui.ActionBar.n6.I6, profileActivity.A0);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i94 = profileActivity.O3;
                if (i7 == i94) {
                    i95 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                    SharedPreferences z110 = org.telegram.messenger.mp.z1(i95);
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
                    String v = org.telegram.messenger.xs.v(j37, j25, false);
                    boolean z33 = z110.getBoolean("custom_" + v, false);
                    boolean contains = z110.contains("notify2_" + v);
                    int c13 = org.telegram.messenger.f3.c("notify2_", v, z110, 0);
                    int c14 = org.telegram.messenger.f3.c("notifyuntil_", v, z110, 0);
                    if (c13 == 3 && c14 != Integer.MAX_VALUE) {
                        int currentTime = c14 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str14 = z33 ? org.telegram.messenger.gd.L0(2131747725) : org.telegram.messenger.gd.L0(2131747699);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                str14 = org.telegram.messenger.gd.Y(2131742607, "WillUnmuteIn", org.telegram.messenger.gd.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str14 = org.telegram.messenger.gd.Y(2131742607, "WillUnmuteIn", org.telegram.messenger.gd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str14 = org.telegram.messenger.gd.Y(2131742607, "WillUnmuteIn", org.telegram.messenger.gd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z19 = false;
                        }
                    } else if (c13 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.C(j37);
                            str14 = (z18 || !z33) ? !z18 ? org.telegram.messenger.gd.L0(2131747699) : org.telegram.messenger.gd.L0(2131747701) : org.telegram.messenger.gd.L0(2131747725);
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        z19 = z18;
                    } else {
                        if (c13 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        z19 = z18;
                    }
                    if (str14 == null) {
                        str14 = org.telegram.messenger.gd.L0(2131747701);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str14 = String.format(Locale.US, org.telegram.messenger.gd.K0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str14, Integer.valueOf(hashSet.size()));
                    }
                    String str19 = str14;
                    z20 = profileActivity.r5;
                    j5Var.setAnimationsEnabled(z20);
                    j5Var.b(org.telegram.messenger.gd.L0(2131747731), str19, 0, z19, 0, false, profileActivity.l4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i7));
                break;
            case 8:
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i7 - profileActivity.x4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i7 - profileActivity.x4);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str20 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.gd.L0(2131752412);
                            }
                            z25 = false;
                            z26 = true;
                            z27 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.gd.L0(2131752509);
                            }
                            z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z27 = false;
                            z26 = true;
                        } else {
                            z25 = false;
                            z26 = false;
                            z27 = false;
                        }
                        z23 = z25;
                        z22 = z27;
                        str12 = str20;
                        z21 = z26;
                    } else {
                        String str21 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = org.telegram.messenger.gd.L0(2131752412);
                            }
                            str12 = str21;
                            z23 = false;
                            z21 = true;
                            z22 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = org.telegram.messenger.gd.L0(2131752509);
                            }
                            z23 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str12 = str21;
                            z22 = false;
                            z21 = true;
                        } else {
                            str12 = str21;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                        }
                    }
                    final TLRPC.User c27 = profileActivity.getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                    if (org.telegram.messenger.o10.C(c27)) {
                        org.telegram.messenger.mp messagesController8 = profileActivity.getMessagesController();
                        j28 = profileActivity.f1;
                        if (org.telegram.messenger.v3.h(messagesController8.O0(Long.valueOf(j28)))) {
                            z24 = true;
                            raVar.a(str12, z21, z22, z24, new View.OnClickListener() { // from class: org.telegram.ui.aw0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i119;
                                    org.telegram.ui.ActionBar.i6 i6Var;
                                    ProfileActivity profileActivity2 = lw0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i119 = ((org.telegram.ui.ActionBar.h2) profileActivity2).currentAccount;
                                    long a10 = profileActivity2.a();
                                    i6Var = ((org.telegram.ui.ActionBar.h2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.ny0.b(parentActivity, i119, a10, c27, str12, z21, z22, z23, i6Var);
                                }
                            });
                            raVar.e(c27, i7 == profileActivity.y4 + (-1));
                            break;
                        }
                    }
                    z24 = false;
                    raVar.a(str12, z21, z22, z24, new View.OnClickListener() { // from class: org.telegram.ui.aw0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i119;
                            org.telegram.ui.ActionBar.i6 i6Var;
                            ProfileActivity profileActivity2 = lw0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i119 = ((org.telegram.ui.ActionBar.h2) profileActivity2).currentAccount;
                            long a10 = profileActivity2.a();
                            i6Var = ((org.telegram.ui.ActionBar.h2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.ny0.b(parentActivity, i119, a10, c27, str12, z21, z22, z23, i6Var);
                        }
                    });
                    raVar.e(c27, i7 == profileActivity.y4 + (-1));
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                i96 = profileActivity.d3;
                if (i7 == i96) {
                    y6Var.setType(1);
                    break;
                } else {
                    i97 = profileActivity.b3;
                    if (i7 == i97) {
                        y6Var.setType(0);
                        break;
                    } else {
                        i98 = profileActivity.Z2;
                        if (i7 == i98) {
                            y6Var.setType(2);
                            break;
                        }
                    }
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.gd.L0(2131753152));
                break;
            case 20:
                String L022 = org.telegram.messenger.gd.L0(2131747731);
                org.telegram.messenger.mp messagesController9 = profileActivity.getMessagesController();
                long a10 = profileActivity.a();
                j29 = profileActivity.g1;
                ((org.telegram.ui.Cells.s8) view).f(L022, !messagesController9.t2(a10, j29), false);
                break;
            case 21:
                kg.j1 j1Var = (kg.j1) view;
                userFull15 = profileActivity.w2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.w2;
                    tL_businessLocation = userFull16.business_location;
                }
                j1Var.a(tL_businessLocation, profileActivity.N3 < 0 && !profileActivity.s1);
                break;
            case 22:
                kg.i1 i1Var = (kg.i1) view;
                i1Var.setOnTimezoneSwitchClick(new yv0(this, 1));
                userFull17 = profileActivity.w2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.w2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.R4;
                z29 = profileActivity.S4;
                i1Var.b(tL_businessWorkHours, z28, z29, (profileActivity.N3 < 0 && !profileActivity.s1) || profileActivity.Q3 >= 0);
                break;
            case 23:
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                org.telegram.messenger.mp messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.w2;
                TLRPC.Chat O03 = messagesController10.O0(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.f6 f6Var = profileActivity.x2;
                g6Var.a(f6Var != null ? f6Var.d : null, O03);
                break;
            case 26:
                org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                a9Var2.setLinkTextRippleColor(null);
                i99 = profileActivity.S3;
                if (i7 == i99) {
                    profileActivity.getMessagesController().g2(profileActivity.a());
                    userFull26 = profileActivity.w2;
                    if (userFull26 != null) {
                        userFull32 = profileActivity.w2;
                        botVerification = userFull32.bot_verification;
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
                        userFull30 = profileActivity.w2;
                        if (TLObject.hasFlag(userFull30.flags2, 33554432)) {
                            userFull31 = profileActivity.w2;
                            l10 = Long.valueOf(userFull31.bot_manager_id);
                            userFull28 = profileActivity.w2;
                            if (userFull28 == null) {
                                userFull29 = profileActivity.w2;
                                peerSettings = userFull29.settings;
                            } else {
                                peerSettings = null;
                            }
                            if (peerSettings != null || peerSettings.bot_inviter_id == 0) {
                                charSequence2 = "\n\n\n";
                                user = null;
                            } else {
                                charSequence2 = "\n\n\n";
                                user = profileActivity.getMessagesController().c2(Long.valueOf(peerSettings.bot_inviter_id));
                            }
                            c23 = (peerSettings != null || peerSettings.bot_owner_id == 0) ? null : profileActivity.getMessagesController().c2(Long.valueOf(peerSettings.bot_owner_id));
                            int i119 = 14;
                            if (profileActivity.l4 < 0 || botVerification != null || l10 != null || user != null || c23 != null) {
                                a9Var2.setFixedSize(0);
                                org.telegram.messenger.mp messagesController11 = profileActivity.getMessagesController();
                                j31 = profileActivity.e1;
                                TLRPC.User c28 = messagesController11.c2(Long.valueOf(j31));
                                boolean z34 = c28 == null && c28.bot && c28.bot_can_edit;
                                spannableStringBuilder = new SpannableStringBuilder();
                                if (profileActivity.l4 < 0) {
                                    i103 = 1;
                                    spannableStringBuilder.append(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.L0(z34 ? 2131746510 : 2131746512), new org.telegram.ui.Components.pp0(i119, this, z34)));
                                    if (botVerification != null || l10 != null) {
                                        spannableStringBuilder.append(charSequence2);
                                    }
                                } else {
                                    i103 = 1;
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder.append("x");
                                    a9Var = a9Var2;
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(botVerification.icon, a9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append(" ");
                                    SpannableString spannableString2 = new SpannableString(org.telegram.messenger.fj.h0(botVerification.description, false));
                                    try {
                                        org.telegram.messenger.g0.c(spannableString2, i103, false, false);
                                        for (URLSpan uRLSpan : (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class)) {
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new cw0(this, url, url), spanStart, spanEnd, 33);
                                        }
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.f(e11);
                                    }
                                    spannableStringBuilder.append((CharSequence) spannableString2);
                                } else {
                                    a9Var = a9Var2;
                                    if (l10 != null && (c24 = profileActivity.getMessagesController().c2(l10)) != null) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append("</>");
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.managed_bot), length, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append(" ");
                                        spannableStringBuilder.append(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.Z(2131746514, org.telegram.messenger.o10.o(c24)), org.telegram.ui.ActionBar.n6.Xc, profileActivity.A0, new tr0(17, this, l10), false));
                                    }
                                }
                                if (user == null || c23 != null) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append("\n\n");
                                    }
                                    if (user != null) {
                                        final long j38 = user.id;
                                        spannableStringBuilder.append(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.Z(2131746517, org.telegram.messenger.o10.q(user)), org.telegram.ui.ActionBar.n6.Xc, profileActivity.A0, new Runnable(this) { // from class: org.telegram.ui.zv0
                                            public final /* synthetic */ lw0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i108) {
                                                    case 0:
                                                        this.b.e.presentFragment(ProfileActivity.D4(j38));
                                                        break;
                                                    default:
                                                        this.b.e.presentFragment(ProfileActivity.D4(j38));
                                                        break;
                                                }
                                            }
                                        }, false));
                                    }
                                    if (c23 != null) {
                                        if (user != null) {
                                            spannableStringBuilder.append("\n");
                                        }
                                        final long j39 = c23.id;
                                        final int i120 = 1;
                                        spannableStringBuilder.append(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.Z(2131746518, org.telegram.messenger.o10.q(c23)), org.telegram.ui.ActionBar.n6.Xc, profileActivity.A0, new Runnable(this) { // from class: org.telegram.ui.zv0
                                            public final /* synthetic */ lw0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i120) {
                                                    case 0:
                                                        this.b.e.presentFragment(ProfileActivity.D4(j39));
                                                        break;
                                                    default:
                                                        this.b.e.presentFragment(ProfileActivity.D4(j39));
                                                        break;
                                                }
                                            }
                                        }, false));
                                    }
                                }
                                org.telegram.ui.Cells.a9 a9Var3 = a9Var;
                                a9Var3.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.B6))));
                                a9Var3.setText(spannableStringBuilder);
                                break;
                            } else {
                                a9Var2.setFixedSize(14);
                                a9Var2.setText(null);
                                break;
                            }
                        }
                    }
                    l10 = null;
                    userFull28 = profileActivity.w2;
                    if (userFull28 == null) {
                    }
                    if (peerSettings != null) {
                    }
                    charSequence2 = "\n\n\n";
                    user = null;
                    if (peerSettings != null) {
                    }
                    int i1192 = 14;
                    if (profileActivity.l4 < 0) {
                    }
                    a9Var2.setFixedSize(0);
                    org.telegram.messenger.mp messagesController112 = profileActivity.getMessagesController();
                    j31 = profileActivity.e1;
                    TLRPC.User c282 = messagesController112.c2(Long.valueOf(j31));
                    if (c282 == null) {
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    if (profileActivity.l4 < 0) {
                    }
                    if (botVerification == null) {
                    }
                    if (user == null) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    if (user != null) {
                    }
                    if (c23 != null) {
                    }
                    org.telegram.ui.Cells.a9 a9Var32 = a9Var;
                    a9Var32.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.B6))));
                    a9Var32.setText(spannableStringBuilder);
                } else {
                    i100 = profileActivity.U3;
                    if (i7 == i100) {
                        org.telegram.messenger.mp messagesController12 = profileActivity.getMessagesController();
                        j30 = profileActivity.e1;
                        TLRPC.User c29 = messagesController12.c2(Long.valueOf(j30));
                        if (c29 != null && c29.bot && c29.bot_can_edit) {
                            a9Var2.setFixedSize(0);
                            String q10 = org.telegram.messenger.o10.q(c29);
                            userFull23 = profileActivity.w2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.w2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.w2;
                                    i102 = userFull25.starref_program.commission_permille;
                                    a9Var2.setText(org.telegram.messenger.gd.Z(2131746519, q10, ki.k.J0(i102)));
                                    break;
                                }
                            }
                            i102 = 0;
                            a9Var2.setText(org.telegram.messenger.gd.Z(2131746519, q10, ki.k.J0(i102)));
                        } else {
                            a9Var2.setFixedSize(0);
                            String q11 = org.telegram.messenger.o10.q(c29);
                            userFull20 = profileActivity.w2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.w2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.w2;
                                    i101 = userFull22.starref_program.commission_permille;
                                    a9Var2.setText(org.telegram.messenger.gd.Z(2131746520, q11, ki.k.J0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            a9Var2.setText(org.telegram.messenger.gd.Z(2131746520, q11, ki.k.J0(i101)));
                        }
                    }
                }
                break;
            case 27:
                ki.h hVar = (ki.h) view;
                hVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.n6.lk), R.drawable.filled_affiliate, org.telegram.messenger.gd.L0(2131746521), null);
                userFull33 = profileActivity.w2;
                if (userFull33 != null) {
                    userFull34 = profileActivity.w2;
                    if (userFull34.starref_program != null) {
                        userFull35 = profileActivity.w2;
                        str15 = ki.k.J0(userFull35.starref_program.commission_permille);
                    }
                }
                hVar.setPercent(str15);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                i104 = profileActivity.m4;
                if (i7 == i104) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.round_warn);
                    lqVar.e(org.telegram.messenger.g0.L(1.0f));
                    lqVar.y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.nk, profileActivity.A0);
                    profileActivity.X6 = lqVar;
                    spannableStringBuilder5.setSpan(lqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    org.telegram.messenger.mp messagesController13 = profileActivity.getMessagesController();
                    j32 = profileActivity.e1;
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.gd.Z(2131746426, org.telegram.messenger.o10.l(messagesController13.c2(Long.valueOf(j32)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                mi.c cVar = (mi.c) view;
                chat11 = profileActivity.F2;
                if (chat11 != null) {
                    i106 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                    org.telegram.messenger.mp messagesController14 = profileActivity.getMessagesController();
                    chat12 = profileActivity.F2;
                    cVar.a(i106, messagesController14.O0(Long.valueOf(chat12.linked_community_id)));
                    break;
                } else {
                    j33 = profileActivity.e1;
                    if (j33 != 0) {
                        org.telegram.messenger.mp messagesController15 = profileActivity.getMessagesController();
                        j34 = profileActivity.e1;
                        TLRPC.User c210 = messagesController15.c2(Long.valueOf(j34));
                        if (c210 != null) {
                            i105 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                            cVar.a(i105, profileActivity.getMessagesController().O0(Long.valueOf(c210.linked_community_id)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View raVar;
        View view;
        boolean z11 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i7) {
            case 1:
                raVar = new org.telegram.ui.Cells.o4(this.c, org.telegram.ui.ActionBar.n6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case org.telegram.messenger.ks.T /* 30 */:
                org.telegram.ui.ActionBar.i6 i6Var = profileActivity.A0;
                if (i7 == 30) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                ew0 ew0Var = new ew0(this, this.c, i6Var, z11, i7 == 19 ? true : z10);
                ew0Var.setContentDescriptionValueFirst(true);
                raVar = ew0Var;
                break;
            case 3:
                fw0 fw0Var = new fw0(this, context, profileActivity, profileActivity.A0);
                profileActivity.j6 = fw0Var;
                raVar = fw0Var;
                break;
            case 4:
                raVar = new or(this, context, profileActivity.A0);
                break;
            case 5:
                View f3Var = new org.telegram.ui.Cells.f3(context, profileActivity.A0);
                f3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                raVar = f3Var;
                break;
            case 6:
                raVar = new gw0(this, context, profileActivity.A0);
                break;
            case 7:
                raVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                raVar = new org.telegram.ui.Cells.ra(profileActivity.z4 == -1 ? 9 : 6, 0, this.c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(10, context, profileActivity.A0);
                a9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.u6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.n6.A6, profileActivity.A0);
                a9Var.getTextView().setMovementMethod(null);
                a9Var.setText(org.telegram.messenger.g0.D0());
                a9Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                raVar = a9Var;
                break;
            case 11:
            case org.telegram.messenger.ks.U /* 31 */:
                View w3Var = new org.telegram.ui.Cells.w3(context, org.telegram.messenger.g0.L(i7 == 31 ? 12.0f : 6.0f), 2);
                w3Var.setTag(-33024);
                raVar = w3Var;
                break;
            case 12:
                View hw0Var = new hw0(this, context);
                hw0Var.setBackground(new ColorDrawable(0));
                hw0Var.setTag(-33024);
                view = hw0Var;
                raVar = view;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view2 = profileActivity.O;
                view2.setTag(-33024);
                view = view2;
                raVar = view;
                break;
            case 15:
                raVar = new kw0(this, context, profileActivity.A0);
                break;
            case 17:
                raVar = new org.telegram.ui.Cells.a9(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View p1Var = new ug.p1(i7 == 18 ? 0 : 1, context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, p1Var, profileActivity.A0);
                raVar = p1Var;
                break;
            case 20:
                raVar = new org.telegram.ui.Cells.s8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View j1Var = new kg.j1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, j1Var, profileActivity.A0);
                raVar = j1Var;
                break;
            case 22:
                View iw0Var = new iw0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, iw0Var, profileActivity.A0);
                raVar = iw0Var;
                break;
            case 23:
                raVar = new bw0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                hi.d dVar = new hi.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.gd.M0(2131746513, null), false, true);
                dVar.setOnClickListener(new yv0(this, false ? 1 : 0));
                frameLayout.addView(dVar, c8.ma.d(-1, 48.0f, org.telegram.messenger.ks.E1, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, frameLayout, profileActivity.A0);
                raVar = frameLayout;
                break;
            case 26:
                raVar = new org.telegram.ui.Cells.a9(context, profileActivity.A0);
                break;
            case 27:
                raVar = new ki.h(context, profileActivity.A0);
                break;
            case 28:
                View jnVar = new org.telegram.ui.Components.jn(context, 21);
                jnVar.setTag(-33024);
                view = jnVar;
                raVar = view;
                break;
            case 32:
                raVar = new yw0(profileActivity, context);
                break;
            case 33:
                raVar = new mi.c(context, profileActivity.A0);
                break;
        }
        if (i7 != 13) {
            raVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new org.telegram.ui.Components.kj0(raVar);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        View view = f1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.y8) {
            ((org.telegram.ui.Cells.y8) view).a.setLoading(profileActivity.o5);
            ((org.telegram.ui.Cells.y8) view).b.setLoading(profileActivity.o5);
        }
    }

    @Override // v4.i0
    public final void z(v4.f1 f1Var) {
        View view = f1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
