package ci;

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b7(Object obj, int i10, int i11) {
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
                d7 d7Var = (d7) obj2;
                int[] iArr = (int[]) obj;
                o8 o8Var = d7Var.d;
                int i14 = iArr[0];
                d7Var.U = i14;
                o8Var.A0 = i14;
                int i15 = iArr[1];
                d7Var.V = i15;
                o8Var.B0 = i15;
                d7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                d7Var.invalidate();
                i71 i71Var = d7Var.n;
                if (i71Var != null) {
                    int i16 = d7Var.U;
                    int i17 = d7Var.V;
                    vz vzVar = i71Var.b;
                    if (vzVar == null) {
                        i71Var.n = i16;
                        i71Var.r = i17;
                    } else {
                        vzVar.i(i16, i17);
                    }
                }
                rf0 rf0Var = d7Var.s;
                if (rf0Var != null) {
                    int i18 = d7Var.U;
                    int i19 = d7Var.V;
                    vz vzVar2 = rf0Var.l0;
                    if (vzVar2 != null) {
                        vzVar2.i(i18, i19);
                        break;
                    } else {
                        rf0Var.J0 = i18;
                        rf0Var.K0 = i19;
                        break;
                    }
                }
                break;
            case 1:
                hg.y1 y1Var = ((hg.p1) obj2).a;
                hg.y1.X(y1Var);
                i10 = ((org.telegram.ui.ActionBar.n2) y1Var).currentAccount;
                hg.b2.f(i10).k(i12, (String) obj);
                break;
            case 2:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                xaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        rk.p(R.string.UnknownError, new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(xaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(xaVar.getContext());
                        linearLayout.setOrientation(1);
                        kj0 kj0Var = new kj0(xaVar.getContext());
                        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        kj0Var.f(R.raw.ic_ban, 50, 50, null);
                        kj0Var.d();
                        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
                        kj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView(kj0Var, w7.y5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(xaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView, w7.y5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(xaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder h = v7.j0.h(str, "• ");
                                h.append(org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                h.append("\n");
                                str = h.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                        linearLayout.addView(textView2, w7.y5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(xaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.j6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.j6.w0(null, i21, false))));
                        TextView textView3 = new TextView(xaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.y5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.y5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(xaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.y5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, xaVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                        f3Var.fixNavigationBar();
                        f3Var.customView = linearLayout;
                        f3Var.show();
                        f3Var.setCanDismissWithSwipe(false);
                        f3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(f3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        ai.ba baVar = new ai.ba(13, dVar, gVar);
                        dVar.G = baVar;
                        AndroidUtilities.runOnUIThread(baVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.z2(dVar, f3Var, i13));
                    }
                }
                xaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            default:
                gl glVar = (gl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(glVar.q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(glVar.q0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                glVar.x0.b(tL_messageMediaGeoLive, glVar.y0, true, 0, ((Long) obj).longValue());
                glVar.b.dismiss(true);
                break;
        }
    }
}
