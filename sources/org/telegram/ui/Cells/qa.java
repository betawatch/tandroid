package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11 = this.a;
        int i12 = this.b;
        Object obj2 = this.c;
        int i13 = 1;
        switch (i11) {
            case 0:
                sa saVar = (sa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                saVar.getClass();
                if (LaunchActivity.z1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.y3.s(R.string.UnknownError, new qc(cb.a(saVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(saVar.getContext());
                        linearLayout.setOrientation(1);
                        kj0 kj0Var = new kj0(saVar.getContext());
                        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        kj0Var.f(R.raw.ic_ban, 50, 50, null);
                        kj0Var.d();
                        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
                        kj0Var.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false)));
                        linearLayout.addView(kj0Var, k7.c6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(saVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
                        linearLayout.addView(textView, k7.c6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(saVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i14 = 0; i14 < Math.min(arrayList.size(), 10); i14++) {
                                StringBuilder f10 = w.c.f(str, "• ");
                                f10.append(sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i14)));
                                f10.append("\n");
                                str = f10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
                        linearLayout.addView(textView2, k7.c6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(saVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i15 = org.telegram.ui.ActionBar.k6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.l1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.k6.w0(null, i15, false))));
                        TextView textView3 = new TextView(saVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, k7.c6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, k7.c6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        qh.d dVar = new qh.d(saVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        k7.e6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, k7.c6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(saVar.getContext(), null, false, false);
                        h3Var.fixNavigationBar();
                        h3Var.customView = linearLayout;
                        h3Var.show();
                        h3Var.setCanDismissWithSwipe(false);
                        h3Var.setCanDismissWithTouchOutside(false);
                        g gVar = new g(h3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.D);
                        dVar.setCountFilled(false);
                        dVar.C = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        bh1 bh1Var = new bh1(16, dVar, gVar);
                        dVar.D = bh1Var;
                        AndroidUtilities.runOnUIThread(bh1Var, 1000L);
                        dVar.setOnClickListener(new y2(dVar, h3Var, i13));
                    }
                }
                saVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 1:
                cl clVar = (cl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(clVar.n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(clVar.n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                clVar.u0.d(tL_messageMediaGeoLive, clVar.v0, true, 0, ((Long) obj).longValue());
                clVar.b.dismiss(true);
                break;
            case 2:
                qh.i5 i5Var = (qh.i5) obj2;
                int[] iArr = (int[]) obj;
                qh.r6 r6Var = i5Var.d;
                int i16 = iArr[0];
                i5Var.R = i16;
                r6Var.A0 = i16;
                int i17 = iArr[1];
                i5Var.S = i17;
                r6Var.B0 = i17;
                i5Var.Q.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i5Var.invalidate();
                x61 x61Var = i5Var.n;
                if (x61Var != null) {
                    int i18 = i5Var.R;
                    int i19 = i5Var.S;
                    xz xzVar = x61Var.b;
                    if (xzVar == null) {
                        x61Var.n = i18;
                        x61Var.r = i19;
                    } else {
                        xzVar.i(i18, i19);
                    }
                }
                pf0 pf0Var = i5Var.s;
                if (pf0Var != null) {
                    int i20 = i5Var.R;
                    int i21 = i5Var.S;
                    xz xzVar2 = pf0Var.i0;
                    if (xzVar2 != null) {
                        xzVar2.i(i20, i21);
                        break;
                    } else {
                        pf0Var.G0 = i20;
                        pf0Var.H0 = i21;
                        break;
                    }
                }
                break;
            default:
                vf.m1 m1Var = ((vf.f1) obj2).a;
                vf.m1.X(m1Var);
                i10 = ((org.telegram.ui.ActionBar.p2) m1Var).currentAccount;
                vf.p1.f(i10).k(i12, (String) obj);
                break;
        }
    }
}
