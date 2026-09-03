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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 3;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((ah.a) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.y0 webView = ((r3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                u4 u4Var = (u4) obj;
                if (view != u4Var.e) {
                    int i15 = ((t4) view).e;
                    if (u4Var.U() == 0 && i15 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i15 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(15));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new mg.w(i11, u4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        u4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.z4.k(u4Var.getParentActivity(), null, new h(u4Var, 4));
                    break;
                }
            case 4:
                ((g5) obj).b(false);
                break;
            case 5:
                ((d7) obj).m0();
                break;
            case 6:
                u6 u6Var = (u6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u6Var.getContext());
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.j6 j6Var = u6Var.c;
                if (TextUtils.isEmpty(j6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) j6Var.g) + ")";
                }
                sb.append(str);
                String sb2 = sb.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.O = sb2;
                d2Var2.Q = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(u6Var.b.g, new c1(u6Var, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                u6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i16 = org.telegram.ui.ActionBar.j6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i16, false))));
                    break;
                }
                break;
            case 7:
                d7 d7Var = ((b7) obj).e;
                d7Var.J = !d7Var.J;
                d7Var.w0(true);
                d7Var.v0();
                break;
            case 8:
                o7 o7Var = (o7) obj;
                switch (o7Var.f) {
                    case 0:
                        ((p7) o7Var.h).r.v.r(null, (mh.a) o7Var.getTag(), true);
                        break;
                    default:
                        ((u7) o7Var.h).n.v.r(null, (mh.a) o7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ah.a) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.jj0 jj0Var = ((k9) obj).d;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
                    break;
                }
                break;
            case 11:
                x9 x9Var = (x9) obj;
                CameraView cameraView = x9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) x9Var.r.getBackground();
                    AnimatorSet animatorSet = x9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        x9Var.s = null;
                    }
                    x9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.n6.e, x9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new r9(x9Var, i14));
                    x9Var.s.playTogether(ofInt);
                    x9Var.s.setDuration(200L);
                    x9Var.s.setInterpolator(org.telegram.ui.Components.mr.f);
                    x9Var.s.addListener(new u5(x9Var, 2));
                    x9Var.s.start();
                    if (x9Var.r.getTag() != null) {
                        x9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        x9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((dd) obj).w0();
                break;
            case 13:
                zn znVar = ((lj) obj).b;
                znVar.e0.n();
                nh.t2 t2Var = znVar.G1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                znVar.X9();
                break;
            case 14:
                zn znVar2 = ((ln) obj).a;
                e5Var = ((org.telegram.ui.ActionBar.p2) znVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
                    break;
                }
                break;
            case 15:
                ((kq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                break;
            case 19:
                final iv ivVar = (iv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ivVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.fv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i13) {
                            case 0:
                                ivVar.dismiss();
                                break;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n7.qa qaVar = ivVar2.W;
                                ((d7) qaVar.c).l0(ivVar2.V, ivVar2.Y, ivVar2.d0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.fv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i14) {
                            case 0:
                                ivVar.dismiss();
                                break;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n7.qa qaVar = ivVar2.W;
                                ((d7) qaVar.c).l0(ivVar2.V, ivVar2.Y, ivVar2.d0);
                                break;
                        }
                    }
                });
                d2Var3.show();
                d2Var3.h();
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
                ((p00) obj).Q();
                break;
            case 23:
                ((o00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.jj0 jj0Var2 = ((s00) obj).a;
                if (!jj0Var2.b()) {
                    jj0Var2.setProgress(0.0f);
                    jj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((v00) obj).c();
                break;
            case 26:
                x10 x10Var = (x10) obj;
                org.telegram.ui.Components.j90 j90Var = x10Var.s;
                if ((!x10Var.r || j90Var.b()) && x10Var.x != null) {
                    x10Var.r = true;
                    j90Var.b = -1L;
                    j90Var.c = -1L;
                    x10Var.n.invalidate();
                    p00.S(x10Var.B, x10Var.x, new d10(x10Var, i12));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.jj0 jj0Var3 = ((y10) obj).a;
                if (!jj0Var3.b()) {
                    jj0Var3.setProgress(0.0f);
                    jj0Var3.d();
                    break;
                }
                break;
            case 28:
                final b20 b20Var = (b20) obj;
                x10 x10Var2 = (x10) view.getParent();
                final MessagesController.DialogFilter currentFilter = x10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(filtersSetupActivity, x10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.a20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
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
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ss(9, b20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new y3(b20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.a20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i14) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = b20Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ss(9, b20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new y3(b20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(x10Var2, false));
                H.Z();
                break;
            default:
                ((o50) obj).dismiss();
                break;
        }
    }
}
