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
import bi.f6;
import c8.ma;
import c8.ra;
import hi.c7;
import hi.v3;
import hi.v5;
import hi.w3;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g10;
import org.telegram.messenger.g3;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.m40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // org.telegram.messenger.y10
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
                f2 f2Var = ((a2) obj2).b;
                f2Var.W = false;
                if (i13 == f2Var.Y) {
                    f2Var.b0 = num.intValue();
                    break;
                }
                break;
            case 1:
                w3 w3Var = (w3) obj2;
                View view = (View) obj;
                f6 f6Var = w3Var.b;
                if (view instanceof v3) {
                    f6Var.getClass();
                    int R = RecyclerView.R(view);
                    o41 G = f6Var.g3.G(R);
                    if (G != null) {
                        v3 v3Var = (v3) view;
                        v3Var.setPosition(w3Var.b(R));
                        v3Var.b(i13 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                v5 v5Var = (v5) obj2;
                int[] iArr = (int[]) obj;
                c7 c7Var = v5Var.d;
                int i14 = iArr[0];
                v5Var.V = i14;
                c7Var.A0 = i14;
                int i15 = iArr[1];
                v5Var.W = i15;
                c7Var.B0 = i15;
                v5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i13, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                v5Var.invalidate();
                y51 y51Var = v5Var.n;
                if (y51Var != null) {
                    int i16 = v5Var.V;
                    int i17 = v5Var.W;
                    ez ezVar = y51Var.b;
                    if (ezVar == null) {
                        y51Var.n = i16;
                        y51Var.r = i17;
                    } else {
                        ezVar.h(i16, i17);
                    }
                }
                ee0 ee0Var = v5Var.s;
                if (ee0Var != null) {
                    int i18 = v5Var.V;
                    int i19 = v5Var.W;
                    ez ezVar2 = ee0Var.m0;
                    if (ezVar2 != null) {
                        ezVar2.h(i18, i19);
                        break;
                    } else {
                        ee0Var.K0 = i18;
                        ee0Var.L0 = i19;
                        break;
                    }
                }
                break;
            case 3:
                kg.s1 s1Var = (kg.s1) ((bi.v1) obj2).b;
                kg.s1.c0(s1Var);
                i7 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                kg.v1.f(i7).k(i13, (String) obj);
                break;
            case 4:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    np u12 = np.u1(i13);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_inviteUsersToBot, new bi.o1(23, arrayList, p10.q(user2)));
                    break;
                }
                break;
            case 5:
                oa oaVar = (oa) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                oaVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        f3.o(null, 2131743634, new lc(cb.a(oaVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(oaVar.getContext());
                        linearLayout.setOrientation(1);
                        rh0 rh0Var = new rh0(oaVar.getContext());
                        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        rh0Var.f(R.raw.ic_ban, 50, 50, null);
                        rh0Var.d();
                        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i20 = m6.I6;
                        ShapeDrawable L2 = m6.L(L, m6.x0(null, i20, false));
                        p6 M = t6.M(i20);
                        rh0Var.setBackground(L2);
                        t6.j(rh0Var, L2, M, null, null);
                        linearLayout.addView(rh0Var, ma.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(oaVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(hd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        t6.U(textView, m6.j5, null);
                        linearLayout.addView(textView, ma.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743660, oa.a((g10) arrayList2.get(0))));
                        } else {
                            String str = "\n";
                            for (int i21 = 0; i21 < Math.min(arrayList2.size(), 10); i21++) {
                                StringBuilder n10 = p5.c.n(str, "• ");
                                n10.append(oa.a((g10) arrayList2.get(i21)));
                                n10.append("\n");
                                str = n10.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743661, str));
                        }
                        t6.U(textView2, m6.j5, null);
                        linearLayout.addView(textView2, ma.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i22 = m6.q7;
                        Drawable d02 = m6.d0(L3, m6.r1(m6.I.q() ? 0.2f : 0.15f, m6.x0(null, i22, false)));
                        p6 K = t6.K(m6.I.q() ? 0.2f : 0.15f, i22);
                        frameLayout.setBackground(d02);
                        t6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(oaVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        o10.r(textView3, i22, null, null, 2131743656);
                        frameLayout.addView(textView3, ma.e(-1, -1, ls.E1));
                        linearLayout.addView(frameLayout, ma.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.e eVar = new hi.e(oaVar.getContext(), null, true);
                        eVar.setRoundRadius(24);
                        ra.b(eVar, 0.02f, 1.5f);
                        eVar.i(hd.N0(2131749355, null), false, true);
                        linearLayout.addView(eVar, ma.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = f3.j(1, oaVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.c0 = false;
                        j3.d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(eVar.K);
                        eVar.setCountFilled(false);
                        eVar.J = 5;
                        eVar.c(5, false);
                        eVar.setShowZero(false);
                        hi.c cVar = new hi.c(i11, eVar, fVar);
                        eVar.K = cVar;
                        org.telegram.messenger.g0.h3(cVar, 1000L);
                        eVar.setOnClickListener(new b3(eVar, j3, i12));
                    }
                }
                oaVar.e.a(false, true);
                np.u1(i13).W1().a();
                break;
            case 6:
                ml mlVar = (ml) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(mlVar.i0.getLongitude());
                tL_messageMediaGeoLive.period = i13;
                mlVar.o0.b(tL_messageMediaGeoLive, mlVar.p0, true, 0, ((Long) obj).longValue());
                mlVar.b.a(true);
                break;
            case 7:
                m40.l1((m40) obj2, i13, (g3) obj);
                break;
            case 8:
                y10 y10Var = (y10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = np.u1(i13).c2(l10);
                }
                y10Var.a(user);
                break;
            default:
                na naVar = (na) obj2;
                String str2 = (String) obj;
                if (!naVar.r && i13 == naVar.K) {
                    naVar.F = 0;
                    naVar.M = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    naVar.y = userFriendlyAddress;
                    hi.e eVar2 = naVar.a0;
                    if (eVar2 != null) {
                        eVar2.setEnabled(userFriendlyAddress != null);
                    }
                    naVar.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
