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
import bi.c6;
import c8.ma;
import c8.ra;
import fi.a6;
import hi.d7;
import hi.w3;
import hi.w5;
import hi.x3;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f10;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.m40;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        int i10 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i11 = 0;
        int i12 = 1;
        int i13 = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                c2 c2Var = ((x1) obj2).b;
                c2Var.W = false;
                if (i13 == c2Var.Y) {
                    c2Var.b0 = num.intValue();
                    break;
                }
                break;
            case 1:
                x3 x3Var = (x3) obj2;
                View view = (View) obj;
                c6 c6Var = x3Var.b;
                if (view instanceof w3) {
                    c6Var.getClass();
                    int R = RecyclerView.R(view);
                    l41 G = c6Var.g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view;
                        w3Var.setPosition(x3Var.b(R));
                        w3Var.b(i13 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                w5 w5Var = (w5) obj2;
                int[] iArr = (int[]) obj;
                d7 d7Var = w5Var.d;
                int i14 = iArr[0];
                w5Var.V = i14;
                d7Var.A0 = i14;
                int i15 = iArr[1];
                w5Var.W = i15;
                d7Var.B0 = i15;
                w5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i13, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                w5Var.invalidate();
                v51 v51Var = w5Var.n;
                if (v51Var != null) {
                    int i16 = w5Var.V;
                    int i17 = w5Var.W;
                    cz czVar = v51Var.b;
                    if (czVar == null) {
                        v51Var.n = i16;
                        v51Var.r = i17;
                    } else {
                        czVar.h(i16, i17);
                    }
                }
                de0 de0Var = w5Var.s;
                if (de0Var != null) {
                    int i18 = w5Var.V;
                    int i19 = w5Var.W;
                    cz czVar2 = de0Var.m0;
                    if (czVar2 != null) {
                        czVar2.h(i18, i19);
                        break;
                    } else {
                        de0Var.K0 = i18;
                        de0Var.L0 = i19;
                        break;
                    }
                }
                break;
            case 3:
                kg.t1 t1Var = (kg.t1) ((bi.r1) obj2).b;
                kg.t1.c0(t1Var);
                i7 = ((org.telegram.ui.ActionBar.h2) t1Var).currentAccount;
                kg.w1.f(i7).k(i13, (String) obj);
                break;
            case 4:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    mp u12 = mp.u1(i13);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_inviteUsersToBot, new bi.k1(23, arrayList, o10.q(user2)));
                    break;
                }
                break;
            case 5:
                oa oaVar = (oa) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                oaVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        f3.o(null, 2131743642, new lc(cb.a(oaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(oaVar.getContext());
                        linearLayout.setOrientation(1);
                        ph0 ph0Var = new ph0(oaVar.getContext());
                        ph0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        ph0Var.f(R.raw.ic_ban, 50, 50, null);
                        ph0Var.d();
                        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i20 = n6.I6;
                        ShapeDrawable L2 = n6.L(L, n6.x0(null, i20, false));
                        q6 M = u6.M(i20);
                        ph0Var.setBackground(L2);
                        u6.j(ph0Var, L2, M, null, null);
                        linearLayout.addView(ph0Var, ma.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(oaVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(gd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        u6.U(textView, n6.j5, null);
                        linearLayout.addView(textView, ma.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(gd.a0(null, null, 2131743668, oa.a((f10) arrayList2.get(0))));
                        } else {
                            String str = "\n";
                            for (int i21 = 0; i21 < Math.min(arrayList2.size(), 10); i21++) {
                                StringBuilder n10 = p5.c.n(str, "• ");
                                n10.append(oa.a((f10) arrayList2.get(i21)));
                                n10.append("\n");
                                str = n10.toString();
                            }
                            textView2.setText(gd.a0(null, null, 2131743669, str));
                        }
                        u6.U(textView2, n6.j5, null);
                        linearLayout.addView(textView2, ma.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i22 = n6.q7;
                        Drawable d02 = n6.d0(L3, n6.r1(n6.I.q() ? 0.2f : 0.15f, n6.x0(null, i22, false)));
                        q6 K = u6.K(n6.I.q() ? 0.2f : 0.15f, i22);
                        frameLayout.setBackground(d02);
                        u6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(oaVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        n10.r(textView3, i22, null, null, 2131743664);
                        frameLayout.addView(textView3, ma.e(-1, -1, ks.E1));
                        linearLayout.addView(frameLayout, ma.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.d dVar = new hi.d(oaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        ra.b(dVar, 0.02f, 1.5f);
                        dVar.i(gd.M0(2131749356, null), false, true);
                        linearLayout.addView(dVar, ma.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.x2 j3 = f3.j(1, oaVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.c0 = false;
                        j3.d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        a6 a6Var = new a6(28, dVar, fVar);
                        dVar.K = a6Var;
                        org.telegram.messenger.g0.h3(a6Var, 1000L);
                        dVar.setOnClickListener(new b3(dVar, j3, i12));
                    }
                }
                oaVar.e.a(false, true);
                mp.u1(i13).W1().a();
                break;
            case 6:
                kl klVar = (kl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(klVar.i0.getLongitude());
                tL_messageMediaGeoLive.period = i13;
                klVar.o0.b(tL_messageMediaGeoLive, klVar.p0, true, 0, ((Long) obj).longValue());
                klVar.b.a(true);
                break;
            case 7:
                m40.l1((m40) obj2, i13, (g3) obj);
                break;
            case 8:
                x10 x10Var = (x10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = mp.u1(i13).c2(l10);
                }
                x10Var.a(user);
                break;
            default:
                na naVar = (na) obj2;
                String str2 = (String) obj;
                if (!naVar.r && i13 == naVar.K) {
                    naVar.F = 0;
                    naVar.M = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    naVar.y = userFriendlyAddress;
                    hi.d dVar2 = naVar.a0;
                    if (dVar2 != null) {
                        dVar2.setEnabled(userFriendlyAddress != null);
                    }
                    naVar.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
