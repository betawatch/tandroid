package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public ix5 a;
    private int autoTranslationPosition;
    public o39 b;
    public ix5 c;
    public g24 d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int n;
    public int r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        char c = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131748862, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, b));
        xha a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q10(this, (byte) 14);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.a = new ix5(this, context, false, 0 == true ? 1 : 0);
        this.c = new ix5(this, context, c == true ? 1 : 0, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        g24Var.setText(k96.M0(2131747975, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        hx5 hx5Var = new hx5(this);
        hx5Var.n(400L);
        hx5Var.C = false;
        hx5Var.o(s33.h);
        this.b.setItemAnimator(hx5Var);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new bf4(this, (byte) 8));
        this.b.setOnItemLongClickListener(new ry4((Object) this, (byte) 20));
        this.b.setOnScrollListener(new ao2(this, (byte) 22));
        return this.fragmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        fx5 fx5Var = new fx5(k96.D0().B, 0 == true ? 1 : 0);
        this.f = new ArrayList();
        this.h = new ArrayList(k96.D0().K);
        ArrayList arrayList = k96.D0().J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i96 i96Var = (i96) arrayList.get(i);
            if (i96Var.k != Integer.MAX_VALUE) {
                this.f.add(i96Var);
            } else {
                this.h.add(i96Var);
            }
        }
        Collections.sort(this.f, fx5Var);
        Collections.sort(this.h, fx5Var);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.A4 || this.a == null) {
            return;
        }
        d0();
        gl.d3(new ex5(this, (byte) 2));
    }

    public final boolean e0() {
        return getMessagesController().i4.t();
    }

    public final boolean f0() {
        return getMessagesController().i4.r();
    }

    public final void g0() {
        this.simpleActionBar.n(true);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.b, 0, new Class[]{xw5.class}, new String[]{"checkImage"}, (Drawable[]) null, (alb) null, bkb.Ci));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(int i, View view) {
        i96 i96Var;
        byte b = 1;
        try {
            ahb ahbVar = null;
            Object[] objArr = 0;
            if (view instanceof ahb) {
                boolean z = f0() || e0();
                int i2 = this.manualTranslationPosition;
                int i3 = kk7.C1;
                if (i == i2) {
                    boolean z2 = !f0();
                    b1c b1cVar = getMessagesController().i4;
                    SharedPreferences.Editor edit = b1cVar.n.X3.edit();
                    b1cVar.s = Boolean.valueOf(z2);
                    edit.putBoolean("translate_button", z2).apply();
                    ((ahb) view).setChecked(z2);
                    kk7.f(this.currentAccount).k(i3, new Object[0]);
                } else if (i == this.autoTranslationPosition) {
                    boolean e0 = e0();
                    boolean z3 = !e0;
                    if (!e0 && !getUserConfig().p()) {
                        showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 13, false));
                        return;
                    }
                    b1c b1cVar2 = getMessagesController().i4;
                    SharedPreferences.Editor edit2 = b1cVar2.n.X3.edit();
                    b1cVar2.r = Boolean.valueOf(z3);
                    edit2.putBoolean("translate_chat_button", z3).apply();
                    kk7.f(this.currentAccount).k(i3, new Object[0]);
                    ((ahb) view).setChecked(z3);
                }
                boolean z4 = f0() || e0();
                if (z4 != z) {
                    int i4 = this.autoTranslationPosition;
                    if (i4 < 0) {
                        i4 = this.manualTranslationPosition;
                    }
                    for (int i5 = 0; i5 < this.b.getChildCount(); i5++) {
                        View childAt = this.b.getChildAt(i5);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i4 && (childAt instanceof ahb)) {
                            ahbVar = (ahb) childAt;
                        }
                    }
                    if (ahbVar != null) {
                        ahbVar.setDivider(z4);
                    }
                    ix5 ix5Var = this.a;
                    int i6 = i4 + 1;
                    if (z4) {
                        ix5Var.i(i6);
                        return;
                    } else {
                        ix5Var.r(i6);
                        return;
                    }
                }
                return;
            }
            if (view instanceof uib) {
                presentFragment(new qa9());
                return;
            }
            if (getParentActivity() == null || this.parentLayout == null || !(view instanceof yhb)) {
                return;
            }
            Object[] objArr2 = this.b.getAdapter() == this.c;
            if (objArr2 == false) {
                i -= this.r;
            }
            if (objArr2 == true) {
                i96Var = (i96) this.e.get(i);
            } else if (this.h.isEmpty() || i < 0 || i >= this.h.size()) {
                if (!this.h.isEmpty()) {
                    i -= this.h.size() + 1;
                }
                i96Var = (i96) this.f.get(i);
            } else {
                i96Var = (i96) this.h.get(i);
            }
            i96 i96Var2 = i96Var;
            if (i96Var2 != null) {
                i96 i96Var3 = k96.D0().B;
                boolean z5 = i96Var3 == i96Var2;
                hd hdVar = new hd(3, null, getParentActivity());
                if (!z5) {
                    hdVar.q(500L);
                }
                b1c b1cVar3 = getMessagesController().i4;
                b1cVar3.c.clear();
                b1cVar3.e.clear();
                int c = k96.D0().c(i96Var2, true, false, false, true, this.currentAccount, new mn6((Object) this, (Object) hdVar, z5, (byte) 27));
                if (c != 0) {
                    hdVar.setOnCancelListener(new a01(c, b));
                }
                String str = i96Var2.f;
                String str2 = i96Var3.f;
                HashSet b0 = qa9.b0();
                HashSet hashSet = new HashSet(b0);
                if (b0.contains(str2) && !b0.contains(str)) {
                    Collection.-EL.removeIf(hashSet, new gx5(str2, objArr == true ? 1 : 0));
                }
                if (str != null && !"null".equals(str)) {
                    hashSet.add(str);
                }
                qa9.e0(hashSet, Boolean.FALSE);
                na7.q1(this.currentAccount).i4.f();
                na7.q1(this.currentAccount).i4.h();
                b1c.P = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void i0(i96 i96Var) {
        k96 D0 = k96.D0();
        int i = this.currentAccount;
        if (i96Var.d != null) {
            if (!i96Var.i() || i96Var.k == Integer.MAX_VALUE) {
                if (D0.B == i96Var) {
                    i96 F0 = D0.z.getLanguage() != null ? D0.F0(D0.z.getLanguage()) : null;
                    if (F0 == null) {
                        F0 = D0.F0(k96.H0(D0.z));
                    }
                    if (F0 == null) {
                        F0 = D0.F0("en");
                    }
                    D0.d(F0, true, false, i);
                }
                D0.K.remove(i96Var);
                D0.L.remove(i96Var);
                D0.M.remove(i96Var.b());
                D0.O.remove(i96Var);
                D0.J.remove(i96Var);
                D0.N.remove(i96Var.b());
                new File(i96Var.d).delete();
                D0.a1();
                d0();
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    arrayList.remove(i96Var);
                }
                ix5 ix5Var = this.a;
                if (ix5Var != null) {
                    ix5Var.f();
                }
                ix5 ix5Var2 = this.c;
                if (ix5Var2 != null) {
                    ix5Var2.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(int i, View view) {
        i96 i96Var;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof yhb)) {
                boolean z = this.b.getAdapter() == this.c;
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    i96Var = (i96) this.e.get(i);
                } else if (this.h.isEmpty() || i < 0 || i >= this.h.size()) {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    i96Var = (i96) this.f.get(i);
                } else {
                    i96Var = (i96) this.h.get(i);
                }
                if (i96Var != null && i96Var.d != null && (!i96Var.i() || i96Var.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = k96.M0(2131751519, null);
                    hdVar.U = gl.T2(k96.a0("DeleteLocalizationText", null, 2131751520, i96Var.a));
                    alertDialog$Builder.j(k96.M0(2131751586, null), new h45(this, i96Var, (byte) 5));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return true;
        }
    }

    public final /* synthetic */ void k0() {
        if (this.isPaused) {
            return;
        }
        m0();
    }

    public final void l0(String str) {
        if (str != null) {
            Utilities.g.c(new hb5(this, str, (byte) 20));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    public final void m0() {
        if (this.simpleActionBar != null) {
            String M0 = k96.M0(2131748862, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.I(M0, true, 350L, s33.h);
            }
        }
        ix5 ix5Var = this.a;
        if (ix5Var != null) {
            ix5Var.l(0, ix5Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        k96 D0 = k96.D0();
        int i = this.currentAccount;
        byte b = 0;
        ex5 ex5Var = new ex5(this, b);
        String j0 = k96.j0();
        if (na7.q1(i).k4.t1.f() > 0) {
            if (na7.c1().getBoolean("langpack_patched" + j0, false) || D0.Q) {
                return;
            }
            D0.Q = true;
            D0.Z0(i, null, true, new b96(D0, j0, ex5Var, b));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        d0();
        k96.D0().V0(this.currentAccount, false);
        kk7.e().b(this, kk7.A4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.A4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ix5 ix5Var = this.a;
        if (ix5Var != null) {
            ix5Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
