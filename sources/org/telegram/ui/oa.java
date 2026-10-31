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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oa extends org.telegram.ui.ActionBar.k2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public ia D;
    public la E;
    public na F;
    public org.telegram.ui.Cells.b2 G;
    public org.telegram.ui.ActionBar.l5 a;
    public org.telegram.ui.Components.tk0 b;
    public ga c;
    public boolean d;
    public int e;
    public String f;
    public h0 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public oa(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    public static void Y(oa oaVar, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Components.s4.e0(oaVar.currentAccount, tL_error, oaVar, updateusername, new Object[0]);
        oaVar.l0();
    }

    public static /* synthetic */ void a0(oa oaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        oaVar.e = ConnectionsManager.getInstance(oaVar.currentAccount).sendRequest(checkusername, new aa(oaVar, str, checkusername, 0), 2);
    }

    public static void b0(oa oaVar, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.User user) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.vp.r1(oaVar.currentAccount).V3(arrayList, false);
        org.telegram.messenger.hs.a0(oaVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.d20.i(oaVar.currentAccount).v(true);
        oaVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(oa oaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = oaVar.y;
        ArrayList arrayList = oaVar.w;
        ArrayList arrayList2 = oaVar.s;
        if (oaVar.d) {
            oaVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
                }
            }
            if (j10 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = org.telegram.messenger.vp.r1(oaVar.currentAccount).n1(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            oaVar.getConnectionsManager().sendRequest(reorderusernames, new ag.c3(10));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(oaVar.currentAccount).Z1(Long.valueOf(oaVar.k0()));
            Z1.usernames = arrayList4;
            org.telegram.messenger.vp.r1(oaVar.currentAccount).U3(Z1, false, true);
        }
    }

    public static void d0(oa oaVar) {
        if (oaVar.y != 0) {
            oaVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (oaVar.r.startsWith("@")) {
            oaVar.r = oaVar.r.substring(1);
        }
        if (!oaVar.r.isEmpty() && !oaVar.h0(oaVar.r)) {
            oaVar.l0();
            return;
        }
        TLRPC.User j02 = oaVar.j0();
        if (oaVar.getParentActivity() == null || j02 == null) {
            return;
        }
        String n10 = org.telegram.messenger.h20.n(j02);
        if (n10 == null) {
            n10 = "";
        }
        if (n10.equals(oaVar.r)) {
            oaVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, oaVar.getParentActivity(), null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = oaVar.r;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(oaVar.currentAccount);
        int i11 = org.telegram.messenger.vp.D8;
        f7.k(org.telegram.messenger.zs.r, 1);
        int sendRequest = ConnectionsManager.getInstance(oaVar.currentAccount).sendRequest(updateusername, new aa(oaVar, x1Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(oaVar.currentAccount).bindRequestToGuid(sendRequest, oaVar.classGuid);
        x1Var.setOnCancelListener(new ba(oaVar, sendRequest, 0));
        x1Var.show();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131743700, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 21));
        this.a = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(k0()));
        if (Z1 == null) {
            Z1 = j0();
        }
        int i10 = 0;
        if (Z1 != null) {
            this.r = null;
            if (Z1.usernames != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= Z1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = Z1.usernames.get(i11);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i11++;
                }
            }
            if (this.r == null && (str = Z1.username) != null) {
                this.r = str;
            }
            if (this.r == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i12 = 0; i12 < Z1.usernames.size(); i12++) {
                if (Z1.usernames.get(i12).active) {
                    arrayList.add(Z1.usernames.get(i12));
                }
            }
            for (int i13 = 0; i13 < Z1.usernames.size(); i13++) {
                if (!Z1.usernames.get(i13).active) {
                    arrayList.add(Z1.usernames.get(i13));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
        ga gaVar = new ga(this);
        this.c = gaVar;
        tk0Var2.setAdapter(gaVar);
        org.telegram.ui.ActionBar.a7.K(this.b, org.telegram.ui.ActionBar.t6.i6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new s4.x(new ja(this, i10)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, w7.b6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(5));
        this.b.setOnItemClickListener(new ea(this));
        org.telegram.messenger.i0.h3(new rr0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean h0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            na naVar = this.F;
            if (naVar != null) {
                na.a(naVar);
            }
        }
        h0 h0Var = this.h;
        if (h0Var != null) {
            org.telegram.messenger.i0.r(h0Var);
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
                    b2Var2.setText(org.telegram.messenger.cd.L0(2131743682, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.G;
                    int i10 = org.telegram.ui.ActionBar.t6.p7;
                    b2Var3.setTag(Integer.valueOf(i10));
                    org.telegram.ui.ActionBar.a7.V(this.G, i10, null);
                    na naVar2 = this.F;
                    if (naVar2 != null) {
                        na.a(naVar2);
                        return false;
                    }
                }
            } else {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var4 = this.G;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.cd.L0(2131743678, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.G;
                            int i12 = org.telegram.ui.ActionBar.t6.p7;
                            b2Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.a7.V(this.G, i12, null);
                            na naVar3 = this.F;
                            if (naVar3 != null) {
                                na.a(naVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var6 = this.G;
                        if (b2Var6 != null) {
                            b2Var6.setText(org.telegram.messenger.cd.L0(2131743682, null));
                            org.telegram.ui.Cells.b2 b2Var7 = this.G;
                            int i13 = org.telegram.ui.ActionBar.t6.p7;
                            b2Var7.setTag(Integer.valueOf(i13));
                            org.telegram.ui.ActionBar.a7.V(this.G, i13, null);
                            na naVar4 = this.F;
                            if (naVar4 != null) {
                                na.a(naVar4);
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
                b2Var8.setText(org.telegram.messenger.cd.L0(2131743680, null));
                org.telegram.ui.Cells.b2 b2Var9 = this.G;
                int i14 = org.telegram.ui.ActionBar.t6.p7;
                b2Var9.setTag(Integer.valueOf(i14));
                org.telegram.ui.ActionBar.a7.V(this.G, i14, null);
                na naVar5 = this.F;
                if (naVar5 != null) {
                    na.a(naVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = j0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.b2 b2Var10 = this.G;
                    if (b2Var10 != null) {
                        b2Var10.setText(org.telegram.messenger.cd.a0("UsernameAvailable", null, 2131743693, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.G;
                        int i15 = org.telegram.ui.ActionBar.t6.w6;
                        b2Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.a7.V(this.G, i15, null);
                        na naVar6 = this.F;
                        if (naVar6 != null) {
                            na.a(naVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.G;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.cd.L0(2131743692, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.G;
                    int i16 = org.telegram.ui.ActionBar.t6.F6;
                    b2Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.a7.V(this.G, i16, null);
                    na naVar7 = this.F;
                    if (naVar7 != null) {
                        na.a(naVar7);
                    }
                }
                this.f = str;
                h0 h0Var2 = new h0(12, this, str);
                this.h = h0Var2;
                org.telegram.messenger.i0.h3(h0Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.b2 b2Var14 = this.G;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.cd.L0(2131743681, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.G;
                int i17 = org.telegram.ui.ActionBar.t6.p7;
                b2Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.a7.V(this.G, i17, null);
                na naVar8 = this.F;
                if (naVar8 != null) {
                    na.a(naVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void i0(boolean z10) {
        ia iaVar = this.D;
        if (iaVar != null) {
            if (!iaVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.D.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.D.a.requestFocus();
            if (z10) {
                org.telegram.messenger.i0.J3(this.D.a);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final TLRPC.User j0() {
        long j10 = this.y;
        return j10 != 0 ? org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(j10)) : org.telegram.messenger.d20.i(this.currentAccount).f();
    }

    public final long k0() {
        long j10 = this.y;
        return j10 != 0 ? j10 : org.telegram.messenger.d20.i(this.currentAccount).e();
    }

    public final void l0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && i10 == 0) {
                org.telegram.messenger.i0.G3(((org.telegram.ui.Cells.p4) childAt).getTextView());
            } else if (childAt instanceof na) {
                org.telegram.messenger.i0.G3(childAt);
            } else if (childAt instanceof ia) {
                ia iaVar = (ia) childAt;
                org.telegram.messenger.i0.G3(iaVar.a);
                org.telegram.messenger.i0.G3(iaVar.b);
            }
        }
        org.telegram.messenger.t2.D.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(int i10, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int min;
        int i11 = i10 - 4;
        if (i11 >= 0) {
            ArrayList arrayList = this.w;
            if (i11 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                tL_username.active = z10;
                int i12 = -1;
                if (!z10) {
                    int i13 = -1;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((TLRPC.TL_username) arrayList.get(i14)).active) {
                            i13 = i14;
                        }
                    }
                    if (i13 >= 0) {
                        min = Math.min(arrayList.size() - 1, i13 + 1);
                        i12 = min + 4;
                    }
                    if (this.b != null) {
                    }
                    if (i12 >= 0) {
                        return;
                    } else {
                        return;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    } else if (!((TLRPC.TL_username) arrayList.get(i15)).active) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 >= 0) {
                    min = Math.max(0, i15 - 1);
                    i12 = min + 4;
                }
                if (this.b != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.b.getChildCount()) {
                            break;
                        }
                        View childAt = this.b.getChildAt(i16);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i10) {
                            if (z11) {
                                org.telegram.messenger.i0.E3(childAt);
                            }
                            if (childAt instanceof la) {
                                la laVar = (la) childAt;
                                laVar.setLoading(this.x.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = laVar.w;
                                if (tL_username2 != null) {
                                    laVar.a(tL_username2, laVar.x, true, laVar.y);
                                }
                            }
                        } else {
                            i16++;
                        }
                    }
                }
                if (i12 >= 0 || i10 == i12) {
                    return;
                }
                ga gaVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = gaVar.c.w;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                gaVar.j(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    gaVar.g(i18 + 4);
                }
            }
        }
    }

    public final void n0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) == tL_username) {
                m0(i10 + 4, z10, z11);
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.vp.d1().getBoolean("view_animations", true)) {
            return;
        }
        i0(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            i0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
