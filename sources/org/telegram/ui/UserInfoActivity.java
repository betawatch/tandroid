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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.z61 implements NotificationCenter.NotificationCenterDelegate {
    public String F;
    public String G;
    public String H;
    public TL_account.TL_birthday I;
    public long J;
    public TL_account.TL_birthday K;
    public TLRPC.Chat L;
    public boolean M;
    public boolean N;
    public boolean P;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public fh1 e;
    public fh1 f;
    public int firstNameRow;
    public fh1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public CharSequence s;
    public int usernameRow;
    public org.telegram.ui.Components.sr w;
    public org.telegram.ui.ActionBar.v0 x;
    public org.telegram.ui.Components.y61 y;
    public int n = TLObject.FLAG_31;
    public ArrayList v = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final gh1 O = new gh1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void X(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.w.a(0.0f);
                org.telegram.messenger.bi.o(R.string.UnknownError, org.telegram.ui.Components.yc.a0(userInfoActivity), null);
                return;
            }
            userInfoActivity.Q = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.w.a(0.0f);
        boolean z10 = tLObject instanceof TL_account.updateBirthday;
        if (!z10 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.yc.b0(tL_error);
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

    public static String Y(TL_account.TL_birthday tL_birthday) {
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

    public static boolean Z(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // org.telegram.ui.Components.z61
    public final void S(ArrayList arrayList, org.telegram.ui.Components.w61 w61Var) {
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new eb1(1));
        arrayList.add(org.telegram.ui.Components.h61.u(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.f));
        arrayList.add(org.telegram.ui.Components.h61.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.h));
        arrayList.add(org.telegram.ui.Components.h61.C(this.r));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        com.google.android.gms.internal.vision.e2.n(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(u81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.bi.g(new StringBuilder("+"), currentUser.phone, gf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(u81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(u81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(u81.a(9, -14899731, -15431455, R.drawable.filled_birthday, Y(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(u81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
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
            this.s = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new ch1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.h61.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(u81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(u81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(u81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.N) {
            arrayList.add(u81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(u81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.r8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
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
            arrayList.add(u81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.h61.B(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z10 = UserConfig.getActivatedAccountsCount() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = hh1.a;
            org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(hh1.class);
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
                com.google.android.gms.internal.vision.e2.n(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int intValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = s81.a;
                org.telegram.ui.Components.h61 K2 = org.telegram.ui.Components.h61.K(s81.class);
                K2.d = i16;
                K2.z = intValue;
                arrayList.add(K2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.h61.C(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.h61.C(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new ch1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = hh1.a;
        org.telegram.ui.Components.h61 K3 = org.telegram.ui.Components.h61.K(hh1.class);
        K3.d = 11;
        K3.k = i18;
        K3.l = string3;
        K3.m = null;
        K3.z = 0;
        K3.r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.h61.B(-4, null));
    }

    @Override // org.telegram.ui.Components.z61
    public final CharSequence T() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.z61
    public final void U(org.telegram.ui.Components.h61 h61Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (h61Var.d == 10) {
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
                presentFragment(new ug0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new rg.k0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (h61Var.H(s81.class)) {
            int i12 = h61Var.z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = h61Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.K;
            showDialog(org.telegram.ui.Components.e5.m(parentActivity, string, string2, tL_birthday, new eh1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.K = null;
            org.telegram.ui.Components.y61 y61Var = this.y;
            if (y61Var != null) {
                y61Var.f3.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.L;
            presentFragment(new tr(this.O, chat == null ? 0L : chat.id, new eh1(this, 1)));
            return;
        }
        if (i13 == 5) {
            presentFragment(new hg.e1());
            return;
        }
        if (i13 == 4) {
            presentFragment(new hg.g1());
            return;
        }
        if (i13 == 6) {
            presentFragment(new hg.u0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new h(3));
        } else if (i13 == 8) {
            presentFragment(new sa(null));
        } else if (i13 == 11) {
            presentFragment(new wg0(null));
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final boolean W(org.telegram.ui.Components.h61 h61Var, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(boolean z10) {
        boolean z11;
        if (this.x == null) {
            return;
        }
        String str = this.F;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.e.getText().toString())) {
            String str2 = this.G;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.f.getText().toString())) {
                String str3 = this.H;
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && Z(this.I, this.K)) {
                    long j3 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (j3 == (chat != null ? chat.id : 0L)) {
                        z11 = false;
                        this.x.setEnabled(z11);
                        if (!z10) {
                            this.x.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.0f).scaleY(z11 ? 1.0f : 0.0f).setDuration(180L).start();
                            return;
                        }
                        this.x.setAlpha(z11 ? 1.0f : 0.0f);
                        this.x.setScaleX(z11 ? 1.0f : 0.0f);
                        this.x.setScaleY(z11 ? 1.0f : 0.0f);
                        return;
                    }
                }
            }
        }
        z11 = true;
        this.x.setEnabled(z11);
        if (!z10) {
        }
    }

    public final void c0(boolean z10) {
        if (this.w.c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.e.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                fh1 fh1Var = this.e;
                int i10 = -this.R;
                this.R = i10;
                AndroidUtilities.shakeViewSpring(fh1Var, i10);
                return;
            }
            this.w.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.F, this.e.getText().toString()) || !TextUtils.equals(this.G, this.f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
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
                if (!Z(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
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
                long j3 = this.J;
                TLRPC.Chat chat = this.L;
                if (j3 != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j10 = userFull.personal_channel_id;
                        long j11 = chat2.id;
                        if (j10 != j11) {
                            userFull.personal_channel_message = 0;
                        }
                        userFull.personal_channel_id = j11;
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
                    getConnectionsManager().sendRequest(tLObject, new dh1(this, tLObject, tL_birthday, userFull, iArr, arrayList, 0), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.ui.Components.z61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        fh1 fh1Var = new fh1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.e = fh1Var;
        fh1Var.setDivider(true);
        fh1 fh1Var2 = this.e;
        fh1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(fh1Var2, 4);
        org.telegram.ui.Cells.h3 h3Var = fh1Var2.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        fh1 fh1Var3 = new fh1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f = fh1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(fh1Var3, 4);
        org.telegram.ui.Cells.h3 h3Var2 = fh1Var3.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        fh1 fh1Var4 = new fh1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.h = fh1Var4;
        fh1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new ch1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.y61 y61Var = this.a;
        this.y = y61Var;
        y61Var.r1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.w = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        this.x = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.w);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.w61 w61Var;
        if (this.P) {
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
        fh1 fh1Var = this.e;
        String str = user.first_name;
        this.F = str;
        fh1Var.setText(str);
        fh1 fh1Var2 = this.f;
        String str2 = user.last_name;
        this.G = str2;
        fh1Var2.setText(str2);
        fh1 fh1Var3 = this.h;
        String str3 = userFull.about;
        this.H = str3;
        fh1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.I = tL_birthday;
        this.K = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.J = userFull.personal_channel_id;
            this.L = getMessagesController().getChat(Long.valueOf(this.J));
        } else {
            this.J = 0L;
            this.L = null;
        }
        this.M = userFull.business_work_hours != null;
        this.N = userFull.business_location != null;
        b0(true);
        org.telegram.ui.Components.y61 y61Var = this.y;
        if (y61Var != null && (w61Var = y61Var.f3) != null) {
            w61Var.N(true);
        }
        this.P = true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.y61 y61Var = this.y;
            if (y61Var != null) {
                y61Var.f3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.y61 y61Var2 = this.y;
            if (y61Var2 != null) {
                y61Var2.f3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = hg.g.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.v = arrayList;
            org.telegram.ui.Components.y61 y61Var3 = this.y;
            if (y61Var3 != null) {
                y61Var3.f3.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.y61 y61Var;
        int i10 = this.n;
        fh1 fh1Var = this.h;
        int i11 = 0;
        if (fh1Var == null || TextUtils.isEmpty(fh1Var.getText())) {
            this.r = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.n = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.r = LocaleController.getString(R.string.Loading);
                this.n = Objects.hash(1);
            } else {
                int i12 = -1;
                char c10 = 65535;
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
                                    c10 = 2;
                                    z10 = true;
                                } else if (c10 == 65535) {
                                    if (!z11) {
                                        if (!z12 || z10) {
                                            c10 = 2;
                                        }
                                    }
                                }
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
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new ch1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new ch1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String h = i14 > 0 ? hg.c.h(i14, "+") : "";
                        if (i13 > 0) {
                            if (h.length() > 0) {
                                h = h.concat(", ");
                            }
                            h = h + "-" + i13;
                        }
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, h), new ch1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new ch1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new ch1(this, i11));
                } else if (i14 <= 0) {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new ch1(this, i11)), true);
                } else {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new ch1(this, i11)), true);
                }
                this.n = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.n || (y61Var = this.y) == null) {
            return;
        }
        y61Var.f3.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        hg.g.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.Q) {
            return;
        }
        c0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        gh1 gh1Var = this.O;
        gh1Var.c = false;
        gh1Var.f.add(new ch1(this, 1));
        if (!gh1Var.c && !gh1Var.d) {
            gh1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = gh1Var.b;
            ConnectionsManager.getInstance(gh1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new m(gh1Var, 23));
        }
        this.s = null;
        org.telegram.ui.Components.y61 y61Var = this.y;
        if (y61Var != null) {
            y61Var.f3.N(true);
        }
    }
}
