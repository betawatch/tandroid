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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public j60 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.uj0 b;
    public j60 c;
    public org.telegram.ui.Components.ny d;
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
        org.telegram.messenger.dd ddVar;
        boolean z10;
        int i10;
        boolean z11;
        try {
            org.telegram.ui.Cells.q8 q8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.q8)) {
                if (view instanceof org.telegram.ui.Cells.v9) {
                    languageSelectActivity.presentFragment(new oy0());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
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
                        org.telegram.messenger.c10 c10Var = languageSelectActivity.getMessagesController().t7;
                        c10Var.c.clear();
                        c10Var.e.clear();
                        int c10 = org.telegram.messenger.hd.E0().c(ddVar2, true, false, false, true, languageSelectActivity.currentAccount, new f60(languageSelectActivity, t1Var, z12, 0));
                        if (c10 != 0) {
                            t1Var.setOnCancelListener(new g60(c10, 0));
                        }
                        String str = ddVar2.f;
                        String str2 = ddVar3.f;
                        HashSet d02 = oy0.d0();
                        HashSet hashSet = new HashSet(d02);
                        if (d02.contains(str2) && !d02.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new h60(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        oy0.f0(hashSet, Boolean.FALSE);
                        org.telegram.messenger.np.s1(languageSelectActivity.currentAccount).t7.g();
                        org.telegram.messenger.np.s1(languageSelectActivity.currentAccount).t7.i();
                        org.telegram.messenger.c10.P = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                z10 = false;
                i10 = languageSelectActivity.manualTranslationPosition;
                int i11 = org.telegram.messenger.ns.D1;
                if (i7 != i10) {
                    boolean z13 = !languageSelectActivity.l0();
                    org.telegram.messenger.c10 c10Var2 = languageSelectActivity.getMessagesController().t7;
                    SharedPreferences.Editor edit = c10Var2.n.f7.edit();
                    c10Var2.s = Boolean.valueOf(z13);
                    edit.putBoolean("translate_button", z13).apply();
                    ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                    org.telegram.messenger.ns.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
                } else if (i7 == languageSelectActivity.autoTranslationPosition) {
                    boolean k02 = languageSelectActivity.k0();
                    boolean z14 = !k02;
                    if (!k02 && !languageSelectActivity.getUserConfig().q()) {
                        languageSelectActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) languageSelectActivity, 13, false));
                        return;
                    }
                    org.telegram.messenger.c10 c10Var3 = languageSelectActivity.getMessagesController().t7;
                    SharedPreferences.Editor edit2 = c10Var3.n.f7.edit();
                    c10Var3.r = Boolean.valueOf(z14);
                    edit2.putBoolean("translate_chat_button", z14).apply();
                    org.telegram.messenger.ns.f(languageSelectActivity.currentAccount).k(i11, new Object[0]);
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
            int i112 = org.telegram.messenger.ns.D1;
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
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
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
                    t1Var.S = org.telegram.messenger.hd.M0(2131751531, null);
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("DeleteLocalizationText", null, 2131751532, ddVar.a));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(13, languageSelectActivity, ddVar));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
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
        languageSelectActivity.simpleActionBar.m(true);
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
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(ddVar);
                }
                j60 j60Var = languageSelectActivity.a;
                if (j60Var != null) {
                    j60Var.f();
                }
                j60 j60Var2 = languageSelectActivity.c;
                if (j60Var2 != null) {
                    j60Var2.f();
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749054, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 11));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new kg.x1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.a = new j60(this, context, false, 0 == true ? 1 : 0);
        this.c = new j60(this, context, z10, 0 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        i60 i60Var = new i60(this);
        i60Var.n(400L);
        i60Var.C = false;
        i60Var.o(org.telegram.ui.Components.er.h);
        this.b.setItemAnimator(i60Var);
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new zr(this, 15));
        this.b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.y4 || this.a == null) {
            return;
        }
        j0();
        org.telegram.messenger.g0.h3(new e60(this, 2));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Di));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        return getMessagesController().t7.u();
    }

    public final boolean l0() {
        return getMessagesController().t7.s();
    }

    public final void m0(String str) {
        if (str != null) {
            Utilities.g.c(new g50(4, this, str));
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
            String M0 = org.telegram.messenger.hd.M0(2131749054, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.D(M0, true, 350L, org.telegram.ui.Components.er.h);
            }
        }
        j60 j60Var = this.a;
        if (j60Var != null) {
            j60Var.k(0, j60Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = this.currentAccount;
        e60 e60Var = new e60(this, 0);
        String j02 = org.telegram.messenger.hd.j0();
        if (org.telegram.messenger.np.s1(i7).A7 > 0) {
            if (org.telegram.messenger.np.e1().getBoolean("langpack_patched" + j02, false) || E0.Q) {
                return;
            }
            E0.Q = true;
            E0.Z0(i7, null, true, new org.telegram.messenger.vc(E0, j02, e60Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.hd.E0().V0(this.currentAccount, false);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.y4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.y4);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        j60 j60Var = this.a;
        if (j60Var != null) {
            j60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
