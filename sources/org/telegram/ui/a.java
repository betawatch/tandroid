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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                org.telegram.ui.web.z0 webView = ((m3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                q4 q4Var = (q4) obj;
                if (view != q4Var.e) {
                    int i14 = ((p4) view).e;
                    if (q4Var.S() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4(i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.U(view, true);
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
                ((a7) obj).j0();
                break;
            case 6:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.o6 o6Var = r6Var.c;
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
                alertDialog$Builder2.k(r6Var.b.g, new z0(r6Var, 9));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                r6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.i6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                a7 a7Var = ((y6) obj).e;
                a7Var.L = !a7Var.L;
                a7Var.v0(true);
                a7Var.t0();
                break;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f) {
                    case 0:
                        ((n7) m7Var.h).r.E.i(null, (zh.a) m7Var.getTag(), true);
                        break;
                    default:
                        ((s7) m7Var.h).n.E.i(null, (zh.a) m7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ai.s1) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.nj0 nj0Var = ((j9) obj).d;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
                    break;
                }
                break;
            case 11:
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.r.getBackground();
                    AnimatorSet animatorSet = w9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.s = null;
                    }
                    w9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.s6.e, w9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new q9(w9Var, i13));
                    w9Var.s.playTogether(ofInt);
                    w9Var.s.setDuration(200L);
                    w9Var.s.setInterpolator(org.telegram.ui.Components.tr.f);
                    w9Var.s.addListener(new u4(w9Var, i11));
                    w9Var.s.start();
                    if (w9Var.r.getTag() != null) {
                        w9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        w9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((cd) obj).w0();
                break;
            case 13:
                yn ynVar = ((lj) obj).b;
                ynVar.f0.n();
                ai.g4 g4Var = ynVar.H1;
                if (g4Var != null) {
                    g4Var.F1(null, 0);
                }
                ynVar.W9();
                break;
            case 14:
                yn ynVar2 = ((kn) obj).a;
                c5Var = ((org.telegram.ui.ActionBar.n2) ynVar2).parentLayout;
                if (c5Var != null) {
                    c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar2).parentLayout;
                    ((ActionBarLayout) c5Var2).r();
                    break;
                }
                break;
            case 15:
                ((lq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.ok.m(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final jv jvVar = (jv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.gv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                jvVar.dismiss();
                                break;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((a7) aVar.c).i0(jvVar2.Y, jvVar2.b0, jvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.gv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                jvVar.dismiss();
                                break;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((a7) aVar.c).i0(jvVar2.Y, jvVar2.b0, jvVar2.g0);
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
                ((r00) obj).O();
                break;
            case 23:
                ((q00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.nj0 nj0Var2 = ((v00) obj).a;
                if (!nj0Var2.b()) {
                    nj0Var2.setProgress(0.0f);
                    nj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((y00) obj).c();
                break;
            case 26:
                z10 z10Var = (z10) obj;
                org.telegram.ui.Components.u90 u90Var = z10Var.s;
                if ((!z10Var.r || u90Var.b()) && z10Var.x != null) {
                    z10Var.r = true;
                    u90Var.b = -1L;
                    u90Var.c = -1L;
                    z10Var.n.invalidate();
                    r00.Q(z10Var.E, z10Var.x, new g10(z10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.nj0 nj0Var3 = ((a20) obj).a;
                if (!nj0Var3.b()) {
                    nj0Var3.setProgress(0.0f);
                    nj0Var3.d();
                    break;
                }
                break;
            case 28:
                final d20 d20Var = (d20) obj;
                z10 z10Var2 = (z10) view.getParent();
                final MessagesController.DialogFilter currentFilter = z10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = d20Var.e;
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(filtersSetupActivity, z10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.c20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                d20 d20Var2 = d20Var;
                                FiltersSetupActivity filtersSetupActivity2 = d20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = d20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.k0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                d20 d20Var3 = d20Var;
                                FiltersSetupActivity filtersSetupActivity3 = d20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new pw(3, d20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.f10.R(filtersSetupActivity3, dialogFilter2.id, new t3(d20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.c20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                d20 d20Var2 = d20Var;
                                FiltersSetupActivity filtersSetupActivity2 = d20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = d20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.k0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                d20 d20Var3 = d20Var;
                                FiltersSetupActivity filtersSetupActivity3 = d20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new pw(3, d20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.f10.R(filtersSetupActivity3, dialogFilter2.id, new t3(d20Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.W0(z10Var2, false));
                H.Z();
                break;
            default:
                ((r50) obj).dismiss();
                break;
        }
    }
}
