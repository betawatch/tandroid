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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        int i7 = this.a;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((ai.a1) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.x2[]) obj)[0].dismiss();
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
                        String M0 = org.telegram.messenger.gd.M0(2131748395, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.a0("AutoDeleteConfirmMessage", null, 2131753863, org.telegram.messenger.gd.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(19));
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751149, null), new oi.e0(5, p4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        p4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.b5.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    break;
                }
            case 4:
                ((b5) obj).b(false);
                break;
            case 5:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.gd.M0(2131752087, null));
                org.telegram.ui.Components.m6 m6Var = p6Var.c;
                if (TextUtils.isEmpty(m6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.S = sb3;
                u1Var2.U = org.telegram.messenger.gd.M0(2131744579, null);
                alertDialog$Builder2.k(p6Var.b.i, new w0(p6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                p6Var.d.showDialog(u1Var2);
                View d = u1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.n6.p7;
                    org.telegram.ui.ActionBar.u6.U((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, i14, false))));
                    break;
                }
                break;
            case 6:
                x6 x6Var = (x6) ((v6) obj).f;
                x6Var.M = !x6Var.M;
                x6Var.A0(true);
                x6Var.y0();
                break;
            case 7:
                j7 j7Var = (j7) obj;
                switch (j7Var.f) {
                    case 0:
                        ((k7) j7Var.h).r.G.m(null, (ei.b) j7Var.getTag(), true);
                        break;
                    default:
                        ((p7) j7Var.h).n.G.m(null, (ei.b) j7Var.getTag(), true);
                        break;
                }
            case 8:
                ((b0) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.ph0 ph0Var = (org.telegram.ui.Components.ph0) ((di.n4) obj).e;
                if (!ph0Var.b()) {
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.q6.e, t9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new n9(t9Var, i12));
                    t9Var.w.playTogether(ofInt);
                    t9Var.w.setDuration(200L);
                    t9Var.w.setInterpolator(org.telegram.ui.Components.lr.f);
                    t9Var.w.addListener(new ki.n3(t9Var, 20));
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
                bn bnVar = ((ti) obj).b;
                bnVar.j0.p();
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null) {
                    n2Var.x1(0, null);
                }
                bnVar.Aa();
                break;
            case 13:
                bn bnVar2 = ((mm) obj).a;
                s4Var = ((org.telegram.ui.ActionBar.h2) bnVar2).parentLayout;
                if (s4Var != null) {
                    s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar2).parentLayout;
                    ((ActionBarLayout) s4Var2).r();
                    break;
                }
                break;
            case 14:
                ((mp) obj).e.w0(true);
                break;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                break;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!r12.e.h);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).b).y0.run();
                break;
            case 18:
                org.telegram.messenger.n10.m(3, (org.telegram.ui.ActionBar.h2) obj);
                break;
            case 19:
                final au auVar = (au) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(auVar.getContext());
                String M02 = org.telegram.messenger.gd.M0(2131752087, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.S = M02;
                u1Var3.U = org.telegram.messenger.gd.M0(2131752085, null);
                alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.yt
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i11) {
                            case 0:
                                auVar.dismiss();
                                break;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.c).o0(auVar2.U1, auVar2.X1, auVar2.c2);
                                break;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.yt
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i15) {
                        switch (i12) {
                            case 0:
                                auVar.dismiss();
                                break;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.c).o0(auVar2.U1, auVar2.X1, auVar2.c2);
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
                ((zy) obj).e1();
                break;
            case 22:
                ((zy) ((k0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.ph0 ph0Var2 = (org.telegram.ui.Components.ph0) ((k0) obj).b;
                if (!ph0Var2.b()) {
                    ph0Var2.setProgress(0.0f);
                    ph0Var2.d();
                    break;
                }
                break;
            case 24:
                ((ez) obj).c();
                break;
            case 25:
                f00 f00Var = (f00) obj;
                org.telegram.ui.Components.o80 o80Var = f00Var.s;
                if ((!f00Var.r || o80Var.c()) && f00Var.y != null) {
                    f00Var.r = true;
                    o80Var.b = -1L;
                    o80Var.c = -1L;
                    f00Var.n.invalidate();
                    zy.g1(f00Var.I, f00Var.y, new lz(f00Var, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.ph0 ph0Var3 = ((g00) obj).a;
                if (!ph0Var3.b()) {
                    ph0Var3.setProgress(0.0f);
                    ph0Var3.d();
                    break;
                }
                break;
            case 27:
                final j00 j00Var = (j00) obj;
                f00 f00Var2 = (f00) view.getParent();
                final org.telegram.messenger.ro currentFilter = f00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = j00Var.e;
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(filtersSetupActivity, f00Var2);
                I.c(R.drawable.msg_edit, org.telegram.messenger.gd.M0(2131750768, null), new Runnable() { // from class: org.telegram.ui.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.ro roVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.e;
                                if (!roVar.p) {
                                    filtersSetupActivity2.presentFragment(new kz(roVar, null));
                                    break;
                                } else {
                                    Context context = j00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.h2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.l0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.e;
                                int i17 = 7;
                                if (!roVar.c()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.gd.M0(2131750779, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.S = M03;
                                    u1Var4.U = org.telegram.messenger.gd.M0(2131750778, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new at(i17, j00Var2, roVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.a, new r3(j00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                I.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131750776, null), new Runnable() { // from class: org.telegram.ui.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.ro roVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.e;
                                if (!roVar.p) {
                                    filtersSetupActivity2.presentFragment(new kz(roVar, null));
                                    break;
                                } else {
                                    Context context = j00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.h2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.l0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.e;
                                int i17 = 7;
                                if (!roVar.c()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M03 = org.telegram.messenger.gd.M0(2131750779, null);
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
                                    u1Var4.S = M03;
                                    u1Var4.U = org.telegram.messenger.gd.M0(2131750778, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new at(i17, j00Var2, roVar));
                                    filtersSetupActivity3.showDialog(u1Var4);
                                    TextView textView = (TextView) u1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.a, new r3(j00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.gd.a0) {
                    I.i = 3;
                }
                I.X(filtersSetupActivity.a.U0(f00Var2, false));
                I.a0();
                break;
            case 28:
                ((q30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) obj;
                mpVar.a(!mpVar.a.q, true);
                org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", mpVar.a.q).apply();
                break;
        }
    }
}
