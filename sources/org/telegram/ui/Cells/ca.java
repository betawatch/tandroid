package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jj;
import org.telegram.messenger.k20;
import org.telegram.messenger.mc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements ik0, rf.l, mc, org.telegram.messenger.j9, fp, k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fp
    public void a() {
        switch (this.a) {
            case 4:
                q4 q4Var = (q4) this.b;
                float progress = 1.0f - (q4Var.w.getProgress() * 0.143f);
                org.telegram.ui.Components.g9 g9Var = q4Var.a;
                g9Var.setScaleX(progress);
                g9Var.setScaleY(progress);
                q4Var.invalidate();
                break;
            default:
                h7 h7Var = (h7) this.b;
                float progress2 = 1.0f - (h7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.g9 g9Var2 = h7Var.a;
                g9Var2.setScaleX(progress2);
                g9Var2.setScaleY(progress2);
                h7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        return (CharSequence) ((zh) this.b).a((Integer) obj);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        ga gaVar = (ga) this.b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
        int i10 = this.a;
    }

    @Override // rf.l
    public void l(long j10) {
        ((k) this.b).b(j10);
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bi0 B;
        q0 q0Var;
        int w9;
        jj jjVar;
        switch (this.a) {
            case 2:
                s0 s0Var = (s0) this.b;
                if (z10 && (B = s0Var.I.B()) != null) {
                    jj jjVar2 = s0Var.P0;
                    if (jjVar2 != null && !jjVar2.m1) {
                        jjVar2.m1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.i0.g3(new o0(B, 0));
                        if (jjVar2.l1 || s0Var.L1) {
                            jjVar2.l1 = false;
                            s0Var.L1 = false;
                            try {
                                s0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (s0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) s0Var.getContext()).x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = s0Var.I1;
                            if (videoSize != null && (q0Var = s0Var.f1) != null) {
                                q0Var.t0(s0Var, s0Var.H1, videoSize);
                                break;
                            }
                        }
                    } else if (B.a0 < 1) {
                        B.stop();
                        B.N(B.e[0] - 1, false, false);
                        break;
                    }
                }
                break;
            default:
                s7 s7Var = (s7) this.b;
                ImageReceiver imageReceiver2 = s7Var.d;
                ImageReceiver imageReceiver3 = s7Var.c;
                if (z10 && !z11 && (jjVar = s7Var.n) != null && jjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && s7Var.w0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.i0.J0(imageReceiver3.n());
                    s7Var.a = J0;
                    CheckBoxBase checkBoxBase = s7Var.P;
                    if (checkBoxBase != null && checkBoxBase.x != (w9 = org.telegram.ui.ActionBar.t6.w(J0, org.telegram.ui.ActionBar.t6.r1(0.25f, -1)))) {
                        checkBoxBase.x = w9;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
        int i11 = this.a;
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        TLRPC.Message message;
        n4 n4Var;
        q1 q1Var = (q1) this.b;
        jj jjVar = q1Var.O5;
        if (jjVar == null || (message = jjVar.k) == null) {
            return false;
        }
        if (jjVar.D != 29 || ((n4Var = q1Var.V5) != null && n4Var.i)) {
            return (message.noforwards && !jj.c3(message)) || q1Var.O5.S4() || q1Var.O5.y2();
        }
        return true;
    }

    private final /* synthetic */ void e(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void g(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void b(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void c(int i10, Drawable drawable) {
    }
}
