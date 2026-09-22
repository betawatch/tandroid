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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                org.telegram.ui.web.z0 webView = ((l3) obj).f.getWebView();
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
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(13));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ah.b(29, p4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        p4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.c5.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
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
                org.telegram.ui.Components.m6 m6Var = p6Var.c;
                if (TextUtils.isEmpty(m6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.b.g, new y0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.i6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i15, false))));
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
                org.telegram.ui.Components.aj0 aj0Var = ((h9) obj).d;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.q6.e, u9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new o9(u9Var, i13));
                    u9Var.s.playTogether(ofInt);
                    u9Var.s.setDuration(200L);
                    u9Var.s.setInterpolator(org.telegram.ui.Components.qr.f);
                    u9Var.s.addListener(new t4(u9Var, i11));
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
                bo boVar = ((nj) obj).b;
                boVar.h0.n();
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                boVar.X9();
                break;
            case 14:
                bo boVar2 = ((nn) obj).a;
                d5Var = ((org.telegram.ui.ActionBar.n2) boVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    break;
                }
                break;
            case 15:
                ((oq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.vl.n(3, (org.telegram.ui.ActionBar.n2) obj);
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
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                jvVar.dismiss();
                                break;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((z6) aVar.c).l0(jvVar2.Y, jvVar2.b0, jvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.gv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                jvVar.dismiss();
                                break;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((z6) aVar.c).l0(jvVar2.Y, jvVar2.b0, jvVar2.g0);
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
                ((r00) obj).Q();
                break;
            case 23:
                ((q00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.aj0 aj0Var2 = ((v00) obj).a;
                if (!aj0Var2.b()) {
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((y00) obj).c();
                break;
            case 26:
                z10 z10Var = (z10) obj;
                org.telegram.ui.Components.g90 g90Var = z10Var.s;
                if ((!z10Var.r || g90Var.b()) && z10Var.x != null) {
                    z10Var.r = true;
                    g90Var.b = -1L;
                    g90Var.c = -1L;
                    z10Var.n.invalidate();
                    r00.S(z10Var.E, z10Var.x, new g10(z10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((a20) obj).a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    break;
                }
                break;
            case 28:
                final e20 e20Var = (e20) obj;
                z10 z10Var2 = (z10) view.getParent();
                final MessagesController.DialogFilter currentFilter = z10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, z10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.c20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = e20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new d20(0, e20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new s3(e20Var3, 5));
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
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = e20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new d20(0, e20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new s3(e20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(z10Var2, false));
                H.Z();
                break;
            default:
                ((r50) obj).dismiss();
                break;
        }
    }
}
