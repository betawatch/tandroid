package ag;

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
import org.telegram.messenger.a20;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.ra;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.h50;
import vh.k4;
import vh.n5;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        int i11 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i12 = 1;
        int i13 = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                z2 z2Var = (z2) ((e) obj2).b;
                z2.c0(z2Var);
                i10 = ((org.telegram.ui.ActionBar.k2) z2Var).currentAccount;
                i3.f(i10).k(i13, (String) obj);
                break;
            case 1:
                ma maVar = (ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        m5.o(null, 2131743904, new cc(ra.a(maVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        fi0 fi0Var = new fi0(maVar.getContext());
                        fi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        fi0Var.f(R.raw.ic_ban, 50, 50, null);
                        fi0Var.d();
                        fi0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.i0.L(80.0f);
                        int i14 = t6.I6;
                        ShapeDrawable L2 = t6.L(L, t6.x0(null, i14, false));
                        w6 N = a7.N(i14);
                        fi0Var.setBackground(L2);
                        a7.k(fi0Var, L2, N, null, null);
                        linearLayout.addView(fi0Var, b6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(dd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        a7.V(textView, t6.j5, null);
                        linearLayout.addView(textView, b6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(dd.a0(null, null, 2131743930, ma.a((a20) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i15 = 0; i15 < Math.min(arrayList.size(), 10); i15++) {
                                StringBuilder i16 = sc.e.i(str, "• ");
                                i16.append(ma.a((a20) arrayList.get(i15)));
                                i16.append("\n");
                                str = i16.toString();
                            }
                            textView2.setText(dd.a0(null, null, 2131743931, str));
                        }
                        a7.V(textView2, t6.j5, null);
                        linearLayout.addView(textView2, b6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(10.0f));
                        int L3 = org.telegram.messenger.i0.L(12.0f);
                        int i17 = t6.q7;
                        Drawable d02 = t6.d0(L3, t6.r1(t6.I.q() ? 0.2f : 0.15f, t6.x0(null, i17, false)));
                        w6 L4 = a7.L(t6.I.q() ? 0.2f : 0.15f, i17);
                        frameLayout.setBackground(d02);
                        a7.k(frameLayout, d02, L4, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.i0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        a30.p(textView3, i17, null, null, 2131743926);
                        frameLayout.addView(textView3, b6.e(-1, -1, at.E1));
                        linearLayout.addView(frameLayout, b6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        vh.d dVar = new vh.d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        e6.b(dVar, 0.02f, 1.5f);
                        dVar.i(dd.L0(2131749540, null), false, true);
                        linearLayout.addView(dVar, b6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, maVar.getContext(), null, false);
                        k10.N = linearLayout;
                        k10.show();
                        k10.b0 = false;
                        k10.c0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(k10, 11);
                        org.telegram.messenger.i0.r(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        th.o0 o0Var = new th.o0(29, dVar, fVar);
                        dVar.J = o0Var;
                        org.telegram.messenger.i0.h3(o0Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.c3(dVar, k10, i12));
                    }
                }
                maVar.e.a(false, true);
                wp.r1(i13).T1().a();
                break;
            case 2:
                bl blVar = (bl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.i0.b0(blVar.n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.i0.b0(blVar.n0.getLongitude());
                tL_messageMediaGeoLive.period = i13;
                blVar.u0.d(tL_messageMediaGeoLive, blVar.v0, true, 0, ((Long) obj).longValue());
                blVar.b.a(true);
                break;
            case 3:
                h50.l1((h50) obj2, i13, (org.telegram.messenger.h3) obj);
                break;
            case 4:
                r20 r20Var = (r20) obj2;
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = wp.r1(i13).Z1(l4);
                }
                r20Var.a(user);
                break;
            case 5:
                ba baVar = (ba) obj2;
                String str2 = (String) obj;
                if (!baVar.r && i13 == baVar.J) {
                    baVar.E = 0;
                    baVar.L = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    baVar.y = userFriendlyAddress;
                    vh.d dVar2 = baVar.Z;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    baVar.a.f3.O(true);
                    break;
                }
                break;
            case 6:
                vh.y2 y2Var = (vh.y2) obj2;
                View view = (View) obj;
                ii iiVar = y2Var.b;
                if (view instanceof vh.x2) {
                    iiVar.getClass();
                    int R = RecyclerView.R(view);
                    b51 G = iiVar.f3.G(R);
                    if (G != null) {
                        vh.x2 x2Var = (vh.x2) view;
                        x2Var.setPosition(y2Var.b(R));
                        x2Var.b(i13 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            default:
                k4 k4Var = (k4) obj2;
                int[] iArr = (int[]) obj;
                n5 n5Var = k4Var.d;
                int i18 = iArr[0];
                k4Var.U = i18;
                n5Var.A0 = i18;
                int i19 = iArr[1];
                k4Var.V = i19;
                n5Var.B0 = i19;
                k4Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i13, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                k4Var.invalidate();
                l61 l61Var = k4Var.n;
                if (l61Var != null) {
                    int i20 = k4Var.U;
                    int i21 = k4Var.V;
                    gz gzVar = l61Var.b;
                    if (gzVar == null) {
                        l61Var.n = i20;
                        l61Var.r = i21;
                    } else {
                        gzVar.h(i20, i21);
                    }
                }
                oe0 oe0Var = k4Var.s;
                if (oe0Var != null) {
                    int i22 = k4Var.U;
                    int i23 = k4Var.V;
                    gz gzVar2 = oe0Var.l0;
                    if (gzVar2 != null) {
                        gzVar2.h(i22, i23);
                        break;
                    } else {
                        oe0Var.J0 = i22;
                        oe0Var.K0 = i23;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s2(r20 r20Var, int i10) {
        this.a = 4;
        this.b = i10;
        this.c = r20Var;
    }
}
