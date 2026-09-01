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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int i10 = this.a;
        int i11 = 8;
        int i12 = 3;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((bh.a) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.x0 webView = ((p3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                s4 s4Var = (s4) obj;
                if (view != s4Var.e) {
                    int i15 = ((r4) view).e;
                    if (s4Var.U() == 0 && i15 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s4Var.getParentActivity());
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i15 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh.c3(15));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ng.w(i11, s4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        s4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.z4.k(s4Var.getParentActivity(), null, new h(s4Var, 4));
                    break;
                }
            case 4:
                ((e5) obj).b(false);
                break;
            case 5:
                ((b7) obj).m0();
                break;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                org.telegram.ui.Components.j6 j6Var = s6Var.c;
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
                alertDialog$Builder2.k(s6Var.b.g, new a1(s6Var, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i16 = org.telegram.ui.ActionBar.k6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    d.setBackground(org.telegram.ui.ActionBar.k6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, i16, false))));
                    break;
                }
                break;
            case 7:
                b7 b7Var = ((z6) obj).e;
                b7Var.J = !b7Var.J;
                b7Var.w0(true);
                b7Var.v0();
                break;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f) {
                    case 0:
                        ((n7) m7Var.h).r.v.Y(null, (nh.a) m7Var.getTag(), true);
                        break;
                    default:
                        ((s7) m7Var.h).n.v.Y(null, (nh.a) m7Var.getTag(), true);
                        break;
                }
            case 9:
                ((bh.a) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.lj0 lj0Var = ((i9) obj).d;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
                    break;
                }
                break;
            case 11:
                v9 v9Var = (v9) obj;
                CameraView cameraView = v9Var.c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) v9Var.r.getBackground();
                    AnimatorSet animatorSet = v9Var.s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        v9Var.s = null;
                    }
                    v9Var.s = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.n6.e, v9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new p9(v9Var, i14));
                    v9Var.s.playTogether(ofInt);
                    v9Var.s.setDuration(200L);
                    v9Var.s.setInterpolator(org.telegram.ui.Components.pr.f);
                    v9Var.s.addListener(new s5(v9Var, 2));
                    v9Var.s.start();
                    if (v9Var.r.getTag() != null) {
                        v9Var.r.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        v9Var.r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 12:
                ((bd) obj).w0();
                break;
            case 13:
                xn xnVar = ((jj) obj).b;
                xnVar.e0.n();
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null) {
                    u2Var.I1(null, 0);
                }
                xnVar.X9();
                break;
            case 14:
                xn xnVar2 = ((jn) obj).a;
                f5Var = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                if (f5Var != null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                    ((ActionBarLayout) f5Var2).r();
                    break;
                }
                break;
            case 15:
                ((jq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.c3) obj).a.dismissRunnable.run();
                break;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                break;
            case 19:
                final hv hvVar = (hv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.ev
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i13) {
                            case 0:
                                hvVar.dismiss();
                                break;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n7.qa qaVar = hvVar2.W;
                                ((b7) qaVar.c).l0(hvVar2.V, hvVar2.Y, hvVar2.d0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.ev
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i14) {
                            case 0:
                                hvVar.dismiss();
                                break;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n7.qa qaVar = hvVar2.W;
                                ((b7) qaVar.c).l0(hvVar2.V, hvVar2.Y, hvVar2.d0);
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
                ((o00) obj).Q();
                break;
            case 23:
                ((n00) obj).a.dismiss();
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
                w10 w10Var = (w10) obj;
                org.telegram.ui.Components.k90 k90Var = w10Var.s;
                if ((!w10Var.r || k90Var.b()) && w10Var.x != null) {
                    w10Var.r = true;
                    k90Var.b = -1L;
                    k90Var.c = -1L;
                    w10Var.n.invalidate();
                    o00.S(w10Var.B, w10Var.x, new c10(w10Var, i12));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.lj0 lj0Var3 = ((x10) obj).a;
                if (!lj0Var3.b()) {
                    lj0Var3.setProgress(0.0f);
                    lj0Var3.d();
                    break;
                }
                break;
            case 28:
                final a20 a20Var = (a20) obj;
                w10 w10Var2 = (w10) view.getParent();
                final MessagesController.DialogFilter currentFilter = w10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = a20Var.e;
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(filtersSetupActivity, w10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.z10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i13) {
                            case 0:
                                a20 a20Var2 = a20Var;
                                FiltersSetupActivity filtersSetupActivity2 = a20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = a20Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new fg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                a20 a20Var3 = a20Var;
                                FiltersSetupActivity filtersSetupActivity3 = a20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rs(9, a20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new w3(a20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.z10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i14) {
                            case 0:
                                a20 a20Var2 = a20Var;
                                FiltersSetupActivity filtersSetupActivity2 = a20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = a20Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new fg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                a20 a20Var3 = a20Var;
                                FiltersSetupActivity filtersSetupActivity3 = a20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rs(9, a20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.id, new w3(a20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.V0(w10Var2, false));
                H.Z();
                break;
            default:
                ((n50) obj).dismiss();
                break;
        }
    }
}
