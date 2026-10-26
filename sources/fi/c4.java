package fi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e60;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4(int i10, Utilities.Callback callback) {
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
        switch (i11) {
            case 0:
                k4 k4Var = (k4) obj2;
                View view = (View) obj;
                f4 f4Var = k4Var.b;
                if (view instanceof j4) {
                    f4Var.getClass();
                    int R = RecyclerView.R(view);
                    t61 G = f4Var.g3.G(R);
                    if (G != null) {
                        j4 j4Var = (j4) view;
                        j4Var.setPosition(k4Var.b(R));
                        j4Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                o6 o6Var = (o6) obj2;
                int[] iArr = (int[]) obj;
                w7 w7Var = o6Var.d;
                int i13 = iArr[0];
                o6Var.U = i13;
                w7Var.A0 = i13;
                int i14 = iArr[1];
                o6Var.V = i14;
                w7Var.B0 = i14;
                o6Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                o6Var.invalidate();
                h81 h81Var = o6Var.n;
                if (h81Var != null) {
                    int i15 = o6Var.U;
                    int i16 = o6Var.V;
                    e00 e00Var = h81Var.b;
                    if (e00Var == null) {
                        h81Var.n = i15;
                        h81Var.r = i16;
                    } else {
                        e00Var.i(i15, i16);
                    }
                }
                eg0 eg0Var = o6Var.s;
                if (eg0Var != null) {
                    int i17 = o6Var.U;
                    int i18 = o6Var.V;
                    e00 e00Var2 = eg0Var.l0;
                    if (e00Var2 != null) {
                        e00Var2.i(i17, i18);
                        break;
                    } else {
                        eg0Var.J0 = i17;
                        eg0Var.K0 = i18;
                        break;
                    }
                }
                break;
            case 2:
                jg.z1 z1Var = ((jg.q1) obj2).a;
                jg.z1.Y(z1Var);
                i10 = ((org.telegram.ui.ActionBar.r2) z1Var).currentAccount;
                jg.c2.f(i10).k(i12, (String) obj);
                break;
            case 3:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                xaVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        vh.n(R.string.UnknownError, new wc(org.telegram.ui.Components.lb.a(xaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(xaVar.getContext());
                        linearLayout.setOrientation(1);
                        ak0 ak0Var = new ak0(xaVar.getContext());
                        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        ak0Var.f(R.raw.ic_ban, 50, 50, null);
                        ak0Var.d();
                        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int dp = AndroidUtilities.dp(80.0f);
                        int i19 = org.telegram.ui.ActionBar.y6.I6;
                        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i19, false));
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                        ak0Var.setBackground(K);
                        org.telegram.ui.ActionBar.f7.k(ak0Var, K, N, null, null);
                        linearLayout.addView(ak0Var, gb1.x(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(xaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
                        linearLayout.addView(textView, gb1.o(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(xaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder l4 = b10.l(str, "• ");
                                l4.append(org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                l4.append("\n");
                                str = l4.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, null);
                        linearLayout.addView(textView2, gb1.o(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(xaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp2 = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.y6.q7;
                        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.o1(org.telegram.ui.ActionBar.y6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.y6.x0(null, i21, false)));
                        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(org.telegram.ui.ActionBar.y6.I.q() ? 0.2f : 0.15f, i21);
                        frameLayout.setBackground(c02);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, L, null, null);
                        TextView textView3 = new TextView(xaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.f7.V(textView3, i21, null);
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, gb1.i(-1, -1, 119));
                        linearLayout.addView(frameLayout, gb1.o(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(xaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        gb1.c(dVar, 0.02f, 1.5f);
                        dVar.i(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, gb1.o(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, xaVar.getContext(), (org.telegram.ui.ActionBar.u6) null, false);
                        k3Var.fixNavigationBar();
                        k3Var.customView = linearLayout;
                        k3Var.show();
                        k3Var.setCanDismissWithSwipe(false);
                        k3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(k3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        e2.q0 q0Var = new e2.q0(3, dVar, gVar);
                        dVar.J = q0Var;
                        AndroidUtilities.runOnUIThread(q0Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.w2(2, dVar, k3Var));
                    }
                }
                xaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 4:
                sl slVar = (sl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(slVar.n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(slVar.n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                slVar.u0.d(tL_messageMediaGeoLive, slVar.v0, true, 0, ((Long) obj).longValue());
                slVar.b.dismiss(true);
                break;
            case 5:
                e60.h1((e60) obj2, i12, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = MessagesController.getInstance(i12).getUser(l10);
                }
                callback.run(user);
                break;
            default:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj2;
                String str2 = (String) obj;
                if (!r9Var.r && i12 == r9Var.J) {
                    r9Var.E = 0;
                    r9Var.L = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    r9Var.x = userFriendlyAddress;
                    d dVar2 = r9Var.Z;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    r9Var.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
