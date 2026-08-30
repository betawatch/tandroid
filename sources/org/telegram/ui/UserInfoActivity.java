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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.b61 implements NotificationCenter.NotificationCenterDelegate {
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
    public tg1 d;
    public tg1 e;
    public tg1 f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence n;
    public int numberRow;
    public CharSequence r;
    public int usernameRow;
    public org.telegram.ui.Components.mr v;
    public org.telegram.ui.ActionBar.w0 w;
    public org.telegram.ui.Components.a61 x;
    public int h = TLObject.FLAG_31;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ug1 K = new ug1(this.currentAccount);
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

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, org.telegram.ui.Components.w51 w51Var) {
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
        Collections.sort(arrayList2, new cu(12));
        arrayList.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.i51.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.i51.k(this.e));
        arrayList.add(org.telegram.ui.Components.i51.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.i51.k(this.f));
        arrayList.add(org.telegram.ui.Components.i51.B(this.n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        yh.r(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(k81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.y3.j(new StringBuilder("+"), currentUser.phone, se.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(k81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(k81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.G;
        if (tL_birthday != null) {
            arrayList.add(k81.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(k81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
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
            this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new rg1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.i51.B(this.r));
        this.channelRow = arrayList.size();
        if (this.H == null) {
            arrayList.add(k81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(k81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.H.title, null));
        }
        if (this.I) {
            arrayList.add(k81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.J) {
            arrayList.add(k81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.s;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(k81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.o8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
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
            arrayList.add(k81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb, null));
        }
        arrayList.add(org.telegram.ui.Components.i51.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z4 = UserConfig.getActivatedAccountsCount() < 4;
        if (z4) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = xg1.a;
            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(xg1.class);
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
                int i17 = i81.a;
                org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(i81.class);
                J2.d = i16;
                J2.z = intValue;
                arrayList.add(J2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.i51.B(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.i51.B(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new rg1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = xg1.a;
        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(xg1.class);
        J3.d = 11;
        J3.k = i18;
        J3.l = string3;
        J3.m = null;
        J3.z = 0;
        J3.r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.i51.A(-4, null));
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(org.telegram.ui.Components.i51 i51Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (i51Var.d == 10) {
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
                presentFragment(new ng0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new eg.v0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (i51Var.G(i81.class)) {
            int i12 = i51Var.z;
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = i51Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.G;
            showDialog(org.telegram.ui.Components.z4.m(parentActivity, string, string2, tL_birthday, new sg1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.G = null;
            org.telegram.ui.Components.a61 a61Var = this.x;
            if (a61Var != null) {
                a61Var.V2.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.H;
            long j10 = chat == null ? 0L : chat.id;
            sg1 sg1Var = new sg1(this, 1);
            wg1 wg1Var = new wg1();
            wg1Var.r = false;
            ug1 ug1Var = this.K;
            wg1Var.d = ug1Var;
            wg1Var.e = j10;
            wg1Var.f = sg1Var;
            vg1 vg1Var = new vg1(wg1Var, 1);
            if (ug1Var.c) {
                vg1Var.run();
            } else {
                ug1Var.f.add(vg1Var);
            }
            presentFragment(wg1Var);
            return;
        }
        if (i13 == 5) {
            presentFragment(new uf.u0());
            return;
        }
        if (i13 == 4) {
            presentFragment(new uf.x0());
            return;
        }
        if (i13 == 6) {
            presentFragment(new uf.k0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new i(3));
        } else if (i13 == 8) {
            presentFragment(new pa(null));
        } else if (i13 == 11) {
            presentFragment(new pg0(null));
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(org.telegram.ui.Components.i51 i51Var, View view) {
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
                tg1 tg1Var = this.d;
                int i10 = -this.N;
                this.N = i10;
                AndroidUtilities.shakeViewSpring(tg1Var, i10);
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
                    getConnectionsManager().sendRequest(tLObject, new gg.i0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        tg1 tg1Var = new tg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = tg1Var;
        tg1Var.setDivider(true);
        tg1 tg1Var2 = this.d;
        tg1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(tg1Var2, 4);
        org.telegram.ui.Cells.g3 g3Var = tg1Var2.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        tg1 tg1Var3 = new tg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.e = tg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(tg1Var3, 4);
        org.telegram.ui.Cells.g3 g3Var2 = tg1Var3.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        tg1 tg1Var4 = new tg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f = tg1Var4;
        tg1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new rg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.a61 a61Var = this.a;
        this.x = a61Var;
        a61Var.p1();
        this.x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.x);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 24));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.mr(mutate, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.w51 w51Var;
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
        tg1 tg1Var = this.d;
        String str = user.first_name;
        this.B = str;
        tg1Var.setText(str);
        tg1 tg1Var2 = this.e;
        String str2 = user.last_name;
        this.C = str2;
        tg1Var2.setText(str2);
        tg1 tg1Var3 = this.f;
        String str3 = userFull.about;
        this.D = str3;
        tg1Var3.setText(str3);
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
        org.telegram.ui.Components.a61 a61Var = this.x;
        if (a61Var != null && (w51Var = a61Var.V2) != null) {
            w51Var.N(true);
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
            org.telegram.ui.Components.a61 a61Var = this.x;
            if (a61Var != null) {
                a61Var.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.a61 a61Var2 = this.x;
            if (a61Var2 != null) {
                a61Var2.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = uf.f.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.s = arrayList;
            org.telegram.ui.Components.a61 a61Var3 = this.x;
            if (a61Var3 != null) {
                a61Var3.V2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.a61 a61Var;
        int i10 = this.h;
        tg1 tg1Var = this.f;
        int i11 = 0;
        if (tg1Var == null || TextUtils.isEmpty(tg1Var.getText())) {
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
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new rg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new rg1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String j10 = i14 > 0 ? kh.a2.j(i14, "+") : "";
                        if (i13 > 0) {
                            if (j10.length() > 0) {
                                j10 = j10.concat(", ");
                            }
                            j10 = j10 + "-" + i13;
                        }
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, j10), new rg1(this, i11)), true);
                    } else {
                        this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new rg1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new rg1(this, i11));
                } else if (i14 <= 0) {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new rg1(this, i11)), true);
                } else {
                    this.n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new rg1(this, i11)), true);
                }
                this.h = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.h || (a61Var = this.x) == null) {
            return;
        }
        a61Var.V2.N(true);
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
        uf.f.a(this.currentAccount).c(null);
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
        ug1 ug1Var = this.K;
        ug1Var.c = false;
        ug1Var.f.add(new rg1(this, 1));
        if (!ug1Var.c && !ug1Var.d) {
            ug1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = ug1Var.b;
            ConnectionsManager.getInstance(ug1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new o(ug1Var, 23));
        }
        this.r = null;
        org.telegram.ui.Components.a61 a61Var = this.x;
        if (a61Var != null) {
            a61Var.V2.N(true);
        }
    }
}
