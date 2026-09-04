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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public u80 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.ll0 b;
    public u80 c;
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
        boolean z10;
        boolean z11;
        try {
            org.telegram.ui.Cells.w8 w8Var = null;
            if (!(view instanceof org.telegram.ui.Cells.w8)) {
                if (view instanceof org.telegram.ui.Cells.ea) {
                    languageSelectActivity.presentFragment(new h41());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.g9)) {
                    boolean z12 = languageSelectActivity.b.getAdapter() == languageSelectActivity.c;
                    if (!z12) {
                        i10 -= languageSelectActivity.r;
                    }
                    if (z12) {
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
                        boolean z13 = currentLocaleInfo == localeInfo2;
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(languageSelectActivity.getParentActivity(), 3, null);
                        if (!z13) {
                            b2Var.q(500L);
                        }
                        languageSelectActivity.getMessagesController().getTranslateController().reset();
                        int applyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new di.y0(languageSelectActivity, b2Var, z13, 27));
                        if (applyLanguage != 0) {
                            b2Var.setOnCancelListener(new ba(languageSelectActivity, applyLanguage, 6));
                        }
                        String str = localeInfo2.pluralLangCode;
                        String str2 = currentLocaleInfo.pluralLangCode;
                        HashSet Y = h41.Y();
                        HashSet hashSet = new HashSet(Y);
                        if (Y.contains(str2) && !Y.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new s80(str2, 0));
                        }
                        if (str != null && !BuildConfig.BETA_URL.equals(str)) {
                            hashSet.add(str);
                        }
                        h41.a0(hashSet, Boolean.FALSE);
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
                z10 = false;
                if (i10 != languageSelectActivity.manualTranslationPosition) {
                    boolean z14 = !languageSelectActivity.h0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z14);
                    ((org.telegram.ui.Cells.w8) view).setChecked(z14);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean g02 = languageSelectActivity.g0();
                    boolean z15 = !g02;
                    if (!g02 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z15);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.w8) view).setChecked(z15);
                    }
                }
                if (!languageSelectActivity.h0() && !languageSelectActivity.g0()) {
                    z11 = false;
                    if (z11 == z10) {
                        int i11 = languageSelectActivity.autoTranslationPosition;
                        if (i11 < 0) {
                            i11 = languageSelectActivity.manualTranslationPosition;
                        }
                        for (int i12 = 0; i12 < languageSelectActivity.b.getChildCount(); i12++) {
                            View childAt = languageSelectActivity.b.getChildAt(i12);
                            languageSelectActivity.b.getClass();
                            if (RecyclerView.R(childAt) == i11 && (childAt instanceof org.telegram.ui.Cells.w8)) {
                                w8Var = (org.telegram.ui.Cells.w8) childAt;
                            }
                        }
                        if (w8Var != null) {
                            w8Var.setDivider(z11);
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
            if (!languageSelectActivity.h0()) {
                z11 = false;
                if (z11 == z10) {
                }
            }
            z11 = true;
            if (z11 == z10) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static boolean V(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.g9)) {
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new z10(6, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            FileLog.e(e7);
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
            u80 u80Var = languageSelectActivity.a;
            if (u80Var != null) {
                u80Var.l();
            }
            u80 u80Var2 = languageSelectActivity.c;
            if (u80Var2 != null) {
                u80Var2.l();
            }
        }
    }

    public static /* synthetic */ void Y(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.j0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 3));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 11);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new u80(this, context, false);
        this.c = new u80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        t80 t80Var = new t80(this);
        t80Var.n(400L);
        t80Var.C = false;
        t80Var.o(org.telegram.ui.Components.pr.h);
        this.b.setItemAnimator(t80Var);
        frameLayout2.addView(this.b, w7.x5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new i(this, 15));
        this.b.setOnItemLongClickListener(new iu(this, 13));
        this.b.setOnScrollListener(new i3(this, 17));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        f0();
        AndroidUtilities.runOnUIThread(new q80(this, 2));
    }

    public final void f0() {
        wt wtVar = new wt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
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
        Collections.sort(this.f, wtVar);
        Collections.sort(this.h, wtVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.p4.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new r80(1, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.pr.h);
            }
        }
        u80 u80Var = this.a;
        if (u80Var != null) {
            u80Var.q(0, u80Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new q80(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        f0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        u80 u80Var = this.a;
        if (u80Var != null) {
            u80Var.l();
        }
    }
}
