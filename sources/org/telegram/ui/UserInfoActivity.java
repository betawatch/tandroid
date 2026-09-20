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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.n61 implements NotificationCenter.NotificationCenterDelegate {
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
    public oh1 e;
    public oh1 f;
    public int firstNameRow;
    public oh1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public CharSequence s;
    public int usernameRow;
    public org.telegram.ui.Components.pr w;
    public org.telegram.ui.ActionBar.v0 x;
    public org.telegram.ui.Components.m61 y;
    public int n = TLObject.FLAG_31;
    public ArrayList v = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ph1 O = new ph1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.w.a(0.0f);
                org.telegram.messenger.rk.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(userInfoActivity), null);
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
            org.telegram.ui.Components.xc.b0(tL_error);
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

    @Override // org.telegram.ui.Components.n61
    public final void U(ArrayList arrayList, org.telegram.ui.Components.k61 k61Var) {
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
        Collections.sort(arrayList2, new mb1(1));
        arrayList.add(org.telegram.ui.Components.w51.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w51.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w51.k(this.f));
        arrayList.add(org.telegram.ui.Components.w51.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.w51.k(this.h));
        arrayList.add(org.telegram.ui.Components.w51.B(this.r));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        com.google.android.gms.internal.vision.e2.n(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(e91.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.rk.h(new StringBuilder("+"), currentUser.phone, gf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(e91.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(e91.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(e91.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(e91.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
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
            this.s = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new lh1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.w51.B(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(e91.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(e91.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(e91.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.N) {
            arrayList.add(e91.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(e91.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.s8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
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
            arrayList.add(e91.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.w51.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z10 = UserConfig.getActivatedAccountsCount() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = qh1.a;
            org.telegram.ui.Components.w51 J = org.telegram.ui.Components.w51.J(qh1.class);
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
                com.google.android.gms.internal.vision.e2.n(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int intValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = c91.a;
                org.telegram.ui.Components.w51 J2 = org.telegram.ui.Components.w51.J(c91.class);
                J2.d = i16;
                J2.z = intValue;
                arrayList.add(J2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.w51.B(null));
            } else {
                int max = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.w51.B(TextUtils.concat(max > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new lh1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = qh1.a;
        org.telegram.ui.Components.w51 J3 = org.telegram.ui.Components.w51.J(qh1.class);
        J3.d = 11;
        J3.k = i18;
        J3.l = string3;
        J3.m = null;
        J3.z = 0;
        J3.r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.w51.A(-4, null));
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override // org.telegram.ui.Components.n61
    public final void W(org.telegram.ui.Components.w51 w51Var, View view) {
        int i10 = 0;
        Integer num = null;
        if (w51Var.d == 10) {
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
                presentFragment(new yg0(num.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new rg.j0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (w51Var.G(c91.class)) {
            int i12 = w51Var.z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = w51Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.K;
            showDialog(org.telegram.ui.Components.d5.m(parentActivity, string, string2, tL_birthday, new nh1(this, 0), null, false, tL_birthday != null, getResourceProvider()).a);
            return;
        }
        if (i13 == 2) {
            this.K = null;
            org.telegram.ui.Components.m61 m61Var = this.y;
            if (m61Var != null) {
                m61Var.Y2.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.L;
            presentFragment(new ur(this.O, chat == null ? 0L : chat.id, new nh1(this, 1)));
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
            presentFragment(new ra(null));
        } else if (i13 == 11) {
            presentFragment(new ah0(null));
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean X(org.telegram.ui.Components.w51 w51Var, View view) {
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
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && a0(this.I, this.K)) {
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
                oh1 oh1Var = this.e;
                int i10 = -this.R;
                this.R = i10;
                AndroidUtilities.shakeViewSpring(oh1Var, i10);
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
                if (!a0(this.I, this.K)) {
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
                    getConnectionsManager().sendRequest(tLObject, new mh1(this, tLObject, tL_birthday, userFull, iArr, arrayList, 0), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override // org.telegram.ui.Components.n61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        oh1 oh1Var = new oh1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.e = oh1Var;
        oh1Var.setDivider(true);
        oh1 oh1Var2 = this.e;
        oh1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(oh1Var2, 4);
        org.telegram.ui.Cells.i3 i3Var = oh1Var2.b;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        oh1 oh1Var3 = new oh1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f = oh1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(oh1Var3, 4);
        org.telegram.ui.Cells.i3 i3Var2 = oh1Var3.b;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        oh1 oh1Var4 = new oh1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.h = oh1Var4;
        oh1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new lh1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.m61 m61Var = this.a;
        this.y = m61Var;
        m61Var.q1();
        this.y.setClipToPadding(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.w = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.x = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.w);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.k61 k61Var;
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
        oh1 oh1Var = this.e;
        String str = user.first_name;
        this.F = str;
        oh1Var.setText(str);
        oh1 oh1Var2 = this.f;
        String str2 = user.last_name;
        this.G = str2;
        oh1Var2.setText(str2);
        oh1 oh1Var3 = this.h;
        String str3 = userFull.about;
        this.H = str3;
        oh1Var3.setText(str3);
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
        org.telegram.ui.Components.m61 m61Var = this.y;
        if (m61Var != null && (k61Var = m61Var.Y2) != null) {
            k61Var.N(true);
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
            org.telegram.ui.Components.m61 m61Var = this.y;
            if (m61Var != null) {
                m61Var.Y2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.m61 m61Var2 = this.y;
            if (m61Var2 != null) {
                m61Var2.Y2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = hg.f.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.v = arrayList;
            org.telegram.ui.Components.m61 m61Var3 = this.y;
            if (m61Var3 != null) {
                m61Var3.Y2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.m61 m61Var;
        int i10 = this.n;
        oh1 oh1Var = this.h;
        int i11 = 0;
        if (oh1Var == null || TextUtils.isEmpty(oh1Var.getText())) {
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
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new lh1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i13)), new lh1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (i13 > 0 || i14 > 0) {
                        String h = i14 > 0 ? hg.k0.h(i14, "+") : "";
                        if (i13 > 0) {
                            if (h.length() > 0) {
                                h = h.concat(", ");
                            }
                            h = h + "-" + i13;
                        }
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, h), new lh1(this, i11)), true);
                    } else {
                        this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new lh1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new lh1(this, i11));
                } else if (i14 <= 0) {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new lh1(this, i11)), true);
                } else {
                    this.r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i14)), new lh1(this, i11)), true);
                }
                this.n = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(i14), Integer.valueOf(i13));
            }
        }
        if (i10 == this.n || (m61Var = this.y) == null) {
            return;
        }
        m61Var.Y2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
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
        hg.f.a(this.currentAccount).c(null);
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
        ph1 ph1Var = this.O;
        ph1Var.c = false;
        ph1Var.f.add(new lh1(this, 1));
        if (!ph1Var.c && !ph1Var.d) {
            ph1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = ph1Var.b;
            ConnectionsManager.getInstance(ph1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new m(ph1Var, 23));
        }
        this.s = null;
        org.telegram.ui.Components.m61 m61Var = this.y;
        if (m61Var != null) {
            m61Var.Y2.N(true);
        }
    }
}
