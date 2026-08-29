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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ((ag.v0) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
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
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(10));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new kg.w(9, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.c5.k(q4Var.getParentActivity(), null, new h(q4Var, 4));
                    break;
                }
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((x6) obj).m0();
                break;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.n6 n6Var = o6Var.c;
                if (TextUtils.isEmpty(n6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.N = sb3;
                c2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.b.g, new c1(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.g6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                x6 x6Var = ((v6) obj).e;
                x6Var.I = !x6Var.I;
                x6Var.w0(true);
                x6Var.v0();
                break;
            case 8:
                i7 i7Var = (i7) obj;
                switch (i7Var.f) {
                    case 0:
                        ((j7) i7Var.h).r.v.O0(null, (kh.a) i7Var.getTag(), true);
                        break;
                    default:
                        ((o7) i7Var.h).n.v.O0(null, (kh.a) i7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ag.v0) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.aj0 aj0Var = ((e9) obj).d;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    break;
                }
                break;
            case 11:
                r9 r9Var = (r9) obj;
                CameraView cameraView = r9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) r9Var.r.getBackground();
                    AnimatorSet animatorSet = r9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        r9Var.s = null;
                    }
                    r9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.r6.e, r9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new l9(r9Var, i13));
                    r9Var.s.playTogether(ofInt);
                    r9Var.s.setDuration(200L);
                    r9Var.s.setInterpolator(org.telegram.ui.Components.jr.f);
                    r9Var.s.addListener(new nh.q5(r9Var, 11));
                    r9Var.s.start();
                    if (r9Var.r.getTag() != null) {
                        r9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        r9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((vc) obj).w0();
                break;
            case 13:
                tn tnVar = ((ej) obj).b;
                tnVar.d0.n();
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null) {
                    s2Var.I1(null, 0);
                }
                tnVar.X9();
                break;
            case 14:
                tn tnVar2 = ((fn) obj).a;
                b5Var = ((org.telegram.ui.ActionBar.o2) tnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    break;
                }
                break;
            case 15:
                ((cq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                b.l(3, (org.telegram.ui.ActionBar.o2) obj);
                break;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.N = string2;
                c2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vu
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                oc.i iVar = yuVar2.V;
                                ((x6) iVar.c).l0(yuVar2.U, yuVar2.X, yuVar2.c0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vu
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                oc.i iVar = yuVar2.V;
                                ((x6) iVar.c).l0(yuVar2.U, yuVar2.X, yuVar2.c0);
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
                ((c00) obj).Q();
                break;
            case 23:
                ((b00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.aj0 aj0Var2 = ((f00) obj).a;
                if (!aj0Var2.b()) {
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((i00) obj).c();
                break;
            case 26:
                j10 j10Var = (j10) obj;
                org.telegram.ui.Components.c90 c90Var = j10Var.s;
                if ((!j10Var.r || c90Var.b()) && j10Var.x != null) {
                    j10Var.r = true;
                    c90Var.b = -1L;
                    c90Var.c = -1L;
                    j10Var.n.invalidate();
                    c00.S(j10Var.A, j10Var.x, new q00(j10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((k10) obj).a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    break;
                }
                break;
            case 28:
                final n10 n10Var = (n10) obj;
                j10 j10Var2 = (j10) view.getParent();
                final MessagesController.DialogFilter currentFilter = j10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(filtersSetupActivity, j10Var2);
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
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new cg.v0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xr(10, n10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.y00.T(filtersSetupActivity3, dialogFilter2.id, new x3(n10Var3, 5));
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
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new cg.v0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xr(10, n10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.y00.T(filtersSetupActivity3, dialogFilter2.id, new x3(n10Var3, 5));
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
            default:
                ((a50) obj).dismiss();
                break;
        }
    }
}
