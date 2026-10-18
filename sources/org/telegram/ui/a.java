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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
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
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.x0 webView = ((o3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                v4 v4Var = (v4) obj;
                if (view != v4Var.e) {
                    int i14 = ((u4) view).e;
                    if (v4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(17));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, v4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        v4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.f5.j(v4Var.getParentActivity(), null, new g(v4Var, i11));
                    break;
                }
            case 4:
                ((h5) obj).b(false);
                break;
            case 5:
                ((c7) obj).m0();
                break;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.p6 p6Var = s6Var.c;
                if (TextUtils.isEmpty(p6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) p6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.b.i, new b1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.h6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                c7 c7Var = ((a7) obj).e;
                c7Var.M = !c7Var.M;
                c7Var.w0(true);
                c7Var.v0();
                break;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f) {
                    case 0:
                        ((o7) n7Var.h).r.v.s0(null, (bi.b) n7Var.getTag(), true);
                        break;
                    default:
                        ((t7) n7Var.h).n.v.s0(null, (bi.b) n7Var.getTag(), true);
                        break;
                }
            case 9:
                ((i4) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.xj0 xj0Var = ((j9) obj).d;
                if (!xj0Var.b()) {
                    xj0Var.setProgress(0.0f);
                    xj0Var.d();
                    break;
                }
                break;
            case 11:
                ((dd) obj).w0();
                break;
            case 12:
                sn snVar = ((hj) obj).b;
                snVar.h0.n();
                ci.b3 b3Var = snVar.J1;
                if (b3Var != null) {
                    b3Var.L1(null, 0);
                }
                snVar.ca();
                break;
            case 13:
                sn snVar2 = ((en) obj).a;
                d5Var = ((org.telegram.ui.ActionBar.n2) snVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    break;
                }
                break;
            case 14:
                ((cq) obj).e.r0(true);
                break;
            case 15:
                ((org.telegram.ui.Cells.v8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 17:
                org.telegram.messenger.kk.n(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 18:
                final xu xuVar = (xu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uu
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                xuVar.dismiss();
                                break;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                n2.e eVar = xuVar2.Z;
                                ((c7) eVar.c).l0(xuVar2.Y, xuVar2.b0, xuVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uu
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                xuVar.dismiss();
                                break;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                n2.e eVar = xuVar2.Z;
                                ((c7) eVar.c).l0(xuVar2.Y, xuVar2.b0, xuVar2.g0);
                                break;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.h();
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
                ((c00) obj).R();
                break;
            case 22:
                ((b00) obj).a.dismiss();
                break;
            case 23:
                org.telegram.ui.Components.xj0 xj0Var2 = ((f00) obj).a;
                if (!xj0Var2.b()) {
                    xj0Var2.setProgress(0.0f);
                    xj0Var2.d();
                    break;
                }
                break;
            case 24:
                ((i00) obj).c();
                break;
            case 25:
                j10 j10Var = (j10) obj;
                org.telegram.ui.Components.ba0 ba0Var = j10Var.s;
                if ((!j10Var.r || ba0Var.c()) && j10Var.x != null) {
                    j10Var.r = true;
                    ba0Var.b = -1L;
                    ba0Var.c = -1L;
                    j10Var.n.invalidate();
                    c00.T(j10Var.E, j10Var.x, new fz(j10Var, i11));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.xj0 xj0Var3 = ((k10) obj).a;
                if (!xj0Var3.b()) {
                    xj0Var3.setProgress(0.0f);
                    xj0Var3.d();
                    break;
                }
                break;
            case 27:
                final n10 n10Var = (n10) obj;
                j10 j10Var2 = (j10) view.getParent();
                final MessagesController.DialogFilter currentFilter = j10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(filtersSetupActivity, j10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.m10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = n10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zu(6, n10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new v3(n10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.m10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = n10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zu(6, n10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new v3(n10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(j10Var2, false));
                H.Z();
                break;
            case 28:
                ((c50) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) obj;
                xpVar.a(!xpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.a.q).apply();
                break;
        }
    }
}
