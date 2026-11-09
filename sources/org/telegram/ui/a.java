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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                        String M0 = org.telegram.messenger.id.M0(2131748587, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.id.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(14));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751160, null), new ni.c(i10, p4Var, view));
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
                sb2.append(org.telegram.messenger.id.M0(2131752098, null));
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
                u1Var2.T = org.telegram.messenger.id.M0(2131744814, null);
                alertDialog$Builder2.k(q6Var.b.i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                q6Var.d.showDialog(u1Var2);
                View d = u1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.l6.p7;
                    org.telegram.ui.ActionBar.s6.U((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.l6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.x0(null, i14, false))));
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
                org.telegram.ui.Components.dh0 dh0Var = (org.telegram.ui.Components.dh0) ((bi.m5) obj).e;
                if (!dh0Var.b()) {
                    dh0Var.setProgress(0.0f);
                    dh0Var.d();
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
                cn cnVar = ((ui) obj).b;
                cnVar.i0.o();
                di.u2 u2Var = cnVar.X1;
                if (u2Var != null) {
                    u2Var.w1(0, null);
                }
                cnVar.za();
                break;
            case 13:
                cn cnVar2 = ((nm) obj).a;
                q4Var = ((org.telegram.ui.ActionBar.f2) cnVar2).parentLayout;
                if (q4Var != null) {
                    q4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar2).parentLayout;
                    ((ActionBarLayout) q4Var2).r();
                    break;
                }
                break;
            case 14:
                ((lp) obj).e.w0(true);
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
                final yt ytVar = (yt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ytVar.getContext());
                String M02 = org.telegram.messenger.id.M0(2131752098, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.id.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.wt
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i11) {
                            case 0:
                                ytVar.dismiss();
                                break;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                m4.d0 d0Var = ytVar2.R1;
                                ((y6) d0Var.b).o0(ytVar2.Q1, ytVar2.T1, ytVar2.Y1);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.wt
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i12) {
                            case 0:
                                ytVar.dismiss();
                                break;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                m4.d0 d0Var = ytVar2.R1;
                                ((y6) d0Var.b).o0(ytVar2.Q1, ytVar2.T1, ytVar2.Y1);
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
                ((xy) obj).d1();
                break;
            case 22:
                ((xy) ((k0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.dh0 dh0Var2 = (org.telegram.ui.Components.dh0) ((k0) obj).b;
                if (!dh0Var2.b()) {
                    dh0Var2.setProgress(0.0f);
                    dh0Var2.d();
                    break;
                }
                break;
            case 24:
                ((cz) obj).c();
                break;
            case 25:
                c00 c00Var = (c00) obj;
                org.telegram.ui.Components.b80 b80Var = c00Var.s;
                if ((!c00Var.r || b80Var.c()) && c00Var.y != null) {
                    c00Var.r = true;
                    b80Var.b = -1L;
                    b80Var.c = -1L;
                    c00Var.n.invalidate();
                    xy.f1(c00Var.H, c00Var.y, new jz(c00Var, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.dh0 dh0Var3 = ((d00) obj).a;
                if (!dh0Var3.b()) {
                    dh0Var3.setProgress(0.0f);
                    dh0Var3.d();
                    break;
                }
                break;
            case 27:
                final g00 g00Var = (g00) obj;
                c00 c00Var2 = (c00) view.getParent();
                final org.telegram.messenger.vo currentFilter = c00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(filtersSetupActivity, c00Var2);
                H.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(2131750779, null), new Runnable() { // from class: org.telegram.ui.f00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.vo voVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.e;
                                if (!voVar.p) {
                                    filtersSetupActivity2.presentFragment(new iz(voVar, null));
                                    break;
                                } else {
                                    Context context = g00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.e;
                                if (!voVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.id.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.R = M03;
                                    u1Var4.T = org.telegram.messenger.id.M0(2131750789, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new ru(4, g00Var2, voVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wz.g1(filtersSetupActivity3, voVar.a, new r3(g00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131750787, null), new Runnable() { // from class: org.telegram.ui.f00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.vo voVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.e;
                                if (!voVar.p) {
                                    filtersSetupActivity2.presentFragment(new iz(voVar, null));
                                    break;
                                } else {
                                    Context context = g00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.e;
                                if (!voVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.id.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.R = M03;
                                    u1Var4.T = org.telegram.messenger.id.M0(2131750789, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new ru(4, g00Var2, voVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wz.g1(filtersSetupActivity3, voVar.a, new r3(g00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.id.a0) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(c00Var2, false));
                H.Z();
                break;
            case 28:
                ((p30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj;
                woVar.a(!woVar.a.q, true);
                org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.a.q).apply();
                break;
        }
    }
}
