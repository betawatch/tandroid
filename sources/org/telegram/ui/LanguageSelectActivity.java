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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public e60 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.tj0 b;
    public e60 c;
    public org.telegram.ui.Components.gy d;
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a4, B:89:0x01ad, B:91:0x01c0, B:93:0x01c6, B:95:0x01d1, B:97:0x01d9, B:98:0x01dc, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a4, B:89:0x01ad, B:91:0x01c0, B:93:0x01c6, B:95:0x01d1, B:97:0x01d9, B:98:0x01dc, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:11:0x001b, B:14:0x0021, B:15:0x00a2, B:17:0x00a8, B:22:0x00b4, B:26:0x00bb, B:28:0x00c3, B:30:0x00d4, B:32:0x00d8, B:34:0x00db, B:39:0x00e0, B:41:0x00e5, B:44:0x00ec, B:46:0x00b9, B:49:0x0054, B:51:0x0058, B:53:0x0060, B:55:0x006a, B:57:0x0075, B:59:0x00f3, B:61:0x00f7, B:63:0x0100, B:65:0x0106, B:67:0x010a, B:71:0x0110, B:75:0x011f, B:77:0x0124, B:80:0x0164, B:83:0x016d, B:85:0x0179, B:86:0x017e, B:88:0x01a4, B:89:0x01ad, B:91:0x01c0, B:93:0x01c6, B:95:0x01d1, B:97:0x01d9, B:98:0x01dc, B:101:0x012e, B:104:0x0138, B:106:0x0140, B:107:0x0149, B:109:0x0151, B:110:0x0159), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(LanguageSelectActivity languageSelectActivity, View view, int i3) {
        org.telegram.messenger.yc ycVar;
        boolean z10;
        int i10;
        boolean z11;
        try {
            org.telegram.ui.Cells.q8 q8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.q8)) {
                if (view instanceof org.telegram.ui.Cells.v9) {
                    languageSelectActivity.presentFragment(new gy0());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
                    Object[] objArr = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (objArr == false) {
                        i3 -= languageSelectActivity.r;
                    }
                    if (objArr == true) {
                        ycVar = (org.telegram.messenger.yc) languageSelectActivity.e.get(i3);
                    } else if (languageSelectActivity.h.isEmpty() || i3 < 0 || i3 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i3 -= languageSelectActivity.h.size() + 1;
                        }
                        ycVar = (org.telegram.messenger.yc) languageSelectActivity.f.get(i3);
                    } else {
                        ycVar = (org.telegram.messenger.yc) languageSelectActivity.h.get(i3);
                    }
                    org.telegram.messenger.yc ycVar2 = ycVar;
                    if (ycVar2 != null) {
                        org.telegram.messenger.yc ycVar3 = org.telegram.messenger.bd.E0().B;
                        boolean z12 = ycVar3 == ycVar2;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, languageSelectActivity.getParentActivity(), null);
                        if (!z12) {
                            s1Var.r(500L);
                        }
                        org.telegram.messenger.x00 x00Var = languageSelectActivity.getMessagesController().s7;
                        x00Var.c.clear();
                        x00Var.e.clear();
                        int c2 = org.telegram.messenger.bd.E0().c(ycVar2, true, false, false, true, languageSelectActivity.currentAccount, new a60(languageSelectActivity, s1Var, z12, 0));
                        if (c2 != 0) {
                            s1Var.setOnCancelListener(new b60(c2, 0));
                        }
                        String str = ycVar2.f;
                        String str2 = ycVar3.f;
                        HashSet d02 = gy0.d0();
                        HashSet hashSet = new HashSet(d02);
                        if (d02.contains(str2) && !d02.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new c60(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        gy0.f0(hashSet, Boolean.FALSE);
                        org.telegram.messenger.hp.s1(languageSelectActivity.currentAccount).s7.g();
                        org.telegram.messenger.hp.s1(languageSelectActivity.currentAccount).s7.i();
                        org.telegram.messenger.x00.P = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                z10 = false;
                i10 = languageSelectActivity.manualTranslationPosition;
                int i11 = org.telegram.messenger.hs.D1;
                if (i3 != i10) {
                    boolean z13 = !languageSelectActivity.l0();
                    org.telegram.messenger.x00 x00Var2 = languageSelectActivity.getMessagesController().s7;
                    SharedPreferences.Editor edit = x00Var2.n.e7.edit();
                    x00Var2.s = Boolean.valueOf(z13);
                    edit.putBoolean("translate_button", z13).apply();
                    ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                    org.telegram.messenger.hs.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                } else if (i3 == languageSelectActivity.autoTranslationPosition) {
                    boolean k02 = languageSelectActivity.k0();
                    boolean z14 = !k02;
                    if (!k02 && !languageSelectActivity.getUserConfig().q()) {
                        languageSelectActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) languageSelectActivity, 13, false));
                        return;
                    }
                    org.telegram.messenger.x00 x00Var3 = languageSelectActivity.getMessagesController().s7;
                    SharedPreferences.Editor edit2 = x00Var3.n.e7.edit();
                    x00Var3.r = Boolean.valueOf(z14);
                    edit2.putBoolean("translate_chat_button", z14).apply();
                    org.telegram.messenger.hs.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                    ((org.telegram.ui.Cells.q8) view).setChecked(z14);
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
                            if (RecyclerView.R(childAt) == i12 && (childAt instanceof org.telegram.ui.Cells.q8)) {
                                q8Var = (org.telegram.ui.Cells.q8) childAt;
                            }
                        }
                        if (q8Var != null) {
                            q8Var.setDivider(z11);
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
            int i112 = org.telegram.messenger.hs.D1;
            if (i3 != i10) {
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

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i3) {
        org.telegram.messenger.yc ycVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
                boolean z10 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z10) {
                    i3 -= languageSelectActivity.r;
                }
                if (z10) {
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.e.get(i3);
                } else if (languageSelectActivity.h.isEmpty() || i3 < 0 || i3 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i3 -= languageSelectActivity.h.size() + 1;
                    }
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.f.get(i3);
                } else {
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.h.get(i3);
                }
                if (ycVar != null && ycVar.d != null && (!ycVar.i() || ycVar.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = org.telegram.messenger.bd.M0(2131751532, null);
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("DeleteLocalizationText", null, 2131751533, ycVar.a));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(19, languageSelectActivity, ycVar));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
        languageSelectActivity.simpleActionBar.j(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.yc ycVar) {
        org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
        int i3 = languageSelectActivity.currentAccount;
        if (ycVar.d != null) {
            if (!ycVar.i() || ycVar.k == Integer.MAX_VALUE) {
                if (E0.B == ycVar) {
                    org.telegram.messenger.yc G0 = E0.z.getLanguage() != null ? E0.G0(E0.z.getLanguage()) : null;
                    if (G0 == null) {
                        G0 = E0.G0(org.telegram.messenger.bd.I0(E0.z));
                    }
                    if (G0 == null) {
                        G0 = E0.G0("en");
                    }
                    E0.d(G0, true, false, i3);
                }
                E0.K.remove(ycVar);
                E0.L.remove(ycVar);
                E0.M.remove(ycVar.b());
                E0.O.remove(ycVar);
                E0.J.remove(ycVar);
                E0.N.remove(ycVar.b());
                new File(ycVar.d).delete();
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(ycVar);
                }
                e60 e60Var = languageSelectActivity.a;
                if (e60Var != null) {
                    e60Var.f();
                }
                e60 e60Var2 = languageSelectActivity.c;
                if (e60Var2 != null) {
                    e60Var2.f();
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749062, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 11));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.C0 = new lg.w1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.a = new e60(this, context, false, 0 == true ? 1 : 0);
        this.c = new e60(this, context, z10, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new u4.b0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        d60 d60Var = new d60(this);
        d60Var.n(400L);
        d60Var.C = false;
        d60Var.o(org.telegram.ui.Components.xq.h);
        this.b.setItemAnimator(d60Var);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new ur(this, 15));
        this.b.setOnScrollListener(new h3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.y4 || this.a == null) {
            return;
        }
        j0();
        org.telegram.messenger.g0.h3(new z50(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ls lsVar = new ls(org.telegram.messenger.bd.E0().B, 2);
        this.f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.bd.E0().K);
        ArrayList arrayList = org.telegram.messenger.bd.E0().J;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i3);
            if (ycVar.k != Integer.MAX_VALUE) {
                this.f.add(ycVar);
            } else {
                this.h.add(ycVar);
            }
        }
        Collections.sort(this.f, lsVar);
        Collections.sort(this.h, lsVar);
    }

    public final boolean k0() {
        return getMessagesController().s7.u();
    }

    public final boolean l0() {
        return getMessagesController().s7.s();
    }

    public final void m0(String str) {
        if (str != null) {
            Utilities.g.c(new ly(13, this, str));
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
            String M0 = org.telegram.messenger.bd.M0(2131749062, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.A(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        e60 e60Var = this.a;
        if (e60Var != null) {
            e60Var.k(0, e60Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
        int i3 = this.currentAccount;
        z50 z50Var = new z50(this, 0);
        String j02 = org.telegram.messenger.bd.j0();
        if (org.telegram.messenger.hp.s1(i3).z7 > 0) {
            if (org.telegram.messenger.hp.e1().getBoolean("langpack_patched" + j02, false) || E0.Q) {
                return;
            }
            E0.Q = true;
            E0.Z0(i3, null, true, new org.telegram.messenger.qc(E0, j02, z50Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.bd.E0().V0(this.currentAccount, false);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.y4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.y4);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        e60 e60Var = this.a;
        if (e60Var != null) {
            e60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
