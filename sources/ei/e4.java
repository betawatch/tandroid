package ei;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(int i10, Utilities.Callback callback) {
        this.a = 6;
        this.b = i10;
        this.c = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i12 = this.b;
        Object obj2 = this.c;
        int i13 = 1;
        switch (i11) {
            case 0:
                l4 l4Var = (l4) obj2;
                View view = (View) obj;
                g4 g4Var = l4Var.b;
                if (view instanceof k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view);
                    m61 G = g4Var.Z2.G(R);
                    if (G != null) {
                        k4 k4Var = (k4) view;
                        k4Var.setPosition(l4Var.b(R));
                        k4Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                r6 r6Var = (r6) obj2;
                int[] iArr = (int[]) obj;
                a8 a8Var = r6Var.d;
                int i14 = iArr[0];
                r6Var.U = i14;
                a8Var.A0 = i14;
                int i15 = iArr[1];
                r6Var.V = i15;
                a8Var.B0 = i15;
                r6Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                r6Var.invalidate();
                z71 z71Var = r6Var.n;
                if (z71Var != null) {
                    int i16 = r6Var.U;
                    int i17 = r6Var.V;
                    e00 e00Var = z71Var.b;
                    if (e00Var == null) {
                        z71Var.n = i16;
                        z71Var.r = i17;
                    } else {
                        e00Var.i(i16, i17);
                    }
                }
                hg0 hg0Var = r6Var.s;
                if (hg0Var != null) {
                    int i18 = r6Var.U;
                    int i19 = r6Var.V;
                    e00 e00Var2 = hg0Var.l0;
                    if (e00Var2 != null) {
                        e00Var2.i(i18, i19);
                        break;
                    } else {
                        hg0Var.J0 = i18;
                        hg0Var.K0 = i19;
                        break;
                    }
                }
                break;
            case 2:
                ig.w1 w1Var = ((ig.n1) obj2).a;
                ig.w1.X(w1Var);
                i10 = ((org.telegram.ui.ActionBar.o2) w1Var).currentAccount;
                ig.z1.f(i10).k(i12, (String) obj);
                break;
            case 3:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) obj2;
                ArrayList arrayList = (ArrayList) obj;
                taVar.getClass();
                if (LaunchActivity.F1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        sl.q(R.string.UnknownError, new xc(org.telegram.ui.Components.lb.a(taVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(taVar.getContext());
                        linearLayout.setOrientation(1);
                        bk0 bk0Var = new bk0(taVar.getContext());
                        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        bk0Var.f(R.raw.ic_ban, 50, 50, null);
                        bk0Var.d();
                        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int dp = AndroidUtilities.dp(80.0f);
                        int i20 = org.telegram.ui.ActionBar.k6.I6;
                        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i20, false));
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i20);
                        bk0Var.setBackground(K);
                        org.telegram.ui.ActionBar.r6.k(bk0Var, K, O, null, null);
                        linearLayout.addView(bk0Var, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(taVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(taVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ta.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i21 = 0; i21 < Math.min(arrayList.size(), 10); i21++) {
                                StringBuilder i22 = si.o0.i(str, "• ");
                                i22.append(org.telegram.ui.Cells.ta.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i21)));
                                i22.append("\n");
                                str = i22.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.j5, null);
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(taVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp2 = AndroidUtilities.dp(12.0f);
                        int i23 = org.telegram.ui.ActionBar.k6.q7;
                        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.o1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.k6.x0(null, i23, false)));
                        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.15f, i23);
                        frameLayout.setBackground(c02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, M, null, null);
                        TextView textView3 = new TextView(taVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.r6.W(textView3, i23, null);
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(taVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.i(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, taVar.getContext(), (org.telegram.ui.ActionBar.g6) null, false);
                        h3Var.fixNavigationBar();
                        h3Var.customView = linearLayout;
                        h3Var.show();
                        h3Var.setCanDismissWithSwipe(false);
                        h3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(h3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        ci.u7 u7Var = new ci.u7(22, dVar, gVar);
                        dVar.J = u7Var;
                        AndroidUtilities.runOnUIThread(u7Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.x2(dVar, h3Var, i13));
                    }
                }
                taVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 4:
                rl rlVar = (rl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rlVar.o0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(rlVar.o0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                rlVar.v0.b(tL_messageMediaGeoLive, rlVar.w0, true, 0, ((Long) obj).longValue());
                rlVar.b.dismiss(true);
                break;
            case 5:
                d60.g1((d60) obj2, i12, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = MessagesController.getInstance(i12).getUser(l4);
                }
                callback.run(user);
                break;
            default:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) obj2;
                String str2 = (String) obj;
                if (!s9Var.n && i12 == s9Var.I) {
                    s9Var.y = 0;
                    s9Var.K = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    s9Var.w = userFriendlyAddress;
                    d dVar2 = s9Var.Y;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    s9Var.a.Z2.N(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
