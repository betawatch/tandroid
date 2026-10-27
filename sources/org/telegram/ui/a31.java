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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean s;
    public static HashSet v;
    public z21 a;
    public org.telegram.ui.Components.nm0 b;
    public z21 c;
    public org.telegram.ui.Components.uz d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public a31() {
        super(null);
        this.e = -1;
    }

    public static /* synthetic */ void V(a31 a31Var, View view, int i10) {
        TranslateController.Language language;
        ArrayList arrayList;
        if (a31Var.getParentActivity() == null || a31Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.b9)) {
            return;
        }
        int i11 = 0;
        boolean z10 = a31Var.b.getAdapter() == a31Var.c;
        if (!z10 || (arrayList = a31Var.f) == null) {
            int i12 = a31Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            language = (i10 < 0 || i10 >= a31Var.h.size()) ? null : (TranslateController.Language) a31Var.h.get(i10);
        } else {
            language = (TranslateController.Language) arrayList.get(i10);
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = language.code;
        if (a31Var.r.contains(str)) {
            Collection.-EL.removeIf(a31Var.r, new g80(str, 2));
        } else {
            a31Var.r.add(str);
        }
        if (a31Var.r.size() == 1 && a31Var.r.contains(currentLocaleInfo.pluralLangCode)) {
            b0(null, null);
        } else {
            b0(a31Var.r, Boolean.TRUE);
        }
        if (z10) {
            int i13 = 0;
            while (i11 < a31Var.f.size()) {
                if (TextUtils.equals(str, ((TranslateController.Language) a31Var.f.get(i11)).code)) {
                    a31Var.a0(i13);
                }
                i11++;
                i13++;
            }
        } else {
            int i14 = 0;
            while (i11 < a31Var.h.size()) {
                if (i14 == a31Var.e) {
                    i14++;
                }
                if (TextUtils.equals(str, ((TranslateController.Language) a31Var.h.get(i11)).code)) {
                    a31Var.a0(i14);
                }
                i11++;
                i14++;
            }
        }
        MessagesController.getInstance(a31Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
    }

    public static void W(boolean z10) {
        final int i10 = 0;
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        final int i11 = 2;
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            di.e eVar = new di.e(20);
            final HashSet hashSet = new HashSet();
            final int i12 = 1;
            Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.y21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.g51.N(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.g51.N(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.g51.N(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.y21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.g51.N(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.g51.N(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.g51.N(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.y21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.g51.N(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.g51.N(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.g51.N(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.ui.Components.oy(23, eVar, hashSet));
        }
    }

    public static void X() {
        s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        W(false);
    }

    public static HashSet Z() {
        if (!s) {
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            v = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        if (v == null) {
            String[] strArr = {LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode};
            HashSet hashSet = new HashSet(f9.o.c(1));
            Collections.addAll(hashSet, strArr);
            v = hashSet;
        }
        return v;
    }

    public static void b0(HashSet hashSet, Boolean bool) {
        v = hashSet;
        s = true;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
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

    public final void Y() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.n.contains(language2.code)) {
                arrayList.add(language2);
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            TranslateController.Language language3 = new TranslateController.Language();
            String str2 = (String) arrayList2.get(i11);
            language3.code = str2;
            String upperCase = str2.toUpperCase();
            language3.displayName = upperCase;
            language3.ownDisplayName = upperCase;
            language3.q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (language != null) {
            this.h.add(0, language);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    public final void a0(int i10) {
        int b10;
        s4.h0 adapter = this.b.getAdapter();
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.e1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.v(T, i10);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 2));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.z0 = new jg.e2(this, 18);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new z21(this, context, false);
        this.c = new z21(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var;
        nm0Var.u1();
        this.b.setEmptyView(this.d);
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new s4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.b.setOnItemClickListener(new o11(this, 2));
        this.b.setOnScrollListener(new i3(this, 28));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        Y();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Mh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.n = Z();
        this.r = Z();
        Y();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        z21 z21Var = this.a;
        if (z21Var != null) {
            z21Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
