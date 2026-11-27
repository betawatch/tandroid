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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public nz5 a;
    private int autoTranslationPosition;
    public d79 b;
    public nz5 c;
    public b34 d;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        boolean z = true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131748808, null));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 2));
        sla a = this.simpleActionBar.v().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new r10(this, (byte) 14);
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.a = new nz5(this, context, false, 0 == true ? 1 : 0);
        this.c = new nz5(this, context, z, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.d = b34Var;
        b34Var.setText(ob6.M0(2131747898, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        mz5 mz5Var = new mz5(this);
        mz5Var.n(400L);
        mz5Var.C = false;
        mz5Var.o(k43.h);
        this.b.setItemAnimator(mz5Var);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new zg4(this, (byte) 8));
        byte b = 22;
        this.b.setOnItemLongClickListener(new e05(this, b));
        this.b.setOnScrollListener(new to2(this, b));
        return this.fragmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        kz5 kz5Var = new kz5(ob6.D0().B, 0 == true ? 1 : 0);
        this.f = new ArrayList();
        this.h = new ArrayList(ob6.D0().K);
        ArrayList arrayList = ob6.D0().J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mb6 mb6Var = (mb6) arrayList.get(i);
            if (mb6Var.k != Integer.MAX_VALUE) {
                this.f.add(mb6Var);
            } else {
                this.h.add(mb6Var);
            }
        }
        Collections.sort(this.f, kz5Var);
        Collections.sort(this.h, kz5Var);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.B4 || this.a == null) {
            return;
        }
        d0();
        hl.c3(new jz5(this, (byte) 1));
    }

    public final boolean e0() {
        return getMessagesController().i4.t();
    }

    public final boolean f0() {
        return getMessagesController().i4.r();
    }

    public final void g0() {
        this.simpleActionBar.o(true);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.b, 0, new Class[]{cz5.class}, new String[]{"checkImage"}, (Drawable[]) null, (zob) null, aob.Di));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(int i, View view) {
        mb6 mb6Var;
        byte b = 1;
        try {
            wkb wkbVar = null;
            Object[] objArr = 0;
            if (view instanceof wkb) {
                boolean z = f0() || e0();
                int i2 = this.manualTranslationPosition;
                int i3 = jn7.D1;
                if (i == i2) {
                    boolean z2 = !f0();
                    a5c a5cVar = getMessagesController().i4;
                    SharedPreferences.Editor edit = a5cVar.n.X3.edit();
                    a5cVar.s = Boolean.valueOf(z2);
                    edit.putBoolean("translate_button", z2).apply();
                    ((wkb) view).setChecked(z2);
                    jn7.f(this.currentAccount).k(i3, new Object[0]);
                } else if (i == this.autoTranslationPosition) {
                    boolean e0 = e0();
                    boolean z3 = !e0;
                    if (!e0 && !getUserConfig().p()) {
                        showDialog(new xk8((org.telegram.ui.ActionBar.e) this, 13, false));
                        return;
                    }
                    a5c a5cVar2 = getMessagesController().i4;
                    SharedPreferences.Editor edit2 = a5cVar2.n.X3.edit();
                    a5cVar2.r = Boolean.valueOf(z3);
                    edit2.putBoolean("translate_chat_button", z3).apply();
                    jn7.f(this.currentAccount).k(i3, new Object[0]);
                    ((wkb) view).setChecked(z3);
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
                        if (RecyclerView.S(childAt) == i4 && (childAt instanceof wkb)) {
                            wkbVar = (wkb) childAt;
                        }
                    }
                    if (wkbVar != null) {
                        wkbVar.setDivider(z4);
                    }
                    nz5 nz5Var = this.a;
                    int i6 = i4 + 1;
                    if (z4) {
                        nz5Var.i(i6);
                        return;
                    } else {
                        nz5Var.s(i6);
                        return;
                    }
                }
                return;
            }
            if (view instanceof qmb) {
                presentFragment(new ee9());
                return;
            }
            if (getParentActivity() == null || this.parentLayout == null || !(view instanceof ulb)) {
                return;
            }
            Object[] objArr2 = this.b.getAdapter() == this.c;
            if (objArr2 == false) {
                i -= this.r;
            }
            if (objArr2 == true) {
                mb6Var = (mb6) this.e.get(i);
            } else if (this.h.isEmpty() || i < 0 || i >= this.h.size()) {
                if (!this.h.isEmpty()) {
                    i -= this.h.size() + 1;
                }
                mb6Var = (mb6) this.f.get(i);
            } else {
                mb6Var = (mb6) this.h.get(i);
            }
            mb6 mb6Var2 = mb6Var;
            if (mb6Var2 != null) {
                mb6 mb6Var3 = ob6.D0().B;
                boolean z5 = mb6Var3 == mb6Var2;
                id idVar = new id(3, null, getParentActivity());
                if (!z5) {
                    idVar.q(500L);
                }
                a5c a5cVar3 = getMessagesController().i4;
                a5cVar3.c.clear();
                a5cVar3.e.clear();
                int c = ob6.D0().c(mb6Var2, true, false, false, true, this.currentAccount, new ds6((Object) this, (Object) idVar, z5, (byte) 26));
                if (c != 0) {
                    idVar.setOnCancelListener(new j01(c, b));
                }
                String str = mb6Var2.f;
                String str2 = mb6Var3.f;
                HashSet b0 = ee9.b0();
                HashSet hashSet = new HashSet(b0);
                if (b0.contains(str2) && !b0.contains(str)) {
                    Collection.-EL.removeIf(hashSet, new lz5(str2, objArr == true ? 1 : 0));
                }
                if (str != null && !"null".equals(str)) {
                    hashSet.add(str);
                }
                ee9.e0(hashSet, Boolean.FALSE);
                uc7.s1(this.currentAccount).i4.f();
                uc7.s1(this.currentAccount).i4.h();
                a5c.P = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void i0(mb6 mb6Var) {
        ob6 D0 = ob6.D0();
        int i = this.currentAccount;
        if (mb6Var.d != null) {
            if (!mb6Var.i() || mb6Var.k == Integer.MAX_VALUE) {
                if (D0.B == mb6Var) {
                    mb6 F0 = D0.z.getLanguage() != null ? D0.F0(D0.z.getLanguage()) : null;
                    if (F0 == null) {
                        F0 = D0.F0(ob6.H0(D0.z));
                    }
                    if (F0 == null) {
                        F0 = D0.F0("en");
                    }
                    D0.d(F0, true, false, i);
                }
                D0.K.remove(mb6Var);
                D0.L.remove(mb6Var);
                D0.M.remove(mb6Var.b());
                D0.O.remove(mb6Var);
                D0.J.remove(mb6Var);
                D0.N.remove(mb6Var.b());
                new File(mb6Var.d).delete();
                D0.a1();
                d0();
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    arrayList.remove(mb6Var);
                }
                nz5 nz5Var = this.a;
                if (nz5Var != null) {
                    nz5Var.f();
                }
                nz5 nz5Var2 = this.c;
                if (nz5Var2 != null) {
                    nz5Var2.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(int i, View view) {
        mb6 mb6Var;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof ulb)) {
                boolean z = this.b.getAdapter() == this.c;
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    mb6Var = (mb6) this.e.get(i);
                } else if (this.h.isEmpty() || i < 0 || i >= this.h.size()) {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    mb6Var = (mb6) this.f.get(i);
                } else {
                    mb6Var = (mb6) this.h.get(i);
                }
                if (mb6Var != null && mb6Var.d != null && (!mb6Var.i() || mb6Var.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    id idVar = alertDialog$Builder.a;
                    idVar.S = ob6.M0(2131751496, null);
                    idVar.U = hl.S2(ob6.a0("DeleteLocalizationText", null, 2131751497, mb6Var.a));
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new u34(this, mb6Var, (byte) 10));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
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
            Utilities.g.c(new tg5(this, str, (byte) 17));
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
            String M0 = ob6.M0(2131748808, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.K(M0, true, 350L, k43.h);
            }
        }
        nz5 nz5Var = this.a;
        if (nz5Var != null) {
            nz5Var.l(0, nz5Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        ob6 D0 = ob6.D0();
        int i = this.currentAccount;
        byte b = 0;
        jz5 jz5Var = new jz5(this, b);
        String j0 = ob6.j0();
        if (uc7.s1(i).k4.B1.f() > 0) {
            if (uc7.e1().getBoolean("langpack_patched" + j0, false) || D0.Q) {
                return;
            }
            D0.Q = true;
            D0.Z0(i, null, true, new fb6(D0, j0, jz5Var, b));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        d0();
        ob6.D0().V0(this.currentAccount, false);
        jn7.e().b(this, jn7.B4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.B4);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        nz5 nz5Var = this.a;
        if (nz5Var != null) {
            nz5Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
