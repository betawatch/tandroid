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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public k80 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.sl0 b;
    public k80 c;
    public org.telegram.ui.Components.mz d;
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
    public static void U(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        boolean z4;
        boolean z10;
        try {
            org.telegram.ui.Cells.s8 s8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.s8)) {
                if (view instanceof org.telegram.ui.Cells.aa) {
                    languageSelectActivity.presentFragment(new n31());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.c9)) {
                    boolean z11 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (!z11) {
                        i10 -= languageSelectActivity.r;
                    }
                    if (z11) {
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
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(languageSelectActivity.getParentActivity(), 3, null);
                        if (!z12) {
                            d2Var.q(500L);
                        }
                        languageSelectActivity.getMessagesController().getTranslateController().reset();
                        int applyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new lh.r5(languageSelectActivity, d2Var, z12, 23));
                        if (applyLanguage != 0) {
                            d2Var.setOnCancelListener(new lh.w(languageSelectActivity, applyLanguage, 7));
                        }
                        String str = localeInfo2.pluralLangCode;
                        String str2 = currentLocaleInfo.pluralLangCode;
                        HashSet Y = n31.Y();
                        HashSet hashSet = new HashSet(Y);
                        if (Y.contains(str2) && !Y.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new i80(str2, 0));
                        }
                        if (str != null && !BuildConfig.BETA_URL.equals(str)) {
                            hashSet.add(str);
                        }
                        n31.a0(hashSet, Boolean.FALSE);
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                        MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().cleanup();
                        TranslateController.invalidateSuggestedLanguageCodes();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!languageSelectActivity.h0() && !languageSelectActivity.g0()) {
                z4 = false;
                if (i10 != languageSelectActivity.manualTranslationPosition) {
                    boolean z13 = !languageSelectActivity.h0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z13);
                    ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean g02 = languageSelectActivity.g0();
                    boolean z14 = !g02;
                    if (!g02 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z14);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                    }
                }
                if (!languageSelectActivity.h0() && !languageSelectActivity.g0()) {
                    z10 = false;
                    if (z10 == z4) {
                        int i11 = languageSelectActivity.autoTranslationPosition;
                        if (i11 < 0) {
                            i11 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i12 = 0; i12 < languageSelectActivity.b.getChildCount(); i12++) {
                            View childAt = languageSelectActivity.b.getChildAt(i12);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i11 && (childAt instanceof org.telegram.ui.Cells.s8)) {
                                s8Var = (org.telegram.ui.Cells.s8) childAt;
                            }
                        }
                        if (s8Var != null) {
                            s8Var.setDivider(z10);
                        }
                        if (z10) {
                            languageSelectActivity.a.o(i11 + 1);
                            return;
                        } else {
                            languageSelectActivity.a.u(i11 + 1);
                            return;
                        }
                    }
                    return;
                }
                z10 = true;
                if (z10 == z4) {
                }
            }
            z4 = true;
            if (i10 != languageSelectActivity.manualTranslationPosition) {
            }
            if (!languageSelectActivity.h0()) {
                z10 = false;
                if (z10 == z4) {
                }
            }
            z10 = true;
            if (z10 == z4) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean V(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.c9)) {
                boolean z4 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                if (!z4) {
                    i10 -= languageSelectActivity.r;
                }
                if (z4) {
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qs(14, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
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

    public static void W(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.j0();
    }

    public static /* synthetic */ void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            k80 k80Var = languageSelectActivity.a;
            if (k80Var != null) {
                k80Var.l();
            }
            k80 k80Var2 = languageSelectActivity.c;
            if (k80Var2 != null) {
                k80Var2.l();
            }
        }
    }

    public static /* synthetic */ void Y(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.j0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 19));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new k80(this, context, false);
        this.c = new k80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new f2.i0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        j80 j80Var = new j80(this);
        j80Var.n(400L);
        j80Var.C = false;
        j80Var.o(org.telegram.ui.Components.nr.h);
        this.b.setItemAnimator(j80Var);
        frameLayout2.addView(this.b, k7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new j(this, 15));
        this.b.setOnItemLongClickListener(new fu(this, 13));
        this.b.setOnScrollListener(new l3(this, 17));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        f0();
        AndroidUtilities.runOnUIThread(new h80(this, 2));
    }

    public final void f0() {
        tt ttVar = new tt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
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
        Collections.sort(this.f, ttVar);
        Collections.sort(this.h, ttVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new g00(13, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.nr.h);
            }
        }
        k80 k80Var = this.a;
        if (k80Var != null) {
            k80Var.q(0, k80Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new h80(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        f0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        k80 k80Var = this.a;
        if (k80Var != null) {
            k80Var.l();
        }
    }
}
