package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 4;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((ah.o) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.y0 webView = ((o3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                u4 u4Var = (u4) obj;
                if (view != u4Var.e) {
                    int i14 = ((t4) view).e;
                    if (u4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.w0(17));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.z0(5, u4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        u4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.g5.j(u4Var.getParentActivity(), null, new g(u4Var, i11));
                    break;
                }
            case 4:
                ((g5) obj).b(false);
                break;
            case 5:
                ((d7) obj).m0();
                break;
            case 6:
                t6 t6Var = (t6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.r6 r6Var = t6Var.c;
                if (TextUtils.isEmpty(r6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) r6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(t6Var.b.i, new b1(t6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                t6Var.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.g6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.g6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                d7 d7Var = ((b7) obj).e;
                d7Var.M = !d7Var.M;
                d7Var.w0(true);
                d7Var.v0();
                break;
            case 8:
                o7 o7Var = (o7) obj;
                switch (o7Var.f) {
                    case 0:
                        ((p7) o7Var.h).r.v.j1(null, (ai.b) o7Var.getTag(), true);
                        break;
                    default:
                        ((u7) o7Var.h).n.v.j1(null, (ai.b) o7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ah.o) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.bk0 bk0Var = ((k9) obj).d;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    break;
                }
                break;
            case 11:
                ((hd) obj).w0();
                break;
            case 12:
                fo foVar = ((sj) obj).b;
                foVar.h0.n();
                bi.w3 w3Var = foVar.J1;
                if (w3Var != null) {
                    w3Var.L1(null, 0);
                }
                foVar.ca();
                break;
            case 13:
                fo foVar2 = ((qn) obj).a;
                b5Var = ((org.telegram.ui.ActionBar.m2) foVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    break;
                }
                break;
            case 14:
                ((sq) obj).e.r0(true);
                break;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 17:
                org.telegram.messenger.yh.m(3, (org.telegram.ui.ActionBar.m2) obj);
                break;
            case 18:
                final ov ovVar = (ov) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ovVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.lv
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                ovVar.dismiss();
                                break;
                            default:
                                ov ovVar2 = ovVar;
                                ovVar2.dismiss();
                                n6.o oVar = ovVar2.Z;
                                ((d7) oVar.c).l0(ovVar2.Y, ovVar2.b0, ovVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.lv
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                ovVar.dismiss();
                                break;
                            default:
                                ov ovVar2 = ovVar;
                                ovVar2.dismiss();
                                n6.o oVar = ovVar2.Z;
                                ((d7) oVar.c).l0(ovVar2.Y, ovVar2.b0, ovVar2.g0);
                                break;
                        }
                    }
                });
                a2Var3.show();
                a2Var3.h();
                break;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 20:
                String str2 = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str2);
                    break;
                }
                break;
            case 21:
                ((x00) obj).R();
                break;
            case 22:
                ((w00) obj).a.dismiss();
                break;
            case 23:
                org.telegram.ui.Components.bk0 bk0Var2 = ((b10) obj).a;
                if (!bk0Var2.b()) {
                    bk0Var2.setProgress(0.0f);
                    bk0Var2.d();
                    break;
                }
                break;
            case 24:
                ((e10) obj).c();
                break;
            case 25:
                e20 e20Var = (e20) obj;
                org.telegram.ui.Components.ha0 ha0Var = e20Var.s;
                if ((!e20Var.r || ha0Var.c()) && e20Var.x != null) {
                    e20Var.r = true;
                    ha0Var.b = -1L;
                    ha0Var.c = -1L;
                    e20Var.n.invalidate();
                    x00.T(e20Var.E, e20Var.x, new zz(e20Var, i11));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.bk0 bk0Var3 = ((f20) obj).a;
                if (!bk0Var3.b()) {
                    bk0Var3.setProgress(0.0f);
                    bk0Var3.d();
                    break;
                }
                break;
            case 27:
                final i20 i20Var = (i20) obj;
                e20 e20Var2 = (e20) view.getParent();
                final MessagesController.DialogFilter currentFilter = e20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = i20Var.e;
                org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(filtersSetupActivity, e20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.h20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                i20 i20Var2 = i20Var;
                                FiltersSetupActivity filtersSetupActivity2 = i20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new l10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = i20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                i20 i20Var3 = i20Var;
                                FiltersSetupActivity filtersSetupActivity3 = i20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new gw(5, i20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(a2Var4);
                                    TextView textView = (TextView) a2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.o10.U(filtersSetupActivity3, dialogFilter2.id, new v3(i20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.h20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                i20 i20Var2 = i20Var;
                                FiltersSetupActivity filtersSetupActivity2 = i20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new l10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = i20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                i20 i20Var3 = i20Var;
                                FiltersSetupActivity filtersSetupActivity3 = i20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new gw(5, i20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(a2Var4);
                                    TextView textView = (TextView) a2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.o10.U(filtersSetupActivity3, dialogFilter2.id, new v3(i20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(e20Var2, false));
                H.Z();
                break;
            case 28:
                ((w50) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.aq aqVar = (org.telegram.ui.Components.aq) obj;
                aqVar.a(!aqVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.a.q).apply();
                break;
        }
    }
}
