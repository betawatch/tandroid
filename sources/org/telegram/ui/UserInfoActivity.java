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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class UserInfoActivity extends org.telegram.ui.Components.r41 implements org.telegram.messenger.is {
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
    public bb1 e;
    public bb1 f;
    public int firstNameRow;
    public bb1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.z4 x;
    public bi.v3 y;
    public int n = TLObject.FLAG_31;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final cb1 O = new cb1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void d0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.x.b(false);
                org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.cc.a0(userInfoActivity), null);
                return;
            }
            userInfoActivity.Q = true;
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.x.b(false);
        boolean z10 = tLObject instanceof TL_account.updateBirthday;
        if (!z10 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.cc.d0(tL_error);
        } else if (userInfoActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
            String M0 = org.telegram.messenger.hd.M0(2131746852, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            userInfoActivity.showDialog(t1Var);
        }
        if (z10) {
            if (tL_birthday != null) {
                userFull.flags |= 32;
            } else {
                userFull.flags &= -33;
            }
            userFull.birthday = tL_birthday;
            userInfoActivity.getMessagesStorage().j2(userFull, false);
        }
    }

    public static String e0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return org.telegram.messenger.hd.E0().q0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.hd.E0().o0().format(calendar2.getTimeInMillis());
    }

    public static boolean f0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.m10.i(i7).p() && this.currentAccount != i7) {
                arrayList2.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList2, new qv0(4));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751224, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.f));
        arrayList.add(org.telegram.ui.Components.b41.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.h));
        arrayList.add(org.telegram.ui.Components.b41.C(this.r));
        TLRPC.User f10 = getUserConfig().f();
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751333, null)));
        if (f10 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(g31.i(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.k5.h(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.hd.M0(2131744260, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.q10.n(f10) != null) {
            arrayList.add(g31.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + org.telegram.messenger.q10.n(f10), org.telegram.messenger.hd.M0(2131743674, null), null));
        } else {
            arrayList.add(g31.i(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, org.telegram.messenger.hd.M0(2131754363, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(g31.i(9, -14899731, -15431455, R.drawable.filled_birthday, e0(tL_birthday), org.telegram.messenger.hd.M0(2131751803, null), null));
        } else {
            arrayList.add(g31.i(9, -14899731, -15431455, R.drawable.filled_birthday, org.telegram.messenger.hd.M0(2131754464, null), null, null));
        }
        int i10 = 2;
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = org.telegram.messenger.hd.M0(2131751241, null);
            if (!v.isEmpty()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= v.size()) {
                        break;
                    }
                    if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = org.telegram.messenger.hd.M0(2131751241, null);
                        break;
                    }
                    if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        M0 = org.telegram.messenger.hd.M0(2131751242, null);
                    }
                    i11++;
                }
            }
            this.s = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new za1(this, i10)), true);
        }
        arrayList.add(org.telegram.ui.Components.b41.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(g31.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, org.telegram.messenger.hd.M0(2131751231, null), null, org.telegram.messenger.hd.M0(2131751236, null)));
        } else {
            arrayList.add(g31.i(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, org.telegram.messenger.hd.M0(2131751231, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(g31.i(4, -881871, -1940716, R.drawable.filled_premium_hours, org.telegram.messenger.hd.M0(2131751227, null), null, null));
        }
        if (this.N) {
            arrayList.add(g31.i(5, -765355, -2148011, R.drawable.filled_location, org.telegram.messenger.hd.M0(2131751225, null), null, null));
        }
        ArrayList arrayList3 = this.w;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(g31.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.l8.b(org.telegram.messenger.hd.M0(2131751230, null)), null, null));
        } else {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.w;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.q10.p(a22));
                }
            }
            arrayList.add(g31.i(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.messenger.hd.M0(2131751230, null), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.b41.B(-3, org.telegram.messenger.hd.M0(2131751229, null)));
        boolean z10 = org.telegram.messenger.m10.c() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            String M02 = org.telegram.messenger.hd.M0(2131754484, null);
            int i13 = db1.b;
            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(db1.class);
            K.d = 10;
            K.k = R.drawable.outline_add_account;
            K.l = M02;
            K.m = null;
            K.z = 0;
            K.q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745492, null)));
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                int i15 = e31.b;
                org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(e31.class);
                K2.d = i14;
                K2.z = intValue;
                arrayList.add(K2);
            }
            if (org.telegram.messenger.m10.o()) {
                arrayList.add(org.telegram.ui.Components.b41.C(null));
            } else {
                int i16 = 3;
                int max = Math.max(0, (org.telegram.messenger.m10.o() ? 5 : 3) - org.telegram.messenger.m10.c());
                arrayList.add(org.telegram.ui.Components.b41.C(TextUtils.concat(max > 0 ? org.telegram.messenger.hd.H(',', "AddAccountInfo1", max) + " " : "", org.telegram.messenger.g0.U2(org.telegram.messenger.hd.H(',', "AddAccountInfo2", org.telegram.messenger.m10.o() ? 5 : 3), new za1(this, i16)))));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = org.telegram.messenger.hd.M0(2131748743, null);
        int i17 = db1.b;
        org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(db1.class);
        K3.d = 11;
        K3.k = R.drawable.msg_leave;
        K3.l = M03;
        K3.m = null;
        K3.z = 0;
        K3.r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.b41.B(-4, null));
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131751334, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = 0;
        Integer num = null;
        if (b41Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!org.telegram.messenger.m10.i(i10).p()) {
                    i7++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!org.telegram.messenger.m10.o()) {
                i7--;
            }
            if (i7 > 0 && num != null) {
                presentFragment(new ce0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.m10.o()) {
                    return;
                }
                showDialog(new ug.j0(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (b41Var.H(e31.class)) {
            int i11 = b41Var.z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
                return;
            }
            return;
        }
        int i12 = b41Var.d;
        int i13 = 1;
        if (i12 == 1 || i12 == 9) {
            Activity parentActivity = getParentActivity();
            String M0 = org.telegram.messenger.hd.M0(2131751238, null);
            String M02 = org.telegram.messenger.hd.M0(2131751243, null);
            TL_account.TL_birthday tL_birthday = this.K;
            showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(parentActivity, M0, M02, tL_birthday, new ab1(this, i7), null, false, tL_birthday != null, getResourceProvider()).b);
            return;
        }
        if (i12 == 2) {
            this.K = null;
            bi.v3 v3Var = this.y;
            if (v3Var != null) {
                v3Var.g3.O(true);
            }
            g0(true);
            return;
        }
        if (i12 == 3) {
            TLRPC.Chat chat = this.L;
            presentFragment(new sq(this.O, chat == null ? 0L : chat.id, new ab1(this, i13)));
            return;
        }
        if (i12 == 5) {
            presentFragment(new kg.a1());
            return;
        }
        if (i12 == 4) {
            presentFragment(new kg.c1());
            return;
        }
        if (i12 == 6) {
            presentFragment(new kg.q0());
            return;
        }
        if (i12 == 7) {
            presentFragment(new g(3));
        } else if (i12 == 8) {
            presentFragment(new la(null));
        } else if (i12 == 11) {
            presentFragment(new ee0(null));
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        bb1 bb1Var = new bb1(this, context, org.telegram.messenger.hd.M0(2131751228, null), this.resourceProvider, 0);
        this.e = bb1Var;
        bb1Var.setDivider(true);
        bb1 bb1Var2 = this.e;
        bb1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(bb1Var2, 5);
        org.telegram.ui.Cells.i3 i3Var = bb1Var2.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
        bb1 bb1Var3 = new bb1(this, context, org.telegram.messenger.hd.M0(2131751226, null), this.resourceProvider, 1);
        this.f = bb1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(bb1Var3, 5);
        org.telegram.ui.Cells.i3 i3Var2 = bb1Var3.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(fVar2, 2));
        String M0 = org.telegram.messenger.hd.M0(2131751254, null);
        org.telegram.messenger.np messagesController = getMessagesController();
        bb1 bb1Var4 = new bb1(this, context, M0, messagesController.getUserConfig().q() ? messagesController.Z4 : messagesController.Y4, this.resourceProvider);
        this.h = bb1Var4;
        bb1Var4.setShowLimitWhenEmpty(true);
        j0();
        this.r = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751253, null), new za1(this, 0));
        super.createView(context);
        bi.v3 v3Var = this.a;
        this.y = v3Var;
        v3Var.r1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 19));
        this.x = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        g0(false);
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i7 == org.telegram.messenger.ns.E0) {
            i0();
            return;
        }
        if (i7 == org.telegram.messenger.ns.r) {
            bi.v3 v3Var = this.y;
            if (v3Var != null) {
                v3Var.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.k0) {
            j0();
            bi.v3 v3Var2 = this.y;
            if (v3Var2 != null) {
                v3Var2.g3.O(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.Z3) {
            TL_account.connectedBots connectedbots = kg.f.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.w = arrayList;
            bi.v3 v3Var3 = this.y;
            if (v3Var3 != null) {
                v3Var3.g3.O(true);
            }
        }
    }

    public final void g0(boolean z10) {
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
                if (TextUtils.equals(str3 != null ? str3 : "", this.h.getText().toString()) && f0(this.I, this.K)) {
                    long j3 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (j3 == (chat != null ? chat.id : 0L)) {
                        z11 = false;
                        this.x.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.x.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0(boolean z10) {
        if (!this.x.y.f) {
            if (z10 && TextUtils.isEmpty(this.e.getText())) {
                org.telegram.messenger.p2.E.a();
                bb1 bb1Var = this.e;
                int i7 = -this.R;
                this.R = i7;
                org.telegram.messenger.g0.F3(i7, bb1Var, null);
                return;
            }
            this.x.b(true);
            TLRPC.User f10 = getUserConfig().f();
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            if (f10 != null && b22 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.F, this.e.getText().toString()) || !TextUtils.equals(this.G, this.f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.e.getText().toString();
                    f10.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f.getText().toString();
                    f10.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    b22.about = charSequence3;
                    updateprofile.about = charSequence3;
                    b22.flags = TextUtils.isEmpty(charSequence3) ? b22.flags & (-3) : b22.flags | 2;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = b22.birthday;
                if (!f0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    if (tL_birthday2 != null) {
                        b22.flags2 |= 32;
                        b22.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        b22.flags2 &= -33;
                        b22.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().m2();
                    org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.g5, new Object[0]);
                }
                long j3 = this.J;
                TLRPC.Chat chat = this.L;
                if (j3 != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.np.i1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        b22.flags |= 64;
                        long j10 = b22.personal_channel_id;
                        long j11 = chat2.id;
                        if (j10 != j11) {
                            b22.personal_channel_message = 0;
                        }
                        b22.personal_channel_id = j11;
                    } else {
                        b22.flags &= -65;
                        b22.personal_channel_message = 0;
                        b22.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLObject tLObject = (TLObject) arrayList.get(i10);
                    getConnectionsManager().sendRequest(tLObject, new di.u6(this, tLObject, tL_birthday, b22, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(b22, false);
                getUserConfig().v(true);
                org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.j0, new Object[0]);
                org.telegram.messenger.ns f11 = org.telegram.messenger.ns.f(this.currentAccount);
                int i11 = org.telegram.messenger.np.D8;
                f11.k(org.telegram.messenger.ns.r, 1);
            }
        }
    }

    public final void i0() {
        org.telegram.ui.Components.p41 p41Var;
        if (this.P) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.User user = b22.user;
        if (user == null) {
            user = getUserConfig().f();
        }
        if (user == null) {
            return;
        }
        bb1 bb1Var = this.e;
        String str = user.first_name;
        this.F = str;
        bb1Var.setText(str);
        bb1 bb1Var2 = this.f;
        String str2 = user.last_name;
        this.G = str2;
        bb1Var2.setText(str2);
        bb1 bb1Var3 = this.h;
        String str3 = b22.about;
        this.H = str3;
        bb1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = b22.birthday;
        this.I = tL_birthday;
        this.K = tL_birthday;
        if ((b22.flags2 & 64) != 0) {
            this.J = b22.personal_channel_id;
            this.L = getMessagesController().M0(Long.valueOf(this.J));
        } else {
            this.J = 0L;
            this.L = null;
        }
        this.M = b22.business_work_hours != null;
        this.N = b22.business_location != null;
        g0(true);
        bi.v3 v3Var = this.y;
        if (v3Var != null && (p41Var = v3Var.g3) != null) {
            p41Var.O(true);
        }
        this.P = true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        if (r11 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        bi.v3 v3Var;
        int i7 = this.n;
        bb1 bb1Var = this.h;
        int i10 = 0;
        if (bb1Var == null || TextUtils.isEmpty(bb1Var.getText())) {
            this.r = org.telegram.messenger.hd.M0(2131751253, null);
            this.n = Objects.hash(0);
        } else {
            ArrayList v = getContactsController().v(9);
            if (v == null) {
                this.r = org.telegram.messenger.hd.M0(2131748779, null);
                this.n = Objects.hash(1);
            } else {
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                boolean z10 = false;
                char c10 = 65535;
                for (int i14 = 0; i14 < v.size(); i14++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i14);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            TLRPC.Chat M0 = getMessagesController().M0(tL_privacyValueAllowChatParticipants.chats.get(i15));
                            if (M0 != null) {
                                i13 = Math.max(0, M0.participants_count - 1) + i13;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.Chat M02 = getMessagesController().M0(tL_privacyValueDisallowChatParticipants.chats.get(i16));
                            if (M02 != null) {
                                i12 = Math.max(0, M02.participants_count - 1) + i12;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        i13 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        i12 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
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
                if (c10 == 0 || (c10 == 65535 && i12 > 0)) {
                    i11 = 0;
                } else if (c10 == 2 || (c10 == 65535 && i12 > 0 && i13 > 0)) {
                    i11 = 2;
                } else if (c10 == 1 || (c10 == 65535 && i13 > 0)) {
                    i11 = 1;
                }
                if (i11 == 0) {
                    if (i12 <= 0) {
                        this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751250, null), new za1(this, i10)), true);
                    } else {
                        this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751249, Integer.valueOf(i12)), new za1(this, i10)), true);
                    }
                } else if (i11 == 2) {
                    if (i12 > 0 || i13 > 0) {
                        String i17 = i13 > 0 ? i5.c.i(i13, "+") : "";
                        if (i12 > 0) {
                            if (i17.length() > 0) {
                                i17 = i17.concat(", ");
                            }
                            i17 = i17 + "-" + i12;
                        }
                        this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751251, i17), new za1(this, i10)), true);
                    } else {
                        this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751252, null), new za1(this, i10)), true);
                    }
                } else if (i11 != 0) {
                    this.r = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751246, null), new za1(this, i10));
                } else if (i13 <= 0) {
                    this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751248, null), new za1(this, i10)), true);
                } else {
                    this.r = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131751247, Integer.valueOf(i13)), new za1(this, i10)), true);
                }
                this.n = Objects.hash(Integer.valueOf(i11 + 10), Integer.valueOf(i13), Integer.valueOf(i12));
            }
        }
        if (i7 == this.n || (v3Var = this.y) == null) {
            return;
        }
        v3Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.k0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.Z3);
        getContactsController().D(false);
        kg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.k0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.Z3);
        super.onFragmentDestroy();
        if (this.Q) {
            return;
        }
        h0(false);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        cb1 cb1Var = this.O;
        cb1Var.c = false;
        cb1Var.f.add(new za1(this, 1));
        if (!cb1Var.c && !cb1Var.d) {
            cb1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = cb1Var.b;
            ConnectionsManager.getInstance(cb1Var.a).sendRequest(tL_channels_getAdminedPublicChannels, new l(cb1Var, 23));
        }
        this.s = null;
        bi.v3 v3Var = this.y;
        if (v3Var != null) {
            v3Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
