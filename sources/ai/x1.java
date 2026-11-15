package ai;

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
import bi.v3;
import bi.x4;
import c8.ja;
import c8.na;
import fi.f6;
import hi.d7;
import hi.w3;
import hi.x3;
import hi.x5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.i10;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.z9;
import org.telegram.ui.j40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        int i10 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i11 = 1;
        int i12 = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                b2 b2Var = ((w1) obj2).b;
                b2Var.Y = false;
                if (i12 == b2Var.a0) {
                    b2Var.d0 = num.intValue();
                    break;
                }
                break;
            case 1:
                x3 x3Var = (x3) obj2;
                View view = (View) obj;
                v3 v3Var = x3Var.b;
                if (view instanceof w3) {
                    v3Var.getClass();
                    int R = RecyclerView.R(view);
                    b41 G = v3Var.g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view;
                        w3Var.setPosition(x3Var.b(R));
                        w3Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                x5 x5Var = (x5) obj2;
                int[] iArr = (int[]) obj;
                d7 d7Var = x5Var.d;
                int i13 = iArr[0];
                x5Var.V = i13;
                d7Var.A0 = i13;
                int i14 = iArr[1];
                x5Var.W = i14;
                d7Var.B0 = i14;
                x5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                x5Var.invalidate();
                k51 k51Var = x5Var.n;
                if (k51Var != null) {
                    int i15 = x5Var.V;
                    int i16 = x5Var.W;
                    wy wyVar = k51Var.b;
                    if (wyVar == null) {
                        k51Var.n = i15;
                        k51Var.r = i16;
                    } else {
                        wyVar.h(i15, i16);
                    }
                }
                td0 td0Var = x5Var.s;
                if (td0Var != null) {
                    int i17 = x5Var.V;
                    int i18 = x5Var.W;
                    wy wyVar2 = td0Var.m0;
                    if (wyVar2 != null) {
                        wyVar2.h(i17, i18);
                        break;
                    } else {
                        td0Var.K0 = i17;
                        td0Var.L0 = i18;
                        break;
                    }
                }
                break;
            case 3:
                kg.r1 r1Var = (kg.r1) ((x4) obj2).b;
                kg.r1.c0(r1Var);
                i7 = ((org.telegram.ui.ActionBar.e2) r1Var).currentAccount;
                kg.v1.f(i7).k(i12, (String) obj);
                break;
            case 4:
                ma maVar = (ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        k5.o(null, 2131743879, new cc(ta.a(maVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        fh0 fh0Var = new fh0(maVar.getContext());
                        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        fh0Var.f(R.raw.ic_ban, 50, 50, null);
                        fh0Var.d();
                        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i19 = j6.I6;
                        ShapeDrawable L2 = j6.L(L, j6.x0(null, i19, false));
                        m6 M = q6.M(i19);
                        fh0Var.setBackground(L2);
                        q6.j(fh0Var, L2, M, null, null);
                        linearLayout.addView(fh0Var, ja.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(hd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        q6.U(textView, j6.j5, null);
                        linearLayout.addView(textView, ja.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743905, ma.a((i10) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder m10 = r.b.m(str, "• ");
                                m10.append(ma.a((i10) arrayList.get(i20)));
                                m10.append("\n");
                                str = m10.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743906, str));
                        }
                        q6.U(textView2, j6.j5, null);
                        linearLayout.addView(textView2, ja.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = j6.q7;
                        Drawable d02 = j6.d0(L3, j6.r1(j6.I.q() ? 0.2f : 0.15f, j6.x0(null, i21, false)));
                        m6 K = q6.K(j6.I.q() ? 0.2f : 0.15f, i21);
                        frameLayout.setBackground(d02);
                        q6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        i20.q(textView3, i21, null, null, 2131743901);
                        frameLayout.addView(textView3, ja.e(-1, -1, ns.E1));
                        linearLayout.addView(frameLayout, ja.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.d dVar = new hi.d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        na.b(dVar, 0.02f, 1.5f);
                        dVar.i(hd.M0(2131749531, null), false, true);
                        linearLayout.addView(dVar, ja.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.u2 k10 = k5.k(1, maVar.getContext(), null, false);
                        k10.O = linearLayout;
                        k10.show();
                        k10.c0 = false;
                        k10.d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(k10, 13);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        f6 f6Var = new f6(26, dVar, fVar);
                        dVar.K = f6Var;
                        org.telegram.messenger.g0.i3(f6Var, 1000L);
                        dVar.setOnClickListener(new a3(dVar, k10, i11));
                    }
                }
                maVar.e.a(false, true);
                np.s1(i12).U1().a();
                break;
            case 5:
                dl dlVar = (dl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(dlVar.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(dlVar.i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                dlVar.o0.d(tL_messageMediaGeoLive, dlVar.p0, true, 0, ((Long) obj).longValue());
                dlVar.b.a(true);
                break;
            case 6:
                j40.l1((j40) obj2, i12, (e3) obj);
                break;
            case 7:
                z10 z10Var = (z10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = np.s1(i12).a2(l10);
                }
                z10Var.a(user);
                break;
            default:
                z9 z9Var = (z9) obj2;
                String str2 = (String) obj;
                if (!z9Var.r && i12 == z9Var.K) {
                    z9Var.F = 0;
                    z9Var.M = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    z9Var.y = userFriendlyAddress;
                    hi.d dVar2 = z9Var.a0;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    z9Var.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x1(z10 z10Var, int i7) {
        this.a = 7;
        this.b = i7;
        this.c = z10Var;
    }
}
