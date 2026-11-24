package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class UserInfoActivity extends n7c implements jm7 {
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
    public c9c e;
    public c9c f;
    public int firstNameRow;
    public c9c h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public uja x;
    public va y;
    public int n = TLObject.FLAG_31;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final d9c O = new d9c(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static String d0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return jb6.D0().p0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return jb6.D0().n0().format(calendar2.getTimeInMillis());
    }

    public static boolean e0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // n7c
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        ArrayList arrayList2;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList3 = this.E;
        arrayList3.clear();
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o() && this.currentAccount != i) {
                arrayList3.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList3, new zua((byte) 10));
        arrayList.add(c6c.u(jb6.M0(2131751161, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(c6c.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(c6c.k(this.f));
        arrayList.add(c6c.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(c6c.k(this.h));
        arrayList.add(c6c.C(this.r));
        TLRPC.User f = getUserConfig().f();
        aq1.o(2131751270, null, arrayList);
        if (f != null) {
            this.numberRow = arrayList.size();
            arrayList.add(z9a.i(7, -11154873, -14175180, R.drawable.settings_calls, mlb.l(new StringBuilder("+"), f.phone, r58.f()), jb6.M0(2131743945, null), null));
        }
        this.usernameRow = arrayList.size();
        if (m9c.p(f) != null) {
            arrayList.add(z9a.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + m9c.p(f), jb6.M0(2131743361, null), null));
        } else {
            arrayList.add(z9a.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, jb6.M0(2131754360, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(z9a.i(9, -14899731, -15431455, R.drawable.filled_birthday, d0(tL_birthday), jb6.M0(2131751740, null), null));
        } else {
            arrayList.add(z9a.i(9, -14899731, -15431455, R.drawable.filled_birthday, jb6.M0(2131754461, null), null, null));
        }
        byte b = 2;
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = jb6.M0(2131751178, null);
            if (!v.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= v.size()) {
                        break;
                    }
                    if (v.get(i2) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = jb6.M0(2131751178, null);
                        break;
                    }
                    if ((v.get(i2) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i2) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        M0 = jb6.M0(2131751179, null);
                    }
                    i2++;
                }
            }
            this.s = gm.D2(gm.N2(M0, -1, 0, new a9c(this, b), null), true);
        }
        arrayList.add(c6c.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(z9a.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, jb6.M0(2131751168, null), null, jb6.M0(2131751173, null)));
        } else {
            arrayList.add(z9a.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, jb6.M0(2131751168, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(z9a.i(4, -881871, -1940716, R.drawable.filled_premium_hours, jb6.M0(2131751164, null), null, null));
        }
        if (this.N) {
            arrayList.add(z9a.i(5, -765355, -2148011, R.drawable.filled_location, jb6.M0(2131751162, null), null, null));
        }
        ArrayList arrayList4 = this.w;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            arrayList2 = arrayList3;
            arrayList.add(z9a.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, xib.b(jb6.M0(2131751167, null)), null, null));
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList5 = this.w;
            int size = arrayList5.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList5.get(i3);
                i3++;
                ArrayList arrayList6 = arrayList3;
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (W1 != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(m9c.r(W1));
                }
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList.add(z9a.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, jb6.M0(2131751167, null), sb, null));
        }
        arrayList.add(c6c.B(-3, jb6.M0(2131751166, null)));
        boolean z = z8c.c() < 4;
        if (z) {
            this.addAccountRow = arrayList.size();
            String M02 = jb6.M0(2131754481, null);
            int i4 = e9c.b;
            c6c K = c6c.K(e9c.class);
            K.d = 10;
            K.k = R.drawable.outline_add_account;
            K.m = M02;
            K.n = null;
            K.A = 0;
            K.r = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                aq1.o(2131745226, null, arrayList);
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                int intValue = ((Integer) arrayList2.get(i5)).intValue();
                int i6 = x9a.b;
                c6c K2 = c6c.K(x9a.class);
                K2.d = i5;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (z8c.n()) {
                arrayList.add(c6c.C(null));
            } else {
                byte b2 = 3;
                int max = Math.max(0, (z8c.n() ? 5 : 3) - z8c.c());
                arrayList.add(c6c.C(TextUtils.concat(max > 0 ? jb6.H(',', "AddAccountInfo1", max).concat(" ") : "", gm.N2(jb6.H(',', "AddAccountInfo2", z8c.n() ? 5 : 3), -1, 0, new a9c(this, b2), null))));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = jb6.M0(2131748500, null);
        int i7 = e9c.b;
        c6c K3 = c6c.K(e9c.class);
        K3.d = 11;
        K3.k = R.drawable.msg_leave;
        K3.m = M03;
        K3.n = null;
        K3.A = 0;
        K3.s = true;
        arrayList.add(K3);
        arrayList.add(c6c.B(-4, null));
    }

    @Override // n7c
    public final CharSequence a0() {
        return jb6.M0(2131751271, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n7c
    public final void b0(c6c c6cVar, View view) {
        int i = 0;
        Object[] objArr = 0;
        Integer num = null;
        if (c6cVar.d == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!z8c.h(i2).o()) {
                    i++;
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                }
            }
            if (!z8c.n()) {
                i--;
            }
            if (i > 0 && num != null) {
                presentFragment(new mh6(num.intValue()));
                return;
            } else {
                if (z8c.n()) {
                    return;
                }
                showDialog(new i46(7, this.currentAccount, null, getParentActivity(), this));
                return;
            }
        }
        if (c6cVar.H(x9a.class)) {
            int i3 = c6cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i3);
                return;
            }
            return;
        }
        int i4 = c6cVar.d;
        byte b = 1;
        if (i4 == 1 || i4 == 9) {
            Activity parentActivity = getParentActivity();
            String M0 = jb6.M0(2131751175, null);
            String M02 = jb6.M0(2131751180, null);
            TL_account.TL_birthday tL_birthday = this.K;
            showDialog((my0) ik.l(parentActivity, M0, M02, tL_birthday, new b9c(this, objArr == true ? 1 : 0), null, false, tL_birthday != null, getResourceProvider()).b);
            return;
        }
        if (i4 == 2) {
            this.K = null;
            va vaVar = this.y;
            if (vaVar != null) {
                vaVar.g3.O(true);
            }
            f0(true);
            return;
        }
        if (i4 == 3) {
            TLRPC.Chat chat = this.L;
            presentFragment(new yh2(this.O, chat == null ? 0L : chat.id, new b9c(this, b)));
            return;
        }
        if (i4 == 5) {
            presentFragment(new oc6());
            return;
        }
        if (i4 == 4) {
            presentFragment(new ss7());
            return;
        }
        if (i4 == 6) {
            presentFragment(new hh2());
            return;
        }
        if (i4 == 7) {
            presentFragment(new u8(3));
        } else if (i4 == 8) {
            presentFragment(new uf1(null));
        } else if (i4 == 11) {
            presentFragment(new ph6(null));
        }
    }

    @Override // n7c
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override // n7c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        c9c c9cVar = new c9c(this, context, jb6.M0(2131751165, null), this.resourceProvider, (byte) 0);
        this.e = c9cVar;
        c9cVar.setDivider(true);
        c9c c9cVar2 = this.e;
        c9cVar2.getClass();
        c9cVar2.d(new c82(c9cVar2, (byte) 1));
        c9c c9cVar3 = new c9c(this, context, jb6.M0(2131751163, null), this.resourceProvider, (byte) 1);
        this.f = c9cVar3;
        c9cVar3.d(new c82(c9cVar3, (byte) 1));
        String M0 = jb6.M0(2131751191, null);
        oc7 messagesController = getMessagesController();
        boolean p = messagesController.getUserConfig().p();
        gs gsVar = messagesController.l4;
        c9c c9cVar4 = new c9c(this, context, M0, (p ? gsVar.l1 : gsVar.k1).f(), this.resourceProvider);
        this.h = c9cVar4;
        c9cVar4.setShowLimitWhenEmpty(true);
        j0();
        this.r = gm.N2(jb6.M0(2131751190, null), -1, 0, new a9c(this, (byte) 0), null);
        super.createView(context);
        va vaVar = this.a;
        this.y = vaVar;
        vaVar.r1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 25));
        this.x = this.simpleActionBar.s(jb6.M0(2131745680, null));
        f0(false);
        i0();
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == nm7.E0) {
            i0();
            return;
        }
        if (i == 2) {
            va vaVar = this.y;
            if (vaVar != null) {
                vaVar.g3.O(true);
                return;
            }
            return;
        }
        if (i == nm7.k0) {
            j0();
            va vaVar2 = this.y;
            if (vaVar2 != null) {
                vaVar2.g3.O(true);
                return;
            }
            return;
        }
        if (i == nm7.d4) {
            TL_account.connectedBots connectedbots = x41.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.w = arrayList;
            va vaVar3 = this.y;
            if (vaVar3 != null) {
                vaVar3.g3.O(true);
            }
        }
    }

    public final void f0(boolean z) {
        boolean z2;
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
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && e0(this.I, this.K)) {
                    long j = this.J;
                    TLRPC.Chat chat = this.L;
                    if (j == (chat != null ? chat.id : 0L)) {
                        z2 = false;
                        this.x.a(z2, z);
                    }
                }
            }
        }
        z2 = true;
        this.x.a(z2, z);
    }

    public final void g0(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                this.x.b(false);
                mlb.y(null, 2131743566, c41.b0(this), null);
                return;
            }
            this.Q = true;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == arrayList.size()) {
                finishFragment();
                return;
            }
            return;
        }
        this.x.b(false);
        boolean z = tLObject instanceof TL_account.updateBirthday;
        if (!z || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            c41.e0(tL_error);
        } else if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = jb6.M0(2131746587, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746588, null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            showDialog(heVar);
        }
        if (z) {
            int i2 = userFull.flags;
            if (tL_birthday != null) {
                userFull.flags = i2 | 32;
            } else {
                userFull.flags = i2 & (-33);
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().g2(userFull, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0(boolean z) {
        if (this.x.y.f) {
            return;
        }
        if (z && TextUtils.isEmpty(this.e.getText())) {
            xx0.E.a();
            c9c c9cVar = this.e;
            int i = -this.R;
            this.R = i;
            gm.A3(i, c9cVar, null);
            return;
        }
        this.x.b(true);
        TLRPC.User f = getUserConfig().f();
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (f == null || X1 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.F, this.e.getText().toString()) || !TextUtils.equals(this.G, this.f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags |= 1;
            String charSequence = this.e.getText().toString();
            f.first_name = charSequence;
            updateprofile.first_name = charSequence;
            updateprofile.flags |= 2;
            String charSequence2 = this.f.getText().toString();
            f.last_name = charSequence2;
            updateprofile.last_name = charSequence2;
            updateprofile.flags |= 4;
            String charSequence3 = this.h.getText().toString();
            X1.about = charSequence3;
            updateprofile.about = charSequence3;
            boolean isEmpty = TextUtils.isEmpty(charSequence3);
            int i2 = X1.flags;
            X1.flags = isEmpty ? i2 & (-3) : i2 | 2;
            arrayList.add(updateprofile);
        }
        TL_account.TL_birthday tL_birthday = X1.birthday;
        if (!e0(this.I, this.K)) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            TL_account.TL_birthday tL_birthday2 = this.K;
            int i3 = X1.flags2;
            if (tL_birthday2 != null) {
                X1.flags2 = i3 | 32;
                X1.birthday = tL_birthday2;
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
            } else {
                X1.flags2 = i3 & (-33);
                X1.birthday = null;
            }
            arrayList.add(updatebirthday);
            getMessagesController().i2();
            nm7.f(this.currentAccount).k(nm7.k5, new Object[0]);
        }
        long j = this.J;
        TLRPC.Chat chat = this.L;
        if (j != (chat != null ? chat.id : 0L)) {
            TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
            updatepersonalchannel.channel = oc7.h1(this.L);
            TLRPC.Chat chat2 = this.L;
            int i4 = X1.flags;
            if (chat2 != null) {
                X1.flags = i4 | 64;
                long j2 = X1.personal_channel_id;
                long j3 = chat2.id;
                if (j2 != j3) {
                    X1.personal_channel_message = 0;
                }
                X1.personal_channel_id = j3;
            } else {
                X1.flags = i4 & (-65);
                X1.personal_channel_message = 0;
                X1.personal_channel_id = 0L;
            }
            arrayList.add(updatepersonalchannel);
        }
        if (arrayList.isEmpty()) {
            finishFragment();
            return;
        }
        int[] iArr = {0};
        int i5 = 0;
        while (i5 < arrayList.size()) {
            TLObject tLObject = (TLObject) arrayList.get(i5);
            UserInfoActivity userInfoActivity = this;
            this.getConnectionsManager().sendRequest(tLObject, new ko0((Object) userInfoActivity, (Object) tLObject, (Object) tL_birthday, (Object) X1, (Object) iArr, (Object) arrayList, (byte) 6), 1024);
            i5++;
            this = userInfoActivity;
        }
        UserInfoActivity userInfoActivity2 = this;
        userInfoActivity2.getMessagesStorage().g2(X1, false);
        userInfoActivity2.getUserConfig().u(true);
        nm7.f(userInfoActivity2.currentAccount).k(nm7.j0, new Object[0]);
        nm7 f2 = nm7.f(userInfoActivity2.currentAccount);
        int i6 = oc7.s5;
        f2.k(2, 1);
    }

    public final void i0() {
        l7c l7cVar;
        if (this.P) {
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 == null) {
            getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TLRPC.User user = X1.user;
        if (user == null) {
            user = getUserConfig().f();
        }
        if (user == null) {
            return;
        }
        c9c c9cVar = this.e;
        String str = user.first_name;
        this.F = str;
        c9cVar.setText(str);
        c9c c9cVar2 = this.f;
        String str2 = user.last_name;
        this.G = str2;
        c9cVar2.setText(str2);
        c9c c9cVar3 = this.h;
        String str3 = X1.about;
        this.H = str3;
        c9cVar3.setText(str3);
        TL_account.TL_birthday tL_birthday = X1.birthday;
        this.I = tL_birthday;
        this.K = tL_birthday;
        if ((X1.flags2 & 64) != 0) {
            this.J = X1.personal_channel_id;
            this.L = getMessagesController().L0(Long.valueOf(this.J));
        } else {
            this.J = 0L;
            this.L = null;
        }
        this.M = X1.business_work_hours != null;
        this.N = X1.business_location != null;
        f0(true);
        va vaVar = this.y;
        if (vaVar != null && (l7cVar = vaVar.g3) != null) {
            l7cVar.O(true);
        }
        this.P = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r11 == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        int hash;
        va vaVar;
        int i = this.n;
        c9c c9cVar = this.h;
        byte b = 0;
        if (c9cVar == null || TextUtils.isEmpty(c9cVar.getText())) {
            this.r = jb6.M0(2131751190, null);
            hash = Objects.hash(0);
            this.n = hash;
        } else {
            ArrayList v = getContactsController().v(9);
            if (v == null) {
                this.r = jb6.M0(2131748536, null);
                hash = Objects.hash(1);
                this.n = hash;
            } else {
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                char c = 65535;
                for (int i4 = 0; i4 < v.size(); i4++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i4);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            TLRPC.Chat L0 = getMessagesController().L0(tL_privacyValueAllowChatParticipants.chats.get(i5));
                            if (L0 != null) {
                                i3 = Math.max(0, L0.participants_count - 1) + i3;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            TLRPC.Chat L02 = getMessagesController().L0(tL_privacyValueDisallowChatParticipants.chats.get(i6));
                            if (L02 != null) {
                                i2 = Math.max(0, L02.participants_count - 1) + i2;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        i3 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        i2 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z2 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z2) {
                            boolean z3 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z3 || z) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    z = true;
                                } else if (c == 65535) {
                                    if (!z2) {
                                        if (z3) {
                                        }
                                    }
                                }
                                c = 2;
                            }
                            c = 1;
                        }
                        c = 0;
                    }
                }
                int i7 = (c == 0 || (c == 65535 && i2 > 0)) ? 0 : (c == 2 || (c == 65535 && i2 > 0 && i3 > 0)) ? 2 : (c == 1 || (c == 65535 && i3 > 0)) ? 1 : -1;
                if (i7 == 0) {
                    if (i2 <= 0) {
                        this.r = gm.D2(gm.N2(jb6.M0(2131751187, null), -1, 0, new a9c(this, b), null), true);
                    } else {
                        this.r = gm.D2(gm.N2(jb6.a0(null, null, 2131751186, Integer.valueOf(i2)), -1, 0, new a9c(this, b), null), true);
                    }
                } else if (i7 == 2) {
                    if (i2 > 0 || i3 > 0) {
                        String j = i3 > 0 ? hg9.j(i3, "+") : "";
                        if (i2 > 0) {
                            if (j.length() > 0) {
                                j = j.concat(", ");
                            }
                            j = j + "-" + i2;
                        }
                        this.r = gm.D2(gm.N2(jb6.a0(null, null, 2131751188, j), -1, 0, new a9c(this, b), null), true);
                    } else {
                        this.r = gm.D2(gm.N2(jb6.M0(2131751189, null), -1, 0, new a9c(this, b), null), true);
                    }
                } else if (i7 != 0) {
                    this.r = gm.N2(jb6.M0(2131751183, null), -1, 0, new a9c(this, b), null);
                } else if (i3 <= 0) {
                    this.r = gm.D2(gm.N2(jb6.M0(2131751185, null), -1, 0, new a9c(this, b), null), true);
                } else {
                    this.r = gm.D2(gm.N2(jb6.a0(null, null, 2131751184, Integer.valueOf(i3)), -1, 0, new a9c(this, b), null), true);
                }
                hash = Objects.hash(Integer.valueOf(i7 + 10), Integer.valueOf(i3), Integer.valueOf(i2));
                this.n = hash;
            }
        }
        if (i == hash || (vaVar = this.y) == null) {
            return;
        }
        vaVar.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.E0);
        getNotificationCenter().b(this, nm7.k0);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.d4);
        getContactsController().D(false);
        x41.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        getNotificationCenter().n(this, nm7.k0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.d4);
        super.onFragmentDestroy();
        if (this.Q) {
            return;
        }
        h0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        d9c d9cVar = this.O;
        d9cVar.b = false;
        d9cVar.e.add(new a9c(this, (byte) 1));
        if (!d9cVar.b && !d9cVar.c) {
            d9cVar.c = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = true;
            ConnectionsManager.getInstance(d9cVar.a).sendRequest(tL_channels_getAdminedPublicChannels, new go9(d9cVar, (byte) 21));
        }
        this.s = null;
        va vaVar = this.y;
        if (vaVar != null) {
            vaVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
