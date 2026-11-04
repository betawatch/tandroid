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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int P;
    public final ArrayList Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public et0 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.tj0 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.s1 c;
    public SessionsActivity c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    public SpannableString d0;
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
        this.Q = new ArrayList();
        this.a0 = new boolean[2];
    }

    public static String C0(org.telegram.messenger.c cVar, int i3) {
        String str;
        int i10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.g5.r(cVar.a).v(i3);
        int i11 = cVar.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i11).Y;
        if (v == null || v.size() == 0) {
            return i3 == 3 ? org.telegram.messenger.bd.M0(2131747759, null) : org.telegram.messenger.bd.M0(2131749024, null);
        }
        char c2 = 65535;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        Boolean bool = null;
        for (int i14 = 0; i14 < v.size(); i14++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i14);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i15 = 0; i15 < size; i15++) {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i11).M0(tL_privacyValueAllowChatParticipants.chats.get(i15));
                    if (M0 != null) {
                        i12 += M0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(tL_privacyValueDisallowChatParticipants.chats.get(i16));
                    if (M02 != null) {
                        i13 += M02.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i12 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i13 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z10 = true;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                bool = Boolean.TRUE;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                bool = Boolean.FALSE;
            } else if (c2 == 65535) {
                c2 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
            }
        }
        if (i3 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return org.telegram.messenger.bd.M0(2131746768, null);
        }
        if (i3 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return org.telegram.messenger.bd.M0(2131746769, null);
        }
        if (c2 == 0) {
            str = null;
            i10 = 3;
        } else {
            if (c2 != 65535 || i13 <= 0) {
                if (c2 != 2 && (c2 != 65535 || i13 <= 0 || i12 <= 0)) {
                    if (c2 != 1 && i12 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : org.telegram.messenger.bd.M0(2131746767, null);
                    }
                    if (i3 == 3) {
                        return i12 == 0 ? org.telegram.messenger.bd.M0(2131747759, null) : org.telegram.messenger.bd.a0(null, null, 2131747758, Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        return z10 ? org.telegram.messenger.bd.M0(2131749022, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.bd.M0(2131749024, null) : org.telegram.messenger.bd.M0(2131746767, null);
                    }
                    return org.telegram.messenger.bd.a0(null, null, z10 ? 2131749021 : 2131749023, Integer.valueOf(i12));
                }
                if (i3 == 3) {
                    return (i12 == 0 && i13 == 0) ? org.telegram.messenger.bd.M0(2131747766, "P2PContacts") : (i12 == 0 || i13 == 0) ? i13 != 0 ? org.telegram.messenger.bd.a0(null, null, 2131747765, Integer.valueOf(i13)) : org.telegram.messenger.bd.a0(null, null, 2131747763, Integer.valueOf(i12)) : org.telegram.messenger.bd.a0(null, null, 2131747764, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i12 == 0 && i13 == 0) {
                    return z10 ? org.telegram.messenger.bd.M0(2131749033, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.bd.M0(2131749037, null) : org.telegram.messenger.bd.M0(2131746853, null);
                }
                if (i12 != 0 && i13 != 0) {
                    return org.telegram.messenger.bd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749031 : 2131749035 : 2131746851, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i13 != 0) {
                    return org.telegram.messenger.bd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749032 : 2131749036 : 2131746852, Integer.valueOf(i13));
                }
                return org.telegram.messenger.bd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131749030 : 2131749034 : 2131746850, Integer.valueOf(i12));
            }
            i10 = 3;
            str = null;
        }
        if (i3 == i10) {
            return i13 == 0 ? org.telegram.messenger.bd.M0(2131747761, str) : org.telegram.messenger.bd.a0(str, str, 2131747760, Integer.valueOf(i13));
        }
        int i17 = 2131749026;
        int i18 = 2131749027;
        if (i3 != 12) {
            return i13 == 0 ? org.telegram.messenger.bd.M0(2131749027, null) : org.telegram.messenger.bd.a0(null, null, 2131749026, Integer.valueOf(i13));
        }
        if (i13 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i18 = 2131746771;
            }
            return org.telegram.messenger.bd.M0(i18, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i17 = 2131746770;
        }
        return org.telegram.messenger.bd.a0(null, null, i17, Integer.valueOf(i13));
    }

    public static void Z(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.a != null) {
            int o02 = privacySettingsActivity.c0.o0();
            if (privacySettingsActivity.webSessionsRow >= 0 || o02 <= 0) {
                return;
            }
            privacySettingsActivity.F0(true);
        }
    }

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i3) {
        String str;
        if (view.isEnabled()) {
            if (i3 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().q0 >= 0) {
                    privacySettingsActivity.presentFragment(new r4());
                    return;
                }
                return;
            }
            if (i3 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new it0());
                return;
            }
            if (i3 == privacySettingsActivity.s) {
                privacySettingsActivity.b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.b0);
                return;
            }
            if (i3 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.c0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.c0);
                return;
            }
            int i10 = 10;
            int i11 = 4;
            float f10 = 4.0f;
            int i12 = 0;
            if (i3 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int i13 = privacySettingsActivity.getContactsController().I;
                if (i13 <= 31) {
                    i11 = 0;
                } else if (i13 <= 93) {
                    i11 = 1;
                } else if (i13 <= 182) {
                    i11 = 2;
                } else if (i13 != 548) {
                    i11 = i13 == 730 ? 5 : 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131751595, "DeleteAccountTitle");
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                String[] strArr = {org.telegram.messenger.bd.G(1, "Months", new Object[0]), org.telegram.messenger.bd.G(3, "Months", new Object[0]), org.telegram.messenger.bd.G(6, "Months", new Object[0]), org.telegram.messenger.bd.G(12, "Months", new Object[0]), org.telegram.messenger.bd.G(18, "Months", new Object[0]), org.telegram.messenger.bd.G(24, "Months", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i14 = 0;
                while (i14 < 6) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(privacySettingsActivity.getParentActivity(), null);
                    float f11 = f10;
                    i6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                    i6Var.setTag(Integer.valueOf(i14));
                    i6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    i6Var.b(strArr[i14], i11 == i14);
                    linearLayout.addView(i6Var);
                    i6Var.setOnClickListener(new hb0(i10, privacySettingsActivity, alertDialog$Builder));
                    i14++;
                    f10 = f11;
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                privacySettingsActivity.showDialog(s1Var);
                return;
            }
            if (i3 == privacySettingsActivity.lastSeenRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i3 == privacySettingsActivity.phoneNumberRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i3 == privacySettingsActivity.n) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i3 == privacySettingsActivity.callsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i3 == privacySettingsActivity.profilePhotoRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            if (i3 == privacySettingsActivity.bioRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i3 == privacySettingsActivity.musicRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            if (i3 == privacySettingsActivity.birthdayRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i3 == privacySettingsActivity.giftsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i3 == privacySettingsActivity.forwardsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            if (i3 == privacySettingsActivity.voicesRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i3 == privacySettingsActivity.noncontactsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                return;
            }
            if (i3 == privacySettingsActivity.emailLoginRow) {
                TL_account.Password password = privacySettingsActivity.d;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                    ty0Var.a |= 256;
                    ty0Var.b = indexOf;
                    int i15 = lastIndexOf + 1;
                    ty0Var.c = i15;
                    valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i15, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = valueOf;
                s1Var2.U = org.telegram.messenger.bd.M0(2131751202, null);
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752548, null), new dt0(privacySettingsActivity, i11));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder2.p();
                return;
            }
            if (i3 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.n0(password2, false)) {
                    org.telegram.ui.Components.t4.w0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new ra1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.J = privacySettingsActivity.d;
                twoStepVerificationActivity.K = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i3 == privacySettingsActivity.passkeysRow) {
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
            if (i3 == privacySettingsActivity.passcodeRow) {
                privacySettingsActivity.presentFragment(PasscodeActivity.p0());
                return;
            }
            if (i3 == privacySettingsActivity.secretWebpageRow) {
                if (privacySettingsActivity.getMessagesController().H2 == 1) {
                    privacySettingsActivity.getMessagesController().H2 = 0;
                } else {
                    privacySettingsActivity.getMessagesController().H2 = 1;
                }
                org.telegram.messenger.hp.e1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().H2).commit();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(privacySettingsActivity.getMessagesController().H2 == 1);
                    return;
                }
                return;
            }
            if (i3 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131744304, "SyncContactsDeleteTitle");
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                s1Var3.S = M02;
                s1Var3.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744305, "SyncContactsDeleteText"));
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new dt0(privacySettingsActivity, r8));
                privacySettingsActivity.showDialog(s1Var3);
                TextView textView = (TextView) s1Var3.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            if (i3 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (!privacySettingsActivity.W) {
                    privacySettingsActivity.W = true;
                    q8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String M03 = org.telegram.messenger.bd.M0(2131744419, "SuggestContactsTitle");
                org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.a;
                s1Var4.S = M03;
                s1Var4.U = org.telegram.messenger.bd.M0(2131744421, "SuggestContactsAlert");
                alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131748321, "MuteDisable"), new rb0(17, privacySettingsActivity, q8Var));
                alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(s1Var4);
                TextView textView2 = (TextView) s1Var4.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            if (i3 == privacySettingsActivity.newChatsRow) {
                boolean z10 = !privacySettingsActivity.X;
                privacySettingsActivity.X = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
            }
            if (i3 == privacySettingsActivity.contactsSyncRow) {
                boolean z11 = !privacySettingsActivity.U;
                privacySettingsActivity.U = z11;
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                    return;
                }
                return;
            }
            if (i3 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.t4.r0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new ct0(privacySettingsActivity, i12), false, null);
                return;
            }
            if (i3 != privacySettingsActivity.paymentsClearRow) {
                if (i3 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new yj0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i3 == privacySettingsActivity.I) {
                        privacySettingsActivity.presentFragment(new ii.s());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            String M04 = org.telegram.messenger.bd.M0(2131746802, "PrivacyPaymentsClearAlertTitle");
            org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder5.a;
            s1Var5.S = M04;
            s1Var5.U = org.telegram.messenger.bd.M0(2131746803, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.o(linearLayout2);
            int i16 = 0;
            while (i16 < 2) {
                String M05 = i16 == 0 ? org.telegram.messenger.bd.M0(2131746854, "PrivacyClearShipping") : org.telegram.messenger.bd.M0(2131746855, "PrivacyClearPayment");
                privacySettingsActivity.a0[i16] = true;
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                c2Var.setTag(Integer.valueOf(i16));
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                linearLayout2.addView(c2Var, b8.mf.o(-1, 50));
                c2Var.e(M05, null, true, false, false);
                c2Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                c2Var.setOnClickListener(new b40(privacySettingsActivity, 27));
                i16++;
            }
            alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131752099, "ClearButton"), new dt0(privacySettingsActivity, i12));
            alertDialog$Builder5.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
            privacySettingsActivity.showDialog(s1Var5);
            privacySettingsActivity.showDialog(s1Var5);
            TextView textView3 = (TextView) s1Var5.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.d0 == null) {
            privacySettingsActivity.d0 = new SpannableString("★");
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (vg.w0) ha.e.d().g);
            f5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.d0.setSpan(new ImageSpan(f5Var, 2), 0, privacySettingsActivity.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.d0);
    }

    public final void D0() {
        TwoStepVerificationActivity.r0(this.d);
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().v(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i3 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z10 = str != null && i3 == -1;
            boolean z11 = str == null && i3 != -1;
            if (z10 || z11) {
                F0(false);
                et0 et0Var = this.a;
                if (et0Var != null) {
                    if (z10) {
                        et0Var.i(this.emailLoginRow);
                    } else {
                        et0Var.s(i3);
                    }
                }
            }
        }
        et0 et0Var2 = this.a;
        if (et0Var2 != null) {
            et0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 20), 10);
    }

    public final void F0(boolean z10) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().x7.A.b).c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.r2.i) {
            int i3 = this.P;
            this.P = i3 + 1;
            this.passkeysRow = i3;
        }
        TL_account.Password password = this.d;
        if (password == null ? !org.telegram.messenger.az.m1 : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i10 = this.P;
            this.P = i10 + 1;
            this.emailLoginRow = i10;
        }
        int i11 = this.P;
        this.P = i11 + 1;
        this.blockedRow = i11;
        if (password != null) {
            boolean z11 = password.login_email_pattern != null;
            if (org.telegram.messenger.az.m1 != z11) {
                org.telegram.messenger.az.m1 = z11;
                org.telegram.messenger.az.y();
            }
        }
        int i12 = this.P;
        this.s = i12;
        this.w = i12 + 1;
        this.f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.P = i12 + 8;
        this.callsRow = i12 + 7;
        this.r = -1;
        if (!getMessagesController().D3() || getUserConfig().q()) {
            int i13 = this.P;
            this.voicesRow = i13;
            this.P = i13 + 2;
            this.noncontactsRow = i13 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i14 = this.P;
        this.birthdayRow = i14;
        this.giftsRow = i14 + 1;
        this.bioRow = i14 + 2;
        this.musicRow = i14 + 3;
        this.n = i14 + 4;
        this.P = i14 + 6;
        this.h = i14 + 5;
        if (getMessagesController().Z3 || getUserConfig().q()) {
            int i15 = this.P;
            this.x = i15;
            this.newChatsRow = i15 + 1;
            this.P = i15 + 3;
            this.y = i15 + 2;
        } else {
            this.x = -1;
            this.newChatsRow = -1;
            this.y = -1;
        }
        int i16 = this.P;
        this.E = i16;
        this.deleteAccountRow = i16 + 1;
        this.F = i16 + 2;
        this.P = i16 + 4;
        this.G = i16 + 3;
        if (getUserConfig().Y) {
            int i17 = this.P;
            this.P = i17 + 1;
            this.H = i17;
        } else {
            this.H = -1;
        }
        int i18 = this.P;
        this.P = i18 + 1;
        this.paymentsClearRow = i18;
        if (this.Q.isEmpty()) {
            this.I = -1;
        } else {
            int i19 = this.P;
            this.P = i19 + 1;
            this.I = i19;
        }
        SessionsActivity sessionsActivity = this.c0;
        if (sessionsActivity == null || sessionsActivity.o0() <= 0) {
            this.webSessionsRow = -1;
            this.J = -1;
            int i20 = this.P;
            this.P = i20 + 1;
            this.K = i20;
        } else {
            int i21 = this.P;
            this.webSessionsRow = i21;
            this.P = i21 + 2;
            this.J = i21 + 1;
            this.K = -1;
        }
        int i22 = this.P;
        this.L = i22;
        this.contactsDeleteRow = i22 + 1;
        this.contactsSyncRow = i22 + 2;
        this.contactsSuggestRow = i22 + 3;
        this.M = i22 + 4;
        this.N = i22 + 5;
        this.secretMapRow = i22 + 6;
        this.secretWebpageRow = i22 + 7;
        this.P = i22 + 9;
        this.O = i22 + 8;
        et0 et0Var = this.a;
        if (et0Var == null || !z10) {
            return;
        }
        et0Var.f();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746779, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, i3));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new et0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new kg.y(i3, false, 16));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new ei.q4(21, this, context));
        ii.r.d(getParentActivity(), this.currentAccount, new s3(this, 20));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        et0 et0Var;
        if (i3 == org.telegram.messenger.hs.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Z = (globalPrivacySettings.flags & 32) != 0;
            }
            et0 et0Var2 = this.a;
            if (et0Var2 != null) {
                et0Var2.f();
            }
        } else if (i3 == org.telegram.messenger.hs.g0) {
            this.a.g(this.blockedRow);
        } else if (i3 == org.telegram.messenger.hs.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                et0 et0Var3 = this.a;
                if (et0Var3 != null) {
                    et0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i3 != org.telegram.messenger.hs.s5 || (et0Var = this.a) == null) {
            return;
        }
        et0Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z10 = getUserConfig().V;
        this.U = z10;
        this.T = z10;
        boolean z11 = getUserConfig().W;
        this.W = z11;
        this.V = z11;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.Z = (globalPrivacySettings.flags & 32) != 0;
        }
        F0(true);
        E0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new c3.b(1), new c5(this, 17));
        getNotificationCenter().c(this, org.telegram.messenger.hs.k0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.g0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.q0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.s5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new dt0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new dt0(this, 3);
        sessionsActivity2.p0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z10;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.k0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.g0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.q0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.s5);
        boolean z11 = true;
        if (this.T != this.U) {
            org.telegram.messenger.h10 userConfig = getUserConfig();
            boolean z12 = this.U;
            userConfig.V = z12;
            if (z12 && org.telegram.messenger.g5.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131744307, "SyncContactsAdded"), 0).show();
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.W;
        int i3 = 9;
        if (z13 != this.V) {
            if (!z13) {
                getMediaDataController().F();
            }
            getUserConfig().W = this.W;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.W;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new ei.u5(i3));
            z10 = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            boolean z14 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z15 = this.X;
            if (z14 != z15) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z15;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().Y;
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.X;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new ei.u5(i3));
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        et0 et0Var = this.a;
        if (et0Var != null) {
            et0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
