package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public g80 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.mm0 b;
    public g80 c;
    public org.telegram.ui.Components.uz d;
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017b, B:87:0x0184, B:89:0x0197, B:91:0x019d, B:93:0x01a8, B:95:0x01b0, B:96:0x01b3, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017b, B:87:0x0184, B:89:0x0197, B:91:0x019d, B:93:0x01a8, B:95:0x01b0, B:96:0x01b3, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:10:0x0017, B:12:0x001b, B:13:0x007c, B:15:0x0082, B:20:0x008e, B:24:0x0095, B:26:0x009d, B:28:0x00ae, B:30:0x00b2, B:32:0x00b5, B:37:0x00ba, B:39:0x00bf, B:42:0x00c6, B:44:0x0093, B:47:0x003e, B:49:0x0042, B:51:0x004a, B:53:0x0054, B:55:0x005f, B:57:0x00cd, B:59:0x00d1, B:61:0x00da, B:63:0x00e0, B:65:0x00e4, B:69:0x00ea, B:73:0x00f9, B:75:0x00fe, B:78:0x013e, B:81:0x0149, B:83:0x0155, B:84:0x015a, B:86:0x017b, B:87:0x0184, B:89:0x0197, B:91:0x019d, B:93:0x01a8, B:95:0x01b0, B:96:0x01b3, B:99:0x0108, B:102:0x0112, B:104:0x011a, B:105:0x0123, B:107:0x012b, B:108:0x0133), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        boolean z10;
        boolean z11;
        try {
            org.telegram.ui.Cells.a9 a9Var = null;
            if (!(view instanceof org.telegram.ui.Cells.a9)) {
                if (view instanceof org.telegram.ui.Cells.ga) {
                    languageSelectActivity.presentFragment(new y21());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.k9)) {
                    Object[] objArr = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (objArr == false) {
                        i10 -= languageSelectActivity.r;
                    }
                    if (objArr == true) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                    } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i10 -= languageSelectActivity.h.size() + 1;
                        }
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i10);
                    } else {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                    }
                    LocaleController.LocaleInfo localeInfo2 = localeInfo;
                    if (localeInfo2 != null) {
                        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                        boolean z12 = currentLocaleInfo == localeInfo2;
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(languageSelectActivity.getParentActivity(), 3, null);
                        if (!z12) {
                            e2Var.r(500L);
                        }
                        languageSelectActivity.getMessagesController().getTranslateController().reset();
                        int applyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new d80(languageSelectActivity, e2Var, z12, 0));
                        if (applyLanguage != 0) {
                            e2Var.setOnCancelListener(new bi.f0(languageSelectActivity, applyLanguage, 7));
                        }
                        String str = localeInfo2.pluralLangCode;
                        String str2 = currentLocaleInfo.pluralLangCode;
                        HashSet Z = y21.Z();
                        HashSet hashSet = new HashSet(Z);
                        if (Z.contains(str2) && !Z.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new e80(str2, 0));
                        }
                        if (str != null && !BuildConfig.BETA_URL.equals(str)) {
                            hashSet.add(str);
                        }
                        y21.b0(hashSet, Boolean.FALSE);
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().cleanup();
                        TranslateController.invalidateSuggestedLanguageCodes();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.i0() && !languageSelectActivity.h0()) {
                z10 = false;
                if (i10 != languageSelectActivity.manualTranslationPosition) {
                    boolean z13 = !languageSelectActivity.i0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z13);
                    ((org.telegram.ui.Cells.a9) view).setChecked(z13);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean h02 = languageSelectActivity.h0();
                    boolean z14 = !h02;
                    if (!h02 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z14);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.a9) view).setChecked(z14);
                    }
                }
                if (!languageSelectActivity.i0() && !languageSelectActivity.h0()) {
                    z11 = false;
                    if (z11 == z10) {
                        int i11 = languageSelectActivity.autoTranslationPosition;
                        if (i11 < 0) {
                            i11 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i12 = 0; i12 < languageSelectActivity.b.getChildCount(); i12++) {
                            View childAt = languageSelectActivity.b.getChildAt(i12);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i11 && (childAt instanceof org.telegram.ui.Cells.a9)) {
                                a9Var = (org.telegram.ui.Cells.a9) childAt;
                            }
                        }
                        if (a9Var != null) {
                            a9Var.setDivider(z11);
                        }
                        if (z11) {
                            languageSelectActivity.a.o(i11 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.u(i11 + 1);
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
            if (i10 != languageSelectActivity.manualTranslationPosition) {
            }
            if (!languageSelectActivity.i0()) {
                z11 = false;
                if (z11 == z10) {
                }
            }
            z11 = true;
            if (z11 == z10) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean W(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.k9)) {
                boolean z10 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z10) {
                    i10 -= languageSelectActivity.r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i10);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(17, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(e2Var);
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    public static void X(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.f(true);
        languageSelectActivity.k0();
    }

    public static /* synthetic */ void Y(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.g0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            g80 g80Var = languageSelectActivity.a;
            if (g80Var != null) {
                g80Var.l();
            }
            g80 g80Var2 = languageSelectActivity.c;
            if (g80Var2 != null) {
                g80Var2.l();
            }
        }
    }

    public static /* synthetic */ void Z(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.k0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
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
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 7));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.z0 = new jg.e2(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new g80(this, context, false);
        this.c = new g80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.u1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.c0(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        f80 f80Var = new f80(this);
        f80Var.n(400L);
        f80Var.C = false;
        f80Var.o(org.telegram.ui.Components.ds.h);
        this.b.setItemAnimator(f80Var);
        frameLayout.addView(this.b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new qt(this, 14));
        this.b.setOnScrollListener(new i3(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        g0();
        AndroidUtilities.runOnUIThread(new c80(this, 2));
    }

    public final void g0() {
        kt ktVar = new kt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f, ktVar);
        Collections.sort(this.h, ktVar);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    public final boolean i0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new sz(17, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    public final void k0() {
        if (this.simpleActionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), string)) {
                this.simpleActionBar.w(string, true, 350L, org.telegram.ui.Components.ds.h);
            }
        }
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.q(0, g80Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new c80(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        g0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
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
        g80 g80Var = this.a;
        if (g80Var != null) {
            g80Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
