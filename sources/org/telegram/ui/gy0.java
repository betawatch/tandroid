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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gy0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static boolean s;
    public static HashSet w;
    public e60 a;
    public org.telegram.ui.Components.tj0 b;
    public e60 c;
    public org.telegram.ui.Components.gy d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public gy0() {
        super(null);
        this.e = -1;
    }

    public static void Z(gy0 gy0Var, View view, int i3) {
        org.telegram.messenger.q00 q00Var;
        ArrayList arrayList;
        if (gy0Var.getParentActivity() == null || gy0Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.r8)) {
            return;
        }
        int i10 = 0;
        boolean z10 = gy0Var.b.getAdapter() == gy0Var.c;
        if (!z10 || (arrayList = gy0Var.f) == null) {
            int i11 = gy0Var.e;
            if (i11 >= 0 && i3 > i11) {
                i3--;
            }
            q00Var = (i3 < 0 || i3 >= gy0Var.h.size()) ? null : (org.telegram.messenger.q00) gy0Var.h.get(i3);
        } else {
            q00Var = (org.telegram.messenger.q00) arrayList.get(i3);
        }
        if (q00Var == null || q00Var.a == null) {
            return;
        }
        org.telegram.messenger.yc ycVar = org.telegram.messenger.bd.E0().B;
        String str = q00Var.a;
        if (gy0Var.r.contains(str)) {
            Collection.-EL.removeIf(gy0Var.r, new c60(str, 2));
        } else {
            gy0Var.r.add(str);
        }
        if (gy0Var.r.size() == 1 && gy0Var.r.contains(ycVar.f)) {
            f0(null, null);
        } else {
            f0(gy0Var.r, Boolean.TRUE);
        }
        if (z10) {
            int i12 = 0;
            while (i10 < gy0Var.f.size()) {
                if (TextUtils.equals(str, ((org.telegram.messenger.q00) gy0Var.f.get(i10)).a)) {
                    gy0Var.e0(i12);
                }
                i10++;
                i12++;
            }
        } else {
            int i13 = 0;
            while (i10 < gy0Var.h.size()) {
                if (i13 == gy0Var.e) {
                    i13++;
                }
                if (TextUtils.equals(str, ((org.telegram.messenger.q00) gy0Var.h.get(i10)).a)) {
                    gy0Var.e0(i13);
                }
                i10++;
                i13++;
            }
        }
        org.telegram.messenger.hp.s1(gy0Var.currentAccount).s7.g();
    }

    public static void a0(boolean z10) {
        final int i3 = 0;
        boolean z11 = org.telegram.messenger.hp.e1().getBoolean("translate_button_restricted_languages_changed", false);
        final int i10 = 2;
        if (org.telegram.messenger.hp.e1().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            ei.e eVar = new ei.e(20);
            final HashSet hashSet = new HashSet();
            final int i11 = 1;
            Utilities.u(0, new org.telegram.messenger.u10() { // from class: org.telegram.ui.fy0
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i3) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.bd.E0().B.f;
                                if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.u10() { // from class: org.telegram.ui.fy0
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.bd.E0().B.f;
                                if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.u10() { // from class: org.telegram.ui.fy0
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.bd.E0().B.f;
                                if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.ui.Components.ei(26, eVar, hashSet));
        }
    }

    public static void b0() {
        s = false;
        org.telegram.messenger.hp.e1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!s) {
            Set<String> stringSet = org.telegram.messenger.hp.e1().getStringSet("translate_button_restricted_languages", null);
            w = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        if (w == null) {
            String[] strArr = {org.telegram.messenger.bd.E0().B.f};
            HashSet hashSet = new HashSet(g9.o.d(1));
            Collections.addAll(hashSet, strArr);
            w = hashSet;
        }
        return w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.x00.n();
        String str = org.telegram.messenger.bd.E0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.q00 q00Var = null;
        int i3 = 0;
        while (i3 < this.h.size()) {
            org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) this.h.get(i3);
            if (TextUtils.equals(q00Var2.a, str)) {
                arrayList2.remove(q00Var2.a);
                this.h.remove(i3);
                i3--;
                q00Var = q00Var2;
            } else if (this.n.contains(q00Var2.a)) {
                arrayList.add(q00Var2);
                arrayList2.remove(q00Var2.a);
                this.h.remove(i3);
                i3--;
            }
            i3++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            org.telegram.messenger.q00 q00Var3 = new org.telegram.messenger.q00();
            String str2 = (String) arrayList2.get(i10);
            q00Var3.a = str2;
            String upperCase = str2.toUpperCase();
            q00Var3.b = upperCase;
            q00Var3.c = upperCase;
            q00Var3.d = q00Var3.a.toLowerCase();
            arrayList.add(q00Var3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (q00Var != null) {
            this.h.add(0, q00Var);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751359, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.C0 = new lg.w1(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.a = new e60(this, context, false, 1);
        this.c = new e60(this, context, true, 1);
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
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new u4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.b.setOnItemClickListener(new nx0(this, 1));
        this.b.setOnScrollListener(new h3(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.y4 || this.a == null) {
            return;
        }
        c0();
        this.a.f();
    }

    public final void e0(int i3) {
        int b10;
        u4.h0 adapter = this.b.getAdapter();
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            u4.d1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i3) {
                adapter.t(T, i3);
                return;
            }
        }
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.n = d0();
        this.r = d0();
        c0();
        org.telegram.messenger.bd.E0().V0(this.currentAccount, true);
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
