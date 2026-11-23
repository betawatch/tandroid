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
import c8.na;
import di.fb;
import di.pb;
import hi.eb;
import hi.ib;
import hi.k9;
import hi.m9;
import hi.nb;
import hi.rb;
import hi.xb;
import hi.za;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.sr;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.q90;
import org.telegram.ui.th;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(long j3, aa.r rVar) {
        this.a = 0;
        this.b = j3;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        r12 = 0;
        int i10 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        int i11 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                l4.b.add(Long.valueOf(j3));
                l4.j(j3, 60000L);
                ((aa.r) obj).run();
                fc Q = l4.h().Q(R.raw.contact_check, 36, gd.N0(2131749546, null));
                Q.t = true;
                Q.j();
                break;
            case 1:
                kc.b0((pb) obj).I(R.raw.stars_topup, gd.N0(2131750204, null), gd.H(',', "Gift2Converted", (int) j3)).k(true);
                break;
            case 2:
                kc.b0((b51) obj).I(R.raw.stars_topup, gd.N0(2131750204, null), gd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                break;
            case 3:
                ((fi.q) obj).s.h0(j3, false);
                break;
            case 4:
                ((fi.j2) obj).a.i0(j3 <= 0);
                break;
            case 5:
                org.telegram.messenger.g0.h3((fi.l3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                break;
            case 6:
                org.telegram.ui.ActionBar.g2 g02 = b51.g0(mp.u1(((fi.p6) obj).a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    nb nbVar = nb.G2;
                    if (nbVar != null && nbVar.d) {
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                        e2Var.a = true;
                        Q2.showAsSheet(g02, e2Var);
                        break;
                    } else {
                        Q2.presentFragment(g02);
                        break;
                    }
                }
                break;
            case 7:
                tr trVar = ((fi.c7) obj).b;
                SQLiteDatabase sQLiteDatabase = trVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 8:
                hi.f9 f9Var = (hi.f9) obj;
                Context context = f9Var.getContext();
                k9 k9Var = f9Var.a0;
                org.telegram.ui.ActionBar.g2 g2Var = k9Var.j1;
                int i12 = k9.Y1;
                org.telegram.ui.Components.b5.P(context, g2Var, k9Var.J0, new ai.z(f9Var, j3, 2));
                break;
            case 9:
                nb nbVar2 = (nb) obj;
                ib ibVar = nbVar2.G;
                if (ibVar != null) {
                    ibVar.f(true);
                    nbVar2.G = null;
                }
                eb ebVar = nbVar2.y;
                ib a10 = ebVar != null ? ebVar.a(j3) : null;
                nbVar2.G = a10;
                if (a10 != null) {
                    nbVar2.K = a10.a;
                    nbVar2.r.c();
                    za zaVar = nbVar2.i0;
                    int i13 = nbVar2.K;
                    if (i13 != 1 && i13 != 0) {
                        i10 = -14737633;
                    }
                    zaVar.setBackgroundColor(i10);
                    nbVar2.I.set(nbVar2.G.c);
                    ib ibVar2 = nbVar2.G;
                    nbVar2.H = ibVar2.b;
                    ibVar2.e();
                    if (bz.o() > 1) {
                        pc.e(360928);
                    }
                }
                nbVar2.y = null;
                Activity activity = nbVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    nbVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).y0.post(new m9(nbVar2, 5));
                    break;
                }
            case 10:
                rb rbVar = ((xb) obj).a;
                if (rbVar != null) {
                    rbVar.p(j3, false);
                    break;
                }
                break;
            case 11:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    tr.a0(h0Var.t0).b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                li.c0 c0Var = (li.c0) obj;
                mp.u1(c0Var.a).W2(this.b, c0Var.p1, true, false, new li.s(c0Var, i11));
                break;
            case 13:
                li.j0 j0Var = (li.j0) obj;
                j0Var.i = null;
                j0Var.g.l(j3);
                j0Var.l++;
                j0Var.a();
                li.i0 i0Var = j0Var.h;
                if (i0Var != null) {
                    i0Var.o();
                    break;
                }
                break;
            case 14:
                n2.s sVar = (n2.s) ((jb.m) obj).c;
                String str = h2.l0.a;
                m2.d dVar = ((l2.a0) sVar).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                break;
            case 15:
                oi.p pVar = (oi.p) obj;
                org.telegram.ui.Components.b5.J(pVar.b.a2.getParentActivity(), j3, new hi.u0(pVar, 19), pVar.a);
                break;
            case 16:
                oi.b2 b2Var = (oi.b2) obj;
                org.telegram.ui.Components.b5.J(b2Var.getParentActivity(), j3, new h6.o(b2Var, 20), b2Var.getResourceProvider());
                break;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j3);
                break;
            case 18:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                break;
            case 19:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                break;
            case 20:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new bn(a8.p0.j(j3, "user_id")));
                    break;
                }
                break;
            case 21:
                fc Q3 = kc.b0((org.telegram.ui.y6) obj).Q(R.raw.ic_delete, 36, gd.a0(null, null, 2131752633, org.telegram.messenger.g0.i0(j3, false, false)));
                Q3.r = false;
                Q3.j();
                break;
            case 22:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(bn.ua(j3));
                break;
            case 23:
                xk xkVar = (xk) obj;
                ti tiVar = xkVar.b;
                if (xkVar.L || !xkVar.M0 || !xkVar.isShown()) {
                    xkVar.P0 = null;
                    break;
                } else {
                    gi giVar = tiVar.p3;
                    org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
                    if ((giVar.Q() > org.telegram.messenger.g0.L(20.0f) && !xkVar.C0 && !xkVar.L0) || SystemClock.uptimeMillis() >= j3) {
                        xkVar.P0 = null;
                        org.telegram.ui.ActionBar.i6 i6Var2 = xkVar.a;
                        Context context2 = (g2Var2 == null || g2Var2.getParentActivity() == null) ? xkVar.getContext() : g2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, i6Var2);
                            String N0 = gd.N0(2131742954, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            kg.z0 z0Var = new kg.z0(xkVar, context2);
                            z0Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.u6.U(z0Var, org.telegram.ui.ActionBar.n6.j5, i6Var2);
                            org.telegram.ui.ActionBar.u6.D(z0Var, org.telegram.ui.ActionBar.n6.t5, i6Var2);
                            z0Var.setHint(gd.N0(2131742918, null));
                            z0Var.setText(xkVar.t0);
                            z0Var.setSelection(z0Var.length());
                            z0Var.setInputType(147457);
                            z0Var.setMaxLines(5);
                            z0Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.u6.F(z0Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var2);
                            z0Var.setBackground(null);
                            z0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context2, i6Var2);
                            int i14 = org.telegram.ui.ActionBar.n6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                            d2Var.setBackground(h02);
                            org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var2);
                            d2Var.e(gd.N0(2131742825, null), "", !xkVar.u0 || xkVar.getPublicKey() == null, false, false);
                            d2Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (gd.a0 ? 5 : 3) | 16;
                            d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                            d2Var.setPadding(gd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                            d2Var.setEnabled(xkVar.getPublicKey() != null);
                            d2Var.setOnClickListener(new org.telegram.ui.Components.i1(d2Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(z0Var, na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(d2Var, na.t(-1, -2, 83, 8, 0, 8, 0));
                            t1Var.H = 6;
                            alertDialog$Builder.o(linearLayout);
                            t1Var.a = org.telegram.messenger.g0.L(292.0f);
                            alertDialog$Builder.h(gd.N0(2131752577, null), new org.telegram.ui.Components.k2(19));
                            alertDialog$Builder.k(gd.N0(2131754483, null), new a3.h(xkVar, z0Var, d2Var, 27));
                            xkVar.U0 = t1Var;
                            t1Var.k0 = false;
                            t1Var.setOnShowListener(new org.telegram.ui.Components.o2(z0Var, i11));
                            t1Var.setOnDismissListener(new org.telegram.ui.Components.y0(xkVar, 4));
                            t1Var.create();
                            Window window = t1Var.getWindow();
                            Rect rect = new Rect();
                            tiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                            t1Var.show();
                            View d = t1Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(xkVar.t0)) {
                                z0Var.addTextChangedListener(new wk(z0Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        xkVar.postDelayed(xkVar.P0, 32L);
                        break;
                    }
                }
                break;
            case 24:
                ke0 ke0Var = (ke0) obj;
                ke0Var.getClass();
                ke0Var.h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
                org.telegram.messenger.g0.h3(new ge0(ke0Var, 1), 100L);
                break;
            case 25:
                nf0 nf0Var = (nf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (PhotoViewer.p1().Q1() || (T2 != null && T2.hasShownSheet())) {
                    i6Var = new fi.b();
                } else if (T2 != null) {
                    i6Var = T2.getResourceProvider();
                }
                new fb(u02, i6Var, this.b, 15, "", new kf0(nf0Var, 0), 0L).show();
                break;
            case 26:
                bx bxVar = (bx) obj;
                bxVar.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(sr.a(j3, 0L));
                bxVar.E2.z(bxVar, arrayList, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
                break;
            case 27:
                ((e40) obj).q1(j3, false);
                break;
            case 28:
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                q90Var.presentFragment(bn.ua(j3));
                break;
            default:
                bn bnVar = ((th) obj).f;
                bnVar.P7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == bnVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ e4(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }
}
