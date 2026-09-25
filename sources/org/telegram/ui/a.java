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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((ai.s1) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
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
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.o0(29));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, p4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        p4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.e5.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    break;
                }
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((z6) obj).m0();
                break;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.o6 o6Var2 = o6Var.c;
                if (TextUtils.isEmpty(o6Var2.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var2.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.b.g, new z0(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
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
                org.telegram.ui.Components.lj0 lj0Var = ((h9) obj).d;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
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
                wn wnVar = ((kj) obj).b;
                wnVar.h0.n();
                ai.g4 g4Var = wnVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                wnVar.X9();
                break;
            case 14:
                wn wnVar2 = ((in) obj).a;
                b5Var = ((org.telegram.ui.ActionBar.m2) wnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    break;
                }
                break;
            case 15:
                ((jq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.ok.m(3, (org.telegram.ui.ActionBar.m2) obj);
                break;
            case 19:
                final fv fvVar = (fv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.cv
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                fvVar.dismiss();
                                break;
                            default:
                                fv fvVar2 = fvVar;
                                fvVar2.dismiss();
                                o0.a aVar = fvVar2.Z;
                                ((z6) aVar.c).l0(fvVar2.Y, fvVar2.b0, fvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.cv
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                fvVar.dismiss();
                                break;
                            default:
                                fv fvVar2 = fvVar;
                                fvVar2.dismiss();
                                o0.a aVar = fvVar2.Z;
                                ((z6) aVar.c).l0(fvVar2.Y, fvVar2.b0, fvVar2.g0);
                                break;
                        }
                    }
                });
                a2Var3.show();
                a2Var3.h();
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
                ((n00) obj).Q();
                break;
            case 23:
                ((m00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.lj0 lj0Var2 = ((r00) obj).a;
                if (!lj0Var2.b()) {
                    lj0Var2.setProgress(0.0f);
                    lj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((u00) obj).c();
                break;
            case 26:
                v10 v10Var = (v10) obj;
                org.telegram.ui.Components.r90 r90Var = v10Var.s;
                if ((!v10Var.r || r90Var.b()) && v10Var.x != null) {
                    v10Var.r = true;
                    r90Var.b = -1L;
                    r90Var.c = -1L;
                    v10Var.n.invalidate();
                    n00.S(v10Var.E, v10Var.x, new c10(v10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.lj0 lj0Var3 = ((w10) obj).a;
                if (!lj0Var3.b()) {
                    lj0Var3.setProgress(0.0f);
                    lj0Var3.d();
                    break;
                }
                break;
            case 28:
                final z10 z10Var = (z10) obj;
                v10 v10Var2 = (v10) view.getParent();
                final MessagesController.DialogFilter currentFilter = v10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(filtersSetupActivity, v10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.y10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = z10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ow(2, z10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(a2Var4);
                                    TextView textView = (TextView) a2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new t3(z10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.y10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = z10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ow(2, z10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(a2Var4);
                                    TextView textView = (TextView) a2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new t3(z10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(v10Var2, false));
                H.Z();
                break;
            default:
                ((m50) obj).dismiss();
                break;
        }
    }
}
