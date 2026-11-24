// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ mw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:
    
        if (r6.getVisibility() == 0) goto L58;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dd ddVar;
        sy1 sy1Var;
        byte b = this.a;
        boolean z = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.k1();
                break;
            case 1:
                int i2 = ChatActivityEnterView.z7;
                if (!chatActivityEnterView.O2) {
                    chatActivityEnterView.M(true);
                    break;
                }
                break;
            case 2:
                int i3 = ChatActivityEnterView.z7;
                gm.t1(chatActivityEnterView);
                int i4 = chatActivityEnterView.R;
                long j = chatActivityEnterView.G3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                yv1 yv1Var = chatActivityEnterView.F3;
                rwc b2 = rwc.b(i4, j, j, str, str2, 2, 0, yv1Var != null ? yv1Var.k7() : 0L, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b2) != null) {
                    eq0 eq0Var = chatActivityEnterView.m0;
                    if (eq0Var != null) {
                        eq0Var.setOpened(false);
                        break;
                    }
                } else if (!a66.q(chatActivityEnterView.k0)) {
                    TLRPC.User W1 = oc7.r1(chatActivityEnterView.R).W1(Long.valueOf(chatActivityEnterView.G3));
                    String D1 = oc7.r1(chatActivityEnterView.R).D1(W1 != null ? W1.restriction_reason : null);
                    if (!TextUtils.isEmpty(D1)) {
                        oc7.r1(chatActivityEnterView.R);
                        oc7.Z4(D1, yv1Var);
                        break;
                    } else {
                        wx0 wx0Var = new wx0(chatActivityEnterView.getContext(), chatActivityEnterView.L4);
                        wx0Var.B(false);
                        wx0Var.C0 = true;
                        wx0Var.m0 = chatActivityEnterView.E3;
                        wx0Var.x(yv1Var, b2);
                        wx0Var.show();
                        eq0 eq0Var2 = chatActivityEnterView.m0;
                        if (eq0Var2 != null) {
                            eq0Var2.setOpened(false);
                            break;
                        }
                    }
                } else {
                    k11 k11Var = new k11();
                    k11Var.c = new mw1(chatActivityEnterView, (byte) 14);
                    l11.m(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, k11Var);
                    break;
                }
                break;
            case 3:
                int i5 = ChatActivityEnterView.z7;
                if (chatActivityEnterView.m0 != null && !ewe.b(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 4:
                int i6 = ChatActivityEnterView.z7;
                j67 j67Var = chatActivityEnterView.M0;
                if (j67Var != null) {
                    j67Var.f(chatActivityEnterView.d6);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 5:
                int i7 = ChatActivityEnterView.z7;
                chatActivityEnterView.L6 = false;
                if (chatActivityEnterView.F0 != null && chatActivityEnterView.O0()) {
                    gm.t1(chatActivityEnterView.F0);
                    break;
                }
                break;
            case 6:
                int i8 = ChatActivityEnterView.z7;
                sy1 sy1Var2 = chatActivityEnterView.F0;
                if (sy1Var2 != null) {
                    sy1Var2.setText("");
                    break;
                }
                break;
            case 7:
                int i9 = ChatActivityEnterView.z7;
                sy1 sy1Var3 = chatActivityEnterView.F0;
                if (sy1Var3 != null) {
                    sy1Var3.setText("");
                }
                chatActivityEnterView.M(true);
                break;
            case 8:
                int i10 = ChatActivityEnterView.z7;
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.O0();
                    break;
                }
                break;
            case 9:
                int i11 = ChatActivityEnterView.z7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 10:
                int i12 = ChatActivityEnterView.z7;
                chatActivityEnterView.q0.callOnClick();
                break;
            case 11:
                int i13 = ChatActivityEnterView.z7;
                yv1 yv1Var2 = chatActivityEnterView.F3;
                if (yv1Var2 != null) {
                    yv1Var2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 12:
                int i14 = ChatActivityEnterView.z7;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                    break;
                }
                break;
            case 13:
                int i15 = ChatActivityEnterView.z7;
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.g();
                    break;
                }
                break;
            case 14:
                int i16 = ChatActivityEnterView.z7;
                gm.c3(new mw1(chatActivityEnterView, (byte) 16));
                break;
            case 15:
                int i17 = ChatActivityEnterView.z7;
                if (chatActivityEnterView.p6 && (ddVar = chatActivityEnterView.m6) != null) {
                    ddVar.c(false);
                    break;
                }
                break;
            case 16:
                int i18 = ChatActivityEnterView.z7;
                eq0 eq0Var3 = chatActivityEnterView.m0;
                if (eq0Var3 != null) {
                    eq0Var3.setOpened(false);
                    break;
                }
                break;
            case 17:
                int i19 = ChatActivityEnterView.z7;
                if (chatActivityEnterView.H1 == lo3.J) {
                    lo3 lo3Var = chatActivityEnterView.n6;
                    long j2 = lo3Var.e;
                    chatActivityEnterView.G1 = j2 != 0 ? j2 + lo3Var.a : 0L;
                    break;
                }
                break;
            case 18:
                int i20 = ChatActivityEnterView.z7;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 19:
                int i21 = ChatActivityEnterView.z7;
                chatActivityEnterView.I2 = null;
                if (gm.O1()) {
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
                if (!chatActivityEnterView.Z2 && z && (sy1Var = chatActivityEnterView.F0) != null) {
                    try {
                        sy1Var.requestFocus();
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                break;
            case 20:
                int i22 = ChatActivityEnterView.z7;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    if (chatActivityEnterView.l7 == null) {
                        jz1Var.getLayoutParams().height = chatActivityEnterView.t4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 21:
                int i23 = ChatActivityEnterView.z7;
                yv1 yv1Var3 = chatActivityEnterView.F3;
                if (yv1Var3 != null && !chatActivityEnterView.O2) {
                    chatActivityEnterView.v2(yv1Var3.e, yv1Var3.s8);
                    break;
                }
                break;
            case 22:
                int i24 = ChatActivityEnterView.z7;
                yv1 yv1Var4 = chatActivityEnterView.F3;
                if (yv1Var4 == null || yv1Var4.isLastFragment()) {
                    chatActivityEnterView.R();
                }
                chatActivityEnterView.J6 = null;
                break;
            case 23:
                chatActivityEnterView.w1();
                break;
            case 24:
                int i25 = ChatActivityEnterView.z7;
                chatActivityEnterView.D2();
                break;
            case 25:
                int i26 = ChatActivityEnterView.z7;
                uz1 uz1Var2 = chatActivityEnterView.P3;
                if (uz1Var2 != null) {
                    uz1Var2.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 26:
                chatActivityEnterView.j2();
                break;
            case 27:
                int i27 = ChatActivityEnterView.z7;
                gm.B2(chatActivityEnterView.O);
                break;
            case 28:
                int i28 = ChatActivityEnterView.z7;
                if (!chatActivityEnterView.Z2 && !chatActivityEnterView.O2 && chatActivityEnterView.R3 != null) {
                    chatActivityEnterView.A0().t();
                    break;
                }
                break;
            default:
                int i29 = ChatActivityEnterView.z7;
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
        }
    }
}
