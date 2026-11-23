package hi;

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
import org.telegram.messenger.e10;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.l40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7;
        int i10 = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i11 = 0;
        int i12 = this.b;
        Object obj2 = this.c;
        int i13 = 1;
        switch (i10) {
            case 0:
                g4 g4Var = (g4) obj2;
                View view = (View) obj;
                bi.i6 i6Var = g4Var.b;
                if (view instanceof f4) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view);
                    n41 G = i6Var.g3.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view;
                        f4Var.setPosition(g4Var.b(R));
                        f4Var.b(i12 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var = (f6) obj2;
                int[] iArr = (int[]) obj;
                x7 x7Var = f6Var.d;
                int i14 = iArr[0];
                f6Var.V = i14;
                x7Var.A0 = i14;
                int i15 = iArr[1];
                f6Var.W = i15;
                x7Var.B0 = i15;
                f6Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                f6Var.invalidate();
                x51 x51Var = f6Var.n;
                if (x51Var != null) {
                    int i16 = f6Var.V;
                    int i17 = f6Var.W;
                    bz bzVar = x51Var.b;
                    if (bzVar == null) {
                        x51Var.n = i16;
                        x51Var.r = i17;
                    } else {
                        bzVar.h(i16, i17);
                    }
                }
                de0 de0Var = f6Var.s;
                if (de0Var != null) {
                    int i18 = f6Var.V;
                    int i19 = f6Var.W;
                    bz bzVar2 = de0Var.m0;
                    if (bzVar2 != null) {
                        bzVar2.h(i18, i19);
                        break;
                    } else {
                        de0Var.K0 = i18;
                        de0Var.L0 = i19;
                        break;
                    }
                }
                break;
            case 2:
                kg.t1 t1Var = (kg.t1) ((bi.w1) obj2).b;
                kg.t1.c0(t1Var);
                i7 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                kg.w1.f(i7).k(i12, (String) obj);
                break;
            case 3:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    mp u12 = mp.u1(i12);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_inviteUsersToBot, new bi.o1(23, arrayList, n10.q(user2)));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                paVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        org.telegram.messenger.f3.o(null, 2131743632, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(paVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(paVar.getContext());
                        linearLayout.setOrientation(1);
                        qh0 qh0Var = new qh0(paVar.getContext());
                        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        qh0Var.f(R.raw.ic_ban, 50, 50, null);
                        qh0Var.d();
                        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i20 = org.telegram.ui.ActionBar.n6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i20, false));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i20);
                        qh0Var.setBackground(L2);
                        org.telegram.ui.ActionBar.u6.j(qh0Var, L2, M, null, null);
                        linearLayout.addView(qh0Var, c8.na.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(paVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(gd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
                        linearLayout.addView(textView, c8.na.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(paVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(gd.a0(null, null, 2131743658, org.telegram.ui.Cells.pa.a((e10) arrayList2.get(0))));
                        } else {
                            String str = "\n";
                            for (int i21 = 0; i21 < Math.min(arrayList2.size(), 10); i21++) {
                                StringBuilder n10 = p5.c.n(str, "• ");
                                n10.append(org.telegram.ui.Cells.pa.a((e10) arrayList2.get(i21)));
                                n10.append("\n");
                                str = n10.toString();
                            }
                            textView2.setText(gd.a0(null, null, 2131743659, str));
                        }
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, null);
                        linearLayout.addView(textView2, c8.na.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(paVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i22 = org.telegram.ui.ActionBar.n6.q7;
                        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L3, org.telegram.ui.ActionBar.n6.r1(org.telegram.ui.ActionBar.n6.I.q() ? 0.2f : 0.15f, org.telegram.ui.ActionBar.n6.x0(null, i22, false)));
                        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(org.telegram.ui.ActionBar.n6.I.q() ? 0.2f : 0.15f, i22);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(paVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        m10.r(textView3, i22, null, null, 2131743654);
                        frameLayout.addView(textView3, c8.na.e(-1, -1, ks.E1));
                        linearLayout.addView(frameLayout, c8.na.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        e eVar = new e(paVar.getContext(), null, true);
                        eVar.setRoundRadius(24);
                        c8.sa.b(eVar, 0.02f, 1.5f);
                        eVar.i(gd.N0(2131749355, null), false, true);
                        linearLayout.addView(eVar, c8.na.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, paVar.getContext(), null, false);
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
                        c cVar = new c(i11, eVar, fVar);
                        eVar.K = cVar;
                        org.telegram.messenger.g0.h3(cVar, 1000L);
                        eVar.setOnClickListener(new org.telegram.ui.Cells.b3(eVar, j3, i13));
                    }
                }
                paVar.e.a(false, true);
                mp.u1(i12).W1().a();
                break;
            case 5:
                kl klVar = (kl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(klVar.i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                klVar.o0.d(tL_messageMediaGeoLive, klVar.p0, true, 0, ((Long) obj).longValue());
                klVar.b.a(true);
                break;
            case 6:
                l40.l1((l40) obj2, i12, (org.telegram.messenger.g3) obj);
                break;
            case 7:
                w10 w10Var = (w10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = mp.u1(i12).c2(l10);
                }
                w10Var.a(user);
                break;
            default:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) obj2;
                String str2 = (String) obj;
                if (!oaVar.r && i12 == oaVar.K) {
                    oaVar.F = 0;
                    oaVar.M = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    oaVar.y = userFriendlyAddress;
                    e eVar2 = oaVar.a0;
                    if (eVar2 != null) {
                        eVar2.setEnabled(userFriendlyAddress != null);
                    }
                    oaVar.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a4(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
