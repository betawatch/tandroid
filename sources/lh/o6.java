package lh;

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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6(Object obj, int i10, int i11) {
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
                q6 q6Var = (q6) obj2;
                int[] iArr = (int[]) obj;
                z7 z7Var = q6Var.d;
                int i14 = iArr[0];
                q6Var.Q = i14;
                z7Var.A0 = i14;
                int i15 = iArr[1];
                q6Var.R = i15;
                z7Var.B0 = i15;
                q6Var.P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                q6Var.invalidate();
                a61 a61Var = q6Var.n;
                if (a61Var != null) {
                    int i16 = q6Var.Q;
                    int i17 = q6Var.R;
                    jz jzVar = a61Var.b;
                    if (jzVar == null) {
                        a61Var.n = i16;
                        a61Var.r = i17;
                    } else {
                        jzVar.i(i16, i17);
                    }
                }
                ve0 ve0Var = q6Var.s;
                if (ve0Var != null) {
                    int i18 = q6Var.Q;
                    int i19 = q6Var.R;
                    jz jzVar2 = ve0Var.h0;
                    if (jzVar2 != null) {
                        jzVar2.i(i18, i19);
                        break;
                    } else {
                        ve0Var.F0 = i18;
                        ve0Var.G0 = i19;
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                oaVar.getClass();
                if (LaunchActivity.y1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.y1.r(R.string.UnknownError, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(oaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(oaVar.getContext());
                        linearLayout.setOrientation(1);
                        ri0 ri0Var = new ri0(oaVar.getContext());
                        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        ri0Var.f(R.raw.ic_ban, 50, 50, null);
                        ri0Var.d();
                        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
                        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false)));
                        linearLayout.addView(ri0Var, h7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(oaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        int i20 = 17;
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                        linearLayout.addView(textView, h7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.oa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i21 = 0; i21 < Math.min(arrayList.size(), 10); i21++) {
                                StringBuilder f10 = s3.c.f(str, "• ");
                                f10.append(org.telegram.ui.Cells.oa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i21)));
                                f10.append("\n");
                                str = f10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                        linearLayout.addView(textView2, h7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i22 = org.telegram.ui.ActionBar.g6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.g6.w0(null, i22, false))));
                        TextView textView3 = new TextView(oaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, h7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, h7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(oaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        h7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, h7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(oaVar.getContext(), null, false, false);
                        e3Var.fixNavigationBar();
                        e3Var.customView = linearLayout;
                        e3Var.show();
                        e3Var.setCanDismissWithSwipe(false);
                        e3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(e3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.C);
                        dVar.setCountFilled(false);
                        dVar.B = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        jh.p6 p6Var = new jh.p6(i20, dVar, gVar);
                        dVar.C = p6Var;
                        AndroidUtilities.runOnUIThread(p6Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.w2(dVar, e3Var, i13));
                    }
                }
                oaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 2:
                tk tkVar = (tk) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tkVar.m0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(tkVar.m0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                tkVar.t0.d(tL_messageMediaGeoLive, tkVar.u0, true, 0, ((Long) obj).longValue());
                tkVar.b.dismiss(true);
                break;
            default:
                qf.n1 n1Var = ((qf.g1) obj2).a;
                qf.n1.X(n1Var);
                i10 = ((org.telegram.ui.ActionBar.n2) n1Var).currentAccount;
                qf.q1.f(i10).k(i12, (String) obj);
                break;
        }
    }
}
