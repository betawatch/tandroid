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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        CameraSessionWrapper cameraSession;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i7 = this.a;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((ai.e0) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.v2[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.u0 webView = ((k3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                p4 p4Var = (p4) obj;
                if (view != p4Var.e) {
                    int i13 = ((o4) view).e;
                    if (p4Var.Z() == 0 && i13 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131748586, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.hd.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.ch(14));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751161, null), new ni.c(i10, p4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        p4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.v4.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    break;
                }
            case 4:
                ((b5) obj).b(false);
                break;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.hd.M0(2131752098, null));
                org.telegram.ui.Components.i6 i6Var = q6Var.c;
                if (TextUtils.isEmpty(i6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) i6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = sb3;
                u1Var2.T = org.telegram.messenger.hd.M0(2131744815, null);
                alertDialog$Builder2.k(q6Var.b.i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                q6Var.d.showDialog(u1Var2);
                View d = u1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.k6.p7;
                    org.telegram.ui.ActionBar.r6.V((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, i14, false))));
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
                        ((l7) k7Var.h).r.F.o(null, (ci.b) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.F.o(null, (ci.b) k7Var.getTag(), true);
                        break;
                }
            case 8:
                ((q8) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.ch0 ch0Var = (org.telegram.ui.Components.ch0) ((bi.m5) obj).e;
                if (!ch0Var.b()) {
                    ch0Var.setProgress(0.0f);
                    ch0Var.d();
                    break;
                }
                break;
            case 10:
                s9 s9Var = (s9) obj;
                CameraView cameraView = s9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) s9Var.s.getBackground();
                    AnimatorSet animatorSet = s9Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        s9Var.w = null;
                    }
                    s9Var.w = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.m6.e, s9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new m9(s9Var, i12));
                    s9Var.w.playTogether(ofInt);
                    s9Var.w.setDuration(200L);
                    s9Var.w.setInterpolator(org.telegram.ui.Components.xq.f);
                    s9Var.w.addListener(new m.a(s9Var, 19));
                    s9Var.w.start();
                    if (s9Var.s.getTag() != null) {
                        s9Var.s.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        s9Var.s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 11:
                ((rc) obj).D0();
                break;
            case 12:
                an anVar = ((si) obj).b;
                anVar.i0.o();
                di.u2 u2Var = anVar.X1;
                if (u2Var != null) {
                    u2Var.w1(0, null);
                }
                anVar.xa();
                break;
            case 13:
                an anVar2 = ((lm) obj).a;
                q4Var = ((org.telegram.ui.ActionBar.f2) anVar2).parentLayout;
                if (q4Var != null) {
                    q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar2).parentLayout;
                    ((ActionBarLayout) q4Var2).r();
                    break;
                }
                break;
            case 14:
                ((jp) obj).e.w0(true);
                break;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                break;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r12.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).b).x0.run();
                break;
            case 18:
                org.telegram.messenger.camera.q.j(3, (org.telegram.ui.ActionBar.f2) obj);
                break;
            case 19:
                final wt wtVar = (wt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wtVar.getContext());
                String M02 = org.telegram.messenger.hd.M0(2131752098, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.hd.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ut
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i11) {
                            case 0:
                                wtVar.dismiss();
                                break;
                            default:
                                wt wtVar2 = wtVar;
                                wtVar2.dismiss();
                                m4.d0 d0Var = wtVar2.R1;
                                ((y6) d0Var.b).o0(wtVar2.Q1, wtVar2.T1, wtVar2.Y1);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ut
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i12) {
                            case 0:
                                wtVar.dismiss();
                                break;
                            default:
                                wt wtVar2 = wtVar;
                                wtVar2.dismiss();
                                m4.d0 d0Var = wtVar2.R1;
                                ((y6) d0Var.b).o0(wtVar2.Q1, wtVar2.T1, wtVar2.Y1);
                                break;
                        }
                    }
                });
                u1Var3.show();
                u1Var3.i();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 21:
                ((vy) obj).d1();
                break;
            case 22:
                ((vy) ((k0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.ch0 ch0Var2 = (org.telegram.ui.Components.ch0) ((k0) obj).b;
                if (!ch0Var2.b()) {
                    ch0Var2.setProgress(0.0f);
                    ch0Var2.d();
                    break;
                }
                break;
            case 24:
                ((az) obj).c();
                break;
            case 25:
                a00 a00Var = (a00) obj;
                org.telegram.ui.Components.a80 a80Var = a00Var.s;
                if ((!a00Var.r || a80Var.c()) && a00Var.y != null) {
                    a00Var.r = true;
                    a80Var.b = -1L;
                    a80Var.c = -1L;
                    a00Var.n.invalidate();
                    vy.f1(a00Var.H, a00Var.y, new hz(a00Var, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.ch0 ch0Var3 = ((b00) obj).a;
                if (!ch0Var3.b()) {
                    ch0Var3.setProgress(0.0f);
                    ch0Var3.d();
                    break;
                }
                break;
            case 27:
                final e00 e00Var = (e00) obj;
                a00 a00Var2 = (a00) view.getParent();
                final org.telegram.messenger.vo currentFilter = a00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e00Var.e;
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(filtersSetupActivity, a00Var2);
                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131750780, null), new Runnable() { // from class: org.telegram.ui.d00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.vo voVar = currentFilter;
                        e00 e00Var2 = e00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e00Var2.e;
                                if (!voVar.p) {
                                    filtersSetupActivity2.presentFragment(new gz(voVar, null));
                                    break;
                                } else {
                                    Context context = e00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e00Var2.e;
                                if (!voVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131750791, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.R = M03;
                                    u1Var4.T = org.telegram.messenger.hd.M0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new pu(4, e00Var2, voVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.vz.g1(filtersSetupActivity3, voVar.a, new r3(e00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131750788, null), new Runnable() { // from class: org.telegram.ui.d00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.vo voVar = currentFilter;
                        e00 e00Var2 = e00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e00Var2.e;
                                if (!voVar.p) {
                                    filtersSetupActivity2.presentFragment(new gz(voVar, null));
                                    break;
                                } else {
                                    Context context = e00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e00Var2.e;
                                if (!voVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131750791, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.R = M03;
                                    u1Var4.T = org.telegram.messenger.hd.M0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new pu(4, e00Var2, voVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.vz.g1(filtersSetupActivity3, voVar.a, new r3(e00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.hd.a0) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(a00Var2, false));
                H.Z();
                break;
            case 28:
                ((n30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj;
                woVar.a(!woVar.a.q, true);
                org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.a.q).apply();
                break;
        }
    }
}
