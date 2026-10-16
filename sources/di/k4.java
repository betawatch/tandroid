package di;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.x60;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4(Object obj, int i10, int i11) {
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
                s4 s4Var = (s4) obj2;
                View view = (View) obj;
                n4 n4Var = s4Var.b;
                if (view instanceof r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view);
                    m61 G = n4Var.W2.G(R);
                    if (G != null) {
                        r4 r4Var = (r4) view;
                        r4Var.setPosition(s4Var.b(R));
                        r4Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                a7 a7Var = (a7) obj2;
                int[] iArr = (int[]) obj;
                k8 k8Var = a7Var.d;
                int i14 = iArr[0];
                a7Var.U = i14;
                k8Var.A0 = i14;
                int i15 = iArr[1];
                a7Var.V = i15;
                k8Var.B0 = i15;
                a7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                a7Var.invalidate();
                y71 y71Var = a7Var.n;
                if (y71Var != null) {
                    int i16 = a7Var.U;
                    int i17 = a7Var.V;
                    h00 h00Var = y71Var.b;
                    if (h00Var == null) {
                        y71Var.n = i16;
                        y71Var.r = i17;
                    } else {
                        h00Var.i(i16, i17);
                    }
                }
                jg0 jg0Var = a7Var.s;
                if (jg0Var != null) {
                    int i18 = a7Var.U;
                    int i19 = a7Var.V;
                    h00 h00Var2 = jg0Var.l0;
                    if (h00Var2 != null) {
                        h00Var2.i(i18, i19);
                        break;
                    } else {
                        jg0Var.J0 = i18;
                        jg0Var.K0 = i19;
                        break;
                    }
                }
                break;
            case 2:
                ig.y1 y1Var = ((ig.p1) obj2).a;
                ig.y1.X(y1Var);
                i10 = ((org.telegram.ui.ActionBar.m2) y1Var).currentAccount;
                ig.b2.f(i10).k(i12, (String) obj);
                break;
            case 3:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) obj2;
                ArrayList arrayList = (ArrayList) obj;
                uaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        sk.q(R.string.UnknownError, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(uaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(uaVar.getContext());
                        linearLayout.setOrientation(1);
                        bk0 bk0Var = new bk0(uaVar.getContext());
                        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        bk0Var.f(R.raw.ic_ban, 50, 50, null);
                        bk0Var.d();
                        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
                        bk0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false)));
                        linearLayout.addView(bk0Var, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(uaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(uaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder i21 = t8.b.i(str, "• ");
                                i21.append(org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                i21.append("\n");
                                str = i21.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(uaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i22 = org.telegram.ui.ActionBar.g6.q7;
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.g6.x0(null, i22, false))));
                        TextView textView3 = new TextView(uaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i22, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(uaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, uaVar.getContext(), (org.telegram.ui.ActionBar.c6) null, false);
                        e3Var.fixNavigationBar();
                        e3Var.customView = linearLayout;
                        e3Var.show();
                        e3Var.setCanDismissWithSwipe(false);
                        e3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(e3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        bi.u8 u8Var = new bi.u8(24, dVar, gVar);
                        dVar.G = u8Var;
                        AndroidUtilities.runOnUIThread(u8Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.z2(dVar, e3Var, i13));
                    }
                }
                uaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            case 4:
                tl tlVar = (tl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tlVar.q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(tlVar.q0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                tlVar.x0.b(tL_messageMediaGeoLive, tlVar.y0, true, 0, ((Long) obj).longValue());
                tlVar.b.dismiss(true);
                break;
            case 5:
                x60.e1((x60) obj2, i12, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj2;
                String str2 = (String) obj;
                if (!s8Var.n && i12 == s8Var.I) {
                    s8Var.y = 0;
                    s8Var.K = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    s8Var.w = userFriendlyAddress;
                    d dVar2 = s8Var.V;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    s8Var.a.W2.N(true);
                    break;
                }
                break;
        }
    }
}
