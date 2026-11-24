// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class me1 extends d {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public ge1 E;
    public ie1 F;
    public le1 G;
    public ke1 H;
    public sha a;
    public o39 b;
    public fe1 c;
    public boolean d;
    public int e;
    public String f;
    public q21 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public me1(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final boolean b0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        ke1 ke1Var = this.H;
        if (ke1Var != null) {
            ke1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            le1 le1Var = this.G;
            if (le1Var != null) {
                int i = le1.f;
                le1Var.a();
            }
        }
        q21 q21Var = this.h;
        if (q21Var != null) {
            gl.r(q21Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                ke1 ke1Var2 = this.H;
                if (ke1Var2 != null) {
                    ke1Var2.setText(k96.M0(2131743417, null));
                    ke1 ke1Var3 = this.H;
                    int i2 = bkb.o7;
                    ke1Var3.setTag(Integer.valueOf(i2));
                    zkb.X(this.H, i2, null);
                    le1 le1Var2 = this.G;
                    if (le1Var2 != null) {
                        int i3 = le1.f;
                        le1Var2.a();
                        return false;
                    }
                }
            } else {
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (i4 == 0 && charAt >= '0' && charAt <= '9') {
                        ke1 ke1Var4 = this.H;
                        if (ke1Var4 != null) {
                            ke1Var4.setText(k96.M0(2131743413, null));
                            ke1 ke1Var5 = this.H;
                            int i5 = bkb.o7;
                            ke1Var5.setTag(Integer.valueOf(i5));
                            zkb.X(this.H, i5, null);
                            le1 le1Var3 = this.G;
                            if (le1Var3 != null) {
                                int i6 = le1.f;
                                le1Var3.a();
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        ke1 ke1Var6 = this.H;
                        if (ke1Var6 != null) {
                            ke1Var6.setText(k96.M0(2131743417, null));
                            ke1 ke1Var7 = this.H;
                            int i7 = bkb.o7;
                            ke1Var7.setTag(Integer.valueOf(i7));
                            zkb.X(this.H, i7, null);
                            le1 le1Var4 = this.G;
                            if (le1Var4 != null) {
                                int i8 = le1.f;
                                le1Var4.a();
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            ke1 ke1Var8 = this.H;
            if (ke1Var8 != null) {
                ke1Var8.setText(k96.M0(2131743415, null));
                ke1 ke1Var9 = this.H;
                int i9 = bkb.o7;
                ke1Var9.setTag(Integer.valueOf(i9));
                zkb.X(this.H, i9, null);
                le1 le1Var5 = this.G;
                if (le1Var5 != null) {
                    int i10 = le1.f;
                    le1Var5.a();
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = d0().username;
                if (str2 == null) {
                    str2 = "";
                }
                boolean equals = str.equals(str2);
                ke1 ke1Var10 = this.H;
                if (equals) {
                    if (ke1Var10 != null) {
                        ke1Var10.setText(k96.a0("UsernameAvailable", null, 2131743428, str));
                        ke1 ke1Var11 = this.H;
                        int i11 = bkb.v6;
                        ke1Var11.setTag(Integer.valueOf(i11));
                        zkb.X(this.H, i11, null);
                        le1 le1Var6 = this.G;
                        if (le1Var6 != null) {
                            int i12 = le1.f;
                            le1Var6.a();
                        }
                    }
                    return true;
                }
                if (ke1Var10 != null) {
                    ke1Var10.setText(k96.M0(2131743427, null));
                    ke1 ke1Var12 = this.H;
                    int i13 = bkb.E6;
                    ke1Var12.setTag(Integer.valueOf(i13));
                    zkb.X(this.H, i13, null);
                    le1 le1Var7 = this.G;
                    if (le1Var7 != null) {
                        int i14 = le1.f;
                        le1Var7.a();
                    }
                }
                this.f = str;
                q21 q21Var2 = new q21(this, str, (byte) 17);
                this.h = q21Var2;
                gl.e3(q21Var2, 300L);
                return true;
            }
            ke1 ke1Var13 = this.H;
            if (ke1Var13 != null) {
                ke1Var13.setText(k96.M0(2131743416, null));
                ke1 ke1Var14 = this.H;
                int i15 = bkb.o7;
                ke1Var14.setTag(Integer.valueOf(i15));
                zkb.X(this.H, i15, null);
                le1 le1Var8 = this.G;
                if (le1Var8 != null) {
                    int i16 = le1.f;
                    le1Var8.a();
                    return false;
                }
            }
        }
        return false;
    }

    public final void c0(boolean z) {
        ge1 ge1Var = this.E;
        if (ge1Var != null) {
            if (!ge1Var.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.a.requestFocus();
            if (z) {
                gl.F3(this.E.a);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131743435, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 18));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(e0()));
        if (V1 == null) {
            V1 = d0();
        }
        if (V1 != null) {
            this.r = null;
            if (V1.usernames != null) {
                int i = 0;
                while (true) {
                    if (i >= V1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = V1.usernames.get(i);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i++;
                }
            }
            String str2 = this.r;
            if (str2 == null && (str = V1.username) != null) {
                this.r = str;
                str2 = str;
            }
            if (str2 == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i2 = 0; i2 < V1.usernames.size(); i2++) {
                if (V1.usernames.get(i2).active) {
                    arrayList.add(V1.usernames.get(i2));
                }
            }
            for (int i3 = 0; i3 < V1.usernames.size(); i3++) {
                if (!V1.usernames.get(i3).active) {
                    arrayList.add(V1.usernames.get(i3));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setLayoutManager(new t26());
        o39 o39Var2 = this.b;
        fe1 fe1Var = new fe1(this);
        this.c = fe1Var;
        o39Var2.setAdapter(fe1Var);
        zkb.J(this.b, bkb.h6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new is5(new r10(this, (byte) 2)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, nme.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new p8((byte) 23));
        this.b.setOnItemClickListener(new de1(this));
        gl.e3(new nv0(this, (byte) 20), 40L);
        return this.fragmentView;
    }

    public final TLRPC.User d0() {
        long j = this.y;
        int i = this.currentAccount;
        return j != 0 ? na7.q1(i).V1(Long.valueOf(j)) : y6c.h(i).f();
    }

    public final long e0() {
        long j = this.y;
        return j != 0 ? j : y6c.h(this.currentAccount).e();
    }

    public final /* synthetic */ void f0(String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        this.e = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkusername, new en0((Object) this, (Object) str, (Object) checkusername, (byte) 11), 2);
    }

    public final /* synthetic */ void g0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(hd hdVar, TLRPC.User user) {
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        na7.q1(this.currentAccount).a4(arrayList, false);
        ad7.Y(this.currentAccount).j1(arrayList, null, false, true);
        y6c.h(this.currentAccount).u(true);
        finishFragment();
    }

    public final void i0(hd hdVar, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ij.c0(this.currentAccount, tL_error, this, updateusername, new Object[0]);
        l0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.y != 0) {
            finishFragment();
            return;
        }
        byte b = 1;
        if (this.r.startsWith("@")) {
            this.r = this.r.substring(1);
        }
        if (!this.r.isEmpty() && !b0(this.r)) {
            l0();
            return;
        }
        TLRPC.User d0 = d0();
        if (getParentActivity() == null || d0 == null) {
            return;
        }
        String o = l7c.o(d0);
        if (o == null) {
            o = "";
        }
        if (o.equals(this.r)) {
            finishFragment();
            return;
        }
        hd hdVar = new hd(3, null, getParentActivity());
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = this.r;
        kk7 f = kk7.f(this.currentAccount);
        int i = na7.q5;
        f.k(2, 1);
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateusername, new en0((Object) this, (Object) hdVar, (Object) updateusername, (byte) 10), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
        hdVar.setOnCancelListener(new xs0(this, sendRequest, b));
        hdVar.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_bots.reorderUsernames reorderusernames;
        if (this.d) {
            byte b = 0;
            this.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            int i = 0;
            while (true) {
                arrayList = this.s;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList.get(i)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i)).username);
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                arrayList2 = this.w;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList2.get(i2)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i2)).username);
                }
                i2++;
            }
            long j = this.y;
            if (j == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = na7.q1(this.currentAccount).m1(j);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            getConnectionsManager().sendRequest(reorderusernames, new ce2(b));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(e0()));
            V1.usernames = arrayList4;
            na7.q1(this.currentAccount).Z3(V1, false, true);
        }
    }

    public final void l0() {
        if (this.b == null) {
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof ld5) && i == 0) {
                gl.C3(((ld5) childAt).getTextView());
            } else if (childAt instanceof le1) {
                gl.C3(childAt);
            } else if (childAt instanceof ge1) {
                ge1 ge1Var = (ge1) childAt;
                gl.C3(ge1Var.a);
                gl.C3(ge1Var.b);
            }
        }
        pw0.E.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(int i, boolean z, boolean z2) {
        TLRPC.TL_username tL_username;
        int min;
        int i2 = i - 4;
        if (i2 >= 0) {
            ArrayList arrayList = this.w;
            if (i2 >= arrayList.size() || (tL_username = (TLRPC.TL_username) arrayList.get(i2)) == null) {
                return;
            }
            tL_username.active = z;
            int i3 = -1;
            if (!z) {
                int i4 = -1;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (((TLRPC.TL_username) arrayList.get(i5)).active) {
                        i4 = i5;
                    }
                }
                if (i4 >= 0) {
                    min = Math.min(arrayList.size() - 1, i4 + 1);
                    i3 = min + 4;
                }
                if (this.b != null) {
                }
                if (i3 >= 0) {
                    return;
                } else {
                    return;
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    i6 = -1;
                    break;
                } else if (!((TLRPC.TL_username) arrayList.get(i6)).active) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 >= 0) {
                min = Math.max(0, i6 - 1);
                i3 = min + 4;
            }
            if (this.b != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.b.getChildCount()) {
                        break;
                    }
                    View childAt = this.b.getChildAt(i7);
                    this.b.getClass();
                    if (RecyclerView.R(childAt) == i) {
                        if (z2) {
                            gl.A3(childAt);
                        }
                        if (childAt instanceof ie1) {
                            ie1 ie1Var = (ie1) childAt;
                            ie1Var.setLoading(this.x.contains(tL_username.username));
                            TLRPC.TL_username tL_username2 = ie1Var.w;
                            if (tL_username2 != null) {
                                ie1Var.a(tL_username2, ie1Var.x, true, ie1Var.y);
                            }
                        }
                    } else {
                        i7++;
                    }
                }
            }
            if (i3 >= 0 || i == i3) {
                return;
            }
            fe1 fe1Var = this.c;
            int i8 = i3 - 4;
            ArrayList arrayList2 = fe1Var.c.w;
            if (i2 >= arrayList2.size() || i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.add(i8, (TLRPC.TL_username) arrayList2.remove(i2));
            fe1Var.j(i, i3);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                fe1Var.g(i9 + 4);
            }
        }
    }

    public final void n0(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == tL_username) {
                m0(i + 4, z, z2);
                return;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (na7.c1().getBoolean("view_animations", true)) {
            return;
        }
        c0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            c0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
