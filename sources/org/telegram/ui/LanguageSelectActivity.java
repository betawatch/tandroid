package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public y70 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.wk0 b;
    public y70 c;
    public org.telegram.ui.Components.yy d;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017c, B:87:0x0185, B:89:0x0198, B:91:0x019e, B:93:0x01a9, B:95:0x01b1, B:96:0x01b4, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017c, B:87:0x0185, B:89:0x0198, B:91:0x019e, B:93:0x01a9, B:95:0x01b1, B:96:0x01b4, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017c, B:87:0x0185, B:89:0x0198, B:91:0x019e, B:93:0x01a9, B:95:0x01b1, B:96:0x01b4, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(LanguageSelectActivity languageSelectActivity, View view, int i9) {
        LocaleController.LocaleInfo localeInfo;
        boolean z10;
        boolean z11;
        try {
            org.telegram.ui.Cells.t8 t8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.t8)) {
                if (view instanceof org.telegram.ui.Cells.ba) {
                    languageSelectActivity.presentFragment(new b31());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                    boolean z12 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (!z12) {
                        i9 -= languageSelectActivity.r;
                    }
                    if (z12) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i9);
                    } else if (languageSelectActivity.h.isEmpty() || i9 < 0 || i9 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i9 -= languageSelectActivity.h.size() + 1;
                        }
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i9);
                    } else {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i9);
                    }
                    LocaleController.LocaleInfo localeInfo2 = localeInfo;
                    if (localeInfo2 != null) {
                        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                        boolean z13 = currentLocaleInfo == localeInfo2;
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(languageSelectActivity.getParentActivity(), 3, null);
                        if (!z13) {
                            c2Var.q(500L);
                        }
                        languageSelectActivity.getMessagesController().getTranslateController().reset();
                        int applyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new gh.u5(languageSelectActivity, c2Var, z13, 25));
                        if (applyLanguage != 0) {
                            c2Var.setOnCancelListener(new gh.x(languageSelectActivity, applyLanguage, 7));
                        }
                        String str = localeInfo2.pluralLangCode;
                        String str2 = currentLocaleInfo.pluralLangCode;
                        HashSet X = b31.X();
                        HashSet hashSet = new HashSet(X);
                        if (X.contains(str2) && !X.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new w70(str2, 0));
                        }
                        if (str != null && !BuildConfig.BETA_URL.equals(str)) {
                            hashSet.add(str);
                        }
                        b31.Z(hashSet, Boolean.FALSE);
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().cleanup();
                        TranslateController.invalidateSuggestedLanguageCodes();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.g0() && !languageSelectActivity.f0()) {
                z10 = false;
                if (i9 != languageSelectActivity.manualTranslationPosition) {
                    boolean z14 = !languageSelectActivity.g0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z14);
                    ((org.telegram.ui.Cells.t8) view).setChecked(z14);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i9 == languageSelectActivity.autoTranslationPosition) {
                    boolean f02 = languageSelectActivity.f0();
                    boolean z15 = !f02;
                    if (!f02 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z15);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.t8) view).setChecked(z15);
                    }
                }
                if (!languageSelectActivity.g0() && !languageSelectActivity.f0()) {
                    z11 = false;
                    if (z11 == z10) {
                        int i10 = languageSelectActivity.autoTranslationPosition;
                        if (i10 < 0) {
                            i10 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i11 = 0; i11 < languageSelectActivity.b.getChildCount(); i11++) {
                            View childAt = languageSelectActivity.b.getChildAt(i11);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t8)) {
                                t8Var = (org.telegram.ui.Cells.t8) childAt;
                            }
                        }
                        if (t8Var != null) {
                            t8Var.setDivider(z11);
                        }
                        if (z11) {
                            languageSelectActivity.a.o(i10 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.u(i10 + 1);
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
            if (i9 != languageSelectActivity.manualTranslationPosition) {
            }
            if (!languageSelectActivity.g0()) {
                z11 = false;
                if (z11 == z10) {
                }
            }
            z11 = true;
            if (z11 == z10) {
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static boolean U(LanguageSelectActivity languageSelectActivity, View view, int i9) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                boolean z10 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z10) {
                    i9 -= languageSelectActivity.r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i9);
                } else if (languageSelectActivity.h.isEmpty() || i9 < 0 || i9 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i9 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i9);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i9);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(15, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    public static void V(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.i0();
    }

    public static /* synthetic */ void W(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.e0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            y70 y70Var = languageSelectActivity.a;
            if (y70Var != null) {
                y70Var.l();
            }
            y70 y70Var2 = languageSelectActivity.c;
            if (y70Var2 != null) {
                y70Var2.l();
            }
        }
    }

    public static /* synthetic */ void X(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.i0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 27));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new y70(this, context, false);
        this.c = new y70(this, context, true);
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
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new f2.m0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        x70 x70Var = new x70(this);
        x70Var.n(400L);
        x70Var.C = false;
        x70Var.o(org.telegram.ui.Components.gr.h);
        this.b.setItemAnimator(x70Var);
        frameLayout2.addView(this.b, g7.e6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new i(this, 15));
        this.b.setOnItemLongClickListener(new wt(this, 13));
        this.b.setOnScrollListener(new l3(this, 17));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        e0();
        AndroidUtilities.runOnUIThread(new v70(this, 2));
    }

    public final void e0() {
        mt mtVar = new mt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i9);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f, mtVar);
        Collections.sort(this.h, mtVar);
    }

    public final boolean f0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
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
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        return arrayList;
    }

    public final void h0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new x20(7, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    public final void i0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        y70 y70Var = this.a;
        if (y70Var != null) {
            y70Var.q(0, y70Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new v70(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        e0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
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
        y70 y70Var = this.a;
        if (y70Var != null) {
            y70Var.l();
        }
    }
}
