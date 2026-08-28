package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b31 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean s;
    public static HashSet v;
    public a31 a;
    public org.telegram.ui.Components.wk0 b;
    public a31 c;
    public org.telegram.ui.Components.yy d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public b31() {
        super(null);
        this.e = -1;
    }

    public static /* synthetic */ void T(b31 b31Var, View view, int i9) {
        TranslateController.Language language;
        ArrayList arrayList;
        if (b31Var.getParentActivity() == null || b31Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.u8)) {
            return;
        }
        int i10 = 0;
        boolean z10 = b31Var.b.getAdapter() == b31Var.c;
        if (!z10 || (arrayList = b31Var.f) == null) {
            int i11 = b31Var.e;
            if (i11 >= 0 && i9 > i11) {
                i9--;
            }
            language = (i9 < 0 || i9 >= b31Var.h.size()) ? null : (TranslateController.Language) b31Var.h.get(i9);
        } else {
            language = (TranslateController.Language) arrayList.get(i9);
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = language.code;
        if (b31Var.r.contains(str)) {
            Collection.-EL.removeIf(b31Var.r, new w70(str, 2));
        } else {
            b31Var.r.add(str);
        }
        if (b31Var.r.size() == 1 && b31Var.r.contains(currentLocaleInfo.pluralLangCode)) {
            Z(null, null);
        } else {
            Z(b31Var.r, Boolean.TRUE);
        }
        if (z10) {
            int i12 = 0;
            while (i10 < b31Var.f.size()) {
                if (TextUtils.equals(str, ((TranslateController.Language) b31Var.f.get(i10)).code)) {
                    b31Var.Y(i12);
                }
                i10++;
                i12++;
            }
        } else {
            int i13 = 0;
            while (i10 < b31Var.h.size()) {
                if (i13 == b31Var.e) {
                    i13++;
                }
                if (TextUtils.equals(str, ((TranslateController.Language) b31Var.h.get(i10)).code)) {
                    b31Var.Y(i13);
                }
                i10++;
                i13++;
            }
        }
        MessagesController.getInstance(b31Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
    }

    public static void U(boolean z10) {
        final int i9 = 0;
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        final int i10 = 2;
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            bg.k kVar = new bg.k(6);
            final HashSet hashSet = new HashSet();
            final int i11 = 1;
            Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.z21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i9) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.z21.D(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.z21.D(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
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
                                            if (org.telegram.ui.Components.z21.D(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.z21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.z21.D(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.z21.D(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
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
                                            if (org.telegram.ui.Components.z21.D(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.z21
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.z21.D(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.z21.D(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
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
                                            if (org.telegram.ui.Components.z21.D(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new eb0(10, kVar, hashSet));
        }
    }

    public static void V() {
        s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        U(false);
    }

    public static HashSet X() {
        if (!s) {
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            v = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        if (v == null) {
            String[] strArr = {LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode};
            HashSet l10 = o8.l.l(1);
            Collections.addAll(l10, strArr);
            v = l10;
        }
        return v;
    }

    public static void Z(HashSet hashSet, Boolean bool) {
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

    public final void W() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        TranslateController.Language language = null;
        int i9 = 0;
        while (i9 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i9);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i9);
                i9--;
                language = language2;
            } else if (this.n.contains(language2.code)) {
                arrayList.add(language2);
                arrayList2.remove(language2.code);
                this.h.remove(i9);
                i9--;
            }
            i9++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TranslateController.Language language3 = new TranslateController.Language();
            String str2 = (String) arrayList2.get(i10);
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

    public final void Y(int i9) {
        int b10;
        f2.r0 adapter = this.b.getAdapter();
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            f2.q1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i9) {
                adapter.v(T, i9);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 21));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 15);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new a31(this, context, false);
        this.c = new a31(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.d = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new f2.m0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout2.addView(this.b, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnItemClickListener(new c21(this, 1));
        this.b.setOnScrollListener(new l3(this, 28));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        W();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.n = X();
        this.r = X();
        W();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.b.setPadding(0, 0, 0, i12);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        a31 a31Var = this.a;
        if (a31Var != null) {
            a31Var.l();
        }
    }
}
