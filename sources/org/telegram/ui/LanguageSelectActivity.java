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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public h80 a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.mm0 b;
    public h80 c;
    public org.telegram.ui.Components.vz d;
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
                if (view instanceof org.telegram.ui.Cells.ca) {
                    languageSelectActivity.presentFragment(new v21());
                    return;
                }
                if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.g9)) {
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
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(languageSelectActivity.getParentActivity(), 3, null);
                        if (!z12) {
                            c2Var.r(500L);
                        }
                        languageSelectActivity.getMessagesController().getTranslateController().reset();
                        int applyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new ai.y7(languageSelectActivity, c2Var, z12, 29));
                        if (applyLanguage != 0) {
                            c2Var.setOnCancelListener(new ai.e0(languageSelectActivity, applyLanguage, 7));
                        }
                        String str = localeInfo2.pluralLangCode;
                        String str2 = currentLocaleInfo.pluralLangCode;
                        HashSet Y = v21.Y();
                        HashSet hashSet = new HashSet(Y);
                        if (Y.contains(str2) && !Y.contains(str)) {
                            Collection.-EL.removeIf(hashSet, new e80(str2, 0));
                        }
                        if (str != null && !"null".equals(str)) {
                            hashSet.add(str);
                        }
                        v21.a0(hashSet, Boolean.FALSE);
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
                    boolean z13 = !languageSelectActivity.h0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z13);
                    ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean g02 = languageSelectActivity.g0();
                    boolean z14 = !g02;
                    if (!g02 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z14);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.w8) view).setChecked(z14);
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
        } catch (Exception e) {
            FileLog.e(e);
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
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks(13, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
        languageSelectActivity.actionBar.g(true);
        languageSelectActivity.j0();
    }

    public static /* synthetic */ void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            h80 h80Var = languageSelectActivity.a;
            if (h80Var != null) {
                h80Var.l();
            }
            h80 h80Var2 = languageSelectActivity.c;
            if (h80Var2 != null) {
                h80Var2.l();
            }
        }
    }

    public static /* synthetic */ void Y(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.j0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 5));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 11);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.a = new h80(this, context, false);
        this.c = new h80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.d = vzVar;
        vzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        g80 g80Var = new g80(this);
        g80Var.n(400L);
        g80Var.C = false;
        g80Var.o(org.telegram.ui.Components.bs.h);
        this.b.setItemAnimator(g80Var);
        frameLayout2.addView(this.b, w7.z5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 16));
        this.b.setOnItemLongClickListener(new xt(this, 13));
        this.b.setOnScrollListener(new j3(this, 17));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.a == null) {
            return;
        }
        f0();
        AndroidUtilities.runOnUIThread(new d80(this, 2));
    }

    public final void f0() {
        mt mtVar = new mt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
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
        Collections.sort(this.f, mtVar);
        Collections.sort(this.h, mtVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new f80(0, this, str));
            return;
        }
        this.e = null;
        if (this.b != null) {
            this.d.setVisibility(8);
            this.b.setAdapter(this.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.bs.h);
            }
        }
        h80 h80Var = this.a;
        if (h80Var != null) {
            h80Var.q(0, h80Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new d80(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        f0();
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        h80 h80Var = this.a;
        if (h80Var != null) {
            h80Var.l();
        }
    }
}
