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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((ai.s1) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.y0 webView = ((m3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                p4 p4Var = (p4) obj;
                if (view != p4Var.e) {
                    int i14 = ((o4) view).e;
                    if (p4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(22));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, p4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        p4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.g5.j(p4Var.getParentActivity(), null, new g(p4Var, i11));
                    break;
                }
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((y6) obj).m0();
                break;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.q6 q6Var = o6Var.c;
                if (TextUtils.isEmpty(q6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) q6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.b.i, new z0(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.i6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                y6 y6Var = ((w6) obj).e;
                y6Var.M = !y6Var.M;
                y6Var.w0(true);
                y6Var.v0();
                break;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f) {
                    case 0:
                        ((k7) j7Var.h).r.v.y0(null, (zh.a) j7Var.getTag(), true);
                        break;
                    default:
                        ((p7) j7Var.h).n.v.y0(null, (zh.a) j7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ai.s1) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.fk0 fk0Var = ((g9) obj).d;
                if (!fk0Var.b()) {
                    fk0Var.setProgress(0.0f);
                    fk0Var.d();
                    break;
                }
                break;
            case 11:
                ((bd) obj).w0();
                break;
            case 12:
                zn znVar = ((oj) obj).b;
                znVar.h0.n();
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.L1(null, 0);
                }
                znVar.ca();
                break;
            case 13:
                zn znVar2 = ((ln) obj).a;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    break;
                }
                break;
            case 14:
                ((mq) obj).e.r0(true);
                break;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 17:
                org.telegram.messenger.bi.n(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 18:
                final iv ivVar = (iv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ivVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                ivVar.dismiss();
                                break;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n6.t tVar = ivVar2.Z;
                                ((y6) tVar.c).l0(ivVar2.Y, ivVar2.b0, ivVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                ivVar.dismiss();
                                break;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n6.t tVar = ivVar2.Z;
                                ((y6) tVar.c).l0(ivVar2.Y, ivVar2.b0, ivVar2.g0);
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
                ((r00) obj).R();
                break;
            case 22:
                ((q00) obj).a.dismiss();
                break;
            case 23:
                org.telegram.ui.Components.fk0 fk0Var2 = ((v00) obj).a;
                if (!fk0Var2.b()) {
                    fk0Var2.setProgress(0.0f);
                    fk0Var2.d();
                    break;
                }
                break;
            case 24:
                ((y00) obj).c();
                break;
            case 25:
                y10 y10Var = (y10) obj;
                org.telegram.ui.Components.ia0 ia0Var = y10Var.s;
                if ((!y10Var.r || ia0Var.c()) && y10Var.x != null) {
                    y10Var.r = true;
                    ia0Var.b = -1L;
                    ia0Var.c = -1L;
                    y10Var.n.invalidate();
                    r00.T(y10Var.E, y10Var.x, new uz(y10Var, i11));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.fk0 fk0Var3 = ((z10) obj).a;
                if (!fk0Var3.b()) {
                    fk0Var3.setProgress(0.0f);
                    fk0Var3.d();
                    break;
                }
                break;
            case 27:
                final c20 c20Var = (c20) obj;
                y10 y10Var2 = (y10) view.getParent();
                final MessagesController.DialogFilter currentFilter = y10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = c20Var.e;
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(filtersSetupActivity, y10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.b20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = c20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rw(2, c20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.s10.U(filtersSetupActivity3, dialogFilter2.id, new t3(c20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.b20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = c20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rw(2, c20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.s10.U(filtersSetupActivity3, dialogFilter2.id, new t3(c20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(y10Var2, false));
                H.Z();
                break;
            case 28:
                ((p50) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) obj;
                dqVar.a(!dqVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.a.q).apply();
                break;
        }
    }
}
