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
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.gs;
import org.telegram.messenger.hs;
import org.telegram.messenger.sc;
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.oi;
import org.telegram.ui.ta0;
import org.telegram.ui.u61;
import org.telegram.ui.un;
import org.telegram.ui.y6;
import rh.h8;
import rh.x7;
import vh.b8;
import vh.f8;
import vh.j8;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        int i12 = 5;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        r13 = 0;
        int i13 = 0;
        int i14 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                t tVar = (t) obj;
                org.telegram.ui.Components.s4.L(tVar.b.W1.getParentActivity(), j10, new k6.h(tVar, 10), tVar.a);
                break;
            case 1:
                k2 k2Var = (k2) obj;
                org.telegram.ui.Components.s4.L(k2Var.getParentActivity(), j10, new za.c(k2Var, 9), k2Var.getResourceProvider());
                break;
            case 2:
                k2.w wVar = (k2.w) ((hf.b) obj).c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1010, new j2.e(U, j10));
                break;
            case 3:
                ki.k kVar = (ki.k) ((ki.g) obj).c;
                if (j10 == kVar.o && (i10 = kVar.G) != 9 && i10 != 10 && i10 != 8) {
                    SystemClock.elapsedRealtime();
                    kVar.w = false;
                    kVar.s(3);
                    kVar.i.removeCallbacks(kVar.D);
                    kVar.h.b("recording started: retainedDurationMs=" + ki.k.r(kVar.p));
                    break;
                }
                break;
            case 4:
                mg.v1 v1Var = (mg.v1) obj;
                HashSet hashSet = v1Var.W1;
                hashSet.remove(Long.valueOf(j10));
                v1Var.Q1.b(true, hashSet, new mg.p1(v1Var, 5), null);
                v1Var.n1(true, false);
                break;
            case 5:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 6:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 7:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 8:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new un(org.telegram.ui.Cells.f1.k(j10, "user_id")));
                    break;
                }
                break;
            case 9:
                wb Q = cc.a0((y6) obj).Q(R.raw.ic_delete, 36, cd.a0(null, null, 2131752645, org.telegram.messenger.i0.i0(j10, false, false)));
                Q.r = false;
                Q.j();
                break;
            case 10:
                ff ffVar = (ff) obj;
                ffVar.getClass();
                ffVar.presentFragment(un.ha(j10));
                break;
            case 11:
                kk kkVar = (kk) obj;
                bi biVar = kkVar.b;
                if (kkVar.K || !kkVar.L0 || !kkVar.isShown()) {
                    kkVar.O0 = null;
                    break;
                } else {
                    ph phVar = biVar.l3;
                    org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                    if ((phVar.Q() > org.telegram.messenger.i0.L(20.0f) && !kkVar.B0 && !kkVar.K0) || SystemClock.uptimeMillis() >= j10) {
                        kkVar.O0 = null;
                        org.telegram.ui.ActionBar.p6 p6Var2 = kkVar.a;
                        Context context = (k2Var2 == null || k2Var2.getParentActivity() == null) ? kkVar.getContext() : k2Var2.getParentActivity();
                        if (context != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var2);
                            String L0 = cd.L0(2131743231, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            ag.a2 a2Var = new ag.a2(kkVar, context);
                            a2Var.setTextSize(1, 18.0f);
                            a7.V(a2Var, org.telegram.ui.ActionBar.t6.j5, p6Var2);
                            a7.E(a2Var, org.telegram.ui.ActionBar.t6.t5, p6Var2);
                            a2Var.setHint(cd.L0(2131743195, null));
                            a2Var.setText(kkVar.s0);
                            a2Var.setSelection(a2Var.length());
                            a2Var.setInputType(147457);
                            a2Var.setMaxLines(5);
                            a2Var.setImeOptions(6);
                            a7.G(a2Var, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var2);
                            a2Var.setBackground(null);
                            a2Var.setPadding(0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(10.0f));
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, p6Var2);
                            int i15 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var2), 7, org.telegram.messenger.i0.L(12.0f));
                            org.telegram.ui.ActionBar.w6 N = a7.N(i15);
                            c2Var.setBackground(h02);
                            a7.k(c2Var, h02, null, N, p6Var2);
                            c2Var.e(cd.L0(2131743103, null), "", !kkVar.t0 || kkVar.getPublicKey() == null, false, false);
                            c2Var.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (cd.X ? 5 : 3) | 16;
                            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                            c2Var.setPadding(cd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), cd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
                            c2Var.setEnabled(kkVar.getPublicKey() != null);
                            c2Var.setOnClickListener(new org.telegram.ui.Components.a1(c2Var, 1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(a2Var, w7.b6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(c2Var, w7.b6.t(-1, -2, 83, 8, 0, 8, 0));
                            x1Var.G = 6;
                            alertDialog$Builder.o(linearLayout);
                            x1Var.a = org.telegram.messenger.i0.L(292.0f);
                            alertDialog$Builder.h(cd.L0(2131752589, null), new org.telegram.ui.Components.v1(28));
                            alertDialog$Builder.k(cd.L0(2131754486, null), new androidx.car.app.utils.a(kkVar, a2Var, c2Var, 18));
                            kkVar.T0 = x1Var;
                            x1Var.j0 = false;
                            x1Var.setOnShowListener(new org.telegram.ui.Components.g2(a2Var, i14));
                            x1Var.setOnDismissListener(new org.telegram.ui.Components.r0(kkVar, 5));
                            x1Var.create();
                            Window window = x1Var.getWindow();
                            Rect rect = new Rect();
                            biVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                            x1Var.show();
                            View d = x1Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(kkVar.s0)) {
                                a2Var.addTextChangedListener(new jk(a2Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        kkVar.postDelayed(kkVar.O0, 32L);
                        break;
                    }
                }
                break;
            case 12:
                ve0 ve0Var = (ve0) obj;
                ve0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                org.telegram.messenger.i0.h3(new re0(ve0Var, 1), 100L);
                break;
            case 13:
                cg0 cg0Var = (cg0) obj;
                Activity u02 = org.telegram.messenger.i0.u0();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (PhotoViewer.v1().U1() || (T2 != null && T2.hasShownSheet())) {
                    p6Var = new th.b();
                } else if (T2 != null) {
                    p6Var = T2.getResourceProvider();
                }
                new x7(u02, p6Var, this.b, 15, "", new zf0(cg0Var, 0), 0L).show();
                break;
            case 14:
                ay ayVar = (ay) obj;
                ayVar.L4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(gs.a(j10, 0L));
                ayVar.C2.y(ayVar, arrayList, null, false, ayVar.J2, ayVar.K2, ayVar.L2, null);
                break;
            case 15:
                ((b50) obj).o1(j10, false);
                break;
            case 16:
                ta0 ta0Var = (ta0) obj;
                ta0Var.getClass();
                ta0Var.presentFragment(un.ha(j10));
                break;
            case 17:
                un unVar = ((oi) obj).f;
                unVar.I7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == unVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 18:
                sz szVar = (sz) obj;
                szVar.e = SystemClock.elapsedRealtime();
                szVar.c = false;
                if (j10 == -1) {
                    szVar.d = false;
                    szVar.b = 0L;
                } else {
                    szVar.b = j10;
                    szVar.d = true;
                }
                zs.e().k(zs.B4, szVar);
                break;
            case 19:
                ((ag.e0) obj).a(Long.valueOf(j10));
                break;
            case 20:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) obj;
                b0Var.getClass();
                b0Var.presentFragment(un.ha(j10));
                break;
            case 21:
                cc.a0((h8) obj).I(R.raw.stars_topup, cd.L0(2131750230, null), cd.H(',', "Gift2Converted", (int) j10)).k(true);
                break;
            case 22:
                cc.a0((u61) obj).I(R.raw.stars_topup, cd.L0(2131750230, null), cd.H(',', "Gift2ConvertedChannel", (int) j10)).k(true);
                break;
            case 23:
                ((th.m) obj).s.h0(j10, false);
                break;
            case 24:
                ((th.u1) obj).a.i0(j10 <= 0);
                break;
            case 25:
                org.telegram.messenger.i0.h3((th.o2) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 26:
                org.telegram.ui.ActionBar.k2 f02 = u61.f0(vp.r1(((th.e5) obj).a).L0(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    o8 o8Var = o8.F2;
                    if (o8Var != null && o8Var.d) {
                        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                        i2Var.a = true;
                        Q2.showAsSheet(f02, i2Var);
                        break;
                    } else {
                        Q2.presentFragment(f02);
                        break;
                    }
                }
                break;
            case 27:
                hs hsVar = ((th.r5) obj).b;
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            case 28:
                vh.r6 r6Var = (vh.r6) obj;
                Context context2 = r6Var.getContext();
                vh.w6 w6Var = r6Var.W;
                org.telegram.ui.ActionBar.k2 k2Var3 = w6Var.f1;
                int i17 = vh.w6.U1;
                org.telegram.ui.Components.s4.R(context2, k2Var3, w6Var.I0, new m4.x0(r6Var, j10, 13));
                break;
            default:
                o8 o8Var2 = (o8) obj;
                j8 j8Var = o8Var2.F;
                if (j8Var != null) {
                    j8Var.f(true);
                    o8Var2.F = null;
                }
                f8 f8Var = o8Var2.y;
                j8 c10 = f8Var != null ? f8Var.c(j10) : null;
                o8Var2.F = c10;
                if (c10 != null) {
                    o8Var2.J = c10.a;
                    o8Var2.r.c();
                    b8 b8Var = o8Var2.h0;
                    int i18 = o8Var2.J;
                    if (i18 != 1 && i18 != 0) {
                        i13 = -14737633;
                    }
                    b8Var.setBackgroundColor(i13);
                    o8Var2.H.set(o8Var2.F.c);
                    j8 j8Var2 = o8Var2.F;
                    o8Var2.G = j8Var2.b;
                    j8Var2.e();
                    if (tz.o() > 1) {
                        sc.e(360928);
                    }
                }
                o8Var2.y = null;
                Activity activity = o8Var2.b;
                if (!(activity instanceof LaunchActivity)) {
                    o8Var2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).z0.post(new vh.y6(o8Var2, i12));
                    break;
                }
        }
    }
}
