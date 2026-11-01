package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 3;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((ag.o0) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.z2[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.v0 webView = ((l3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                p4 p4Var = (p4) obj;
                if (view != p4Var.e) {
                    int i15 = ((o4) view).e;
                    if (p4Var.Z() == 0 && i15 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131748602, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.dd.c0(i15 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.messenger.e9(28));
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751161, null), new ng.d(i12, p4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        p4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.s4.k(p4Var.getParentActivity(), null, new e(p4Var, i11));
                    break;
                }
            case 4:
                ((a5) obj).b(false);
                break;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.dd.L0(2131752098, null));
                org.telegram.ui.Components.e6 e6Var = q6Var.c;
                if (TextUtils.isEmpty(e6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) e6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = sb3;
                x1Var2.T = org.telegram.messenger.dd.L0(2131744832, null);
                alertDialog$Builder2.k(q6Var.b.i, new y0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                q6Var.d.showDialog(x1Var2);
                View d = x1Var2.d(-1);
                if (d instanceof TextView) {
                    int i16 = org.telegram.ui.ActionBar.t6.p7;
                    org.telegram.ui.ActionBar.a7.V((TextView) d, i16, null);
                    d.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, i16, false))));
                    break;
                }
                break;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f;
                y6Var.L = !y6Var.L;
                y6Var.A0(true);
                y6Var.y0();
                break;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f) {
                    case 0:
                        ((l7) k7Var.h).r.F.a(null, (sh.a) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.F.a(null, (sh.a) k7Var.getTag(), true);
                        break;
                }
            case 8:
                ((ag.o0) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.fi0 fi0Var = (org.telegram.ui.Components.fi0) ((jg.b1) obj).e;
                if (!fi0Var.b()) {
                    fi0Var.setProgress(0.0f);
                    fi0Var.d();
                    break;
                }
                break;
            case 10:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.s.getBackground();
                    AnimatorSet animatorSet = u9Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.w = null;
                    }
                    u9Var.w = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.i6.e, u9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new n9(u9Var, i14));
                    u9Var.w.playTogether(ofInt);
                    u9Var.w.setDuration(200L);
                    u9Var.w.setInterpolator(org.telegram.ui.Components.gr.f);
                    u9Var.w.addListener(new s9(u9Var, i13));
                    u9Var.w.start();
                    if (u9Var.s.getTag() != null) {
                        u9Var.s.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        u9Var.s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 11:
                ((zc) obj).D0();
                break;
            case 12:
                un unVar = ((nj) obj).b;
                unVar.i0.o();
                ag.v vVar = unVar.X1;
                if (vVar != null) {
                    vVar.v1(0, null);
                }
                unVar.sa();
                break;
            case 13:
                un unVar2 = ((fn) obj).a;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                if (z4Var != null) {
                    z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                    ((ActionBarLayout) z4Var2).r();
                    break;
                }
                break;
            case 14:
                ((hq) obj).e.w0(true);
                break;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                break;
            case 16:
                ((org.telegram.ui.Cells.t8[]) obj)[0].setChecked(!r12.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) obj).b).x0.run();
                break;
            case 18:
                org.telegram.messenger.a30.k(3, (org.telegram.ui.ActionBar.k2) obj);
                break;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String L02 = org.telegram.messenger.dd.L0(2131752098, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.dd.L0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.wu
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i17) {
                        switch (i13) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                m4.c cVar = yuVar2.R1;
                                ((y6) cVar.c).o0(yuVar2.Q1, yuVar2.T1, yuVar2.Y1);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.wu
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i17) {
                        switch (i14) {
                            case 0:
                                yuVar.dismiss();
                                break;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                m4.c cVar = yuVar2.R1;
                                ((y6) cVar.c).o0(yuVar2.Q1, yuVar2.T1, yuVar2.Y1);
                                break;
                        }
                    }
                });
                x1Var3.show();
                x1Var3.i();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 21:
                ((vz) obj).d1();
                break;
            case 22:
                ((vz) ((l0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.fi0 fi0Var2 = (org.telegram.ui.Components.fi0) ((l0) obj).b;
                if (!fi0Var2.b()) {
                    fi0Var2.setProgress(0.0f);
                    fi0Var2.d();
                    break;
                }
                break;
            case 24:
                ((b00) obj).c();
                break;
            case 25:
                a10 a10Var = (a10) obj;
                org.telegram.ui.Components.t80 t80Var = a10Var.s;
                if ((!a10Var.r || t80Var.c()) && a10Var.y != null) {
                    a10Var.r = true;
                    t80Var.b = -1L;
                    t80Var.c = -1L;
                    a10Var.n.invalidate();
                    vz.f1(a10Var.H, a10Var.y, new yy(a10Var, i11));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.fi0 fi0Var3 = ((b10) obj).a;
                if (!fi0Var3.b()) {
                    fi0Var3.setProgress(0.0f);
                    fi0Var3.d();
                    break;
                }
                break;
            case 27:
                final e10 e10Var = (e10) obj;
                a10 a10Var2 = (a10) view.getParent();
                final org.telegram.messenger.bp currentFilter = a10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e10Var.e;
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(filtersSetupActivity, a10Var2);
                H.c(R.drawable.msg_edit, org.telegram.messenger.dd.L0(2131750780, null), new Runnable() { // from class: org.telegram.ui.d10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        int i18 = i13;
                        org.telegram.messenger.bp bpVar = currentFilter;
                        e10 e10Var2 = e10Var;
                        switch (i18) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e10Var2.e;
                                if (!bpVar.p) {
                                    filtersSetupActivity2.presentFragment(new h00(bpVar, null));
                                    break;
                                } else {
                                    Context context = e10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e10Var2.e;
                                if (!bpVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
                                    x1Var4.R = L03;
                                    x1Var4.T = org.telegram.messenger.dd.L0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(5, e10Var2, bpVar));
                                    filtersSetupActivity3.showDialog(x1Var4);
                                    TextView textView = (TextView) x1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, bpVar.a, new s3(e10Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131750788, null), new Runnable() { // from class: org.telegram.ui.d10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        int i18 = i14;
                        org.telegram.messenger.bp bpVar = currentFilter;
                        e10 e10Var2 = e10Var;
                        switch (i18) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e10Var2.e;
                                if (!bpVar.p) {
                                    filtersSetupActivity2.presentFragment(new h00(bpVar, null));
                                    break;
                                } else {
                                    Context context = e10Var2.d;
                                    i17 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i17, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e10Var2.e;
                                if (!bpVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
                                    x1Var4.R = L03;
                                    x1Var4.T = org.telegram.messenger.dd.L0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(5, e10Var2, bpVar));
                                    filtersSetupActivity3.showDialog(x1Var4);
                                    TextView textView = (TextView) x1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, bpVar.a, new s3(e10Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.dd.X) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(a10Var2, false));
                H.Z();
                break;
            case 28:
                ((l40) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.ep epVar = (org.telegram.ui.Components.ep) obj;
                epVar.a(!epVar.a.q, true);
                org.telegram.messenger.wp.d1().edit().putBoolean("callmiconstart", epVar.a.q).apply();
                break;
        }
    }
}
