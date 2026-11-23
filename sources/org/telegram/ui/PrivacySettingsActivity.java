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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public nt0 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.ek0 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.t1 c;
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

    public static String C0(org.telegram.messenger.c cVar, int i7) {
        String str;
        int i10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = org.telegram.messenger.i5.r(cVar.a).v(i7);
        int i11 = cVar.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(i11).Y;
        if (v == null || v.size() == 0) {
            return i7 == 3 ? org.telegram.messenger.gd.N0(2131747557, null) : org.telegram.messenger.gd.N0(2131748823, null);
        }
        char c10 = 65535;
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
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(tL_privacyValueAllowChatParticipants.chats.get(i15));
                    if (O0 != null) {
                        i12 += O0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(tL_privacyValueDisallowChatParticipants.chats.get(i16));
                    if (O02 != null) {
                        i13 += O02.participants_count;
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
            } else if (c10 == 65535) {
                c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
            }
        }
        if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return org.telegram.messenger.gd.N0(2131746566, null);
        }
        if (i7 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return org.telegram.messenger.gd.N0(2131746567, null);
        }
        if (c10 == 0) {
            str = null;
            i10 = 3;
        } else {
            if (c10 != 65535 || i13 <= 0) {
                if (c10 != 2 && (c10 != 65535 || i13 <= 0 || i12 <= 0)) {
                    if (c10 != 1 && i12 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : org.telegram.messenger.gd.N0(2131746565, null);
                    }
                    if (i7 == 3) {
                        return i12 == 0 ? org.telegram.messenger.gd.N0(2131747557, null) : org.telegram.messenger.gd.a0(null, null, 2131747556, Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        return z10 ? org.telegram.messenger.gd.N0(2131748821, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.gd.N0(2131748823, null) : org.telegram.messenger.gd.N0(2131746565, null);
                    }
                    return org.telegram.messenger.gd.a0(null, null, z10 ? 2131748820 : 2131748822, Integer.valueOf(i12));
                }
                if (i7 == 3) {
                    return (i12 == 0 && i13 == 0) ? org.telegram.messenger.gd.N0(2131747564, "P2PContacts") : (i12 == 0 || i13 == 0) ? i13 != 0 ? org.telegram.messenger.gd.a0(null, null, 2131747563, Integer.valueOf(i13)) : org.telegram.messenger.gd.a0(null, null, 2131747561, Integer.valueOf(i12)) : org.telegram.messenger.gd.a0(null, null, 2131747562, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i12 == 0 && i13 == 0) {
                    return z10 ? org.telegram.messenger.gd.N0(2131748832, null) : (bool == null || !bool.booleanValue()) ? org.telegram.messenger.gd.N0(2131748836, null) : org.telegram.messenger.gd.N0(2131746651, null);
                }
                if (i12 != 0 && i13 != 0) {
                    return org.telegram.messenger.gd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131748830 : 2131748834 : 2131746649, Integer.valueOf(i13), Integer.valueOf(i12));
                }
                if (i13 != 0) {
                    return org.telegram.messenger.gd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131748831 : 2131748835 : 2131746650, Integer.valueOf(i13));
                }
                return org.telegram.messenger.gd.a0(null, null, (bool == null || !bool.booleanValue()) ? z10 ? 2131748829 : 2131748833 : 2131746648, Integer.valueOf(i12));
            }
            i10 = 3;
            str = null;
        }
        if (i7 == i10) {
            return i13 == 0 ? org.telegram.messenger.gd.N0(2131747559, str) : org.telegram.messenger.gd.a0(str, str, 2131747558, Integer.valueOf(i13));
        }
        int i17 = 2131748825;
        int i18 = 2131748826;
        if (i7 != 12) {
            return i13 == 0 ? org.telegram.messenger.gd.N0(2131748826, null) : org.telegram.messenger.gd.a0(null, null, 2131748825, Integer.valueOf(i13));
        }
        if (i13 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i18 = 2131746569;
            }
            return org.telegram.messenger.gd.N0(i18, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i17 = 2131746568;
        }
        return org.telegram.messenger.gd.a0(null, null, i17, Integer.valueOf(i13));
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

    public static void a0(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i7) {
        String str;
        if (view.isEnabled()) {
            if (i7 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().q0 >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new rt0());
                return;
            }
            if (i7 == privacySettingsActivity.s) {
                privacySettingsActivity.b0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.b0);
                return;
            }
            if (i7 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.c0.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.c0);
                return;
            }
            int i10 = 12;
            int i11 = 4;
            int i12 = 6;
            int i13 = 0;
            if (i7 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int i14 = privacySettingsActivity.getContactsController().I;
                if (i14 <= 31) {
                    i11 = 0;
                } else if (i14 <= 93) {
                    i11 = 1;
                } else if (i14 <= 182) {
                    i11 = 2;
                } else if (i14 != 548) {
                    i11 = i14 == 730 ? 5 : 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131751582, "DeleteAccountTitle");
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                String[] strArr = {org.telegram.messenger.gd.G(1, "Months", new Object[0]), org.telegram.messenger.gd.G(3, "Months", new Object[0]), org.telegram.messenger.gd.G(6, "Months", new Object[0]), org.telegram.messenger.gd.G(12, "Months", new Object[0]), org.telegram.messenger.gd.G(18, "Months", new Object[0]), org.telegram.messenger.gd.G(24, "Months", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i15 = 0;
                while (i15 < 6) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(privacySettingsActivity.getParentActivity(), null);
                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    j6Var.setTag(Integer.valueOf(i15));
                    j6Var.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                    j6Var.b(strArr[i15], i11 == i15);
                    linearLayout.addView(j6Var);
                    j6Var.setOnClickListener(new ig0(i12, privacySettingsActivity, alertDialog$Builder));
                    i15++;
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                privacySettingsActivity.showDialog(t1Var);
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
                    org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0();
                    ez0Var.a |= 256;
                    ez0Var.b = indexOf;
                    int i16 = lastIndexOf + 1;
                    ez0Var.c = i16;
                    valueOf.setSpan(new org.telegram.ui.Components.fz0(ez0Var, 0), indexOf, i16, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = valueOf;
                t1Var2.U = org.telegram.messenger.gd.N0(2131751189, null);
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131752536, null), new mt0(privacySettingsActivity, i11));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder2.p();
                return;
            }
            if (i7 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.n0(password2, false)) {
                    org.telegram.ui.Components.b5.u0(privacySettingsActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, "UpdateAppAlert"), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new za1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.J = privacySettingsActivity.d;
                twoStepVerificationActivity.K = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i7 == privacySettingsActivity.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !org.telegram.messenger.s2.i) {
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
                if (privacySettingsActivity.getMessagesController().J2 == 1) {
                    privacySettingsActivity.getMessagesController().J2 = 0;
                } else {
                    privacySettingsActivity.getMessagesController().J2 = 1;
                }
                org.telegram.messenger.mp.g1().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().J2).commit();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(privacySettingsActivity.getMessagesController().J2 == 1);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String N02 = org.telegram.messenger.gd.N0(2131744049, "SyncContactsDeleteTitle");
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                t1Var3.S = N02;
                t1Var3.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131744050, "SyncContactsDeleteText"));
                alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131751586, "Delete"), new mt0(privacySettingsActivity, r7));
                privacySettingsActivity.showDialog(t1Var3);
                TextView textView = (TextView) t1Var3.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (!privacySettingsActivity.W) {
                    privacySettingsActivity.W = true;
                    r8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String N03 = org.telegram.messenger.gd.N0(2131744164, "SuggestContactsTitle");
                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                t1Var4.S = N03;
                t1Var4.U = org.telegram.messenger.gd.N0(2131744166, "SuggestContactsAlert");
                alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131748120, "MuteDisable"), new yi0(i10, privacySettingsActivity, r8Var));
                alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                privacySettingsActivity.showDialog(t1Var4);
                TextView textView2 = (TextView) t1Var4.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.newChatsRow) {
                boolean z10 = !privacySettingsActivity.X;
                privacySettingsActivity.X = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                return;
            }
            if (i7 == privacySettingsActivity.contactsSyncRow) {
                boolean z11 = !privacySettingsActivity.U;
                privacySettingsActivity.U = z11;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                    return;
                }
                return;
            }
            if (i7 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.b5.p0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new lt0(privacySettingsActivity, i13), false, null);
                return;
            }
            if (i7 != privacySettingsActivity.paymentsClearRow) {
                if (i7 == privacySettingsActivity.H) {
                    privacySettingsActivity.presentFragment(new fk0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i7 == privacySettingsActivity.I) {
                        privacySettingsActivity.presentFragment(new ki.q());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            String N04 = org.telegram.messenger.gd.N0(2131746600, "PrivacyPaymentsClearAlertTitle");
            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.a;
            t1Var5.S = N04;
            t1Var5.U = org.telegram.messenger.gd.N0(2131746601, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.o(linearLayout2);
            int i17 = 0;
            while (i17 < 2) {
                String N05 = i17 == 0 ? org.telegram.messenger.gd.N0(2131746652, "PrivacyClearShipping") : org.telegram.messenger.gd.N0(2131746653, "PrivacyClearPayment");
                privacySettingsActivity.a0[i17] = true;
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(privacySettingsActivity.getParentActivity(), 1, 21, false, null);
                d2Var.setTag(Integer.valueOf(i17));
                d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                d2Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                linearLayout2.addView(d2Var, c8.na.o(-1, 50));
                d2Var.e(N05, null, true, false, false);
                d2Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false));
                d2Var.setOnClickListener(new i40(privacySettingsActivity, 27));
                i17++;
            }
            alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131752087, "ClearButton"), new mt0(privacySettingsActivity, i13));
            alertDialog$Builder5.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            privacySettingsActivity.showDialog(t1Var5);
            privacySettingsActivity.showDialog(t1Var5);
            TextView textView3 = (TextView) t1Var5.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.q7, null);
            }
        }
    }

    public static SpannableStringBuilder z0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.d0 == null) {
            privacySettingsActivity.d0 = new SpannableString("★");
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), (ug.z0) ia.e.d().g);
            n5Var.setBounds(0, 0, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            privacySettingsActivity.d0.setSpan(new ImageSpan(n5Var, 2), 0, privacySettingsActivity.d0.length(), 17);
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
            int i7 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z10 = str != null && i7 == -1;
            boolean z11 = str == null && i7 != -1;
            if (z10 || z11) {
                F0(false);
                nt0 nt0Var = this.a;
                if (nt0Var != null) {
                    if (z10) {
                        nt0Var.i(this.emailLoginRow);
                    } else {
                        nt0Var.s(i7);
                    }
                }
            }
        }
        nt0 nt0Var2 = this.a;
        if (nt0Var2 != null) {
            nt0Var2.g(this.passwordRow);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new l(this, 19), 10);
    }

    public final void F0(boolean z10) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (((org.telegram.messenger.h0) getMessagesController().A7.F.b).c && Build.VERSION.SDK_INT >= 28 && org.telegram.messenger.s2.i) {
            int i7 = this.P;
            this.P = i7 + 1;
            this.passkeysRow = i7;
        }
        TL_account.Password password = this.d;
        if (password == null ? !org.telegram.messenger.bz.m1 : password.login_email_pattern == null) {
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
            if (org.telegram.messenger.bz.m1 != z11) {
                org.telegram.messenger.bz.m1 = z11;
                org.telegram.messenger.bz.y();
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
        if (!getMessagesController().K3() || getUserConfig().q()) {
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
        if (getMessagesController().b4 || getUserConfig().q()) {
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
        nt0 nt0Var = this.a;
        if (nt0Var == null || !z10) {
            return;
        }
        nt0Var.f();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746577, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 3));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new nt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new jg.b0(i7, false, 16));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, c8.na.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new fi.g4(21, this, context));
        ki.p.d(getParentActivity(), this.currentAccount, new r3(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        nt0 nt0Var;
        if (i7 == org.telegram.messenger.ks.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Z = (globalPrivacySettings.flags & 32) != 0;
            }
            nt0 nt0Var2 = this.a;
            if (nt0Var2 != null) {
                nt0Var2.f();
            }
        } else if (i7 == org.telegram.messenger.ks.g0) {
            this.a.g(this.blockedRow);
        } else if (i7 == org.telegram.messenger.ks.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                nt0 nt0Var3 = this.a;
                if (nt0Var3 != null) {
                    nt0Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i7 != org.telegram.messenger.ks.v5 || (nt0Var = this.a) == null) {
            return;
        }
        nt0Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.r8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().D(false);
        getMessagesController().H0(true);
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
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new a5(this, 18));
        getNotificationCenter().c(this, org.telegram.messenger.ks.k0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.g0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.q0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.v5);
        getUserConfig().t();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new mt0(this, 2);
        sessionsActivity.p0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new mt0(this, 3);
        sessionsActivity2.p0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z10;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.k0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.g0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.q0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.v5);
        boolean z11 = true;
        if (this.T != this.U) {
            org.telegram.messenger.i10 userConfig = getUserConfig();
            boolean z12 = this.U;
            userConfig.V = z12;
            if (z12 && org.telegram.messenger.i5.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.gd.N0(2131744052, "SyncContactsAdded"), 0).show();
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.W;
        int i7 = 9;
        if (z13 != this.V) {
            if (!z13) {
                getMediaDataController().H();
            }
            getUserConfig().W = this.W;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.W;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new fi.l5(i7));
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
                getConnectionsManager().sendRequest(setglobalprivacysettings, new fi.l5(i7));
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        nt0 nt0Var = this.a;
        if (nt0Var != null) {
            nt0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
