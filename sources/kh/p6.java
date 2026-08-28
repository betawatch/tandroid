package kh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        int i10 = this.a;
        int i11 = this.b;
        Object obj2 = this.c;
        int i12 = 1;
        switch (i10) {
            case 0:
                r6 r6Var = (r6) obj2;
                int[] iArr = (int[]) obj;
                a8 a8Var = r6Var.d;
                int i13 = iArr[0];
                r6Var.Q = i13;
                a8Var.A0 = i13;
                int i14 = iArr[1];
                r6Var.R = i14;
                a8Var.B0 = i14;
                r6Var.P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                r6Var.invalidate();
                y51 y51Var = r6Var.n;
                if (y51Var != null) {
                    int i15 = r6Var.Q;
                    int i16 = r6Var.R;
                    hz hzVar = y51Var.b;
                    if (hzVar == null) {
                        y51Var.n = i15;
                        y51Var.r = i16;
                    } else {
                        hzVar.i(i15, i16);
                    }
                }
                qe0 qe0Var = r6Var.s;
                if (qe0Var != null) {
                    int i17 = r6Var.Q;
                    int i18 = r6Var.R;
                    hz hzVar2 = qe0Var.h0;
                    if (hzVar2 != null) {
                        hzVar2.i(i17, i18);
                        break;
                    } else {
                        qe0Var.F0 = i17;
                        qe0Var.G0 = i18;
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                saVar.getClass();
                if (LaunchActivity.y1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        ll.p(R.string.UnknownError, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(saVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(saVar.getContext());
                        linearLayout.setOrientation(1);
                        pi0 pi0Var = new pi0(saVar.getContext());
                        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        pi0Var.f(R.raw.ic_ban, 50, 50, null);
                        pi0Var.d();
                        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
                        pi0Var.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false)));
                        linearLayout.addView(pi0Var, g7.e6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(saVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
                        linearLayout.addView(textView, g7.e6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(saVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i19 = 0; i19 < Math.min(arrayList.size(), 10); i19++) {
                                StringBuilder e10 = ta.b.e(str, "• ");
                                e10.append(org.telegram.ui.Cells.sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i19)));
                                e10.append("\n");
                                str = e10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
                        linearLayout.addView(textView2, g7.e6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(saVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i20 = org.telegram.ui.ActionBar.f6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(org.telegram.ui.ActionBar.f6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.f6.w0(null, i20, false))));
                        TextView textView3 = new TextView(saVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i20, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, g7.e6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, g7.e6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(saVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        g7.g6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, g7.e6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(saVar.getContext(), null, false, false);
                        f3Var.fixNavigationBar();
                        f3Var.customView = linearLayout;
                        f3Var.show();
                        f3Var.setCanDismissWithSwipe(false);
                        f3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(f3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.C);
                        dVar.setCountFilled(false);
                        dVar.B = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        ih.j7 j7Var = new ih.j7(11, dVar, gVar);
                        dVar.C = j7Var;
                        AndroidUtilities.runOnUIThread(j7Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, f3Var, i12));
                    }
                }
                saVar.e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            case 2:
                xk xkVar = (xk) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(xkVar.m0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(xkVar.m0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                xkVar.t0.d(tL_messageMediaGeoLive, xkVar.u0, true, 0, ((Long) obj).longValue());
                xkVar.b.dismiss(true);
                break;
            default:
                pf.n1 n1Var = ((pf.g1) obj2).a;
                pf.n1.W(n1Var);
                i9 = ((org.telegram.ui.ActionBar.o2) n1Var).currentAccount;
                pf.r1.f(i9).k(i11, (String) obj);
                break;
        }
    }
}
