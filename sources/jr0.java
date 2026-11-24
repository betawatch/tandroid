// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jr0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jr0(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override // qac
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        TLRPC.User user = null;
        user = null;
        user = null;
        int i2 = 0;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    oc7 r1 = oc7.r1(i3);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = r1.p1(user2);
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        tL_messages_inviteUsersToBot.users.add(r1.p1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_inviteUsersToBot, new pm(m9c.r(user2), arrayList));
                    break;
                }
                break;
            case 1:
                n52 n52Var = (n52) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = gm.b0(n52Var.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = gm.b0(n52Var.i0.getLongitude());
                tL_messageMediaGeoLive.period = i3;
                n52Var.o0.b(tL_messageMediaGeoLive, n52Var.p0, true, 0, ((Long) obj).longValue());
                n52Var.b.a(true);
                break;
            case 2:
                gj7 gj7Var = (gj7) obj2;
                View view = (View) obj;
                va vaVar = gj7Var.b;
                if (view instanceof fj7) {
                    vaVar.getClass();
                    int R = RecyclerView.R(view);
                    c6c G = vaVar.g3.G(R);
                    if (G != null) {
                        fj7 fj7Var = (fj7) view;
                        fj7Var.setPosition(gj7Var.b(R));
                        fj7Var.b(i3 == G.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 3:
                cl8 cl8Var = (cl8) obj2;
                int[] iArr = (int[]) obj;
                g6b g6bVar = cl8Var.d;
                int i4 = iArr[0];
                cl8Var.V = i4;
                g6bVar.A0 = i4;
                int i5 = iArr[1];
                cl8Var.W = i5;
                g6bVar.B0 = i5;
                cl8Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i3, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                cl8Var.invalidate();
                ncc nccVar = cl8Var.n;
                if (nccVar != null) {
                    int i6 = cl8Var.V;
                    int i7 = cl8Var.W;
                    uf4 uf4Var = nccVar.b;
                    if (uf4Var == null) {
                        nccVar.n = i6;
                        nccVar.r = i7;
                    } else {
                        uf4Var.f(i6, i7);
                    }
                }
                n78 n78Var = cl8Var.s;
                if (n78Var != null) {
                    int i8 = cl8Var.V;
                    int i9 = cl8Var.W;
                    uf4 uf4Var2 = n78Var.m0;
                    if (uf4Var2 != null) {
                        uf4Var2.f(i8, i9);
                        break;
                    } else {
                        n78Var.K0 = i8;
                        n78Var.L0 = i9;
                        break;
                    }
                }
                break;
            case 4:
                lz8 lz8Var = (lz8) ((im8) obj2).b;
                lz8Var.e0();
                i = ((d) lz8Var).currentAccount;
                pz8.f(i).k(i3, (String) obj);
                break;
            case 5:
                x6c x6cVar = (x6c) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                x6cVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        mlb.y(null, 2131743566, new c41(n21.a(x6cVar.getContext()), null), null);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(x6cVar.getContext());
                        linearLayout.setOrientation(1);
                        s09 s09Var = new s09(x6cVar.getContext());
                        s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        s09Var.f(R.raw.ic_ban, 50, 50, null);
                        s09Var.d();
                        s09Var.setScaleType(ImageView.ScaleType.CENTER);
                        int L = gm.L(80.0f);
                        int i10 = cmb.H6;
                        ShapeDrawable K = cmb.K(L, cmb.w0(null, i10, false));
                        wmb M = anb.M(i10);
                        s09Var.setBackground(K);
                        anb.j(s09Var, K, M, null, null);
                        linearLayout.addView(s09Var, qoe.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(x6cVar.getContext());
                        textView.setTypeface(gm.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(jb6.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        anb.X(textView, cmb.i5, null);
                        linearLayout.addView(textView, qoe.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(x6cVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(jb6.a0(null, null, 2131743592, x6c.a((u6c) arrayList2.get(0))));
                        } else {
                            String str = "\n";
                            for (int i11 = 0; i11 < Math.min(arrayList2.size(), 10); i11++) {
                                StringBuilder k = b10.k(str, "• ");
                                k.append(x6c.a((u6c) arrayList2.get(i11)));
                                k.append("\n");
                                str = k.toString();
                            }
                            textView2.setText(jb6.a0(null, null, 2131743593, str));
                        }
                        anb.X(textView2, cmb.i5, null);
                        linearLayout.addView(textView2, qoe.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(x6cVar.getContext());
                        frameLayout.setPadding(gm.L(24.0f), gm.L(10.0f), gm.L(24.0f), gm.L(10.0f));
                        int L2 = gm.L(12.0f);
                        int i12 = cmb.p7;
                        Drawable b0 = cmb.b0(L2, cmb.p1(cmb.I.o() ? 0.2f : 0.15f, cmb.w0(null, i12, false)));
                        wmb K2 = anb.K(cmb.I.o() ? 0.2f : 0.15f, i12);
                        frameLayout.setBackground(b0);
                        anb.j(frameLayout, b0, K2, null, null);
                        TextView textView3 = new TextView(x6cVar.getContext());
                        textView3.setTypeface(gm.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        wi8.x(textView3, i12, null, null, 2131743588);
                        frameLayout.addView(textView3, qoe.e(-1, -1, nm7.D1));
                        linearLayout.addView(frameLayout, qoe.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        b61 b61Var = new b61(null, x6cVar.getContext(), true);
                        b61Var.setRoundRadius(24);
                        rve.b(b61Var, 0.02f, 1.5f);
                        b61Var.i(jb6.M0(2131749305, null), false, true);
                        linearLayout.addView(b61Var, qoe.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        my0 h = hg9.h(1, null, x6cVar.getContext(), false);
                        h.O = linearLayout;
                        h.show();
                        h.c0 = false;
                        h.d0 = false;
                        zx0 zx0Var = new zx0(h, (byte) 5);
                        gm.r(b61Var.K);
                        b61Var.setCountFilled(false);
                        b61Var.J = 5;
                        b61Var.c(5, false);
                        b61Var.setShowZero(false);
                        y31 y31Var = new y31(b61Var, zx0Var, (byte) 3);
                        b61Var.K = y31Var;
                        gm.d3(y31Var, 1000L);
                        b61Var.setOnClickListener(new fyb(b61Var, h, (byte) 4));
                    }
                }
                x6cVar.e.a(false, true);
                oc7.r1(i3).Q1().a();
                break;
            case 6:
                qac qacVar = (qac) obj2;
                Long l = (Long) obj;
                if (l != null && l.longValue() > 0 && l.longValue() != Long.MAX_VALUE) {
                    user = oc7.r1(i3).W1(l);
                }
                qacVar.a(user);
                break;
            default:
                asc ascVar = (asc) obj2;
                String str2 = (String) obj;
                if (!ascVar.r && i3 == ascVar.K) {
                    ascVar.F = 0;
                    ascVar.M = false;
                    String userFriendlyAddress = WalletEngine2.isValidRecipientAddress(str2) ? WalletEngine2.toUserFriendlyAddress(str2) : null;
                    ascVar.y = userFriendlyAddress;
                    b61 b61Var2 = ascVar.a0;
                    if (b61Var2 != null) {
                        b61Var2.setEnabled(userFriendlyAddress != null);
                    }
                    ascVar.a.g3.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jr0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
