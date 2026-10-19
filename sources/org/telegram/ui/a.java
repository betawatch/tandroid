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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        CameraSessionWrapper cameraSession;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 4;
        final int i13 = 0;
        final int i14 = 1;
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
                    int i15 = ((u4) view).e;
                    if (v4Var.U() == 0 && i15 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i15 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(17));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, v4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        v4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.f5.j(v4Var.getParentActivity(), null, new g(v4Var, i12));
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
                alertDialog$Builder2.k(s6Var.b.i, new b1(s6Var, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i16 = org.telegram.ui.ActionBar.h6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i16, false))));
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
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.s.getBackground();
                    AnimatorSet animatorSet = w9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.v = null;
                    }
                    w9Var.v = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.t6.e, w9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new q9(w9Var, i14));
                    w9Var.v.playTogether(ofInt);
                    w9Var.v.setDuration(200L);
                    w9Var.v.setInterpolator(org.telegram.ui.Components.bs.f);
                    w9Var.v.addListener(new m.a(w9Var, i11));
                    w9Var.v.start();
                    if (w9Var.s.getTag() != null) {
                        w9Var.s.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        w9Var.s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((bd) obj).w0();
                break;
            case 13:
                qn qnVar = ((fj) obj).b;
                qnVar.h0.n();
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null) {
                    b3Var.L1(null, 0);
                }
                qnVar.ca();
                break;
            case 14:
                qn qnVar2 = ((cn) obj).a;
                d5Var = ((org.telegram.ui.ActionBar.n2) qnVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    break;
                }
                break;
            case 15:
                ((aq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.v8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.kk.n(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final vu vuVar = (vu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.su
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i17) {
                        switch (i13) {
                            case 0:
                                vuVar.dismiss();
                                break;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                n2.e eVar = vuVar2.Z;
                                ((c7) eVar.c).l0(vuVar2.Y, vuVar2.b0, vuVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.su
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i17) {
                        switch (i14) {
                            case 0:
                                vuVar.dismiss();
                                break;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                n2.e eVar = vuVar2.Z;
                                ((c7) eVar.c).l0(vuVar2.Y, vuVar2.b0, vuVar2.g0);
                                break;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.i();
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
                ((a00) obj).R();
                break;
            case 23:
                ((zz) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.xj0 xj0Var2 = ((d00) obj).a;
                if (!xj0Var2.b()) {
                    xj0Var2.setProgress(0.0f);
                    xj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((g00) obj).c();
                break;
            case 26:
                h10 h10Var = (h10) obj;
                org.telegram.ui.Components.ba0 ba0Var = h10Var.s;
                if ((!h10Var.r || ba0Var.c()) && h10Var.x != null) {
                    h10Var.r = true;
                    ba0Var.b = -1L;
                    ba0Var.c = -1L;
                    h10Var.n.invalidate();
                    a00.T(h10Var.E, h10Var.x, new dz(h10Var, i12));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.xj0 xj0Var3 = ((i10) obj).a;
                if (!xj0Var3.b()) {
                    xj0Var3.setProgress(0.0f);
                    xj0Var3.d();
                    break;
                }
                break;
            case 28:
                final l10 l10Var = (l10) obj;
                h10 h10Var2 = (h10) view.getParent();
                final MessagesController.DialogFilter currentFilter = h10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = l10Var.e;
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(filtersSetupActivity, h10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.k10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
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
                                    i17 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xu(6, l10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new v3(l10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.k10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i14) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = l10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xu(6, l10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new v3(l10Var3, 6));
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
                ((a50) obj).dismiss();
                break;
        }
    }
}
