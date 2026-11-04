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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        CameraSessionWrapper cameraSession;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i3 = this.a;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((ai.e3) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.t2[]) obj)[0].dismiss();
                break;
            case 2:
                org.telegram.ui.web.t0 webView = ((l3) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            case 3:
                r4 r4Var = (r4) obj;
                if (view != r4Var.e) {
                    int i13 = ((q4) view).e;
                    if (r4Var.Z() == 0 && i13 > 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131748595, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.bd.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(11));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new mi.d4(13, r4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        r4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.t4.k(r4Var.getParentActivity(), null, new f(r4Var, 4));
                    break;
                }
            case 4:
                ((d5) obj).b(false);
                break;
            case 5:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.bd.M0(2131752098, null));
                org.telegram.ui.Components.g6 g6Var = r6Var.c;
                if (TextUtils.isEmpty(g6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) g6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = sb3;
                s1Var2.U = org.telegram.messenger.bd.M0(2131744824, null);
                alertDialog$Builder2.k(r6Var.b.i, new x0(r6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                r6Var.d.showDialog(s1Var2);
                View d = s1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.k6.p7;
                    org.telegram.ui.ActionBar.r6.V((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, i14, false))));
                    break;
                }
                break;
            case 6:
                z6 z6Var = (z6) ((x6) obj).f;
                z6Var.M = !z6Var.M;
                z6Var.A0(true);
                z6Var.y0();
                break;
            case 7:
                l7 l7Var = (l7) obj;
                switch (l7Var.f) {
                    case 0:
                        ((m7) l7Var.h).r.G.a(null, (di.b) l7Var.getTag(), true);
                        break;
                    default:
                        ((r7) l7Var.h).n.G.a(null, (di.b) l7Var.getTag(), true);
                        break;
                }
            case 8:
                ((f4) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) ((ci.t4) obj).e;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.k6.e, s9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new l9(s9Var, i12));
                    s9Var.w.playTogether(ofInt);
                    s9Var.w.setDuration(200L);
                    s9Var.w.setInterpolator(org.telegram.ui.Components.xq.f);
                    s9Var.w.addListener(new ii.v3(s9Var, 20));
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
                ((pc) obj).D0();
                break;
            case 12:
                wm wmVar = ((oi) obj).b;
                wmVar.j0.o();
                ei.x2 x2Var = wmVar.Y1;
                if (x2Var != null) {
                    x2Var.w1(0, null);
                }
                wmVar.xa();
                break;
            case 13:
                wm wmVar2 = ((hm) obj).a;
                q4Var = ((org.telegram.ui.ActionBar.d2) wmVar2).parentLayout;
                if (q4Var != null) {
                    q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar2).parentLayout;
                    ((ActionBarLayout) q4Var2).r();
                    break;
                }
                break;
            case 14:
                ((hp) obj).e.w0(true);
                break;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                break;
            case 16:
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!r12.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).b).y0.run();
                break;
            case 18:
                org.telegram.messenger.camera.q.j(3, (org.telegram.ui.ActionBar.d2) obj);
                break;
            case 19:
                final ut utVar = (ut) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(utVar.getContext());
                String M02 = org.telegram.messenger.bd.M0(2131752098, null);
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                s1Var3.S = M02;
                s1Var3.U = org.telegram.messenger.bd.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.st
                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i15) {
                        switch (i11) {
                            case 0:
                                utVar.dismiss();
                                break;
                            default:
                                ut utVar2 = utVar;
                                utVar2.dismiss();
                                m2.t tVar = utVar2.S1;
                                ((z6) tVar.c).o0(utVar2.R1, utVar2.U1, utVar2.Z1);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.st
                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i15) {
                        switch (i12) {
                            case 0:
                                utVar.dismiss();
                                break;
                            default:
                                ut utVar2 = utVar;
                                utVar2.dismiss();
                                m2.t tVar = utVar2.S1;
                                ((z6) tVar.c).o0(utVar2.R1, utVar2.U1, utVar2.Z1);
                                break;
                        }
                    }
                });
                s1Var3.show();
                s1Var3.i();
                break;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 21:
                ((sy) obj).d1();
                break;
            case 22:
                ((sy) ((l0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.fh0 fh0Var2 = (org.telegram.ui.Components.fh0) ((l0) obj).b;
                if (!fh0Var2.b()) {
                    fh0Var2.setProgress(0.0f);
                    fh0Var2.d();
                    break;
                }
                break;
            case 24:
                ((yy) obj).c();
                break;
            case 25:
                yz yzVar = (yz) obj;
                org.telegram.ui.Components.w70 w70Var = yzVar.s;
                if ((!yzVar.r || w70Var.c()) && yzVar.y != null) {
                    yzVar.r = true;
                    w70Var.b = -1L;
                    w70Var.c = -1L;
                    yzVar.n.invalidate();
                    sy.f1(yzVar.I, yzVar.y, new fz(yzVar, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.fh0 fh0Var3 = ((zz) obj).a;
                if (!fh0Var3.b()) {
                    fh0Var3.setProgress(0.0f);
                    fh0Var3.d();
                    break;
                }
                break;
            case 27:
                final c00 c00Var = (c00) obj;
                yz yzVar2 = (yz) view.getParent();
                final org.telegram.messenger.mo currentFilter = yzVar2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = c00Var.e;
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(filtersSetupActivity, yzVar2);
                H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131750780, null), new Runnable() { // from class: org.telegram.ui.b00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.mo moVar = currentFilter;
                        c00 c00Var2 = c00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = c00Var2.e;
                                if (!moVar.p) {
                                    filtersSetupActivity2.presentFragment(new ez(moVar, null));
                                    break;
                                } else {
                                    Context context = c00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.d2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new vg.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = c00Var2.e;
                                if (!moVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131750791, null);
                                    org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.a;
                                    s1Var4.S = M03;
                                    s1Var4.U = org.telegram.messenger.bd.M0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(14, c00Var2, moVar));
                                    filtersSetupActivity3.showDialog(s1Var4);
                                    TextView textView = (TextView) s1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.rz.g1(filtersSetupActivity3, moVar.a, new s3(c00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131750788, null), new Runnable() { // from class: org.telegram.ui.b00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.mo moVar = currentFilter;
                        c00 c00Var2 = c00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = c00Var2.e;
                                if (!moVar.p) {
                                    filtersSetupActivity2.presentFragment(new ez(moVar, null));
                                    break;
                                } else {
                                    Context context = c00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.d2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new vg.i0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = c00Var2.e;
                                if (!moVar.d()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131750791, null);
                                    org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.a;
                                    s1Var4.S = M03;
                                    s1Var4.U = org.telegram.messenger.bd.M0(2131750790, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(14, c00Var2, moVar));
                                    filtersSetupActivity3.showDialog(s1Var4);
                                    TextView textView = (TextView) s1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.rz.g1(filtersSetupActivity3, moVar.a, new s3(c00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.bd.a0) {
                    H.i = 3;
                }
                H.W(filtersSetupActivity.a.U0(yzVar2, false));
                H.Z();
                break;
            case 28:
                ((i30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj;
                woVar.a(!woVar.a.q, true);
                org.telegram.messenger.hp.e1().edit().putBoolean("callmiconstart", woVar.a.q).apply();
                break;
        }
    }
}
