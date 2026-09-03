package org.telegram.ui;

import android.content.Context;
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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final boolean[] W;
    public SessionsActivity X;
    public SessionsActivity Y;
    public SpannableString Z;
    public px0 a;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.rl0 b;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.d2 c;
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
    public int v;
    private int voicesRow;
    public int w;
    private int webSessionsRow;
    public int x;
    public int y;

    public PrivacySettingsActivity() {
        super(null);
        this.M = new ArrayList();
        this.W = new boolean[2];
    }

    public static void U(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.a != null) {
            int j02 = privacySettingsActivity.Y.j0();
            if (privacySettingsActivity.webSessionsRow >= 0 || j02 <= 0) {
                return;
            }
            privacySettingsActivity.A0(true);
        }
    }

    public static void V(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i10) {
        String str;
        if (view.isEnabled()) {
            if (i10 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().getGlobalTTl() >= 0) {
                    privacySettingsActivity.presentFragment(new u4());
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new tx0());
                return;
            }
            if (i10 == privacySettingsActivity.s) {
                privacySettingsActivity.X.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.X);
                return;
            }
            if (i10 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.Y.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.Y);
                return;
            }
            int i11 = 4;
            if (i10 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                if (deleteAccountTTL <= 31) {
                    i11 = 0;
                } else if (deleteAccountTTL <= 93) {
                    i11 = 1;
                } else if (deleteAccountTTL <= 182) {
                    i11 = 2;
                } else if (deleteAccountTTL != 548) {
                    i11 = deleteAccountTTL == 730 ? 5 : 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i12 = 0;
                while (i12 < 6) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(privacySettingsActivity.getParentActivity(), null);
                    j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    j6Var.setTag(Integer.valueOf(i12));
                    j6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                    j6Var.b(strArr[i12], i11 == i12);
                    linearLayout.addView(j6Var);
                    j6Var.setOnClickListener(new ib0(13, privacySettingsActivity, alertDialog$Builder));
                    i12++;
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.a);
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
                    org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01();
                    s01Var.a |= 256;
                    s01Var.b = indexOf;
                    int i13 = lastIndexOf + 1;
                    s01Var.c = i13;
                    valueOf.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), indexOf, i13, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.a.O = valueOf;
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.EmailLoginChangeMessage);
                alertDialog$Builder2.k(LocaleController.getString(R.string.ChangeEmail), new ox0(privacySettingsActivity, 4));
                kf.k0.u(R.string.Cancel, alertDialog$Builder2, null);
                return;
            }
            if (i10 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.i0(password2, false)) {
                    org.telegram.ui.Components.z4.x0(privacySettingsActivity.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new wg1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.F = privacySettingsActivity.d;
                twoStepVerificationActivity.G = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i10 == privacySettingsActivity.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !BuildVars.SUPPORTS_PASSKEYS) {
                    return;
                }
                ArrayList arrayList = privacySettingsActivity.e;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.a0(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                    return;
                } else {
                    privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                    return;
                }
            }
            if (i10 == privacySettingsActivity.passcodeRow) {
                privacySettingsActivity.presentFragment(PasscodeActivity.b0());
                return;
            }
            if (i10 == privacySettingsActivity.secretWebpageRow) {
                if (privacySettingsActivity.getMessagesController().secretWebpagePreview == 1) {
                    privacySettingsActivity.getMessagesController().secretWebpagePreview = 0;
                } else {
                    privacySettingsActivity.getMessagesController().secretWebpagePreview = 1;
                }
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().secretWebpagePreview).commit();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(privacySettingsActivity.getMessagesController().secretWebpagePreview == 1);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder3.a.O = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                alertDialog$Builder3.a.Q = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new ox0(privacySettingsActivity, 5));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder3.a;
                privacySettingsActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (!privacySettingsActivity.S) {
                    privacySettingsActivity.S = true;
                    r8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder4.a.O = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                alertDialog$Builder4.a.Q = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                alertDialog$Builder4.k(LocaleController.getString("MuteDisable", R.string.MuteDisable), new vl0(12, privacySettingsActivity, r8Var));
                alertDialog$Builder4.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder4.a;
                privacySettingsActivity.showDialog(d2Var2);
                TextView textView2 = (TextView) d2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.newChatsRow) {
                boolean z4 = !privacySettingsActivity.T;
                privacySettingsActivity.T = z4;
                ((org.telegram.ui.Cells.r8) view).setChecked(z4);
                return;
            }
            if (i10 == privacySettingsActivity.contactsSyncRow) {
                boolean z10 = !privacySettingsActivity.Q;
                privacySettingsActivity.Q = z10;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                    return;
                }
                return;
            }
            if (i10 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.z4.s0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new nx0(privacySettingsActivity, 0), false, null);
                return;
            }
            if (i10 != privacySettingsActivity.paymentsClearRow) {
                if (i10 == privacySettingsActivity.D) {
                    privacySettingsActivity.presentFragment(new fn0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i10 == privacySettingsActivity.E) {
                        privacySettingsActivity.presentFragment(new rh.r());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            alertDialog$Builder5.a.O = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
            alertDialog$Builder5.a.Q = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.n(linearLayout2);
            int i14 = 0;
            while (i14 < 2) {
                String string = i14 == 0 ? LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping) : LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                privacySettingsActivity.W[i14] = true;
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                y1Var.setTag(Integer.valueOf(i14));
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                y1Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout2.addView(y1Var, k7.b6.n(-1, 50));
                y1Var.e(string, null, true, false, false);
                y1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                y1Var.setOnClickListener(new g60(privacySettingsActivity, 25));
                i14++;
            }
            alertDialog$Builder5.k(LocaleController.getString("ClearButton", R.string.ClearButton), new ox0(privacySettingsActivity, 0));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            privacySettingsActivity.showDialog(alertDialog$Builder5.a);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder5.a;
            privacySettingsActivity.showDialog(d2Var3);
            TextView textView3 = (TextView) d2Var3.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }

    public static SpannableStringBuilder u0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.Z == null) {
            privacySettingsActivity.Z = new SpannableString("★");
            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eg.r1.d().f);
            k5Var.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.Z.setSpan(new ImageSpan(k5Var, 2), 0, privacySettingsActivity.Z.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.Z);
    }

    public static String x0(int i10, AccountInstance accountInstance) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        Boolean bool;
        ArrayList<TLRPC.PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i10);
        TLRPC.GlobalPrivacySettings globalPrivacySettings = accountInstance.getContactsController().getGlobalPrivacySettings();
        if (privacyRules == null || privacyRules.size() == 0) {
            return i10 == 3 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.getString(R.string.LastSeenNobody);
        }
        Boolean bool2 = null;
        int i11 = 0;
        int i12 = 0;
        char c3 = 65535;
        boolean z4 = false;
        for (int i13 = 0; i13 < privacyRules.size(); i13++) {
            TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.Chat chat = accountInstance.getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i14));
                    if (chat != null) {
                        i11 += chat.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i15));
                    if (chat2 != null) {
                        i12 += chat2.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i11 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i12 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z4 = true;
            } else {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                    bool = Boolean.TRUE;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                    bool = Boolean.FALSE;
                } else if (c3 == 65535) {
                    c3 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                }
                bool2 = bool;
            }
        }
        if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsOnlyPremium);
        }
        if (i10 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsNone);
        }
        if (c3 == 0 || (c3 == 65535 && i12 > 0)) {
            if (i10 == 3) {
                return i12 == 0 ? LocaleController.getString(R.string.P2PEverybody) : LocaleController.formatString(R.string.P2PEverybodyMinus, Integer.valueOf(i12));
            }
            if (i10 != 12) {
                return i12 == 0 ? LocaleController.getString(R.string.LastSeenEverybody) : LocaleController.formatString(R.string.LastSeenEverybodyMinus, Integer.valueOf(i12));
            }
            if (i12 == 0) {
                return LocaleController.getString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybody : R.string.PrivacyValueEveryoneExceptBots);
            }
            return LocaleController.formatString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybodyMinus : R.string.PrivacyValueEveryoneExceptBotsMinus, Integer.valueOf(i12));
        }
        if (c3 != 2 && (c3 != 65535 || i12 <= 0 || i11 <= 0)) {
            if (c3 != 1 && i11 <= 0) {
                return (bool2 == null || !bool2.booleanValue()) ? "unknown" : LocaleController.getString(R.string.PrivacyValueOnlyBots);
            }
            if (i10 == 3) {
                return i11 == 0 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.formatString(R.string.P2PNobodyPlus, Integer.valueOf(i11));
            }
            if (i11 == 0) {
                return z4 ? LocaleController.getString(R.string.LastSeenNobodyPremium) : (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenNobody) : LocaleController.getString(R.string.PrivacyValueOnlyBots);
            }
            return LocaleController.formatString(z4 ? R.string.LastSeenNobodyPremiumPlus : R.string.LastSeenNobodyPlus, Integer.valueOf(i11));
        }
        if (i10 == 3) {
            return (i11 == 0 && i12 == 0) ? LocaleController.getString("P2PContacts", R.string.P2PContacts) : (i11 == 0 || i12 == 0) ? i12 != 0 ? LocaleController.formatString(R.string.P2PContactsMinus, Integer.valueOf(i12)) : LocaleController.formatString(R.string.P2PContactsPlus, Integer.valueOf(i11)) : LocaleController.formatString(R.string.P2PContactsMinusPlus, Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if (i11 == 0 && i12 == 0) {
            return z4 ? LocaleController.getString(R.string.LastSeenContactsPremium) : (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenContacts) : LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
        }
        if (i11 != 0 && i12 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z4 ? R.string.LastSeenContactsPremiumMinusPlus : R.string.LastSeenContactsMinusPlus : R.string.PrivacyContactsAndBotUsersMinusPlus, Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if (i12 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z4 ? R.string.LastSeenContactsPremiumMinus : R.string.LastSeenContactsMinus : R.string.PrivacyContactsAndBotUsersMinus, Integer.valueOf(i12));
        }
        return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z4 ? R.string.LastSeenContactsPremiumPlus : R.string.LastSeenContactsPlus : R.string.PrivacyContactsAndBotUsersPlus, Integer.valueOf(i11));
    }

    public final void A0(boolean z4) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.L = 4;
        this.passcodeRow = 3;
        if (getMessagesController().config.settingsDisplayPasskeys.get() && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
            int i10 = this.L;
            this.L = i10 + 1;
            this.passkeysRow = i10;
        }
        TL_account.Password password = this.d;
        if (password == null ? !SharedConfig.hasEmailLogin : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i11 = this.L;
            this.L = i11 + 1;
            this.emailLoginRow = i11;
        }
        int i12 = this.L;
        this.L = i12 + 1;
        this.blockedRow = i12;
        if (password != null) {
            boolean z10 = password.login_email_pattern != null;
            if (SharedConfig.hasEmailLogin != z10) {
                SharedConfig.hasEmailLogin = z10;
                SharedConfig.saveConfig();
            }
        }
        int i13 = this.L;
        this.s = i13;
        this.v = i13 + 1;
        this.f = i13 + 2;
        this.phoneNumberRow = i13 + 3;
        this.lastSeenRow = i13 + 4;
        this.profilePhotoRow = i13 + 5;
        this.forwardsRow = i13 + 6;
        this.L = i13 + 8;
        this.callsRow = i13 + 7;
        this.r = -1;
        if (!getMessagesController().premiumFeaturesBlocked() || getUserConfig().isPremium()) {
            int i14 = this.L;
            this.voicesRow = i14;
            this.L = i14 + 2;
            this.noncontactsRow = i14 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i15 = this.L;
        this.birthdayRow = i15;
        this.giftsRow = i15 + 1;
        this.bioRow = i15 + 2;
        this.musicRow = i15 + 3;
        this.n = i15 + 4;
        this.L = i15 + 6;
        this.h = i15 + 5;
        if (getMessagesController().autoarchiveAvailable || getUserConfig().isPremium()) {
            int i16 = this.L;
            this.w = i16;
            this.newChatsRow = i16 + 1;
            this.L = i16 + 3;
            this.x = i16 + 2;
        } else {
            this.w = -1;
            this.newChatsRow = -1;
            this.x = -1;
        }
        int i17 = this.L;
        this.y = i17;
        this.deleteAccountRow = i17 + 1;
        this.B = i17 + 2;
        this.L = i17 + 4;
        this.C = i17 + 3;
        if (getUserConfig().hasSecureData) {
            int i18 = this.L;
            this.L = i18 + 1;
            this.D = i18;
        } else {
            this.D = -1;
        }
        int i19 = this.L;
        this.L = i19 + 1;
        this.paymentsClearRow = i19;
        if (this.M.isEmpty()) {
            this.E = -1;
        } else {
            int i20 = this.L;
            this.L = i20 + 1;
            this.E = i20;
        }
        SessionsActivity sessionsActivity = this.Y;
        if (sessionsActivity == null || sessionsActivity.j0() <= 0) {
            this.webSessionsRow = -1;
            this.F = -1;
            int i21 = this.L;
            this.L = i21 + 1;
            this.G = i21;
        } else {
            int i22 = this.L;
            this.webSessionsRow = i22;
            this.L = i22 + 2;
            this.F = i22 + 1;
            this.G = -1;
        }
        int i23 = this.L;
        this.H = i23;
        this.contactsDeleteRow = i23 + 1;
        this.contactsSyncRow = i23 + 2;
        this.contactsSuggestRow = i23 + 3;
        this.I = i23 + 4;
        this.J = i23 + 5;
        this.secretMapRow = i23 + 6;
        this.secretWebpageRow = i23 + 7;
        this.L = i23 + 9;
        this.K = i23 + 8;
        px0 px0Var = this.a;
        if (px0Var == null || !z4) {
            return;
        }
        px0Var.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 8));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new px0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.b = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setLayoutManager(new k(i10, false, 14));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new gg.v0(22, this, context));
        rh.p.d(getParentActivity(), this.currentAccount, new y3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        px0 px0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.T = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.U = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.V = (globalPrivacySettings.flags & 32) != 0;
            }
            px0 px0Var2 = this.a;
            if (px0Var2 != null) {
                px0Var2.l();
            }
        } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
            this.a.m(this.blockedRow);
        } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                px0 px0Var3 = this.a;
                if (px0Var3 != null) {
                    px0Var3.m(this.passwordRow);
                }
            } else {
                this.d = null;
                z0();
                A0(true);
            }
        }
        if (i10 != NotificationCenter.didUpdateGlobalAutoDeleteTimer || (px0Var = this.a) == null) {
            return;
        }
        px0Var.m(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().loadPrivacySettings();
        getMessagesController().getBlockedPeers(true);
        boolean z4 = getUserConfig().syncContacts;
        this.Q = z4;
        this.P = z4;
        boolean z10 = getUserConfig().suggestContacts;
        this.S = z10;
        this.R = z10;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.T = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.U = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.V = (globalPrivacySettings.flags & 32) != 0;
        }
        A0(true);
        z0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new f5(this, 17));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.X = sessionsActivity;
        sessionsActivity.V = new ox0(this, 2);
        sessionsActivity.k0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.Y = sessionsActivity2;
        sessionsActivity2.V = new ox0(this, 3);
        sessionsActivity2.k0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z4;
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        boolean z10 = true;
        if (this.P != this.Q) {
            UserConfig userConfig = getUserConfig();
            boolean z11 = this.Q;
            userConfig.syncContacts = z11;
            if (z11 && ContactsController.hasContactsPermission()) {
                getContactsController().forceImportContacts();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), LocaleController.getString("SyncContactsAdded", R.string.SyncContactsAdded), 0).show();
                }
            }
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z12 = this.S;
        if (z12 != this.R) {
            if (!z12) {
                getMediaDataController().clearTopPeers();
            }
            getUserConfig().suggestContacts = this.S;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.S;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new nh.p5(4));
            z4 = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            boolean z13 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z14 = this.T;
            if (z13 != z14) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z14;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.T;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new nh.p5(4));
                if (z10) {
                    return;
                }
                getUserConfig().saveConfig(false);
                return;
            }
        }
        z10 = z4;
        if (z10) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        px0 px0Var = this.a;
        if (px0Var != null) {
            px0Var.l();
        }
    }

    public final void y0() {
        TwoStepVerificationActivity.m0(this.d);
        if (!getUserConfig().hasSecureData && this.d.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            A0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i10 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z4 = str != null && i10 == -1;
            boolean z10 = str == null && i10 != -1;
            if (z4 || z10) {
                A0(false);
                px0 px0Var = this.a;
                if (px0Var != null) {
                    if (z4) {
                        px0Var.o(this.emailLoginRow);
                    } else {
                        px0Var.u(i10);
                    }
                }
            }
        }
        px0 px0Var2 = this.a;
        if (px0Var2 != null) {
            px0Var2.m(this.passwordRow);
        }
    }

    public final void z0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new o(this, 19), 10);
    }
}
