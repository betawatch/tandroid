package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e01 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static boolean s;
    public static HashSet w;
    public i70 a;
    public org.telegram.ui.Components.tk0 b;
    public i70 c;
    public org.telegram.ui.Components.xy d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public e01() {
        super(null);
        this.e = -1;
    }

    public static void Y(e01 e01Var, View view, int i10) {
        org.telegram.messenger.m10 m10Var;
        ArrayList arrayList;
        if (e01Var.getParentActivity() == null || e01Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.u8)) {
            return;
        }
        int i11 = 0;
        boolean z10 = e01Var.b.getAdapter() == e01Var.c;
        if (!z10 || (arrayList = e01Var.f) == null) {
            int i12 = e01Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            m10Var = (i10 < 0 || i10 >= e01Var.h.size()) ? null : (org.telegram.messenger.m10) e01Var.h.get(i10);
        } else {
            m10Var = (org.telegram.messenger.m10) arrayList.get(i10);
        }
        if (m10Var == null || m10Var.a == null) {
            return;
        }
        org.telegram.messenger.zc zcVar = org.telegram.messenger.cd.D0().B;
        String str = m10Var.a;
        if (e01Var.r.contains(str)) {
            Collection.-EL.removeIf(e01Var.r, new g70(str, 2));
        } else {
            e01Var.r.add(str);
        }
        if (e01Var.r.size() == 1 && e01Var.r.contains(zcVar.f)) {
            e0(null, null);
        } else {
            e0(e01Var.r, Boolean.TRUE);
        }
        if (z10) {
            int i13 = 0;
            while (i11 < e01Var.f.size()) {
                if (TextUtils.equals(str, ((org.telegram.messenger.m10) e01Var.f.get(i11)).a)) {
                    e01Var.d0(i13);
                }
                i11++;
                i13++;
            }
        } else {
            int i14 = 0;
            while (i11 < e01Var.h.size()) {
                if (i14 == e01Var.e) {
                    i14++;
                }
                if (TextUtils.equals(str, ((org.telegram.messenger.m10) e01Var.h.get(i11)).a)) {
                    e01Var.d0(i14);
                }
                i11++;
                i14++;
            }
        }
        org.telegram.messenger.vp.r1(e01Var.currentAccount).t7.g();
    }

    public static void Z(boolean z10) {
        final int i10 = 0;
        boolean z11 = org.telegram.messenger.vp.d1().getBoolean("translate_button_restricted_languages_changed", false);
        final int i11 = 2;
        if (org.telegram.messenger.vp.d1().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            ag.z0 z0Var = new ag.z0(19);
            final HashSet hashSet = new HashSet();
            final int i12 = 1;
            Utilities.u(0, new org.telegram.messenger.q20() { // from class: org.telegram.ui.d01
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.cd.D0().B.f;
                                if (org.telegram.ui.Components.m31.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.m31.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.m31.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.g(e10, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.q20() { // from class: org.telegram.ui.d01
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i12) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.cd.D0().B.f;
                                if (org.telegram.ui.Components.m31.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.m31.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.m31.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.g(e10, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.q20() { // from class: org.telegram.ui.d01
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.cd.D0().B.f;
                                if (org.telegram.ui.Components.m31.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.m31.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.m31.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.g(e10, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.ui.Components.vg(29, z0Var, hashSet));
        }
    }

    public static void a0() {
        s = false;
        org.telegram.messenger.vp.d1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        Z(false);
    }

    public static HashSet c0() {
        if (!s) {
            Set<String> stringSet = org.telegram.messenger.vp.d1().getStringSet("translate_button_restricted_languages", null);
            w = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        if (w == null) {
            String[] strArr = {org.telegram.messenger.cd.D0().B.f};
            HashSet hashSet = new HashSet(e9.s.c(1));
            Collections.addAll(hashSet, strArr);
            w = hashSet;
        }
        return w;
    }

    public static void e0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        if (hashSet == null) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            edit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            edit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        edit.apply();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final void b0() {
        this.h = org.telegram.messenger.t10.n();
        String str = org.telegram.messenger.cd.D0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.m10 m10Var = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) this.h.get(i10);
            if (TextUtils.equals(m10Var2.a, str)) {
                arrayList2.remove(m10Var2.a);
                this.h.remove(i10);
                i10--;
                m10Var = m10Var2;
            } else if (this.n.contains(m10Var2.a)) {
                arrayList.add(m10Var2);
                arrayList2.remove(m10Var2.a);
                this.h.remove(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            org.telegram.messenger.m10 m10Var3 = new org.telegram.messenger.m10();
            String str2 = (String) arrayList2.get(i11);
            m10Var3.a = str2;
            String upperCase = str2.toUpperCase();
            m10Var3.b = upperCase;
            m10Var3.c = upperCase;
            m10Var3.d = m10Var3.a.toLowerCase();
            arrayList.add(m10Var3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (m10Var != null) {
            this.h.add(0, m10Var);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751359, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 27));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new ag.l3(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.a = new i70(this, context, false, 1);
        this.c = new i70(this, context, true, 1);
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
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new s4.a0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new kz0(this, 1));
        this.b.setOnScrollListener(new h3(this, 28));
        return this.fragmentView;
    }

    public final void d0(int i10) {
        int b10;
        s4.g0 adapter = this.b.getAdapter();
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.c1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.t(T, i10);
                return;
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.y4 || this.a == null) {
            return;
        }
        b0();
        this.a.f();
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

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.n = c0();
        this.r = c0();
        b0();
        org.telegram.messenger.cd.D0().S0(this.currentAccount, true);
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
