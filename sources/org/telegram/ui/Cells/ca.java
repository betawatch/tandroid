package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.kc;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements ij0, bg.p, kc, org.telegram.messenger.i9, gp, t10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        q0 q0Var;
        int w10;
        gj gjVar;
        switch (this.a) {
            case 2:
                t0 t0Var = (t0) this.b;
                if (z10 && (B = t0Var.J.B()) != null) {
                    gj gjVar2 = t0Var.Q0;
                    if (gjVar2 != null && !gjVar2.o1) {
                        gjVar2.o1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.h3(new o0(B, 0));
                        if (gjVar2.n1 || t0Var.M1) {
                            gjVar2.n1 = false;
                            t0Var.M1 = false;
                            try {
                                t0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (t0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) t0Var.getContext()).w0.c(false);
                            }
                            TLRPC.VideoSize videoSize = t0Var.J1;
                            if (videoSize != null && (q0Var = t0Var.g1) != null) {
                                q0Var.W(t0Var, t0Var.I1, videoSize);
                                break;
                            }
                        }
                    } else if (B.b0 < 1) {
                        B.stop();
                        B.N(B.e[0] - 1, false, false);
                        break;
                    }
                }
                break;
            default:
                n7 n7Var = (n7) this.b;
                ImageReceiver imageReceiver2 = n7Var.d;
                ImageReceiver imageReceiver3 = n7Var.c;
                if (z10 && !z11 && (gjVar = n7Var.n) != null && gjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && n7Var.x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    n7Var.a = J0;
                    CheckBoxBase checkBoxBase = n7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (w10 = org.telegram.ui.ActionBar.j6.w(J0, org.telegram.ui.ActionBar.j6.r1(0.25f, -1)))) {
                        checkBoxBase.x = w10;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.gp
    public void a() {
        switch (this.a) {
            case 4:
                o4 o4Var = (o4) this.b;
                float progress = 1.0f - (o4Var.w.getProgress() * 0.143f);
                org.telegram.ui.Components.i9 i9Var = o4Var.a;
                i9Var.setScaleX(progress);
                i9Var.setScaleY(progress);
                o4Var.invalidate();
                break;
            default:
                c7 c7Var = (c7) this.b;
                float progress2 = 1.0f - (c7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.i9 i9Var2 = c7Var.a;
                i9Var2.setScaleX(progress2);
                i9Var2.setScaleY(progress2);
                c7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        ga gaVar = (ga) this.b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        return (CharSequence) ((ci.x) this.b).a((Integer) obj);
    }

    @Override // bg.p
    public void g(long j3) {
        ((l) this.b).b(j3);
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.b;
        gj gjVar = q1Var.Q5;
        if (gjVar == null || (message = gjVar.k) == null) {
            return false;
        }
        if (gjVar.D != 29 || ((l4Var = q1Var.X5) != null && l4Var.i)) {
            return (message.noforwards && !gj.c3(message)) || q1Var.Q5.S4() || q1Var.Q5.y2();
        }
        return true;
    }

    private final /* synthetic */ void f(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void h(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void c(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void e(int i7, Drawable drawable) {
    }
}
