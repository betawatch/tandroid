// default package

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
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lq8 extends q59 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public lq8(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        int b = u69Var.b();
        ProfileActivity profileActivity = this.e;
        if (b == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b = u69Var.b();
            if (b != profileActivity.g3 && b != profileActivity.U2 && b != profileActivity.i3 && b != profileActivity.h3 && b != profileActivity.W2 && b != profileActivity.X2 && b != profileActivity.A3 && b != profileActivity.j3 && b != profileActivity.k3 && b != profileActivity.r3 && b != profileActivity.o3 && b != profileActivity.l3 && b != profileActivity.n3 && b != profileActivity.s3 && b != profileActivity.t3 && b != profileActivity.w3 && b != profileActivity.x3 && b != profileActivity.y3 && b != profileActivity.z3 && b != profileActivity.P2 && b != profileActivity.d4 && b != profileActivity.f4 && b != profileActivity.j4 && b != profileActivity.i4 && b != profileActivity.m3 && b != profileActivity.V2 && b != profileActivity.R2 && b != profileActivity.g4 && b != profileActivity.h4 && b != profileActivity.t4) {
                return false;
            }
        } else {
            View view = u69Var.a;
            if (view instanceof w8c) {
                Object currentObject = ((w8c) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && m9c.D((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i = u69Var.f;
            if (i == 1 || i == 5 || i == 7 || i == 11 || i == 31 || i == 28 || i == 12 || i == 13 || i == 9 || i == 10 || i == 25 || i == 34 || i == 32) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString(b10.h("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        dq8 dq8Var = new dq8(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, dq8Var);
                        clickableSpan = dq8Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new do4(cmb.Wc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = jb6.M0(2131743355, null);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf("%1$s");
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                }
                return spannableStringBuilder2;
            }
        }
        return str2;
    }

    @Override // y59
    public final int b() {
        return this.e.O2;
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        ProfileActivity profileActivity = this.e;
        if (i == profileActivity.E3 || i == profileActivity.B4 || i == profileActivity.f3 || i == profileActivity.T2 || i == profileActivity.q3 || i == profileActivity.v3 || i == profileActivity.v4) {
            return 1;
        }
        if (i == profileActivity.H3 || i == profileActivity.J3 || i == profileActivity.U2 || i == profileActivity.V2) {
            return 2;
        }
        if (i == profileActivity.M3 || i == profileActivity.W2) {
            return 19;
        }
        if (i == profileActivity.I3) {
            return 30;
        }
        if (i == profileActivity.K3 || i == profileActivity.L3 || i == profileActivity.X2) {
            return 3;
        }
        if (i == profileActivity.y4 || i == profileActivity.z4 || i == profileActivity.W3 || i == profileActivity.Y3 || i == profileActivity.X3 || i == profileActivity.F4 || i == profileActivity.G4 || i == profileActivity.H4 || i == profileActivity.I4 || i == profileActivity.O4 || i == profileActivity.E4 || i == profileActivity.U4 || i == profileActivity.T4 || i == profileActivity.V3 || i == profileActivity.g3 || i == profileActivity.i3 || i == profileActivity.h3 || i == profileActivity.j3 || i == profileActivity.k3 || i == profileActivity.r3 || i == profileActivity.o3 || i == profileActivity.l3 || i == profileActivity.n3 || i == profileActivity.s3 || i == profileActivity.t3 || i == profileActivity.w3 || i == profileActivity.x3 || i == profileActivity.y3 || i == profileActivity.z3 || i == profileActivity.P2 || i == profileActivity.d4 || i == profileActivity.b4 || i == profileActivity.a4 || i == profileActivity.m3 || i == profileActivity.j4 || i == profileActivity.i4 || i == profileActivity.J4 || i == profileActivity.K4 || i == profileActivity.L4) {
            return 4;
        }
        i2 = profileActivity.botPermissionLocation;
        if (i == i2) {
            return 4;
        }
        i3 = profileActivity.botPermissionBiometry;
        if (i == i3) {
            return 4;
        }
        i4 = profileActivity.botPermissionEmojiStatus;
        if (i == i4 || i == profileActivity.h4) {
            return 4;
        }
        if (i == profileActivity.N3) {
            return 5;
        }
        if (i == profileActivity.O3) {
            return 6;
        }
        if (i == profileActivity.R3) {
            return 20;
        }
        if (i == profileActivity.V4 || i == profileActivity.P4 || i == profileActivity.u4 || i == profileActivity.A4 || i == profileActivity.e3 || i == profileActivity.p3 || i == profileActivity.u3 || i == profileActivity.Q2 || i == profileActivity.c3 || i == profileActivity.Y2 || i == profileActivity.k4 || i == profileActivity.Z3 || i == profileActivity.c4 || i == profileActivity.S2 || i == profileActivity.a3 || i == profileActivity.N4 || i == profileActivity.x4 || i == profileActivity.M4 || i == profileActivity.s4) {
            return 7;
        }
        if (i >= profileActivity.C4 && i < profileActivity.D4) {
            return 8;
        }
        if (i == profileActivity.B3) {
            return 11;
        }
        if (i == profileActivity.C3) {
            return 31;
        }
        if (i == profileActivity.D3) {
            return 12;
        }
        if (i == profileActivity.S4) {
            return 13;
        }
        if (i == profileActivity.A3) {
            return 14;
        }
        if (i == profileActivity.d3 || i == profileActivity.b3 || i == profileActivity.Z2) {
            return 15;
        }
        if (i == profileActivity.e4) {
            return 17;
        }
        if (i == profileActivity.f4) {
            return 18;
        }
        if (i == profileActivity.g4) {
            return 24;
        }
        if (i == profileActivity.Q3) {
            return 21;
        }
        if (i == profileActivity.P3) {
            return 22;
        }
        if (i == profileActivity.R2) {
            return 23;
        }
        if (i == profileActivity.l4) {
            return 25;
        }
        if (i == profileActivity.m4) {
            return 34;
        }
        if (i >= profileActivity.n4 && i < profileActivity.o4) {
            return 35;
        }
        if (i == profileActivity.p4) {
            return 4;
        }
        if (i == profileActivity.S3 || i == profileActivity.U3 || i == profileActivity.q4) {
            return 26;
        }
        if (i == profileActivity.r4) {
            return 32;
        }
        if (i == profileActivity.t4) {
            return 33;
        }
        if (i == profileActivity.T3) {
            return 27;
        }
        return (i == profileActivity.F3 || i == profileActivity.G3) ? 28 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x1069  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x106d  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x1177  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x110f  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        int i2;
        String L0;
        CharSequence charSequence;
        String str;
        int i3;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        TLRPC.TL_username tL_username;
        String str7;
        int i4;
        CharSequence h0;
        String L02;
        String str8;
        byte b;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        String L03;
        boolean z5;
        String str9;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        TL_payments.starRefProgram starrefprogram;
        TL_payments.starRefProgram starrefprogram2;
        TL_bots.BotVerification botVerification;
        TLRPC.User W1;
        TL_payments.starRefProgram starrefprogram3;
        TLRPC.User W12;
        int i18;
        int i19;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.a5;
        HashSet hashSet = profileActivity.s5;
        int i20 = u69Var.f;
        View view = u69Var.a;
        String str10 = "";
        String str11 = null;
        r11 = null;
        String str12 = null;
        TLRPC.ChatParticipant chatParticipant = null;
        final byte b2 = 0;
        switch (i20) {
            case 1:
                jf5 jf5Var = (jf5) view;
                if (i == profileActivity.E3) {
                    if (!sd2.T(profileActivity.F2) || profileActivity.F2.megagroup || profileActivity.L3 == -1) {
                        jf5Var.setText(jb6.L0(2131748954));
                    } else {
                        jf5Var.setText(jb6.L0(2131745961));
                    }
                } else if (i == profileActivity.B4) {
                    jf5Var.setText(jb6.L0(2131752321));
                } else if (i == profileActivity.f3) {
                    jf5Var.setText(jb6.L0(2131745717));
                } else if (i == profileActivity.T2) {
                    jf5Var.setText(jb6.L0(2131754709));
                } else if (i == profileActivity.q3) {
                    jf5Var.setText(jb6.L0(2131745213));
                } else if (i == profileActivity.v3) {
                    jf5Var.setText(jb6.L0(2131745220));
                } else if (i == profileActivity.v4) {
                    jf5Var.setText(jb6.L0(2131752961));
                }
                int themedColor = profileActivity.getThemedColor(cmb.K6);
                RectF rectF = ProfileActivity.e7;
                jf5Var.setTextColor(themedColor);
                break;
            case 2:
            case 19:
            case nm7.S /* 30 */:
                hjb hjbVar = (hjb) view;
                if (i == profileActivity.V2) {
                    TLRPC.UserFull X1 = profileActivity.getMessagesController().X1(profileActivity.e1);
                    if (X1 != null && X1.birthday != null) {
                        boolean d = ok0.d(X1);
                        TL_account.TL_birthday tL_birthday = X1.birthday;
                        boolean z12 = (tL_birthday.flags & 1) != 0;
                        int years = z12 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String d0 = UserInfoActivity.d0(X1.birthday);
                        hjbVar.c(gw3.p(z12 ? jb6.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", d0) : jb6.Z(d ? 2131746456 : 2131746453, d0), hjbVar.a, new h65((Object) this, (Object) u69Var, i, (byte) 26)), jb6.L0(d ? 2131746457 : 2131746459), (!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().I3()) {
                            b = 1;
                            z = false;
                            b2 = b;
                        }
                    }
                    b = 0;
                    z = false;
                    b2 = b;
                } else {
                    if (i == profileActivity.H3) {
                        TLRPC.User W13 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                        if (W13 != null) {
                            if (!TextUtils.isEmpty(profileActivity.n5)) {
                                L02 = mlb.l(new StringBuilder("+"), profileActivity.n5, r58.f());
                                str8 = profileActivity.n5;
                            } else if (!TextUtils.isEmpty(W13.phone)) {
                                String l = mlb.l(new StringBuilder("+"), W13.phone, r58.f());
                                str8 = W13.phone;
                                L02 = l;
                            }
                            boolean z13 = str8 == null && str8.matches("888\\d{8}");
                            profileActivity.l5 = z13;
                            hjbVar.c(L02, jb6.L0(!z13 ? 2131754216 : 2131747024), false);
                        }
                        L02 = jb6.L0(2131747027);
                        str8 = null;
                        if (str8 == null) {
                        }
                        profileActivity.l5 = z13;
                        hjbVar.c(L02, jb6.L0(!z13 ? 2131754216 : 2131747024), false);
                    } else if (i == profileActivity.I3) {
                        TLRPC.UserFull X12 = profileActivity.getMessagesController().X1(profileActivity.e1);
                        if (X12 != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = X12.note;
                            i4 = ((d) profileActivity).currentAccount;
                            if (z8c.h(i4).p()) {
                                h0 = k47.h0(tL_textWithEntities, false);
                                if (!(h0 instanceof SpannableStringBuilder)) {
                                    h0 = new SpannableStringBuilder(h0);
                                }
                                gm.c((SpannableStringBuilder) h0, 1, false, false);
                            } else {
                                h0 = k47.h0(k47.w5(tL_textWithEntities), false);
                            }
                            hjbVar.d(h0, jb6.L0(2131746383), jb6.L0(2131746382));
                        }
                    } else if (i == profileActivity.M3) {
                        ArrayList arrayList2 = new ArrayList();
                        if (profileActivity.e1 != 0) {
                            TLRPC.User W14 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                            if (W14 != null) {
                                arrayList2.addAll(W14.usernames);
                                if (!TextUtils.isEmpty(W14.username)) {
                                    tL_username = pg3.b(W14.username, arrayList2);
                                    str5 = W14.username;
                                    ArrayList arrayList3 = W14 != null ? new ArrayList() : new ArrayList(W14.usernames);
                                    if (TextUtils.isEmpty(str5)) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < arrayList3.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList3.get(i21);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i21++;
                                                } else {
                                                    str5 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String L04 = jb6.L0(2131743361);
                                    if (str5 == null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                dq8 dq8Var = new dq8(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, dq8Var);
                                                clickableSpan = dq8Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str7 = spannableString;
                                        }
                                    } else {
                                        str7 = "—";
                                    }
                                    z = !profileActivity.s1;
                                    ArrayList arrayList4 = arrayList3;
                                    str3 = str7;
                                    arrayList2 = arrayList4;
                                    str4 = L04;
                                }
                            }
                            tL_username = null;
                            str5 = null;
                            if (W14 != null) {
                            }
                            if (TextUtils.isEmpty(str5)) {
                            }
                            String L042 = jb6.L0(2131743361);
                            if (str5 == null) {
                            }
                            z = !profileActivity.s1;
                            ArrayList arrayList42 = arrayList3;
                            str3 = str7;
                            arrayList2 = arrayList42;
                            str4 = L042;
                        } else if (profileActivity.F2 != null) {
                            TLRPC.Chat L05 = profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1));
                            String K = sd2.K(L05, false);
                            if (L05 != null) {
                                arrayList2.addAll(L05.usernames);
                            }
                            if (sd2.t0(L05)) {
                                z2 = !profileActivity.s1;
                                StringBuilder sb = new StringBuilder();
                                wi8.z(profileActivity.getMessagesController().N2, "/", K, sb);
                                String str13 = str10;
                                if (profileActivity.g1 != 0) {
                                    str13 = "/" + profileActivity.g1;
                                }
                                sb.append(str13);
                                str6 = sb.toString();
                                str4 = jb6.L0(2131748906);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(profileActivity.getMessagesController().N2);
                                sb2.append("/c/");
                                sb2.append(profileActivity.f1);
                                String str14 = str10;
                                if (profileActivity.g1 != 0) {
                                    str14 = "/" + profileActivity.g1;
                                }
                                sb2.append(str14);
                                String sb3 = sb2.toString();
                                str4 = jb6.L0(2131748902);
                                str6 = sb3;
                                z2 = false;
                            }
                            str5 = K;
                            z = z2;
                            str3 = str6;
                        } else {
                            arrayList2 = new ArrayList();
                            z = false;
                            str3 = "";
                            str4 = str3;
                            str5 = null;
                        }
                        hjbVar.c(str3, E(str5, arrayList2, str4), profileActivity.G3 == -1 && !(!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) && profileActivity.V2 < 0);
                    } else if (i == profileActivity.J3) {
                        TLRPC.ChatFull chatFull = profileActivity.v2;
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                hjbVar.c(((TLRPC.TL_channelLocation) channelLocation).address, jb6.L0(2131753926), false);
                            }
                        }
                    } else if (i == profileActivity.U2) {
                        i3 = ((d) profileActivity).currentAccount;
                        TLRPC.User f = z8c.h(i3).f();
                        hjbVar.c((f == null || (str2 = f.phone) == null || str2.length() == 0) ? jb6.L0(2131747565) : mlb.l(new StringBuilder("+"), f.phone, r58.f()), jb6.L0(2131743945), true);
                        hjbVar.setContentDescriptionValueFirst(false);
                    } else if (i == profileActivity.W2) {
                        i2 = ((d) profileActivity).currentAccount;
                        TLRPC.User f2 = z8c.h(i2).f();
                        String L06 = jb6.L0(2131743361);
                        if (f2 == null || f2.usernames.size() <= 0) {
                            String p = m9c.p(f2);
                            if (f2 == null || TextUtils.isEmpty(p)) {
                                L0 = jb6.L0(2131743348);
                                charSequence = L06;
                            } else {
                                L0 = b10.h("@", p);
                                charSequence = L06;
                            }
                        } else {
                            int i22 = 0;
                            while (true) {
                                if (i22 < f2.usernames.size()) {
                                    TLRPC.TL_username tL_username3 = f2.usernames.get(i22);
                                    if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                        i22++;
                                    } else {
                                        str = tL_username3.username;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                str = f2.username;
                            }
                            L0 = (str == null || TextUtils.isEmpty(str)) ? jb6.L0(2131743348) : "@".concat(str);
                            charSequence = E(str, f2.usernames, L06);
                        }
                        hjbVar.c(L0, charSequence, true);
                        hjbVar.setContentDescriptionValueFirst(true);
                    }
                    z = false;
                }
                if (b2 != 0) {
                    Drawable drawable = hjbVar.getContext().getDrawable(R.drawable.msg_input_gift);
                    int themedColor2 = profileActivity.getThemedColor(cmb.U6);
                    RectF rectF2 = ProfileActivity.e7;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.Z6 = drawable;
                    if (m9c.c(profileActivity.w2)) {
                        hjbVar.setImage(null);
                        hjbVar.setImageClickListener(null);
                    } else {
                        hjbVar.b(drawable, jb6.L0(2131749457));
                        hjbVar.setImageClickListener(new yn8(profileActivity, (byte) 12));
                    }
                } else if (z) {
                    Drawable drawable2 = hjbVar.getContext().getDrawable(R.drawable.header_qr_24);
                    int themedColor3 = profileActivity.getThemedColor(cmb.u8);
                    RectF rectF3 = ProfileActivity.e7;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    profileActivity.a7 = drawable2;
                    hjbVar.b(drawable2, jb6.L0(2131750405));
                    hjbVar.setImageClickListener(new yn8(profileActivity, (byte) 13));
                } else {
                    hjbVar.setImage(null);
                    hjbVar.setImageClickListener(null);
                }
                hjbVar.setTag(Integer.valueOf(i));
                hjbVar.a.setLoading(profileActivity.t5);
                hjbVar.b.setLoading(profileActivity.t5);
                break;
            case 3:
                s1 s1Var = (s1) view;
                if (i == profileActivity.K3) {
                    TLRPC.User user = profileActivity.w2.user;
                    if (user == null) {
                        user = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.w2.id));
                    }
                    s1Var.f(profileActivity.w2.about, jb6.L0(2131743452), profileActivity.s2 || !(user == null || !user.premium || profileActivity.w2.about == null));
                    break;
                } else if (i == profileActivity.L3) {
                    String str15 = profileActivity.v2.about;
                    while (str15.contains("\n\n\n")) {
                        str15 = str15.replace("\n\n\n", "\n\n");
                    }
                    s1Var.f(str15, jb6.L0(2131751396), sd2.T(profileActivity.F2) && !profileActivity.F2.megagroup);
                    break;
                } else if (i == profileActivity.X2) {
                    TLRPC.UserFull userFull = profileActivity.w2;
                    if (userFull == null || !TextUtils.isEmpty(userFull.about)) {
                        TLRPC.UserFull userFull2 = profileActivity.w2;
                        s1Var.f(userFull2 == null ? jb6.L0(2131748536) : userFull2.about, jb6.L0(2131743452), profileActivity.getUserConfig().p());
                        TLRPC.UserFull userFull3 = profileActivity.w2;
                        profileActivity.A2 = userFull3 != null ? userFull3.about : null;
                    } else {
                        s1Var.f(jb6.L0(2131743452), jb6.L0(2131743451), false);
                        profileActivity.A2 = null;
                    }
                    s1Var.setMoreButtonDisabled(true);
                    break;
                }
                break;
            case 4:
            case 18:
            case 24:
                xib xibVar = (xib) view;
                int i23 = cmb.l6;
                int i24 = cmb.F6;
                xibVar.g(i23, i24);
                xibVar.setTag(Integer.valueOf(i24));
                if (i == profileActivity.y4) {
                    int i25 = profileActivity.getMessagesController().Z0(Integer.valueOf(pg3.h(profileActivity.i1))).ttl;
                    xibVar.q(jb6.L0(2131748344), i25 == 0 ? jb6.L0(2131745095) : jb6.c0(i25), false, false);
                } else if (i == profileActivity.T4) {
                    xibVar.k(jb6.L0(2131743598), false);
                    xibVar.g(-1, cmb.o7);
                } else if (i == profileActivity.z4) {
                    yl5 yl5Var = new yl5();
                    TLRPC.EncryptedChat Z0 = profileActivity.getMessagesController().Z0(Integer.valueOf(pg3.h(profileActivity.i1)));
                    byte[] bArr = Z0.key_hash;
                    yl5Var.a = bArr;
                    if (bArr == null) {
                        byte[] bArr2 = Z0.auth_key;
                        Typeface typeface = gm.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        yl5Var.a = bArr3;
                        Z0.key_hash = bArr3;
                    }
                    yl5Var.invalidateSelf();
                    xibVar.v(jb6.L0(2131751069), yl5Var, false);
                } else if (i == profileActivity.U4) {
                    xibVar.g(-1, cmb.n6);
                    if (profileActivity.F2.megagroup) {
                        xibVar.k(jb6.L0(2131746394), false);
                    } else {
                        xibVar.k(jb6.L0(2131746395), false);
                    }
                } else if (i == profileActivity.F4) {
                    TLRPC.ChatFull chatFull2 = profileActivity.v2;
                    TLRPC.Chat chat = profileActivity.F2;
                    if (chatFull2 != null) {
                        if (!sd2.T(chat) || profileActivity.F2.megagroup) {
                            xibVar.s(jb6.L0(2131752321), jb6.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.P4 + (-1));
                        } else {
                            xibVar.s(jb6.L0(2131752227), jb6.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.P4 + (-1));
                        }
                    } else if (!sd2.T(chat) || profileActivity.F2.megagroup) {
                        xibVar.o(R.drawable.msg_groups, jb6.L0(2131752321), i != profileActivity.P4 + (-1));
                    } else {
                        xibVar.o(R.drawable.msg_groups, jb6.L0(2131752227), i != profileActivity.P4 + (-1));
                    }
                } else if (i == profileActivity.G4) {
                    if (profileActivity.v2 != null) {
                        xibVar.s(jb6.L0(2131744121), String.format("%d", Integer.valueOf(profileActivity.v2.requests_pending)), R.drawable.msg_requests, i != profileActivity.P4 - 1);
                    }
                } else if (i == profileActivity.H4) {
                    if (profileActivity.v2 != null) {
                        xibVar.s(jb6.L0(2131752464), String.format("%d", Integer.valueOf(profileActivity.v2.admins_count)), R.drawable.msg_admins, i != profileActivity.P4 - 1);
                    } else {
                        xibVar.o(R.drawable.msg_admins, jb6.L0(2131752464), i != profileActivity.P4 - 1);
                    }
                } else if (i == profileActivity.I4) {
                    xibVar.o(R.drawable.msg_customize, jb6.L0(2131752466), i != profileActivity.P4 - 1);
                } else if (i == profileActivity.L4) {
                    i15 = ((d) profileActivity).currentAccount;
                    TL_stars.StarsAmount c = ku0.g(i15).c(-profileActivity.f1);
                    i16 = ((d) profileActivity).currentAccount;
                    long i26 = ku0.g(i16).i(-profileActivity.f1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i26 > 0) {
                        double d2 = i26 / 1.0E9d;
                        if (d2 > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gm.o0((int) d2, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d2));
                        }
                    }
                    if (c.amount > 0) {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) nxa.I0(c, 0.777f, ' '));
                    }
                    xibVar.s(jb6.L0(2131752228), ik1.L(nxa.b1(false, spannableStringBuilder, 0.7f, null), xibVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                } else if (i == profileActivity.p4) {
                    xibVar.g(cmb.u6, cmb.t6);
                    xibVar.o(R.drawable.ai_model_add, jb6.L0(2131754303), false);
                    xibVar.x = 17;
                    xibVar.s = 61;
                } else if (i == profileActivity.J4) {
                    i14 = ((d) profileActivity).currentAccount;
                    TL_stars.StarsAmount c2 = ku0.g(i14).c(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (c2.amount > 0) {
                        spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) nxa.I0(c2, 0.777f, ' '));
                    }
                    xibVar.s(jb6.L0(2131753076), ik1.L(nxa.b1(false, spannableStringBuilder2, 0.7f, null), xibVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                } else if (i == profileActivity.K4) {
                    i13 = ((d) profileActivity).currentAccount;
                    long i27 = ku0.g(i13).i(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    if (i27 > 0) {
                        double d3 = i27 / 1.0E9d;
                        if (d3 > 1000.0d) {
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) gm.o0((int) d3, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols2.setDecimalSeparator('.');
                            DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                            decimalFormat2.setMinimumFractionDigits(2);
                            decimalFormat2.setMaximumFractionDigits(3);
                            decimalFormat2.setGroupingUsed(false);
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d3));
                        }
                    }
                    xibVar.s(jb6.L0(2131753075), ik1.L(nxa.b1(false, spannableStringBuilder3, 0.7f, null), xibVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                } else if (i == profileActivity.O4) {
                    if (profileActivity.v2 != null) {
                        String L07 = jb6.L0(2131752399);
                        TLRPC.ChatFull chatFull3 = profileActivity.v2;
                        xibVar.s(L07, String.format("%d", Integer.valueOf(Math.max(chatFull3.banned_count, chatFull3.kicked_count))), R.drawable.msg_user_remove, i != profileActivity.P4 - 1);
                    } else {
                        xibVar.o(R.drawable.msg_user_remove, jb6.L0(2131752399), i != profileActivity.P4 - 1);
                    }
                } else if (i == profileActivity.E4) {
                    xibVar.g(i23, i24);
                    int i28 = i + 1;
                    xibVar.o(R.drawable.msg_contact_add, jb6.L0(2131754398), profileActivity.P4 == -1 || (i28 >= profileActivity.C4 && i28 < profileActivity.D4));
                } else if (i == profileActivity.V3) {
                    xibVar.k(jb6.L0(2131745333), true);
                } else if (i == profileActivity.a4) {
                    xibVar.o(R.drawable.msg_contact_add, jb6.L0(2131754374), false);
                    xibVar.g(i23, i24);
                } else if (i == profileActivity.X3) {
                    xibVar.o(R.drawable.menu_reaction_delete_24, jb6.L0(2131751444), false);
                    xibVar.g(cmb.p7, cmb.o7);
                } else if (i == profileActivity.Y3) {
                    TLRPC.Chat L08 = profileActivity.getMessagesController().L0(Long.valueOf(-profileActivity.k5));
                    if (L08 == null || !sd2.w(2, L08)) {
                        xibVar.o(R.drawable.msg_report, jb6.L0(2131745944), false);
                    } else {
                        xibVar.o(R.drawable.msg_block2, jb6.L0(2131745943), false);
                    }
                    xibVar.g(cmb.p7, cmb.o7);
                } else if (i == profileActivity.W3) {
                    xibVar.k(jb6.L0(2131745919), false);
                    int i29 = cmb.o7;
                    xibVar.g(-1, i29);
                    xibVar.g(-1, i29);
                } else if (i == profileActivity.h3) {
                    xibVar.u(jb6.L0(2131748811), jb6.j0(), false, R.drawable.msg2_language, false);
                    xibVar.setImageLeft(23);
                } else if (i == profileActivity.g3) {
                    xibVar.o(R.drawable.msg2_notifications, jb6.L0(2131747655), true);
                } else if (i == profileActivity.i3) {
                    xibVar.o(R.drawable.msg2_secret, jb6.L0(2131746506), true);
                } else if (i == profileActivity.j3) {
                    xibVar.o(R.drawable.msg2_data, jb6.L0(2131751614), true);
                } else if (i == profileActivity.k3) {
                    xibVar.o(R.drawable.msg2_discussion, jb6.L0(2131752147), true);
                } else if (i == profileActivity.l3) {
                    xibVar.o(R.drawable.msg2_folder, jb6.L0(2131750628), true);
                } else if (i == profileActivity.n3) {
                    xibVar.o(R.drawable.msg2_sticker, jb6.L0(2131744546), true);
                } else if (i == profileActivity.m3) {
                    xibVar.o(R.drawable.msg2_battery, jb6.L0(2131746801), true);
                } else if (i == profileActivity.r3) {
                    xibVar.o(R.drawable.msg2_ask_question, jb6.L0(2131753951), true);
                } else if (i == profileActivity.s3) {
                    xibVar.o(R.drawable.msg2_help, jb6.L0(2131743927), true);
                } else if (i == profileActivity.t3) {
                    xibVar.o(R.drawable.msg2_policy, jb6.L0(2131746518), false);
                } else if (i == profileActivity.w3) {
                    xibVar.k(jb6.L0(2131751550), true);
                } else if (i == profileActivity.x3) {
                    xibVar.k(jb6.L0(2131751551), true);
                } else if (i == profileActivity.y3) {
                    xibVar.k(jb6.L0(2131751587), profileActivity.z3 != -1);
                } else if (i == profileActivity.z3) {
                    xibVar.k("Switch Backend", false);
                } else if (i == profileActivity.o3) {
                    xibVar.o(R.drawable.msg2_devices, jb6.L0(2131751392), true);
                } else if (i == profileActivity.P2) {
                    profileActivity.W.K(86);
                    profileActivity.W.G();
                    xibVar.p(jb6.L0(2131745250), profileActivity.W, false);
                    xibVar.g(cmb.u6, cmb.t6);
                    xibVar.getImageView().setPadding(0, 0, 0, gm.L(8.0f));
                    xibVar.setImageLeft(12);
                    profileActivity.N2 = xibVar;
                } else if (i == profileActivity.b4) {
                    xibVar.o(R.drawable.msg_contact_add, jb6.L0(2131753016), false);
                    xibVar.g(cmb.u6, cmb.t6);
                } else if (i == profileActivity.d4) {
                    xibVar.o(R.drawable.msg_groups_create, jb6.L0(2131754369), false);
                } else if (i == profileActivity.f4) {
                    xibVar.p(jb6.L0(2131743916), new um(gm.L(24.0f), gm.L(24.0f), oj8.d().f), true);
                    xibVar.setImageLeft(23);
                } else if (i == profileActivity.g4) {
                    i12 = ((d) profileActivity).currentAccount;
                    jva t = jva.t(i12);
                    long j = t.m().amount;
                    String L09 = jb6.L0(2131748361);
                    CharSequence charSequence2 = str10;
                    if (t.e) {
                        charSequence2 = str10;
                        if (j > 0) {
                            charSequence2 = nxa.H0(t.m(), 0.85f, ' ');
                        }
                    }
                    xibVar.t(L09, charSequence2, new um(gm.L(24.0f), gm.L(24.0f), oj8.d().h), true);
                    xibVar.setImageLeft(23);
                } else if (i == profileActivity.h4) {
                    i11 = ((d) profileActivity).currentAccount;
                    jva I = jva.I(i11);
                    long j2 = I.m().amount;
                    String L010 = jb6.L0(2131748057);
                    CharSequence charSequence3 = str10;
                    if (I.e) {
                        charSequence3 = str10;
                        if (j2 > 0) {
                            charSequence3 = nxa.H0(I.m(), 0.85f, ' ');
                        }
                    }
                    xibVar.s(L010, charSequence3, R.drawable.settings_gram_24, true);
                    xibVar.setImageLeft(23);
                } else if (i == profileActivity.i4) {
                    xibVar.o(R.drawable.menu_shop, jb6.L0(2131743937), true);
                    xibVar.setImageLeft(23);
                } else if (i == profileActivity.j4) {
                    xibVar.o(R.drawable.menu_gift, jb6.L0(2131745373), false);
                    xibVar.setImageLeft(23);
                } else {
                    i5 = profileActivity.botPermissionLocation;
                    if (i == i5) {
                        String L011 = jb6.L0(2131752962);
                        tr0 tr0Var = profileActivity.t2;
                        boolean z14 = tr0Var != null && tr0Var.f();
                        int themedColor4 = profileActivity.getThemedColor(cmb.kk);
                        i10 = profileActivity.botPermissionBiometry;
                        xibVar.m(L011, z14, R.drawable.filled_access_location, themedColor4, i10 != -1);
                    } else {
                        i6 = profileActivity.botPermissionBiometry;
                        if (i == i6) {
                            String L012 = jb6.L0(2131752964);
                            up0 up0Var = profileActivity.u2;
                            xibVar.m(L012, up0Var != null && up0Var.e, R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(cmb.nk), false);
                        } else {
                            i7 = profileActivity.botPermissionEmojiStatus;
                            if (i == i7) {
                                String L013 = jb6.L0(2131752963);
                                TLRPC.UserFull userFull4 = profileActivity.w2;
                                boolean z15 = userFull4 != null && userFull4.bot_can_manage_emoji_status;
                                int themedColor5 = profileActivity.getThemedColor(cmb.ik);
                                i8 = profileActivity.botPermissionLocation;
                                if (i8 == -1) {
                                    i9 = profileActivity.botPermissionBiometry;
                                    if (i9 == -1) {
                                        z3 = false;
                                        xibVar.m(L013, z15, R.drawable.filled_access_sleeping, themedColor5, z3);
                                    }
                                }
                                z3 = true;
                                xibVar.m(L013, z15, R.drawable.filled_access_sleeping, themedColor5, z3);
                            }
                        }
                    }
                }
                anb.U(xibVar.c, cmb.H6, profileActivity.A0);
                break;
            case 6:
                yn7 yn7Var = (yn7) view;
                if (i == profileActivity.O3) {
                    i17 = ((d) profileActivity).currentAccount;
                    SharedPreferences v1 = oc7.v1(i17);
                    long j3 = profileActivity.i1;
                    if (j3 == 0) {
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            j3 = -profileActivity.f1;
                        }
                    }
                    String p2 = lo7.p(j3, profileActivity.g1, false);
                    boolean z16 = v1.getBoolean("custom_" + p2, false);
                    boolean contains = v1.contains("notify2_" + p2);
                    int g = kt6.g("notify2_", p2, v1, 0);
                    int g2 = kt6.g("notifyuntil_", p2, v1, 0);
                    if (g == 3 && g2 != Integer.MAX_VALUE) {
                        int currentTime = g2 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str11 = z16 ? jb6.L0(2131747651) : jb6.L0(2131747625);
                            z5 = true;
                        } else {
                            if (currentTime < 3600) {
                                str11 = jb6.Y(2131742528, "WillUnmuteIn", jb6.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str11 = jb6.Y(2131742528, "WillUnmuteIn", jb6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str11 = jb6.Y(2131742528, "WillUnmuteIn", jb6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z5 = false;
                        }
                    } else if (g == 0) {
                        if (!contains) {
                            z4 = profileActivity.getNotificationsController().w(j3);
                            if (z4) {
                                L03 = jb6.L0(2131747627);
                            } else if (z16) {
                                str11 = jb6.L0(2131747651);
                                z5 = z4;
                            } else {
                                L03 = jb6.L0(2131747625);
                            }
                            str11 = L03;
                            z5 = z4;
                        }
                        z4 = true;
                        if (z4) {
                        }
                        str11 = L03;
                        z5 = z4;
                    } else {
                        if (g != 1) {
                            z4 = false;
                            if (z4) {
                            }
                            str11 = L03;
                            z5 = z4;
                        }
                        z4 = true;
                        if (z4) {
                        }
                        str11 = L03;
                        z5 = z4;
                    }
                    if (str11 == null) {
                        str11 = jb6.L0(2131747627);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str11 = String.format(Locale.US, jb6.J0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str11, Integer.valueOf(hashSet.size()));
                    }
                    String str16 = str11;
                    yn7Var.setAnimationsEnabled(profileActivity.w5);
                    yn7Var.b(jb6.L0(2131747657), str16, 0, z5, 0, false, profileActivity.l4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i));
                break;
            case 8:
                w8c w8cVar = (w8c) view;
                try {
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = profileActivity.Z4;
                    chatParticipant = !isEmpty ? (TLRPC.ChatParticipant) arrayList5.get(((Integer) arrayList.get(i - profileActivity.C4)).intValue()) : (TLRPC.ChatParticipant) arrayList5.get(i - profileActivity.C4);
                } catch (Exception e) {
                    fc4.f(e);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str17 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = jb6.L0(2131752369);
                            }
                            z9 = false;
                            z10 = true;
                            z11 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = jb6.L0(2131752467);
                            }
                            z9 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z11 = false;
                            z10 = true;
                        } else {
                            z9 = false;
                            z10 = false;
                            z11 = false;
                        }
                        z6 = z9;
                        z7 = z10;
                        z8 = z11;
                        str9 = str17;
                    } else {
                        String str18 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str18)) {
                                str18 = jb6.L0(2131752369);
                            }
                            str9 = str18;
                            z6 = false;
                            z7 = true;
                            z8 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str18)) {
                                str18 = jb6.L0(2131752467);
                            }
                            z6 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str9 = str18;
                            z8 = false;
                            z7 = true;
                        } else {
                            str9 = str18;
                            z6 = false;
                            z7 = false;
                            z8 = false;
                        }
                    }
                    TLRPC.User W15 = profileActivity.getMessagesController().W1(Long.valueOf(chatParticipant.user_id));
                    w8cVar.a(str9, z7, z8, m9c.D(W15) && sd2.h(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1))), new ns5(this, W15, str9, z7, z8, z6, (byte) 1));
                    w8cVar.e(W15, i != profileActivity.D4 + (-1));
                    break;
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                qaa qaaVar = (qaa) view;
                if (i == profileActivity.d3) {
                    qaaVar.setType(1);
                    break;
                } else if (i == profileActivity.b3) {
                    qaaVar.setType(0);
                    break;
                } else if (i == profileActivity.Z2) {
                    qaaVar.setType(2);
                    break;
                }
                break;
            case 17:
                ((njb) view).setText(jb6.L0(2131753119));
                break;
            case 20:
                ((bjb) view).f(jb6.L0(2131747657), !profileActivity.getMessagesController().n2(profileActivity.a(), profileActivity.g1), false);
                break;
            case 21:
                jt8 jt8Var = (jt8) view;
                TLRPC.UserFull userFull5 = profileActivity.w2;
                jt8Var.a(userFull5 != null ? userFull5.business_location : null, profileActivity.N3 < 0 && !profileActivity.s1);
                break;
            case 22:
                dt8 dt8Var = (dt8) view;
                dt8Var.setOnTimezoneSwitchClick(new zp8(this, (byte) 1));
                TLRPC.UserFull userFull6 = profileActivity.w2;
                dt8Var.a(userFull6 != null ? userFull6.business_work_hours : null, profileActivity.W4, profileActivity.X4, (profileActivity.N3 < 0 && !profileActivity.s1) || profileActivity.Q3 >= 0);
                break;
            case 23:
                jr8 jr8Var = (jr8) view;
                TLRPC.Chat L014 = profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.w2.personal_channel_id));
                ir8 ir8Var = profileActivity.x2;
                jr8Var.a(ir8Var != null ? ir8Var.d : null, L014);
                break;
            case 26:
                njb njbVar = (njb) view;
                njbVar.setLinkTextRippleColor(null);
                int i30 = profileActivity.S3;
                if (i != i30 || profileActivity.m4 < 0) {
                    if (i == profileActivity.q4) {
                        njbVar.setFixedSize(0);
                        njbVar.setText(jb6.L0(2131754272));
                        break;
                    } else if (i == i30) {
                        profileActivity.getMessagesController().a2(profileActivity.a());
                        TLRPC.UserFull userFull7 = profileActivity.w2;
                        if (userFull7 != null) {
                            botVerification = userFull7.bot_verification;
                        } else {
                            TLRPC.ChatFull chatFull4 = profileActivity.v2;
                            botVerification = chatFull4 != null ? chatFull4.bot_verification : null;
                        }
                        Long valueOf = (userFull7 == null || !TLObject.hasFlag(userFull7.flags2, 33554432)) ? null : Long.valueOf(profileActivity.w2.bot_manager_id);
                        TLRPC.UserFull userFull8 = profileActivity.w2;
                        TLRPC.PeerSettings peerSettings = userFull8 != null ? userFull8.settings : null;
                        TLRPC.User W16 = (peerSettings == null || peerSettings.bot_inviter_id == 0) ? null : profileActivity.getMessagesController().W1(Long.valueOf(peerSettings.bot_inviter_id));
                        TLRPC.User W17 = (peerSettings == null || peerSettings.bot_owner_id == 0) ? null : profileActivity.getMessagesController().W1(Long.valueOf(peerSettings.bot_owner_id));
                        byte b3 = 14;
                        if (profileActivity.l4 >= 0 || botVerification != null || valueOf != null || W16 != null || W17 != null) {
                            njbVar.setFixedSize(0);
                            TLRPC.User W18 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                            boolean z17 = W18 != null && W18.bot && W18.bot_can_edit;
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            if (profileActivity.l4 >= 0) {
                                spannableStringBuilder4.append(gm.P2(jb6.L0(z17 ? 2131746438 : 2131746440), new n28((byte) 4, (Object) this, z17)));
                                if (botVerification != null || valueOf != null) {
                                    spannableStringBuilder4.append("\n\n\n");
                                }
                            }
                            if (botVerification != null) {
                                spannableStringBuilder4.append("x");
                                spannableStringBuilder4.setSpan(new gn(botVerification.icon, njbVar.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                spannableStringBuilder4.append(" ");
                                SpannableString spannableString2 = new SpannableString(k47.h0(botVerification.description, false));
                                try {
                                    gm.c(spannableString2, 1, false, false);
                                    for (URLSpan uRLSpan : (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class)) {
                                        int spanStart = spannableString2.getSpanStart(uRLSpan);
                                        int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                        String url = uRLSpan.getURL();
                                        spannableString2.removeSpan(uRLSpan);
                                        spannableString2.setSpan(new cq8(this, url, url), spanStart, spanEnd, 33);
                                    }
                                } catch (Exception e2) {
                                    fc4.f(e2);
                                }
                                spannableStringBuilder4.append((CharSequence) spannableString2);
                            } else if (valueOf != null && (W1 = profileActivity.getMessagesController().W1(valueOf)) != null) {
                                int length = spannableStringBuilder4.length();
                                spannableStringBuilder4.append("</>");
                                spannableStringBuilder4.setSpan(new pn2(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                spannableStringBuilder4.append(" ");
                                spannableStringBuilder4.append(gm.M2(jb6.Z(2131746442, m9c.p(W1)), cmb.Wc, profileActivity.A0, new mn8(this, valueOf, b3), false));
                            }
                            if (W16 != null || W17 != null) {
                                if (spannableStringBuilder4.length() > 0) {
                                    spannableStringBuilder4.append("\n\n");
                                }
                                if (W16 != null) {
                                    final long j4 = W16.id;
                                    spannableStringBuilder4.append(gm.M2(jb6.Z(2131746445, m9c.r(W16)), cmb.Wc, profileActivity.A0, new Runnable(this) { // from class: aq8
                                        public final /* synthetic */ lq8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b2;
                                            long j5 = j4;
                                            lq8 lq8Var = this.b;
                                            switch (b4) {
                                                case 0:
                                                    lq8Var.e.presentFragment(ProfileActivity.S2(j5));
                                                    break;
                                                default:
                                                    lq8Var.e.presentFragment(ProfileActivity.S2(j5));
                                                    break;
                                            }
                                        }
                                    }, false));
                                }
                                if (W17 != null) {
                                    if (W16 != null) {
                                        spannableStringBuilder4.append("\n");
                                    }
                                    final long j5 = W17.id;
                                    final byte b4 = 1;
                                    spannableStringBuilder4.append(gm.M2(jb6.Z(2131746446, m9c.r(W17)), cmb.Wc, profileActivity.A0, new Runnable(this) { // from class: aq8
                                        public final /* synthetic */ lq8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b4;
                                            long j52 = j5;
                                            lq8 lq8Var = this.b;
                                            switch (b42) {
                                                case 0:
                                                    lq8Var.e.presentFragment(ProfileActivity.S2(j52));
                                                    break;
                                                default:
                                                    lq8Var.e.presentFragment(ProfileActivity.S2(j52));
                                                    break;
                                            }
                                        }
                                    }, false));
                                }
                            }
                            njbVar.setLinkTextRippleColor(Integer.valueOf(cmb.p1(0.2f, profileActivity.getThemedColor(cmb.A6))));
                            njbVar.setText(spannableStringBuilder4);
                            break;
                        } else {
                            njbVar.setFixedSize(14);
                            njbVar.setText(null);
                            break;
                        }
                    } else if (i == profileActivity.U3) {
                        TLRPC.User W19 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                        if (W19 == null || !W19.bot || !W19.bot_can_edit) {
                            njbVar.setFixedSize(0);
                            String r = m9c.r(W19);
                            TLRPC.UserFull userFull9 = profileActivity.w2;
                            njbVar.setText(jb6.Z(2131746448, r, bc.J0((userFull9 == null || (starrefprogram = userFull9.starref_program) == null) ? 0 : starrefprogram.commission_permille)));
                            break;
                        } else {
                            njbVar.setFixedSize(0);
                            String r2 = m9c.r(W19);
                            TLRPC.UserFull userFull10 = profileActivity.w2;
                            njbVar.setText(jb6.Z(2131746447, r2, bc.J0((userFull10 == null || (starrefprogram2 = userFull10.starref_program) == null) ? 0 : starrefprogram2.commission_permille)));
                            break;
                        }
                    }
                } else {
                    njbVar.setFixedSize(0);
                    njbVar.setText(jb6.L0(2131754273));
                    break;
                }
                break;
            case 27:
                yb ybVar = (yb) view;
                ybVar.a(profileActivity.getThemedColor(cmb.kk), R.drawable.filled_affiliate, jb6.L0(2131746449), null);
                TLRPC.UserFull userFull11 = profileActivity.w2;
                if (userFull11 != null && (starrefprogram3 = userFull11.starref_program) != null) {
                    str12 = bc.J0(starrefprogram3.commission_permille);
                }
                ybVar.setPercent(str12);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(gm.L(16.0f), gm.L(10.0f), gm.L(16.0f), gm.L(10.0f));
                if (i == profileActivity.r4) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    pn2 pn2Var = new pn2(R.drawable.round_warn);
                    pn2Var.d(gm.L(1.0f));
                    pn2Var.y = cmb.v0(cmb.mk, profileActivity.A0);
                    profileActivity.c7 = pn2Var;
                    spannableStringBuilder5.setSpan(pn2Var, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append((CharSequence) jb6.Z(2131746354, m9c.l(profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                so2 so2Var = (so2) view;
                if (profileActivity.F2 != null) {
                    i19 = ((d) profileActivity).currentAccount;
                    so2Var.a(i19, profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.F2.linked_community_id)));
                    break;
                } else if (profileActivity.e1 != 0 && (W12 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1))) != null) {
                    i18 = ((d) profileActivity).currentAccount;
                    so2Var.a(i18, profileActivity.getMessagesController().L0(Long.valueOf(W12.linked_community_id)));
                    break;
                }
                break;
            case 35:
                mc B0 = profileActivity.getMessagesController().B0();
                int i31 = i - profileActivity.n4;
                TL_agent.settings settingsVar = B0.d;
                if (settingsVar != null && i31 >= 0 && i31 < settingsVar.keys.size()) {
                    String str19 = B0.d.keys.get(i31).provider;
                    ((cd) view).a(B0.d(str19), str19, true, TextUtils.equals(str19, B0.d.active_provider), false, true);
                    break;
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View jf5Var;
        View view;
        View hq8Var;
        View view2;
        int i2;
        byte b = 0;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i) {
            case 1:
                jf5Var = new jf5(this.c, cmb.K6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case nm7.S /* 30 */:
                eq8 eq8Var = new eq8(18, profileActivity.A0, this.c, i == 30, i == 19);
                eq8Var.setContentDescriptionValueFirst(true);
                view = eq8Var;
                jf5Var = view;
                break;
            case 3:
                fq8 fq8Var = new fq8(this, context, profileActivity, profileActivity.A0);
                profileActivity.o6 = fq8Var;
                view2 = fq8Var;
                jf5Var = view2;
                break;
            case 4:
                view2 = new z92(this, context, profileActivity.A0);
                jf5Var = view2;
                break;
            case 5:
                View aq3Var = new aq3(context, profileActivity.A0);
                aq3Var.setPadding(gm.L(20.0f), gm.L(4.0f), 0, 0);
                jf5Var = aq3Var;
                break;
            case 6:
                jf5Var = new gq8(context, 18, 70, false, profileActivity.A0);
                break;
            case 7:
                jf5Var = new bba(context, (hg9) null);
                break;
            case 8:
                view = new w8c(profileActivity.E4 == -1 ? 9 : 6, 0, profileActivity.A0, this.c, true, false);
                jf5Var = view;
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                njb njbVar = new njb(10, profileActivity.A0, context);
                njbVar.getTextView().setGravity(1);
                anb.X(njbVar.getTextView(), cmb.z6, profileActivity.A0);
                njbVar.getTextView().setMovementMethod(null);
                njbVar.setText(gm.C0());
                njbVar.getTextView().setPadding(0, gm.L(14.0f), 0, gm.L(14.0f));
                jf5Var = njbVar;
                break;
            case 11:
            case 31:
                hq8Var = new hq8(context, gm.L(i == 31 ? 12.0f : 6.0f));
                hq8Var.setTag(-33024);
                jf5Var = hq8Var;
                break;
            case 12:
                hq8Var = new iq8(this, context);
                hq8Var.setBackground(new ColorDrawable(0));
                hq8Var.setTag(-33024);
                jf5Var = hq8Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view3 = profileActivity.O;
                view3.setTag(-33024);
                jf5Var = view3;
                break;
            case 15:
                view2 = new kq8(this, context, profileActivity.A0);
                jf5Var = view2;
                break;
            case 17:
                jf5Var = new njb(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View tt8Var = new tt8(i == 18 ? 0 : 1, profileActivity.A0, context);
                anb.h(cmb.c6, profileActivity.A0, tt8Var);
                jf5Var = tt8Var;
                break;
            case 20:
                jf5Var = new bjb(18, profileActivity.A0, context, false);
                break;
            case 21:
                View jt8Var = new jt8(context, profileActivity.A0);
                anb.h(cmb.c6, profileActivity.A0, jt8Var);
                jf5Var = jt8Var;
                break;
            case 22:
                View jq8Var = new jq8(context, profileActivity.A0);
                anb.h(cmb.c6, profileActivity.A0, jq8Var);
                jf5Var = jq8Var;
                break;
            case 23:
                jf5Var = new bq8(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                b61 b61Var = new b61(profileActivity.A0, context, true);
                b61Var.f();
                b61Var.i(jb6.M0(2131746441, null), false, true);
                b61Var.setOnClickListener(new zp8(this, (byte) 2));
                frameLayout.addView(b61Var, qoe.d(-1, 48.0f, nm7.D1, 18.0f, 14.0f, 18.0f, 14.0f));
                anb.h(cmb.c6, profileActivity.A0, frameLayout);
                view2 = frameLayout;
                jf5Var = view2;
                break;
            case 26:
                jf5Var = new njb(context, profileActivity.A0);
                break;
            case 27:
                jf5Var = new yb(context, profileActivity.A0);
                break;
            case 28:
                View o72Var = new o72(context, (byte) 21);
                o72Var.setTag(-33024);
                jf5Var = o72Var;
                break;
            case 32:
                jf5Var = new wq8(profileActivity, context);
                break;
            case 33:
                jf5Var = new so2(context, profileActivity.A0);
                break;
            case 34:
                FrameLayout frameLayout2 = new FrameLayout(context);
                b61 b61Var2 = new b61(profileActivity.A0, context, true);
                b61Var2.f();
                b61Var2.i(jb6.M0(2131754302, null), false, true);
                b61Var2.setOnClickListener(new zp8(this, b));
                frameLayout2.addView(b61Var2, qoe.d(-1, 48.0f, nm7.D1, 18.0f, 10.0f, 18.0f, 10.0f));
                frameLayout2.setBackgroundColor(cmb.v0(cmb.c6, profileActivity.A0));
                view2 = frameLayout2;
                jf5Var = view2;
                break;
            case 35:
                i2 = ((d) profileActivity).currentAccount;
                jf5Var = new cd(i2, profileActivity.A0, context);
                break;
        }
        if (i != 13) {
            jf5Var.setLayoutParams(new g69(-1, -2));
        }
        return new b59(jf5Var);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof hjb) {
            ((hjb) view).a.setLoading(profileActivity.t5);
            ((hjb) view).b.setLoading(profileActivity.t5);
        }
    }

    @Override // y59
    public final void z(u69 u69Var) {
        View view = u69Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
