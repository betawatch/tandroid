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
import c8.ma;
import di.fb;
import di.pb;
import hi.db;
import hi.fa;
import hi.ka;
import hi.oa;
import hi.ta;
import hi.xa;
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
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.r90;
import org.telegram.ui.sh;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y3(long j3, aa.r rVar) {
        this.a = 0;
        this.b = j3;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 18;
        r12 = 0;
        int i11 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        int i12 = 1;
        long j3 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                e4.b.add(Long.valueOf(j3));
                e4.j(j3, 60000L);
                ((aa.r) obj).run();
                gc Q = e4.h().Q(R.raw.contact_check, 36, gd.M0(2131749547, null));
                Q.t = true;
                Q.j();
                break;
            case 1:
                lc.b0((pb) obj).I(R.raw.stars_topup, gd.M0(2131750205, null), gd.H(',', "Gift2Converted", (int) j3)).k(true);
                break;
            case 2:
                lc.b0((c51) obj).I(R.raw.stars_topup, gd.M0(2131750205, null), gd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
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
                org.telegram.ui.ActionBar.h2 g02 = c51.g0(mp.u1(((fi.p6) obj).a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    ta taVar = ta.G2;
                    if (taVar != null && taVar.d) {
                        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                        f2Var.a = true;
                        Q2.showAsSheet(g02, f2Var);
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
                hi.l8 l8Var = (hi.l8) obj;
                Context context = l8Var.getContext();
                hi.q8 q8Var = l8Var.a0;
                org.telegram.ui.ActionBar.h2 h2Var = q8Var.j1;
                int i13 = hi.q8.Y1;
                org.telegram.ui.Components.b5.P(context, h2Var, q8Var.J0, new ai.d0(l8Var, j3, 2));
                break;
            case 9:
                ta taVar2 = (ta) obj;
                oa oaVar = taVar2.G;
                if (oaVar != null) {
                    oaVar.f(true);
                    taVar2.G = null;
                }
                ka kaVar = taVar2.y;
                oa a10 = kaVar != null ? kaVar.a(j3) : null;
                taVar2.G = a10;
                if (a10 != null) {
                    taVar2.K = a10.a;
                    taVar2.r.c();
                    fa faVar = taVar2.i0;
                    int i14 = taVar2.K;
                    if (i14 != 1 && i14 != 0) {
                        i11 = -14737633;
                    }
                    faVar.setBackgroundColor(i11);
                    taVar2.I.set(taVar2.G.c);
                    oa oaVar2 = taVar2.G;
                    taVar2.H = oaVar2.b;
                    oaVar2.e();
                    if (bz.o() > 1) {
                        pc.e(360928);
                    }
                }
                taVar2.y = null;
                Activity activity = taVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    taVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).y0.post(new hi.s8(taVar2, 5));
                    break;
                }
            case 10:
                xa xaVar = ((db) obj).a;
                if (xaVar != null) {
                    xaVar.M(j3, false);
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
                li.d0 d0Var = (li.d0) obj;
                mp.u1(d0Var.a).W2(this.b, d0Var.p1, true, false, new li.t(d0Var, i12));
                break;
            case 13:
                li.k0 k0Var = (li.k0) obj;
                k0Var.i = null;
                k0Var.g.l(j3);
                k0Var.l++;
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                    break;
                }
                break;
            case 14:
                n2.s sVar = (n2.s) ((k8.a) obj).c;
                String str = h2.l0.a;
                m2.d dVar = ((l2.z) sVar).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                break;
            case 15:
                oi.o oVar = (oi.o) obj;
                org.telegram.ui.Components.b5.J(oVar.b.a2.getParentActivity(), j3, new hi.u5(oVar, i10), oVar.a);
                break;
            case 16:
                oi.z1 z1Var = (oi.z1) obj;
                org.telegram.ui.Components.b5.J(z1Var.getParentActivity(), j3, new hi.w4(z1Var, i10), z1Var.getResourceProvider());
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
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new bn(a8.p0.j(j3, "user_id")));
                    break;
                }
                break;
            case 21:
                gc Q3 = lc.b0((org.telegram.ui.x6) obj).Q(R.raw.ic_delete, 36, gd.a0(null, null, 2131752634, org.telegram.messenger.g0.i0(j3, false, false)));
                Q3.r = false;
                Q3.j();
                break;
            case 22:
                bg bgVar = (bg) obj;
                bgVar.getClass();
                bgVar.presentFragment(bn.ua(j3));
                break;
            case 23:
                xk xkVar = (xk) obj;
                si siVar = xkVar.b;
                if (xkVar.L || !xkVar.M0 || !xkVar.isShown()) {
                    xkVar.P0 = null;
                    break;
                } else {
                    fi fiVar = siVar.p3;
                    org.telegram.ui.ActionBar.h2 h2Var2 = siVar.a2;
                    if ((fiVar.Q() > org.telegram.messenger.g0.L(20.0f) && !xkVar.C0 && !xkVar.L0) || SystemClock.uptimeMillis() >= j3) {
                        xkVar.P0 = null;
                        org.telegram.ui.ActionBar.i6 i6Var2 = xkVar.a;
                        Context context2 = (h2Var2 == null || h2Var2.getParentActivity() == null) ? xkVar.getContext() : h2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, i6Var2);
                            String M0 = gd.M0(2131742967, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            kg.a1 a1Var = new kg.a1(xkVar, context2);
                            a1Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.u6.U(a1Var, org.telegram.ui.ActionBar.n6.j5, i6Var2);
                            org.telegram.ui.ActionBar.u6.D(a1Var, org.telegram.ui.ActionBar.n6.t5, i6Var2);
                            a1Var.setHint(gd.M0(2131742931, null));
                            a1Var.setText(xkVar.t0);
                            a1Var.setSelection(a1Var.length());
                            a1Var.setInputType(147457);
                            a1Var.setMaxLines(5);
                            a1Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.u6.F(a1Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var2);
                            a1Var.setBackground(null);
                            a1Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context2, i6Var2);
                            int i15 = org.telegram.ui.ActionBar.n6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, i6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
                            d2Var.setBackground(h02);
                            org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var2);
                            d2Var.e(gd.M0(2131742838, null), "", !xkVar.u0 || xkVar.getPublicKey() == null, false, false);
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
                            linearLayout.addView(a1Var, ma.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(d2Var, ma.t(-1, -2, 83, 8, 0, 8, 0));
                            u1Var.H = 6;
                            alertDialog$Builder.o(linearLayout);
                            u1Var.a = org.telegram.messenger.g0.L(292.0f);
                            alertDialog$Builder.h(gd.M0(2131752578, null), new org.telegram.ui.Components.k2(19));
                            alertDialog$Builder.k(gd.M0(2131754484, null), new a3.h(xkVar, a1Var, d2Var, 27));
                            xkVar.U0 = u1Var;
                            u1Var.k0 = false;
                            u1Var.setOnShowListener(new org.telegram.ui.Components.o2(a1Var, i12));
                            u1Var.setOnDismissListener(new org.telegram.ui.Components.y0(xkVar, 4));
                            u1Var.create();
                            Window window = u1Var.getWindow();
                            Rect rect = new Rect();
                            siVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            if (window != null && rect.height() > 0) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                View decorView = window.getDecorView();
                                int i16 = attributes.width;
                                if (i16 <= 0) {
                                    i16 = rect.width();
                                }
                                decorView.measure(View.MeasureSpec.makeMeasureSpec(i16, attributes.width > 0 ? TLObject.FLAG_30 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rect.height(), TLObject.FLAG_31));
                                attributes.gravity = 49;
                                attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                                window.setAttributes(attributes);
                            }
                            u1Var.show();
                            View d = u1Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(xkVar.t0)) {
                                a1Var.addTextChangedListener(new wk(a1Var, (TextView) d));
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
                mf0 mf0Var = (mf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (PhotoViewer.p1().P1() || (T2 != null && T2.hasShownSheet())) {
                    i6Var = new fi.b();
                } else if (T2 != null) {
                    i6Var = T2.getResourceProvider();
                }
                new fb(u02, i6Var, this.b, 15, "", new jf0(mf0Var, 0), 0L).show();
                break;
            case 26:
                cx cxVar = (cx) obj;
                cxVar.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(sr.a(j3, 0L));
                cxVar.E2.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                break;
            case 27:
                ((f40) obj).q1(j3, false);
                break;
            case 28:
                r90 r90Var = (r90) obj;
                r90Var.getClass();
                r90Var.presentFragment(bn.ua(j3));
                break;
            default:
                bn bnVar = ((sh) obj).f;
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

    public /* synthetic */ y3(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }
}
