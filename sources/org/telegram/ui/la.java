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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class la extends org.telegram.ui.ActionBar.f2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public ga D;
    public ia E;
    public ka F;
    public org.telegram.ui.Cells.b2 G;
    public org.telegram.ui.ActionBar.b5 a;
    public org.telegram.ui.Components.pj0 b;
    public ea c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.ui.ActionBar.p h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public la(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    public static void Z(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.m0();
    }

    public static /* synthetic */ void b0(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new z9(laVar, str, checkusername, 0), 2);
    }

    public static void c0(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.qp.s1(laVar.currentAccount).Y3(arrayList, false);
        org.telegram.messenger.yr.a0(laVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.p10.i(laVar.currentAccount).v(true);
        laVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = laVar.y;
        ArrayList arrayList = laVar.w;
        ArrayList arrayList2 = laVar.s;
        if (laVar.d) {
            laVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                if (((TLRPC.TL_username) arrayList2.get(i7)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i7)).username);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
                }
            }
            if (j3 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = org.telegram.messenger.qp.s1(laVar.currentAccount).o1(j3);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            laVar.getConnectionsManager().sendRequest(reorderusernames, new di.u5(15));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User a22 = org.telegram.messenger.qp.s1(laVar.currentAccount).a2(Long.valueOf(laVar.l0()));
            a22.usernames = arrayList4;
            org.telegram.messenger.qp.s1(laVar.currentAccount).X3(a22, false, true);
        }
    }

    public static void e0(la laVar) {
        if (laVar.y != 0) {
            laVar.finishFragment();
            return;
        }
        int i7 = 1;
        if (laVar.r.startsWith("@")) {
            laVar.r = laVar.r.substring(1);
        }
        if (!laVar.r.isEmpty() && !laVar.i0(laVar.r)) {
            laVar.m0();
            return;
        }
        TLRPC.User k02 = laVar.k0();
        if (laVar.getParentActivity() == null || k02 == null) {
            return;
        }
        String n10 = org.telegram.messenger.t10.n(k02);
        if (n10 == null) {
            n10 = "";
        }
        if (n10.equals(laVar.r)) {
            laVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, laVar.getParentActivity(), null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = laVar.r;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(laVar.currentAccount);
        int i10 = org.telegram.messenger.qp.C8;
        f10.k(org.telegram.messenger.qs.r, 1);
        int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new z9(laVar, u1Var, updateusername, i7), 2);
        ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
        u1Var.setOnCancelListener(new bi.g0(laVar, sendRequest, i7));
        u1Var.show();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        String str;
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743677, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, i7));
        this.a = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(l0()));
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
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        ea eaVar = new ea(this);
        this.c = eaVar;
        pj0Var2.setAdapter(eaVar);
        org.telegram.ui.ActionBar.r6.K(this.b, org.telegram.ui.ActionBar.k6.i6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new v4.y(new ei.d(this, i7)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, c8.ha.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ei.b(6));
        this.b.setOnItemClickListener(new ca(this));
        org.telegram.messenger.g0.i3(new gq0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean i0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            ka kaVar = this.F;
            if (kaVar != null) {
                ka.a(kaVar);
            }
        }
        org.telegram.ui.ActionBar.p pVar = this.h;
        if (pVar != null) {
            org.telegram.messenger.g0.r(pVar);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.b2 b2Var2 = this.G;
                if (b2Var2 != null) {
                    b2Var2.setText(org.telegram.messenger.id.M0(2131743659, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.G;
                    int i7 = org.telegram.ui.ActionBar.k6.p7;
                    b2Var3.setTag(Integer.valueOf(i7));
                    org.telegram.ui.ActionBar.r6.V(this.G, i7, null);
                    ka kaVar2 = this.F;
                    if (kaVar2 != null) {
                        ka.a(kaVar2);
                        return false;
                    }
                }
            } else {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var4 = this.G;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.id.M0(2131743655, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.G;
                            int i11 = org.telegram.ui.ActionBar.k6.p7;
                            b2Var5.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.r6.V(this.G, i11, null);
                            ka kaVar3 = this.F;
                            if (kaVar3 != null) {
                                ka.a(kaVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var6 = this.G;
                        if (b2Var6 != null) {
                            b2Var6.setText(org.telegram.messenger.id.M0(2131743659, null));
                            org.telegram.ui.Cells.b2 b2Var7 = this.G;
                            int i12 = org.telegram.ui.ActionBar.k6.p7;
                            b2Var7.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.r6.V(this.G, i12, null);
                            ka kaVar4 = this.F;
                            if (kaVar4 != null) {
                                ka.a(kaVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.b2 b2Var8 = this.G;
            if (b2Var8 != null) {
                b2Var8.setText(org.telegram.messenger.id.M0(2131743657, null));
                org.telegram.ui.Cells.b2 b2Var9 = this.G;
                int i13 = org.telegram.ui.ActionBar.k6.p7;
                b2Var9.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.r6.V(this.G, i13, null);
                ka kaVar5 = this.F;
                if (kaVar5 != null) {
                    ka.a(kaVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = k0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.b2 b2Var10 = this.G;
                    if (b2Var10 != null) {
                        b2Var10.setText(org.telegram.messenger.id.a0("UsernameAvailable", null, 2131743670, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.G;
                        int i14 = org.telegram.ui.ActionBar.k6.w6;
                        b2Var11.setTag(Integer.valueOf(i14));
                        org.telegram.ui.ActionBar.r6.V(this.G, i14, null);
                        ka kaVar6 = this.F;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.G;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.id.M0(2131743669, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.G;
                    int i15 = org.telegram.ui.ActionBar.k6.F6;
                    b2Var13.setTag(Integer.valueOf(i15));
                    org.telegram.ui.ActionBar.r6.V(this.G, i15, null);
                    ka kaVar7 = this.F;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f = str;
                org.telegram.ui.ActionBar.p pVar2 = new org.telegram.ui.ActionBar.p(18, this, str);
                this.h = pVar2;
                org.telegram.messenger.g0.i3(pVar2, 300L);
                return true;
            }
            org.telegram.ui.Cells.b2 b2Var14 = this.G;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.id.M0(2131743658, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.G;
                int i16 = org.telegram.ui.ActionBar.k6.p7;
                b2Var15.setTag(Integer.valueOf(i16));
                org.telegram.ui.ActionBar.r6.V(this.G, i16, null);
                ka kaVar8 = this.F;
                if (kaVar8 != null) {
                    ka.a(kaVar8);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        ga gaVar = this.D;
        if (gaVar != null) {
            if (!gaVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.D.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.D.a.requestFocus();
            if (z9) {
                org.telegram.messenger.g0.K3(this.D.a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j3 = this.y;
        return j3 != 0 ? org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3)) : org.telegram.messenger.p10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j3 = this.y;
        return j3 != 0 ? j3 : org.telegram.messenger.p10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
            View childAt = this.b.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i7 == 0) {
                org.telegram.messenger.g0.H3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                org.telegram.messenger.g0.H3(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                org.telegram.messenger.g0.H3(gaVar.a);
                org.telegram.messenger.g0.H3(gaVar.b);
            }
        }
        org.telegram.messenger.p2.D.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(int i7, boolean z9, boolean z10) {
        TLRPC.TL_username tL_username;
        int min;
        int i10 = i7 - 4;
        if (i10 >= 0) {
            ArrayList arrayList = this.w;
            if (i10 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i10)) != null) {
                tL_username.active = z9;
                int i11 = -1;
                if (!z9) {
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
                        if (RecyclerView.R(childAt) == i7) {
                            if (z10) {
                                org.telegram.messenger.g0.F3(childAt);
                            }
                            if (childAt instanceof ia) {
                                ia iaVar = (ia) childAt;
                                iaVar.setLoading(this.x.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = iaVar.w;
                                if (tL_username2 != null) {
                                    iaVar.a(tL_username2, iaVar.x, true, iaVar.y);
                                }
                            }
                        } else {
                            i15++;
                        }
                    }
                }
                if (i11 >= 0 || i7 == i11) {
                    return;
                }
                ea eaVar = this.c;
                int i16 = i11 - 4;
                ArrayList arrayList2 = eaVar.c.w;
                if (i10 >= arrayList2.size() || i16 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i16, (TLRPC.TL_username) arrayList2.remove(i10));
                eaVar.j(i7, i11);
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    eaVar.g(i17 + 4);
                }
            }
        }
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z9, boolean z10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i7) == tL_username) {
                n0(i7 + 4, z9, z10);
                return;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
            return;
        }
        j0(false);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            j0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
