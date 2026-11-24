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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ko8 extends n39 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public ko8(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        int b = s49Var.b();
        ProfileActivity profileActivity = this.e;
        if (b == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b = s49Var.b();
            if (b != profileActivity.g3 && b != profileActivity.U2 && b != profileActivity.i3 && b != profileActivity.h3 && b != profileActivity.W2 && b != profileActivity.X2 && b != profileActivity.A3 && b != profileActivity.j3 && b != profileActivity.k3 && b != profileActivity.r3 && b != profileActivity.o3 && b != profileActivity.l3 && b != profileActivity.n3 && b != profileActivity.s3 && b != profileActivity.t3 && b != profileActivity.w3 && b != profileActivity.x3 && b != profileActivity.y3 && b != profileActivity.z3 && b != profileActivity.P2 && b != profileActivity.d4 && b != profileActivity.f4 && b != profileActivity.j4 && b != profileActivity.i4 && b != profileActivity.m3 && b != profileActivity.V2 && b != profileActivity.R2 && b != profileActivity.g4 && b != profileActivity.h4 && b != profileActivity.o4) {
                return false;
            }
        } else {
            View view = s49Var.a;
            if (view instanceof v6c) {
                Object currentObject = ((v6c) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && l7c.D((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i = s49Var.f;
            if (i == 1 || i == 5 || i == 7 || i == 11 || i == 31 || i == 28 || i == 12 || i == 13 || i == 9 || i == 10 || i == 25 || i == 32) {
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
                    SpannableString spannableString = new SpannableString(b00.h("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        co8 co8Var = new co8(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, co8Var);
                        clickableSpan = co8Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new cm4(bkb.Wc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = k96.M0(2131743429, null);
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

    @Override // w39
    public final int b() {
        return this.e.O2;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        ProfileActivity profileActivity = this.e;
        if (i == profileActivity.E3 || i == profileActivity.w4 || i == profileActivity.f3 || i == profileActivity.T2 || i == profileActivity.q3 || i == profileActivity.v3 || i == profileActivity.q4) {
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
        if (i == profileActivity.t4 || i == profileActivity.u4 || i == profileActivity.W3 || i == profileActivity.Y3 || i == profileActivity.X3 || i == profileActivity.A4 || i == profileActivity.B4 || i == profileActivity.C4 || i == profileActivity.D4 || i == profileActivity.J4 || i == profileActivity.z4 || i == profileActivity.P4 || i == profileActivity.O4 || i == profileActivity.V3 || i == profileActivity.g3 || i == profileActivity.i3 || i == profileActivity.h3 || i == profileActivity.j3 || i == profileActivity.k3 || i == profileActivity.r3 || i == profileActivity.o3 || i == profileActivity.l3 || i == profileActivity.n3 || i == profileActivity.s3 || i == profileActivity.t3 || i == profileActivity.w3 || i == profileActivity.x3 || i == profileActivity.y3 || i == profileActivity.z3 || i == profileActivity.P2 || i == profileActivity.d4 || i == profileActivity.b4 || i == profileActivity.a4 || i == profileActivity.m3 || i == profileActivity.j4 || i == profileActivity.i4 || i == profileActivity.E4 || i == profileActivity.F4 || i == profileActivity.G4) {
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
        if (i == profileActivity.Q4 || i == profileActivity.K4 || i == profileActivity.p4 || i == profileActivity.v4 || i == profileActivity.e3 || i == profileActivity.p3 || i == profileActivity.u3 || i == profileActivity.Q2 || i == profileActivity.c3 || i == profileActivity.Y2 || i == profileActivity.k4 || i == profileActivity.Z3 || i == profileActivity.c4 || i == profileActivity.S2 || i == profileActivity.a3 || i == profileActivity.I4 || i == profileActivity.s4 || i == profileActivity.H4 || i == profileActivity.n4) {
            return 7;
        }
        if (i >= profileActivity.x4 && i < profileActivity.y4) {
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
        if (i == profileActivity.N4) {
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
        if (i == profileActivity.S3 || i == profileActivity.U3) {
            return 26;
        }
        if (i == profileActivity.m4) {
            return 32;
        }
        if (i == profileActivity.o4) {
            return 33;
        }
        if (i == profileActivity.T3) {
            return 27;
        }
        return (i == profileActivity.F3 || i == profileActivity.G3) ? 28 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x10c8  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x10f9  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x1091  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
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
        boolean z12;
        TLRPC.User user;
        TLRPC.User V1;
        TL_payments.starRefProgram starrefprogram3;
        TLRPC.User V12;
        int i18;
        int i19;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.V4;
        HashSet hashSet = profileActivity.n5;
        int i20 = s49Var.f;
        View view = s49Var.a;
        String str10 = "";
        String str11 = null;
        r11 = null;
        String str12 = null;
        TLRPC.ChatParticipant chatParticipant = null;
        final byte b2 = 0;
        switch (i20) {
            case 1:
                ld5 ld5Var = (ld5) view;
                if (i == profileActivity.E3) {
                    if (!hc2.T(profileActivity.F2) || profileActivity.F2.megagroup || profileActivity.L3 == -1) {
                        ld5Var.setText(k96.L0(2131749005));
                    } else {
                        ld5Var.setText(k96.L0(2131746035));
                    }
                } else if (i == profileActivity.w4) {
                    ld5Var.setText(k96.L0(2131752365));
                } else if (i == profileActivity.f3) {
                    ld5Var.setText(k96.L0(2131745791));
                } else if (i == profileActivity.T2) {
                    ld5Var.setText(k96.L0(2131754709));
                } else if (i == profileActivity.q3) {
                    ld5Var.setText(k96.L0(2131745287));
                } else if (i == profileActivity.v3) {
                    ld5Var.setText(k96.L0(2131745294));
                } else if (i == profileActivity.q4) {
                    ld5Var.setText(k96.L0(2131752994));
                }
                int themedColor = profileActivity.getThemedColor(bkb.K6);
                RectF rectF = ProfileActivity.Z6;
                ld5Var.setTextColor(themedColor);
                break;
            case 2:
            case 19:
            case kk7.S /* 30 */:
                ghb ghbVar = (ghb) view;
                if (i == profileActivity.V2) {
                    TLRPC.UserFull W1 = profileActivity.getMessagesController().W1(profileActivity.e1);
                    if (W1 != null && W1.birthday != null) {
                        boolean d = oj0.d(W1);
                        TL_account.TL_birthday tL_birthday = W1.birthday;
                        boolean z13 = (tL_birthday.flags & 1) != 0;
                        int years = z13 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String c0 = UserInfoActivity.c0(W1.birthday);
                        ghbVar.c(vu3.p(z13 ? k96.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", c0) : k96.Z(d ? 2131746530 : 2131746527, c0), ghbVar.a, new j45((Object) this, (Object) s49Var, i, (byte) 26)), k96.L0(d ? 2131746531 : 2131746533), (!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().G3()) {
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
                        TLRPC.User V13 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
                        if (V13 != null) {
                            if (!TextUtils.isEmpty(profileActivity.i5)) {
                                L02 = yjb.k(new StringBuilder("+"), profileActivity.i5, p38.f());
                                str8 = profileActivity.i5;
                            } else if (!TextUtils.isEmpty(V13.phone)) {
                                String k = yjb.k(new StringBuilder("+"), V13.phone, p38.f());
                                str8 = V13.phone;
                                L02 = k;
                            }
                            boolean z14 = str8 == null && str8.matches("888\\d{8}");
                            profileActivity.g5 = z14;
                            ghbVar.c(L02, k96.L0(!z14 ? 2131754248 : 2131747098), false);
                        }
                        L02 = k96.L0(2131747101);
                        str8 = null;
                        if (str8 == null) {
                        }
                        profileActivity.g5 = z14;
                        ghbVar.c(L02, k96.L0(!z14 ? 2131754248 : 2131747098), false);
                    } else if (i == profileActivity.I3) {
                        TLRPC.UserFull W12 = profileActivity.getMessagesController().W1(profileActivity.e1);
                        if (W12 != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = W12.note;
                            i4 = ((d) profileActivity).currentAccount;
                            if (y6c.h(i4).p()) {
                                h0 = k27.h0(tL_textWithEntities, false);
                                if (!(h0 instanceof SpannableStringBuilder)) {
                                    h0 = new SpannableStringBuilder(h0);
                                }
                                gl.c((SpannableStringBuilder) h0, 1, false, false);
                            } else {
                                h0 = k27.h0(k27.w5(tL_textWithEntities), false);
                            }
                            ghbVar.d(h0, k96.L0(2131746457), k96.L0(2131746456));
                        }
                    } else if (i == profileActivity.M3) {
                        ArrayList arrayList2 = new ArrayList();
                        if (profileActivity.e1 != 0) {
                            TLRPC.User V14 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
                            if (V14 != null) {
                                arrayList2.addAll(V14.usernames);
                                if (!TextUtils.isEmpty(V14.username)) {
                                    tL_username = cf3.b(V14.username, arrayList2);
                                    str5 = V14.username;
                                    ArrayList arrayList3 = V14 != null ? new ArrayList() : new ArrayList(V14.usernames);
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
                                    String L04 = k96.L0(2131743435);
                                    if (str5 == null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                co8 co8Var = new co8(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, co8Var);
                                                clickableSpan = co8Var;
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
                            if (V14 != null) {
                            }
                            if (TextUtils.isEmpty(str5)) {
                            }
                            String L042 = k96.L0(2131743435);
                            if (str5 == null) {
                            }
                            z = !profileActivity.s1;
                            ArrayList arrayList42 = arrayList3;
                            str3 = str7;
                            arrayList2 = arrayList42;
                            str4 = L042;
                        } else if (profileActivity.F2 != null) {
                            TLRPC.Chat K0 = profileActivity.getMessagesController().K0(Long.valueOf(profileActivity.f1));
                            String K = hc2.K(K0, false);
                            if (K0 != null) {
                                arrayList2.addAll(K0.usernames);
                            }
                            if (hc2.t0(K0)) {
                                z2 = !profileActivity.s1;
                                StringBuilder sb = new StringBuilder();
                                ug8.z(profileActivity.getMessagesController().N2, "/", K, sb);
                                String str13 = str10;
                                if (profileActivity.g1 != 0) {
                                    str13 = "/" + profileActivity.g1;
                                }
                                sb.append(str13);
                                str6 = sb.toString();
                                str4 = k96.L0(2131748957);
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
                                str4 = k96.L0(2131748953);
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
                        ghbVar.c(str3, E(str5, arrayList2, str4), profileActivity.G3 == -1 && !(!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) && profileActivity.V2 < 0);
                    } else if (i == profileActivity.J3) {
                        TLRPC.ChatFull chatFull = profileActivity.v2;
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                ghbVar.c(((TLRPC.TL_channelLocation) channelLocation).address, k96.L0(2131753958), false);
                            }
                        }
                    } else if (i == profileActivity.U2) {
                        i3 = ((d) profileActivity).currentAccount;
                        TLRPC.User f = y6c.h(i3).f();
                        ghbVar.c((f == null || (str2 = f.phone) == null || str2.length() == 0) ? k96.L0(2131747639) : yjb.k(new StringBuilder("+"), f.phone, p38.f()), k96.L0(2131744019), true);
                        ghbVar.setContentDescriptionValueFirst(false);
                    } else if (i == profileActivity.W2) {
                        i2 = ((d) profileActivity).currentAccount;
                        TLRPC.User f2 = y6c.h(i2).f();
                        String L05 = k96.L0(2131743435);
                        if (f2 == null || f2.usernames.size() <= 0) {
                            String p = l7c.p(f2);
                            if (f2 == null || TextUtils.isEmpty(p)) {
                                L0 = k96.L0(2131743422);
                                charSequence = L05;
                            } else {
                                L0 = b00.h("@", p);
                                charSequence = L05;
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
                            L0 = (str == null || TextUtils.isEmpty(str)) ? k96.L0(2131743422) : "@".concat(str);
                            charSequence = E(str, f2.usernames, L05);
                        }
                        ghbVar.c(L0, charSequence, true);
                        ghbVar.setContentDescriptionValueFirst(true);
                    }
                    z = false;
                }
                if (b2 != 0) {
                    Drawable drawable = ghbVar.getContext().getDrawable(R.drawable.msg_input_gift);
                    int themedColor2 = profileActivity.getThemedColor(bkb.U6);
                    RectF rectF2 = ProfileActivity.Z6;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.U6 = drawable;
                    if (l7c.c(profileActivity.w2)) {
                        ghbVar.setImage(null);
                        ghbVar.setImageClickListener(null);
                    } else {
                        ghbVar.b(drawable, k96.L0(2131749508));
                        ghbVar.setImageClickListener(new wl8(profileActivity, (byte) 12));
                    }
                } else if (z) {
                    Drawable drawable2 = ghbVar.getContext().getDrawable(R.drawable.header_qr_24);
                    int themedColor3 = profileActivity.getThemedColor(bkb.u8);
                    RectF rectF3 = ProfileActivity.Z6;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    profileActivity.V6 = drawable2;
                    ghbVar.b(drawable2, k96.L0(2131750456));
                    ghbVar.setImageClickListener(new wl8(profileActivity, (byte) 13));
                } else {
                    ghbVar.setImage(null);
                    ghbVar.setImageClickListener(null);
                }
                ghbVar.setTag(Integer.valueOf(i));
                ghbVar.a.setLoading(profileActivity.o5);
                ghbVar.b.setLoading(profileActivity.o5);
                break;
            case 3:
                s1 s1Var = (s1) view;
                if (i == profileActivity.K3) {
                    TLRPC.User user2 = profileActivity.w2.user;
                    if (user2 == null) {
                        user2 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.w2.id));
                    }
                    s1Var.f(profileActivity.w2.about, k96.L0(2131743526), profileActivity.s2 || !(user2 == null || !user2.premium || profileActivity.w2.about == null));
                    break;
                } else if (i == profileActivity.L3) {
                    String str15 = profileActivity.v2.about;
                    while (str15.contains("\n\n\n")) {
                        str15 = str15.replace("\n\n\n", "\n\n");
                    }
                    s1Var.f(str15, k96.L0(2131751447), hc2.T(profileActivity.F2) && !profileActivity.F2.megagroup);
                    break;
                } else if (i == profileActivity.X2) {
                    TLRPC.UserFull userFull = profileActivity.w2;
                    if (userFull == null || !TextUtils.isEmpty(userFull.about)) {
                        TLRPC.UserFull userFull2 = profileActivity.w2;
                        s1Var.f(userFull2 == null ? k96.L0(2131748587) : userFull2.about, k96.L0(2131743526), profileActivity.getUserConfig().p());
                        TLRPC.UserFull userFull3 = profileActivity.w2;
                        profileActivity.A2 = userFull3 != null ? userFull3.about : null;
                    } else {
                        s1Var.f(k96.L0(2131743526), k96.L0(2131743525), false);
                        profileActivity.A2 = null;
                    }
                    s1Var.setMoreButtonDisabled(true);
                    break;
                }
                break;
            case 4:
            case 18:
            case 24:
                wgb wgbVar = (wgb) view;
                int i23 = bkb.l6;
                int i24 = bkb.F6;
                wgbVar.g(i23, i24);
                wgbVar.setTag(Integer.valueOf(i24));
                if (i == profileActivity.t4) {
                    int i25 = profileActivity.getMessagesController().Y0(Integer.valueOf(cf3.h(profileActivity.i1))).ttl;
                    wgbVar.q(k96.L0(2131748395), i25 == 0 ? k96.L0(2131745169) : k96.c0(i25), false, false);
                } else if (i == profileActivity.O4) {
                    wgbVar.k(k96.L0(2131743672), false);
                    wgbVar.g(-1, bkb.o7);
                } else if (i == profileActivity.u4) {
                    yj5 yj5Var = new yj5();
                    TLRPC.EncryptedChat Y0 = profileActivity.getMessagesController().Y0(Integer.valueOf(cf3.h(profileActivity.i1)));
                    byte[] bArr = Y0.key_hash;
                    yj5Var.a = bArr;
                    if (bArr == null) {
                        byte[] bArr2 = Y0.auth_key;
                        Typeface typeface = gl.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        yj5Var.a = bArr3;
                        Y0.key_hash = bArr3;
                    }
                    yj5Var.invalidateSelf();
                    wgbVar.v(k96.L0(2131751120), yj5Var, false);
                } else if (i == profileActivity.P4) {
                    wgbVar.g(-1, bkb.n6);
                    if (profileActivity.F2.megagroup) {
                        wgbVar.k(k96.L0(2131746468), false);
                    } else {
                        wgbVar.k(k96.L0(2131746469), false);
                    }
                } else if (i == profileActivity.A4) {
                    TLRPC.ChatFull chatFull2 = profileActivity.v2;
                    TLRPC.Chat chat = profileActivity.F2;
                    if (chatFull2 != null) {
                        if (!hc2.T(chat) || profileActivity.F2.megagroup) {
                            wgbVar.s(k96.L0(2131752365), k96.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.K4 + (-1));
                        } else {
                            wgbVar.s(k96.L0(2131752277), k96.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.K4 + (-1));
                        }
                    } else if (!hc2.T(chat) || profileActivity.F2.megagroup) {
                        wgbVar.o(R.drawable.msg_groups, k96.L0(2131752365), i != profileActivity.K4 + (-1));
                    } else {
                        wgbVar.o(R.drawable.msg_groups, k96.L0(2131752277), i != profileActivity.K4 + (-1));
                    }
                } else if (i == profileActivity.B4) {
                    if (profileActivity.v2 != null) {
                        wgbVar.s(k96.L0(2131744195), String.format("%d", Integer.valueOf(profileActivity.v2.requests_pending)), R.drawable.msg_requests, i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.C4) {
                    if (profileActivity.v2 != null) {
                        wgbVar.s(k96.L0(2131752505), String.format("%d", Integer.valueOf(profileActivity.v2.admins_count)), R.drawable.msg_admins, i != profileActivity.K4 - 1);
                    } else {
                        wgbVar.o(R.drawable.msg_admins, k96.L0(2131752505), i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.D4) {
                    wgbVar.o(R.drawable.msg_customize, k96.L0(2131752507), i != profileActivity.K4 - 1);
                } else if (i == profileActivity.G4) {
                    i15 = ((d) profileActivity).currentAccount;
                    TL_stars.StarsAmount c = ct0.g(i15).c(-profileActivity.f1);
                    i16 = ((d) profileActivity).currentAccount;
                    long i26 = ct0.g(i16).i(-profileActivity.f1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i26 > 0) {
                        double d2 = i26 / 1.0E9d;
                        if (d2 > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gl.o0((int) d2, 0));
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
                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) jva.H0(c, 0.777f, ' '));
                    }
                    wgbVar.s(k96.L0(2131752278), zi1.L(jva.a1(false, spannableStringBuilder, 0.7f, null), wgbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                } else if (i == profileActivity.E4) {
                    i14 = ((d) profileActivity).currentAccount;
                    TL_stars.StarsAmount c2 = ct0.g(i14).c(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (c2.amount > 0) {
                        spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) jva.H0(c2, 0.777f, ' '));
                    }
                    wgbVar.s(k96.L0(2131753108), zi1.L(jva.a1(false, spannableStringBuilder2, 0.7f, null), wgbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                } else if (i == profileActivity.F4) {
                    i13 = ((d) profileActivity).currentAccount;
                    long i27 = ct0.g(i13).i(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    if (i27 > 0) {
                        double d3 = i27 / 1.0E9d;
                        if (d3 > 1000.0d) {
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) gl.o0((int) d3, 0));
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
                    wgbVar.s(k96.L0(2131753107), zi1.L(jva.a1(false, spannableStringBuilder3, 0.7f, null), wgbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                } else if (i == profileActivity.J4) {
                    if (profileActivity.v2 != null) {
                        String L06 = k96.L0(2131752441);
                        TLRPC.ChatFull chatFull3 = profileActivity.v2;
                        wgbVar.s(L06, String.format("%d", Integer.valueOf(Math.max(chatFull3.banned_count, chatFull3.kicked_count))), R.drawable.msg_user_remove, i != profileActivity.K4 - 1);
                    } else {
                        wgbVar.o(R.drawable.msg_user_remove, k96.L0(2131752441), i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.z4) {
                    wgbVar.g(i23, i24);
                    int i28 = i + 1;
                    wgbVar.o(R.drawable.msg_contact_add, k96.L0(2131754398), profileActivity.K4 == -1 || (i28 >= profileActivity.x4 && i28 < profileActivity.y4));
                } else if (i == profileActivity.V3) {
                    wgbVar.k(k96.L0(2131745407), true);
                } else if (i == profileActivity.a4) {
                    wgbVar.o(R.drawable.msg_contact_add, k96.L0(2131754374), false);
                    wgbVar.g(i23, i24);
                } else if (i == profileActivity.X3) {
                    wgbVar.o(R.drawable.menu_reaction_delete_24, k96.L0(2131751495), false);
                    wgbVar.g(bkb.p7, bkb.o7);
                } else if (i == profileActivity.Y3) {
                    TLRPC.Chat K02 = profileActivity.getMessagesController().K0(Long.valueOf(-profileActivity.f5));
                    if (K02 == null || !hc2.w(2, K02)) {
                        wgbVar.o(R.drawable.msg_report, k96.L0(2131746018), false);
                    } else {
                        wgbVar.o(R.drawable.msg_block2, k96.L0(2131746017), false);
                    }
                    wgbVar.g(bkb.p7, bkb.o7);
                } else if (i == profileActivity.W3) {
                    wgbVar.k(k96.L0(2131745993), false);
                    int i29 = bkb.o7;
                    wgbVar.g(-1, i29);
                    wgbVar.g(-1, i29);
                } else if (i == profileActivity.h3) {
                    wgbVar.u(k96.L0(2131748862), k96.j0(), false, R.drawable.msg2_language, false);
                    wgbVar.setImageLeft(23);
                } else if (i == profileActivity.g3) {
                    wgbVar.o(R.drawable.msg2_notifications, k96.L0(2131747729), true);
                } else if (i == profileActivity.i3) {
                    wgbVar.o(R.drawable.msg2_secret, k96.L0(2131746580), true);
                } else if (i == profileActivity.j3) {
                    wgbVar.o(R.drawable.msg2_data, k96.L0(2131751665), true);
                } else if (i == profileActivity.k3) {
                    wgbVar.o(R.drawable.msg2_discussion, k96.L0(2131752198), true);
                } else if (i == profileActivity.l3) {
                    wgbVar.o(R.drawable.msg2_folder, k96.L0(2131750679), true);
                } else if (i == profileActivity.n3) {
                    wgbVar.o(R.drawable.msg2_sticker, k96.L0(2131744620), true);
                } else if (i == profileActivity.m3) {
                    wgbVar.o(R.drawable.msg2_battery, k96.L0(2131746875), true);
                } else if (i == profileActivity.r3) {
                    wgbVar.o(R.drawable.msg2_ask_question, k96.L0(2131753983), true);
                } else if (i == profileActivity.s3) {
                    wgbVar.o(R.drawable.msg2_help, k96.L0(2131744001), true);
                } else if (i == profileActivity.t3) {
                    wgbVar.o(R.drawable.msg2_policy, k96.L0(2131746592), false);
                } else if (i == profileActivity.w3) {
                    wgbVar.k(k96.L0(2131751601), true);
                } else if (i == profileActivity.x3) {
                    wgbVar.k(k96.L0(2131751602), true);
                } else if (i == profileActivity.y3) {
                    wgbVar.k(k96.L0(2131751638), profileActivity.z3 != -1);
                } else if (i == profileActivity.z3) {
                    wgbVar.k("Switch Backend", false);
                } else if (i == profileActivity.o3) {
                    wgbVar.o(R.drawable.msg2_devices, k96.L0(2131751443), true);
                } else if (i == profileActivity.P2) {
                    profileActivity.W.K(86);
                    profileActivity.W.G();
                    wgbVar.p(k96.L0(2131745324), profileActivity.W, false);
                    wgbVar.g(bkb.u6, bkb.t6);
                    wgbVar.getImageView().setPadding(0, 0, 0, gl.L(8.0f));
                    wgbVar.setImageLeft(12);
                    profileActivity.N2 = wgbVar;
                } else if (i == profileActivity.b4) {
                    wgbVar.o(R.drawable.msg_contact_add, k96.L0(2131753048), false);
                    wgbVar.g(bkb.u6, bkb.t6);
                } else if (i == profileActivity.d4) {
                    wgbVar.o(R.drawable.msg_groups_create, k96.L0(2131754369), false);
                } else if (i == profileActivity.f4) {
                    wgbVar.p(k96.L0(2131743990), new ul(gl.L(24.0f), gl.L(24.0f), nh8.d().f), true);
                    wgbVar.setImageLeft(23);
                } else if (i == profileActivity.g4) {
                    i12 = ((d) profileActivity).currentAccount;
                    gta t = gta.t(i12);
                    long j = t.m().amount;
                    String L07 = k96.L0(2131748412);
                    CharSequence charSequence2 = str10;
                    if (t.e) {
                        charSequence2 = str10;
                        if (j > 0) {
                            charSequence2 = jva.G0(t.m(), 0.85f, ' ');
                        }
                    }
                    wgbVar.t(L07, charSequence2, new ul(gl.L(24.0f), gl.L(24.0f), nh8.d().h), true);
                    wgbVar.setImageLeft(23);
                } else if (i == profileActivity.h4) {
                    i11 = ((d) profileActivity).currentAccount;
                    gta I = gta.I(i11);
                    long j2 = I.m().amount;
                    String L08 = k96.L0(2131748108);
                    CharSequence charSequence3 = str10;
                    if (I.e) {
                        charSequence3 = str10;
                        if (j2 > 0) {
                            charSequence3 = jva.G0(I.m(), 0.85f, ' ');
                        }
                    }
                    wgbVar.s(L08, charSequence3, R.drawable.settings_gram_24, true);
                    wgbVar.setImageLeft(23);
                } else if (i == profileActivity.i4) {
                    wgbVar.o(R.drawable.menu_shop, k96.L0(2131744011), true);
                    wgbVar.setImageLeft(23);
                } else if (i == profileActivity.j4) {
                    wgbVar.o(R.drawable.menu_gift, k96.L0(2131745447), false);
                    wgbVar.setImageLeft(23);
                } else {
                    i5 = profileActivity.botPermissionLocation;
                    if (i == i5) {
                        String L09 = k96.L0(2131752995);
                        tq0 tq0Var = profileActivity.t2;
                        boolean z15 = tq0Var != null && tq0Var.f();
                        int themedColor4 = profileActivity.getThemedColor(bkb.kk);
                        i10 = profileActivity.botPermissionBiometry;
                        wgbVar.m(L09, z15, R.drawable.filled_access_location, themedColor4, i10 != -1);
                    } else {
                        i6 = profileActivity.botPermissionBiometry;
                        if (i == i6) {
                            String L010 = k96.L0(2131752997);
                            uo0 uo0Var = profileActivity.u2;
                            wgbVar.m(L010, uo0Var != null && uo0Var.e, R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(bkb.nk), false);
                        } else {
                            i7 = profileActivity.botPermissionEmojiStatus;
                            if (i == i7) {
                                String L011 = k96.L0(2131752996);
                                TLRPC.UserFull userFull4 = profileActivity.w2;
                                boolean z16 = userFull4 != null && userFull4.bot_can_manage_emoji_status;
                                int themedColor5 = profileActivity.getThemedColor(bkb.ik);
                                i8 = profileActivity.botPermissionLocation;
                                if (i8 == -1) {
                                    i9 = profileActivity.botPermissionBiometry;
                                    if (i9 == -1) {
                                        z3 = false;
                                        wgbVar.m(L011, z16, R.drawable.filled_access_sleeping, themedColor5, z3);
                                    }
                                }
                                z3 = true;
                                wgbVar.m(L011, z16, R.drawable.filled_access_sleeping, themedColor5, z3);
                            }
                        }
                    }
                }
                zkb.U(wgbVar.c, bkb.H6, profileActivity.A0);
                break;
            case 6:
                vl7 vl7Var = (vl7) view;
                if (i == profileActivity.O3) {
                    i17 = ((d) profileActivity).currentAccount;
                    SharedPreferences u1 = na7.u1(i17);
                    long j3 = profileActivity.i1;
                    if (j3 == 0) {
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            j3 = -profileActivity.f1;
                        }
                    }
                    String p2 = im7.p(j3, profileActivity.g1, false);
                    boolean z17 = u1.getBoolean("custom_" + p2, false);
                    boolean contains = u1.contains("notify2_" + p2);
                    int g = ls6.g("notify2_", p2, u1, 0);
                    int g2 = ls6.g("notifyuntil_", p2, u1, 0);
                    if (g == 3 && g2 != Integer.MAX_VALUE) {
                        int currentTime = g2 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str11 = z17 ? k96.L0(2131747725) : k96.L0(2131747699);
                            z5 = true;
                        } else {
                            if (currentTime < 3600) {
                                str11 = k96.Y(2131742602, "WillUnmuteIn", k96.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str11 = k96.Y(2131742602, "WillUnmuteIn", k96.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str11 = k96.Y(2131742602, "WillUnmuteIn", k96.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z5 = false;
                        }
                    } else if (g == 0) {
                        if (!contains) {
                            z4 = profileActivity.getNotificationsController().w(j3);
                            if (z4) {
                                L03 = k96.L0(2131747701);
                            } else if (z17) {
                                str11 = k96.L0(2131747725);
                                z5 = z4;
                            } else {
                                L03 = k96.L0(2131747699);
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
                        str11 = k96.L0(2131747701);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str11 = String.format(Locale.US, k96.J0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str11, Integer.valueOf(hashSet.size()));
                    }
                    String str16 = str11;
                    vl7Var.setAnimationsEnabled(profileActivity.r5);
                    vl7Var.b(k96.L0(2131747731), str16, 0, z5, 0, false, profileActivity.l4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i));
                break;
            case 8:
                v6c v6cVar = (v6c) view;
                try {
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = profileActivity.U4;
                    chatParticipant = !isEmpty ? (TLRPC.ChatParticipant) arrayList5.get(((Integer) arrayList.get(i - profileActivity.x4)).intValue()) : (TLRPC.ChatParticipant) arrayList5.get(i - profileActivity.x4);
                } catch (Exception e) {
                    fa4.f(e);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str17 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = k96.L0(2131752411);
                            }
                            z9 = false;
                            z10 = true;
                            z11 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = k96.L0(2131752508);
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
                                str18 = k96.L0(2131752411);
                            }
                            str9 = str18;
                            z6 = false;
                            z7 = true;
                            z8 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str18)) {
                                str18 = k96.L0(2131752508);
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
                    TLRPC.User V15 = profileActivity.getMessagesController().V1(Long.valueOf(chatParticipant.user_id));
                    v6cVar.a(str9, z7, z8, l7c.D(V15) && hc2.h(profileActivity.getMessagesController().K0(Long.valueOf(profileActivity.f1))), new pq5(this, V15, str9, z7, z8, z6, (byte) 1));
                    v6cVar.e(V15, i != profileActivity.y4 + (-1));
                    break;
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                q8a q8aVar = (q8a) view;
                if (i == profileActivity.d3) {
                    q8aVar.setType(1);
                    break;
                } else if (i == profileActivity.b3) {
                    q8aVar.setType(0);
                    break;
                } else if (i == profileActivity.Z2) {
                    q8aVar.setType(2);
                    break;
                }
                break;
            case 17:
                ((mhb) view).setText(k96.L0(2131753151));
                break;
            case 20:
                ((ahb) view).f(k96.L0(2131747731), !profileActivity.getMessagesController().m2(profileActivity.a(), profileActivity.g1), false);
                break;
            case 21:
                gr8 gr8Var = (gr8) view;
                TLRPC.UserFull userFull5 = profileActivity.w2;
                gr8Var.a(userFull5 != null ? userFull5.business_location : null, profileActivity.N3 < 0 && !profileActivity.s1);
                break;
            case 22:
                br8 br8Var = (br8) view;
                br8Var.setOnTimezoneSwitchClick(new yn8(this, (byte) 1));
                TLRPC.UserFull userFull6 = profileActivity.w2;
                br8Var.a(userFull6 != null ? userFull6.business_work_hours : null, profileActivity.R4, profileActivity.S4, (profileActivity.N3 < 0 && !profileActivity.s1) || profileActivity.Q3 >= 0);
                break;
            case 23:
                ip8 ip8Var = (ip8) view;
                TLRPC.Chat K03 = profileActivity.getMessagesController().K0(Long.valueOf(profileActivity.w2.personal_channel_id));
                hp8 hp8Var = profileActivity.x2;
                ip8Var.a(hp8Var != null ? hp8Var.d : null, K03);
                break;
            case 26:
                mhb mhbVar = (mhb) view;
                mhbVar.setLinkTextRippleColor(null);
                if (i == profileActivity.S3) {
                    profileActivity.getMessagesController().Z1(profileActivity.a());
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
                    TLRPC.User V16 = (peerSettings == null || peerSettings.bot_inviter_id == 0) ? null : profileActivity.getMessagesController().V1(Long.valueOf(peerSettings.bot_inviter_id));
                    if (peerSettings == null || peerSettings.bot_owner_id == 0) {
                        z12 = true;
                        user = null;
                    } else {
                        z12 = true;
                        user = profileActivity.getMessagesController().V1(Long.valueOf(peerSettings.bot_owner_id));
                    }
                    if (profileActivity.l4 >= 0 || botVerification != null || valueOf != null || V16 != null || user != null) {
                        mhbVar.setFixedSize(0);
                        TLRPC.User V17 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
                        boolean z18 = (V17 != null && V17.bot && V17.bot_can_edit) ? z12 : false;
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (profileActivity.l4 >= 0) {
                            spannableStringBuilder4.append(gl.P2(k96.L0(z18 ? 2131746512 : 2131746514), new k08((byte) 4, (Object) this, z18)));
                            if (botVerification != null || valueOf != null) {
                                spannableStringBuilder4.append("\n\n\n");
                            }
                        }
                        if (botVerification != null) {
                            spannableStringBuilder4.append("x");
                            spannableStringBuilder4.setSpan(new gm(botVerification.icon, mhbVar.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            SpannableString spannableString2 = new SpannableString(k27.h0(botVerification.description, false));
                            try {
                                gl.c(spannableString2, z12 ? 1 : 0, false, false);
                                for (URLSpan uRLSpan : (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class)) {
                                    int spanStart = spannableString2.getSpanStart(uRLSpan);
                                    int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                    String url = uRLSpan.getURL();
                                    spannableString2.removeSpan(uRLSpan);
                                    spannableString2.setSpan(new bo8(this, url, url), spanStart, spanEnd, 33);
                                }
                            } catch (Exception e2) {
                                fa4.f(e2);
                            }
                            spannableStringBuilder4.append((CharSequence) spannableString2);
                        } else if (valueOf != null && (V1 = profileActivity.getMessagesController().V1(valueOf)) != null) {
                            int length = spannableStringBuilder4.length();
                            spannableStringBuilder4.append("</>");
                            spannableStringBuilder4.setSpan(new cm2(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            spannableStringBuilder4.append(gl.M2(k96.Z(2131746516, l7c.p(V1)), bkb.Wc, profileActivity.A0, new ll8(this, valueOf, (byte) 12), false));
                        }
                        if (V16 != null || user != null) {
                            if (spannableStringBuilder4.length() > 0) {
                                spannableStringBuilder4.append("\n\n");
                            }
                            if (V16 != null) {
                                final long j4 = V16.id;
                                spannableStringBuilder4.append(gl.M2(k96.Z(2131746519, l7c.r(V16)), bkb.Wc, profileActivity.A0, new Runnable(this) { // from class: zn8
                                    public final /* synthetic */ ko8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        long j5 = j4;
                                        ko8 ko8Var = this.b;
                                        switch (b3) {
                                            case 0:
                                                ko8Var.e.presentFragment(ProfileActivity.P2(j5));
                                                break;
                                            default:
                                                ko8Var.e.presentFragment(ProfileActivity.P2(j5));
                                                break;
                                        }
                                    }
                                }, false));
                            }
                            if (user != null) {
                                if (V16 != null) {
                                    spannableStringBuilder4.append("\n");
                                }
                                final long j5 = user.id;
                                final byte b3 = 1;
                                spannableStringBuilder4.append(gl.M2(k96.Z(2131746520, l7c.r(user)), bkb.Wc, profileActivity.A0, new Runnable(this) { // from class: zn8
                                    public final /* synthetic */ ko8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        long j52 = j5;
                                        ko8 ko8Var = this.b;
                                        switch (b32) {
                                            case 0:
                                                ko8Var.e.presentFragment(ProfileActivity.P2(j52));
                                                break;
                                            default:
                                                ko8Var.e.presentFragment(ProfileActivity.P2(j52));
                                                break;
                                        }
                                    }
                                }, false));
                            }
                        }
                        mhbVar.setLinkTextRippleColor(Integer.valueOf(bkb.p1(0.2f, profileActivity.getThemedColor(bkb.A6))));
                        mhbVar.setText(spannableStringBuilder4);
                        break;
                    } else {
                        mhbVar.setFixedSize(14);
                        mhbVar.setText(null);
                        break;
                    }
                } else if (i == profileActivity.U3) {
                    TLRPC.User V18 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
                    if (V18 == null || !V18.bot || !V18.bot_can_edit) {
                        mhbVar.setFixedSize(0);
                        String r = l7c.r(V18);
                        TLRPC.UserFull userFull9 = profileActivity.w2;
                        mhbVar.setText(k96.Z(2131746522, r, bc.I0((userFull9 == null || (starrefprogram = userFull9.starref_program) == null) ? 0 : starrefprogram.commission_permille)));
                        break;
                    } else {
                        mhbVar.setFixedSize(0);
                        String r2 = l7c.r(V18);
                        TLRPC.UserFull userFull10 = profileActivity.w2;
                        mhbVar.setText(k96.Z(2131746521, r2, bc.I0((userFull10 == null || (starrefprogram2 = userFull10.starref_program) == null) ? 0 : starrefprogram2.commission_permille)));
                        break;
                    }
                }
                break;
            case 27:
                yb ybVar = (yb) view;
                ybVar.a(profileActivity.getThemedColor(bkb.kk), R.drawable.filled_affiliate, k96.L0(2131746523), null);
                TLRPC.UserFull userFull11 = profileActivity.w2;
                if (userFull11 != null && (starrefprogram3 = userFull11.starref_program) != null) {
                    str12 = bc.I0(starrefprogram3.commission_permille);
                }
                ybVar.setPercent(str12);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(gl.L(16.0f), gl.L(10.0f), gl.L(16.0f), gl.L(10.0f));
                if (i == profileActivity.m4) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    cm2 cm2Var = new cm2(R.drawable.round_warn);
                    cm2Var.d(gl.L(1.0f));
                    cm2Var.y = bkb.v0(bkb.mk, profileActivity.A0);
                    profileActivity.X6 = cm2Var;
                    spannableStringBuilder5.setSpan(cm2Var, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append((CharSequence) k96.Z(2131746428, l7c.l(profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                hn2 hn2Var = (hn2) view;
                if (profileActivity.F2 != null) {
                    i19 = ((d) profileActivity).currentAccount;
                    hn2Var.a(i19, profileActivity.getMessagesController().K0(Long.valueOf(profileActivity.F2.linked_community_id)));
                    break;
                } else if (profileActivity.e1 != 0 && (V12 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1))) != null) {
                    i18 = ((d) profileActivity).currentAccount;
                    hn2Var.a(i18, profileActivity.getMessagesController().K0(Long.valueOf(V12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View ld5Var;
        View view;
        View go8Var;
        View view2;
        byte b = 0;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i) {
            case 1:
                ld5Var = new ld5(this.c, bkb.K6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case kk7.S /* 30 */:
                do8 do8Var = new do8(18, profileActivity.A0, this.c, i == 30, i == 19);
                do8Var.setContentDescriptionValueFirst(true);
                view = do8Var;
                ld5Var = view;
                break;
            case 3:
                eo8 eo8Var = new eo8(this, context, profileActivity, profileActivity.A0);
                profileActivity.j6 = eo8Var;
                view2 = eo8Var;
                ld5Var = view2;
                break;
            case 4:
                view2 = new n82(this, context, profileActivity.A0);
                ld5Var = view2;
                break;
            case 5:
                View qo3Var = new qo3(context, profileActivity.A0);
                qo3Var.setPadding(gl.L(20.0f), gl.L(4.0f), 0, 0);
                ld5Var = qo3Var;
                break;
            case 6:
                ld5Var = new fo8(context, 18, 70, false, profileActivity.A0);
                break;
            case 7:
                ld5Var = new b9a(context, (de9) null);
                break;
            case 8:
                view = new v6c(profileActivity.z4 == -1 ? 9 : 6, 0, profileActivity.A0, this.c, true, false);
                ld5Var = view;
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                mhb mhbVar = new mhb(10, profileActivity.A0, context);
                mhbVar.getTextView().setGravity(1);
                zkb.X(mhbVar.getTextView(), bkb.z6, profileActivity.A0);
                mhbVar.getTextView().setMovementMethod(null);
                mhbVar.setText(gl.C0());
                mhbVar.getTextView().setPadding(0, gl.L(14.0f), 0, gl.L(14.0f));
                ld5Var = mhbVar;
                break;
            case 11:
            case 31:
                go8Var = new go8(context, gl.L(i == 31 ? 12.0f : 6.0f));
                go8Var.setTag(-33024);
                ld5Var = go8Var;
                break;
            case 12:
                go8Var = new ho8(this, context);
                go8Var.setBackground(new ColorDrawable(0));
                go8Var.setTag(-33024);
                ld5Var = go8Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view3 = profileActivity.O;
                view3.setTag(-33024);
                ld5Var = view3;
                break;
            case 15:
                view2 = new jo8(this, context, profileActivity.A0);
                ld5Var = view2;
                break;
            case 17:
                ld5Var = new mhb(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View qr8Var = new qr8(i == 18 ? 0 : 1, profileActivity.A0, context);
                zkb.h(bkb.c6, profileActivity.A0, qr8Var);
                ld5Var = qr8Var;
                break;
            case 20:
                ld5Var = new ahb(18, profileActivity.A0, context, false);
                break;
            case 21:
                View gr8Var = new gr8(context, profileActivity.A0);
                zkb.h(bkb.c6, profileActivity.A0, gr8Var);
                ld5Var = gr8Var;
                break;
            case 22:
                View io8Var = new io8(context, profileActivity.A0);
                zkb.h(bkb.c6, profileActivity.A0, io8Var);
                ld5Var = io8Var;
                break;
            case 23:
                ld5Var = new ao8(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                u41 u41Var = new u41(profileActivity.A0, context, true);
                u41Var.f();
                u41Var.i(k96.M0(2131746515, null), false, true);
                u41Var.setOnClickListener(new yn8(this, b));
                frameLayout.addView(u41Var, nme.d(-1, 48.0f, kk7.D1, 18.0f, 14.0f, 18.0f, 14.0f));
                zkb.h(bkb.c6, profileActivity.A0, frameLayout);
                view2 = frameLayout;
                ld5Var = view2;
                break;
            case 26:
                ld5Var = new mhb(context, profileActivity.A0);
                break;
            case 27:
                ld5Var = new yb(context, profileActivity.A0);
                break;
            case 28:
                View d62Var = new d62(context, (byte) 21);
                d62Var.setTag(-33024);
                ld5Var = d62Var;
                break;
            case 32:
                ld5Var = new vo8(profileActivity, context);
                break;
            case 33:
                ld5Var = new hn2(context, profileActivity.A0);
                break;
        }
        if (i != 13) {
            ld5Var.setLayoutParams(new e49(-1, -2));
        }
        return new y29(ld5Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof ghb) {
            ((ghb) view).a.setLoading(profileActivity.o5);
            ((ghb) view).b.setLoading(profileActivity.o5);
        }
    }

    @Override // w39
    public final void z(s49 s49Var) {
        View view = s49Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
