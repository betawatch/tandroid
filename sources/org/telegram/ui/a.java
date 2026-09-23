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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 3;
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
                q4 q4Var = (q4) obj;
                if (view != q4Var.e) {
                    int i14 = ((p4) view).e;
                    if (q4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.p0(27));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new u(i13, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.e5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    break;
                }
            case 4:
                ((d5) obj).b(false);
                break;
            case 5:
                ((z6) obj).m0();
                break;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.o6 o6Var = p6Var.c;
                if (TextUtils.isEmpty(o6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.b.g, new z0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.h6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                z6 z6Var = ((x6) obj).e;
                z6Var.M = !z6Var.M;
                z6Var.w0(true);
                z6Var.v0();
                break;
            case 8:
                k7 k7Var = (k7) obj;
                switch (k7Var.f) {
                    case 0:
                        ((l7) k7Var.h).r.v.H0(null, (zh.a) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.v.H0(null, (zh.a) k7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ai.s1) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.bj0 bj0Var = ((h9) obj).d;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
                    break;
                }
                break;
            case 11:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.r.getBackground();
                    AnimatorSet animatorSet = u9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.s = null;
                    }
                    u9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.s6.e, u9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new o9(u9Var, i13));
                    u9Var.s.playTogether(ofInt);
                    u9Var.s.setDuration(200L);
                    u9Var.s.setInterpolator(org.telegram.ui.Components.rr.f);
                    u9Var.s.addListener(new u4(u9Var, i11));
                    u9Var.s.start();
                    if (u9Var.r.getTag() != null) {
                        u9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        u9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((ad) obj).w0();
                break;
            case 13:
                xn xnVar = ((kj) obj).b;
                xnVar.h0.n();
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                xnVar.X9();
                break;
            case 14:
                xn xnVar2 = ((jn) obj).a;
                c5Var = ((org.telegram.ui.ActionBar.n2) xnVar2).parentLayout;
                if (c5Var != null) {
                    c5Var2 = ((org.telegram.ui.ActionBar.n2) xnVar2).parentLayout;
                    ((ActionBarLayout) c5Var2).r();
                    break;
                }
                break;
            case 15:
                ((kq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.x8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.ul.n(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final gv gvVar = (gv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                gvVar.dismiss();
                                break;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                o0.a aVar = gvVar2.Z;
                                ((z6) aVar.c).l0(gvVar2.Y, gvVar2.b0, gvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                gvVar.dismiss();
                                break;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                o0.a aVar = gvVar2.Z;
                                ((z6) aVar.c).l0(gvVar2.Y, gvVar2.b0, gvVar2.g0);
                                break;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.h();
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
                ((o00) obj).Q();
                break;
            case 23:
                ((n00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.bj0 bj0Var2 = ((s00) obj).a;
                if (!bj0Var2.b()) {
                    bj0Var2.setProgress(0.0f);
                    bj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((v00) obj).c();
                break;
            case 26:
                x10 x10Var = (x10) obj;
                org.telegram.ui.Components.h90 h90Var = x10Var.s;
                if ((!x10Var.r || h90Var.b()) && x10Var.x != null) {
                    x10Var.r = true;
                    h90Var.b = -1L;
                    h90Var.c = -1L;
                    x10Var.n.invalidate();
                    o00.S(x10Var.E, x10Var.x, new d10(x10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.bj0 bj0Var3 = ((y10) obj).a;
                if (!bj0Var3.b()) {
                    bj0Var3.setProgress(0.0f);
                    bj0Var3.d();
                    break;
                }
                break;
            case 28:
                final b20 b20Var = (b20) obj;
                x10 x10Var2 = (x10) view.getParent();
                final MessagesController.DialogFilter currentFilter = x10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(filtersSetupActivity, x10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.a20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = b20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new w10(1, b20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new t3(b20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.a20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = b20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new w10(1, b20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new t3(b20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(x10Var2, false));
                H.Z();
                break;
            default:
                ((o50) obj).dismiss();
                break;
        }
    }
}
