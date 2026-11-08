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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.l10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.j40;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t3(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        int i10 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i11 = this.b;
        Object obj2 = this.c;
        int i12 = 1;
        switch (i10) {
            case 0:
                b4 b4Var = (b4) obj2;
                View view = (View) obj;
                w3 w3Var = b4Var.b;
                if (view instanceof a4) {
                    w3Var.getClass();
                    int R = RecyclerView.R(view);
                    x31 G = w3Var.f3.G(R);
                    if (G != null) {
                        a4 a4Var = (a4) view;
                        a4Var.setPosition(b4Var.b(R));
                        a4Var.b(i11 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                y5 y5Var = (y5) obj2;
                int[] iArr = (int[]) obj;
                e7 e7Var = y5Var.d;
                int i13 = iArr[0];
                y5Var.U = i13;
                e7Var.A0 = i13;
                int i14 = iArr[1];
                y5Var.V = i14;
                e7Var.B0 = i14;
                y5Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                y5Var.invalidate();
                h51 h51Var = y5Var.n;
                if (h51Var != null) {
                    int i15 = y5Var.U;
                    int i16 = y5Var.V;
                    sy syVar = h51Var.b;
                    if (syVar == null) {
                        h51Var.n = i15;
                        h51Var.r = i16;
                    } else {
                        syVar.h(i15, i16);
                    }
                }
                sd0 sd0Var = y5Var.s;
                if (sd0Var != null) {
                    int i17 = y5Var.U;
                    int i18 = y5Var.V;
                    sy syVar2 = sd0Var.l0;
                    if (syVar2 != null) {
                        syVar2.h(i17, i18);
                        break;
                    } else {
                        sd0Var.J0 = i17;
                        sd0Var.K0 = i18;
                        break;
                    }
                }
                break;
            case 2:
                kg.q1 q1Var = (kg.q1) ((bi.s) obj2).b;
                kg.q1.c0(q1Var);
                i7 = ((org.telegram.ui.ActionBar.f2) q1Var).currentAccount;
                kg.t1.f(i7).k(i11, (String) obj);
                break;
            case 3:
                org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.D1) {
                    if (arrayList == null || arrayList.size() == 0) {
                        org.telegram.messenger.k5.p(null, 2131743882, new hc(org.telegram.ui.Components.xa.a(maVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        ch0 ch0Var = new ch0(maVar.getContext());
                        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        ch0Var.f(R.raw.ic_ban, 50, 50, null);
                        ch0Var.d();
                        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i19 = org.telegram.ui.ActionBar.k6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i19, false));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
                        ch0Var.setBackground(L2);
                        org.telegram.ui.ActionBar.r6.k(ch0Var, L2, N, null, null);
                        linearLayout.addView(ch0Var, c8.ha.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(id.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
                        linearLayout.addView(textView, c8.ha.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(id.a0(null, null, 2131743908, org.telegram.ui.Cells.ma.a((l10) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder j3 = rf.b.j(str, "• ");
                                j3.append(org.telegram.ui.Cells.ma.a((l10) arrayList.get(i20)));
                                j3.append("\n");
                                str = j3.toString();
                            }
                            textView2.setText(id.a0(null, null, 2131743909, str));
                        }
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, null);
                        linearLayout.addView(textView2, c8.ha.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = org.telegram.ui.ActionBar.k6.q7;
                        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.r1(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.k6.x0(null, i21, false)));
                        org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(org.telegram.ui.ActionBar.k6.I.q() ? 0.2f : 0.15f, i21);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, L4, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.messenger.camera.q.o(textView3, i21, null, null, 2131743904);
                        frameLayout.addView(textView3, c8.ha.e(-1, -1, qs.E1));
                        linearLayout.addView(frameLayout, c8.ha.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        c8.ka.b(dVar, 0.02f, 1.5f);
                        dVar.i(id.M0(2131749532, null), false, true);
                        linearLayout.addView(dVar, c8.ha.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, maVar.getContext(), null, false);
                        l10.N = linearLayout;
                        l10.show();
                        l10.b0 = false;
                        l10.c0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(l10, 12);
                        org.telegram.messenger.g0.r(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        f2.h hVar = new f2.h(i12, dVar, fVar);
                        dVar.J = hVar;
                        org.telegram.messenger.g0.i3(hVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.a3(dVar, l10, i12));
                    }
                }
                maVar.e.a(false, true);
                qp.s1(i11).U1().a();
                break;
            case 4:
                wk wkVar = (wk) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(wkVar.h0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(wkVar.h0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                wkVar.n0.d(tL_messageMediaGeoLive, wkVar.o0, true, 0, ((Long) obj).longValue());
                wkVar.b.a(true);
                break;
            case 5:
                j40.l1((j40) obj2, i11, (org.telegram.messenger.e3) obj);
                break;
            case 6:
                c20 c20Var = (c20) obj2;
                Long l11 = (Long) obj;
                if (l11 != null && l11.longValue() > 0 && l11.longValue() != Long.MAX_VALUE) {
                    user = qp.s1(i11).a2(l11);
                }
                c20Var.a(user);
                break;
            default:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) obj2;
                String str2 = (String) obj;
                if (!w9Var.r && i11 == w9Var.J) {
                    w9Var.E = 0;
                    w9Var.L = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    w9Var.y = userFriendlyAddress;
                    d dVar2 = w9Var.Z;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    w9Var.a.f3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t3(c20 c20Var, int i7) {
        this.a = 6;
        this.b = i7;
        this.c = c20Var;
    }
}
