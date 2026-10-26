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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 3;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((ai.h0) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.k3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.x0 webView = ((m3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                t4 t4Var = (t4) obj;
                if (view != t4Var.e) {
                    int i14 = ((s4) view).e;
                    if (t4Var.V() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.x0(23));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.s0(8, t4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        t4Var.X(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.g5.k(t4Var.getParentActivity(), null, new f(t4Var, 4));
                    break;
                }
            case 4:
                ((f5) obj).b(false);
                break;
            case 5:
                t6 t6Var = (t6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.r6 r6Var = t6Var.c;
                if (TextUtils.isEmpty(r6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) r6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                e2Var2.R = sb3;
                e2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(t6Var.b.i, new y0(t6Var, 9));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                t6Var.d.showDialog(e2Var2);
                View d = e2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.y6.p7;
                    org.telegram.ui.ActionBar.f7.V((TextView) d, i15, null);
                    d.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, i15, false))));
                    break;
                }
                break;
            case 6:
                c7 c7Var = ((a7) obj).e;
                c7Var.L = !c7Var.L;
                c7Var.w0(true);
                c7Var.u0();
                break;
            case 7:
                o7 o7Var = (o7) obj;
                switch (o7Var.f) {
                    case 0:
                        ((p7) o7Var.h).r.F.q(null, (ci.a) o7Var.getTag(), true);
                        break;
                    default:
                        ((u7) o7Var.h).n.F.q(null, (ci.a) o7Var.getTag(), true);
                        break;
                }
            case 8:
                ((g4) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.ak0 ak0Var = ((l9) obj).d;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                    break;
                }
                break;
            case 10:
                y9 y9Var = (y9) obj;
                CameraView cameraView = y9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.s.getBackground();
                    AnimatorSet animatorSet = y9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        y9Var.v = null;
                    }
                    y9Var.v = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.v6.e, y9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new s9(y9Var, i13));
                    y9Var.v.playTogether(ofInt);
                    y9Var.v.setDuration(200L);
                    y9Var.v.setInterpolator(org.telegram.ui.Components.ds.f);
                    y9Var.v.addListener(new kg.e(y9Var, 10));
                    y9Var.v.start();
                    if (y9Var.s.getTag() != null) {
                        y9Var.s.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        y9Var.s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 11:
                ((bd) obj).z0();
                break;
            case 12:
                un unVar = ((gj) obj).b;
                unVar.h0.o();
                di.a3 a3Var = unVar.V1;
                if (a3Var != null) {
                    a3Var.O1(null, 0);
                }
                unVar.ha();
                break;
            case 13:
                un unVar2 = ((fn) obj).a;
                j5Var = ((org.telegram.ui.ActionBar.r2) unVar2).parentLayout;
                if (j5Var != null) {
                    j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar2).parentLayout;
                    ((ActionBarLayout) j5Var2).r();
                    break;
                }
                break;
            case 14:
                ((fq) obj).e.s0(true);
                break;
            case 15:
                ContactsActivity.X((ContactsActivity) obj);
                break;
            case 16:
                ((org.telegram.ui.Cells.a9[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.e3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.vh.l(3, (org.telegram.ui.ActionBar.r2) obj);
                break;
            case 19:
                final vu vuVar = (vu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
                e2Var3.R = string2;
                e2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.su
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                vuVar.dismiss();
                                break;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                m4.c cVar = vuVar2.Z;
                                ((c7) cVar.c).k0(vuVar2.Y, vuVar2.b0, vuVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.su
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                vuVar.dismiss();
                                break;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                m4.c cVar = vuVar2.Z;
                                ((c7) cVar.c).k0(vuVar2.Y, vuVar2.b0, vuVar2.g0);
                                break;
                        }
                    }
                });
                e2Var3.show();
                e2Var3.i();
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
                ((b00) obj).Q();
                break;
            case 23:
                ((a00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.ak0 ak0Var2 = ((e00) obj).a;
                if (!ak0Var2.b()) {
                    ak0Var2.setProgress(0.0f);
                    ak0Var2.d();
                    break;
                }
                break;
            case 25:
                ((h00) obj).c();
                break;
            case 26:
                l10 l10Var = (l10) obj;
                org.telegram.ui.Components.da0 da0Var = l10Var.s;
                if ((!l10Var.r || da0Var.c()) && l10Var.x != null) {
                    l10Var.r = true;
                    da0Var.b = -1L;
                    da0Var.c = -1L;
                    l10Var.n.invalidate();
                    b00.S(l10Var.H, l10Var.x, new p00(l10Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.ak0 ak0Var3 = ((m10) obj).a;
                if (!ak0Var3.b()) {
                    ak0Var3.setProgress(0.0f);
                    ak0Var3.d();
                    break;
                }
                break;
            case 28:
                final p10 p10Var = (p10) obj;
                l10 l10Var2 = (l10) view.getParent();
                final MessagesController.DialogFilter currentFilter = l10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(filtersSetupActivity, l10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.o10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new o00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = p10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, p10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(e2Var4);
                                    TextView textView = (TextView) e2Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.id, new t3(p10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.o10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new o00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = p10Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, p10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(e2Var4);
                                    TextView textView = (TextView) e2Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.id, new t3(p10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(l10Var2, false));
                H.Z();
                break;
            default:
                ((e50) obj).dismiss();
                break;
        }
    }
}
