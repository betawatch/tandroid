package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        CameraSessionWrapper cameraSession;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i9 = this.a;
        int i10 = 9;
        int i11 = 3;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ((d5.i) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.v0 webView = ((p3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                p4 p4Var = (p4) obj;
                if (view != p4Var.e) {
                    int i14 = ((o4) view).e;
                    if (p4Var.T() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(16));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ih.v3(i10, p4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        p4Var.V(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.y4.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    break;
                }
            case 4:
                ((b5) obj).b(false);
                break;
            case 5:
                ((y6) obj).l0();
                break;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.i6 i6Var = o6Var.c;
                if (TextUtils.isEmpty(i6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) i6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.N = sb3;
                c2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.b.g, new b1(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.f6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                y6 y6Var = ((w6) obj).e;
                y6Var.I = !y6Var.I;
                y6Var.v0(true);
                y6Var.u0();
                break;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f) {
                    case 0:
                        ((k7) j7Var.h).r.v.o1(null, (hh.a) j7Var.getTag(), true);
                        break;
                    default:
                        ((p7) j7Var.h).n.v.o1(null, (hh.a) j7Var.getTag(), true);
                        break;
                }
            case 9:
                ((d5.i) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.pi0 pi0Var = ((f9) obj).d;
                if (!pi0Var.b()) {
                    pi0Var.setProgress(0.0f);
                    pi0Var.d();
                    break;
                }
                break;
            case 11:
                s9 s9Var = (s9) obj;
                CameraView cameraView = s9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) s9Var.r.getBackground();
                    AnimatorSet animatorSet = s9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        s9Var.s = null;
                    }
                    s9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.m6.e, s9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new m9(s9Var, i13));
                    s9Var.s.playTogether(ofInt);
                    s9Var.s.setDuration(200L);
                    s9Var.s.setInterpolator(org.telegram.ui.Components.gr.f);
                    s9Var.s.addListener(new mh.x(s9Var, i10));
                    s9Var.s.start();
                    if (s9Var.r.getTag() != null) {
                        s9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        s9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((xc) obj).v0();
                break;
            case 13:
                qn qnVar = ((bj) obj).b;
                qnVar.d0.n();
                ih.u2 u2Var = qnVar.F1;
                if (u2Var != null) {
                    u2Var.I1(null, 0);
                }
                qnVar.X9();
                break;
            case 14:
                qn qnVar2 = ((cn) obj).a;
                b5Var = ((org.telegram.ui.ActionBar.o2) qnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    break;
                }
                break;
            case 15:
                ((aq) obj).e.q0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.t8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable.run();
                break;
            case 18:
                org.telegram.messenger.ll.m(3, (org.telegram.ui.ActionBar.o2) obj);
                break;
            case 19:
                final xu xuVar = (xu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.N = string2;
                c2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.uu
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                xuVar.dismiss();
                                break;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                g5.b bVar = xuVar2.V;
                                ((y6) bVar.c).k0(xuVar2.U, xuVar2.X, xuVar2.c0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.uu
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                xuVar.dismiss();
                                break;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                g5.b bVar = xuVar2.V;
                                ((y6) bVar.c).k0(xuVar2.U, xuVar2.X, xuVar2.c0);
                                break;
                        }
                    }
                });
                c2Var3.show();
                c2Var3.h();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 21:
                String str2 = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str2);
                    break;
                }
                break;
            case 22:
                ((a00) obj).P();
                break;
            case 23:
                ((zz) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.pi0 pi0Var2 = ((d00) obj).a;
                if (!pi0Var2.b()) {
                    pi0Var2.setProgress(0.0f);
                    pi0Var2.d();
                    break;
                }
                break;
            case 25:
                ((g00) obj).c();
                break;
            case 26:
                h10 h10Var = (h10) obj;
                org.telegram.ui.Components.p80 p80Var = h10Var.s;
                if ((!h10Var.r || p80Var.b()) && h10Var.x != null) {
                    h10Var.r = true;
                    p80Var.b = -1L;
                    p80Var.c = -1L;
                    h10Var.n.invalidate();
                    a00.R(h10Var.A, h10Var.x, new o00(h10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.pi0 pi0Var3 = ((i10) obj).a;
                if (!pi0Var3.b()) {
                    pi0Var3.setProgress(0.0f);
                    pi0Var3.d();
                    break;
                }
                break;
            case 28:
                final l10 l10Var = (l10) obj;
                h10 h10Var2 = (h10) view.getParent();
                final MessagesController.DialogFilter currentFilter = h10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = l10Var.e;
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(filtersSetupActivity, h10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.k10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = l10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new zf.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new yr(10, l10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.n00.S(filtersSetupActivity3, dialogFilter2.id, new w3(l10Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.k10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = l10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new zf.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new yr(10, l10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.n00.S(filtersSetupActivity3, dialogFilter2.id, new w3(l10Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(h10Var2, false));
                H.Z();
                break;
            default:
                ((y40) obj).dismiss();
                break;
        }
    }
}
