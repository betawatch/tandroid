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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        int i7 = this.a;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((ai.z0) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.u2[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.s0 webView = ((k3) obj).f.getWebView();
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
                        String M0 = org.telegram.messenger.hd.M0(2131748587, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.hd.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(18));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751160, null), new m2.d(7, p4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        p4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.t4.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
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
                org.telegram.ui.Components.g6 g6Var = q6Var.c;
                if (TextUtils.isEmpty(g6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) g6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = sb3;
                t1Var2.U = org.telegram.messenger.hd.M0(2131744814, null);
                alertDialog$Builder2.k(q6Var.b.i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                q6Var.d.showDialog(t1Var2);
                View d = t1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.j6.p7;
                    org.telegram.ui.ActionBar.q6.U((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.x0(null, i14, false))));
                    break;
                }
                break;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f;
                y6Var.M = !y6Var.M;
                y6Var.A0(true);
                y6Var.y0();
                break;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f) {
                    case 0:
                        ((l7) k7Var.h).r.G.N(null, (ei.b) k7Var.getTag(), true);
                        break;
                    default:
                        ((q7) k7Var.h).n.G.N(null, (ei.b) k7Var.getTag(), true);
                        break;
                }
            case 8:
                ((f0) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) ((di.k4) obj).e;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
                    break;
                }
                break;
            case 10:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.s.getBackground();
                    AnimatorSet animatorSet = t9Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.w = null;
                    }
                    t9Var.w = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.k6.e, t9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new m9(t9Var, i12));
                    t9Var.w.playTogether(ofInt);
                    t9Var.w.setDuration(200L);
                    t9Var.w.setInterpolator(org.telegram.ui.Components.er.f);
                    t9Var.w.addListener(new ki.s3(t9Var, 20));
                    t9Var.w.start();
                    if (t9Var.s.getTag() != null) {
                        t9Var.s.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        t9Var.s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 11:
                ((qc) obj).D0();
                break;
            case 12:
                an anVar = ((si) obj).b;
                anVar.j0.p();
                fi.p2 p2Var = anVar.Y1;
                if (p2Var != null) {
                    p2Var.w1(0, null);
                }
                anVar.Aa();
                break;
            case 13:
                an anVar2 = ((lm) obj).a;
                o4Var = ((org.telegram.ui.ActionBar.e2) anVar2).parentLayout;
                if (o4Var != null) {
                    o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar2).parentLayout;
                    ((ActionBarLayout) o4Var2).r();
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
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!r12.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) obj).b).y0.run();
                break;
            case 18:
                org.telegram.messenger.i20.l(3, (org.telegram.ui.ActionBar.e2) obj);
                break;
            case 19:
                final yt ytVar = (yt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ytVar.getContext());
                String M02 = org.telegram.messenger.hd.M0(2131752098, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                t1Var3.S = M02;
                t1Var3.U = org.telegram.messenger.hd.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.wt
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i15) {
                        switch (i11) {
                            case 0:
                                ytVar.dismiss();
                                break;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                k8.a aVar = ytVar2.V1;
                                ((y6) aVar.c).o0(ytVar2.U1, ytVar2.X1, ytVar2.c2);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.wt
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i15) {
                        switch (i12) {
                            case 0:
                                ytVar.dismiss();
                                break;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                k8.a aVar = ytVar2.V1;
                                ((y6) aVar.c).o0(ytVar2.U1, ytVar2.X1, ytVar2.c2);
                                break;
                        }
                    }
                });
                t1Var3.show();
                t1Var3.i();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 21:
                ((wy) obj).d1();
                break;
            case 22:
                ((wy) ((k0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.fh0 fh0Var2 = (org.telegram.ui.Components.fh0) ((k0) obj).b;
                if (!fh0Var2.b()) {
                    fh0Var2.setProgress(0.0f);
                    fh0Var2.d();
                    break;
                }
                break;
            case 24:
                ((bz) obj).c();
                break;
            case 25:
                c00 c00Var = (c00) obj;
                org.telegram.ui.Components.d80 d80Var = c00Var.s;
                if ((!c00Var.r || d80Var.c()) && c00Var.y != null) {
                    c00Var.r = true;
                    d80Var.b = -1L;
                    d80Var.c = -1L;
                    c00Var.n.invalidate();
                    wy.f1(c00Var.I, c00Var.y, new iz(c00Var, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.fh0 fh0Var3 = ((d00) obj).a;
                if (!fh0Var3.b()) {
                    fh0Var3.setProgress(0.0f);
                    fh0Var3.d();
                    break;
                }
                break;
            case 27:
                final g00 g00Var = (g00) obj;
                c00 c00Var2 = (c00) view.getParent();
                final org.telegram.messenger.so currentFilter = c00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(filtersSetupActivity, c00Var2);
                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131750779, null), new Runnable() { // from class: org.telegram.ui.f00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.so soVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.e;
                                if (!soVar.p) {
                                    filtersSetupActivity2.presentFragment(new hz(soVar, null));
                                    break;
                                } else {
                                    Context context = g00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.e2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.j0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.e;
                                if (!soVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                                    t1Var4.S = M03;
                                    t1Var4.U = org.telegram.messenger.hd.M0(2131750789, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(8, g00Var2, soVar));
                                    filtersSetupActivity3.showDialog(t1Var4);
                                    TextView textView = (TextView) t1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.zz.g1(filtersSetupActivity3, soVar.a, new r3(g00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131750787, null), new Runnable() { // from class: org.telegram.ui.f00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.so soVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.e;
                                if (!soVar.p) {
                                    filtersSetupActivity2.presentFragment(new hz(soVar, null));
                                    break;
                                } else {
                                    Context context = g00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.e2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.j0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.e;
                                if (!soVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                                    t1Var4.S = M03;
                                    t1Var4.U = org.telegram.messenger.hd.M0(2131750789, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(8, g00Var2, soVar));
                                    filtersSetupActivity3.showDialog(t1Var4);
                                    TextView textView = (TextView) t1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.zz.g1(filtersSetupActivity3, soVar.a, new r3(g00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.hd.a0) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(c00Var2, false));
                H.Z();
                break;
            case 28:
                ((n30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) obj;
                fpVar.a(!fpVar.a.q, true);
                org.telegram.messenger.np.e1().edit().putBoolean("callmiconstart", fpVar.a.q).apply();
                break;
        }
    }
}
