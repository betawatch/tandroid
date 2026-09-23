package ci;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p60;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l4(Object obj, int i10, int i11) {
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
                t4 t4Var = (t4) obj2;
                View view = (View) obj;
                o4 o4Var = t4Var.b;
                if (view instanceof s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view);
                    h51 G = o4Var.Y2.G(R);
                    if (G != null) {
                        s4 s4Var = (s4) view;
                        s4Var.setPosition(t4Var.b(R));
                        s4Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                b7 b7Var = (b7) obj2;
                int[] iArr = (int[]) obj;
                l8 l8Var = b7Var.d;
                int i14 = iArr[0];
                b7Var.U = i14;
                l8Var.A0 = i14;
                int i15 = iArr[1];
                b7Var.V = i15;
                l8Var.B0 = i15;
                b7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                b7Var.invalidate();
                t61 t61Var = b7Var.n;
                if (t61Var != null) {
                    int i16 = b7Var.U;
                    int i17 = b7Var.V;
                    wz wzVar = t61Var.b;
                    if (wzVar == null) {
                        t61Var.n = i16;
                        t61Var.r = i17;
                    } else {
                        wzVar.i(i16, i17);
                    }
                }
                jf0 jf0Var = b7Var.s;
                if (jf0Var != null) {
                    int i18 = b7Var.U;
                    int i19 = b7Var.V;
                    wz wzVar2 = jf0Var.l0;
                    if (wzVar2 != null) {
                        wzVar2.i(i18, i19);
                        break;
                    } else {
                        jf0Var.J0 = i18;
                        jf0Var.K0 = i19;
                        break;
                    }
                }
                break;
            case 2:
                hg.z1 z1Var = ((hg.q1) obj2).a;
                hg.z1.X(z1Var);
                i10 = ((org.telegram.ui.ActionBar.n2) z1Var).currentAccount;
                hg.c2.f(i10).k(i12, (String) obj);
                break;
            case 3:
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.z0.p(R.string.UnknownError, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(yaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(yaVar.getContext());
                        linearLayout.setOrientation(1);
                        bj0 bj0Var = new bj0(yaVar.getContext());
                        bj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        bj0Var.f(R.raw.ic_ban, 50, 50, null);
                        bj0Var.d();
                        bj0Var.setScaleType(ImageView.ScaleType.CENTER);
                        bj0Var.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false)));
                        linearLayout.addView(bj0Var, w7.x5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(yaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
                        linearLayout.addView(textView, w7.x5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(yaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder h = w.c.h(str, "• ");
                                h.append(org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                h.append("\n");
                                str = h.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
                        linearLayout.addView(textView2, w7.x5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(yaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.h6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.l1(org.telegram.ui.ActionBar.h6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.h6.w0(null, i21, false))));
                        TextView textView3 = new TextView(yaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i21, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.x5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.x5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(yaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.z5.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.x5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, yaVar.getContext(), (org.telegram.ui.ActionBar.d6) null, false);
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
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, f3Var, i13));
                    }
                }
                yaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 4:
                hl hlVar = (hl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(hlVar.q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(hlVar.q0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                hlVar.x0.b(tL_messageMediaGeoLive, hlVar.y0, true, 0, ((Long) obj).longValue());
                hlVar.b.dismiss(true);
                break;
            default:
                p60.e1((p60) obj2, i12, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
