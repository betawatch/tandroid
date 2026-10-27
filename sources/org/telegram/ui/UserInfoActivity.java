package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.n71 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public String F;
    public String G;
    public TL_account.TL_birthday H;
    public long I;
    public TL_account.TL_birthday J;
    public TLRPC.Chat K;
    public boolean L;
    public boolean M;
    public boolean O;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public kg1 e;
    public kg1 f;
    public int firstNameRow;
    public kg1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public CharSequence s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.u5 w;
    public org.telegram.ui.Components.m71 x;
    public int n = TLObject.FLAG_31;
    public ArrayList v = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final lg1 N = new lg1(this.currentAccount);
    public boolean P = false;
    public int Q = -4;

    public static void Z(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.w.b(false);
                org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(userInfoActivity), null);
                return;
            }
            userInfoActivity.P = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.w.b(false);
        boolean z10 = tLObject instanceof TL_account.updateBirthday;
        if (!z10 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.wc.e0(tL_error);
        } else if (userInfoActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
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

    public static String a0(TL_account.TL_birthday tL_birthday) {
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

    public static boolean b0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // org.telegram.ui.Components.n71
    public final void V(ArrayList arrayList, org.telegram.ui.Components.k71 k71Var) {
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
        Collections.sort(arrayList2, new dv(12));
        arrayList.add(org.telegram.ui.Components.u61.u(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.u61.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.u61.k(this.f));
        arrayList.add(org.telegram.ui.Components.u61.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.u61.k(this.h));
        arrayList.add(org.telegram.ui.Components.u61.C(this.r));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        ic.a.p(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(b81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.wh.g(new StringBuilder("+"), currentUser.phone, kf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(b81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(b81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.J;
        if (tL_birthday != null) {
            arrayList.add(b81.a(9, -14899731, -15431455, R.drawable.filled_birthday, a0(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(b81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        int i11 = 2;
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.s == null) {
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
            this.s = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new ig1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.u61.C(this.s));
        this.channelRow = arrayList.size();
        if (this.K == null) {
            arrayList.add(b81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(b81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.K.title, null));
        }
        if (this.L) {
            arrayList.add(b81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.M) {
            arrayList.add(b81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(b81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.v8.b(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        } else {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.v;
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
            arrayList.add(b81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.u61.B(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z10 = UserConfig.getActivatedAccountsCount() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = mg1.a;
            org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(mg1.class);
            K.d = 10;
            K.k = i14;
            K.l = string2;
            K.m = null;
            K.z = 0;
            K.q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                ic.a.p(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int intValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = z71.a;
                org.telegram.ui.Components.u61 K2 = org.telegram.ui.Components.u61.K(z71.class);
                K2.d = i16;
                K2.z = intValue;
                arrayList.add(K2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.u61.C(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.u61.C(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new ig1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = mg1.a;
        org.telegram.ui.Components.u61 K3 = org.telegram.ui.Components.u61.K(mg1.class);
        K3.d = 11;
        K3.k = i18;
        K3.l = string3;
        K3.m = null;
        K3.z = 0;
        K3.r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.u61.B(-4, null));
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(org.telegram.ui.Components.u61 u61Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (u61Var.d == 10) {
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
                presentFragment(new ig0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new tg.j0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (u61Var.H(z71.class)) {
            int i12 = u61Var.z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i12);
                return;
            }
            return;
        }
        int i13 = u61Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.J;
            showDialog(org.telegram.ui.Components.g5.l(parentActivity, string, string2, tL_birthday, new jg1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.J = null;
            org.telegram.ui.Components.m71 m71Var = this.x;
            if (m71Var != null) {
                m71Var.g3.O(true);
            }
            c0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.K;
            presentFragment(new or(this.N, chat == null ? 0L : chat.id, new jg1(this, 1)));
            return;
        }
        if (i13 == 5) {
            presentFragment(new jg.d1());
            return;
        }
        if (i13 == 4) {
            presentFragment(new jg.h1());
            return;
        }
        if (i13 == 6) {
            presentFragment(new jg.t0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new g(3));
        } else if (i13 == 8) {
            presentFragment(new ta(null));
        } else if (i13 == 11) {
            presentFragment(new lg0(null));
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(org.telegram.ui.Components.u61 u61Var, View view) {
        return false;
    }

    public final void c0(boolean z10) {
        boolean z11;
        if (this.w == null) {
            return;
        }
        String str = this.E;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.e.getText().toString())) {
            String str2 = this.F;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.f.getText().toString())) {
                String str3 = this.G;
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && b0(this.H, this.J)) {
                    long j10 = this.I;
                    TLRPC.Chat chat = this.K;
                    if (j10 == (chat != null ? chat.id : 0L)) {
                        z11 = false;
                        this.w.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.w.a(z11, z10);
    }

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        kg1 kg1Var = new kg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.e = kg1Var;
        kg1Var.setDivider(true);
        kg1 kg1Var2 = this.e;
        kg1Var2.getClass();
        kg1Var2.d(new org.telegram.ui.Cells.g(kg1Var2, 4));
        kg1 kg1Var3 = new kg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f = kg1Var3;
        kg1Var3.d(new org.telegram.ui.Cells.g(kg1Var3, 4));
        kg1 kg1Var4 = new kg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.h = kg1Var4;
        kg1Var4.setShowLimitWhenEmpty(true);
        f0();
        this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new ig1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.m71 m71Var = this.a;
        this.x = m71Var;
        m71Var.u1();
        this.x.setSectionsDrawBackground(true);
        this.x.setClipToPadding(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 14));
        this.w = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        c0(false);
        e0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        if (!this.w.x.f) {
            if (z10 && TextUtils.isEmpty(this.e.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                kg1 kg1Var = this.e;
                int i10 = -this.Q;
                this.Q = i10;
                AndroidUtilities.shakeViewSpring(kg1Var, i10);
                return;
            }
            this.w.b(true);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.E, this.e.getText().toString()) || !TextUtils.equals(this.F, this.f.getText().toString()) || !TextUtils.equals(this.G, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.e.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    userFull.about = charSequence3;
                    updateprofile.about = charSequence3;
                    userFull.flags = TextUtils.isEmpty(charSequence3) ? userFull.flags & (-3) : userFull.flags | 2;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!b0(this.H, this.J)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.J;
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
                long j10 = this.I;
                TLRPC.Chat chat = this.K;
                if (j10 != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.K);
                    TLRPC.Chat chat2 = this.K;
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
                    getConnectionsManager().sendRequest(tLObject, new bi.b8(this, tLObject, tL_birthday, userFull, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.m71 m71Var = this.x;
            if (m71Var != null) {
                m71Var.g3.O(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            f0();
            org.telegram.ui.Components.m71 m71Var2 = this.x;
            if (m71Var2 != null) {
                m71Var2.g3.O(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = jg.f.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.v = arrayList;
            org.telegram.ui.Components.m71 m71Var3 = this.x;
            if (m71Var3 != null) {
                m71Var3.g3.O(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.k71 k71Var;
        if (this.O) {
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
        kg1 kg1Var = this.e;
        String str = user.first_name;
        this.E = str;
        kg1Var.setText(str);
        kg1 kg1Var2 = this.f;
        String str2 = user.last_name;
        this.F = str2;
        kg1Var2.setText(str2);
        kg1 kg1Var3 = this.h;
        String str3 = userFull.about;
        this.G = str3;
        kg1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.H = tL_birthday;
        this.J = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.I = userFull.personal_channel_id;
            this.K = getMessagesController().getChat(Long.valueOf(this.I));
        } else {
            this.I = 0L;
            this.K = null;
        }
        this.L = userFull.business_work_hours != null;
        this.M = userFull.business_location != null;
        c0(true);
        org.telegram.ui.Components.m71 m71Var = this.x;
        if (m71Var != null && (k71Var = m71Var.g3) != null) {
            k71Var.O(true);
        }
        this.O = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
    
        if (r9 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        org.telegram.ui.Components.m71 m71Var;
        int i10 = this.n;
        kg1 kg1Var = this.h;
        int i11 = 0;
        if (kg1Var == null || TextUtils.isEmpty(kg1Var.getText())) {
            this.r = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.n = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.r = LocaleController.getString(R.string.Loading);
                this.n = Objects.hash(1);
            } else {
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                boolean z10 = false;
                char c10 = 65535;
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
                                    z10 = true;
                                } else if (c10 == 65535) {
                                    if (!z11) {
                                        if (z12) {
                                        }
                                    }
                                }
                                c10 = 2;
                            }
                            c10 = 1;
                        }
                        c10 = 0;
                    }
                }
                if (c10 == 0 || (c10 == 65535 && i13 > 0)) {
                    i12 = 0;
                } else if (c10 == 2 || (c10 == 65535 && i13 > 0 && i14 > 0)) {
                    i12 = 2;
                } else if (c10 == 1 || (c10 == 65535 && i14 > 0)) {
                    i12 = 1;
                }
                if (i12 == 0) {
                    if (i13 <= 0) {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new ig1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new ig1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String i18 = i14 > 0 ? ic.a.i(i14, "+") : "";
                        if (i13 > 0) {
                            if (i18.length() > 0) {
                                i18 = i18.concat(", ");
                            }
                            i18 = i18 + "-" + i13;
                        }
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, i18), new ig1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new ig1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new ig1(this, i11));
                } else if (i14 <= 0) {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new ig1(this, i11)), true);
                } else {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new ig1(this, i11)), true);
                }
                this.n = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.n || (m71Var = this.x) == null) {
            return;
        }
        m71Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        jg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.P) {
            return;
        }
        d0(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        lg1 lg1Var = this.N;
        lg1Var.c = false;
        lg1Var.f.add(new ig1(this, 1));
        if (!lg1Var.c && !lg1Var.d) {
            lg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = lg1Var.b;
            ConnectionsManager.getInstance(lg1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new l(lg1Var, 24));
        }
        this.s = null;
        org.telegram.ui.Components.m71 m71Var = this.x;
        if (m71Var != null) {
            m71Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
