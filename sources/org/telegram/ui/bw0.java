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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public bw0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f3 && b10 != profileActivity.T2 && b10 != profileActivity.h3 && b10 != profileActivity.g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.z3 && b10 != profileActivity.i3 && b10 != profileActivity.j3 && b10 != profileActivity.q3 && b10 != profileActivity.n3 && b10 != profileActivity.k3 && b10 != profileActivity.m3 && b10 != profileActivity.r3 && b10 != profileActivity.s3 && b10 != profileActivity.v3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.a4 && b10 != profileActivity.c4 && b10 != profileActivity.g4 && b10 != profileActivity.f4 && b10 != profileActivity.l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.d4 && b10 != profileActivity.e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.l10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i3 = d1Var.f;
            if (i3 == 1 || i3 == 5 || i3 == 7 || i3 == 11 || i3 == 31 || i3 == 28 || i3 == 12 || i3 == 13 || i3 == 9 || i3 == 10 || i3 == 25 || i3 == 32) {
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
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i3)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i3)).username))) {
                    arrayList2.remove(i3);
                    i3--;
                }
                i3++;
            }
            str3 = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i10);
                    SpannableString spannableString = new SpannableString(t4.c.f("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        uv0 uv0Var = new uv0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, uv0Var);
                        clickableSpan = uv0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.Uc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i10 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = org.telegram.messenger.bd.M0(2131743678, null);
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

    @Override // u4.h0
    public final int b() {
        return this.e.N2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e;
        if (i3 == profileActivity.D3 || i3 == profileActivity.t4 || i3 == profileActivity.e3 || i3 == profileActivity.S2 || i3 == profileActivity.p3 || i3 == profileActivity.u3 || i3 == profileActivity.n4) {
            return 1;
        }
        if (i3 == profileActivity.G3 || i3 == profileActivity.I3 || i3 == profileActivity.T2 || i3 == profileActivity.U2) {
            return 2;
        }
        if (i3 == profileActivity.L3 || i3 == profileActivity.V2) {
            return 19;
        }
        if (i3 == profileActivity.H3) {
            return 30;
        }
        if (i3 == profileActivity.J3 || i3 == profileActivity.K3 || i3 == profileActivity.W2) {
            return 3;
        }
        if (i3 == profileActivity.q4 || i3 == profileActivity.r4 || i3 == profileActivity.V3 || i3 == profileActivity.X3 || i3 == profileActivity.W3 || i3 == profileActivity.x4 || i3 == profileActivity.y4 || i3 == profileActivity.z4 || i3 == profileActivity.A4 || i3 == profileActivity.G4 || i3 == profileActivity.w4 || i3 == profileActivity.M4 || i3 == profileActivity.L4 || i3 == profileActivity.U3 || i3 == profileActivity.f3 || i3 == profileActivity.h3 || i3 == profileActivity.g3 || i3 == profileActivity.i3 || i3 == profileActivity.j3 || i3 == profileActivity.q3 || i3 == profileActivity.n3 || i3 == profileActivity.k3 || i3 == profileActivity.m3 || i3 == profileActivity.r3 || i3 == profileActivity.s3 || i3 == profileActivity.v3 || i3 == profileActivity.w3 || i3 == profileActivity.x3 || i3 == profileActivity.y3 || i3 == profileActivity.O2 || i3 == profileActivity.a4 || i3 == profileActivity.Z3 || i3 == profileActivity.l3 || i3 == profileActivity.g4 || i3 == profileActivity.f4 || i3 == profileActivity.B4 || i3 == profileActivity.C4 || i3 == profileActivity.D4) {
            return 4;
        }
        i10 = profileActivity.botPermissionLocation;
        if (i3 == i10) {
            return 4;
        }
        i11 = profileActivity.botPermissionBiometry;
        if (i3 == i11) {
            return 4;
        }
        i12 = profileActivity.botPermissionEmojiStatus;
        if (i3 == i12 || i3 == profileActivity.e4) {
            return 4;
        }
        if (i3 == profileActivity.M3) {
            return 5;
        }
        if (i3 == profileActivity.N3) {
            return 6;
        }
        if (i3 == profileActivity.Q3) {
            return 20;
        }
        if (i3 == profileActivity.N4 || i3 == profileActivity.H4 || i3 == profileActivity.m4 || i3 == profileActivity.s4 || i3 == profileActivity.d3 || i3 == profileActivity.o3 || i3 == profileActivity.t3 || i3 == profileActivity.P2 || i3 == profileActivity.b3 || i3 == profileActivity.X2 || i3 == profileActivity.h4 || i3 == profileActivity.Y3 || i3 == profileActivity.R2 || i3 == profileActivity.Z2 || i3 == profileActivity.F4 || i3 == profileActivity.p4 || i3 == profileActivity.E4 || i3 == profileActivity.k4) {
            return 7;
        }
        if (i3 >= profileActivity.u4 && i3 < profileActivity.v4) {
            return 8;
        }
        if (i3 == profileActivity.A3) {
            return 11;
        }
        if (i3 == profileActivity.B3) {
            return 31;
        }
        if (i3 == profileActivity.C3) {
            return 12;
        }
        if (i3 == profileActivity.K4) {
            return 13;
        }
        if (i3 == profileActivity.z3) {
            return 14;
        }
        if (i3 == profileActivity.c3 || i3 == profileActivity.a3 || i3 == profileActivity.Y2) {
            return 15;
        }
        if (i3 == profileActivity.b4) {
            return 17;
        }
        if (i3 == profileActivity.c4) {
            return 18;
        }
        if (i3 == profileActivity.d4) {
            return 24;
        }
        if (i3 == profileActivity.P3) {
            return 21;
        }
        if (i3 == profileActivity.O3) {
            return 22;
        }
        if (i3 == profileActivity.Q2) {
            return 23;
        }
        if (i3 == profileActivity.i4) {
            return 25;
        }
        if (i3 == profileActivity.R3 || i3 == profileActivity.T3) {
            return 26;
        }
        if (i3 == profileActivity.j4) {
            return 32;
        }
        if (i3 == profileActivity.l4) {
            return 33;
        }
        if (i3 == profileActivity.S3) {
            return 27;
        }
        return (i3 == profileActivity.E3 || i3 == profileActivity.F3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:562:0x0e9c, code lost:
    
        if (r0.about != null) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023f  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
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
        int i25;
        long j17;
        TLRPC.TL_username tL_username;
        String str7;
        long j18;
        int i26;
        CharSequence h02;
        long j19;
        String L02;
        String str8;
        boolean z12;
        TLRPC.UserFull userFull;
        long j20;
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
        long j21;
        int i78;
        TLRPC.ChatFull chatFull5;
        int i79;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i80;
        int i81;
        long j22;
        int i82;
        long j23;
        int i83;
        long j24;
        int i84;
        long j25;
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
        long j26;
        boolean z18;
        boolean z19;
        org.telegram.messenger.us notificationsController;
        boolean z20;
        long j27;
        long j28;
        String str11;
        final boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        long j29;
        boolean z25;
        boolean z26;
        boolean z27;
        int i95;
        int i96;
        int i97;
        long j30;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i98;
        int i99;
        long j31;
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
        long j32;
        TLRPC.User a23;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i102;
        long j33;
        TLRPC.Chat chat11;
        long j34;
        long j35;
        int i103;
        int i104;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.R4;
        ArrayList arrayList2 = profileActivity.S4;
        HashSet hashSet = profileActivity.i5;
        int i105 = d1Var.f;
        View view = d1Var.a;
        int i106 = 13;
        String str12 = "";
        String str13 = null;
        r12 = null;
        String str14 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        r14 = true;
        boolean z30 = true;
        int i107 = 0;
        switch (i105) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                i10 = profileActivity.D3;
                if (i3 == i10) {
                    chat = profileActivity.E2;
                    if (org.telegram.messenger.t3.T(chat)) {
                        chat2 = profileActivity.E2;
                        if (!chat2.megagroup && profileActivity.K3 != -1) {
                            n4Var.setText(org.telegram.messenger.bd.L0(2131746238));
                        }
                    }
                    n4Var.setText(org.telegram.messenger.bd.L0(2131749205));
                } else {
                    i11 = profileActivity.t4;
                    if (i3 == i11) {
                        n4Var.setText(org.telegram.messenger.bd.L0(2131752377));
                    } else {
                        i12 = profileActivity.e3;
                        if (i3 == i12) {
                            n4Var.setText(org.telegram.messenger.bd.L0(2131745993));
                        } else {
                            i13 = profileActivity.S2;
                            if (i3 == i13) {
                                n4Var.setText(org.telegram.messenger.bd.L0(2131754710));
                            } else {
                                i14 = profileActivity.p3;
                                if (i3 == i14) {
                                    n4Var.setText(org.telegram.messenger.bd.L0(2131745489));
                                } else {
                                    i15 = profileActivity.u3;
                                    if (i3 == i15) {
                                        n4Var.setText(org.telegram.messenger.bd.L0(2131745496));
                                    } else {
                                        i16 = profileActivity.n4;
                                        if (i3 == i16) {
                                            n4Var.setText(org.telegram.messenger.bd.L0(2131753006));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                n4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.L6));
                break;
            case 2:
            case 19:
            case org.telegram.messenger.hs.T /* 30 */:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (i3 == profileActivity.U2) {
                    org.telegram.messenger.hp messagesController = profileActivity.getMessagesController();
                    j20 = profileActivity.e1;
                    TLRPC.UserFull b22 = messagesController.b2(j20);
                    if (b22 != null && b22.birthday != null) {
                        boolean d = org.telegram.messenger.v1.d(b22);
                        TL_account.TL_birthday tL_birthday = b22.birthday;
                        boolean z31 = (tL_birthday.flags & 1) != 0;
                        int years = z31 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String e02 = UserInfoActivity.e0(b22.birthday);
                        if (z31) {
                            Z = org.telegram.messenger.bd.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", e02);
                        } else {
                            Z = org.telegram.messenger.bd.Z(d ? 2131746729 : 2131746726, e02);
                        }
                        w8Var.c(org.telegram.messenger.i6.p(Z, w8Var.a, new rw(this, d1Var, i3, 10)), org.telegram.messenger.bd.L0(d ? 2131746730 : 2131746732), (!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().h7) {
                            i27 = 1;
                            z10 = false;
                            i107 = i27;
                        }
                    }
                    i27 = 0;
                    z10 = false;
                    i107 = i27;
                } else {
                    i17 = profileActivity.G3;
                    if (i3 == i17) {
                        org.telegram.messenger.hp messagesController2 = profileActivity.getMessagesController();
                        j19 = profileActivity.e1;
                        TLRPC.User a24 = messagesController2.a2(Long.valueOf(j19));
                        if (a24 != null && !TextUtils.isEmpty(profileActivity.e5)) {
                            L02 = org.telegram.messenger.k5.i(new StringBuilder("+"), profileActivity.e5, mf.b.c());
                            str8 = profileActivity.e5;
                        } else if (a24 == null || TextUtils.isEmpty(a24.phone)) {
                            L02 = org.telegram.messenger.bd.L0(2131747302);
                            str8 = null;
                        } else {
                            String i108 = org.telegram.messenger.k5.i(new StringBuilder("+"), a24.phone, mf.b.c());
                            str8 = a24.phone;
                            L02 = i108;
                        }
                        profileActivity.c5 = str8 != null && str8.matches("888\\d{8}");
                        z12 = profileActivity.c5;
                        w8Var.c(L02, org.telegram.messenger.bd.L0(z12 ? 2131754251 : 2131747299), false);
                    } else {
                        i18 = profileActivity.H3;
                        if (i3 == i18) {
                            org.telegram.messenger.hp messagesController3 = profileActivity.getMessagesController();
                            j18 = profileActivity.e1;
                            TLRPC.UserFull b23 = messagesController3.b2(j18);
                            if (b23 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = b23.note;
                                i26 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                if (org.telegram.messenger.h10.i(i26).q()) {
                                    h02 = org.telegram.messenger.zi.h0(tL_textWithEntities, false);
                                    if (!(h02 instanceof SpannableStringBuilder)) {
                                        h02 = new SpannableStringBuilder(h02);
                                    }
                                    org.telegram.messenger.g0.c((SpannableStringBuilder) h02, 1, false, false);
                                } else {
                                    h02 = org.telegram.messenger.zi.h0(org.telegram.messenger.zi.y5(tL_textWithEntities), false);
                                }
                                w8Var.d(h02, org.telegram.messenger.bd.L0(2131746658), org.telegram.messenger.bd.L0(2131746657));
                            }
                        } else {
                            i19 = profileActivity.L3;
                            if (i3 == i19) {
                                ArrayList arrayList3 = new ArrayList();
                                j10 = profileActivity.e1;
                                if (j10 != 0) {
                                    org.telegram.messenger.hp messagesController4 = profileActivity.getMessagesController();
                                    j17 = profileActivity.e1;
                                    TLRPC.User a25 = messagesController4.a2(Long.valueOf(j17));
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
                                        int i109 = 0;
                                        while (true) {
                                            if (i109 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i109);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i109++;
                                                } else {
                                                    str5 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String L03 = org.telegram.messenger.bd.L0(2131743684);
                                    if (str5 != null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                uv0 uv0Var = new uv0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, uv0Var);
                                                clickableSpan = uv0Var;
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
                                    str4 = L03;
                                } else {
                                    chat3 = profileActivity.E2;
                                    if (chat3 != null) {
                                        org.telegram.messenger.hp messagesController5 = profileActivity.getMessagesController();
                                        j11 = profileActivity.f1;
                                        TLRPC.Chat M0 = messagesController5.M0(Long.valueOf(j11));
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
                                            j15 = profileActivity.g1;
                                            String str15 = str12;
                                            if (j15 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j16 = profileActivity.g1;
                                                sb3.append(j16);
                                                str15 = sb3.toString();
                                            }
                                            sb2.append(str15);
                                            str6 = sb2.toString();
                                            str4 = org.telegram.messenger.bd.L0(2131749157);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().V2);
                                            sb4.append("/c/");
                                            j12 = profileActivity.f1;
                                            sb4.append(j12);
                                            j13 = profileActivity.g1;
                                            String str16 = str12;
                                            if (j13 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j14 = profileActivity.g1;
                                                sb5.append(j14);
                                                str16 = sb5.toString();
                                            }
                                            sb4.append(str16);
                                            String sb6 = sb4.toString();
                                            str4 = org.telegram.messenger.bd.L0(2131749153);
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
                                i25 = profileActivity.F3;
                                w8Var.c(str3, E, i25 == -1 && !(!profileActivity.q1 && profileActivity.O3 == -1 && profileActivity.P3 == -1) && profileActivity.U2 < 0);
                            } else {
                                i20 = profileActivity.I3;
                                if (i3 == i20) {
                                    chatFull = profileActivity.u2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.u2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.u2;
                                            w8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, org.telegram.messenger.bd.L0(2131753961), false);
                                        }
                                    }
                                } else {
                                    i21 = profileActivity.T2;
                                    if (i3 == i21) {
                                        i24 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                        TLRPC.User f10 = org.telegram.messenger.h10.i(i24).f();
                                        w8Var.c((f10 == null || (str2 = f10.phone) == null || str2.length() == 0) ? org.telegram.messenger.bd.L0(2131747840) : org.telegram.messenger.k5.i(new StringBuilder("+"), f10.phone, mf.b.c()), org.telegram.messenger.bd.L0(2131744270), true);
                                        w8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i22 = profileActivity.V2;
                                        if (i3 == i22) {
                                            i23 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                            TLRPC.User f11 = org.telegram.messenger.h10.i(i23).f();
                                            String L04 = org.telegram.messenger.bd.L0(2131743684);
                                            if (f11 == null || f11.usernames.size() <= 0) {
                                                String n4 = org.telegram.messenger.l10.n(f11);
                                                if (f11 == null || TextUtils.isEmpty(n4)) {
                                                    L0 = org.telegram.messenger.bd.L0(2131743671);
                                                    charSequence = L04;
                                                } else {
                                                    L0 = t4.c.f("@", n4);
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
                                                L0 = (str == null || TextUtils.isEmpty(str)) ? org.telegram.messenger.bd.L0(2131743671) : "@".concat(str);
                                                charSequence = E(str, f11.usernames, L04);
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
                if (i107 != 0) {
                    Drawable d10 = f0.d.d(w8Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.V6);
                    RectF rectF = ProfileActivity.T6;
                    d10.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.O6 = d10;
                    userFull = profileActivity.v2;
                    if (org.telegram.messenger.l10.b(userFull)) {
                        w8Var.setImage(null);
                        w8Var.setImageClickListener(null);
                    } else {
                        w8Var.b(d10, org.telegram.messenger.bd.L0(2131749688));
                        w8Var.setImageClickListener(new pt0(profileActivity, 12));
                    }
                } else if (z10) {
                    Drawable d11 = f0.d.d(w8Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.v8);
                    RectF rectF2 = ProfileActivity.T6;
                    d11.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.P6 = d11;
                    w8Var.b(d11, org.telegram.messenger.bd.L0(2131750480));
                    w8Var.setImageClickListener(new pt0(profileActivity, i106));
                } else {
                    w8Var.setImage(null);
                    w8Var.setImageClickListener(null);
                }
                w8Var.setTag(Integer.valueOf(i3));
                w8Var.a.setLoading(profileActivity.j5);
                w8Var.b.setLoading(profileActivity.j5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i28 = profileActivity.J3;
                if (i3 == i28) {
                    userFull8 = profileActivity.v2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.v2;
                        a22 = userFull12.user;
                    } else {
                        org.telegram.messenger.hp messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.v2;
                        a22 = messagesController6.a2(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.r2;
                    if (!z14) {
                        if (a22 != null && a22.premium) {
                            userFull11 = profileActivity.v2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.v2;
                        jVar.f(userFull10.about, org.telegram.messenger.bd.L0(2131743775), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.v2;
                    jVar.f(userFull10.about, org.telegram.messenger.bd.L0(2131743775), z15);
                } else if (i3 == profileActivity.K3) {
                    chatFull4 = profileActivity.u2;
                    String str17 = chatFull4.about;
                    while (str17.contains("\n\n\n")) {
                        str17 = str17.replace("\n\n\n", "\n\n");
                    }
                    String L05 = org.telegram.messenger.bd.L0(2131751460);
                    chat4 = profileActivity.E2;
                    if (org.telegram.messenger.t3.T(chat4)) {
                        chat5 = profileActivity.E2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            jVar.f(str17, L05, z13);
                            break;
                        }
                    }
                    z13 = false;
                    jVar.f(str17, L05, z13);
                } else {
                    i29 = profileActivity.W2;
                    if (i3 == i29) {
                        userFull2 = profileActivity.v2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.v2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(org.telegram.messenger.bd.L0(2131743775), org.telegram.messenger.bd.L0(2131743774), false);
                                profileActivity.z2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.v2;
                        if (userFull3 == null) {
                            str9 = org.telegram.messenger.bd.L0(2131748787);
                        } else {
                            userFull4 = profileActivity.v2;
                            str9 = userFull4.about;
                        }
                        jVar.f(str9, org.telegram.messenger.bd.L0(2131743775), profileActivity.getUserConfig().q());
                        userFull5 = profileActivity.v2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.v2;
                            str10 = userFull6.about;
                        } else {
                            str10 = null;
                        }
                        profileActivity.z2 = str10;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i111 = org.telegram.ui.ActionBar.k6.m6;
                int i112 = org.telegram.ui.ActionBar.k6.G6;
                l8Var.g(i111, i112);
                l8Var.setTag(Integer.valueOf(i112));
                i30 = profileActivity.q4;
                if (i3 == i30) {
                    int i113 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.i1))).ttl;
                    l8Var.q(org.telegram.messenger.bd.L0(2131748595), i113 == 0 ? org.telegram.messenger.bd.L0(2131745371) : org.telegram.messenger.bd.c0(i113), false, false);
                } else {
                    i31 = profileActivity.L4;
                    if (i3 == i31) {
                        l8Var.k(org.telegram.messenger.bd.L0(2131743921), false);
                        l8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                    } else {
                        i32 = profileActivity.r4;
                        if (i3 == i32) {
                            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20();
                            TLRPC.EncryptedChat a12 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.i1)));
                            byte[] bArr = a12.key_hash;
                            z20Var.a = bArr;
                            if (bArr == null) {
                                byte[] bArr2 = a12.auth_key;
                                Typeface typeface = org.telegram.messenger.g0.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                                z20Var.a = bArr3;
                                a12.key_hash = bArr3;
                            }
                            z20Var.invalidateSelf();
                            l8Var.v(org.telegram.messenger.bd.L0(2131751133), z20Var, false);
                        } else {
                            i33 = profileActivity.M4;
                            if (i3 == i33) {
                                l8Var.g(-1, org.telegram.ui.ActionBar.k6.o6);
                                chat10 = profileActivity.E2;
                                if (chat10.megagroup) {
                                    l8Var.k(org.telegram.messenger.bd.L0(2131746669), false);
                                } else {
                                    l8Var.k(org.telegram.messenger.bd.L0(2131746670), false);
                                }
                            } else {
                                i34 = profileActivity.x4;
                                if (i3 == i34) {
                                    chatFull12 = profileActivity.u2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.E2;
                                        if (org.telegram.messenger.t3.T(chat8)) {
                                            chat9 = profileActivity.E2;
                                            if (!chat9.megagroup) {
                                                String L06 = org.telegram.messenger.bd.L0(2131752289);
                                                chatFull14 = profileActivity.u2;
                                                String E2 = org.telegram.messenger.bd.E(chatFull14.participants_count, ',');
                                                i92 = profileActivity.H4;
                                                l8Var.s(L06, E2, R.drawable.msg_groups, i3 != i92 - 1);
                                            }
                                        }
                                        String L07 = org.telegram.messenger.bd.L0(2131752377);
                                        chatFull13 = profileActivity.u2;
                                        String E3 = org.telegram.messenger.bd.E(chatFull13.participants_count, ',');
                                        i91 = profileActivity.H4;
                                        l8Var.s(L07, E3, R.drawable.msg_groups, i3 != i91 - 1);
                                    } else {
                                        chat6 = profileActivity.E2;
                                        if (org.telegram.messenger.t3.T(chat6)) {
                                            chat7 = profileActivity.E2;
                                            if (!chat7.megagroup) {
                                                String L08 = org.telegram.messenger.bd.L0(2131752289);
                                                i90 = profileActivity.H4;
                                                l8Var.o(R.drawable.msg_groups, L08, i3 != i90 - 1);
                                            }
                                        }
                                        String L09 = org.telegram.messenger.bd.L0(2131752377);
                                        i89 = profileActivity.H4;
                                        l8Var.o(R.drawable.msg_groups, L09, i3 != i89 - 1);
                                    }
                                } else {
                                    i35 = profileActivity.y4;
                                    if (i3 == i35) {
                                        chatFull10 = profileActivity.u2;
                                        if (chatFull10 != null) {
                                            String L010 = org.telegram.messenger.bd.L0(2131744446);
                                            chatFull11 = profileActivity.u2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            i88 = profileActivity.H4;
                                            l8Var.s(L010, format, R.drawable.msg_requests, i3 != i88 - 1);
                                        }
                                    } else {
                                        i36 = profileActivity.z4;
                                        if (i3 == i36) {
                                            chatFull8 = profileActivity.u2;
                                            if (chatFull8 != null) {
                                                String L011 = org.telegram.messenger.bd.L0(2131752517);
                                                chatFull9 = profileActivity.u2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                i87 = profileActivity.H4;
                                                l8Var.s(L011, format2, R.drawable.msg_admins, i3 != i87 - 1);
                                            } else {
                                                String L012 = org.telegram.messenger.bd.L0(2131752517);
                                                i86 = profileActivity.H4;
                                                l8Var.o(R.drawable.msg_admins, L012, i3 != i86 - 1);
                                            }
                                        } else {
                                            i37 = profileActivity.A4;
                                            if (i3 == i37) {
                                                String L013 = org.telegram.messenger.bd.L0(2131752519);
                                                i85 = profileActivity.H4;
                                                l8Var.o(R.drawable.msg_customize, L013, i3 != i85 - 1);
                                            } else {
                                                i38 = profileActivity.D4;
                                                if (i3 == i38) {
                                                    i83 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                    ci.i0 g7 = ci.i0.g(i83);
                                                    j24 = profileActivity.f1;
                                                    TL_stars.StarsAmount c2 = g7.c(-j24);
                                                    i84 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                    ci.i0 g10 = ci.i0.g(i84);
                                                    j25 = profileActivity.f1;
                                                    long i114 = g10.i(-j25);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i114 > 0) {
                                                        double d12 = i114 / 1.0E9d;
                                                        if (d12 > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d12, 0));
                                                        } else {
                                                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                                            decimalFormatSymbols.setDecimalSeparator('.');
                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                                            decimalFormat.setMinimumFractionDigits(2);
                                                            decimalFormat.setMaximumFractionDigits(3);
                                                            decimalFormat.setGroupingUsed(false);
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d12));
                                                        }
                                                    }
                                                    if (c2.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) ci.wb.N0(c2, 0.777f, ' '));
                                                    }
                                                    l8Var.s(org.telegram.messenger.bd.L0(2131752290), xd.K(ci.wb.a1(false, spannableStringBuilder, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i39 = profileActivity.B4;
                                                    if (i3 == i39) {
                                                        i82 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                        ci.i0 g11 = ci.i0.g(i82);
                                                        j23 = profileActivity.e1;
                                                        TL_stars.StarsAmount c10 = g11.c(j23);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c10.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) ci.wb.N0(c10, 0.777f, ' '));
                                                        }
                                                        l8Var.s(org.telegram.messenger.bd.L0(2131753111), xd.K(ci.wb.a1(false, spannableStringBuilder2, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i40 = profileActivity.C4;
                                                        if (i3 == i40) {
                                                            i81 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                            ci.i0 g12 = ci.i0.g(i81);
                                                            j22 = profileActivity.e1;
                                                            long i115 = g12.i(j22);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i115 > 0) {
                                                                double d13 = i115 / 1.0E9d;
                                                                if (d13 > 1000.0d) {
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d13, 0));
                                                                } else {
                                                                    DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                                                                    decimalFormatSymbols2.setDecimalSeparator('.');
                                                                    DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                                                                    decimalFormat2.setMinimumFractionDigits(2);
                                                                    decimalFormat2.setMaximumFractionDigits(3);
                                                                    decimalFormat2.setGroupingUsed(false);
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d13));
                                                                }
                                                            }
                                                            l8Var.s(org.telegram.messenger.bd.L0(2131753110), xd.K(ci.wb.a1(false, spannableStringBuilder3, 0.7f, null), l8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i41 = profileActivity.G4;
                                                            if (i3 == i41) {
                                                                chatFull5 = profileActivity.u2;
                                                                if (chatFull5 != null) {
                                                                    String L014 = org.telegram.messenger.bd.L0(2131752453);
                                                                    chatFull6 = profileActivity.u2;
                                                                    int i116 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.u2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i116, chatFull7.kicked_count)));
                                                                    i80 = profileActivity.H4;
                                                                    l8Var.s(L014, format3, R.drawable.msg_user_remove, i3 != i80 - 1);
                                                                } else {
                                                                    String L015 = org.telegram.messenger.bd.L0(2131752453);
                                                                    i79 = profileActivity.H4;
                                                                    l8Var.o(R.drawable.msg_user_remove, L015, i3 != i79 - 1);
                                                                }
                                                            } else {
                                                                i42 = profileActivity.w4;
                                                                if (i3 == i42) {
                                                                    l8Var.g(i111, i112);
                                                                    int i117 = i3 + 1;
                                                                    boolean z32 = i117 >= profileActivity.u4 && i117 < profileActivity.v4;
                                                                    String L016 = org.telegram.messenger.bd.L0(2131754401);
                                                                    i78 = profileActivity.H4;
                                                                    l8Var.o(R.drawable.msg_contact_add, L016, i78 == -1 || z32);
                                                                } else {
                                                                    i43 = profileActivity.U3;
                                                                    if (i3 == i43) {
                                                                        l8Var.k(org.telegram.messenger.bd.L0(2131745609), true);
                                                                    } else {
                                                                        i44 = profileActivity.Z3;
                                                                        if (i3 == i44) {
                                                                            l8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.bd.L0(2131754377), false);
                                                                            l8Var.g(i111, i112);
                                                                        } else {
                                                                            i45 = profileActivity.W3;
                                                                            if (i3 == i45) {
                                                                                l8Var.o(R.drawable.menu_reaction_delete_24, org.telegram.messenger.bd.L0(2131751508), false);
                                                                                l8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                            } else {
                                                                                i46 = profileActivity.X3;
                                                                                if (i3 == i46) {
                                                                                    org.telegram.messenger.hp messagesController7 = profileActivity.getMessagesController();
                                                                                    j21 = profileActivity.b5;
                                                                                    TLRPC.Chat M02 = messagesController7.M0(Long.valueOf(-j21));
                                                                                    if (M02 == null || !org.telegram.messenger.t3.w(2, M02)) {
                                                                                        l8Var.o(R.drawable.msg_report, org.telegram.messenger.bd.L0(2131746221), false);
                                                                                    } else {
                                                                                        l8Var.o(R.drawable.msg_block2, org.telegram.messenger.bd.L0(2131746220), false);
                                                                                    }
                                                                                    l8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                                } else {
                                                                                    i47 = profileActivity.V3;
                                                                                    if (i3 == i47) {
                                                                                        l8Var.k(org.telegram.messenger.bd.L0(2131746196), false);
                                                                                        int i118 = org.telegram.ui.ActionBar.k6.p7;
                                                                                        l8Var.g(-1, i118);
                                                                                        l8Var.g(-1, i118);
                                                                                    } else {
                                                                                        i48 = profileActivity.g3;
                                                                                        if (i3 == i48) {
                                                                                            l8Var.u(org.telegram.messenger.bd.L0(2131749062), org.telegram.messenger.bd.j0(), false, R.drawable.msg2_language, false);
                                                                                            l8Var.setImageLeft(23);
                                                                                        } else {
                                                                                            i49 = profileActivity.f3;
                                                                                            if (i3 == i49) {
                                                                                                l8Var.o(R.drawable.msg2_notifications, org.telegram.messenger.bd.L0(2131747930), true);
                                                                                            } else {
                                                                                                i50 = profileActivity.h3;
                                                                                                if (i3 == i50) {
                                                                                                    l8Var.o(R.drawable.msg2_secret, org.telegram.messenger.bd.L0(2131746779), true);
                                                                                                } else {
                                                                                                    i51 = profileActivity.i3;
                                                                                                    if (i3 == i51) {
                                                                                                        l8Var.o(R.drawable.msg2_data, org.telegram.messenger.bd.L0(2131751678), true);
                                                                                                    } else {
                                                                                                        i52 = profileActivity.j3;
                                                                                                        if (i3 == i52) {
                                                                                                            l8Var.o(R.drawable.msg2_discussion, org.telegram.messenger.bd.L0(2131752210), true);
                                                                                                        } else {
                                                                                                            i53 = profileActivity.k3;
                                                                                                            if (i3 == i53) {
                                                                                                                l8Var.o(R.drawable.msg2_folder, org.telegram.messenger.bd.L0(2131750697), true);
                                                                                                            } else {
                                                                                                                i54 = profileActivity.m3;
                                                                                                                if (i3 == i54) {
                                                                                                                    l8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.bd.L0(2131744867), true);
                                                                                                                } else {
                                                                                                                    i55 = profileActivity.l3;
                                                                                                                    if (i3 == i55) {
                                                                                                                        l8Var.o(R.drawable.msg2_battery, org.telegram.messenger.bd.L0(2131747074), true);
                                                                                                                    } else {
                                                                                                                        i56 = profileActivity.q3;
                                                                                                                        if (i3 == i56) {
                                                                                                                            l8Var.o(R.drawable.msg2_ask_question, org.telegram.messenger.bd.L0(2131753986), true);
                                                                                                                        } else {
                                                                                                                            i57 = profileActivity.r3;
                                                                                                                            if (i3 == i57) {
                                                                                                                                l8Var.o(R.drawable.msg2_help, org.telegram.messenger.bd.L0(2131744252), true);
                                                                                                                            } else {
                                                                                                                                i58 = profileActivity.s3;
                                                                                                                                if (i3 == i58) {
                                                                                                                                    l8Var.o(R.drawable.msg2_policy, org.telegram.messenger.bd.L0(2131746791), false);
                                                                                                                                } else {
                                                                                                                                    i59 = profileActivity.v3;
                                                                                                                                    if (i3 == i59) {
                                                                                                                                        l8Var.k(org.telegram.messenger.bd.L0(2131751614), true);
                                                                                                                                    } else {
                                                                                                                                        i60 = profileActivity.w3;
                                                                                                                                        if (i3 == i60) {
                                                                                                                                            l8Var.k(org.telegram.messenger.bd.L0(2131751615), true);
                                                                                                                                        } else {
                                                                                                                                            i61 = profileActivity.x3;
                                                                                                                                            if (i3 == i61) {
                                                                                                                                                l8Var.k(org.telegram.messenger.bd.L0(2131751651), profileActivity.y3 != -1);
                                                                                                                                            } else if (i3 == profileActivity.y3) {
                                                                                                                                                l8Var.k("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i62 = profileActivity.n3;
                                                                                                                                                if (i3 == i62) {
                                                                                                                                                    l8Var.o(R.drawable.msg2_devices, org.telegram.messenger.bd.L0(2131751456), true);
                                                                                                                                                } else {
                                                                                                                                                    i63 = profileActivity.O2;
                                                                                                                                                    if (i3 == i63) {
                                                                                                                                                        profileActivity.W.P(86);
                                                                                                                                                        profileActivity.W.L();
                                                                                                                                                        l8Var.p(org.telegram.messenger.bd.L0(2131745526), profileActivity.W, false);
                                                                                                                                                        l8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                                                                                                                                        l8Var.getImageView().setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                                                                                                                                                        l8Var.setImageLeft(12);
                                                                                                                                                        profileActivity.M2 = l8Var;
                                                                                                                                                    } else {
                                                                                                                                                        i64 = profileActivity.a4;
                                                                                                                                                        if (i3 == i64) {
                                                                                                                                                            l8Var.o(R.drawable.msg_groups_create, org.telegram.messenger.bd.L0(2131754372), false);
                                                                                                                                                        } else {
                                                                                                                                                            i65 = profileActivity.c4;
                                                                                                                                                            if (i3 == i65) {
                                                                                                                                                                l8Var.p(org.telegram.messenger.bd.L0(2131744241), new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (vg.w0) ha.e.d().g), true);
                                                                                                                                                                l8Var.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i66 = profileActivity.d4;
                                                                                                                                                                if (i3 == i66) {
                                                                                                                                                                    i77 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                                                                                                                                    ci.e9 w10 = ci.e9.w(i77);
                                                                                                                                                                    long j36 = w10.p().amount;
                                                                                                                                                                    String L017 = org.telegram.messenger.bd.L0(2131748612);
                                                                                                                                                                    CharSequence charSequence2 = str12;
                                                                                                                                                                    if (w10.e) {
                                                                                                                                                                        charSequence2 = str12;
                                                                                                                                                                        if (j36 > 0) {
                                                                                                                                                                            charSequence2 = ci.wb.M0(w10.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    l8Var.t(L017, charSequence2, new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (vg.w0) ha.e.d().i), true);
                                                                                                                                                                    l8Var.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i67 = profileActivity.e4;
                                                                                                                                                                    if (i3 == i67) {
                                                                                                                                                                        i76 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                                                                                                                                                                        ci.e9 L = ci.e9.L(i76);
                                                                                                                                                                        long j37 = L.p().amount;
                                                                                                                                                                        String L018 = org.telegram.messenger.bd.L0(2131748308);
                                                                                                                                                                        CharSequence charSequence3 = str12;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str12;
                                                                                                                                                                            if (j37 > 0) {
                                                                                                                                                                                charSequence3 = ci.wb.M0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        l8Var.s(L018, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        l8Var.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i68 = profileActivity.f4;
                                                                                                                                                                        if (i3 == i68) {
                                                                                                                                                                            l8Var.o(R.drawable.menu_shop, org.telegram.messenger.bd.L0(2131744262), true);
                                                                                                                                                                            l8Var.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i69 = profileActivity.g4;
                                                                                                                                                                            if (i3 == i69) {
                                                                                                                                                                                l8Var.o(R.drawable.menu_gift, org.telegram.messenger.bd.L0(2131745649), false);
                                                                                                                                                                                l8Var.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i70 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i3 == i70) {
                                                                                                                                                                                    String L019 = org.telegram.messenger.bd.L0(2131753007);
                                                                                                                                                                                    ii.s0 s0Var = profileActivity.s2;
                                                                                                                                                                                    boolean z33 = s0Var != null && s0Var.g();
                                                                                                                                                                                    int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.ik);
                                                                                                                                                                                    i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    l8Var.m(L019, z33, R.drawable.filled_access_location, themedColor3, i75 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i71 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i3 == i71) {
                                                                                                                                                                                        String L020 = org.telegram.messenger.bd.L0(2131753009);
                                                                                                                                                                                        ii.r rVar = profileActivity.t2;
                                                                                                                                                                                        l8Var.m(L020, rVar != null && rVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.lk), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i72 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i3 == i72) {
                                                                                                                                                                                            String L021 = org.telegram.messenger.bd.L0(2131753008);
                                                                                                                                                                                            userFull13 = profileActivity.v2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.v2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.gk);
                                                                                                                                                                                                    i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i73 == -1) {
                                                                                                                                                                                                        i74 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i74 == -1) {
                                                                                                                                                                                                            z17 = false;
                                                                                                                                                                                                            l8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z17 = true;
                                                                                                                                                                                                    l8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                            int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.gk);
                                                                                                                                                                                            i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i73 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z17 = true;
                                                                                                                                                                                            l8Var.m(L021, z16, R.drawable.filled_access_sleeping, themedColor42, z17);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    l8Var = l8Var;
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
                org.telegram.ui.ActionBar.r6.Z(l8Var.c, org.telegram.ui.ActionBar.k6.I6, profileActivity.A0);
                break;
            case 6:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i93 = profileActivity.N3;
                if (i3 == i93) {
                    i94 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                    SharedPreferences x12 = org.telegram.messenger.hp.x1(i94);
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
                    String v = org.telegram.messenger.us.v(j38, j26, false);
                    boolean z34 = x12.getBoolean("custom_" + v, false);
                    boolean contains = x12.contains("notify2_" + v);
                    int c11 = org.telegram.messenger.k5.c("notify2_", v, x12, 0);
                    int c12 = org.telegram.messenger.k5.c("notifyuntil_", v, x12, 0);
                    if (c11 == 3 && c12 != Integer.MAX_VALUE) {
                        int currentTime = c12 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str13 = z34 ? org.telegram.messenger.bd.L0(2131747926) : org.telegram.messenger.bd.L0(2131747900);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                str13 = org.telegram.messenger.bd.Y(2131742875, "WillUnmuteIn", org.telegram.messenger.bd.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str13 = org.telegram.messenger.bd.Y(2131742875, "WillUnmuteIn", org.telegram.messenger.bd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str13 = org.telegram.messenger.bd.Y(2131742875, "WillUnmuteIn", org.telegram.messenger.bd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z19 = false;
                        }
                    } else if (c11 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.C(j38);
                            if (z18 || !z34) {
                                str13 = !z18 ? org.telegram.messenger.bd.L0(2131747900) : org.telegram.messenger.bd.L0(2131747902);
                            } else {
                                str13 = org.telegram.messenger.bd.L0(2131747926);
                            }
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str13 = !z18 ? org.telegram.messenger.bd.L0(2131747900) : org.telegram.messenger.bd.L0(2131747902);
                        z19 = z18;
                    } else {
                        if (c11 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            str13 = !z18 ? org.telegram.messenger.bd.L0(2131747900) : org.telegram.messenger.bd.L0(2131747902);
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str13 = !z18 ? org.telegram.messenger.bd.L0(2131747900) : org.telegram.messenger.bd.L0(2131747902);
                        z19 = z18;
                    }
                    if (str13 == null) {
                        str13 = org.telegram.messenger.bd.L0(2131747902);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str13 = String.format(Locale.US, org.telegram.messenger.bd.K0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str13, Integer.valueOf(hashSet.size()));
                    }
                    String str18 = str13;
                    z20 = profileActivity.m5;
                    h5Var.setAnimationsEnabled(z20);
                    h5Var.b(org.telegram.messenger.bd.L0(2131747932), str18, 0, z19, 0, false, profileActivity.i4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i3));
                break;
            case 8:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i3 - profileActivity.u4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i3 - profileActivity.u4);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str19 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.bd.L0(2131752423);
                            }
                            z26 = true;
                            z27 = true;
                            z25 = false;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.bd.L0(2131752520);
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
                        str11 = str19;
                    } else {
                        String str20 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.bd.L0(2131752423);
                            }
                            str11 = str20;
                            z22 = true;
                            z23 = true;
                            z21 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.bd.L0(2131752520);
                            }
                            z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str11 = str20;
                            z22 = true;
                            z23 = false;
                        } else {
                            str11 = str20;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                        }
                    }
                    final TLRPC.User a26 = profileActivity.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                    if (org.telegram.messenger.l10.B(a26)) {
                        org.telegram.messenger.hp messagesController8 = profileActivity.getMessagesController();
                        j29 = profileActivity.f1;
                        if (org.telegram.messenger.t3.h(messagesController8.M0(Long.valueOf(j29)))) {
                            z24 = true;
                            final String str21 = str11;
                            final boolean z35 = z22;
                            final boolean z36 = z23;
                            paVar.a(str11, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.rv0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i119;
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    ProfileActivity profileActivity2 = bw0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i119 = ((org.telegram.ui.ActionBar.d2) profileActivity2).currentAccount;
                                    long a10 = profileActivity2.a();
                                    e6Var = ((org.telegram.ui.ActionBar.d2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.dy0.b(parentActivity, i119, a10, a26, str21, z35, z36, z21, e6Var);
                                }
                            });
                            paVar.e(a26, i3 != profileActivity.v4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str212 = str11;
                    final boolean z352 = z22;
                    final boolean z362 = z23;
                    paVar.a(str11, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.rv0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i119;
                            org.telegram.ui.ActionBar.e6 e6Var;
                            ProfileActivity profileActivity2 = bw0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i119 = ((org.telegram.ui.ActionBar.d2) profileActivity2).currentAccount;
                            long a10 = profileActivity2.a();
                            e6Var = ((org.telegram.ui.ActionBar.d2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.dy0.b(parentActivity, i119, a10, a26, str212, z352, z362, z21, e6Var);
                        }
                    });
                    paVar.e(a26, i3 != profileActivity.v4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                i95 = profileActivity.c3;
                if (i3 != i95) {
                    i96 = profileActivity.a3;
                    if (i3 != i96) {
                        i97 = profileActivity.Y2;
                        if (i3 == i97) {
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
                ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.L0(2131753154));
                break;
            case 20:
                String L022 = org.telegram.messenger.bd.L0(2131747932);
                org.telegram.messenger.hp messagesController9 = profileActivity.getMessagesController();
                long a10 = profileActivity.a();
                j30 = profileActivity.g1;
                ((org.telegram.ui.Cells.q8) view).f(L022, !messagesController9.q2(a10, j30), false);
                break;
            case 21:
                lg.h1 h1Var = (lg.h1) view;
                userFull15 = profileActivity.v2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.v2;
                    tL_businessLocation = userFull16.business_location;
                }
                h1Var.a(tL_businessLocation, profileActivity.M3 < 0 && !profileActivity.s1);
                break;
            case 22:
                lg.g1 g1Var = (lg.g1) view;
                g1Var.setOnTimezoneSwitchClick(new pv0(this, r14 ? 1 : 0));
                userFull17 = profileActivity.v2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.v2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.O4;
                z29 = profileActivity.P4;
                if ((profileActivity.M3 >= 0 || profileActivity.s1) && profileActivity.P3 < 0) {
                    z30 = false;
                }
                g1Var.b(tL_businessWorkHours, z28, z29, z30);
                break;
            case 23:
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                org.telegram.messenger.hp messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.v2;
                TLRPC.Chat M03 = messagesController10.M0(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.d6 d6Var = profileActivity.w2;
                e6Var.a(d6Var != null ? d6Var.d : null, M03);
                break;
            case 26:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setLinkTextRippleColor(null);
                i98 = profileActivity.R3;
                if (i3 == i98) {
                    profileActivity.getMessagesController().e2(profileActivity.a());
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
                            l10 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.i4 < 0 || botVerification != null || l10 != null) {
                                y8Var.setFixedSize(0);
                                org.telegram.messenger.hp messagesController11 = profileActivity.getMessagesController();
                                j32 = profileActivity.e1;
                                TLRPC.User a27 = messagesController11.a2(Long.valueOf(j32));
                                boolean z37 = a27 == null && a27.bot && a27.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.i4 >= 0) {
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.L0(z37 ? 2131746713 : 2131746715), new org.telegram.ui.Components.up0(i106, this, z37)));
                                    if (botVerification != null || l10 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.p5(botVerification.icon, y8Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(org.telegram.messenger.zi.h0(botVerification.description, false));
                                    try {
                                        org.telegram.messenger.g0.c(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i107 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i107];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new tv0(this, url, url), spanStart, spanEnd, 33);
                                            i107++;
                                        }
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.f(e11);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l10 != null && (a23 = profileActivity.getMessagesController().a2(l10)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.wp(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.R2(org.telegram.messenger.bd.Z(2131746717, org.telegram.messenger.l10.n(a23)), org.telegram.ui.ActionBar.k6.Uc, profileActivity.A0, new qv0(i107, this, l10)));
                                }
                                y8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
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
                    if (profileActivity.i4 < 0) {
                    }
                    y8Var.setFixedSize(0);
                    org.telegram.messenger.hp messagesController112 = profileActivity.getMessagesController();
                    j32 = profileActivity.e1;
                    TLRPC.User a272 = messagesController112.a2(Long.valueOf(j32));
                    if (a272 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.i4 >= 0) {
                    }
                    if (botVerification == null) {
                    }
                    y8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
                    y8Var.setText(spannableStringBuilder42);
                } else {
                    i99 = profileActivity.T3;
                    if (i3 == i99) {
                        org.telegram.messenger.hp messagesController12 = profileActivity.getMessagesController();
                        j31 = profileActivity.e1;
                        TLRPC.User a28 = messagesController12.a2(Long.valueOf(j31));
                        if (a28 != null && a28.bot && a28.bot_can_edit) {
                            y8Var.setFixedSize(0);
                            String p10 = org.telegram.messenger.l10.p(a28);
                            userFull23 = profileActivity.v2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.v2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.v2;
                                    i101 = userFull25.starref_program.commission_permille;
                                    y8Var.setText(org.telegram.messenger.bd.Z(2131746720, p10, ii.k.J0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            y8Var.setText(org.telegram.messenger.bd.Z(2131746720, p10, ii.k.J0(i101)));
                        } else {
                            y8Var.setFixedSize(0);
                            String p11 = org.telegram.messenger.l10.p(a28);
                            userFull20 = profileActivity.v2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.v2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.v2;
                                    i100 = userFull22.starref_program.commission_permille;
                                    y8Var.setText(org.telegram.messenger.bd.Z(2131746721, p11, ii.k.J0(i100)));
                                    break;
                                }
                            }
                            i100 = 0;
                            y8Var.setText(org.telegram.messenger.bd.Z(2131746721, p11, ii.k.J0(i100)));
                        }
                    }
                }
                break;
            case 27:
                ii.h hVar = (ii.h) view;
                hVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.ik), R.drawable.filled_affiliate, org.telegram.messenger.bd.L0(2131746722), null);
                userFull31 = profileActivity.v2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.v2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.v2;
                        str14 = ii.k.J0(userFull33.starref_program.commission_permille);
                    }
                }
                hVar.setPercent(str14);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                i102 = profileActivity.j4;
                if (i3 == i102) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.round_warn);
                    wpVar.e(org.telegram.messenger.g0.L(1.0f));
                    wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, profileActivity.A0);
                    profileActivity.R6 = wpVar;
                    spannableStringBuilder5.setSpan(wpVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    org.telegram.messenger.hp messagesController13 = profileActivity.getMessagesController();
                    j33 = profileActivity.e1;
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.bd.Z(2131746629, org.telegram.messenger.l10.k(messagesController13.a2(Long.valueOf(j33)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                ki.c cVar = (ki.c) view;
                chat11 = profileActivity.E2;
                if (chat11 == null) {
                    j34 = profileActivity.e1;
                    if (j34 != 0) {
                        org.telegram.messenger.hp messagesController14 = profileActivity.getMessagesController();
                        j35 = profileActivity.e1;
                        TLRPC.User a29 = messagesController14.a2(Long.valueOf(j35));
                        if (a29 != null) {
                            i103 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                            cVar.a(i103, profileActivity.getMessagesController().M0(Long.valueOf(a29.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i104 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                    org.telegram.messenger.hp messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.E2;
                    cVar.a(i104, messagesController15.M0(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        View paVar;
        View view;
        boolean z11 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i3) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case org.telegram.messenger.hs.T /* 30 */:
                org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
                if (i3 == 30) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                vv0 vv0Var = new vv0(this, this.c, e6Var, z11, i3 == 19 ? true : z10);
                vv0Var.setContentDescriptionValueFirst(true);
                paVar = vv0Var;
                break;
            case 3:
                wv0 wv0Var = new wv0(this, context, profileActivity, profileActivity.A0);
                profileActivity.e6 = wv0Var;
                paVar = wv0Var;
                break;
            case 4:
                paVar = new jr(this, context, profileActivity.A0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.A0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new xv0(this, context, profileActivity.A0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                paVar = new org.telegram.ui.Cells.pa(profileActivity.w4 == -1 ? 9 : 6, 0, this.c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(10, context, profileActivity.A0);
                y8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.A6, profileActivity.A0);
                y8Var.getTextView().setMovementMethod(null);
                y8Var.setText(org.telegram.messenger.g0.D0());
                y8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = y8Var;
                break;
            case 11:
            case org.telegram.messenger.hs.U /* 31 */:
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(i3 == 31 ? 12.0f : 6.0f), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                View yv0Var = new yv0(this, context);
                yv0Var.setBackground(new ColorDrawable(0));
                yv0Var.setTag(-33024);
                view = yv0Var;
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
                paVar = new aw0(this, context, profileActivity.A0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View o1Var = new vg.o1(i3 == 18 ? 0 : 1, context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, o1Var, profileActivity.A0);
                paVar = o1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.q8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View h1Var = new lg.h1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h1Var, profileActivity.A0);
                paVar = h1Var;
                break;
            case 22:
                View zv0Var = new zv0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, zv0Var, profileActivity.A0);
                paVar = zv0Var;
                break;
            case 23:
                paVar = new sv0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                gi.d dVar = new gi.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.bd.M0(2131746716, null), false, true);
                dVar.setOnClickListener(new pv0(this, false ? 1 : 0));
                frameLayout.addView(dVar, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, profileActivity.A0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 27:
                paVar = new ii.h(context, profileActivity.A0);
                break;
            case 28:
                View smVar = new org.telegram.ui.Components.sm(context, 22);
                smVar.setTag(-33024);
                view = smVar;
                paVar = view;
                break;
            case 32:
                paVar = new nw0(profileActivity, context);
                break;
            case 33:
                paVar = new ki.c(context, profileActivity.A0);
                break;
        }
        if (i3 != 13) {
            paVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.bj0(paVar);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        View view = d1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            ((org.telegram.ui.Cells.w8) view).a.setLoading(profileActivity.j5);
            ((org.telegram.ui.Cells.w8) view).b.setLoading(profileActivity.j5);
        }
    }

    @Override // u4.h0
    public final void z(u4.d1 d1Var) {
        View view = d1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
