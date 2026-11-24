// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class av1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ av1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d3, code lost:
    
        if (r6.getVisibility() == 0) goto L64;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        cc ccVar;
        ex1 ex1Var;
        byte b = this.a;
        boolean z = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                if (!chatActivityEnterView.O2) {
                    chatActivityEnterView.N(true);
                    break;
                }
                break;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                gl.t1(chatActivityEnterView);
                int i3 = chatActivityEnterView.R;
                long j = chatActivityEnterView.G3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                mu1 mu1Var = chatActivityEnterView.F3;
                quc b2 = quc.b(i3, j, j, str, str2, 2, 0, mu1Var != null ? mu1Var.c7() : 0L, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b2) != null) {
                    ep0 ep0Var = chatActivityEnterView.m0;
                    if (ep0Var != null) {
                        ep0Var.setOpened(false);
                        break;
                    }
                } else if (!a46.q(chatActivityEnterView.k0)) {
                    TLRPC.User V1 = na7.q1(chatActivityEnterView.R).V1(Long.valueOf(chatActivityEnterView.G3));
                    String C1 = na7.q1(chatActivityEnterView.R).C1(V1 != null ? V1.restriction_reason : null);
                    if (!TextUtils.isEmpty(C1)) {
                        na7.q1(chatActivityEnterView.R);
                        na7.X4(C1, mu1Var);
                        break;
                    } else {
                        ow0 ow0Var = new ow0(chatActivityEnterView.getContext(), chatActivityEnterView.L4);
                        ow0Var.B(false);
                        ow0Var.C0 = true;
                        ow0Var.m0 = chatActivityEnterView.E3;
                        ow0Var.x(mu1Var, b2);
                        ow0Var.show();
                        ep0 ep0Var2 = chatActivityEnterView.m0;
                        if (ep0Var2 != null) {
                            ep0Var2.setOpened(false);
                            break;
                        }
                    }
                } else {
                    c01 c01Var = new c01();
                    c01Var.c = new av1(chatActivityEnterView, (byte) 9);
                    d01.l(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, c01Var);
                    break;
                }
                break;
            case 2:
                int i4 = ChatActivityEnterView.r7;
                if (chatActivityEnterView.m0 != null && !bue.b(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 3:
                int i5 = ChatActivityEnterView.r7;
                ex1 ex1Var2 = chatActivityEnterView.F0;
                if (ex1Var2 != null) {
                    ex1Var2.setText("");
                    break;
                }
                break;
            case 4:
                int i6 = ChatActivityEnterView.r7;
                ex1 ex1Var3 = chatActivityEnterView.F0;
                if (ex1Var3 != null) {
                    ex1Var3.setText("");
                }
                chatActivityEnterView.N(true);
                break;
            case 5:
                int i7 = ChatActivityEnterView.r7;
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    hy1Var.I0();
                    break;
                }
                break;
            case 6:
                int i8 = ChatActivityEnterView.r7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 7:
                int i9 = ChatActivityEnterView.r7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 8:
                int i10 = ChatActivityEnterView.r7;
                mu1 mu1Var2 = chatActivityEnterView.F3;
                if (mu1Var2 != null) {
                    mu1Var2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 9:
                int i11 = ChatActivityEnterView.r7;
                gl.c3(new av1(chatActivityEnterView, (byte) 13));
                break;
            case 10:
                int i12 = ChatActivityEnterView.r7;
                if (chatActivityEnterView.p6 && (ccVar = chatActivityEnterView.m6) != null) {
                    ccVar.c(false);
                    break;
                }
                break;
            case 11:
                int i13 = ChatActivityEnterView.r7;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                    break;
                }
                break;
            case 12:
                int i14 = ChatActivityEnterView.r7;
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.g();
                    break;
                }
                break;
            case 13:
                int i15 = ChatActivityEnterView.r7;
                ep0 ep0Var3 = chatActivityEnterView.m0;
                if (ep0Var3 != null) {
                    ep0Var3.setOpened(false);
                    break;
                }
                break;
            case 14:
                int i16 = ChatActivityEnterView.r7;
                if (chatActivityEnterView.H1 == bn3.J) {
                    bn3 bn3Var = chatActivityEnterView.n6;
                    long j2 = bn3Var.e;
                    chatActivityEnterView.G1 = j2 != 0 ? j2 + bn3Var.a : 0L;
                    break;
                }
                break;
            case 15:
                int i17 = ChatActivityEnterView.r7;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 16:
                int i18 = ChatActivityEnterView.r7;
                chatActivityEnterView.I2 = null;
                if (gl.O1()) {
                    Activity activity = chatActivityEnterView.E3;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).q0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z = true;
                if (!chatActivityEnterView.Z2 && z && (ex1Var = chatActivityEnterView.F0) != null) {
                    try {
                        ex1Var.requestFocus();
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                break;
            case 17:
                int i19 = ChatActivityEnterView.r7;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    if (chatActivityEnterView.d7 == null) {
                        wx1Var.getLayoutParams().height = chatActivityEnterView.t4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                int i20 = ChatActivityEnterView.r7;
                mu1 mu1Var3 = chatActivityEnterView.F3;
                if (mu1Var3 != null && !chatActivityEnterView.O2) {
                    chatActivityEnterView.q2(mu1Var3.e, mu1Var3.s8);
                    break;
                }
                break;
            case 19:
                int i21 = ChatActivityEnterView.r7;
                mu1 mu1Var4 = chatActivityEnterView.F3;
                if (mu1Var4 == null || mu1Var4.isLastFragment()) {
                    chatActivityEnterView.S();
                }
                chatActivityEnterView.J6 = null;
                break;
            case 20:
                chatActivityEnterView.u1();
                break;
            case 21:
                int i22 = ChatActivityEnterView.r7;
                chatActivityEnterView.y2();
                break;
            case 22:
                int i23 = ChatActivityEnterView.r7;
                hy1 hy1Var2 = chatActivityEnterView.P3;
                if (hy1Var2 != null) {
                    hy1Var2.k(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 23:
                chatActivityEnterView.e2();
                break;
            case 24:
                int i24 = ChatActivityEnterView.r7;
                gl.B2(chatActivityEnterView.O);
                break;
            case 25:
                int i25 = ChatActivityEnterView.r7;
                if (!chatActivityEnterView.Z2 && !chatActivityEnterView.O2 && chatActivityEnterView.R3 != null) {
                    chatActivityEnterView.A0().t();
                    break;
                }
                break;
            case 26:
                int i26 = ChatActivityEnterView.r7;
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
            case 27:
                int i27 = ChatActivityEnterView.r7;
                chatActivityEnterView.l1();
                break;
            case 28:
                int i28 = ChatActivityEnterView.r7;
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.i1();
                break;
            default:
                int i29 = ChatActivityEnterView.r7;
                u21.b0(chatActivityEnterView.F3).T(k96.M0(2131752699, null)).j();
                break;
        }
    }
}
