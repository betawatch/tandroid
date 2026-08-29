package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.p51 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public String B;
    public String C;
    public TL_account.TL_birthday D;
    public long E;
    public TL_account.TL_birthday F;
    public TLRPC.Chat G;
    public boolean H;
    public boolean I;
    public boolean K;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public hg1 d;
    public hg1 e;
    public hg1 f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence n;
    public int numberRow;
    public CharSequence r;
    public int usernameRow;
    public org.telegram.ui.Components.ir v;
    public org.telegram.ui.ActionBar.w0 w;
    public org.telegram.ui.Components.o51 x;
    public int h = TLObject.FLAG_31;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ig1 J = new ig1(this.currentAccount);
    public boolean L = false;
    public int M = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.v.a(0.0f);
                org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(userInfoActivity), null);
                return;
            }
            userInfoActivity.L = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.v.a(0.0f);
        boolean z10 = tLObject instanceof TL_account.updateBirthday;
        if (!z10 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.tc.b0(tL_error);
        } else if (userInfoActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            userInfoActivity.showDialog(alertDialog$Builder.a);
        }
        if (z10) {
            if (tL_birthday != null) {
                userFull.flags |= 32;
            } else {
                userFull.flags &= -33;
            }
            userFull.birthday = tL_birthday;
            userInfoActivity.getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public static String Z(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterDayMonth().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterBoostExpired().format(calendar2.getTimeInMillis());
    }

    public static boolean a0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // org.telegram.ui.Components.p51
    public final void U(ArrayList arrayList, org.telegram.ui.Components.k51 k51Var) {
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.y;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new org.telegram.ui.Components.wp0(15));
        arrayList.add(org.telegram.ui.Components.w41.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w41.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w41.k(this.e));
        arrayList.add(org.telegram.ui.Components.w41.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w41.k(this.f));
        arrayList.add(org.telegram.ui.Components.w41.B(this.n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        th.p(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(x71.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.x3.k(new StringBuilder("+"), currentUser.phone, qe.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(x71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(x71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.F;
        if (tL_birthday != null) {
            arrayList.add(x71.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(x71.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        int i11 = 2;
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.r == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= privacyRules.size()) {
                        break;
                    }
                    if (privacyRules.get(i12) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    }
                    if ((privacyRules.get(i12) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i12) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                    }
                    i12++;
                }
            }
            this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new fg1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.w41.B(this.r));
        this.channelRow = arrayList.size();
        if (this.G == null) {
            arrayList.add(x71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(x71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.G.title, null));
        }
        if (this.H) {
            arrayList.add(x71.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.I) {
            arrayList.add(x71.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.s;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(x71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.m8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        } else {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.s;
            int size = arrayList4.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList4.get(i13);
                i13++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(x71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.w41.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z10 = UserConfig.getActivatedAccountsCount() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = lg1.a;
            org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(lg1.class);
            J.d = 10;
            J.k = i14;
            J.l = string2;
            J.m = null;
            J.z = 0;
            J.q = true;
            arrayList.add(J);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                th.p(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int intValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = v71.a;
                org.telegram.ui.Components.w41 J2 = org.telegram.ui.Components.w41.J(v71.class);
                J2.d = i16;
                J2.z = intValue;
                arrayList.add(J2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.w41.B(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.w41.B(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new fg1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = lg1.a;
        org.telegram.ui.Components.w41 J3 = org.telegram.ui.Components.w41.J(lg1.class);
        J3.d = 11;
        J3.k = i18;
        J3.l = string3;
        J3.m = null;
        J3.z = 0;
        J3.r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.w41.A(-4, null));
    }

    @Override // org.telegram.ui.Components.p51
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.p51
    public final void W(org.telegram.ui.Components.w41 w41Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (w41Var.d == 10) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!UserConfig.getInstance(i11).isClientActivated()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                presentFragment(new fg0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new cg.v0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (w41Var.G(v71.class)) {
            int i12 = w41Var.z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = w41Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.F;
            showDialog(org.telegram.ui.Components.c5.m(parentActivity, string, string2, tL_birthday, new gg1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.F = null;
            org.telegram.ui.Components.o51 o51Var = this.x;
            if (o51Var != null) {
                o51Var.U2.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.G;
            long j10 = chat == null ? 0L : chat.id;
            gg1 gg1Var = new gg1(this, 1);
            kg1 kg1Var = new kg1();
            kg1Var.r = false;
            ig1 ig1Var = this.J;
            kg1Var.d = ig1Var;
            kg1Var.e = j10;
            kg1Var.f = gg1Var;
            jg1 jg1Var = new jg1(kg1Var, 1);
            if (ig1Var.c) {
                jg1Var.run();
            } else {
                ig1Var.f.add(jg1Var);
            }
            presentFragment(kg1Var);
            return;
        }
        if (i13 == 5) {
            presentFragment(new sf.v0());
            return;
        }
        if (i13 == 4) {
            presentFragment(new sf.x0());
            return;
        }
        if (i13 == 6) {
            presentFragment(new sf.l0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new i(3));
        } else if (i13 == 8) {
            presentFragment(new la(null));
        } else if (i13 == 11) {
            presentFragment(new hg0(null));
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean X(org.telegram.ui.Components.w41 w41Var, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(boolean z10) {
        boolean z11;
        if (this.w == null) {
            return;
        }
        String str = this.A;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.d.getText().toString())) {
            String str2 = this.B;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.e.getText().toString())) {
                String str3 = this.C;
                if (TextUtils.equals(str3 != null ? str3 : "", this.f.getText().toString()) && a0(this.D, this.F)) {
                    long j10 = this.E;
                    TLRPC.Chat chat = this.G;
                    if (j10 == (chat != null ? chat.id : 0L)) {
                        z11 = false;
                        this.w.setEnabled(z11);
                        if (!z10) {
                            this.w.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.0f).scaleY(z11 ? 1.0f : 0.0f).setDuration(180L).start();
                            return;
                        }
                        this.w.setAlpha(z11 ? 1.0f : 0.0f);
                        this.w.setScaleX(z11 ? 1.0f : 0.0f);
                        this.w.setScaleY(z11 ? 1.0f : 0.0f);
                        return;
                    }
                }
            }
        }
        z11 = true;
        this.w.setEnabled(z11);
        if (!z10) {
        }
    }

    public final void c0(boolean z10) {
        if (this.v.c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                hg1 hg1Var = this.d;
                int i10 = -this.M;
                this.M = i10;
                AndroidUtilities.shakeViewSpring(hg1Var, i10);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.A, this.d.getText().toString()) || !TextUtils.equals(this.B, this.e.getText().toString()) || !TextUtils.equals(this.C, this.f.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.d.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.e.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.f.getText().toString();
                    userFull.about = charSequence3;
                    updateprofile.about = charSequence3;
                    userFull.flags = TextUtils.isEmpty(charSequence3) ? userFull.flags & (-3) : userFull.flags | 2;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!a0(this.D, this.F)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.F;
                    if (tL_birthday2 != null) {
                        userFull.flags2 |= 32;
                        userFull.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        userFull.flags2 &= -33;
                        userFull.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().invalidateContentSettings();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                }
                long j10 = this.E;
                TLRPC.Chat chat = this.G;
                if (j10 != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.G);
                    TLRPC.Chat chat2 = this.G;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j11 = userFull.personal_channel_id;
                        long j12 = chat2.id;
                        if (j11 != j12) {
                            userFull.personal_channel_message = 0;
                        }
                        userFull.personal_channel_id = j12;
                    } else {
                        userFull.flags &= -65;
                        userFull.personal_channel_message = 0;
                        userFull.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    getConnectionsManager().sendRequest(tLObject, new eg.j0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        hg1 hg1Var = new hg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = hg1Var;
        hg1Var.setDivider(true);
        hg1 hg1Var2 = this.d;
        hg1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(hg1Var2, 4);
        org.telegram.ui.Cells.e3 e3Var = hg1Var2.b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        hg1 hg1Var3 = new hg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.e = hg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(hg1Var3, 4);
        org.telegram.ui.Cells.e3 e3Var2 = hg1Var3.b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        hg1 hg1Var4 = new hg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f = hg1Var4;
        hg1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new fg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.o51 o51Var = this.a;
        this.x = o51Var;
        o51Var.p1();
        this.x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.x);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 24));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.k51 k51Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.User user = userFull.user;
        if (user == null) {
            user = getUserConfig().getCurrentUser();
        }
        if (user == null) {
            return;
        }
        hg1 hg1Var = this.d;
        String str = user.first_name;
        this.A = str;
        hg1Var.setText(str);
        hg1 hg1Var2 = this.e;
        String str2 = user.last_name;
        this.B = str2;
        hg1Var2.setText(str2);
        hg1 hg1Var3 = this.f;
        String str3 = userFull.about;
        this.C = str3;
        hg1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.D = tL_birthday;
        this.F = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.E = userFull.personal_channel_id;
            this.G = getMessagesController().getChat(Long.valueOf(this.E));
        } else {
            this.E = 0L;
            this.G = null;
        }
        this.H = userFull.business_work_hours != null;
        this.I = userFull.business_location != null;
        b0(true);
        org.telegram.ui.Components.o51 o51Var = this.x;
        if (o51Var != null && (k51Var = o51Var.U2) != null) {
            k51Var.N(true);
        }
        this.K = true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.o51 o51Var = this.x;
            if (o51Var != null) {
                o51Var.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.o51 o51Var2 = this.x;
            if (o51Var2 != null) {
                o51Var2.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = sf.g.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.s = arrayList;
            org.telegram.ui.Components.o51 o51Var3 = this.x;
            if (o51Var3 != null) {
                o51Var3.U2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.o51 o51Var;
        int i10 = this.h;
        hg1 hg1Var = this.f;
        int i11 = 0;
        if (hg1Var == null || TextUtils.isEmpty(hg1Var.getText())) {
            this.n = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.h = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.n = LocaleController.getString(R.string.Loading);
                this.h = Objects.hash(1);
            } else {
                int i12 = -1;
                char c3 = 65535;
                int i13 = 0;
                int i14 = 0;
                boolean z10 = false;
                for (int i15 = 0; i15 < privacyRules.size(); i15++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i15);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i16));
                            if (chat != null) {
                                i14 = Math.max(0, chat.participants_count - 1) + i14;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i17));
                            if (chat2 != null) {
                                i13 = Math.max(0, chat2.participants_count - 1) + i13;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        i14 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        i13 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z11 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z11) {
                            boolean z12 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z12 || z10) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c3 = 2;
                                    z10 = true;
                                } else if (c3 == 65535) {
                                    if (!z11) {
                                        if (!z12 || z10) {
                                            c3 = 2;
                                        }
                                    }
                                }
                            }
                            c3 = 1;
                        }
                        c3 = 0;
                    }
                }
                if (c3 == 0 || (c3 == 65535 && i13 > 0)) {
                    i12 = 0;
                } else if (c3 == 2 || (c3 == 65535 && i13 > 0 && i14 > 0)) {
                    i12 = 2;
                } else if (c3 == 1 || (c3 == 65535 && i14 > 0)) {
                    i12 = 1;
                }
                if (i12 == 0) {
                    if (i13 <= 0) {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new fg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new fg1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String k9 = i14 > 0 ? j7.l1.k(i14, "+") : "";
                        if (i13 > 0) {
                            if (k9.length() > 0) {
                                k9 = k9.concat(", ");
                            }
                            k9 = k9 + "-" + i13;
                        }
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, k9), new fg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new fg1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new fg1(this, i11));
                } else if (i14 <= 0) {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new fg1(this, i11)), true);
                } else {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new fg1(this, i11)), true);
                }
                this.h = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.h || (o51Var = this.x) == null) {
            return;
        }
        o51Var.U2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        sf.g.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.L) {
            return;
        }
        c0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.x.setPadding(0, 0, 0, i13);
        this.x.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ig1 ig1Var = this.J;
        ig1Var.c = false;
        ig1Var.f.add(new fg1(this, 1));
        if (!ig1Var.c && !ig1Var.d) {
            ig1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = ig1Var.b;
            ConnectionsManager.getInstance(ig1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new o(ig1Var, 23));
        }
        this.r = null;
        org.telegram.ui.Components.o51 o51Var = this.x;
        if (o51Var != null) {
            o51Var.U2.N(true);
        }
    }
}
