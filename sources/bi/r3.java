package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hz;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.xr;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.c51;
import org.telegram.ui.o90;
import org.telegram.ui.th;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        r10 = 0;
        int i10 = 0;
        int i11 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0((dd) obj).I(R.raw.stars_topup, org.telegram.messenger.id.M0(2131750222, null), org.telegram.messenger.id.H(',', "Gift2Converted", (int) j3)).k(true);
                break;
            case 1:
                org.telegram.ui.Components.hc.a0((c51) obj).I(R.raw.stars_topup, org.telegram.messenger.id.M0(2131750222, null), org.telegram.messenger.id.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                break;
            case 2:
                ((di.q) obj).s.h0(j3, false);
                break;
            case 3:
                ((di.p2) obj).a.i0(j3 <= 0);
                break;
            case 4:
                org.telegram.messenger.g0.i3((di.s3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 5:
                org.telegram.ui.ActionBar.f2 g02 = c51.g0(qp.s1(((di.y6) obj).a).M0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    fi.va vaVar = fi.va.F2;
                    if (vaVar != null && vaVar.d) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                        d2Var.a = true;
                        Q.showAsSheet(g02, d2Var);
                        break;
                    } else {
                        Q.presentFragment(g02);
                        break;
                    }
                }
                break;
            case 6:
                yr yrVar = ((di.l7) obj).b;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    yrVar.o(th2, true);
                    return;
                }
            case 7:
                fi.n8 n8Var = (fi.n8) obj;
                Context context = n8Var.getContext();
                fi.s8 s8Var = n8Var.W;
                org.telegram.ui.ActionBar.f2 f2Var = s8Var.f1;
                int i12 = fi.s8.U1;
                org.telegram.ui.Components.v4.P(context, f2Var, s8Var.I0, new di.c1(n8Var, j3, i11));
                break;
            case 8:
                fi.va vaVar2 = (fi.va) obj;
                fi.qa qaVar = vaVar2.F;
                if (qaVar != null) {
                    qaVar.f(true);
                    vaVar2.F = null;
                }
                fi.ma maVar = vaVar2.y;
                fi.qa d = maVar != null ? maVar.d(j3) : null;
                vaVar2.F = d;
                if (d != null) {
                    vaVar2.J = d.a;
                    vaVar2.r.c();
                    fi.ha haVar = vaVar2.h0;
                    int i13 = vaVar2.J;
                    if (i13 != 1 && i13 != 0) {
                        i10 = -14737633;
                    }
                    haVar.setBackgroundColor(i10);
                    vaVar2.H.set(vaVar2.F.c);
                    fi.qa qaVar2 = vaVar2.F;
                    vaVar2.G = qaVar2.b;
                    qaVar2.e();
                    if (iz.o() > 1) {
                        org.telegram.messenger.sc.e(360928);
                    }
                }
                vaVar2.y = null;
                Activity activity = vaVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    vaVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).x0.post(new fi.u8(vaVar2, 5));
                    break;
                }
            case 9:
                fi.za zaVar = ((fi.fb) obj).a;
                if (zaVar != null) {
                    zaVar.j(j3, false);
                    break;
                }
                break;
            case 10:
                ii.d0 d0Var = (ii.d0) obj;
                qp.s1(d0Var.a).Q2(this.b, d0Var.l1, true, false, new ii.t(d0Var, i11));
                break;
            case 11:
                ii.l0 l0Var = (ii.l0) obj;
                l0Var.i = null;
                l0Var.g.l(j3);
                l0Var.l++;
                l0Var.a();
                ii.k0 k0Var = l0Var.h;
                if (k0Var != null) {
                    k0Var.u();
                    break;
                }
                break;
            case 12:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    yr.a0(h0Var.s0).b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 13:
                li.p pVar = (li.p) obj;
                org.telegram.ui.Components.v4.J(pVar.b.W1.getParentActivity(), j3, new g6.d0(pVar, 11), pVar.a);
                break;
            case 14:
                li.b2 b2Var = (li.b2) obj;
                org.telegram.ui.Components.v4.J(b2Var.getParentActivity(), j3, new h9.f1(b2Var, 10), b2Var.getResourceProvider());
                break;
            case 15:
                n2.s sVar = (n2.s) ((j2.n) obj).c;
                String str = h2.m0.a;
                m2.e eVar = ((l2.c0) sVar).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1010, new m2.d(U, j3));
                break;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                break;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                break;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                break;
            case 19:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new an(a8.p0.j(j3, "user_id")));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.cc Q2 = org.telegram.ui.Components.hc.a0((org.telegram.ui.y6) obj).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j3, false, false)));
                Q2.r = false;
                Q2.j();
                break;
            case 21:
                lf lfVar = (lf) obj;
                lfVar.getClass();
                lfVar.presentFragment(an.ra(j3));
                break;
            case 22:
                ik ikVar = (ik) obj;
                di diVar = ikVar.b;
                if (ikVar.K || !ikVar.L0 || !ikVar.isShown()) {
                    ikVar.O0 = null;
                    break;
                } else {
                    qh qhVar = diVar.l3;
                    org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                    if ((qhVar.Q() > org.telegram.messenger.g0.L(20.0f) && !ikVar.B0 && !ikVar.K0) || SystemClock.uptimeMillis() >= j3) {
                        ikVar.O0 = null;
                        org.telegram.ui.ActionBar.f6 f6Var2 = ikVar.a;
                        Context context2 = (f2Var2 == null || f2Var2.getParentActivity() == null) ? ikVar.getContext() : f2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131743208, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            kg.x0 x0Var = new kg.x0(ikVar, context2);
                            x0Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.r6.V(x0Var, org.telegram.ui.ActionBar.k6.j5, f6Var2);
                            org.telegram.ui.ActionBar.r6.E(x0Var, org.telegram.ui.ActionBar.k6.t5, f6Var2);
                            x0Var.setHint(org.telegram.messenger.id.M0(2131743172, null));
                            x0Var.setText(ikVar.s0);
                            x0Var.setSelection(x0Var.length());
                            x0Var.setInputType(147457);
                            x0Var.setMaxLines(5);
                            x0Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.r6.G(x0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, f6Var2);
                            x0Var.setBackground(null);
                            x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context2, f6Var2);
                            int i14 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                            c2Var.setBackground(h02);
                            org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var2);
                            c2Var.e(org.telegram.messenger.id.M0(2131743080, null), "", !ikVar.t0 || ikVar.getPublicKey() == null, false, false);
                            c2Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (org.telegram.messenger.id.a0 ? 5 : 3) | 16;
                            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                            c2Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                            c2Var.setEnabled(ikVar.getPublicKey() != null);
                            c2Var.setOnClickListener(new org.telegram.ui.Components.a1(c2Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(x0Var, c8.ha.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(c2Var, c8.ha.t(-1, -2, 83, 8, 0, 8, 0));
                            u1Var.G = 6;
                            alertDialog$Builder.o(linearLayout);
                            u1Var.a = org.telegram.messenger.g0.L(292.0f);
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.k2(14));
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new a3.h(ikVar, x0Var, c2Var, 26));
                            ikVar.T0 = u1Var;
                            u1Var.j0 = false;
                            u1Var.setOnShowListener(new org.telegram.ui.Components.g2(x0Var, i11));
                            u1Var.setOnDismissListener(new org.telegram.ui.Components.p0(ikVar, 5));
                            u1Var.create();
                            Window window = u1Var.getWindow();
                            Rect rect = new Rect();
                            diVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            if (window != null && rect.height() > 0) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                View decorView = window.getDecorView();
                                int i15 = attributes.width;
                                if (i15 <= 0) {
                                    i15 = rect.width();
                                }
                                decorView.measure(View.MeasureSpec.makeMeasureSpec(i15, attributes.width > 0 ? TLObject.FLAG_30 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rect.height(), TLObject.FLAG_31));
                                attributes.gravity = 49;
                                attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                                window.setAttributes(attributes);
                            }
                            u1Var.show();
                            View d2 = u1Var.d(-1);
                            if ((d2 instanceof TextView) && !TextUtils.isEmpty(ikVar.s0)) {
                                x0Var.addTextChangedListener(new hk(x0Var, (TextView) d2));
                                break;
                            }
                        }
                    } else {
                        ikVar.postDelayed(ikVar.O0, 32L);
                        break;
                    }
                }
                break;
            case 23:
                ae0 ae0Var = (ae0) obj;
                ae0Var.getClass();
                ae0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                org.telegram.messenger.g0.i3(new wd0(ae0Var, 1), 100L);
                break;
            case 24:
                ze0 ze0Var = (ze0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (PhotoViewer.p1().P1() || (T2 != null && T2.hasShownSheet())) {
                    f6Var = new di.b();
                } else if (T2 != null) {
                    f6Var = T2.getResourceProvider();
                }
                new tc(u02, f6Var, this.b, 15, "", new we0(ze0Var, 0), 0L).show();
                break;
            case 25:
                ww wwVar = (ww) obj;
                wwVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(xr.a(j3, 0L));
                wwVar.C2.y(wwVar, arrayList, null, false, wwVar.J2, wwVar.K2, wwVar.L2, null);
                break;
            case 26:
                ((c40) obj).p1(j3, false);
                break;
            case 27:
                o90 o90Var = (o90) obj;
                o90Var.getClass();
                o90Var.presentFragment(an.ra(j3));
                break;
            case 28:
                an anVar = ((th) obj).f;
                anVar.O7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == anVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                hz hzVar = (hz) obj;
                hzVar.e = SystemClock.elapsedRealtime();
                hzVar.c = false;
                if (j3 == -1) {
                    hzVar.d = false;
                    hzVar.b = 0L;
                } else {
                    hzVar.b = j3;
                    hzVar.d = true;
                }
                qs.e().k(qs.B4, hzVar);
                break;
        }
    }
}
