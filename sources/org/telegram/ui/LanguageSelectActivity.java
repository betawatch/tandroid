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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public l60 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.ek0 b;
    public l60 c;
    public org.telegram.ui.Components.vy d;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a5, B:89:0x01ae, B:91:0x01c1, B:93:0x01c7, B:95:0x01d2, B:97:0x01da, B:98:0x01dd, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a5, B:89:0x01ae, B:91:0x01c1, B:93:0x01c7, B:95:0x01d2, B:97:0x01da, B:98:0x01dd, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a5, B:89:0x01ae, B:91:0x01c1, B:93:0x01c7, B:95:0x01d2, B:97:0x01da, B:98:0x01dd, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(LanguageSelectActivity languageSelectActivity, View view, int i7) {
        org.telegram.messenger.dd ddVar;
        boolean z10;
        int i10;
        boolean z11;
        try {
            org.telegram.ui.Cells.s8 s8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.s8)) {
                if (view instanceof org.telegram.ui.Cells.x9) {
                    languageSelectActivity.presentFragment(new sy0());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.c9)) {
                    Object[] objArr = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (objArr == false) {
                        i7 -= languageSelectActivity.r;
                    }
                    if (objArr == true) {
                        ddVar = (org.telegram.messenger.dd) languageSelectActivity.e.get(i7);
                    } else if (languageSelectActivity.h.isEmpty() || i7 < 0 || i7 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i7 -= languageSelectActivity.h.size() + 1;
                        }
                        ddVar = (org.telegram.messenger.dd) languageSelectActivity.f.get(i7);
                    } else {
                        ddVar = (org.telegram.messenger.dd) languageSelectActivity.h.get(i7);
                    }
                    org.telegram.messenger.dd ddVar2 = ddVar;
                    if (ddVar2 != null) {
                        org.telegram.messenger.dd ddVar3 = org.telegram.messenger.hd.E0().B;
                        boolean z12 = ddVar3 == ddVar2;
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, languageSelectActivity.getParentActivity(), null);
                        if (!z12) {
                            t1Var.r(500L);
                        }
                        org.telegram.messenger.a10 a10Var = languageSelectActivity.getMessagesController().v7;
                        a10Var.c.clear();
                        a10Var.e.clear();
                        int c10 = org.telegram.messenger.hd.E0().c(ddVar2, true, false, false, true, languageSelectActivity.currentAccount, new di.p6(languageSelectActivity, t1Var, z12, 29));
                        if (c10 != 0) {
                            t1Var.setOnCancelListener(new i60(c10, 0));
                        }
                        String str = ddVar2.f;
                        String str2 = ddVar3.f;
                        HashSet d02 = sy0.d0();
                        HashSet hashSet = new HashSet(d02);
                        if (d02.contains(str2) && !d02.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new j60(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        sy0.f0(hashSet, Boolean.FALSE);
                        org.telegram.messenger.np.u1(languageSelectActivity.currentAccount).v7.g();
                        org.telegram.messenger.np.u1(languageSelectActivity.currentAccount).v7.i();
                        org.telegram.messenger.a10.P = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                z10 = false;
                i10 = languageSelectActivity.manualTranslationPosition;
                int i11 = org.telegram.messenger.ls.D1;
                if (i7 != i10) {
                    boolean z13 = !languageSelectActivity.l0();
                    org.telegram.messenger.a10 a10Var2 = languageSelectActivity.getMessagesController().v7;
                    SharedPreferences.Editor edit = a10Var2.n.h7.edit();
                    a10Var2.s = Boolean.valueOf(z13);
                    edit.putBoolean("translate_button", z13).apply();
                    ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                    org.telegram.messenger.ls.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                } else if (i7 == languageSelectActivity.autoTranslationPosition) {
                    boolean k02 = languageSelectActivity.k0();
                    boolean z14 = !k02;
                    if (!k02 && !languageSelectActivity.getUserConfig().q()) {
                        languageSelectActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) languageSelectActivity, 13, false));
                        return;
                    }
                    org.telegram.messenger.a10 a10Var3 = languageSelectActivity.getMessagesController().v7;
                    SharedPreferences.Editor edit2 = a10Var3.n.h7.edit();
                    a10Var3.r = Boolean.valueOf(z14);
                    edit2.putBoolean("translate_chat_button", z14).apply();
                    org.telegram.messenger.ls.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                    ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                }
                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                    z11 = false;
                    if (z11 == z10) {
                        int i12 = languageSelectActivity.autoTranslationPosition;
                        if (i12 < 0) {
                            i12 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i13 = 0; i13 < languageSelectActivity.b.getChildCount(); i13++) {
                            View childAt = languageSelectActivity.b.getChildAt(i13);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i12 && (childAt instanceof org.telegram.ui.Cells.s8)) {
                                s8Var = (org.telegram.ui.Cells.s8) childAt;
                            }
                        }
                        if (s8Var != null) {
                            s8Var.setDivider(z11);
                        }
                        if (z11) {
                            languageSelectActivity.a.i(i12 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.s(i12 + 1);
                            return;
                        }
                    }
                    return;
                }
                z11 = true;
                if (z11 == z10) {
                }
            }
            z10 = true;
            i10 = languageSelectActivity.manualTranslationPosition;
            int i112 = org.telegram.messenger.ls.D1;
            if (i7 != i10) {
            }
            if (!languageSelectActivity.l0()) {
                z11 = false;
                if (z11 == z10) {
                }
            }
            z11 = true;
            if (z11 == z10) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i7) {
        org.telegram.messenger.dd ddVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.c9)) {
                boolean z10 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z10) {
                    i7 -= languageSelectActivity.r;
                }
                if (z10) {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.e.get(i7);
                } else if (languageSelectActivity.h.isEmpty() || i7 < 0 || i7 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.f.get(i7);
                } else {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.h.get(i7);
                }
                if (ddVar != null && ddVar.d != null && (!ddVar.i() || ddVar.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = org.telegram.messenger.hd.N0(2131751519, null);
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("DeleteLocalizationText", null, 2131751520, ddVar.a));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new at(12, languageSelectActivity, ddVar));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    languageSelectActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return true;
        }
    }

    public static void b0(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.o(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.dd ddVar) {
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (ddVar.d != null) {
            if (!ddVar.i() || ddVar.k == Integer.MAX_VALUE) {
                if (E0.B == ddVar) {
                    org.telegram.messenger.dd G0 = E0.z.getLanguage() != null ? E0.G0(E0.z.getLanguage()) : null;
                    if (G0 == null) {
                        G0 = E0.G0(org.telegram.messenger.hd.I0(E0.z));
                    }
                    if (G0 == null) {
                        G0 = E0.G0("en");
                    }
                    E0.d(G0, true, false, i7);
                }
                E0.K.remove(ddVar);
                E0.L.remove(ddVar);
                E0.M.remove(ddVar.b());
                E0.O.remove(ddVar);
                E0.J.remove(ddVar);
                E0.N.remove(ddVar.b());
                new File(ddVar.d).delete();
                E0.b1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(ddVar);
                }
                l60 l60Var = languageSelectActivity.a;
                if (l60Var != null) {
                    l60Var.f();
                }
                l60 l60Var2 = languageSelectActivity.c;
                if (l60Var2 != null) {
                    l60Var2.f();
                }
            }
        }
    }

    public static /* synthetic */ void d0(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.n0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748861, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 13));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.outline_header_search);
        b10.O();
        int i7 = 15;
        b10.C0 = new bi.w1(this, i7);
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.a = new l60(this, context, false, 0 == true ? 1 : 0);
        this.c = new l60(this, context, z10, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new v4.c0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        k60 k60Var = new k60(this);
        k60Var.n(400L);
        k60Var.C = false;
        k60Var.o(org.telegram.ui.Components.nr.h);
        this.b.setItemAnimator(k60Var);
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new zr(this, i7));
        this.b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.B4 || this.a == null) {
            return;
        }
        j0();
        org.telegram.messenger.g0.g3(new g60(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Di));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        qs qsVar = new qs(org.telegram.messenger.hd.E0().B, 2);
        this.f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.hd.E0().K);
        ArrayList arrayList = org.telegram.messenger.hd.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i7);
            if (ddVar.k != Integer.MAX_VALUE) {
                this.f.add(ddVar);
            } else {
                this.h.add(ddVar);
            }
        }
        Collections.sort(this.f, qsVar);
        Collections.sort(this.h, qsVar);
    }

    public final boolean k0() {
        return getMessagesController().v7.u();
    }

    public final boolean l0() {
        return getMessagesController().v7.s();
    }

    public final void m0(String str) {
        if (str != null) {
            Utilities.g.c(new h60(1, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String N0 = org.telegram.messenger.hd.N0(2131748861, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), N0)) {
                this.simpleActionBar.I(N0, true, 350L, org.telegram.ui.Components.nr.h);
            }
        }
        l60 l60Var = this.a;
        if (l60Var != null) {
            l60Var.k(0, l60Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = this.currentAccount;
        g60 g60Var = new g60(this, 0);
        String j02 = org.telegram.messenger.hd.j0();
        if (org.telegram.messenger.np.u1(i7).C7 > 0) {
            if (org.telegram.messenger.np.g1().getBoolean("langpack_patched" + j02, false) || E0.Q) {
                return;
            }
            E0.Q = true;
            E0.a1(i7, null, true, new org.telegram.messenger.vc(E0, j02, g60Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.hd.E0().W0(this.currentAccount, false);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.B4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.B4);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        l60 l60Var = this.a;
        if (l60Var != null) {
            l60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
