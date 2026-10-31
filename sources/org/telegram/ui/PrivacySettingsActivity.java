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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public wu0 a;
    public SessionsActivity a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.tk0 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.x1 c;
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

    public static String B0(org.telegram.messenger.c cVar, int i10) {
        String str;
        int i11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.i5.r(cVar.a).v(i10);
        int i12 = cVar.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(i12).X;
        if (v == null || v.size() == 0) {
            return i10 == 3 ? org.telegram.messenger.cd.L0(2131747767, null) : org.telegram.messenger.cd.L0(2131749026, null);
        }
        char c10 = 65535;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        Boolean bool = null;
        for (int i15 = 0; i15 < v.size(); i15++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i15);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i16 = 0; i16 < size; i16++) {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i12).L0(tL_privacyValueAllowChatParticipants.chats.get(i16));
                    if (L0 != null) {
                        i13 += L0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i12).L0(tL_privacyValueDisallowChatParticipants.chats.get(i17));
                    if (L02 != null) {
                        i14 += L02.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i13 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i14 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z10 = true;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                bool = Boolean.TRUE;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                bool = Boolean.FALSE;
            } else if (c10 == 65535) {
                c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
            }
        }
        if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return org.telegram.messenger.cd.L0(2131746775, null);
        }
        if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return org.telegram.messenger.cd.L0(2131746776, null);
        }
        if (c10 == 0) {
            str = null;
            i11 = 3;
        } else {
            if (c10 != 65535 || i14 <= 0) {
                if (c10 != 2 && (c10 != 65535 || i14 <= 0 || i13 <= 0)) {
                    if (c10 != 1 && i13 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : org.telegram.messenger.cd.L0(2131746774, null);
                    }
                    if (i10 == 3) {
                        return i13 == 0 ? org.telegram.messenger.cd.L0(2131747767, null) : org.telegram.messenger.cd.a0(null, null, 2131747766, Integer.valueOf(i13));
                    }
                    if (i13 == 0) {
                        return z10 ? org.telegram.messenger.cd.L0(2131749024, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.cd.L0(2131749026, null) : org.telegram.messenger.cd.L0(2131746774, null);
                    }
                    return org.telegram.messenger.cd.a0(null, null, z10 ? 2131749023 : 2131749025, Integer.valueOf(i13));
                }
                if (i10 == 3) {
                    return (i13 == 0 && i14 == 0) ? org.telegram.messenger.cd.L0(2131747774, "P2PContacts") : (i13 == 0 || i14 == 0) ? i14 != 0 ? org.telegram.messenger.cd.a0(null, null, 2131747773, Integer.valueOf(i14)) : org.telegram.messenger.cd.a0(null, null, 2131747771, Integer.valueOf(i13)) : org.telegram.messenger.cd.a0(null, null, 2131747772, Integer.valueOf(i14), Integer.valueOf(i13));
                }
                if (i13 == 0 && i14 == 0) {
                    return z10 ? org.telegram.messenger.cd.L0(2131749035, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.cd.L0(2131749039, null) : org.telegram.messenger.cd.L0(2131746860, null);
                }
                if (i13 != 0 && i14 != 0) {
                    return org.telegram.messenger.cd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749033 : 2131749037 : 2131746858, Integer.valueOf(i14), Integer.valueOf(i13));
                }
                if (i14 != 0) {
                    return org.telegram.messenger.cd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749034 : 2131749038 : 2131746859, Integer.valueOf(i14));
                }
                return org.telegram.messenger.cd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749032 : 2131749036 : 2131746857, Integer.valueOf(i13));
            }
            i11 = 3;
            str = null;
        }
        if (i10 == i11) {
            return i14 == 0 ? org.telegram.messenger.cd.L0(2131747769, str) : org.telegram.messenger.cd.a0(str, str, 2131747768, Integer.valueOf(i14));
        }
        int i18 = 2131749028;
        int i19 = 2131749029;
        if (i10 != 12) {
            return i14 == 0 ? org.telegram.messenger.cd.L0(2131749029, null) : org.telegram.messenger.cd.a0(null, null, 2131749028, Integer.valueOf(i14));
        }
        if (i14 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i19 = 2131746778;
            }
            return org.telegram.messenger.cd.L0(i19, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i18 = 2131746777;
        }
        return org.telegram.messenger.cd.a0(null, null, i18, Integer.valueOf(i14));
    }

    public static void Y(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.a != null) {
            int n02 = privacySettingsActivity.b0.n0();
            if (privacySettingsActivity.webSessionsRow >= 0 || n02 <= 0) {
                return;
            }
            privacySettingsActivity.E0(true);
        }
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String str;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().p0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new av0());
                return;
            }
            if (i10 == privacySettingsActivity.s) {
                privacySettingsActivity.a0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.a0);
                return;
            }
            if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.b0);
                return;
            }
            int i11 = 28;
            int i12 = 4;
            float f7 = 4.0f;
            int i13 = 0;
            if (i10 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int i14 = privacySettingsActivity.getContactsController().H;
                if (i14 <= 31) {
                    i12 = 0;
                } else if (i14 <= 93) {
                    i12 = 1;
                } else if (i14 <= 182) {
                    i12 = 2;
                } else if (i14 != 548) {
                    i12 = i14 == 730 ? 5 : 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131751595, "DeleteAccountTitle");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                String[] strArr = {org.telegram.messenger.cd.G(1, "Months", new Object[0]), org.telegram.messenger.cd.G(3, "Months", new Object[0]), org.telegram.messenger.cd.G(6, "Months", new Object[0]), org.telegram.messenger.cd.G(12, "Months", new Object[0]), org.telegram.messenger.cd.G(18, "Months", new Object[0]), org.telegram.messenger.cd.G(24, "Months", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i15 = 0;
                while (i15 < 6) {
                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(privacySettingsActivity.getParentActivity(), null);
                    float f10 = f7;
                    n6Var.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f10), 0);
                    n6Var.setTag(Integer.valueOf(i15));
                    n6Var.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                    n6Var.b(strArr[i15], i12 == i15);
                    linearLayout.addView(n6Var);
                    n6Var.setOnClickListener(new wu(i11, privacySettingsActivity, alertDialog$Builder));
                    i15++;
                    f7 = f10;
                }
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                privacySettingsActivity.showDialog(x1Var);
                return;
            }
            if (i10 == privacySettingsActivity.lastSeenRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i10 == privacySettingsActivity.phoneNumberRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i10 == privacySettingsActivity.n) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i10 == privacySettingsActivity.callsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i10 == privacySettingsActivity.profilePhotoRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            if (i10 == privacySettingsActivity.bioRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i10 == privacySettingsActivity.musicRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            if (i10 == privacySettingsActivity.birthdayRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i10 == privacySettingsActivity.giftsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i10 == privacySettingsActivity.forwardsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            int i16 = 8;
            if (i10 == privacySettingsActivity.voicesRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i10 == privacySettingsActivity.noncontactsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                return;
            }
            if (i10 == privacySettingsActivity.emailLoginRow) {
                TL_account.Password password = privacySettingsActivity.d;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                    yz0Var.a |= 256;
                    yz0Var.b = indexOf;
                    int i17 = lastIndexOf + 1;
                    yz0Var.c = i17;
                    valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i17, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = valueOf;
                x1Var2.T = org.telegram.messenger.cd.L0(2131751202, null);
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131752548, null), new vu0(privacySettingsActivity, i12));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder2.p();
                return;
            }
            if (i10 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.m0(password2, false)) {
                    org.telegram.ui.Components.s4.w0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new tc1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.I = privacySettingsActivity.d;
                twoStepVerificationActivity.J = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i10 == privacySettingsActivity.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !org.telegram.messenger.v2.i) {
                    return;
                }
                ArrayList arrayList = privacySettingsActivity.e;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.e0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                    return;
                } else {
                    privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                    return;
                }
            }
            if (i10 == privacySettingsActivity.passcodeRow) {
                privacySettingsActivity.presentFragment(PasscodeActivity.o0());
                return;
            }
            if (i10 == privacySettingsActivity.secretWebpageRow) {
                if (privacySettingsActivity.getMessagesController().G2 == 1) {
                    privacySettingsActivity.getMessagesController().G2 = 0;
                } else {
                    privacySettingsActivity.getMessagesController().G2 = 1;
                }
                org.telegram.messenger.vp.d1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().G2).commit();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(privacySettingsActivity.getMessagesController().G2 == 1);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String L02 = org.telegram.messenger.cd.L0(2131744320, "SyncContactsDeleteTitle");
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744321, "SyncContactsDeleteText"));
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new vu0(privacySettingsActivity, r8));
                privacySettingsActivity.showDialog(x1Var3);
                TextView textView = (TextView) x1Var3.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                if (!privacySettingsActivity.V) {
                    privacySettingsActivity.V = true;
                    t8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String L03 = org.telegram.messenger.cd.L0(2131744435, "SuggestContactsTitle");
                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
                x1Var4.R = L03;
                x1Var4.T = org.telegram.messenger.cd.L0(2131744437, "SuggestContactsAlert");
                alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131748328, "MuteDisable"), new ep0(i16, privacySettingsActivity, t8Var));
                alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(x1Var4);
                TextView textView2 = (TextView) x1Var4.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.newChatsRow) {
                boolean z10 = !privacySettingsActivity.W;
                privacySettingsActivity.W = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                return;
            }
            if (i10 == privacySettingsActivity.contactsSyncRow) {
                boolean z11 = !privacySettingsActivity.T;
                privacySettingsActivity.T = z11;
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.s4.r0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new uu0(privacySettingsActivity, i13), false, null);
                return;
            }
            if (i10 != privacySettingsActivity.paymentsClearRow) {
                if (i10 == privacySettingsActivity.G) {
                    privacySettingsActivity.presentFragment(new ll0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i10 == privacySettingsActivity.H) {
                        privacySettingsActivity.presentFragment(new xh.o());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            String L04 = org.telegram.messenger.cd.L0(2131746809, "PrivacyPaymentsClearAlertTitle");
            org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder5.a;
            x1Var5.R = L04;
            x1Var5.T = org.telegram.messenger.cd.L0(2131746810, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.o(linearLayout2);
            int i18 = 0;
            while (i18 < 2) {
                String L05 = i18 == 0 ? org.telegram.messenger.cd.L0(2131746861, "PrivacyClearShipping") : org.telegram.messenger.cd.L0(2131746862, "PrivacyClearPayment");
                privacySettingsActivity.Z[i18] = true;
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                c2Var.setTag(Integer.valueOf(i18));
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                c2Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                linearLayout2.addView(c2Var, w7.b6.o(-1, 50));
                c2Var.e(L05, null, true, false, false);
                c2Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false));
                c2Var.setOnClickListener(new f50(privacySettingsActivity, 27));
                i18++;
            }
            alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131752099, "ClearButton"), new vu0(privacySettingsActivity, i13));
            alertDialog$Builder5.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            privacySettingsActivity.showDialog(x1Var5);
            privacySettingsActivity.showDialog(x1Var5);
            TextView textView3 = (TextView) x1Var5.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }

    public static SpannableStringBuilder y0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.c0 == null) {
            privacySettingsActivity.c0 = new SpannableString("★");
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), (kg.j1) ea.f.d().g);
            e5Var.setBounds(0, 0, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
            privacySettingsActivity.c0.setSpan(new ImageSpan(e5Var, 2), 0, privacySettingsActivity.c0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.c0);
    }

    public final void C0() {
        TwoStepVerificationActivity.q0(this.d);
        if (!getUserConfig().X && this.d.has_secure_values) {
            getUserConfig().X = true;
            getUserConfig().v(false);
            E0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i10 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z10 = str != null && i10 == -1;
            boolean z11 = str == null && i10 != -1;
            if (z10 || z11) {
                E0(false);
                wu0 wu0Var = this.a;
                if (wu0Var != null) {
                    if (z10) {
                        wu0Var.i(this.emailLoginRow);
                    } else {
                        wu0Var.s(i10);
                    }
                }
            }
        }
        wu0 wu0Var2 = this.a;
        if (wu0Var2 != null) {
            wu0Var2.g(this.passwordRow);
        }
    }

    public final void D0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new k(this, 20), 10);
    }

    public final void E0(boolean z10) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.O = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.j0) getMessagesController().y7.A.b).c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.v2.i) {
            int i10 = this.O;
            this.O = i10 + 1;
            this.passkeysRow = i10;
        }
        TL_account.Password password = this.d;
        if (password == null ? !org.telegram.messenger.tz.m1 : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i11 = this.O;
            this.O = i11 + 1;
            this.emailLoginRow = i11;
        }
        int i12 = this.O;
        this.O = i12 + 1;
        this.blockedRow = i12;
        if (password != null) {
            boolean z11 = password.login_email_pattern != null;
            if (org.telegram.messenger.tz.m1 != z11) {
                org.telegram.messenger.tz.m1 = z11;
                org.telegram.messenger.tz.y();
            }
        }
        int i13 = this.O;
        this.s = i13;
        this.w = i13 + 1;
        this.f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.O = i13 + 8;
        this.callsRow = i13 + 7;
        this.r = -1;
        if (!getMessagesController().A3() || getUserConfig().q()) {
            int i14 = this.O;
            this.voicesRow = i14;
            this.O = i14 + 2;
            this.noncontactsRow = i14 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i15 = this.O;
        this.birthdayRow = i15;
        this.giftsRow = i15 + 1;
        this.bioRow = i15 + 2;
        this.musicRow = i15 + 3;
        this.n = i15 + 4;
        this.O = i15 + 6;
        this.h = i15 + 5;
        if (getMessagesController().a4 || getUserConfig().q()) {
            int i16 = this.O;
            this.x = i16;
            this.newChatsRow = i16 + 1;
            this.O = i16 + 3;
            this.y = i16 + 2;
        } else {
            this.x = -1;
            this.newChatsRow = -1;
            this.y = -1;
        }
        int i17 = this.O;
        this.D = i17;
        this.deleteAccountRow = i17 + 1;
        this.E = i17 + 2;
        this.O = i17 + 4;
        this.F = i17 + 3;
        if (getUserConfig().X) {
            int i18 = this.O;
            this.O = i18 + 1;
            this.G = i18;
        } else {
            this.G = -1;
        }
        int i19 = this.O;
        this.O = i19 + 1;
        this.paymentsClearRow = i19;
        if (this.P.isEmpty()) {
            this.H = -1;
        } else {
            int i20 = this.O;
            this.O = i20 + 1;
            this.H = i20;
        }
        SessionsActivity sessionsActivity = this.b0;
        if (sessionsActivity == null || sessionsActivity.n0() <= 0) {
            this.webSessionsRow = -1;
            this.I = -1;
            int i21 = this.O;
            this.O = i21 + 1;
            this.J = i21;
        } else {
            int i22 = this.O;
            this.webSessionsRow = i22;
            this.O = i22 + 2;
            this.I = i22 + 1;
            this.J = -1;
        }
        int i23 = this.O;
        this.K = i23;
        this.contactsDeleteRow = i23 + 1;
        this.contactsSyncRow = i23 + 2;
        this.contactsSuggestRow = i23 + 3;
        this.L = i23 + 4;
        this.M = i23 + 5;
        this.secretMapRow = i23 + 6;
        this.secretWebpageRow = i23 + 7;
        this.O = i23 + 9;
        this.N = i23 + 8;
        wu0 wu0Var = this.a;
        if (wu0Var == null || !z10) {
            return;
        }
        wu0Var.f();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746786, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 21));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new wu0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new dh.f(i10, false, 15));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new mg.q0(20, this, context));
        xh.n.d(getParentActivity(), this.currentAccount, new s3(this, 20));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wu0 wu0Var;
        if (i10 == org.telegram.messenger.zs.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            if (globalPrivacySettings != null) {
                this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Y = (globalPrivacySettings.flags & 32) != 0;
            }
            wu0 wu0Var2 = this.a;
            if (wu0Var2 != null) {
                wu0Var2.f();
            }
        } else if (i10 == org.telegram.messenger.zs.g0) {
            this.a.g(this.blockedRow);
        } else if (i10 == org.telegram.messenger.zs.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                wu0 wu0Var3 = this.a;
                if (wu0Var3 != null) {
                    wu0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                D0();
                E0(true);
            }
        }
        if (i10 != org.telegram.messenger.zs.s5 || (wu0Var = this.a) == null) {
            return;
        }
        wu0Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.t8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z10 = getUserConfig().U;
        this.T = z10;
        this.S = z10;
        boolean z11 = getUserConfig().V;
        this.V = z11;
        this.U = z11;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        if (globalPrivacySettings != null) {
            this.W = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.X = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.Y = (globalPrivacySettings.flags & 32) != 0;
        }
        E0(true);
        D0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new a3.b(1), new z4(this, 17));
        getNotificationCenter().c(this, org.telegram.messenger.zs.k0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.g0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.q0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.a0 = sessionsActivity;
        sessionsActivity.X = new vu0(this, 2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.b0 = sessionsActivity2;
        sessionsActivity2.X = new vu0(this, 3);
        sessionsActivity2.o0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z10;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.k0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.g0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.q0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.s5);
        boolean z11 = true;
        if (this.S != this.T) {
            org.telegram.messenger.d20 userConfig = getUserConfig();
            boolean z12 = this.T;
            userConfig.U = z12;
            if (z12 && org.telegram.messenger.i5.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131744323, "SyncContactsAdded"), 0).show();
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.V;
        int i10 = 4;
        if (z13 != this.U) {
            if (!z13) {
                getMediaDataController().F();
            }
            getUserConfig().V = this.V;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.V;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new ag.c3(i10));
            z10 = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        if (globalPrivacySettings != null) {
            boolean z14 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z15 = this.W;
            if (z14 != z15) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z15;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.W;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new ag.c3(i10));
                if (z11) {
                    return;
                }
                getUserConfig().v(false);
                return;
            }
        }
        z11 = z10;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        wu0 wu0Var = this.a;
        if (wu0Var != null) {
            wu0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
