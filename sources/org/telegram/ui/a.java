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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 3;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((bi.g3) obj).run();
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
                q4 q4Var = (q4) obj;
                if (view != q4Var.e) {
                    int i14 = ((p4) view).e;
                    if (q4Var.U() == 0 && i14 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n2.l(12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bi.cb(25, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.d5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    break;
                }
            case 4:
                ((c5) obj).b(false);
                break;
            case 5:
                ((y6) obj).m0();
                break;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.n6 n6Var = p6Var.c;
                if (TextUtils.isEmpty(n6Var.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.R = sb3;
                d2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.b.g, new a1(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.j6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i15, false))));
                    break;
                }
                break;
            case 7:
                y6 y6Var = ((w6) obj).e;
                y6Var.M = !y6Var.M;
                y6Var.w0(true);
                y6Var.v0();
                break;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f) {
                    case 0:
                        ((k7) j7Var.h).r.v.a0(null, (yh.a) j7Var.getTag(), true);
                        break;
                    default:
                        ((p7) j7Var.h).n.v.a0(null, (yh.a) j7Var.getTag(), true);
                        break;
                }
            case 9:
                ((bi.g3) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.kj0 kj0Var = ((h9) obj).d;
                if (!kj0Var.b()) {
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.r6.e, u9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new o9(u9Var, i13));
                    u9Var.s.playTogether(ofInt);
                    u9Var.s.setDuration(200L);
                    u9Var.s.setInterpolator(org.telegram.ui.Components.wr.f);
                    u9Var.s.addListener(new bi.h(u9Var, 23));
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
                ((cd) obj).w0();
                break;
            case 13:
                eo eoVar = ((pj) obj).b;
                eoVar.h0.n();
                gg.m mVar = eoVar.J1;
                if (mVar != null) {
                    mVar.I1(null, 0);
                }
                eoVar.X9();
                break;
            case 14:
                eo eoVar2 = ((pn) obj).a;
                f5Var = ((org.telegram.ui.ActionBar.p2) eoVar2).parentLayout;
                if (f5Var != null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar2).parentLayout;
                    ((ActionBarLayout) f5Var2).r();
                    break;
                }
                break;
            case 15:
                ((qq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.x8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.c3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.em.m(3, (org.telegram.ui.ActionBar.p2) obj);
                break;
            case 19:
                final lv lvVar = (lv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(lvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.R = string2;
                d2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.iv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                lvVar.dismiss();
                                break;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n7.a1 a1Var = lvVar2.Z;
                                ((y6) a1Var.c).l0(lvVar2.Y, lvVar2.b0, lvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.iv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                lvVar.dismiss();
                                break;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n7.a1 a1Var = lvVar2.Z;
                                ((y6) a1Var.c).l0(lvVar2.Y, lvVar2.b0, lvVar2.g0);
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
                ((t00) obj).Q();
                break;
            case 23:
                ((s00) obj).a.dismiss();
                break;
            case 24:
                org.telegram.ui.Components.kj0 kj0Var2 = ((x00) obj).a;
                if (!kj0Var2.b()) {
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((a10) obj).c();
                break;
            case 26:
                b20 b20Var = (b20) obj;
                org.telegram.ui.Components.q90 q90Var = b20Var.s;
                if ((!b20Var.r || q90Var.b()) && b20Var.x != null) {
                    b20Var.r = true;
                    q90Var.b = -1L;
                    q90Var.c = -1L;
                    b20Var.n.invalidate();
                    t00.S(b20Var.E, b20Var.x, new i10(b20Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.kj0 kj0Var3 = ((c20) obj).a;
                if (!kj0Var3.b()) {
                    kj0Var3.setProgress(0.0f);
                    kj0Var3.d();
                    break;
                }
                break;
            case 28:
                final f20 f20Var = (f20) obj;
                b20 b20Var2 = (b20) view.getParent();
                final MessagesController.DialogFilter currentFilter = b20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = f20Var.e;
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(filtersSetupActivity, b20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.e20
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16;
                        switch (i12) {
                            case 0:
                                f20 f20Var2 = f20Var;
                                FiltersSetupActivity filtersSetupActivity2 = f20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = f20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new qg.k0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                f20 f20Var3 = f20Var;
                                FiltersSetupActivity filtersSetupActivity3 = f20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(26, f20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.T(filtersSetupActivity3, dialogFilter2.id, new u3(f20Var3, 5));
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
                                f20 f20Var2 = f20Var;
                                FiltersSetupActivity filtersSetupActivity2 = f20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = f20Var2.d;
                                    i16 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new qg.k0(3, i16, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                f20 f20Var3 = f20Var;
                                FiltersSetupActivity filtersSetupActivity3 = f20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(26, f20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.k10.T(filtersSetupActivity3, dialogFilter2.id, new u3(f20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(b20Var2, false));
                H.Z();
                break;
            default:
                ((s50) obj).dismiss();
                break;
        }
    }
}
