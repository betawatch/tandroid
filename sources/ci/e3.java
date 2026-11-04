package ci;

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
import b8.mf;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.pr;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l90;
import org.telegram.ui.ph;
import org.telegram.ui.r41;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e3(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        r11 = 0;
        int i10 = 0;
        int i11 = 1;
        long j10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0((wb) obj).I(R.raw.stars_topup, bd.M0(2131750229, null), bd.H(',', "Gift2Converted", (int) j10)).k(true);
                break;
            case 1:
                org.telegram.ui.Components.fc.a0((r41) obj).I(R.raw.stars_topup, bd.M0(2131750229, null), bd.H(',', "Gift2ConvertedChannel", (int) j10)).k(true);
                break;
            case 2:
                ((ei.r) obj).s.h0(j10, false);
                break;
            case 3:
                ((ei.t2) obj).a.i0(j10 <= 0);
                break;
            case 4:
                org.telegram.messenger.g0.i3((ei.v3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 g02 = r41.g0(hp.s1(((ei.z6) obj).a).M0(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    gi.va vaVar = gi.va.G2;
                    if (vaVar != null && vaVar.d) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                        b2Var.a = true;
                        Q.showAsSheet(g02, b2Var);
                        break;
                    } else {
                        Q.presentFragment(g02);
                        break;
                    }
                }
                break;
            case 6:
                qr qrVar = ((ei.m7) obj).b;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            case 7:
                gi.o8 o8Var = (gi.o8) obj;
                Context context = o8Var.getContext();
                gi.t8 t8Var = o8Var.a0;
                org.telegram.ui.ActionBar.d2 d2Var = t8Var.g1;
                int i12 = gi.t8.V1;
                org.telegram.ui.Components.t4.R(context, d2Var, t8Var.J0, new ei.c1(o8Var, j10, i11));
                break;
            case 8:
                gi.va vaVar2 = (gi.va) obj;
                gi.qa qaVar = vaVar2.G;
                if (qaVar != null) {
                    qaVar.f(true);
                    vaVar2.G = null;
                }
                gi.ma maVar = vaVar2.y;
                gi.qa c2 = maVar != null ? maVar.c(j10) : null;
                vaVar2.G = c2;
                if (c2 != null) {
                    vaVar2.K = c2.a;
                    vaVar2.r.c();
                    gi.ha haVar = vaVar2.i0;
                    int i13 = vaVar2.K;
                    if (i13 != 1 && i13 != 0) {
                        i10 = -14737633;
                    }
                    haVar.setBackgroundColor(i10);
                    vaVar2.I.set(vaVar2.G.c);
                    gi.qa qaVar2 = vaVar2.G;
                    vaVar2.H = qaVar2.b;
                    qaVar2.e();
                    if (az.o() > 1) {
                        org.telegram.messenger.lc.e(360928);
                    }
                }
                vaVar2.y = null;
                Activity activity = vaVar2.b;
                if (!(activity instanceof LaunchActivity)) {
                    vaVar2.p(true);
                    break;
                } else {
                    ((LaunchActivity) activity).A0.post(new gi.v8(vaVar2, 5));
                    break;
                }
            case 9:
                gi.za zaVar = ((gi.fb) obj).a;
                if (zaVar != null) {
                    zaVar.n(j10, false);
                    break;
                }
                break;
            case 10:
                ji.b0 b0Var = (ji.b0) obj;
                hp.s1(b0Var.a).Q2(this.b, b0Var.m1, true, false, new ji.r(b0Var, i11));
                break;
            case 11:
                ji.i0 i0Var = (ji.i0) obj;
                i0Var.i = null;
                i0Var.g.l(j10);
                i0Var.l++;
                i0Var.a();
                ji.h0 h0Var = i0Var.h;
                if (h0Var != null) {
                    h0Var.H0();
                    break;
                }
                break;
            case 12:
                kg.e0 e0Var = (kg.e0) obj;
                e0Var.getClass();
                try {
                    qr.a0(e0Var.t0).b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 13:
                m2.u uVar = (m2.u) ((m2.t) obj).c;
                String str = g2.n0.a;
                l2.f fVar = ((k2.c0) uVar).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1010, new l2.d(U, j10));
                break;
            case 14:
                mi.p pVar = (mi.p) obj;
                org.telegram.ui.Components.t4.L(pVar.b.X1.getParentActivity(), j10, new hi.d(pVar, 12), pVar.a);
                break;
            case 15:
                mi.c2 c2Var = (mi.c2) obj;
                org.telegram.ui.Components.t4.L(c2Var.getParentActivity(), j10, new gi.v5(c2Var, 16), c2Var.getResourceProvider());
                break;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                break;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                break;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                break;
            case 19:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new wm(a1.g.j(j10, "user_id")));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ac Q2 = org.telegram.ui.Components.fc.a0((org.telegram.ui.z6) obj).Q(R.raw.ic_delete, 36, bd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j10, false, false)));
                Q2.r = false;
                Q2.j();
                break;
            case 21:
                jf jfVar = (jf) obj;
                jfVar.getClass();
                jfVar.presentFragment(wm.ra(j10));
                break;
            case 22:
                hk hkVar = (hk) obj;
                bi biVar = hkVar.b;
                if (hkVar.L || !hkVar.M0 || !hkVar.isShown()) {
                    hkVar.P0 = null;
                    break;
                } else {
                    oh ohVar = biVar.m3;
                    org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                    if ((ohVar.Q() > org.telegram.messenger.g0.L(20.0f) && !hkVar.C0 && !hkVar.L0) || SystemClock.uptimeMillis() >= j10) {
                        hkVar.P0 = null;
                        org.telegram.ui.ActionBar.e6 e6Var2 = hkVar.a;
                        Context context2 = (d2Var2 == null || d2Var2.getParentActivity() == null) ? hkVar.getContext() : d2Var2.getParentActivity();
                        if (context2 != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, e6Var2);
                            String M0 = bd.M0(2131743215, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            lg.y0 y0Var = new lg.y0(hkVar, context2);
                            y0Var.setTextSize(1, 18.0f);
                            org.telegram.ui.ActionBar.r6.V(y0Var, org.telegram.ui.ActionBar.k6.j5, e6Var2);
                            org.telegram.ui.ActionBar.r6.E(y0Var, org.telegram.ui.ActionBar.k6.t5, e6Var2);
                            y0Var.setHint(bd.M0(2131743179, null));
                            y0Var.setText(hkVar.t0);
                            y0Var.setSelection(y0Var.length());
                            y0Var.setInputType(147457);
                            y0Var.setMaxLines(5);
                            y0Var.setImeOptions(6);
                            org.telegram.ui.ActionBar.r6.G(y0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var2);
                            y0Var.setBackground(null);
                            y0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, context2, e6Var2);
                            int i14 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                            c2Var2.setBackground(h02);
                            org.telegram.ui.ActionBar.r6.k(c2Var2, h02, null, N, e6Var2);
                            c2Var2.e(bd.M0(2131743087, null), "", !hkVar.u0 || hkVar.getPublicKey() == null, false, false);
                            c2Var2.setMultiline(true);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.getCheckBoxView().getLayoutParams();
                            layoutParams.topMargin = 0;
                            layoutParams.gravity = (bd.a0 ? 5 : 3) | 16;
                            c2Var2.getCheckBoxView().setLayoutParams(layoutParams);
                            c2Var2.setPadding(bd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                            c2Var2.setEnabled(hkVar.getPublicKey() != null);
                            c2Var2.setOnClickListener(new org.telegram.ui.Components.z0(c2Var2, 1));
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(1);
                            linearLayout.addView(y0Var, mf.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                            linearLayout.addView(c2Var2, mf.t(-1, -2, 83, 8, 0, 8, 0));
                            s1Var.H = 6;
                            alertDialog$Builder.o(linearLayout);
                            s1Var.a = org.telegram.messenger.g0.L(292.0f);
                            alertDialog$Builder.h(bd.M0(2131752589, null), new org.telegram.ui.Components.a3(11));
                            alertDialog$Builder.k(bd.M0(2131754486, null), new aa.a(hkVar, y0Var, c2Var2, 26));
                            hkVar.U0 = s1Var;
                            s1Var.k0 = false;
                            s1Var.setOnShowListener(new org.telegram.ui.Components.e2(y0Var, i11));
                            s1Var.setOnDismissListener(new org.telegram.ui.Components.p0(hkVar, 5));
                            s1Var.create();
                            Window window = s1Var.getWindow();
                            Rect rect = new Rect();
                            biVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                            s1Var.show();
                            View d = s1Var.d(-1);
                            if ((d instanceof TextView) && !TextUtils.isEmpty(hkVar.t0)) {
                                y0Var.addTextChangedListener(new gk(y0Var, (TextView) d));
                                break;
                            }
                        }
                    } else {
                        hkVar.postDelayed(hkVar.P0, 32L);
                        break;
                    }
                }
                break;
            case 23:
                ud0 ud0Var = (ud0) obj;
                ud0Var.h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
                org.telegram.messenger.g0.i3(new qd0(ud0Var, 1), 100L);
                break;
            case 24:
                bf0 bf0Var = (bf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (PhotoViewer.v1().U1() || (T2 != null && T2.hasShownSheet())) {
                    e6Var = new ei.b();
                } else if (T2 != null) {
                    e6Var = T2.getResourceProvider();
                }
                new mb(u02, e6Var, this.b, 15, "", new ye0(bf0Var, 0), 0L).show();
                break;
            case 25:
                uw uwVar = (uw) obj;
                uwVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(pr.a(j10, 0L));
                uwVar.D2.y(uwVar, arrayList, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
                break;
            case 26:
                ((x30) obj).o1(j10, false);
                break;
            case 27:
                l90 l90Var = (l90) obj;
                l90Var.getClass();
                l90Var.presentFragment(wm.ra(j10));
                break;
            case 28:
                wm wmVar = ((ph) obj).f;
                wmVar.O7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == wmVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                zy zyVar = (zy) obj;
                zyVar.e = SystemClock.elapsedRealtime();
                zyVar.c = false;
                if (j10 == -1) {
                    zyVar.d = false;
                    zyVar.b = 0L;
                } else {
                    zyVar.b = j10;
                    zyVar.d = true;
                }
                hs.e().k(hs.B4, zyVar);
                break;
        }
    }
}
