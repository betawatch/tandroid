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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.web.w0 webView = ((p3) obj).f.getWebView();
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
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(15));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new mg.w(i11, s4Var, view));
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
                    int i16 = org.telegram.ui.ActionBar.j6.p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i16, false))));
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
                        ((n7) m7Var.h).r.v.r(null, (mh.a) m7Var.getTag(), true);
                        break;
                    default:
                        ((s7) m7Var.h).n.v.r(null, (mh.a) m7Var.getTag(), true);
                        break;
                }
            case 9:
                ((ah.a) obj).run();
                break;
            case 10:
                org.telegram.ui.Components.jj0 jj0Var = ((i9) obj).d;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
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
                    v9Var.s.setInterpolator(org.telegram.ui.Components.nr.f);
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
                nh.t2 t2Var = xnVar.G1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                xnVar.X9();
                break;
            case 14:
                xn xnVar2 = ((jn) obj).a;
                e5Var = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
                    break;
                }
                break;
            case 15:
                ((iq) obj).e.r0(true);
                break;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!r11.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                break;
            case 19:
                final gv gvVar = (gv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.dv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i13) {
                            case 0:
                                gvVar.dismiss();
                                break;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                n7.qa qaVar = gvVar2.W;
                                ((b7) qaVar.c).l0(gvVar2.V, gvVar2.Y, gvVar2.d0);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.dv
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var4, int i17) {
                        switch (i14) {
                            case 0:
                                gvVar.dismiss();
                                break;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                n7.qa qaVar = gvVar2.W;
                                ((b7) qaVar.c).l0(gvVar2.V, gvVar2.Y, gvVar2.d0);
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
                org.telegram.ui.Components.jj0 jj0Var2 = ((r00) obj).a;
                if (!jj0Var2.b()) {
                    jj0Var2.setProgress(0.0f);
                    jj0Var2.d();
                    break;
                }
                break;
            case 25:
                ((u00) obj).c();
                break;
            case 26:
                v10 v10Var = (v10) obj;
                org.telegram.ui.Components.i90 i90Var = v10Var.s;
                if ((!v10Var.r || i90Var.b()) && v10Var.x != null) {
                    v10Var.r = true;
                    i90Var.b = -1L;
                    i90Var.c = -1L;
                    v10Var.n.invalidate();
                    o00.S(v10Var.B, v10Var.x, new c10(v10Var, i12));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.jj0 jj0Var3 = ((w10) obj).a;
                if (!jj0Var3.b()) {
                    jj0Var3.setProgress(0.0f);
                    jj0Var3.d();
                    break;
                }
                break;
            case 28:
                final z10 z10Var = (z10) obj;
                v10 v10Var2 = (v10) view.getParent();
                final MessagesController.DialogFilter currentFilter = v10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(filtersSetupActivity, v10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() { // from class: org.telegram.ui.y10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
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
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qs(9, z10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new w3(z10Var3, 5));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() { // from class: org.telegram.ui.y10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        switch (i14) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (!dialogFilter.locked) {
                                    filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                    break;
                                } else {
                                    Context context = z10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (!dialogFilter2.isChatlist()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qs(9, z10Var3, dialogFilter2));
                                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
                                    filtersSetupActivity3.showDialog(d2Var4);
                                    TextView textView = (TextView) d2Var4.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.id, new w3(z10Var3, 5));
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
