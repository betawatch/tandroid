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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
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
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.y0 webView = ((n3) obj).f.getWebView();
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
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i15 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(21));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, u4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        u4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.f5.k(u4Var.getParentActivity(), null, new f(u4Var, i12));
                    break;
                }
            case 4:
                ((g5) obj).b(false);
                break;
            case 5:
                ((c7) obj).n0();
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
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = sb3;
                c2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.b.i, new a1(s6Var, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i16 = org.telegram.ui.ActionBar.k6.p7;
                    org.telegram.ui.ActionBar.r6.W((TextView) d, i16, null);
                    d.setBackground(org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, i16, false))));
                    break;
                }
                break;
            case 7:
                c7 c7Var = ((a7) obj).e;
                c7Var.M = !c7Var.M;
                c7Var.x0(true);
                c7Var.w0();
                break;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f) {
                    case 0:
                        ((o7) n7Var.h).r.w.s0(null, (bi.b) n7Var.getTag(), true);
                        break;
                    default:
                        ((t7) n7Var.h).n.w.s0(null, (bi.b) n7Var.getTag(), true);
                        break;
                }
            case 9:
                ((h4) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.bk0 bk0Var = ((j9) obj).d;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
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
                ((bd) obj).y0();
                break;
            case 13:
                sn snVar = ((fj) obj).b;
                snVar.h0.n();
                ci.a3 a3Var = snVar.V1;
                if (a3Var != null) {
                    a3Var.P1(null, 0);
                }
                snVar.ca();
                break;
            case 14:
                sn snVar2 = ((dn) obj).a;
                h5Var = ((org.telegram.ui.ActionBar.o2) snVar2).parentLayout;
                if (h5Var != null) {
                    h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar2).parentLayout;
                    ((ActionBarLayout) h5Var2).r();
                    break;
                }
                break;
            case 15:
                ((cq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.sl.o(3, (org.telegram.ui.ActionBar.o2) obj);
                break;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.vu
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i17) {
                        switch (i13) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                mi.q qVar = yuVar2.Z;
                                ((c7) qVar.c).m0(yuVar2.Y, yuVar2.b0, yuVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.vu
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i17) {
                        switch (i14) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                mi.q qVar = yuVar2.Z;
                                ((c7) qVar.c).m0(yuVar2.Y, yuVar2.b0, yuVar2.g0);
                                break;
                        }
                    }
                });
                c2Var3.show();
                c2Var3.i();
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
                org.telegram.ui.Components.bk0 bk0Var2 = ((g00) obj).a;
                if (!bk0Var2.b()) {
                    bk0Var2.setProgress(0.0f);
                    bk0Var2.d();
                    break;
                }
                break;
            case 25:
                ((j00) obj).c();
                break;
            case 26:
                l10 l10Var = (l10) obj;
                org.telegram.ui.Components.ca0 ca0Var = l10Var.s;
                if ((!l10Var.r || ca0Var.c()) && l10Var.x != null) {
                    l10Var.r = true;
                    ca0Var.b = -1L;
                    ca0Var.c = -1L;
                    l10Var.n.invalidate();
                    d00.S(l10Var.H, l10Var.x, new fz(l10Var, i12));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.bk0 bk0Var3 = ((m10) obj).a;
                if (!bk0Var3.b()) {
                    bk0Var3.setProgress(0.0f);
                    bk0Var3.d();
                    break;
                }
                break;
            case 28:
                final p10 p10Var = (p10) obj;
                l10 l10Var2 = (l10) view.getParent();
                final MessagesController.DialogFilter currentFilter = l10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(filtersSetupActivity, l10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.o10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i13) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = p10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i17, context, filtersSetupActivity2, null));
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
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ks(8, p10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new u3(p10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.o10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i14) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = p10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i17, context, filtersSetupActivity2, null));
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
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ks(8, p10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.id, new u3(p10Var3, 6));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.W0(l10Var2, false));
                H.Z();
                break;
            default:
                ((d50) obj).dismiss();
                break;
        }
    }
}
