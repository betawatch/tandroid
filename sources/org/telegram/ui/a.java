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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                ((ah.p) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.z0 webView = ((m3) obj).f.getWebView();
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
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i14 * 60));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.t0(11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4(i12, q4Var, view));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        q4Var.W(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.e5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
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
                org.telegram.ui.Components.p6 p6Var2 = p6Var.c;
                if (TextUtils.isEmpty(p6Var2.g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) p6Var2.g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.b.g, new z0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i15 = org.telegram.ui.ActionBar.j6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i15, false))));
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
                        ((l7) k7Var.h).r.v.k1(null, (ai.b) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.v.k1(null, (ai.b) k7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ah.p) obj).run();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.t6.e, u9Var.r.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new o9(u9Var, i13));
                    u9Var.s.playTogether(ofInt);
                    u9Var.s.setDuration(200L);
                    u9Var.s.setInterpolator(org.telegram.ui.Components.pr.f);
                    u9Var.s.addListener(new s0(u9Var, 6));
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
                ((bd) obj).w0();
                break;
            case 13:
                co coVar = ((nj) obj).b;
                coVar.h0.n();
                bi.t3 t3Var = coVar.J1;
                if (t3Var != null) {
                    t3Var.I1(null, 0);
                }
                coVar.X9();
                break;
            case 14:
                co coVar2 = ((on) obj).a;
                d5Var = ((org.telegram.ui.ActionBar.n2) coVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    break;
                }
                break;
            case 15:
                ((pq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                org.telegram.messenger.vl.m(3, (org.telegram.ui.ActionBar.n2) obj);
                break;
            case 19:
                final kv kvVar = (kv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.hv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i12) {
                            case 0:
                                kvVar.dismiss();
                                break;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                o0.a aVar = kvVar2.Z;
                                ((z6) aVar.c).l0(kvVar2.Y, kvVar2.b0, kvVar2.g0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.hv
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i16) {
                        switch (i13) {
                            case 0:
                                kvVar.dismiss();
                                break;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                o0.a aVar = kvVar2.Z;
                                ((z6) aVar.c).l0(kvVar2.Y, kvVar2.b0, kvVar2.g0);
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
                a20 a20Var = (a20) obj;
                org.telegram.ui.Components.h90 h90Var = a20Var.s;
                if ((!a20Var.r || h90Var.b()) && a20Var.x != null) {
                    a20Var.r = true;
                    h90Var.b = -1L;
                    h90Var.c = -1L;
                    a20Var.n.invalidate();
                    r00.S(a20Var.E, a20Var.x, new g10(a20Var, i11));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((b20) obj).a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    break;
                }
                break;
            case 28:
                final e20 e20Var = (e20) obj;
                a20 a20Var2 = (a20) view.getParent();
                final MessagesController.DialogFilter currentFilter = a20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, a20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.d20
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
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i16, context, filtersSetupActivity2, null));
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
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new t3(e20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.d20
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
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i16, context, filtersSetupActivity2, null));
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
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(b2Var4);
                                    TextView textView = (TextView) b2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new t3(e20Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(a20Var2, false));
                H.Z();
                break;
            default:
                ((s50) obj).dismiss();
                break;
        }
    }
}
