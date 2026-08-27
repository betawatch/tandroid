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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 3;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((d5.i) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.w0 webView = ((q3) obj).f.getWebView();
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
                        b2Var.N = string;
                        b2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ng.a(21));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new jh.z1(9, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.y4.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    break;
                }
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((z6) obj).m0();
                break;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.i6 i6Var = p6Var.c;
                if (TextUtils.isEmpty(i6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) i6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.N = sb3;
                b2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.b.g, new c1(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.g6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                z6 z6Var = ((x6) obj).e;
                z6Var.I = !z6Var.I;
                z6Var.w0(true);
                z6Var.v0();
                break;
            case 8:
                k7 k7Var = (k7) obj;
                switch (k7Var.f) {
                    case 0:
                        ((l7) k7Var.h).r.v.J(null, (ih.a) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.v.J(null, (ih.a) k7Var.getTag(), true);
                        break;
                }
            case 9:
                ((d5.i) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.ri0 ri0Var = ((g9) obj).d;
                if (!ri0Var.b()) {
                    ri0Var.setProgress(0.0f);
                    ri0Var.d();
                    break;
                }
                break;
            case 11:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.r.getBackground();
                    AnimatorSet animatorSet = t9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.s = null;
                    }
                    t9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.m6.e, t9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new n9(t9Var, i13));
                    t9Var.s.playTogether(ofInt);
                    t9Var.s.setDuration(200L);
                    t9Var.s.setInterpolator(org.telegram.ui.Components.er.f);
                    t9Var.s.addListener(new lh.h9(t9Var, 11));
                    t9Var.s.start();
                    if (t9Var.r.getTag() != null) {
                        t9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        t9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((xc) obj).w0();
                break;
            case 13:
                rn rnVar = ((dj) obj).b;
                rnVar.d0.n();
                jh.t2 t2Var = rnVar.F1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                rnVar.X9();
                break;
            case 14:
                rn rnVar2 = ((dn) obj).a;
                b5Var = ((org.telegram.ui.ActionBar.n2) rnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.n2) rnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    break;
                }
                break;
            case 15:
                ((cq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.p8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.rl.k(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final av avVar = (av) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(avVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.N = string2;
                b2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.xu
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                avVar.dismiss();
                                break;
                            default:
                                av avVar2 = avVar;
                                avVar2.dismiss();
                                i6 i6Var2 = avVar2.V;
                                ((z6) i6Var2.c).l0(avVar2.U, avVar2.X, avVar2.c0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.xu
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                avVar.dismiss();
                                break;
                            default:
                                av avVar2 = avVar;
                                avVar2.dismiss();
                                i6 i6Var2 = avVar2.V;
                                ((z6) i6Var2.c).l0(avVar2.U, avVar2.X, avVar2.c0);
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
                ((d00) obj).Q();
                break;
            case 23:
                ((c00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.ri0 ri0Var2 = ((g00) obj).a;
                if (!ri0Var2.b()) {
                    ri0Var2.setProgress(0.0f);
                    ri0Var2.d();
                    break;
                }
                break;
            case 25:
                ((j00) obj).c();
                break;
            case 26:
                k10 k10Var = (k10) obj;
                org.telegram.ui.Components.t80 t80Var = k10Var.s;
                if ((!k10Var.r || t80Var.b()) && k10Var.x != null) {
                    k10Var.r = true;
                    t80Var.b = -1L;
                    t80Var.c = -1L;
                    k10Var.n.invalidate();
                    d00.S(k10Var.A, k10Var.x, new r00(k10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.ri0 ri0Var3 = ((l10) obj).a;
                if (!ri0Var3.b()) {
                    ri0Var3.setProgress(0.0f);
                    ri0Var3.d();
                    break;
                }
                break;
            case 28:
                final o10 o10Var = (o10) obj;
                k10 k10Var2 = (k10) view.getParent();
                final MessagesController.DialogFilter currentFilter = k10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = o10Var.e;
                org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(filtersSetupActivity, k10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.n10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                o10 o10Var2 = o10Var;
                                FiltersSetupActivity filtersSetupActivity2 = o10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = o10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ag.i1(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                o10 o10Var3 = o10Var;
                                FiltersSetupActivity filtersSetupActivity3 = o10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zr(10, o10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.q00.T(filtersSetupActivity3, dialogFilter2.id, new x3(o10Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.n10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                o10 o10Var2 = o10Var;
                                FiltersSetupActivity filtersSetupActivity2 = o10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = o10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ag.i1(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                o10 o10Var3 = o10Var;
                                FiltersSetupActivity filtersSetupActivity3 = o10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zr(10, o10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.q00.T(filtersSetupActivity3, dialogFilter2.id, new x3(o10Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(k10Var2, false));
                H.Z();
                break;
            default:
                ((b50) obj).dismiss();
                break;
        }
    }
}
