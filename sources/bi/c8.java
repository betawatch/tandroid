package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c8(Object obj, int i10, int i11) {
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
                e8 e8Var = (e8) obj2;
                int[] iArr = (int[]) obj;
                r9 r9Var = e8Var.d;
                int i14 = iArr[0];
                e8Var.U = i14;
                r9Var.A0 = i14;
                int i15 = iArr[1];
                e8Var.V = i15;
                r9Var.B0 = i15;
                e8Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                e8Var.invalidate();
                h71 h71Var = e8Var.n;
                if (h71Var != null) {
                    int i16 = e8Var.U;
                    int i17 = e8Var.V;
                    c00 c00Var = h71Var.b;
                    if (c00Var == null) {
                        h71Var.n = i16;
                        h71Var.r = i17;
                    } else {
                        c00Var.i(i16, i17);
                    }
                }
                sf0 sf0Var = e8Var.s;
                if (sf0Var != null) {
                    int i18 = e8Var.U;
                    int i19 = e8Var.V;
                    c00 c00Var2 = sf0Var.l0;
                    if (c00Var2 != null) {
                        c00Var2.i(i18, i19);
                        break;
                    } else {
                        sf0Var.J0 = i18;
                        sf0Var.K0 = i19;
                        break;
                    }
                }
                break;
            case 1:
                gg.h2 h2Var = ((gg.y1) obj2).a;
                gg.h2.X(h2Var);
                i10 = ((org.telegram.ui.ActionBar.p2) h2Var).currentAccount;
                gg.k2.f(i10).k(i12, (String) obj);
                break;
            case 2:
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.a2.p(R.string.UnknownError, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(yaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(yaVar.getContext());
                        linearLayout.setOrientation(1);
                        kj0 kj0Var = new kj0(yaVar.getContext());
                        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        kj0Var.f(R.raw.ic_ban, 50, 50, null);
                        kj0Var.d();
                        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
                        kj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView(kj0Var, w7.a6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(yaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView, w7.a6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(yaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder g10 = w.f.g(str, "• ");
                                g10.append(org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                g10.append("\n");
                                str = g10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView2, w7.a6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(yaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.j6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.j6.w0(null, i21, false))));
                        TextView textView3 = new TextView(yaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.a6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.a6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(yaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.c6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.a6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, yaVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                        h3Var.fixNavigationBar();
                        h3Var.customView = linearLayout;
                        h3Var.show();
                        h3Var.setCanDismissWithSwipe(false);
                        h3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(h3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        a1.e eVar = new a1.e(9, dVar, gVar);
                        dVar.G = eVar;
                        AndroidUtilities.runOnUIThread(eVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, h3Var, i13));
                    }
                }
                yaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            default:
                ll llVar = (ll) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(llVar.q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(llVar.q0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                llVar.x0.b(tL_messageMediaGeoLive, llVar.y0, true, 0, ((Long) obj).longValue());
                llVar.b.dismiss(true);
                break;
        }
    }
}
