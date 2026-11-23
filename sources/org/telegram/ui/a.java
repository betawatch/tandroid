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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        int i7 = this.a;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((ai.j1) obj).run();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.w2[]) obj)[0].dismiss();
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
                        String N0 = org.telegram.messenger.hd.N0(2131748394, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.a0("AutoDeleteConfirmMessage", null, 2131753862, org.telegram.messenger.hd.c0(i13 * 60));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.messenger.fd(19));
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751148, null), new oi.f0(5, p4Var, view));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        p4Var.b0(view, true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.c5.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    break;
                }
            case 4:
                ((b5) obj).b(false);
                break;
            case 5:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.hd.N0(2131752086, null));
                org.telegram.ui.Components.n6 n6Var = p6Var.c;
                if (TextUtils.isEmpty(n6Var.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = sb3;
                t1Var2.U = org.telegram.messenger.hd.N0(2131744571, null);
                alertDialog$Builder2.k(p6Var.b.i, new w0(p6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                p6Var.d.showDialog(t1Var2);
                View d = t1Var2.d(-1);
                if (d instanceof TextView) {
                    int i14 = org.telegram.ui.ActionBar.m6.p7;
                    org.telegram.ui.ActionBar.t6.U((TextView) d, i14, null);
                    d.setBackground(org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, i14, false))));
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
                ((f0) obj).run();
                break;
            case 9:
                org.telegram.ui.Components.rh0 rh0Var = (org.telegram.ui.Components.rh0) ((di.n4) obj).e;
                if (!rh0Var.b()) {
                    rh0Var.setProgress(0.0f);
                    rh0Var.d();
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
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, org.telegram.ui.Components.r6.e, t9Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new n9(t9Var, i12));
                    t9Var.w.playTogether(ofInt);
                    t9Var.w.setDuration(200L);
                    t9Var.w.setInterpolator(org.telegram.ui.Components.nr.f);
                    t9Var.w.addListener(new ki.m3(t9Var, 20));
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
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                if (r4Var != null) {
                    r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                    ((ActionBarLayout) r4Var2).r();
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
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) obj).b).y0.run();
                break;
            case 18:
                org.telegram.messenger.o10.m(3, (org.telegram.ui.ActionBar.g2) obj);
                break;
            case 19:
                final au auVar = (au) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(auVar.getContext());
                String N02 = org.telegram.messenger.hd.N0(2131752086, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
                t1Var3.S = N02;
                t1Var3.U = org.telegram.messenger.hd.N0(2131752084, null);
                alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.yt
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i15) {
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
                alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.yt
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i15) {
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
                ((zy) obj).e1();
                break;
            case 22:
                ((zy) ((k0) obj).b).dismiss();
                break;
            case 23:
                org.telegram.ui.Components.rh0 rh0Var2 = (org.telegram.ui.Components.rh0) ((k0) obj).b;
                if (!rh0Var2.b()) {
                    rh0Var2.setProgress(0.0f);
                    rh0Var2.d();
                    break;
                }
                break;
            case 24:
                ((ez) obj).c();
                break;
            case 25:
                f00 f00Var = (f00) obj;
                org.telegram.ui.Components.q80 q80Var = f00Var.s;
                if ((!f00Var.r || q80Var.c()) && f00Var.y != null) {
                    f00Var.r = true;
                    q80Var.b = -1L;
                    q80Var.c = -1L;
                    f00Var.n.invalidate();
                    zy.g1(f00Var.I, f00Var.y, new lz(f00Var, i10));
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.rh0 rh0Var3 = ((g00) obj).a;
                if (!rh0Var3.b()) {
                    rh0Var3.setProgress(0.0f);
                    rh0Var3.d();
                    break;
                }
                break;
            case 27:
                final j00 j00Var = (j00) obj;
                f00 f00Var2 = (f00) view.getParent();
                final org.telegram.messenger.so currentFilter = f00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = j00Var.e;
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(filtersSetupActivity, f00Var2);
                I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131750767, null), new Runnable() { // from class: org.telegram.ui.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i11;
                        org.telegram.messenger.so soVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.e;
                                if (!soVar.p) {
                                    filtersSetupActivity2.presentFragment(new kz(soVar, null));
                                    break;
                                } else {
                                    Context context = j00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.e;
                                int i17 = 7;
                                if (!soVar.c()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131750778, null);
                                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                                    t1Var4.S = N03;
                                    t1Var4.U = org.telegram.messenger.hd.N0(2131750777, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751586, null), new at(i17, j00Var2, soVar));
                                    filtersSetupActivity3.showDialog(t1Var4);
                                    TextView textView = (TextView) t1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.i00.h1(filtersSetupActivity3, soVar.a, new r3(j00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131750775, null), new Runnable() { // from class: org.telegram.ui.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15;
                        int i16 = i12;
                        org.telegram.messenger.so soVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i16) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.e;
                                if (!soVar.p) {
                                    filtersSetupActivity2.presentFragment(new kz(soVar, null));
                                    break;
                                } else {
                                    Context context = j00Var2.d;
                                    i15 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i15, context, filtersSetupActivity2, null));
                                    break;
                                }
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.e;
                                int i17 = 7;
                                if (!soVar.c()) {
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131750778, null);
                                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.a;
                                    t1Var4.S = N03;
                                    t1Var4.U = org.telegram.messenger.hd.N0(2131750777, null);
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751586, null), new at(i17, j00Var2, soVar));
                                    filtersSetupActivity3.showDialog(t1Var4);
                                    TextView textView = (TextView) t1Var4.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.i00.h1(filtersSetupActivity3, soVar.a, new r3(j00Var2, 7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (org.telegram.messenger.hd.a0) {
                    I.i = 3;
                }
                I.X(filtersSetupActivity.a.U0(f00Var2, false));
                I.a0();
                break;
            case 28:
                ((q30) obj).dismiss();
                break;
            default:
                org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) obj;
                opVar.a(!opVar.a.q, true);
                org.telegram.messenger.np.g1().edit().putBoolean("callmiconstart", opVar.a.q).apply();
                break;
        }
    }
}
