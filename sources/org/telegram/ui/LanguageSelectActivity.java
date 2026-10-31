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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public i70 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.tk0 b;
    public i70 c;
    public org.telegram.ui.Components.xy d;
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
    public static void Y(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        org.telegram.messenger.zc zcVar;
        boolean z10;
        int i11;
        boolean z11;
        try {
            org.telegram.ui.Cells.t8 t8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.t8)) {
                if (view instanceof org.telegram.ui.Cells.x9) {
                    languageSelectActivity.presentFragment(new e01());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                    Object[] objArr = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (objArr == false) {
                        i10 -= languageSelectActivity.r;
                    }
                    if (objArr == true) {
                        zcVar = (org.telegram.messenger.zc) languageSelectActivity.e.get(i10);
                    } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i10 -= languageSelectActivity.h.size() + 1;
                        }
                        zcVar = (org.telegram.messenger.zc) languageSelectActivity.f.get(i10);
                    } else {
                        zcVar = (org.telegram.messenger.zc) languageSelectActivity.h.get(i10);
                    }
                    org.telegram.messenger.zc zcVar2 = zcVar;
                    if (zcVar2 != null) {
                        org.telegram.messenger.zc zcVar3 = org.telegram.messenger.cd.D0().B;
                        boolean z12 = zcVar3 == zcVar2;
                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, languageSelectActivity.getParentActivity(), null);
                        if (!z12) {
                            x1Var.r(500L);
                        }
                        org.telegram.messenger.t10 t10Var = languageSelectActivity.getMessagesController().t7;
                        t10Var.c.clear();
                        t10Var.e.clear();
                        int c10 = org.telegram.messenger.cd.D0().c(zcVar2, true, false, false, true, languageSelectActivity.currentAccount, new ag.j0(languageSelectActivity, x1Var, z12, 27));
                        if (c10 != 0) {
                            x1Var.setOnCancelListener(new ba(languageSelectActivity, c10, 6));
                        }
                        String str = zcVar2.f;
                        String str2 = zcVar3.f;
                        HashSet c02 = e01.c0();
                        HashSet hashSet = new HashSet(c02);
                        if (c02.contains(str2) && !c02.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new g70(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        e01.e0(hashSet, Boolean.FALSE);
                        org.telegram.messenger.vp.r1(languageSelectActivity.currentAccount).t7.g();
                        org.telegram.messenger.vp.r1(languageSelectActivity.currentAccount).t7.i();
                        org.telegram.messenger.t10.O = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                z10 = false;
                i11 = languageSelectActivity.manualTranslationPosition;
                int i12 = org.telegram.messenger.zs.D1;
                if (i10 != i11) {
                    boolean z13 = !languageSelectActivity.l0();
                    org.telegram.messenger.t10 t10Var2 = languageSelectActivity.getMessagesController().t7;
                    SharedPreferences.Editor edit = t10Var2.n.f7.edit();
                    t10Var2.s = Boolean.valueOf(z13);
                    edit.putBoolean("translate_button", z13).apply();
                    ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                    org.telegram.messenger.zs.f(languageSelectActivity.currentAccount).k(i12, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean k02 = languageSelectActivity.k0();
                    boolean z14 = !k02;
                    if (!k02 && !languageSelectActivity.getUserConfig().q()) {
                        languageSelectActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) languageSelectActivity, 13, false));
                        return;
                    }
                    org.telegram.messenger.t10 t10Var3 = languageSelectActivity.getMessagesController().t7;
                    SharedPreferences.Editor edit2 = t10Var3.n.f7.edit();
                    t10Var3.r = Boolean.valueOf(z14);
                    edit2.putBoolean("translate_chat_button", z14).apply();
                    org.telegram.messenger.zs.f(languageSelectActivity.currentAccount).k(i12, new Object[0]);
                    ((org.telegram.ui.Cells.t8) view).setChecked(z14);
                }
                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                    z11 = false;
                    if (z11 == z10) {
                        int i13 = languageSelectActivity.autoTranslationPosition;
                        if (i13 < 0) {
                            i13 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i14 = 0; i14 < languageSelectActivity.b.getChildCount(); i14++) {
                            View childAt = languageSelectActivity.b.getChildAt(i14);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i13 && (childAt instanceof org.telegram.ui.Cells.t8)) {
                                t8Var = (org.telegram.ui.Cells.t8) childAt;
                            }
                        }
                        if (t8Var != null) {
                            t8Var.setDivider(z11);
                        }
                        if (z11) {
                            languageSelectActivity.a.i(i13 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.s(i13 + 1);
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
            i11 = languageSelectActivity.manualTranslationPosition;
            int i122 = org.telegram.messenger.zs.D1;
            if (i10 != i11) {
            }
            if (!languageSelectActivity.l0()) {
                z11 = false;
                if (z11 == z10) {
                }
            }
            z11 = true;
            if (z11 == z10) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static boolean Z(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        org.telegram.messenger.zc zcVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                boolean z10 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z10) {
                    i10 -= languageSelectActivity.r;
                }
                if (z10) {
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.e.get(i10);
                } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.f.get(i10);
                } else {
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.h.get(i10);
                }
                if (zcVar != null && zcVar.d != null && (!zcVar.i() || zcVar.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = org.telegram.messenger.cd.L0(2131751532, null);
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("DeleteLocalizationText", null, 2131751533, zcVar.a));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(10, languageSelectActivity, zcVar));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    languageSelectActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return true;
        }
    }

    public static void a0(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.j(true);
        languageSelectActivity.n0();
    }

    public static void b0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.zc zcVar) {
        org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
        int i10 = languageSelectActivity.currentAccount;
        if (zcVar.d != null) {
            if (!zcVar.i() || zcVar.k == Integer.MAX_VALUE) {
                if (D0.B == zcVar) {
                    org.telegram.messenger.zc F0 = D0.z.getLanguage() != null ? D0.F0(D0.z.getLanguage()) : null;
                    if (F0 == null) {
                        F0 = D0.F0(org.telegram.messenger.cd.H0(D0.z));
                    }
                    if (F0 == null) {
                        F0 = D0.F0("en");
                    }
                    D0.d(F0, true, false, i10);
                }
                D0.K.remove(zcVar);
                D0.L.remove(zcVar);
                D0.M.remove(zcVar.b());
                D0.O.remove(zcVar);
                D0.J.remove(zcVar);
                D0.N.remove(zcVar.b());
                new File(zcVar.d).delete();
                D0.X0();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(zcVar);
                }
                i70 i70Var = languageSelectActivity.a;
                if (i70Var != null) {
                    i70Var.f();
                }
                i70 i70Var2 = languageSelectActivity.c;
                if (i70Var2 != null) {
                    i70Var2.f();
                }
            }
        }
    }

    public static /* synthetic */ void c0(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.n0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        char c10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749064, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, i10));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        int i11 = 14;
        b10.B0 = new ag.l3(this, i11);
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.a = new i70(this, context, false, 0 == true ? 1 : 0);
        this.c = new i70(this, context, c10 == true ? 1 : 0, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.a0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        h70 h70Var = new h70(this);
        h70Var.n(400L);
        h70Var.C = false;
        h70Var.o(org.telegram.ui.Components.gr.h);
        this.b.setItemAnimator(h70Var);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new g(this, 16));
        this.b.setOnItemLongClickListener(new tt(this, i11));
        this.b.setOnScrollListener(new h3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.y4 || this.a == null) {
            return;
        }
        j0();
        org.telegram.messenger.i0.g3(new e70(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ai));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ot otVar = new ot(org.telegram.messenger.cd.D0().B, 2);
        this.f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.cd.D0().K);
        ArrayList arrayList = org.telegram.messenger.cd.D0().J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) arrayList.get(i10);
            if (zcVar.k != Integer.MAX_VALUE) {
                this.f.add(zcVar);
            } else {
                this.h.add(zcVar);
            }
        }
        Collections.sort(this.f, otVar);
        Collections.sort(this.h, otVar);
    }

    public final boolean k0() {
        return getMessagesController().t7.u();
    }

    public final boolean l0() {
        return getMessagesController().t7.s();
    }

    public final void m0(String str) {
        if (str != null) {
            Utilities.g.c(new f70(1, this, str));
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
            String L0 = org.telegram.messenger.cd.L0(2131749064, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), L0)) {
                this.simpleActionBar.B(L0, true, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        i70 i70Var = this.a;
        if (i70Var != null) {
            i70Var.k(0, i70Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
        int i10 = this.currentAccount;
        e70 e70Var = new e70(this, 0);
        String j02 = org.telegram.messenger.cd.j0();
        if (org.telegram.messenger.vp.r1(i10).A7 > 0) {
            if (org.telegram.messenger.vp.d1().getBoolean("langpack_patched" + j02, false) || D0.Q) {
                return;
            }
            D0.Q = true;
            D0.W0(i10, null, true, new org.telegram.messenger.wc(D0, j02, e70Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.cd.D0().S0(this.currentAccount, false);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.y4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.y4);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        i70 i70Var = this.a;
        if (i70Var != null) {
            i70Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
