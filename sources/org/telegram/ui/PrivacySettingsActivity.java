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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
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
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final boolean[] V;
    public SessionsActivity W;
    public SessionsActivity X;
    public SpannableString Y;
    public yw0 a;
    private int autoDeleteMesages;
    public org.telegram.ui.Components.wk0 b;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public org.telegram.ui.ActionBar.c2 c;
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
        this.L = new ArrayList();
        this.V = new boolean[2];
    }

    public static void T(PrivacySettingsActivity privacySettingsActivity) {
        if (privacySettingsActivity.a != null) {
            int i02 = privacySettingsActivity.X.i0();
            if (privacySettingsActivity.webSessionsRow >= 0 || i02 <= 0) {
                return;
            }
            privacySettingsActivity.z0(true);
        }
    }

    public static void U(PrivacySettingsActivity privacySettingsActivity, Context context, View view, int i9) {
        String str;
        if (view.isEnabled()) {
            if (i9 == privacySettingsActivity.autoDeleteMesages) {
                if (privacySettingsActivity.getUserConfig().getGlobalTTl() >= 0) {
                    privacySettingsActivity.presentFragment(new p4());
                    return;
                }
                return;
            }
            if (i9 == privacySettingsActivity.blockedRow) {
                privacySettingsActivity.presentFragment(new cx0());
                return;
            }
            if (i9 == privacySettingsActivity.s) {
                privacySettingsActivity.W.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.W);
                return;
            }
            if (i9 == privacySettingsActivity.webSessionsRow) {
                privacySettingsActivity.X.resetFragment();
                privacySettingsActivity.presentFragment(privacySettingsActivity.X);
                return;
            }
            int i10 = 4;
            if (i9 == privacySettingsActivity.deleteAccountRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                if (deleteAccountTTL <= 31) {
                    i10 = 0;
                } else if (deleteAccountTTL <= 93) {
                    i10 = 1;
                } else if (deleteAccountTTL <= 182) {
                    i10 = 2;
                } else if (deleteAccountTTL != 548) {
                    i10 = deleteAccountTTL == 730 ? 5 : 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(privacySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i11 = 0;
                while (i11 < 6) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(privacySettingsActivity.getParentActivity(), null);
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i11));
                    k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                    k6Var.b(strArr[i11], i10 == i11);
                    linearLayout.addView(k6Var);
                    k6Var.setOnClickListener(new v80(15, privacySettingsActivity, alertDialog$Builder));
                    i11++;
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i9 == privacySettingsActivity.lastSeenRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i9 == privacySettingsActivity.phoneNumberRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i9 == privacySettingsActivity.n) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i9 == privacySettingsActivity.callsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i9 == privacySettingsActivity.profilePhotoRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            if (i9 == privacySettingsActivity.bioRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i9 == privacySettingsActivity.musicRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            if (i9 == privacySettingsActivity.birthdayRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i9 == privacySettingsActivity.giftsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i9 == privacySettingsActivity.forwardsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            if (i9 == privacySettingsActivity.voicesRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i9 == privacySettingsActivity.noncontactsRow) {
                privacySettingsActivity.presentFragment(new PrivacyControlActivity(10, false));
                return;
            }
            if (i9 == privacySettingsActivity.emailLoginRow) {
                TL_account.Password password = privacySettingsActivity.d;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                    vz0Var.a |= 256;
                    vz0Var.b = indexOf;
                    int i12 = lastIndexOf + 1;
                    vz0Var.c = i12;
                    valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i12, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.a.N = valueOf;
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.EmailLoginChangeMessage);
                alertDialog$Builder2.k(LocaleController.getString(R.string.ChangeEmail), new xw0(privacySettingsActivity, 4));
                j3.r0.v(R.string.Cancel, alertDialog$Builder2, null);
                return;
            }
            if (i9 == privacySettingsActivity.passwordRow) {
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.h0(password2, false)) {
                    org.telegram.ui.Components.y4.x0(privacySettingsActivity.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                }
                TL_account.Password password3 = privacySettingsActivity.d;
                if (!password3.has_password) {
                    privacySettingsActivity.presentFragment(new ag1(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, privacySettingsActivity.d));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.E = privacySettingsActivity.d;
                twoStepVerificationActivity.F = false;
                privacySettingsActivity.presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i9 == privacySettingsActivity.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !BuildVars.SUPPORTS_PASSKEYS) {
                    return;
                }
                ArrayList arrayList = privacySettingsActivity.e;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.Z(privacySettingsActivity.currentAccount, context, privacySettingsActivity.resourceProvider, true);
                    return;
                } else {
                    privacySettingsActivity.presentFragment(new PasskeysActivity(privacySettingsActivity.e));
                    return;
                }
            }
            if (i9 == privacySettingsActivity.passcodeRow) {
                privacySettingsActivity.presentFragment(PasscodeActivity.a0());
                return;
            }
            if (i9 == privacySettingsActivity.secretWebpageRow) {
                if (privacySettingsActivity.getMessagesController().secretWebpagePreview == 1) {
                    privacySettingsActivity.getMessagesController().secretWebpagePreview = 0;
                } else {
                    privacySettingsActivity.getMessagesController().secretWebpagePreview = 1;
                }
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", privacySettingsActivity.getMessagesController().secretWebpagePreview).commit();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(privacySettingsActivity.getMessagesController().secretWebpagePreview == 1);
                    return;
                }
                return;
            }
            if (i9 == privacySettingsActivity.contactsDeleteRow) {
                if (privacySettingsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder3.a.N = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                alertDialog$Builder3.a.P = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new xw0(privacySettingsActivity, 5));
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder3.a;
                privacySettingsActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            if (i9 == privacySettingsActivity.contactsSuggestRow) {
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                if (!privacySettingsActivity.R) {
                    privacySettingsActivity.R = true;
                    t8Var.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder4.a.N = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                alertDialog$Builder4.a.P = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                alertDialog$Builder4.k(LocaleController.getString("MuteDisable", R.string.MuteDisable), new nl0(13, privacySettingsActivity, t8Var));
                alertDialog$Builder4.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView2 = (TextView) c2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            if (i9 == privacySettingsActivity.newChatsRow) {
                boolean z10 = !privacySettingsActivity.S;
                privacySettingsActivity.S = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                return;
            }
            if (i9 == privacySettingsActivity.contactsSyncRow) {
                boolean z11 = !privacySettingsActivity.P;
                privacySettingsActivity.P = z11;
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                    return;
                }
                return;
            }
            if (i9 == privacySettingsActivity.secretMapRow) {
                org.telegram.ui.Components.y4.s0(privacySettingsActivity.getParentActivity(), privacySettingsActivity.currentAccount, new ww0(privacySettingsActivity, 0), false, null);
                return;
            }
            if (i9 != privacySettingsActivity.paymentsClearRow) {
                if (i9 == privacySettingsActivity.C) {
                    privacySettingsActivity.presentFragment(new wm0(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i9 == privacySettingsActivity.D) {
                        privacySettingsActivity.presentFragment(new mh.t());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
            alertDialog$Builder5.a.N = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
            alertDialog$Builder5.a.P = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
            LinearLayout linearLayout2 = new LinearLayout(privacySettingsActivity.getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.n(linearLayout2);
            int i13 = 0;
            while (i13 < 2) {
                String string = i13 == 0 ? LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping) : LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                privacySettingsActivity.V[i13] = true;
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(1, 21, privacySettingsActivity.getParentActivity(), null, false);
                z1Var.setTag(Integer.valueOf(i13));
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                z1Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout2.addView(z1Var, g7.e6.n(-1, 50));
                z1Var.e(string, null, true, false, false);
                z1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
                z1Var.setOnClickListener(new q50(privacySettingsActivity, 26));
                i13++;
            }
            alertDialog$Builder5.k(LocaleController.getString("ClearButton", R.string.ClearButton), new xw0(privacySettingsActivity, 0));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            privacySettingsActivity.showDialog(alertDialog$Builder5.a);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.a;
            privacySettingsActivity.showDialog(c2Var3);
            TextView textView3 = (TextView) c2Var3.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
            }
        }
    }

    public static SpannableStringBuilder t0(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.Y == null) {
            privacySettingsActivity.Y = new SpannableString("★");
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), zf.a1.d().f);
            j5Var.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.Y.setSpan(new ImageSpan(j5Var, 2), 0, privacySettingsActivity.Y.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.Y);
    }

    public static String w0(int i9, AccountInstance accountInstance) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        Boolean bool;
        ArrayList<TLRPC.PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i9);
        TLRPC.GlobalPrivacySettings globalPrivacySettings = accountInstance.getContactsController().getGlobalPrivacySettings();
        if (privacyRules == null || privacyRules.size() == 0) {
            return i9 == 3 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.getString(R.string.LastSeenNobody);
        }
        Boolean bool2 = null;
        int i10 = 0;
        int i11 = 0;
        char c10 = 65535;
        boolean z10 = false;
        for (int i12 = 0; i12 < privacyRules.size(); i12++) {
            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Chat chat = accountInstance.getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i13));
                    if (chat != null) {
                        i10 += chat.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i14));
                    if (chat2 != null) {
                        i11 += chat2.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i10 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i11 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z10 = true;
            } else {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                    bool = Boolean.TRUE;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                    bool = Boolean.FALSE;
                } else if (c10 == 65535) {
                    c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                }
                bool2 = bool;
            }
        }
        if (i9 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsOnlyPremium);
        }
        if (i9 == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsNone);
        }
        if (c10 == 0 || (c10 == 65535 && i11 > 0)) {
            if (i9 == 3) {
                return i11 == 0 ? LocaleController.getString(R.string.P2PEverybody) : LocaleController.formatString(R.string.P2PEverybodyMinus, Integer.valueOf(i11));
            }
            if (i9 != 12) {
                return i11 == 0 ? LocaleController.getString(R.string.LastSeenEverybody) : LocaleController.formatString(R.string.LastSeenEverybodyMinus, Integer.valueOf(i11));
            }
            if (i11 == 0) {
                return LocaleController.getString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybody : R.string.PrivacyValueEveryoneExceptBots);
            }
            return LocaleController.formatString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybodyMinus : R.string.PrivacyValueEveryoneExceptBotsMinus, Integer.valueOf(i11));
        }
        if (c10 != 2 && (c10 != 65535 || i11 <= 0 || i10 <= 0)) {
            if (c10 != 1 && i10 <= 0) {
                return (bool2 == null || !bool2.booleanValue()) ? "unknown" : LocaleController.getString(R.string.PrivacyValueOnlyBots);
            }
            if (i9 == 3) {
                return i10 == 0 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.formatString(R.string.P2PNobodyPlus, Integer.valueOf(i10));
            }
            if (i10 == 0) {
                return z10 ? LocaleController.getString(R.string.LastSeenNobodyPremium) : (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenNobody) : LocaleController.getString(R.string.PrivacyValueOnlyBots);
            }
            return LocaleController.formatString(z10 ? R.string.LastSeenNobodyPremiumPlus : R.string.LastSeenNobodyPlus, Integer.valueOf(i10));
        }
        if (i9 == 3) {
            return (i10 == 0 && i11 == 0) ? LocaleController.getString("P2PContacts", R.string.P2PContacts) : (i10 == 0 || i11 == 0) ? i11 != 0 ? LocaleController.formatString(R.string.P2PContactsMinus, Integer.valueOf(i11)) : LocaleController.formatString(R.string.P2PContactsPlus, Integer.valueOf(i10)) : LocaleController.formatString(R.string.P2PContactsMinusPlus, Integer.valueOf(i11), Integer.valueOf(i10));
        }
        if (i10 == 0 && i11 == 0) {
            return z10 ? LocaleController.getString(R.string.LastSeenContactsPremium) : (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenContacts) : LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
        }
        if (i10 != 0 && i11 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z10 ? R.string.LastSeenContactsPremiumMinusPlus : R.string.LastSeenContactsMinusPlus : R.string.PrivacyContactsAndBotUsersMinusPlus, Integer.valueOf(i11), Integer.valueOf(i10));
        }
        if (i11 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z10 ? R.string.LastSeenContactsPremiumMinus : R.string.LastSeenContactsMinus : R.string.PrivacyContactsAndBotUsersMinus, Integer.valueOf(i11));
        }
        return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z10 ? R.string.LastSeenContactsPremiumPlus : R.string.LastSeenContactsPlus : R.string.PrivacyContactsAndBotUsersPlus, Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 16));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new yw0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setLayoutManager(new of.y(i9, false, 15));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new bg.b1(23, this, context));
        mh.r.d(getParentActivity(), this.currentAccount, new w3(this, 16));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        yw0 yw0Var;
        if (i9 == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.S = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.T = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.U = (globalPrivacySettings.flags & 32) != 0;
            }
            yw0 yw0Var2 = this.a;
            if (yw0Var2 != null) {
                yw0Var2.l();
            }
        } else if (i9 == NotificationCenter.blockedUsersDidLoad) {
            this.a.m(this.blockedRow);
        } else if (i9 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                yw0 yw0Var3 = this.a;
                if (yw0Var3 != null) {
                    yw0Var3.m(this.passwordRow);
                }
            } else {
                this.d = null;
                y0();
                z0(true);
            }
        }
        if (i9 != NotificationCenter.didUpdateGlobalAutoDeleteTimer || (yw0Var = this.a) == null) {
            return;
        }
        yw0Var.m(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().loadPrivacySettings();
        getMessagesController().getBlockedPeers(true);
        boolean z10 = getUserConfig().syncContacts;
        this.P = z10;
        this.O = z10;
        boolean z11 = getUserConfig().suggestContacts;
        this.R = z11;
        this.Q = z11;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.S = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.T = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.U = (globalPrivacySettings.flags & 32) != 0;
        }
        z0(true);
        y0();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new org.telegram.messenger.a(), new a5(this, 17));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.W = sessionsActivity;
        sessionsActivity.U = new xw0(this, 2);
        sessionsActivity.j0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.X = sessionsActivity2;
        sessionsActivity2.U = new xw0(this, 3);
        sessionsActivity2.j0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z10;
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        boolean z11 = true;
        if (this.O != this.P) {
            UserConfig userConfig = getUserConfig();
            boolean z12 = this.P;
            userConfig.syncContacts = z12;
            if (z12 && ContactsController.hasContactsPermission()) {
                getContactsController().forceImportContacts();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), LocaleController.getString("SyncContactsAdded", R.string.SyncContactsAdded), 0).show();
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.R;
        if (z13 != this.Q) {
            if (!z13) {
                getMediaDataController().clearTopPeers();
            }
            getUserConfig().suggestContacts = this.R;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.R;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new ih.q5(5));
            z10 = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            boolean z14 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z15 = this.S;
            if (z14 != z15) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z15;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.S;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new ih.q5(5));
                if (z11) {
                    return;
                }
                getUserConfig().saveConfig(false);
                return;
            }
        }
        z11 = z10;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.b.setPadding(0, 0, 0, i12);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        yw0 yw0Var = this.a;
        if (yw0Var != null) {
            yw0Var.l();
        }
    }

    public final void x0() {
        TwoStepVerificationActivity.l0(this.d);
        if (!getUserConfig().hasSecureData && this.d.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            z0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i9 = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z10 = str != null && i9 == -1;
            boolean z11 = str == null && i9 != -1;
            if (z10 || z11) {
                z0(false);
                yw0 yw0Var = this.a;
                if (yw0Var != null) {
                    if (z10) {
                        yw0Var.o(this.emailLoginRow);
                    } else {
                        yw0Var.u(i9);
                    }
                }
            }
        }
        yw0 yw0Var2 = this.a;
        if (yw0Var2 != null) {
            yw0Var2.m(this.passwordRow);
        }
    }

    public final void y0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new m(this, 19), 10);
    }

    public final void z0(boolean z10) {
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.K = 4;
        this.passcodeRow = 3;
        if (getMessagesController().config.settingsDisplayPasskeys.get() && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
            int i9 = this.K;
            this.K = i9 + 1;
            this.passkeysRow = i9;
        }
        TL_account.Password password = this.d;
        if (password == null ? !SharedConfig.hasEmailLogin : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i10 = this.K;
            this.K = i10 + 1;
            this.emailLoginRow = i10;
        }
        int i11 = this.K;
        this.K = i11 + 1;
        this.blockedRow = i11;
        if (password != null) {
            boolean z11 = password.login_email_pattern != null;
            if (SharedConfig.hasEmailLogin != z11) {
                SharedConfig.hasEmailLogin = z11;
                SharedConfig.saveConfig();
            }
        }
        int i12 = this.K;
        this.s = i12;
        this.v = i12 + 1;
        this.f = i12 + 2;
        this.phoneNumberRow = i12 + 3;
        this.lastSeenRow = i12 + 4;
        this.profilePhotoRow = i12 + 5;
        this.forwardsRow = i12 + 6;
        this.K = i12 + 8;
        this.callsRow = i12 + 7;
        this.r = -1;
        if (!getMessagesController().premiumFeaturesBlocked() || getUserConfig().isPremium()) {
            int i13 = this.K;
            this.voicesRow = i13;
            this.K = i13 + 2;
            this.noncontactsRow = i13 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i14 = this.K;
        this.birthdayRow = i14;
        this.giftsRow = i14 + 1;
        this.bioRow = i14 + 2;
        this.musicRow = i14 + 3;
        this.n = i14 + 4;
        this.K = i14 + 6;
        this.h = i14 + 5;
        if (getMessagesController().autoarchiveAvailable || getUserConfig().isPremium()) {
            int i15 = this.K;
            this.w = i15;
            this.newChatsRow = i15 + 1;
            this.K = i15 + 3;
            this.x = i15 + 2;
        } else {
            this.w = -1;
            this.newChatsRow = -1;
            this.x = -1;
        }
        int i16 = this.K;
        this.y = i16;
        this.deleteAccountRow = i16 + 1;
        this.A = i16 + 2;
        this.K = i16 + 4;
        this.B = i16 + 3;
        if (getUserConfig().hasSecureData) {
            int i17 = this.K;
            this.K = i17 + 1;
            this.C = i17;
        } else {
            this.C = -1;
        }
        int i18 = this.K;
        this.K = i18 + 1;
        this.paymentsClearRow = i18;
        if (this.L.isEmpty()) {
            this.D = -1;
        } else {
            int i19 = this.K;
            this.K = i19 + 1;
            this.D = i19;
        }
        SessionsActivity sessionsActivity = this.X;
        if (sessionsActivity == null || sessionsActivity.i0() <= 0) {
            this.webSessionsRow = -1;
            this.E = -1;
            int i20 = this.K;
            this.K = i20 + 1;
            this.F = i20;
        } else {
            int i21 = this.K;
            this.webSessionsRow = i21;
            this.K = i21 + 2;
            this.E = i21 + 1;
            this.F = -1;
        }
        int i22 = this.K;
        this.G = i22;
        this.contactsDeleteRow = i22 + 1;
        this.contactsSyncRow = i22 + 2;
        this.contactsSuggestRow = i22 + 3;
        this.H = i22 + 4;
        this.I = i22 + 5;
        this.secretMapRow = i22 + 6;
        this.secretWebpageRow = i22 + 7;
        this.K = i22 + 9;
        this.J = i22 + 8;
        yw0 yw0Var = this.a;
        if (yw0Var == null || !z10) {
            return;
        }
        yw0Var.l();
    }
}
