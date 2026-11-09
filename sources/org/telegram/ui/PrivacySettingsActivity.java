package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final boolean[] Z;
    public qt0 a;
    public SessionsActivity a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.qj0 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.u1 c;
    public SpannableString c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int r;
    public int s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int w;
    private int webSessionsRow;
    public int x;
    public int y;

    public PrivacySettingsActivity() {
        super(null);
        this.P = new ArrayList();
        this.Z = new boolean[2];
    }

    public static String C0(org.telegram.messenger.c cVar, int i7) {
        String str;
        int i10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.g5.r(cVar.a).v(i7);
        int i11 = cVar.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i11).X;
        if (v == null || v.size() == 0) {
            return i7 == 3 ? org.telegram.messenger.id.M0(2131747751, null) : org.telegram.messenger.id.M0(2131749016, null);
        }
        char c10 = 65535;
        int i12 = 0;
        int i13 = 0;
        boolean z9 = false;
        Boolean bool = null;
        for (int i14 = 0; i14 < v.size(); i14++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i14);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i15 = 0; i15 < size; i15++) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(tL_privacyValueAllowChatParticipants.chats.get(i15));
                    if (M0 != null) {
                        i12 += M0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(tL_privacyValueDisallowChatParticipants.chats.get(i16));
                    if (M02 != null) {
                        i13 += M02.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i12 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i13 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z9 = true;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                bool = Boolean.TRUE;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                bool = Boolean.FALSE;
            } else if (c10 == 65535) {
                c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
            }
        }
        if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return org.telegram.messenger.id.M0(2131746760, null);
        }
        if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return org.telegram.messenger.id.M0(2131746761, null);
        }
        if (c10 == 0) {
            str = null;
            i10 = 3;
        } else {
            if (c10 != 65535 || i13 <= 0) {
                if (c10 != 2 && (c10 != 65535 || i13 <= 0 || i12 <= 0)) {
                    if (c10 != 1 && i12 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : org.telegram.messenger.id.M0(2131746759, null);
                    }
                    if (i7 == 3) {
                        return i12 == 0 ? org.telegram.messenger.id.M0(2131747751, null) : org.telegram.messenger.id.a0(null, null, 2131747750, Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        return z9 ? org.telegram.messenger.id.M0(2131749014, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.id.M0(2131749016, null) : org.telegram.messenger.id.M0(2131746759, null);
                    }
                    return org.telegram.messenger.id.a0(null, null, z9 ? 2131749013 : 2131749015, Integer.valueOf(i12));
                }
                if (i7 == 3) {
                    return (i12 == 0 && i13 == 0) ? org.telegram.messenger.id.M0(2131747758, "P2PContacts") : (i12 == 0 || i13 == 0) ? i13 != 0 ? org.telegram.messenger.id.a0(null, null, 2131747757, Integer.valueOf(i13)) : org.telegram.messenger.id.a0(null, null, 2131747755, Integer.valueOf(i12)) : org.telegram.messenger.id.a0(null, null, 2131747756, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i12 == 0 && i13 == 0) {
                    return z9 ? org.telegram.messenger.id.M0(2131749025, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.id.M0(2131749029, null) : org.telegram.messenger.id.M0(2131746845, null);
                }
                if (i12 != 0 && i13 != 0) {
                    return org.telegram.messenger.id.a0(null, null, (bool == null || !bool.booleanValue()) ? z9 ? 2131749023 : 2131749027 : 2131746843, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i13 != 0) {
                    return org.telegram.messenger.id.a0(null, null, (bool == null || !bool.booleanValue()) ? z9 ? 2131749024 : 2131749028 : 2131746844, Integer.valueOf(i13));
                }
                return org.telegram.messenger.id.a0(null, null, (bool == null || !bool.booleanValue()) ? z9 ? 2131749022 : 2131749026 : 2131746842, Integer.valueOf(i12));
            }
            i10 = 3;
            str = null;
        }
        if (i7 == i10) {
            return i13 == 0 ? org.telegram.messenger.id.M0(2131747753, str) : org.telegram.messenger.id.a0(str, str, 2131747752, Integer.valueOf(i13));
        }
        int i17 = 2131749018;
        int i18 = 2131749019;
        if (i7 != 12) {
            return i13 == 0 ? org.telegram.messenger.id.M0(2131749019, null) : org.telegram.messenger.id.a0(null, null, 2131749018, Integer.valueOf(i13));
        }
        if (i13 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i18 = 2131746763;
            }
            return org.telegram.messenger.id.M0(i18, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i17 = 2131746762;
        }
        return org.telegram.messenger.id.a0(null, null, i17, Integer.valueOf(i13));
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.a != null) {
            int o02 = privacySettingsActivity.b0.o0();
            if (privacySettingsActivity.webSessionsRow >= 0 || o02 <= 0) {
                return;
            }
            privacySettingsActivity.F0(true);
        }
    }

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i7) {
        String str;
        if (view.isEnabled()) {
            if (i7 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().p0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new ut0());
                return;
            }
            if (i7 == privacySettingsActivity.s) {
                privacySettingsActivity.a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.a0);
                return;
            }
            if (i7 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.b0);
                return;
            }
            int i10 = 4;
            float f10 = 4.0f;
            int i11 = 0;
            if (i7 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int i12 = privacySettingsActivity.getContactsController().H;
                if (i12 <= 31) {
                    r7 = 0;
                } else if (i12 <= 93) {
                    r7 = 1;
                } else if (i12 <= 182) {
                    r7 = 2;
                } else if (i12 == 548) {
                    r7 = 4;
                } else if (i12 != 730) {
                    r7 = 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131751594, "DeleteAccountTitle");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                String[] strArr = {org.telegram.messenger.id.G(1, "Months", new Object[0]), org.telegram.messenger.id.G(3, "Months", new Object[0]), org.telegram.messenger.id.G(6, "Months", new Object[0]), org.telegram.messenger.id.G(12, "Months", new Object[0]), org.telegram.messenger.id.G(18, "Months", new Object[0]), org.telegram.messenger.id.G(24, "Months", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i13 = 0;
                while (i13 < 6) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(privacySettingsActivity.getParentActivity(), null);
                    float f11 = f10;
                    j6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                    j6Var.setTag(Integer.valueOf(i13));
                    j6Var.a(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.g7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E5, false));
                    j6Var.b(strArr[i13], r7 == i13);
                    linearLayout.addView(j6Var);
                    j6Var.setOnClickListener(new hk0(i10, privacySettingsActivity, alertDialog$Builder));
                    i13++;
                    f10 = f11;
                }
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                privacySettingsActivity.showDialog(u1Var);
                return;
            }
            if (i7 == privacySettingsActivity.lastSeenRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i7 == privacySettingsActivity.phoneNumberRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i7 == privacySettingsActivity.n) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i7 == privacySettingsActivity.callsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i7 == privacySettingsActivity.profilePhotoRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            int i14 = 9;
            if (i7 == privacySettingsActivity.bioRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i7 == privacySettingsActivity.musicRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            if (i7 == privacySettingsActivity.birthdayRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i7 == privacySettingsActivity.giftsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i7 == privacySettingsActivity.forwardsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            if (i7 == privacySettingsActivity.voicesRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i7 == privacySettingsActivity.noncontactsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                return;
            }
            if (i7 == privacySettingsActivity.emailLoginRow) {
                TL_account.Password password = privacySettingsActivity.d;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0();
                    vy0Var.a |= 256;
                    vy0Var.b = indexOf;
                    int i15 = lastIndexOf + 1;
                    vy0Var.c = i15;
                    valueOf.setSpan(new org.telegram.ui.Components.wy0(vy0Var, 0), indexOf, i15, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = valueOf;
                u1Var2.T = org.telegram.messenger.id.M0(2131751201, null);
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131752548, null), new ot0(privacySettingsActivity, i10));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder2.p();
                return;
            }
            if (i7 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.n0(password2, false)) {
                    org.telegram.ui.Components.v4.u0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new bb1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.I = privacySettingsActivity.d;
                twoStepVerificationActivity.J = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i7 == privacySettingsActivity.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !org.telegram.messenger.r2.i) {
                    return;
                }
                ArrayList arrayList = privacySettingsActivity.e;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.f0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                    return;
                } else {
                    privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                    return;
                }
            }
            if (i7 == privacySettingsActivity.passcodeRow) {
                privacySettingsActivity.presentFragment(PasscodeActivity.p0());
                return;
            }
            if (i7 == privacySettingsActivity.secretWebpageRow) {
                if (privacySettingsActivity.getMessagesController().G2 == 1) {
                    privacySettingsActivity.getMessagesController().G2 = 0;
                } else {
                    privacySettingsActivity.getMessagesController().G2 = 1;
                }
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().G2).commit();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(privacySettingsActivity.getMessagesController().G2 == 1);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = org.telegram.messenger.id.M0(2131744294, "SyncContactsDeleteTitle");
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744295, "SyncContactsDeleteText"));
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new ot0(privacySettingsActivity, r7));
                privacySettingsActivity.showDialog(u1Var3);
                TextView textView = (TextView) u1Var3.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (!privacySettingsActivity.V) {
                    privacySettingsActivity.V = true;
                    r8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M03 = org.telegram.messenger.id.M0(2131744409, "SuggestContactsTitle");
                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                u1Var4.R = M03;
                u1Var4.T = org.telegram.messenger.id.M0(2131744411, "SuggestContactsAlert");
                alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131748313, "MuteDisable"), new nk0(i14, privacySettingsActivity, r8Var));
                alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(u1Var4);
                TextView textView2 = (TextView) u1Var4.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.newChatsRow) {
                boolean z9 = !privacySettingsActivity.W;
                privacySettingsActivity.W = z9;
                ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                return;
            }
            if (i7 == privacySettingsActivity.contactsSyncRow) {
                boolean z10 = !privacySettingsActivity.T;
                privacySettingsActivity.T = z10;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.v4.p0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new nt0(privacySettingsActivity, i11), false, null);
                return;
            }
            if (i7 != privacySettingsActivity.paymentsClearRow) {
                if (i7 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new dk0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i7 == privacySettingsActivity.H) {
                        privacySettingsActivity.presentFragment(new hi.q());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            String M04 = org.telegram.messenger.id.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.a;
            u1Var5.R = M04;
            u1Var5.T = org.telegram.messenger.id.M0(2131746795, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.o(linearLayout2);
            int i16 = 0;
            while (i16 < 2) {
                String M05 = i16 == 0 ? org.telegram.messenger.id.M0(2131746846, "PrivacyClearShipping") : org.telegram.messenger.id.M0(2131746847, "PrivacyClearPayment");
                privacySettingsActivity.Z[i16] = true;
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                c2Var.setTag(Integer.valueOf(i16));
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
                c2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                linearLayout2.addView(c2Var, c8.ha.o(-1, 50));
                c2Var.e(M05, null, true, false, false);
                c2Var.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.j5, false));
                c2Var.setOnClickListener(new i40(privacySettingsActivity, 27));
                i16++;
            }
            alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131752099, "ClearButton"), new ot0(privacySettingsActivity, i11));
            alertDialog$Builder5.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
            privacySettingsActivity.showDialog(u1Var5);
            privacySettingsActivity.showDialog(u1Var5);
            TextView textView3 = (TextView) u1Var5.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.q7, null);
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.c0 == null) {
            privacySettingsActivity.c0 = new SpannableString("★");
            org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (ug.x0) ia.e.d().g);
            h5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.c0.setSpan(new ImageSpan(h5Var, 2), 0, privacySettingsActivity.c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.c0);
    }

    public final void D0() {
        TwoStepVerificationActivity.r0(this.d);
        if (!getUserConfig().X && this.d.has_secure_values) {
            getUserConfig().X = true;
            getUserConfig().v(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i7 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z9 = str != null && i7 == -1;
            boolean z10 = str == null && i7 != -1;
            if (z9 || z10) {
                F0(false);
                qt0 qt0Var = this.a;
                if (qt0Var != null) {
                    if (z9) {
                        qt0Var.i(this.emailLoginRow);
                    } else {
                        qt0Var.s(i7);
                    }
                }
            }
        }
        qt0 qt0Var2 = this.a;
        if (qt0Var2 != null) {
            qt0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 19), 10);
    }

    public final void F0(boolean z9) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.O = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().x7.A.b).c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.i) {
            int i7 = this.O;
            this.O = i7 + 1;
            this.passkeysRow = i7;
        }
        TL_account.Password password = this.d;
        if (password == null ? !org.telegram.messenger.iz.m1 : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i10 = this.O;
            this.O = i10 + 1;
            this.emailLoginRow = i10;
        }
        int i11 = this.O;
        this.O = i11 + 1;
        this.blockedRow = i11;
        if (password != null) {
            boolean z10 = password.login_email_pattern != null;
            if (org.telegram.messenger.iz.m1 != z10) {
                org.telegram.messenger.iz.m1 = z10;
                org.telegram.messenger.iz.y();
            }
        }
        int i12 = this.O;
        this.s = i12;
        this.w = i12 + 1;
        this.f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.O = i12 + 8;
        this.callsRow = i12 + 7;
        this.r = -1;
        if (!getMessagesController().D3() || getUserConfig().q()) {
            int i13 = this.O;
            this.voicesRow = i13;
            this.O = i13 + 2;
            this.noncontactsRow = i13 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i14 = this.O;
        this.birthdayRow = i14;
        this.giftsRow = i14 + 1;
        this.bioRow = i14 + 2;
        this.musicRow = i14 + 3;
        this.n = i14 + 4;
        this.O = i14 + 6;
        this.h = i14 + 5;
        if (getMessagesController().Y3 || getUserConfig().q()) {
            int i15 = this.O;
            this.x = i15;
            this.newChatsRow = i15 + 1;
            this.O = i15 + 3;
            this.y = i15 + 2;
        } else {
            this.x = -1;
            this.newChatsRow = -1;
            this.y = -1;
        }
        int i16 = this.O;
        this.D = i16;
        this.deleteAccountRow = i16 + 1;
        this.E = i16 + 2;
        this.O = i16 + 4;
        this.F = i16 + 3;
        if (getUserConfig().X) {
            int i17 = this.O;
            this.O = i17 + 1;
            this.G = i17;
        } else {
            this.G = -1;
        }
        int i18 = this.O;
        this.O = i18 + 1;
        this.paymentsClearRow = i18;
        if (this.P.isEmpty()) {
            this.H = -1;
        } else {
            int i19 = this.O;
            this.O = i19 + 1;
            this.H = i19;
        }
        SessionsActivity sessionsActivity = this.b0;
        if (sessionsActivity == null || sessionsActivity.o0() <= 0) {
            this.webSessionsRow = -1;
            this.I = -1;
            int i20 = this.O;
            this.O = i20 + 1;
            this.J = i20;
        } else {
            int i21 = this.O;
            this.webSessionsRow = i21;
            this.O = i21 + 2;
            this.I = i21 + 1;
            this.J = -1;
        }
        int i22 = this.O;
        this.K = i22;
        this.contactsDeleteRow = i22 + 1;
        this.contactsSyncRow = i22 + 2;
        this.contactsSuggestRow = i22 + 3;
        this.L = i22 + 4;
        this.M = i22 + 5;
        this.secretMapRow = i22 + 6;
        this.secretWebpageRow = i22 + 7;
        this.O = i22 + 9;
        this.N = i22 + 8;
        qt0 qt0Var = this.a;
        if (qt0Var == null || !z9) {
            return;
        }
        qt0Var.f();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746771, null));
        Object[] objArr = 0;
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 0));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new qt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.b = qj0Var;
        qj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new jg.b0(i7, objArr == true ? 1 : 0, 16));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        int i10 = 21;
        this.b.setOnItemClickListener(new di.q4(i10, this, context));
        hi.p.d(getParentActivity(), this.currentAccount, new r3(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qt0 qt0Var;
        if (i7 == org.telegram.messenger.qs.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            if (globalPrivacySettings != null) {
                this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Y = (globalPrivacySettings.flags & 32) != 0;
            }
            qt0 qt0Var2 = this.a;
            if (qt0Var2 != null) {
                qt0Var2.f();
            }
        } else if (i7 == org.telegram.messenger.qs.g0) {
            this.a.g(this.blockedRow);
        } else if (i7 == org.telegram.messenger.qs.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                qt0 qt0Var3 = this.a;
                if (qt0Var3 != null) {
                    qt0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i7 != org.telegram.messenger.qs.s5 || (qt0Var = this.a) == null) {
            return;
        }
        qt0Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z9 = getUserConfig().U;
        this.T = z9;
        this.S = z9;
        boolean z10 = getUserConfig().V;
        this.V = z10;
        this.U = z10;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        if (globalPrivacySettings != null) {
            this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.Y = (globalPrivacySettings.flags & 32) != 0;
        }
        F0(true);
        E0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new a5(this, 18));
        getNotificationCenter().c(this, org.telegram.messenger.qs.k0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.g0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.q0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.a0 = sessionsActivity;
        sessionsActivity.X = new ot0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.b0 = sessionsActivity2;
        sessionsActivity2.X = new ot0(this, 3);
        sessionsActivity2.p0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z9;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.k0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.g0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.q0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.s5);
        boolean z10 = true;
        if (this.S != this.T) {
            org.telegram.messenger.p10 userConfig = getUserConfig();
            boolean z11 = this.T;
            userConfig.U = z11;
            if (z11 && org.telegram.messenger.g5.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131744297, "SyncContactsAdded"), 0).show();
                }
            }
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = this.V;
        int i7 = 9;
        if (z12 != this.U) {
            if (!z12) {
                getMediaDataController().F();
            }
            getUserConfig().V = this.V;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.V;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new di.v5(i7));
            z9 = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        if (globalPrivacySettings != null) {
            boolean z13 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z14 = this.W;
            if (z13 != z14) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z14;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.W;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new di.v5(i7));
                if (z10) {
                    return;
                }
                getUserConfig().v(false);
                return;
            }
        }
        z10 = z9;
        if (z10) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        qt0 qt0Var = this.a;
        if (qt0Var != null) {
            qt0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
