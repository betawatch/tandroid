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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public n60 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.pj0 b;
    public n60 c;
    public org.telegram.ui.Components.iy d;
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
    public static void Z(LanguageSelectActivity languageSelectActivity, View view, int i7) {
        org.telegram.messenger.fd fdVar;
        boolean z9;
        int i10;
        boolean z10;
        try {
            org.telegram.ui.Cells.r8 r8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.r8)) {
                if (view instanceof org.telegram.ui.Cells.w9) {
                    languageSelectActivity.presentFragment(new uy0());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
                    Object[] objArr = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (objArr == false) {
                        i7 -= languageSelectActivity.r;
                    }
                    if (objArr == true) {
                        fdVar = (org.telegram.messenger.fd) languageSelectActivity.e.get(i7);
                    } else if (languageSelectActivity.h.isEmpty() || i7 < 0 || i7 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i7 -= languageSelectActivity.h.size() + 1;
                        }
                        fdVar = (org.telegram.messenger.fd) languageSelectActivity.f.get(i7);
                    } else {
                        fdVar = (org.telegram.messenger.fd) languageSelectActivity.h.get(i7);
                    }
                    org.telegram.messenger.fd fdVar2 = fdVar;
                    if (fdVar2 != null) {
                        org.telegram.messenger.fd fdVar3 = org.telegram.messenger.id.E0().B;
                        boolean z11 = fdVar3 == fdVar2;
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, languageSelectActivity.getParentActivity(), null);
                        if (!z11) {
                            u1Var.r(500L);
                        }
                        org.telegram.messenger.f10 f10Var = languageSelectActivity.getMessagesController().s7;
                        f10Var.c.clear();
                        f10Var.e.clear();
                        int c10 = org.telegram.messenger.id.E0().c(fdVar2, true, false, false, true, languageSelectActivity.currentAccount, new j60(languageSelectActivity, u1Var, z11, 0));
                        if (c10 != 0) {
                            u1Var.setOnCancelListener(new k60(c10, 0));
                        }
                        String str = fdVar2.f;
                        String str2 = fdVar3.f;
                        HashSet d02 = uy0.d0();
                        HashSet hashSet = new HashSet(d02);
                        if (d02.contains(str2) && !d02.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new l60(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        uy0.f0(hashSet, Boolean.FALSE);
                        org.telegram.messenger.qp.s1(languageSelectActivity.currentAccount).s7.g();
                        org.telegram.messenger.qp.s1(languageSelectActivity.currentAccount).s7.i();
                        org.telegram.messenger.f10.O = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                z9 = false;
                i10 = languageSelectActivity.manualTranslationPosition;
                int i11 = org.telegram.messenger.qs.D1;
                if (i7 != i10) {
                    boolean z12 = !languageSelectActivity.l0();
                    org.telegram.messenger.f10 f10Var2 = languageSelectActivity.getMessagesController().s7;
                    SharedPreferences.Editor edit = f10Var2.n.e7.edit();
                    f10Var2.s = Boolean.valueOf(z12);
                    edit.putBoolean("translate_button", z12).apply();
                    ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                    org.telegram.messenger.qs.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                } else if (i7 == languageSelectActivity.autoTranslationPosition) {
                    boolean k02 = languageSelectActivity.k0();
                    boolean z13 = !k02;
                    if (!k02 && !languageSelectActivity.getUserConfig().q()) {
                        languageSelectActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) languageSelectActivity, 13, false));
                        return;
                    }
                    org.telegram.messenger.f10 f10Var3 = languageSelectActivity.getMessagesController().s7;
                    SharedPreferences.Editor edit2 = f10Var3.n.e7.edit();
                    f10Var3.r = Boolean.valueOf(z13);
                    edit2.putBoolean("translate_chat_button", z13).apply();
                    org.telegram.messenger.qs.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                    ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                }
                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                    z10 = false;
                    if (z10 == z9) {
                        int i12 = languageSelectActivity.autoTranslationPosition;
                        if (i12 < 0) {
                            i12 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i13 = 0; i13 < languageSelectActivity.b.getChildCount(); i13++) {
                            View childAt = languageSelectActivity.b.getChildAt(i13);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i12 && (childAt instanceof org.telegram.ui.Cells.r8)) {
                                r8Var = (org.telegram.ui.Cells.r8) childAt;
                            }
                        }
                        if (r8Var != null) {
                            r8Var.setDivider(z10);
                        }
                        if (z10) {
                            languageSelectActivity.a.i(i12 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.s(i12 + 1);
                            return;
                        }
                    }
                    return;
                }
                z10 = true;
                if (z10 == z9) {
                }
            }
            z9 = true;
            i10 = languageSelectActivity.manualTranslationPosition;
            int i112 = org.telegram.messenger.qs.D1;
            if (i7 != i10) {
            }
            if (!languageSelectActivity.l0()) {
                z10 = false;
                if (z10 == z9) {
                }
            }
            z10 = true;
            if (z10 == z9) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i7) {
        org.telegram.messenger.fd fdVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
                boolean z9 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z9) {
                    i7 -= languageSelectActivity.r;
                }
                if (z9) {
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.e.get(i7);
                } else if (languageSelectActivity.h.isEmpty() || i7 < 0 || i7 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.f.get(i7);
                } else {
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.h.get(i7);
                }
                if (fdVar != null && fdVar.d != null && (!fdVar.i() || fdVar.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = org.telegram.messenger.id.M0(2131751531, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("DeleteLocalizationText", null, 2131751532, fdVar.a));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new su(9, languageSelectActivity, fdVar));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
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
        languageSelectActivity.simpleActionBar.l(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.fd fdVar) {
        org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (fdVar.d != null) {
            if (!fdVar.i() || fdVar.k == Integer.MAX_VALUE) {
                if (E0.B == fdVar) {
                    org.telegram.messenger.fd G0 = E0.z.getLanguage() != null ? E0.G0(E0.z.getLanguage()) : null;
                    if (G0 == null) {
                        G0 = E0.G0(org.telegram.messenger.id.I0(E0.z));
                    }
                    if (G0 == null) {
                        G0 = E0.G0("en");
                    }
                    E0.d(G0, true, false, i7);
                }
                E0.K.remove(fdVar);
                E0.L.remove(fdVar);
                E0.M.remove(fdVar.b());
                E0.O.remove(fdVar);
                E0.J.remove(fdVar);
                E0.N.remove(fdVar.b());
                new File(fdVar.d).delete();
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(fdVar);
                }
                n60 n60Var = languageSelectActivity.a;
                if (n60Var != null) {
                    n60Var.f();
                }
                n60 n60Var2 = languageSelectActivity.c;
                if (n60Var2 != null) {
                    n60Var2.f();
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

    @Override // org.telegram.ui.ActionBar.f2
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
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        boolean z9 = true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749054, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 10));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new kg.v1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.a = new n60(this, context, false, 0 == true ? 1 : 0);
        this.c = new n60(this, context, z9, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        iyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        m60 m60Var = new m60(this);
        m60Var.n(400L);
        m60Var.C = false;
        m60Var.o(org.telegram.ui.Components.wq.h);
        this.b.setItemAnimator(m60Var);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new zr(this, 15));
        this.b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.y4 || this.a == null) {
            return;
        }
        j0();
        org.telegram.messenger.g0.h3(new i60(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ai));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        qs qsVar = new qs(org.telegram.messenger.id.E0().B, 2);
        this.f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.id.E0().K);
        ArrayList arrayList = org.telegram.messenger.id.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i7);
            if (fdVar.k != Integer.MAX_VALUE) {
                this.f.add(fdVar);
            } else {
                this.h.add(fdVar);
            }
        }
        Collections.sort(this.f, qsVar);
        Collections.sort(this.h, qsVar);
    }

    public final boolean k0() {
        return getMessagesController().s7.u();
    }

    public final boolean l0() {
        return getMessagesController().s7.s();
    }

    public final void m0(String str) {
        if (str != null) {
            Utilities.g.c(new f10(9, this, str));
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
            String M0 = org.telegram.messenger.id.M0(2131749054, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.C(M0, true, 350L, org.telegram.ui.Components.wq.h);
            }
        }
        n60 n60Var = this.a;
        if (n60Var != null) {
            n60Var.k(0, n60Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
        int i7 = this.currentAccount;
        i60 i60Var = new i60(this, 0);
        String j02 = org.telegram.messenger.id.j0();
        if (org.telegram.messenger.qp.s1(i7).z7 > 0) {
            if (org.telegram.messenger.qp.e1().getBoolean("langpack_patched" + j02, false) || E0.Q) {
                return;
            }
            E0.Q = true;
            E0.Z0(i7, null, true, new org.telegram.messenger.xc(E0, j02, i60Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.id.E0().V0(this.currentAccount, false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.y4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.y4);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        n60 n60Var = this.a;
        if (n60Var != null) {
            n60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
