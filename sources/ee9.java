// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ee9 extends e implements fn7 {
    public static boolean s;
    public static HashSet w;
    public nz5 a;
    public d79 b;
    public nz5 c;
    public b34 d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public ee9() {
        super(null);
        this.e = -1;
    }

    public static void Y(boolean z) {
        final byte b = 0;
        boolean z2 = uc7.e1().getBoolean("translate_button_restricted_languages_changed", false);
        final byte b2 = 2;
        if (uc7.e1().getInt("translate_button_restricted_languages_version", 0) != 2 || (z && !z2)) {
            bm0 bm0Var = new bm0((byte) 24);
            final HashSet hashSet = new HashSet();
            final byte b3 = 1;
            Utilities.u(0, new pcc() { // from class: de9
                @Override // pcc
                public final void a(Object obj) {
                    byte b4 = b;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = ob6.D0().B.f;
                                if (r3c.K0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (r3c.K0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (r3c.K0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new pcc() { // from class: de9
                @Override // pcc
                public final void a(Object obj) {
                    byte b4 = b3;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = ob6.D0().B.f;
                                if (r3c.K0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (r3c.K0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (r3c.K0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new pcc() { // from class: de9
                @Override // pcc
                public final void a(Object obj) {
                    byte b4 = b2;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = ob6.D0().B.f;
                                if (r3c.K0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (r3c.K0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (r3c.K0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new v35(bm0Var, hashSet, (byte) 25));
        }
    }

    public static void Z() {
        s = false;
        uc7.e1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        Y(false);
    }

    public static HashSet b0() {
        if (!s) {
            Set<String> stringSet = uc7.e1().getStringSet("translate_button_restricted_languages", null);
            w = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        HashSet hashSet = w;
        if (hashSet != null) {
            return hashSet;
        }
        String[] strArr = {ob6.D0().B.f};
        HashSet hashSet2 = new HashSet(use.a(1));
        Collections.addAll(hashSet2, strArr);
        w = hashSet2;
        return hashSet2;
    }

    public static void e0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = uc7.e1().edit();
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

    public final void a0() {
        this.h = a5c.m();
        String str = ob6.D0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        t4c t4cVar = null;
        int i = 0;
        while (i < this.h.size()) {
            t4c t4cVar2 = (t4c) this.h.get(i);
            if (TextUtils.equals(t4cVar2.a, str)) {
                arrayList2.remove(t4cVar2.a);
                this.h.remove(i);
                i--;
                t4cVar = t4cVar2;
            } else if (this.n.contains(t4cVar2.a)) {
                arrayList.add(t4cVar2);
                arrayList2.remove(t4cVar2.a);
                this.h.remove(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            t4c t4cVar3 = new t4c();
            String str2 = (String) arrayList2.get(i2);
            t4cVar3.a = str2;
            String upperCase = str2.toUpperCase();
            t4cVar3.b = upperCase;
            t4cVar3.c = upperCase;
            t4cVar3.d = t4cVar3.a.toLowerCase();
            arrayList.add(t4cVar3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        int size = arrayList.size() + this.e;
        this.e = size;
        if (t4cVar != null) {
            this.h.add(0, t4cVar);
            size = this.e + 1;
            this.e = size;
        }
        if (size <= 0) {
            this.e = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void c0(int i, View view) {
        t4c t4cVar;
        ArrayList arrayList;
        if (getParentActivity() == null || this.parentLayout == null || !(view instanceof xkb)) {
            return;
        }
        int i2 = 0;
        boolean z = this.b.getAdapter() == this.c;
        if (!z || (arrayList = this.f) == null) {
            int i3 = this.e;
            if (i3 >= 0 && i > i3) {
                i--;
            }
            t4cVar = (i < 0 || i >= this.h.size()) ? null : (t4c) this.h.get(i);
        } else {
            t4cVar = (t4c) arrayList.get(i);
        }
        if (t4cVar == null || t4cVar.a == null) {
            return;
        }
        mb6 mb6Var = ob6.D0().B;
        String str = t4cVar.a;
        boolean contains = this.r.contains(str);
        HashSet hashSet = this.r;
        if (contains) {
            Collection.-EL.removeIf(hashSet, new lz5(str, (byte) 2));
        } else {
            hashSet.add(str);
        }
        if (this.r.size() == 1 && this.r.contains(mb6Var.f)) {
            e0(null, null);
        } else {
            e0(this.r, Boolean.TRUE);
        }
        if (z) {
            int i4 = 0;
            while (i2 < this.f.size()) {
                if (TextUtils.equals(str, ((t4c) this.f.get(i2)).a)) {
                    d0(i4);
                }
                i2++;
                i4++;
            }
        } else {
            int i5 = 0;
            while (i2 < this.h.size()) {
                if (i5 == this.e) {
                    i5++;
                }
                if (TextUtils.equals(str, ((t4c) this.h.get(i2)).a)) {
                    d0(i5);
                }
                i2++;
                i5++;
            }
        }
        uc7.s1(this.currentAccount).j4.f();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131751323, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 10));
        sla a = this.simpleActionBar.v().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new r10(this, (byte) 21);
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.a = new nz5(this, context, false, (byte) 1);
        this.c = new nz5(this, context, 1 == true ? 1 : 0, 1 == true ? 1 : 0);
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
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new t39(this, (byte) 2));
        this.b.setOnScrollListener(new e98(this, (byte) 13));
        return this.fragmentView;
    }

    public final void d0(int i) {
        int b;
        j79 adapter = this.b.getAdapter();
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            f89 U = this.b.U(this.b.getChildAt(i2));
            if (U != null && (b = U.b()) != -1 && b == i) {
                adapter.t(U, i);
                return;
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.B4 || this.a == null) {
            return;
        }
        a0();
        this.a.f();
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        this.n = b0();
        this.r = b0();
        a0();
        ob6.D0().V0(this.currentAccount, true);
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
