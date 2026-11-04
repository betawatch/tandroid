package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ka extends org.telegram.ui.ActionBar.d2 {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public fa E;
    public ha F;
    public ja G;
    public org.telegram.ui.Cells.b2 H;
    public org.telegram.ui.ActionBar.b5 a;
    public org.telegram.ui.Components.tj0 b;
    public da c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.messenger.voip.l0 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public ka(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    public static void Z(ka kaVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.e0(kaVar.currentAccount, tL_error, kaVar, updateusername, new Object[0]);
        kaVar.m0();
    }

    public static /* synthetic */ void b0(ka kaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        kaVar.e = ConnectionsManager.getInstance(kaVar.currentAccount).sendRequest(checkusername, new y9(kaVar, str, checkusername, 0), 2);
    }

    public static void c0(ka kaVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user) {
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.hp.s1(kaVar.currentAccount).Y3(arrayList, false);
        org.telegram.messenger.qr.a0(kaVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.h10.i(kaVar.currentAccount).v(true);
        kaVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(ka kaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = kaVar.y;
        ArrayList arrayList = kaVar.w;
        ArrayList arrayList2 = kaVar.s;
        if (kaVar.d) {
            kaVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (((TLRPC.TL_username) arrayList2.get(i3)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i3)).username);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
                }
            }
            if (j10 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = org.telegram.messenger.hp.s1(kaVar.currentAccount).o1(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            kaVar.getConnectionsManager().sendRequest(reorderusernames, new ei.u5(15));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User a22 = org.telegram.messenger.hp.s1(kaVar.currentAccount).a2(Long.valueOf(kaVar.l0()));
            a22.usernames = arrayList4;
            org.telegram.messenger.hp.s1(kaVar.currentAccount).X3(a22, false, true);
        }
    }

    public static void e0(ka kaVar) {
        if (kaVar.y != 0) {
            kaVar.finishFragment();
            return;
        }
        int i3 = 1;
        if (kaVar.r.startsWith("@")) {
            kaVar.r = kaVar.r.substring(1);
        }
        if (!kaVar.r.isEmpty() && !kaVar.i0(kaVar.r)) {
            kaVar.m0();
            return;
        }
        TLRPC.User k02 = kaVar.k0();
        if (kaVar.getParentActivity() == null || k02 == null) {
            return;
        }
        String n4 = org.telegram.messenger.l10.n(k02);
        if (n4 == null) {
            n4 = "";
        }
        if (n4.equals(kaVar.r)) {
            kaVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kaVar.getParentActivity(), null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = kaVar.r;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(kaVar.currentAccount);
        int i10 = org.telegram.messenger.hp.C8;
        f10.k(org.telegram.messenger.hs.r, 1);
        int sendRequest = ConnectionsManager.getInstance(kaVar.currentAccount).sendRequest(updateusername, new y9(kaVar, s1Var, updateusername, i3), 2);
        ConnectionsManager.getInstance(kaVar.currentAccount).bindRequestToGuid(sendRequest, kaVar.classGuid);
        s1Var.setOnCancelListener(new ci.b0(kaVar, sendRequest, i3));
        s1Var.show();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        String str;
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743684, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 2));
        this.a = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(l0()));
        if (a22 == null) {
            a22 = k0();
        }
        if (a22 != null) {
            this.r = null;
            if (a22.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= a22.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = a22.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.r == null && (str = a22.username) != null) {
                this.r = str;
            }
            if (this.r == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i11 = 0; i11 < a22.usernames.size(); i11++) {
                if (a22.usernames.get(i11).active) {
                    arrayList.add(a22.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < a22.usernames.size(); i12++) {
                if (!a22.usernames.get(i12).active) {
                    arrayList.add(a22.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
        da daVar = new da(this);
        this.c = daVar;
        tj0Var2.setAdapter(daVar);
        org.telegram.ui.ActionBar.r6.K(this.b, org.telegram.ui.ActionBar.k6.i6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new u4.y(new fi.c(this, i3)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, b8.mf.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new fi.a(6));
        this.b.setOnItemClickListener(new ba(this));
        org.telegram.messenger.g0.i3(new xp0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean i0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.H;
        if (b2Var != null) {
            b2Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            ja jaVar = this.G;
            if (jaVar != null) {
                ja.a(jaVar);
            }
        }
        org.telegram.messenger.voip.l0 l0Var = this.h;
        if (l0Var != null) {
            org.telegram.messenger.g0.r(l0Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.b2 b2Var2 = this.H;
                if (b2Var2 != null) {
                    b2Var2.setText(org.telegram.messenger.bd.M0(2131743666, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.H;
                    int i3 = org.telegram.ui.ActionBar.k6.p7;
                    b2Var3.setTag(Integer.valueOf(i3));
                    org.telegram.ui.ActionBar.r6.V(this.H, i3, null);
                    ja jaVar2 = this.G;
                    if (jaVar2 != null) {
                        ja.a(jaVar2);
                        return false;
                    }
                }
            } else {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var4 = this.H;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.bd.M0(2131743662, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.H;
                            int i11 = org.telegram.ui.ActionBar.k6.p7;
                            b2Var5.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.r6.V(this.H, i11, null);
                            ja jaVar3 = this.G;
                            if (jaVar3 != null) {
                                ja.a(jaVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var6 = this.H;
                        if (b2Var6 != null) {
                            b2Var6.setText(org.telegram.messenger.bd.M0(2131743666, null));
                            org.telegram.ui.Cells.b2 b2Var7 = this.H;
                            int i12 = org.telegram.ui.ActionBar.k6.p7;
                            b2Var7.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.r6.V(this.H, i12, null);
                            ja jaVar4 = this.G;
                            if (jaVar4 != null) {
                                ja.a(jaVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.b2 b2Var8 = this.H;
            if (b2Var8 != null) {
                b2Var8.setText(org.telegram.messenger.bd.M0(2131743664, null));
                org.telegram.ui.Cells.b2 b2Var9 = this.H;
                int i13 = org.telegram.ui.ActionBar.k6.p7;
                b2Var9.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.r6.V(this.H, i13, null);
                ja jaVar5 = this.G;
                if (jaVar5 != null) {
                    ja.a(jaVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = k0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.b2 b2Var10 = this.H;
                    if (b2Var10 != null) {
                        b2Var10.setText(org.telegram.messenger.bd.a0("UsernameAvailable", null, 2131743677, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.H;
                        int i14 = org.telegram.ui.ActionBar.k6.w6;
                        b2Var11.setTag(Integer.valueOf(i14));
                        org.telegram.ui.ActionBar.r6.V(this.H, i14, null);
                        ja jaVar6 = this.G;
                        if (jaVar6 != null) {
                            ja.a(jaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.H;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.bd.M0(2131743676, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.H;
                    int i15 = org.telegram.ui.ActionBar.k6.F6;
                    b2Var13.setTag(Integer.valueOf(i15));
                    org.telegram.ui.ActionBar.r6.V(this.H, i15, null);
                    ja jaVar7 = this.G;
                    if (jaVar7 != null) {
                        ja.a(jaVar7);
                    }
                }
                this.f = str;
                org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(23, this, str);
                this.h = l0Var2;
                org.telegram.messenger.g0.i3(l0Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.b2 b2Var14 = this.H;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.bd.M0(2131743665, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.H;
                int i16 = org.telegram.ui.ActionBar.k6.p7;
                b2Var15.setTag(Integer.valueOf(i16));
                org.telegram.ui.ActionBar.r6.V(this.H, i16, null);
                ja jaVar8 = this.G;
                if (jaVar8 != null) {
                    ja.a(jaVar8);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        fa faVar = this.E;
        if (faVar != null) {
            if (!faVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.a.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.K3(this.E.a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j10 = this.y;
        return j10 != 0 ? org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10)) : org.telegram.messenger.h10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j10 = this.y;
        return j10 != 0 ? j10 : org.telegram.messenger.h10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
            View childAt = this.b.getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i3 == 0) {
                org.telegram.messenger.g0.H3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ja) {
                org.telegram.messenger.g0.H3(childAt);
            } else if (childAt instanceof fa) {
                fa faVar = (fa) childAt;
                org.telegram.messenger.g0.H3(faVar.a);
                org.telegram.messenger.g0.H3(faVar.b);
            }
        }
        org.telegram.messenger.p2.E.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(int i3, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int min;
        int i10 = i3 - 4;
        if (i10 >= 0) {
            ArrayList arrayList = this.w;
            if (i10 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i10)) != null) {
                tL_username.active = z10;
                int i11 = -1;
                if (!z10) {
                    int i12 = -1;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((TLRPC.TL_username) arrayList.get(i13)).active) {
                            i12 = i13;
                        }
                    }
                    if (i12 >= 0) {
                        min = Math.min(arrayList.size() - 1, i12 + 1);
                        i11 = min + 4;
                    }
                    if (this.b != null) {
                    }
                    if (i11 >= 0) {
                        return;
                    } else {
                        return;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        i14 = -1;
                        break;
                    } else if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 >= 0) {
                    min = Math.max(0, i14 - 1);
                    i11 = min + 4;
                }
                if (this.b != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.b.getChildCount()) {
                            break;
                        }
                        View childAt = this.b.getChildAt(i15);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i3) {
                            if (z11) {
                                org.telegram.messenger.g0.F3(childAt);
                            }
                            if (childAt instanceof ha) {
                                ha haVar = (ha) childAt;
                                haVar.setLoading(this.x.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = haVar.w;
                                if (tL_username2 != null) {
                                    haVar.a(tL_username2, haVar.x, true, haVar.y);
                                }
                            }
                        } else {
                            i15++;
                        }
                    }
                }
                if (i11 >= 0 || i3 == i11) {
                    return;
                }
                da daVar = this.c;
                int i16 = i11 - 4;
                ArrayList arrayList2 = daVar.c.w;
                if (i10 >= arrayList2.size() || i16 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i16, (TLRPC.TL_username) arrayList2.remove(i10));
                daVar.j(i3, i11);
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    daVar.g(i17 + 4);
                }
            }
        }
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i3) == tL_username) {
                n0(i3 + 4, z10, z11);
                return;
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
            return;
        }
        j0(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            j0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
