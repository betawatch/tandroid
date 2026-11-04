package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ec;
import org.telegram.messenger.o10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements hj0, cg.o, ec, org.telegram.messenger.d9, xo, o10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
        int i3 = this.a;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.xo
    public void a() {
        switch (this.a) {
            case 4:
                o4 o4Var = (o4) this.b;
                float progress = 1.0f - (o4Var.w.getProgress() * 0.143f);
                org.telegram.ui.Components.k9 k9Var = o4Var.a;
                k9Var.setScaleX(progress);
                k9Var.setScaleY(progress);
                o4Var.invalidate();
                break;
            default:
                c7 c7Var = (c7) this.b;
                float progress2 = 1.0f - (c7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.k9 k9Var2 = c7Var.a;
                k9Var2.setScaleX(progress2);
                k9Var2.setScaleY(progress2);
                c7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        return (CharSequence) ((bi.x) this.b).a((Integer) obj);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        ga gaVar = (ga) this.b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // cg.o
    public void h(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        q0 q0Var;
        int w10;
        zi ziVar;
        switch (this.a) {
            case 2:
                t0 t0Var = (t0) this.b;
                if (z10 && (B = t0Var.J.B()) != null) {
                    zi ziVar2 = t0Var.Q0;
                    if (ziVar2 != null && !ziVar2.m1) {
                        ziVar2.m1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.h3(new o0(B, 0));
                        if (ziVar2.l1 || t0Var.M1) {
                            ziVar2.l1 = false;
                            t0Var.M1 = false;
                            try {
                                t0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (t0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) t0Var.getContext()).y0.c(false);
                            }
                            TLRPC.VideoSize videoSize = t0Var.J1;
                            if (videoSize != null && (q0Var = t0Var.g1) != null) {
                                q0Var.M(t0Var, t0Var.I1, videoSize);
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
                if (z10 && !z11 && (ziVar = n7Var.n) != null && ziVar.u2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && n7Var.x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    n7Var.a = J0;
                    CheckBoxBase checkBoxBase = n7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (w10 = org.telegram.ui.ActionBar.k6.w(J0, org.telegram.ui.ActionBar.k6.r1(0.25f, -1)))) {
                        checkBoxBase.x = w10;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.d9
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.b;
        zi ziVar = q1Var.P5;
        if (ziVar == null || (message = ziVar.k) == null) {
            return false;
        }
        if (ziVar.D != 29 || ((l4Var = q1Var.W5) != null && l4Var.i)) {
            return (message.noforwards && !zi.d3(message)) || q1Var.P5.T4() || q1Var.P5.z2();
        }
        return true;
    }

    private final /* synthetic */ void e(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void g(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void b(int i3, Drawable drawable) {
    }

    private final /* synthetic */ void c(int i3, Drawable drawable) {
    }
}
