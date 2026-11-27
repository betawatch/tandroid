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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class UserInfoActivity extends n9c implements fn7 {
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
    public bbc e;
    public bbc f;
    public int firstNameRow;
    public bbc h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public nla x;
    public wa y;
    public int n = TLObject.FLAG_31;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final cbc O = new cbc(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static String c0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return ob6.D0().p0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return ob6.D0().n0().format(calendar2.getTimeInMillis());
    }

    public static boolean d0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        ArrayList arrayList2;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList3 = this.E;
        arrayList3.clear();
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o() && this.currentAccount != i) {
                arrayList3.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList3, new fna((byte) 12));
        arrayList.add(b8c.u(ob6.M0(2131751189, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(b8c.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(b8c.k(this.f));
        arrayList.add(b8c.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(b8c.k(this.h));
        arrayList.add(b8c.C(this.r));
        TLRPC.User f = getUserConfig().f();
        bp1.o(2131751298, null, arrayList);
        if (f != null) {
            this.numberRow = arrayList.size();
            arrayList.add(pba.i(7, -11154873, -14175180, R.drawable.settings_calls, xnb.k(new StringBuilder("+"), f.phone, f78.f()), ob6.M0(2131743913, null), null));
        }
        this.usernameRow = arrayList.size();
        if (lbc.p(f) != null) {
            arrayList.add(pba.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + lbc.p(f), ob6.M0(2131743329, null), null));
        } else {
            arrayList.add(pba.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, ob6.M0(2131754356, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(pba.i(9, -14899731, -15431455, R.drawable.filled_birthday, c0(tL_birthday), ob6.M0(2131751768, null), null));
        } else {
            arrayList.add(pba.i(9, -14899731, -15431455, R.drawable.filled_birthday, ob6.M0(2131754457, null), null, null));
        }
        byte b = 2;
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = ob6.M0(2131751206, null);
            if (!v.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= v.size()) {
                        break;
                    }
                    if (v.get(i2) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = ob6.M0(2131751206, null);
                        break;
                    }
                    if ((v.get(i2) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i2) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        M0 = ob6.M0(2131751207, null);
                    }
                    i2++;
                }
            }
            this.s = hl.D2(hl.N2(M0, -1, 0, new zac(this, b), null), true);
        }
        arrayList.add(b8c.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(pba.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, ob6.M0(2131751196, null), null, ob6.M0(2131751201, null)));
        } else {
            arrayList.add(pba.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, ob6.M0(2131751196, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(pba.i(4, -881871, -1940716, R.drawable.filled_premium_hours, ob6.M0(2131751192, null), null, null));
        }
        if (this.N) {
            arrayList.add(pba.i(5, -765355, -2148011, R.drawable.filled_location, ob6.M0(2131751190, null), null, null));
        }
        ArrayList arrayList4 = this.w;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            arrayList2 = arrayList3;
            arrayList.add(pba.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, skb.b(ob6.M0(2131751195, null)), null, null));
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList5 = this.w;
            int size = arrayList5.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList5.get(i3);
                i3++;
                ArrayList arrayList6 = arrayList3;
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (X1 != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(lbc.r(X1));
                }
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList.add(pba.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, ob6.M0(2131751195, null), sb, null));
        }
        arrayList.add(b8c.B(-3, ob6.M0(2131751194, null)));
        boolean z = yac.c() < 4;
        if (z) {
            this.addAccountRow = arrayList.size();
            String M02 = ob6.M0(2131754477, null);
            int i4 = dbc.b;
            b8c K = b8c.K(dbc.class);
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
                bp1.o(2131745220, null, arrayList);
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                int intValue = ((Integer) arrayList2.get(i5)).intValue();
                int i6 = nba.b;
                b8c K2 = b8c.K(nba.class);
                K2.d = i5;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (yac.n()) {
                arrayList.add(b8c.C(null));
            } else {
                byte b2 = 3;
                int max = Math.max(0, (yac.n() ? 5 : 3) - yac.c());
                arrayList.add(b8c.C(TextUtils.concat(max > 0 ? ob6.H(',', "AddAccountInfo1", max).concat(" ") : "", hl.N2(ob6.H(',', "AddAccountInfo2", yac.n() ? 5 : 3), -1, 0, new zac(this, b2), null))));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = ob6.M0(2131748497, null);
        int i7 = dbc.b;
        b8c K3 = b8c.K(dbc.class);
        K3.d = 11;
        K3.k = R.drawable.msg_leave;
        K3.m = M03;
        K3.n = null;
        K3.A = 0;
        K3.s = true;
        arrayList.add(K3);
        arrayList.add(b8c.B(-4, null));
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131751299, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9c
    public final void a0(b8c b8cVar, View view) {
        int i = 0;
        Object[] objArr = 0;
        Integer num = null;
        if (b8cVar.d == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!yac.h(i2).o()) {
                    i++;
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                }
            }
            if (!yac.n()) {
                i--;
            }
            if (i > 0 && num != null) {
                presentFragment(new qh6(num.intValue()));
                return;
            } else {
                if (yac.n()) {
                    return;
                }
                showDialog(new l46(7, this.currentAccount, null, getParentActivity(), this));
                return;
            }
        }
        if (b8cVar.H(nba.class)) {
            int i3 = b8cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i3);
                return;
            }
            return;
        }
        int i4 = b8cVar.d;
        byte b = 1;
        if (i4 == 1 || i4 == 9) {
            Activity parentActivity = getParentActivity();
            String M0 = ob6.M0(2131751203, null);
            String M02 = ob6.M0(2131751208, null);
            TL_account.TL_birthday tL_birthday = this.K;
            showDialog((nx0) jj.l(parentActivity, M0, M02, tL_birthday, new abc(this, objArr == true ? 1 : 0), null, false, tL_birthday != null, getResourceProvider()).b);
            return;
        }
        if (i4 == 2) {
            this.K = null;
            wa waVar = this.y;
            if (waVar != null) {
                waVar.g3.O(true);
            }
            e0(true);
            return;
        }
        if (i4 == 3) {
            TLRPC.Chat chat = this.L;
            presentFragment(new ch2(this.O, chat == null ? 0L : chat.id, new abc(this, b)));
            return;
        }
        if (i4 == 5) {
            presentFragment(new tc6());
            return;
        }
        if (i4 == 4) {
            presentFragment(new vt7());
            return;
        }
        if (i4 == 6) {
            presentFragment(new mg2());
            return;
        }
        if (i4 == 7) {
            presentFragment(new v8(3));
        } else if (i4 == 8) {
            presentFragment(new ve1(null));
        } else if (i4 == 11) {
            presentFragment(new th6(null));
        }
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        bbc bbcVar = new bbc(this, context, ob6.M0(2131751193, null), this.resourceProvider, (byte) 0);
        this.e = bbcVar;
        bbcVar.setDivider(true);
        bbc bbcVar2 = this.e;
        bbcVar2.getClass();
        i72 i72Var = new i72(bbcVar2, (byte) 1);
        yt3 yt3Var = bbcVar2.d;
        yt3Var.setImeOptions(6);
        yt3Var.setOnEditorActionListener(new vx1(i72Var, (byte) 2));
        bbc bbcVar3 = new bbc(this, context, ob6.M0(2131751191, null), this.resourceProvider, (byte) 1);
        this.f = bbcVar3;
        i72 i72Var2 = new i72(bbcVar3, (byte) 1);
        yt3 yt3Var2 = bbcVar3.d;
        yt3Var2.setImeOptions(6);
        yt3Var2.setOnEditorActionListener(new vx1(i72Var2, (byte) 2));
        String M0 = ob6.M0(2131751219, null);
        uc7 messagesController = getMessagesController();
        boolean p = messagesController.getUserConfig().p();
        hr hrVar = messagesController.k4;
        bbc bbcVar4 = new bbc(this, context, M0, (p ? hrVar.t1 : hrVar.s1).f(), this.resourceProvider);
        this.h = bbcVar4;
        bbcVar4.setShowLimitWhenEmpty(true);
        i0();
        this.r = hl.N2(ob6.M0(2131751218, null), -1, 0, new zac(this, (byte) 0), null);
        super.createView(context);
        wa waVar = this.a;
        this.y = waVar;
        waVar.s1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 26));
        this.x = this.simpleActionBar.u(ob6.M0(2131745674, null));
        e0(false);
        h0();
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == jn7.E0) {
            h0();
            return;
        }
        if (i == 2) {
            wa waVar = this.y;
            if (waVar != null) {
                waVar.g3.O(true);
                return;
            }
            return;
        }
        if (i == jn7.k0) {
            i0();
            wa waVar2 = this.y;
            if (waVar2 != null) {
                waVar2.g3.O(true);
                return;
            }
            return;
        }
        if (i == jn7.c4) {
            TL_account.connectedBots connectedbots = y31.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.w = arrayList;
            wa waVar3 = this.y;
            if (waVar3 != null) {
                waVar3.g3.O(true);
            }
        }
    }

    public final void e0(boolean z) {
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
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && d0(this.I, this.K)) {
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

    public final void f0(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                this.x.b(false);
                xnb.x(null, 2131743534, d31.b0(this), null);
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
            d31.e0(tL_error);
        } else if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = ob6.M0(2131746581, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746582, null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            showDialog(idVar);
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

    public final void g0(boolean z) {
        if (this.x.y.f) {
            return;
        }
        if (z && TextUtils.isEmpty(this.e.getText())) {
            yw0.E.a();
            bbc bbcVar = this.e;
            int i = -this.R;
            this.R = i;
            hl.A3(i, bbcVar, null);
            return;
        }
        this.x.b(true);
        TLRPC.User f = getUserConfig().f();
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (f == null || Y1 == null) {
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
            Y1.about = charSequence3;
            updateprofile.about = charSequence3;
            boolean isEmpty = TextUtils.isEmpty(charSequence3);
            int i2 = Y1.flags;
            Y1.flags = isEmpty ? i2 & (-3) : i2 | 2;
            arrayList.add(updateprofile);
        }
        TL_account.TL_birthday tL_birthday = Y1.birthday;
        if (!d0(this.I, this.K)) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            TL_account.TL_birthday tL_birthday2 = this.K;
            int i3 = Y1.flags2;
            if (tL_birthday2 != null) {
                Y1.flags2 = i3 | 32;
                Y1.birthday = tL_birthday2;
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
            } else {
                Y1.flags2 = i3 & (-33);
                Y1.birthday = null;
            }
            arrayList.add(updatebirthday);
            getMessagesController().j2();
            jn7.f(this.currentAccount).k(jn7.j5, new Object[0]);
        }
        long j = this.J;
        TLRPC.Chat chat = this.L;
        if (j != (chat != null ? chat.id : 0L)) {
            TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
            updatepersonalchannel.channel = uc7.i1(this.L);
            TLRPC.Chat chat2 = this.L;
            int i4 = Y1.flags;
            if (chat2 != null) {
                Y1.flags = i4 | 64;
                long j2 = Y1.personal_channel_id;
                long j3 = chat2.id;
                if (j2 != j3) {
                    Y1.personal_channel_message = 0;
                }
                Y1.personal_channel_id = j3;
            } else {
                Y1.flags = i4 & (-65);
                Y1.personal_channel_message = 0;
                Y1.personal_channel_id = 0L;
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
            this.getConnectionsManager().sendRequest(tLObject, new mn0((Object) userInfoActivity, (Object) tLObject, (Object) tL_birthday, (Object) Y1, (Object) iArr, (Object) arrayList, (byte) 6), 1024);
            i5++;
            this = userInfoActivity;
        }
        UserInfoActivity userInfoActivity2 = this;
        userInfoActivity2.getMessagesStorage().g2(Y1, false);
        userInfoActivity2.getUserConfig().u(true);
        jn7.f(userInfoActivity2.currentAccount).k(jn7.j0, new Object[0]);
        jn7 f2 = jn7.f(userInfoActivity2.currentAccount);
        int i6 = uc7.r5;
        f2.k(2, 1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0() {
        l9c l9cVar;
        if (this.P) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TLRPC.User user = Y1.user;
        if (user == null) {
            user = getUserConfig().f();
        }
        if (user == null) {
            return;
        }
        bbc bbcVar = this.e;
        String str = user.first_name;
        this.F = str;
        bbcVar.setText(str);
        bbc bbcVar2 = this.f;
        String str2 = user.last_name;
        this.G = str2;
        bbcVar2.setText(str2);
        bbc bbcVar3 = this.h;
        String str3 = Y1.about;
        this.H = str3;
        bbcVar3.setText(str3);
        TL_account.TL_birthday tL_birthday = Y1.birthday;
        this.I = tL_birthday;
        this.K = tL_birthday;
        if ((Y1.flags2 & 64) != 0) {
            this.J = Y1.personal_channel_id;
            this.L = getMessagesController().M0(Long.valueOf(this.J));
        } else {
            this.J = 0L;
            this.L = null;
        }
        this.M = Y1.business_work_hours != null;
        this.N = Y1.business_location != null;
        e0(true);
        wa waVar = this.y;
        if (waVar != null && (l9cVar = waVar.g3) != null) {
            l9cVar.O(true);
        }
        this.P = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r11 == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        int hash;
        wa waVar;
        int i = this.n;
        bbc bbcVar = this.h;
        byte b = 0;
        if (bbcVar == null || TextUtils.isEmpty(bbcVar.getText())) {
            this.r = ob6.M0(2131751218, null);
            hash = Objects.hash(0);
            this.n = hash;
        } else {
            ArrayList v = getContactsController().v(9);
            if (v == null) {
                this.r = ob6.M0(2131748533, null);
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
                            TLRPC.Chat M0 = getMessagesController().M0(tL_privacyValueAllowChatParticipants.chats.get(i5));
                            if (M0 != null) {
                                i3 = Math.max(0, M0.participants_count - 1) + i3;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            TLRPC.Chat M02 = getMessagesController().M0(tL_privacyValueDisallowChatParticipants.chats.get(i6));
                            if (M02 != null) {
                                i2 = Math.max(0, M02.participants_count - 1) + i2;
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
                        this.r = hl.D2(hl.N2(ob6.M0(2131751215, null), -1, 0, new zac(this, b), null), true);
                    } else {
                        this.r = hl.D2(hl.N2(ob6.a0(null, null, 2131751214, Integer.valueOf(i2)), -1, 0, new zac(this, b), null), true);
                    }
                } else if (i7 == 2) {
                    if (i2 > 0 || i3 > 0) {
                        String k = i3 > 0 ? uh9.k(i3, "+") : "";
                        if (i2 > 0) {
                            if (k.length() > 0) {
                                k = k.concat(", ");
                            }
                            k = k + "-" + i2;
                        }
                        this.r = hl.D2(hl.N2(ob6.a0(null, null, 2131751216, k), -1, 0, new zac(this, b), null), true);
                    } else {
                        this.r = hl.D2(hl.N2(ob6.M0(2131751217, null), -1, 0, new zac(this, b), null), true);
                    }
                } else if (i7 != 0) {
                    this.r = hl.N2(ob6.M0(2131751211, null), -1, 0, new zac(this, b), null);
                } else if (i3 <= 0) {
                    this.r = hl.D2(hl.N2(ob6.M0(2131751213, null), -1, 0, new zac(this, b), null), true);
                } else {
                    this.r = hl.D2(hl.N2(ob6.a0(null, null, 2131751212, Integer.valueOf(i3)), -1, 0, new zac(this, b), null), true);
                }
                hash = Objects.hash(Integer.valueOf(i7 + 10), Integer.valueOf(i3), Integer.valueOf(i2));
                this.n = hash;
            }
        }
        if (i == hash || (waVar = this.y) == null) {
            return;
        }
        waVar.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.E0);
        getNotificationCenter().b(this, jn7.k0);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.c4);
        getContactsController().D(false);
        y31.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, jn7.k0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.c4);
        super.onFragmentDestroy();
        if (this.Q) {
            return;
        }
        g0(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        cbc cbcVar = this.O;
        cbcVar.b = false;
        cbcVar.e.add(new zac(this, (byte) 1));
        if (!cbcVar.b && !cbcVar.c) {
            cbcVar.c = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = true;
            ConnectionsManager.getInstance(cbcVar.a).sendRequest(tL_channels_getAdminedPublicChannels, new yp9(cbcVar, (byte) 21));
        }
        this.s = null;
        wa waVar = this.y;
        if (waVar != null) {
            waVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
