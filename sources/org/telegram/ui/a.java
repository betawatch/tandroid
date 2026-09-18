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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
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
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(14));
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
                ((a7) obj).m0();
                break;
            case 6:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.m6 m6Var = q6Var.c;
                if (TextUtils.isEmpty(m6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = sb3;
                c2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(q6Var.b.g, new y0(q6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                q6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.j6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                a7 a7Var = ((y6) obj).e;
                a7Var.L = !a7Var.L;
                a7Var.y0(true);
                a7Var.w0();
                break;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f) {
                    case 0:
                        ((n7) m7Var.h).r.E.H0(null, (zh.a) m7Var.getTag(), true);
                        break;
                    default:
                        ((s7) m7Var.h).n.E.H0(null, (zh.a) m7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ai.s1) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.bj0 bj0Var = ((j9) obj).d;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.q6.e, w9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new q9(w9Var, i13));
                    w9Var.s.playTogether(ofInt);
                    w9Var.s.setDuration(200L);
                    w9Var.s.setInterpolator(org.telegram.ui.Components.qr.f);
                    w9Var.s.addListener(new t4(w9Var, i11));
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
                bo boVar = ((oj) obj).b;
                boVar.h0.n();
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                boVar.X9();
                break;
            case 14:
                bo boVar2 = ((nn) obj).a;
                e5Var = ((org.telegram.ui.ActionBar.o2) boVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.o2) boVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
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
                runnable = ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.wl.m(3, (org.telegram.ui.ActionBar.o2) obj);
                break;
            case 19:
                final lv lvVar = (lv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(lvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.iv
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                lvVar.dismiss();
                                break;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                o0.a aVar = lvVar2.Z;
                                ((a7) aVar.c).l0(lvVar2.Y, lvVar2.b0, lvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.iv
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                lvVar.dismiss();
                                break;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                o0.a aVar = lvVar2.Z;
                                ((a7) aVar.c).l0(lvVar2.Y, lvVar2.b0, lvVar2.g0);
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
                ((t00) obj).Q();
                break;
            case 23:
                ((s00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.bj0 bj0Var2 = ((x00) obj).a;
                if (!bj0Var2.b()) {
                    bj0Var2.setProgress(0.0f);
                    bj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((a10) obj).c();
                break;
            case 26:
                b20 b20Var = (b20) obj;
                org.telegram.ui.Components.g90 g90Var = b20Var.s;
                if ((!b20Var.r || g90Var.b()) && b20Var.x != null) {
                    b20Var.r = true;
                    g90Var.b = -1L;
                    g90Var.c = -1L;
                    b20Var.n.invalidate();
                    t00.S(b20Var.E, b20Var.x, new i10(b20Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.bj0 bj0Var3 = ((c20) obj).a;
                if (!bj0Var3.b()) {
                    bj0Var3.setProgress(0.0f);
                    bj0Var3.d();
                    break;
                }
                break;
            case 28:
                final g20 g20Var = (g20) obj;
                b20 b20Var2 = (b20) view.getParent();
                final MessagesController.DialogFilter currentFilter = b20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = g20Var.e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, b20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.e20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                g20 g20Var2 = g20Var;
                                FiltersSetupActivity filtersSetupActivity2 = g20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = g20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                g20 g20Var3 = g20Var;
                                FiltersSetupActivity filtersSetupActivity3 = g20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new f20(0, g20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new s3(g20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.e20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i13) {
                            case 0:
                                g20 g20Var2 = g20Var;
                                FiltersSetupActivity filtersSetupActivity2 = g20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = g20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                g20 g20Var3 = g20Var;
                                FiltersSetupActivity filtersSetupActivity3 = g20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new f20(0, g20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(c2Var4);
                                    TextView textView = (TextView) c2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new s3(g20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.W0(b20Var2, false));
                H.Z();
                break;
            default:
                ((t50) obj).dismiss();
                break;
        }
    }
}
