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
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa(Object obj, int i10, int i11) {
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
                ra raVar = (ra) obj2;
                ArrayList arrayList = (ArrayList) obj;
                raVar.getClass();
                if (LaunchActivity.z1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.y3.s(R.string.UnknownError, new qc(cb.a(raVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(raVar.getContext());
                        linearLayout.setOrientation(1);
                        jj0 jj0Var = new jj0(raVar.getContext());
                        jj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        jj0Var.f(R.raw.ic_ban, 50, 50, null);
                        jj0Var.d();
                        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
                        jj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView(jj0Var, k7.b6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(raVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        int i14 = 17;
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView, k7.b6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(raVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, ra.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i15 = 0; i15 < Math.min(arrayList.size(), 10); i15++) {
                                StringBuilder f10 = vh.w2.f(str, "• ");
                                f10.append(ra.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i15)));
                                f10.append("\n");
                                str = f10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView2, k7.b6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(raVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i16 = org.telegram.ui.ActionBar.j6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.j6.w0(null, i16, false))));
                        TextView textView3 = new TextView(raVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, k7.b6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, k7.b6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        ph.d dVar = new ph.d(raVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        k7.d6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, k7.b6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(raVar.getContext(), null, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.customView = linearLayout;
                        g3Var.show();
                        g3Var.setCanDismissWithSwipe(false);
                        g3Var.setCanDismissWithTouchOutside(false);
                        g gVar = new g(g3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.D);
                        dVar.setCountFilled(false);
                        dVar.C = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        sg1 sg1Var = new sg1(i14, dVar, gVar);
                        dVar.D = sg1Var;
                        AndroidUtilities.runOnUIThread(sg1Var, 1000L);
                        dVar.setOnClickListener(new x2(dVar, g3Var, i13));
                    }
                }
                raVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 1:
                al alVar = (al) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(alVar.n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(alVar.n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                alVar.u0.b(tL_messageMediaGeoLive, alVar.v0, true, 0, ((Long) obj).longValue());
                alVar.b.dismiss(true);
                break;
            case 2:
                ph.k5 k5Var = (ph.k5) obj2;
                int[] iArr = (int[]) obj;
                ph.t6 t6Var = k5Var.d;
                int i17 = iArr[0];
                k5Var.R = i17;
                t6Var.A0 = i17;
                int i18 = iArr[1];
                k5Var.S = i18;
                t6Var.B0 = i18;
                k5Var.Q.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                k5Var.invalidate();
                w61 w61Var = k5Var.n;
                if (w61Var != null) {
                    int i19 = k5Var.R;
                    int i20 = k5Var.S;
                    vz vzVar = w61Var.b;
                    if (vzVar == null) {
                        w61Var.n = i19;
                        w61Var.r = i20;
                    } else {
                        vzVar.i(i19, i20);
                    }
                }
                of0 of0Var = k5Var.s;
                if (of0Var != null) {
                    int i21 = k5Var.R;
                    int i22 = k5Var.S;
                    vz vzVar2 = of0Var.i0;
                    if (vzVar2 != null) {
                        vzVar2.i(i21, i22);
                        break;
                    } else {
                        of0Var.G0 = i21;
                        of0Var.H0 = i22;
                        break;
                    }
                }
                break;
            default:
                uf.m1 m1Var = ((uf.f1) obj2).a;
                uf.m1.X(m1Var);
                i10 = ((org.telegram.ui.ActionBar.p2) m1Var).currentAccount;
                uf.p1.f(i10).k(i12, (String) obj);
                break;
        }
    }
}
