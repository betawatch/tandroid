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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class jw0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public jw0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.N2) {
            profileActivity.L2 = null;
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.e3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.e3 && b10 != profileActivity.S2 && b10 != profileActivity.g3 && b10 != profileActivity.f3 && b10 != profileActivity.U2 && b10 != profileActivity.V2 && b10 != profileActivity.y3 && b10 != profileActivity.h3 && b10 != profileActivity.i3 && b10 != profileActivity.p3 && b10 != profileActivity.m3 && b10 != profileActivity.j3 && b10 != profileActivity.l3 && b10 != profileActivity.q3 && b10 != profileActivity.r3 && b10 != profileActivity.u3 && b10 != profileActivity.v3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.N2 && b10 != profileActivity.Z3 && b10 != profileActivity.b4 && b10 != profileActivity.f4 && b10 != profileActivity.e4 && b10 != profileActivity.k3 && b10 != profileActivity.T2 && b10 != profileActivity.P2 && b10 != profileActivity.c4 && b10 != profileActivity.d4 && b10 != profileActivity.k4) {
                return false;
            }
        } else {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.t10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = d1Var.f;
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
                    SpannableString spannableString = new SpannableString(rf.b.i("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        cw0 cw0Var = new cw0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, cw0Var);
                        clickableSpan = cw0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.Uc, this.e.z0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i10 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = org.telegram.messenger.id.M0(2131743671, null);
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

    @Override // v4.g0
    public final int b() {
        return this.e.M2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e;
        if (i7 == profileActivity.C3 || i7 == profileActivity.s4 || i7 == profileActivity.d3 || i7 == profileActivity.R2 || i7 == profileActivity.o3 || i7 == profileActivity.t3 || i7 == profileActivity.m4) {
            return 1;
        }
        if (i7 == profileActivity.F3 || i7 == profileActivity.H3 || i7 == profileActivity.S2 || i7 == profileActivity.T2) {
            return 2;
        }
        if (i7 == profileActivity.K3 || i7 == profileActivity.U2) {
            return 19;
        }
        if (i7 == profileActivity.G3) {
            return 30;
        }
        if (i7 == profileActivity.I3 || i7 == profileActivity.J3 || i7 == profileActivity.V2) {
            return 3;
        }
        if (i7 == profileActivity.p4 || i7 == profileActivity.q4 || i7 == profileActivity.U3 || i7 == profileActivity.W3 || i7 == profileActivity.V3 || i7 == profileActivity.w4 || i7 == profileActivity.x4 || i7 == profileActivity.y4 || i7 == profileActivity.z4 || i7 == profileActivity.F4 || i7 == profileActivity.v4 || i7 == profileActivity.L4 || i7 == profileActivity.K4 || i7 == profileActivity.T3 || i7 == profileActivity.e3 || i7 == profileActivity.g3 || i7 == profileActivity.f3 || i7 == profileActivity.h3 || i7 == profileActivity.i3 || i7 == profileActivity.p3 || i7 == profileActivity.m3 || i7 == profileActivity.j3 || i7 == profileActivity.l3 || i7 == profileActivity.q3 || i7 == profileActivity.r3 || i7 == profileActivity.u3 || i7 == profileActivity.v3 || i7 == profileActivity.w3 || i7 == profileActivity.x3 || i7 == profileActivity.N2 || i7 == profileActivity.Z3 || i7 == profileActivity.Y3 || i7 == profileActivity.k3 || i7 == profileActivity.f4 || i7 == profileActivity.e4 || i7 == profileActivity.A4 || i7 == profileActivity.B4 || i7 == profileActivity.C4) {
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
        if (i7 == i12 || i7 == profileActivity.d4) {
            return 4;
        }
        if (i7 == profileActivity.L3) {
            return 5;
        }
        if (i7 == profileActivity.M3) {
            return 6;
        }
        if (i7 == profileActivity.P3) {
            return 20;
        }
        if (i7 == profileActivity.M4 || i7 == profileActivity.G4 || i7 == profileActivity.l4 || i7 == profileActivity.r4 || i7 == profileActivity.c3 || i7 == profileActivity.n3 || i7 == profileActivity.s3 || i7 == profileActivity.O2 || i7 == profileActivity.a3 || i7 == profileActivity.W2 || i7 == profileActivity.g4 || i7 == profileActivity.X3 || i7 == profileActivity.Q2 || i7 == profileActivity.Y2 || i7 == profileActivity.E4 || i7 == profileActivity.o4 || i7 == profileActivity.D4 || i7 == profileActivity.j4) {
            return 7;
        }
        if (i7 >= profileActivity.t4 && i7 < profileActivity.u4) {
            return 8;
        }
        if (i7 == profileActivity.z3) {
            return 11;
        }
        if (i7 == profileActivity.A3) {
            return 31;
        }
        if (i7 == profileActivity.B3) {
            return 12;
        }
        if (i7 == profileActivity.J4) {
            return 13;
        }
        if (i7 == profileActivity.y3) {
            return 14;
        }
        if (i7 == profileActivity.b3 || i7 == profileActivity.Z2 || i7 == profileActivity.X2) {
            return 15;
        }
        if (i7 == profileActivity.a4) {
            return 17;
        }
        if (i7 == profileActivity.b4) {
            return 18;
        }
        if (i7 == profileActivity.c4) {
            return 24;
        }
        if (i7 == profileActivity.O3) {
            return 21;
        }
        if (i7 == profileActivity.N3) {
            return 22;
        }
        if (i7 == profileActivity.P2) {
            return 23;
        }
        if (i7 == profileActivity.h4) {
            return 25;
        }
        if (i7 == profileActivity.Q3 || i7 == profileActivity.S3) {
            return 26;
        }
        if (i7 == profileActivity.i4) {
            return 32;
        }
        if (i7 == profileActivity.k4) {
            return 33;
        }
        if (i7 == profileActivity.R3) {
            return 27;
        }
        return (i7 == profileActivity.D3 || i7 == profileActivity.E3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:562:0x0e9e, code lost:
    
        if (r0.about != null) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023f  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
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
        boolean z9;
        String str3;
        String str4;
        String str5;
        long j10;
        long j11;
        long j12;
        String str6;
        boolean z10;
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
        boolean z11;
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
        boolean z12;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User a22;
        boolean z13;
        boolean z14;
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
        boolean z15;
        int i73;
        boolean z16;
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
        boolean z17;
        boolean z18;
        org.telegram.messenger.dt notificationsController;
        boolean z19;
        long j26;
        long j27;
        String str11;
        final boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        long j28;
        boolean z24;
        boolean z25;
        boolean z26;
        int i95;
        int i96;
        int i97;
        long j29;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z27;
        boolean z28;
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
        ArrayList arrayList = profileActivity.Q4;
        ArrayList arrayList2 = profileActivity.R4;
        HashSet hashSet = profileActivity.h5;
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
        boolean z29 = true;
        int i107 = 0;
        switch (i105) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                i10 = profileActivity.C3;
                if (i7 == i10) {
                    chat = profileActivity.D2;
                    if (org.telegram.messenger.t3.T(chat)) {
                        chat2 = profileActivity.D2;
                        if (!chat2.megagroup && profileActivity.J3 != -1) {
                            n4Var.setText(org.telegram.messenger.id.L0(2131746231));
                        }
                    }
                    n4Var.setText(org.telegram.messenger.id.L0(2131749198));
                } else {
                    i11 = profileActivity.s4;
                    if (i7 == i11) {
                        n4Var.setText(org.telegram.messenger.id.L0(2131752377));
                    } else {
                        i12 = profileActivity.d3;
                        if (i7 == i12) {
                            n4Var.setText(org.telegram.messenger.id.L0(2131745986));
                        } else {
                            i13 = profileActivity.R2;
                            if (i7 == i13) {
                                n4Var.setText(org.telegram.messenger.id.L0(2131754710));
                            } else {
                                i14 = profileActivity.o3;
                                if (i7 == i14) {
                                    n4Var.setText(org.telegram.messenger.id.L0(2131745482));
                                } else {
                                    i15 = profileActivity.t3;
                                    if (i7 == i15) {
                                        n4Var.setText(org.telegram.messenger.id.L0(2131745489));
                                    } else {
                                        i16 = profileActivity.m4;
                                        if (i7 == i16) {
                                            n4Var.setText(org.telegram.messenger.id.L0(2131753006));
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
            case org.telegram.messenger.qs.T /* 30 */:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i7 == profileActivity.T2) {
                    org.telegram.messenger.qp messagesController = profileActivity.getMessagesController();
                    j19 = profileActivity.d1;
                    TLRPC.UserFull b22 = messagesController.b2(j19);
                    if (b22 != null && b22.birthday != null) {
                        boolean d = org.telegram.messenger.v1.d(b22);
                        TL_account.TL_birthday tL_birthday = b22.birthday;
                        boolean z30 = (tL_birthday.flags & 1) != 0;
                        int years = z30 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String e02 = UserInfoActivity.e0(b22.birthday);
                        if (z30) {
                            Z = org.telegram.messenger.id.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", e02);
                        } else {
                            Z = org.telegram.messenger.id.Z(d ? 2131746722 : 2131746719, e02);
                        }
                        x8Var.c(org.telegram.messenger.i6.p(Z, x8Var.a, new d10(this, d1Var, i7, 9)), org.telegram.messenger.id.L0(d ? 2131746723 : 2131746725), (!profileActivity.p1 && profileActivity.N3 == -1 && profileActivity.O3 == -1) ? false : true);
                        if (!profileActivity.r1 && d && !profileActivity.getMessagesController().h7) {
                            i27 = 1;
                            z9 = false;
                            i107 = i27;
                        }
                    }
                    i27 = 0;
                    z9 = false;
                    i107 = i27;
                } else {
                    i17 = profileActivity.F3;
                    if (i7 == i17) {
                        org.telegram.messenger.qp messagesController2 = profileActivity.getMessagesController();
                        j18 = profileActivity.d1;
                        TLRPC.User a24 = messagesController2.a2(Long.valueOf(j18));
                        if (a24 != null && !TextUtils.isEmpty(profileActivity.d5)) {
                            L02 = org.telegram.messenger.k5.i(new StringBuilder("+"), profileActivity.d5, pf.b.c());
                            str8 = profileActivity.d5;
                        } else if (a24 == null || TextUtils.isEmpty(a24.phone)) {
                            L02 = org.telegram.messenger.id.L0(2131747295);
                            str8 = null;
                        } else {
                            String i108 = org.telegram.messenger.k5.i(new StringBuilder("+"), a24.phone, pf.b.c());
                            str8 = a24.phone;
                            L02 = i108;
                        }
                        profileActivity.b5 = str8 != null && str8.matches("888\\d{8}");
                        z11 = profileActivity.b5;
                        x8Var.c(L02, org.telegram.messenger.id.L0(z11 ? 2131754251 : 2131747292), false);
                    } else {
                        i18 = profileActivity.G3;
                        if (i7 == i18) {
                            org.telegram.messenger.qp messagesController3 = profileActivity.getMessagesController();
                            j17 = profileActivity.d1;
                            TLRPC.UserFull b23 = messagesController3.b2(j17);
                            if (b23 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = b23.note;
                                i26 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                if (org.telegram.messenger.p10.i(i26).q()) {
                                    h02 = org.telegram.messenger.ij.h0(tL_textWithEntities, false);
                                    if (!(h02 instanceof SpannableStringBuilder)) {
                                        h02 = new SpannableStringBuilder(h02);
                                    }
                                    org.telegram.messenger.g0.c((SpannableStringBuilder) h02, 1, false, false);
                                } else {
                                    h02 = org.telegram.messenger.ij.h0(org.telegram.messenger.ij.y5(tL_textWithEntities), false);
                                }
                                x8Var.d(h02, org.telegram.messenger.id.L0(2131746651), org.telegram.messenger.id.L0(2131746650));
                            }
                        } else {
                            i19 = profileActivity.K3;
                            if (i7 == i19) {
                                ArrayList arrayList3 = new ArrayList();
                                j3 = profileActivity.d1;
                                if (j3 != 0) {
                                    org.telegram.messenger.qp messagesController4 = profileActivity.getMessagesController();
                                    j16 = profileActivity.d1;
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
                                    String L03 = org.telegram.messenger.id.L0(2131743677);
                                    if (str5 != null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                cw0 cw0Var = new cw0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, cw0Var);
                                                clickableSpan = cw0Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str7 = spannableString;
                                        }
                                    } else {
                                        str7 = "—";
                                    }
                                    z9 = !profileActivity.r1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str7;
                                    arrayList3 = arrayList5;
                                    str4 = L03;
                                } else {
                                    chat3 = profileActivity.D2;
                                    if (chat3 != null) {
                                        org.telegram.messenger.qp messagesController5 = profileActivity.getMessagesController();
                                        j10 = profileActivity.e1;
                                        TLRPC.Chat M0 = messagesController5.M0(Long.valueOf(j10));
                                        String K = org.telegram.messenger.t3.K(M0, false);
                                        if (M0 != null) {
                                            arrayList3.addAll(M0.usernames);
                                        }
                                        if (org.telegram.messenger.t3.t0(M0)) {
                                            z10 = !profileActivity.r1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().U2);
                                            sb2.append("/");
                                            sb2.append(K);
                                            j14 = profileActivity.f1;
                                            String str15 = str12;
                                            if (j14 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j15 = profileActivity.f1;
                                                sb3.append(j15);
                                                str15 = sb3.toString();
                                            }
                                            sb2.append(str15);
                                            str6 = sb2.toString();
                                            str4 = org.telegram.messenger.id.L0(2131749150);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().U2);
                                            sb4.append("/c/");
                                            j11 = profileActivity.e1;
                                            sb4.append(j11);
                                            j12 = profileActivity.f1;
                                            String str16 = str12;
                                            if (j12 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j13 = profileActivity.f1;
                                                sb5.append(j13);
                                                str16 = sb5.toString();
                                            }
                                            sb4.append(str16);
                                            String sb6 = sb4.toString();
                                            str4 = org.telegram.messenger.id.L0(2131749146);
                                            str6 = sb6;
                                            z10 = false;
                                        }
                                        str5 = K;
                                        z9 = z10;
                                        str3 = str6;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        z9 = false;
                                        str3 = "";
                                        str4 = str3;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i25 = profileActivity.E3;
                                x8Var.c(str3, E, i25 == -1 && !(!profileActivity.p1 && profileActivity.N3 == -1 && profileActivity.O3 == -1) && profileActivity.T2 < 0);
                            } else {
                                i20 = profileActivity.H3;
                                if (i7 == i20) {
                                    chatFull = profileActivity.t2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.t2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.t2;
                                            x8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, org.telegram.messenger.id.L0(2131753961), false);
                                        }
                                    }
                                } else {
                                    i21 = profileActivity.S2;
                                    if (i7 == i21) {
                                        i24 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                        TLRPC.User f10 = org.telegram.messenger.p10.i(i24).f();
                                        x8Var.c((f10 == null || (str2 = f10.phone) == null || str2.length() == 0) ? org.telegram.messenger.id.L0(2131747833) : org.telegram.messenger.k5.i(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.id.L0(2131744263), true);
                                        x8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i22 = profileActivity.U2;
                                        if (i7 == i22) {
                                            i23 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                            TLRPC.User f11 = org.telegram.messenger.p10.i(i23).f();
                                            String L04 = org.telegram.messenger.id.L0(2131743677);
                                            if (f11 == null || f11.usernames.size() <= 0) {
                                                String n10 = org.telegram.messenger.t10.n(f11);
                                                if (f11 == null || TextUtils.isEmpty(n10)) {
                                                    L0 = org.telegram.messenger.id.L0(2131743664);
                                                    charSequence = L04;
                                                } else {
                                                    L0 = rf.b.i("@", n10);
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
                                                L0 = (str == null || TextUtils.isEmpty(str)) ? org.telegram.messenger.id.L0(2131743664) : "@".concat(str);
                                                charSequence = E(str, f11.usernames, L04);
                                            }
                                            x8Var.c(L0, charSequence, true);
                                            x8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z9 = false;
                }
                if (i107 != 0) {
                    Drawable d2 = f0.d.d(x8Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.V6);
                    RectF rectF = ProfileActivity.S6;
                    d2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.N6 = d2;
                    userFull = profileActivity.u2;
                    if (org.telegram.messenger.t10.b(userFull)) {
                        x8Var.setImage(null);
                        x8Var.setImageClickListener(null);
                    } else {
                        x8Var.b(d2, org.telegram.messenger.id.L0(2131749681));
                        x8Var.setImageClickListener(new zt0(profileActivity, 12));
                    }
                } else if (z9) {
                    Drawable d10 = f0.d.d(x8Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.v8);
                    RectF rectF2 = ProfileActivity.S6;
                    d10.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.O6 = d10;
                    x8Var.b(d10, org.telegram.messenger.id.L0(2131750473));
                    x8Var.setImageClickListener(new zt0(profileActivity, i106));
                } else {
                    x8Var.setImage(null);
                    x8Var.setImageClickListener(null);
                }
                x8Var.setTag(Integer.valueOf(i7));
                x8Var.a.setLoading(profileActivity.i5);
                x8Var.b.setLoading(profileActivity.i5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i28 = profileActivity.I3;
                if (i7 == i28) {
                    userFull8 = profileActivity.u2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.u2;
                        a22 = userFull12.user;
                    } else {
                        org.telegram.messenger.qp messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.u2;
                        a22 = messagesController6.a2(Long.valueOf(userFull9.id));
                    }
                    z13 = profileActivity.q2;
                    if (!z13) {
                        if (a22 != null && a22.premium) {
                            userFull11 = profileActivity.u2;
                            break;
                        }
                        z14 = false;
                        userFull10 = profileActivity.u2;
                        jVar.f(userFull10.about, org.telegram.messenger.id.L0(2131743768), z14);
                        break;
                    }
                    z14 = true;
                    userFull10 = profileActivity.u2;
                    jVar.f(userFull10.about, org.telegram.messenger.id.L0(2131743768), z14);
                } else if (i7 == profileActivity.J3) {
                    chatFull4 = profileActivity.t2;
                    String str17 = chatFull4.about;
                    while (str17.contains("\n\n\n")) {
                        str17 = str17.replace("\n\n\n", "\n\n");
                    }
                    String L05 = org.telegram.messenger.id.L0(2131751460);
                    chat4 = profileActivity.D2;
                    if (org.telegram.messenger.t3.T(chat4)) {
                        chat5 = profileActivity.D2;
                        if (!chat5.megagroup) {
                            z12 = true;
                            jVar.f(str17, L05, z12);
                            break;
                        }
                    }
                    z12 = false;
                    jVar.f(str17, L05, z12);
                } else {
                    i29 = profileActivity.V2;
                    if (i7 == i29) {
                        userFull2 = profileActivity.u2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.u2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(org.telegram.messenger.id.L0(2131743768), org.telegram.messenger.id.L0(2131743767), false);
                                profileActivity.y2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.u2;
                        if (userFull3 == null) {
                            str9 = org.telegram.messenger.id.L0(2131748780);
                        } else {
                            userFull4 = profileActivity.u2;
                            str9 = userFull4.about;
                        }
                        jVar.f(str9, org.telegram.messenger.id.L0(2131743768), profileActivity.getUserConfig().q());
                        userFull5 = profileActivity.u2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.u2;
                            str10 = userFull6.about;
                        } else {
                            str10 = null;
                        }
                        profileActivity.y2 = str10;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i111 = org.telegram.ui.ActionBar.k6.m6;
                int i112 = org.telegram.ui.ActionBar.k6.G6;
                m8Var.g(i111, i112);
                m8Var.setTag(Integer.valueOf(i112));
                i30 = profileActivity.p4;
                if (i7 == i30) {
                    int i113 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.h1))).ttl;
                    m8Var.q(org.telegram.messenger.id.L0(2131748588), i113 == 0 ? org.telegram.messenger.id.L0(2131745364) : org.telegram.messenger.id.c0(i113), false, false);
                } else {
                    i31 = profileActivity.K4;
                    if (i7 == i31) {
                        m8Var.k(org.telegram.messenger.id.L0(2131743914), false);
                        m8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                    } else {
                        i32 = profileActivity.q4;
                        if (i7 == i32) {
                            org.telegram.ui.Components.d30 d30Var = new org.telegram.ui.Components.d30();
                            TLRPC.EncryptedChat a12 = profileActivity.getMessagesController().a1(Integer.valueOf(org.telegram.messenger.m5.h(profileActivity.h1)));
                            byte[] bArr = a12.key_hash;
                            d30Var.a = bArr;
                            if (bArr == null) {
                                byte[] bArr2 = a12.auth_key;
                                Typeface typeface = org.telegram.messenger.g0.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                                d30Var.a = bArr3;
                                a12.key_hash = bArr3;
                            }
                            d30Var.invalidateSelf();
                            m8Var.v(org.telegram.messenger.id.L0(2131751133), d30Var, false);
                        } else {
                            i33 = profileActivity.L4;
                            if (i7 == i33) {
                                m8Var.g(-1, org.telegram.ui.ActionBar.k6.o6);
                                chat10 = profileActivity.D2;
                                if (chat10.megagroup) {
                                    m8Var.k(org.telegram.messenger.id.L0(2131746662), false);
                                } else {
                                    m8Var.k(org.telegram.messenger.id.L0(2131746663), false);
                                }
                            } else {
                                i34 = profileActivity.w4;
                                if (i7 == i34) {
                                    chatFull12 = profileActivity.t2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.D2;
                                        if (org.telegram.messenger.t3.T(chat8)) {
                                            chat9 = profileActivity.D2;
                                            if (!chat9.megagroup) {
                                                String L06 = org.telegram.messenger.id.L0(2131752289);
                                                chatFull14 = profileActivity.t2;
                                                String E2 = org.telegram.messenger.id.E(chatFull14.participants_count, ',');
                                                i92 = profileActivity.G4;
                                                m8Var.s(L06, E2, R.drawable.msg_groups, i7 != i92 - 1);
                                            }
                                        }
                                        String L07 = org.telegram.messenger.id.L0(2131752377);
                                        chatFull13 = profileActivity.t2;
                                        String E3 = org.telegram.messenger.id.E(chatFull13.participants_count, ',');
                                        i91 = profileActivity.G4;
                                        m8Var.s(L07, E3, R.drawable.msg_groups, i7 != i91 - 1);
                                    } else {
                                        chat6 = profileActivity.D2;
                                        if (org.telegram.messenger.t3.T(chat6)) {
                                            chat7 = profileActivity.D2;
                                            if (!chat7.megagroup) {
                                                String L08 = org.telegram.messenger.id.L0(2131752289);
                                                i90 = profileActivity.G4;
                                                m8Var.o(R.drawable.msg_groups, L08, i7 != i90 - 1);
                                            }
                                        }
                                        String L09 = org.telegram.messenger.id.L0(2131752377);
                                        i89 = profileActivity.G4;
                                        m8Var.o(R.drawable.msg_groups, L09, i7 != i89 - 1);
                                    }
                                } else {
                                    i35 = profileActivity.x4;
                                    if (i7 == i35) {
                                        chatFull10 = profileActivity.t2;
                                        if (chatFull10 != null) {
                                            String L010 = org.telegram.messenger.id.L0(2131744439);
                                            chatFull11 = profileActivity.t2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            i88 = profileActivity.G4;
                                            m8Var.s(L010, format, R.drawable.msg_requests, i7 != i88 - 1);
                                        }
                                    } else {
                                        i36 = profileActivity.y4;
                                        if (i7 == i36) {
                                            chatFull8 = profileActivity.t2;
                                            if (chatFull8 != null) {
                                                String L011 = org.telegram.messenger.id.L0(2131752517);
                                                chatFull9 = profileActivity.t2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                i87 = profileActivity.G4;
                                                m8Var.s(L011, format2, R.drawable.msg_admins, i7 != i87 - 1);
                                            } else {
                                                String L012 = org.telegram.messenger.id.L0(2131752517);
                                                i86 = profileActivity.G4;
                                                m8Var.o(R.drawable.msg_admins, L012, i7 != i86 - 1);
                                            }
                                        } else {
                                            i37 = profileActivity.z4;
                                            if (i7 == i37) {
                                                String L013 = org.telegram.messenger.id.L0(2131752519);
                                                i85 = profileActivity.G4;
                                                m8Var.o(R.drawable.msg_customize, L013, i7 != i85 - 1);
                                            } else {
                                                i38 = profileActivity.C4;
                                                if (i7 == i38) {
                                                    i83 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                    bi.n0 g10 = bi.n0.g(i83);
                                                    j23 = profileActivity.e1;
                                                    TL_stars.StarsAmount c10 = g10.c(-j23);
                                                    i84 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                    bi.n0 g11 = bi.n0.g(i84);
                                                    j24 = profileActivity.e1;
                                                    long i114 = g11.i(-j24);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i114 > 0) {
                                                        double d11 = i114 / 1.0E9d;
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
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) bi.dd.N0(c10, 0.777f, ' '));
                                                    }
                                                    m8Var.s(org.telegram.messenger.id.L0(2131752290), zd.K(bi.dd.a1(false, spannableStringBuilder, 0.7f, null), m8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i39 = profileActivity.A4;
                                                    if (i7 == i39) {
                                                        i82 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                        bi.n0 g12 = bi.n0.g(i82);
                                                        j22 = profileActivity.d1;
                                                        TL_stars.StarsAmount c11 = g12.c(j22);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c11.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) bi.dd.N0(c11, 0.777f, ' '));
                                                        }
                                                        m8Var.s(org.telegram.messenger.id.L0(2131753111), zd.K(bi.dd.a1(false, spannableStringBuilder2, 0.7f, null), m8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i40 = profileActivity.B4;
                                                        if (i7 == i40) {
                                                            i81 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                            bi.n0 g13 = bi.n0.g(i81);
                                                            j21 = profileActivity.d1;
                                                            long i115 = g13.i(j21);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i115 > 0) {
                                                                double d12 = i115 / 1.0E9d;
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
                                                            m8Var.s(org.telegram.messenger.id.L0(2131753110), zd.K(bi.dd.a1(false, spannableStringBuilder3, 0.7f, null), m8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i41 = profileActivity.F4;
                                                            if (i7 == i41) {
                                                                chatFull5 = profileActivity.t2;
                                                                if (chatFull5 != null) {
                                                                    String L014 = org.telegram.messenger.id.L0(2131752453);
                                                                    chatFull6 = profileActivity.t2;
                                                                    int i116 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.t2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i116, chatFull7.kicked_count)));
                                                                    i80 = profileActivity.G4;
                                                                    m8Var.s(L014, format3, R.drawable.msg_user_remove, i7 != i80 - 1);
                                                                } else {
                                                                    String L015 = org.telegram.messenger.id.L0(2131752453);
                                                                    i79 = profileActivity.G4;
                                                                    m8Var.o(R.drawable.msg_user_remove, L015, i7 != i79 - 1);
                                                                }
                                                            } else {
                                                                i42 = profileActivity.v4;
                                                                if (i7 == i42) {
                                                                    m8Var.g(i111, i112);
                                                                    int i117 = i7 + 1;
                                                                    boolean z31 = i117 >= profileActivity.t4 && i117 < profileActivity.u4;
                                                                    String L016 = org.telegram.messenger.id.L0(2131754401);
                                                                    i78 = profileActivity.G4;
                                                                    m8Var.o(R.drawable.msg_contact_add, L016, i78 == -1 || z31);
                                                                } else {
                                                                    i43 = profileActivity.T3;
                                                                    if (i7 == i43) {
                                                                        m8Var.k(org.telegram.messenger.id.L0(2131745602), true);
                                                                    } else {
                                                                        i44 = profileActivity.Y3;
                                                                        if (i7 == i44) {
                                                                            m8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.id.L0(2131754377), false);
                                                                            m8Var.g(i111, i112);
                                                                        } else {
                                                                            i45 = profileActivity.V3;
                                                                            if (i7 == i45) {
                                                                                m8Var.o(R.drawable.menu_reaction_delete_24, org.telegram.messenger.id.L0(2131751508), false);
                                                                                m8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                            } else {
                                                                                i46 = profileActivity.W3;
                                                                                if (i7 == i46) {
                                                                                    org.telegram.messenger.qp messagesController7 = profileActivity.getMessagesController();
                                                                                    j20 = profileActivity.a5;
                                                                                    TLRPC.Chat M02 = messagesController7.M0(Long.valueOf(-j20));
                                                                                    if (M02 == null || !org.telegram.messenger.t3.w(2, M02)) {
                                                                                        m8Var.o(R.drawable.msg_report, org.telegram.messenger.id.L0(2131746214), false);
                                                                                    } else {
                                                                                        m8Var.o(R.drawable.msg_block2, org.telegram.messenger.id.L0(2131746213), false);
                                                                                    }
                                                                                    m8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                                                                                } else {
                                                                                    i47 = profileActivity.U3;
                                                                                    if (i7 == i47) {
                                                                                        m8Var.k(org.telegram.messenger.id.L0(2131746189), false);
                                                                                        int i118 = org.telegram.ui.ActionBar.k6.p7;
                                                                                        m8Var.g(-1, i118);
                                                                                        m8Var.g(-1, i118);
                                                                                    } else {
                                                                                        i48 = profileActivity.f3;
                                                                                        if (i7 == i48) {
                                                                                            m8Var.u(org.telegram.messenger.id.L0(2131749055), org.telegram.messenger.id.j0(), false, R.drawable.msg2_language, false);
                                                                                            m8Var.setImageLeft(23);
                                                                                        } else {
                                                                                            i49 = profileActivity.e3;
                                                                                            if (i7 == i49) {
                                                                                                m8Var.o(R.drawable.msg2_notifications, org.telegram.messenger.id.L0(2131747923), true);
                                                                                            } else {
                                                                                                i50 = profileActivity.g3;
                                                                                                if (i7 == i50) {
                                                                                                    m8Var.o(R.drawable.msg2_secret, org.telegram.messenger.id.L0(2131746772), true);
                                                                                                } else {
                                                                                                    i51 = profileActivity.h3;
                                                                                                    if (i7 == i51) {
                                                                                                        m8Var.o(R.drawable.msg2_data, org.telegram.messenger.id.L0(2131751678), true);
                                                                                                    } else {
                                                                                                        i52 = profileActivity.i3;
                                                                                                        if (i7 == i52) {
                                                                                                            m8Var.o(R.drawable.msg2_discussion, org.telegram.messenger.id.L0(2131752210), true);
                                                                                                        } else {
                                                                                                            i53 = profileActivity.j3;
                                                                                                            if (i7 == i53) {
                                                                                                                m8Var.o(R.drawable.msg2_folder, org.telegram.messenger.id.L0(2131750697), true);
                                                                                                            } else {
                                                                                                                i54 = profileActivity.l3;
                                                                                                                if (i7 == i54) {
                                                                                                                    m8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.id.L0(2131744860), true);
                                                                                                                } else {
                                                                                                                    i55 = profileActivity.k3;
                                                                                                                    if (i7 == i55) {
                                                                                                                        m8Var.o(R.drawable.msg2_battery, org.telegram.messenger.id.L0(2131747067), true);
                                                                                                                    } else {
                                                                                                                        i56 = profileActivity.p3;
                                                                                                                        if (i7 == i56) {
                                                                                                                            m8Var.o(R.drawable.msg2_ask_question, org.telegram.messenger.id.L0(2131753986), true);
                                                                                                                        } else {
                                                                                                                            i57 = profileActivity.q3;
                                                                                                                            if (i7 == i57) {
                                                                                                                                m8Var.o(R.drawable.msg2_help, org.telegram.messenger.id.L0(2131744245), true);
                                                                                                                            } else {
                                                                                                                                i58 = profileActivity.r3;
                                                                                                                                if (i7 == i58) {
                                                                                                                                    m8Var.o(R.drawable.msg2_policy, org.telegram.messenger.id.L0(2131746784), false);
                                                                                                                                } else {
                                                                                                                                    i59 = profileActivity.u3;
                                                                                                                                    if (i7 == i59) {
                                                                                                                                        m8Var.k(org.telegram.messenger.id.L0(2131751614), true);
                                                                                                                                    } else {
                                                                                                                                        i60 = profileActivity.v3;
                                                                                                                                        if (i7 == i60) {
                                                                                                                                            m8Var.k(org.telegram.messenger.id.L0(2131751615), true);
                                                                                                                                        } else {
                                                                                                                                            i61 = profileActivity.w3;
                                                                                                                                            if (i7 == i61) {
                                                                                                                                                m8Var.k(org.telegram.messenger.id.L0(2131751651), profileActivity.x3 != -1);
                                                                                                                                            } else if (i7 == profileActivity.x3) {
                                                                                                                                                m8Var.k("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i62 = profileActivity.m3;
                                                                                                                                                if (i7 == i62) {
                                                                                                                                                    m8Var.o(R.drawable.msg2_devices, org.telegram.messenger.id.L0(2131751456), true);
                                                                                                                                                } else {
                                                                                                                                                    i63 = profileActivity.N2;
                                                                                                                                                    if (i7 == i63) {
                                                                                                                                                        profileActivity.V.P(86);
                                                                                                                                                        profileActivity.V.L();
                                                                                                                                                        m8Var.p(org.telegram.messenger.id.L0(2131745519), profileActivity.V, false);
                                                                                                                                                        m8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                                                                                                                                                        m8Var.getImageView().setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                                                                                                                                                        m8Var.setImageLeft(12);
                                                                                                                                                        profileActivity.L2 = m8Var;
                                                                                                                                                    } else {
                                                                                                                                                        i64 = profileActivity.Z3;
                                                                                                                                                        if (i7 == i64) {
                                                                                                                                                            m8Var.o(R.drawable.msg_groups_create, org.telegram.messenger.id.L0(2131754372), false);
                                                                                                                                                        } else {
                                                                                                                                                            i65 = profileActivity.b4;
                                                                                                                                                            if (i7 == i65) {
                                                                                                                                                                m8Var.p(org.telegram.messenger.id.L0(2131744234), new org.telegram.ui.Components.h5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.x0) ia.e.d().g), true);
                                                                                                                                                                m8Var.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i66 = profileActivity.c4;
                                                                                                                                                                if (i7 == i66) {
                                                                                                                                                                    i77 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                                                                                                                                    bi.ea w10 = bi.ea.w(i77);
                                                                                                                                                                    long j35 = w10.p().amount;
                                                                                                                                                                    String L017 = org.telegram.messenger.id.L0(2131748605);
                                                                                                                                                                    CharSequence charSequence2 = str12;
                                                                                                                                                                    if (w10.e) {
                                                                                                                                                                        charSequence2 = str12;
                                                                                                                                                                        if (j35 > 0) {
                                                                                                                                                                            charSequence2 = bi.dd.M0(w10.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    m8Var.t(L017, charSequence2, new org.telegram.ui.Components.h5(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), (ug.x0) ia.e.d().i), true);
                                                                                                                                                                    m8Var.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i67 = profileActivity.d4;
                                                                                                                                                                    if (i7 == i67) {
                                                                                                                                                                        i76 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                                                                                                                                                                        bi.ea L = bi.ea.L(i76);
                                                                                                                                                                        long j36 = L.p().amount;
                                                                                                                                                                        String L018 = org.telegram.messenger.id.L0(2131748301);
                                                                                                                                                                        CharSequence charSequence3 = str12;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str12;
                                                                                                                                                                            if (j36 > 0) {
                                                                                                                                                                                charSequence3 = bi.dd.M0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        m8Var.s(L018, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        m8Var.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i68 = profileActivity.e4;
                                                                                                                                                                        if (i7 == i68) {
                                                                                                                                                                            m8Var.o(R.drawable.menu_shop, org.telegram.messenger.id.L0(2131744255), true);
                                                                                                                                                                            m8Var.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i69 = profileActivity.f4;
                                                                                                                                                                            if (i7 == i69) {
                                                                                                                                                                                m8Var.o(R.drawable.menu_gift, org.telegram.messenger.id.L0(2131745642), false);
                                                                                                                                                                                m8Var.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i70 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i7 == i70) {
                                                                                                                                                                                    String L019 = org.telegram.messenger.id.L0(2131753007);
                                                                                                                                                                                    hi.r0 r0Var = profileActivity.r2;
                                                                                                                                                                                    boolean z32 = r0Var != null && r0Var.g();
                                                                                                                                                                                    int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.ik);
                                                                                                                                                                                    i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    m8Var.m(L019, z32, R.drawable.filled_access_location, themedColor3, i75 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i71 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i7 == i71) {
                                                                                                                                                                                        String L020 = org.telegram.messenger.id.L0(2131753009);
                                                                                                                                                                                        hi.p pVar = profileActivity.s2;
                                                                                                                                                                                        m8Var.m(L020, pVar != null && pVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.lk), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i72 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i7 == i72) {
                                                                                                                                                                                            String L021 = org.telegram.messenger.id.L0(2131753008);
                                                                                                                                                                                            userFull13 = profileActivity.u2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.u2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z15 = true;
                                                                                                                                                                                                    int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.gk);
                                                                                                                                                                                                    i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i73 == -1) {
                                                                                                                                                                                                        i74 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i74 == -1) {
                                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                                            m8Var.m(L021, z15, R.drawable.filled_access_sleeping, themedColor4, z16);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    m8Var.m(L021, z15, R.drawable.filled_access_sleeping, themedColor4, z16);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z15 = false;
                                                                                                                                                                                            int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.gk);
                                                                                                                                                                                            i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i73 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = true;
                                                                                                                                                                                            m8Var.m(L021, z15, R.drawable.filled_access_sleeping, themedColor42, z16);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    m8Var = m8Var;
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
                org.telegram.ui.ActionBar.r6.Z(m8Var.c, org.telegram.ui.ActionBar.k6.I6, profileActivity.z0);
                break;
            case 6:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i93 = profileActivity.M3;
                if (i7 == i93) {
                    i94 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                    SharedPreferences x12 = org.telegram.messenger.qp.x1(i94);
                    long j37 = profileActivity.h1;
                    if (j37 == 0) {
                        j26 = profileActivity.d1;
                        if (j26 != 0) {
                            j37 = profileActivity.d1;
                        } else {
                            j27 = profileActivity.e1;
                            j37 = -j27;
                        }
                    }
                    j25 = profileActivity.f1;
                    String v = org.telegram.messenger.dt.v(j37, j25, false);
                    boolean z33 = x12.getBoolean("custom_" + v, false);
                    boolean contains = x12.contains("notify2_" + v);
                    int c12 = org.telegram.messenger.k5.c("notify2_", v, x12, 0);
                    int c13 = org.telegram.messenger.k5.c("notifyuntil_", v, x12, 0);
                    if (c12 == 3 && c13 != Integer.MAX_VALUE) {
                        int currentTime = c13 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str13 = z33 ? org.telegram.messenger.id.L0(2131747919) : org.telegram.messenger.id.L0(2131747893);
                            z18 = true;
                        } else {
                            if (currentTime < 3600) {
                                str13 = org.telegram.messenger.id.Y(2131742868, "WillUnmuteIn", org.telegram.messenger.id.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str13 = org.telegram.messenger.id.Y(2131742868, "WillUnmuteIn", org.telegram.messenger.id.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str13 = org.telegram.messenger.id.Y(2131742868, "WillUnmuteIn", org.telegram.messenger.id.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z18 = false;
                        }
                    } else if (c12 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z17 = notificationsController.C(j37);
                            if (z17 || !z33) {
                                str13 = !z17 ? org.telegram.messenger.id.L0(2131747893) : org.telegram.messenger.id.L0(2131747895);
                            } else {
                                str13 = org.telegram.messenger.id.L0(2131747919);
                            }
                            z18 = z17;
                        }
                        z17 = true;
                        if (z17) {
                        }
                        str13 = !z17 ? org.telegram.messenger.id.L0(2131747893) : org.telegram.messenger.id.L0(2131747895);
                        z18 = z17;
                    } else {
                        if (c12 != 1) {
                            z17 = false;
                            if (z17) {
                            }
                            str13 = !z17 ? org.telegram.messenger.id.L0(2131747893) : org.telegram.messenger.id.L0(2131747895);
                            z18 = z17;
                        }
                        z17 = true;
                        if (z17) {
                        }
                        str13 = !z17 ? org.telegram.messenger.id.L0(2131747893) : org.telegram.messenger.id.L0(2131747895);
                        z18 = z17;
                    }
                    if (str13 == null) {
                        str13 = org.telegram.messenger.id.L0(2131747895);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str13 = String.format(Locale.US, org.telegram.messenger.id.K0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str13, Integer.valueOf(hashSet.size()));
                    }
                    String str18 = str13;
                    z19 = profileActivity.l5;
                    h5Var.setAnimationsEnabled(z19);
                    h5Var.b(org.telegram.messenger.id.L0(2131747925), str18, 0, z18, 0, false, profileActivity.h4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i7));
                break;
            case 8:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i7 - profileActivity.t4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i7 - profileActivity.t4);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.f(e10);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str19 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.id.L0(2131752423);
                            }
                            z25 = true;
                            z26 = true;
                            z24 = false;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.id.L0(2131752520);
                            }
                            z24 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z25 = true;
                            z26 = false;
                        } else {
                            z24 = false;
                            z25 = false;
                            z26 = false;
                        }
                        z20 = z24;
                        z21 = z25;
                        z22 = z26;
                        str11 = str19;
                    } else {
                        String str20 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.id.L0(2131752423);
                            }
                            str11 = str20;
                            z21 = true;
                            z22 = true;
                            z20 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.id.L0(2131752520);
                            }
                            z20 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str11 = str20;
                            z21 = true;
                            z22 = false;
                        } else {
                            str11 = str20;
                            z20 = false;
                            z21 = false;
                            z22 = false;
                        }
                    }
                    final TLRPC.User a26 = profileActivity.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                    if (org.telegram.messenger.t10.B(a26)) {
                        org.telegram.messenger.qp messagesController8 = profileActivity.getMessagesController();
                        j28 = profileActivity.e1;
                        if (org.telegram.messenger.t3.h(messagesController8.M0(Long.valueOf(j28)))) {
                            z23 = true;
                            final String str21 = str11;
                            final boolean z34 = z21;
                            final boolean z35 = z22;
                            paVar.a(str11, z21, z22, z23, new View.OnClickListener() { // from class: org.telegram.ui.zv0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i119;
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    ProfileActivity profileActivity2 = jw0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i119 = ((org.telegram.ui.ActionBar.f2) profileActivity2).currentAccount;
                                    long a10 = profileActivity2.a();
                                    f6Var = ((org.telegram.ui.ActionBar.f2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.ey0.b(parentActivity, i119, a10, a26, str21, z34, z35, z20, f6Var);
                                }
                            });
                            paVar.e(a26, i7 != profileActivity.u4 - 1);
                            break;
                        }
                    }
                    z23 = false;
                    final String str212 = str11;
                    final boolean z342 = z21;
                    final boolean z352 = z22;
                    paVar.a(str11, z21, z22, z23, new View.OnClickListener() { // from class: org.telegram.ui.zv0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i119;
                            org.telegram.ui.ActionBar.f6 f6Var;
                            ProfileActivity profileActivity2 = jw0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i119 = ((org.telegram.ui.ActionBar.f2) profileActivity2).currentAccount;
                            long a10 = profileActivity2.a();
                            f6Var = ((org.telegram.ui.ActionBar.f2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.ey0.b(parentActivity, i119, a10, a26, str212, z342, z352, z20, f6Var);
                        }
                    });
                    paVar.e(a26, i7 != profileActivity.u4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                i95 = profileActivity.b3;
                if (i7 != i95) {
                    i96 = profileActivity.Z2;
                    if (i7 != i96) {
                        i97 = profileActivity.X2;
                        if (i7 == i97) {
                            x6Var.setType(2);
                            break;
                        }
                    } else {
                        x6Var.setType(0);
                        break;
                    }
                } else {
                    x6Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.L0(2131753154));
                break;
            case 20:
                String L022 = org.telegram.messenger.id.L0(2131747925);
                org.telegram.messenger.qp messagesController9 = profileActivity.getMessagesController();
                long a10 = profileActivity.a();
                j29 = profileActivity.f1;
                ((org.telegram.ui.Cells.r8) view).f(L022, !messagesController9.q2(a10, j29), false);
                break;
            case 21:
                kg.g1 g1Var = (kg.g1) view;
                userFull15 = profileActivity.u2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.u2;
                    tL_businessLocation = userFull16.business_location;
                }
                g1Var.a(tL_businessLocation, profileActivity.L3 < 0 && !profileActivity.r1);
                break;
            case 22:
                kg.f1 f1Var = (kg.f1) view;
                f1Var.setOnTimezoneSwitchClick(new yv0(this, r14 ? 1 : 0));
                userFull17 = profileActivity.u2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.u2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z27 = profileActivity.N4;
                z28 = profileActivity.O4;
                if ((profileActivity.L3 >= 0 || profileActivity.r1) && profileActivity.O3 < 0) {
                    z29 = false;
                }
                f1Var.b(tL_businessWorkHours, z27, z28, z29);
                break;
            case 23:
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                org.telegram.messenger.qp messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.u2;
                TLRPC.Chat M03 = messagesController10.M0(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.e6 e6Var = profileActivity.v2;
                f6Var.a(e6Var != null ? e6Var.d : null, M03);
                break;
            case 26:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setLinkTextRippleColor(null);
                i98 = profileActivity.Q3;
                if (i7 == i98) {
                    profileActivity.getMessagesController().e2(profileActivity.a());
                    userFull26 = profileActivity.u2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.u2;
                        botVerification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.t2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.t2;
                            botVerification = chatFull16.bot_verification;
                        } else {
                            botVerification = null;
                        }
                    }
                    userFull27 = profileActivity.u2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.u2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.u2;
                            l10 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.h4 < 0 || botVerification != null || l10 != null) {
                                z8Var.setFixedSize(0);
                                org.telegram.messenger.qp messagesController11 = profileActivity.getMessagesController();
                                j31 = profileActivity.d1;
                                TLRPC.User a27 = messagesController11.a2(Long.valueOf(j31));
                                boolean z36 = a27 == null && a27.bot && a27.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.h4 >= 0) {
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(z36 ? 2131746706 : 2131746708), new org.telegram.ui.Components.tp0(i106, this, z36)));
                                    if (botVerification != null || l10 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.r5(botVerification.icon, z8Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(org.telegram.messenger.ij.h0(botVerification.description, false));
                                    try {
                                        org.telegram.messenger.g0.c(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i107 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i107];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new bw0(this, url, url), spanStart, spanEnd, 33);
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
                                    spannableStringBuilder4.append(org.telegram.messenger.g0.R2(org.telegram.messenger.id.Z(2131746710, org.telegram.messenger.t10.n(a23)), org.telegram.ui.ActionBar.k6.Uc, profileActivity.z0, new qn0(25, this, l10)));
                                }
                                z8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
                                z8Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                z8Var.setFixedSize(14);
                                z8Var.setText(null);
                                break;
                            }
                        }
                    }
                    l10 = null;
                    if (profileActivity.h4 < 0) {
                    }
                    z8Var.setFixedSize(0);
                    org.telegram.messenger.qp messagesController112 = profileActivity.getMessagesController();
                    j31 = profileActivity.d1;
                    TLRPC.User a272 = messagesController112.a2(Long.valueOf(j31));
                    if (a272 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.h4 >= 0) {
                    }
                    if (botVerification == null) {
                    }
                    z8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.B6))));
                    z8Var.setText(spannableStringBuilder42);
                } else {
                    i99 = profileActivity.S3;
                    if (i7 == i99) {
                        org.telegram.messenger.qp messagesController12 = profileActivity.getMessagesController();
                        j30 = profileActivity.d1;
                        TLRPC.User a28 = messagesController12.a2(Long.valueOf(j30));
                        if (a28 != null && a28.bot && a28.bot_can_edit) {
                            z8Var.setFixedSize(0);
                            String p10 = org.telegram.messenger.t10.p(a28);
                            userFull23 = profileActivity.u2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.u2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.u2;
                                    i101 = userFull25.starref_program.commission_permille;
                                    z8Var.setText(org.telegram.messenger.id.Z(2131746713, p10, hi.j.J0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            z8Var.setText(org.telegram.messenger.id.Z(2131746713, p10, hi.j.J0(i101)));
                        } else {
                            z8Var.setFixedSize(0);
                            String p11 = org.telegram.messenger.t10.p(a28);
                            userFull20 = profileActivity.u2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.u2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.u2;
                                    i100 = userFull22.starref_program.commission_permille;
                                    z8Var.setText(org.telegram.messenger.id.Z(2131746714, p11, hi.j.J0(i100)));
                                    break;
                                }
                            }
                            i100 = 0;
                            z8Var.setText(org.telegram.messenger.id.Z(2131746714, p11, hi.j.J0(i100)));
                        }
                    }
                }
                break;
            case 27:
                hi.g gVar = (hi.g) view;
                gVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.k6.ik), R.drawable.filled_affiliate, org.telegram.messenger.id.L0(2131746715), null);
                userFull31 = profileActivity.u2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.u2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.u2;
                        str14 = hi.j.J0(userFull33.starref_program.commission_permille);
                    }
                }
                gVar.setPercent(str14);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(10.0f));
                i102 = profileActivity.i4;
                if (i7 == i102) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.round_warn);
                    wpVar.e(org.telegram.messenger.g0.L(1.0f));
                    wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, profileActivity.z0);
                    profileActivity.Q6 = wpVar;
                    spannableStringBuilder5.setSpan(wpVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    org.telegram.messenger.qp messagesController13 = profileActivity.getMessagesController();
                    j32 = profileActivity.d1;
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.id.Z(2131746622, org.telegram.messenger.t10.k(messagesController13.a2(Long.valueOf(j32)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                ji.c cVar = (ji.c) view;
                chat11 = profileActivity.D2;
                if (chat11 == null) {
                    j33 = profileActivity.d1;
                    if (j33 != 0) {
                        org.telegram.messenger.qp messagesController14 = profileActivity.getMessagesController();
                        j34 = profileActivity.d1;
                        TLRPC.User a29 = messagesController14.a2(Long.valueOf(j34));
                        if (a29 != null) {
                            i103 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                            cVar.a(i103, profileActivity.getMessagesController().M0(Long.valueOf(a29.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i104 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                    org.telegram.messenger.qp messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.D2;
                    cVar.a(i104, messagesController15.M0(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        View paVar;
        View view;
        boolean z10 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i7) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, profileActivity.z0);
                break;
            case 2:
            case 19:
            case org.telegram.messenger.qs.T /* 30 */:
                org.telegram.ui.ActionBar.f6 f6Var = profileActivity.z0;
                if (i7 == 30) {
                    z9 = false;
                    z10 = true;
                } else {
                    z9 = false;
                }
                dw0 dw0Var = new dw0(this, this.c, f6Var, z10, i7 == 19 ? true : z9);
                dw0Var.setContentDescriptionValueFirst(true);
                paVar = dw0Var;
                break;
            case 3:
                ew0 ew0Var = new ew0(this, context, profileActivity, profileActivity.z0);
                profileActivity.d6 = ew0Var;
                paVar = ew0Var;
                break;
            case 4:
                paVar = new lr(this, context, profileActivity.z0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.z0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new fw0(this, context, profileActivity.z0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                paVar = new org.telegram.ui.Cells.pa(profileActivity.v4 == -1 ? 9 : 6, 0, this.c, profileActivity.z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(10, context, profileActivity.z0);
                z8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.A6, profileActivity.z0);
                z8Var.getTextView().setMovementMethod(null);
                z8Var.setText(org.telegram.messenger.g0.D0());
                z8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = z8Var;
                break;
            case 11:
            case org.telegram.messenger.qs.U /* 31 */:
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(i7 == 31 ? 12.0f : 6.0f), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                View gw0Var = new gw0(this, context);
                gw0Var.setBackground(new ColorDrawable(0));
                gw0Var.setTag(-33024);
                view = gw0Var;
                paVar = view;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                View view2 = profileActivity.N;
                view2.setTag(-33024);
                view = view2;
                paVar = view;
                break;
            case 15:
                paVar = new iw0(this, context, profileActivity.z0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.z8(context, profileActivity.z0);
                break;
            case 18:
            case 24:
                View l1Var = new ug.l1(i7 == 18 ? 0 : 1, context, profileActivity.z0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l1Var, profileActivity.z0);
                paVar = l1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.r8(18, context, profileActivity.z0, false);
                break;
            case 21:
                View g1Var = new kg.g1(context, profileActivity.z0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, g1Var, profileActivity.z0);
                paVar = g1Var;
                break;
            case 22:
                View hw0Var = new hw0(this, context, profileActivity.z0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, hw0Var, profileActivity.z0);
                paVar = hw0Var;
                break;
            case 23:
                paVar = new aw0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                fi.d dVar = new fi.d(context, profileActivity.z0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.id.M0(2131746709, null), false, true);
                dVar.setOnClickListener(new yv0(this, false ? 1 : 0));
                frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, profileActivity.z0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.z8(context, profileActivity.z0);
                break;
            case 27:
                paVar = new hi.g(context, profileActivity.z0);
                break;
            case 28:
                View tmVar = new org.telegram.ui.Components.tm(context, 21);
                tmVar.setTag(-33024);
                view = tmVar;
                paVar = view;
                break;
            case 32:
                paVar = new vw0(profileActivity, context);
                break;
            case 33:
                paVar = new ji.c(context, profileActivity.z0);
                break;
        }
        if (i7 != 13) {
            paVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new org.telegram.ui.Components.xi0(paVar);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        View view = d1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).a.setLoading(profileActivity.i5);
            ((org.telegram.ui.Cells.x8) view).b.setLoading(profileActivity.i5);
        }
    }

    @Override // v4.g0
    public final void z(v4.d1 d1Var) {
        View view = d1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
