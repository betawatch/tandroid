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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.c61 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public String C;
    public String D;
    public TL_account.TL_birthday E;
    public long F;
    public TL_account.TL_birthday G;
    public TLRPC.Chat H;
    public boolean I;
    public boolean J;
    public boolean L;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public vg1 d;
    public vg1 e;
    public vg1 f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence n;
    public int numberRow;
    public CharSequence r;
    public int usernameRow;
    public org.telegram.ui.Components.or v;
    public org.telegram.ui.ActionBar.w0 w;
    public org.telegram.ui.Components.b61 x;
    public int h = TLObject.FLAG_31;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final wg1 K = new wg1(this.currentAccount);
    public boolean M = false;
    public int N = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.v.a(0.0f);
                org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(userInfoActivity), null);
                return;
            }
            userInfoActivity.M = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.v.a(0.0f);
        boolean z4 = tLObject instanceof TL_account.updateBirthday;
        if (!z4 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.qc.b0(tL_error);
        } else if (userInfoActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            userInfoActivity.showDialog(alertDialog$Builder.a);
        }
        if (z4) {
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

    @Override // org.telegram.ui.Components.c61
    public final void U(ArrayList arrayList, org.telegram.ui.Components.x51 x51Var) {
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
        Collections.sort(arrayList2, new du(12));
        arrayList.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.j51.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.j51.k(this.e));
        arrayList.add(org.telegram.ui.Components.j51.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.j51.k(this.f));
        arrayList.add(org.telegram.ui.Components.j51.B(this.n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        yh.r(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(l81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.y3.j(new StringBuilder("+"), currentUser.phone, se.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(l81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(l81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.G;
        if (tL_birthday != null) {
            arrayList.add(l81.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(l81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
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
            this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new tg1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.j51.B(this.r));
        this.channelRow = arrayList.size();
        if (this.H == null) {
            arrayList.add(l81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(l81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.H.title, null));
        }
        if (this.I) {
            arrayList.add(l81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.J) {
            arrayList.add(l81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.s;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(l81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.o8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList4 = this.s;
            int size = arrayList4.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList4.get(i13);
                i13++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(l81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb, null));
        }
        arrayList.add(org.telegram.ui.Components.j51.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z4 = UserConfig.getActivatedAccountsCount() < 4;
        if (z4) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = zg1.a;
            org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(zg1.class);
            J.d = 10;
            J.k = i14;
            J.l = string2;
            J.m = null;
            J.z = 0;
            J.q = true;
            arrayList.add(J);
        }
        if (!arrayList2.isEmpty()) {
            if (!z4) {
                yh.r(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int intValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = j81.a;
                org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(j81.class);
                J2.d = i16;
                J2.z = intValue;
                arrayList.add(J2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.j51.B(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.j51.B(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new tg1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = zg1.a;
        org.telegram.ui.Components.j51 J3 = org.telegram.ui.Components.j51.J(zg1.class);
        J3.d = 11;
        J3.k = i18;
        J3.l = string3;
        J3.m = null;
        J3.z = 0;
        J3.r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.j51.A(-4, null));
    }

    @Override // org.telegram.ui.Components.c61
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.c61
    public final void W(org.telegram.ui.Components.j51 j51Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (j51Var.d == 10) {
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
                presentFragment(new og0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new fg.v0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (j51Var.G(j81.class)) {
            int i12 = j51Var.z;
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = j51Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.G;
            showDialog(org.telegram.ui.Components.z4.m(parentActivity, string, string2, tL_birthday, new ug1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.G = null;
            org.telegram.ui.Components.b61 b61Var = this.x;
            if (b61Var != null) {
                b61Var.V2.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.H;
            long j10 = chat == null ? 0L : chat.id;
            ug1 ug1Var = new ug1(this, 1);
            yg1 yg1Var = new yg1();
            yg1Var.r = false;
            wg1 wg1Var = this.K;
            yg1Var.d = wg1Var;
            yg1Var.e = j10;
            yg1Var.f = ug1Var;
            xg1 xg1Var = new xg1(yg1Var, 1);
            if (wg1Var.c) {
                xg1Var.run();
            } else {
                wg1Var.f.add(xg1Var);
            }
            presentFragment(yg1Var);
            return;
        }
        if (i13 == 5) {
            presentFragment(new vf.v0());
            return;
        }
        if (i13 == 4) {
            presentFragment(new vf.x0());
            return;
        }
        if (i13 == 6) {
            presentFragment(new vf.l0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new i(3));
        } else if (i13 == 8) {
            presentFragment(new pa(null));
        } else if (i13 == 11) {
            presentFragment(new qg0(null));
        }
    }

    @Override // org.telegram.ui.Components.c61
    public final boolean X(org.telegram.ui.Components.j51 j51Var, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(boolean z4) {
        boolean z10;
        if (this.w == null) {
            return;
        }
        String str = this.B;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.d.getText().toString())) {
            String str2 = this.C;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.e.getText().toString())) {
                String str3 = this.D;
                if (TextUtils.equals(str3 != null ? str3 : "", this.f.getText().toString()) && a0(this.E, this.G)) {
                    long j10 = this.F;
                    TLRPC.Chat chat = this.H;
                    if (j10 == (chat != null ? chat.id : 0L)) {
                        z10 = false;
                        this.w.setEnabled(z10);
                        if (!z4) {
                            this.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.0f).scaleY(z10 ? 1.0f : 0.0f).setDuration(180L).start();
                            return;
                        }
                        this.w.setAlpha(z10 ? 1.0f : 0.0f);
                        this.w.setScaleX(z10 ? 1.0f : 0.0f);
                        this.w.setScaleY(z10 ? 1.0f : 0.0f);
                        return;
                    }
                }
            }
        }
        z10 = true;
        this.w.setEnabled(z10);
        if (!z4) {
        }
    }

    public final void c0(boolean z4) {
        if (this.v.c <= 0.0f) {
            if (z4 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                vg1 vg1Var = this.d;
                int i10 = -this.N;
                this.N = i10;
                AndroidUtilities.shakeViewSpring(vg1Var, i10);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.B, this.d.getText().toString()) || !TextUtils.equals(this.C, this.e.getText().toString()) || !TextUtils.equals(this.D, this.f.getText().toString()))) {
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
                if (!a0(this.E, this.G)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.G;
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
                long j10 = this.F;
                TLRPC.Chat chat = this.H;
                if (j10 != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.H);
                    TLRPC.Chat chat2 = this.H;
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
                    getConnectionsManager().sendRequest(tLObject, new hg.i0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.ui.Components.c61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        vg1 vg1Var = new vg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = vg1Var;
        vg1Var.setDivider(true);
        vg1 vg1Var2 = this.d;
        vg1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(vg1Var2, 4);
        org.telegram.ui.Cells.g3 g3Var = vg1Var2.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
        vg1 vg1Var3 = new vg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.e = vg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(vg1Var3, 4);
        org.telegram.ui.Cells.g3 g3Var2 = vg1Var3.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(gVar2, 2));
        vg1 vg1Var4 = new vg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f = vg1Var4;
        vg1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new tg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.b61 b61Var = this.a;
        this.x = b61Var;
        b61Var.p1();
        this.x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.x);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 24));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        this.w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.x51 x51Var;
        if (this.L) {
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
        vg1 vg1Var = this.d;
        String str = user.first_name;
        this.B = str;
        vg1Var.setText(str);
        vg1 vg1Var2 = this.e;
        String str2 = user.last_name;
        this.C = str2;
        vg1Var2.setText(str2);
        vg1 vg1Var3 = this.f;
        String str3 = userFull.about;
        this.D = str3;
        vg1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.E = tL_birthday;
        this.G = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.F = userFull.personal_channel_id;
            this.H = getMessagesController().getChat(Long.valueOf(this.F));
        } else {
            this.F = 0L;
            this.H = null;
        }
        this.I = userFull.business_work_hours != null;
        this.J = userFull.business_location != null;
        b0(true);
        org.telegram.ui.Components.b61 b61Var = this.x;
        if (b61Var != null && (x51Var = b61Var.V2) != null) {
            x51Var.N(true);
        }
        this.L = true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.b61 b61Var = this.x;
            if (b61Var != null) {
                b61Var.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.b61 b61Var2 = this.x;
            if (b61Var2 != null) {
                b61Var2.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = vf.f.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.s = arrayList;
            org.telegram.ui.Components.b61 b61Var3 = this.x;
            if (b61Var3 != null) {
                b61Var3.V2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.b61 b61Var;
        int i10 = this.h;
        vg1 vg1Var = this.f;
        int i11 = 0;
        if (vg1Var == null || TextUtils.isEmpty(vg1Var.getText())) {
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
                boolean z4 = false;
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
                        boolean z10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z10) {
                            boolean z11 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z11 || z4) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c3 = 2;
                                    z4 = true;
                                } else if (c3 == 65535) {
                                    if (!z10) {
                                        if (!z11 || z4) {
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
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new tg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new tg1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String j10 = i14 > 0 ? l.d.j(i14, "+") : "";
                        if (i13 > 0) {
                            if (j10.length() > 0) {
                                j10 = j10.concat(", ");
                            }
                            j10 = j10 + "-" + i13;
                        }
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, j10), new tg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new tg1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new tg1(this, i11));
                } else if (i14 <= 0) {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new tg1(this, i11)), true);
                } else {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new tg1(this, i11)), true);
                }
                this.h = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.h || (b61Var = this.x) == null) {
            return;
        }
        b61Var.V2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        vf.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.M) {
            return;
        }
        c0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.x.setPadding(0, 0, 0, i13);
        this.x.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        wg1 wg1Var = this.K;
        wg1Var.c = false;
        wg1Var.f.add(new tg1(this, 1));
        if (!wg1Var.c && !wg1Var.d) {
            wg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = wg1Var.b;
            ConnectionsManager.getInstance(wg1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new o(wg1Var, 23));
        }
        this.r = null;
        org.telegram.ui.Components.b61 b61Var = this.x;
        if (b61Var != null) {
            b61Var.V2.N(true);
        }
    }
}
