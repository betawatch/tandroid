// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ mv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r5.getVisibility() == 0) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dc dcVar;
        tx1 tx1Var;
        byte b = this.a;
        boolean z = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.a4 = false;
                chatActivityEnterView.p1();
                break;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                if (!chatActivityEnterView.N2 && chatActivityEnterView.E()) {
                    chatActivityEnterView.m1();
                    break;
                }
                break;
            case 2:
                int i3 = ChatActivityEnterView.X7;
                chatActivityEnterView.e2(false);
                break;
            case 3:
                int i4 = ChatActivityEnterView.X7;
                hl.t1(chatActivityEnterView);
                int i5 = chatActivityEnterView.R;
                long j = chatActivityEnterView.F3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                zu1 zu1Var = chatActivityEnterView.E3;
                gzc b2 = gzc.b(i5, j, j, str, str2, 2, 0, zu1Var != null ? zu1Var.k7() : 0L, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b2) != null) {
                    ep0 ep0Var = chatActivityEnterView.m0;
                    if (ep0Var != null) {
                        ep0Var.setOpened(false);
                        break;
                    }
                } else if (!e66.q(chatActivityEnterView.k0)) {
                    TLRPC.User X1 = uc7.s1(chatActivityEnterView.R).X1(Long.valueOf(chatActivityEnterView.F3));
                    String E1 = uc7.s1(chatActivityEnterView.R).E1(X1 != null ? X1.restriction_reason : null);
                    if (!TextUtils.isEmpty(E1)) {
                        uc7.s1(chatActivityEnterView.R);
                        uc7.f5(E1, zu1Var);
                        break;
                    } else {
                        xw0 xw0Var = new xw0(chatActivityEnterView.getContext(), chatActivityEnterView.K4);
                        xw0Var.B(false);
                        xw0Var.C0 = true;
                        xw0Var.m0 = chatActivityEnterView.D3;
                        xw0Var.x(zu1Var, b2);
                        xw0Var.show();
                        ep0 ep0Var2 = chatActivityEnterView.m0;
                        if (ep0Var2 != null) {
                            ep0Var2.setOpened(false);
                            break;
                        }
                    }
                } else {
                    l01 l01Var = new l01();
                    l01Var.c = new mv1(chatActivityEnterView, (byte) 15);
                    m01.m(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, l01Var);
                    break;
                }
                break;
            case 4:
                int i6 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.m0 != null && !vye.b(chatActivityEnterView.R, chatActivityEnterView.F3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 5:
                int i7 = ChatActivityEnterView.X7;
                bx1 bx1Var = chatActivityEnterView.K0;
                if (bx1Var != null) {
                    bx1Var.setIconDimmed(chatActivityEnterView.J1 && chatActivityEnterView.T1 && !chatActivityEnterView.u3 && !chatActivityEnterView.v1());
                    break;
                }
                break;
            case 6:
                int i8 = ChatActivityEnterView.X7;
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.W0();
                    break;
                }
                break;
            case 7:
                int i9 = ChatActivityEnterView.X7;
                q67 q67Var = chatActivityEnterView.M0;
                if (q67Var != null) {
                    q67Var.f(chatActivityEnterView.o6);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 8:
                int i10 = ChatActivityEnterView.X7;
                chatActivityEnterView.A0(true);
                break;
            case 9:
                int i11 = ChatActivityEnterView.X7;
                chatActivityEnterView.Q2();
                break;
            case 10:
                int i12 = ChatActivityEnterView.X7;
                chatActivityEnterView.H1();
                break;
            case 11:
                int i13 = ChatActivityEnterView.X7;
                dx1 dx1Var = chatActivityEnterView.a7;
                if (chatActivityEnterView.W6 == 1 && !chatActivityEnterView.N2) {
                    chatActivityEnterView.W6 = (byte) 2;
                    if (chatActivityEnterView.u3) {
                        chatActivityEnterView.n0();
                        chatActivityEnterView.Y6 = 0;
                        hl.r(dx1Var);
                        hl.d3(dx1Var, 150L);
                        break;
                    }
                }
                break;
            case 12:
                int i14 = ChatActivityEnterView.X7;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.h();
                    break;
                }
                break;
            case 13:
                int i15 = ChatActivityEnterView.X7;
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.C2;
                if (recordCircle2 != null) {
                    recordCircle2.h();
                    break;
                }
                break;
            case 14:
                int i16 = ChatActivityEnterView.X7;
                zu1 zu1Var2 = chatActivityEnterView.E3;
                if (zu1Var2 != null) {
                    zu1Var2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 15:
                int i17 = ChatActivityEnterView.X7;
                hl.c3(new mv1(chatActivityEnterView, (byte) 22));
                break;
            case 16:
                int i18 = ChatActivityEnterView.X7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 17:
                int i19 = ChatActivityEnterView.X7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 18:
                int i20 = ChatActivityEnterView.X7;
                tx1 tx1Var2 = chatActivityEnterView.F0;
                if (tx1Var2 != null) {
                    tx1Var2.setText("");
                    break;
                }
                break;
            case 19:
                int i21 = ChatActivityEnterView.X7;
                tx1 tx1Var3 = chatActivityEnterView.F0;
                if (tx1Var3 != null) {
                    tx1Var3.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 20:
                int i22 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.B6 && (dcVar = chatActivityEnterView.y6) != null) {
                    dcVar.d(false);
                    break;
                }
                break;
            case 21:
                chatActivityEnterView.E1();
                break;
            case 22:
                int i23 = ChatActivityEnterView.X7;
                ep0 ep0Var3 = chatActivityEnterView.m0;
                if (ep0Var3 != null) {
                    ep0Var3.setOpened(false);
                    break;
                }
                break;
            case 23:
                int i24 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.G1 == sn3.J) {
                    sn3 sn3Var = chatActivityEnterView.z6;
                    long j2 = sn3Var.e;
                    chatActivityEnterView.F1 = j2 != 0 ? j2 + sn3Var.a : 0L;
                    break;
                }
                break;
            case 24:
                int i25 = ChatActivityEnterView.X7;
                chatActivityEnterView.F1 = 0L;
                chatActivityEnterView.G1 = null;
                break;
            case 25:
                int i26 = ChatActivityEnterView.X7;
                if (!chatActivityEnterView.N2) {
                    chatActivityEnterView.P(true);
                    break;
                }
                break;
            case 26:
                int i27 = ChatActivityEnterView.X7;
                chatActivityEnterView.H2 = null;
                if (hl.O1()) {
                    Activity activity = chatActivityEnterView.D3;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).q0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z = true;
                if (!chatActivityEnterView.Y2 && z && (tx1Var = chatActivityEnterView.F0) != null) {
                    try {
                        tx1Var.requestFocus();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            case 27:
                int i28 = ChatActivityEnterView.X7;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    if (chatActivityEnterView.I7 == null) {
                        my1Var.getLayoutParams().height = chatActivityEnterView.s4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 28:
                int i29 = ChatActivityEnterView.X7;
                zu1 zu1Var3 = chatActivityEnterView.E3;
                if (zu1Var3 != null && !chatActivityEnterView.N2) {
                    chatActivityEnterView.C2(zu1Var3.e, zu1Var3.s8);
                    break;
                }
                break;
            default:
                int i30 = ChatActivityEnterView.X7;
                chatActivityEnterView.L2();
                break;
        }
    }
}
